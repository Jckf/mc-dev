import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lt extends MinecraftServer implements lo {

   private static final Logger i = LogManager.getLogger();
   private final List j = Collections.synchronizedList(new ArrayList());
   private ox k;
   private pa l;
   private lq m;
   private lg n;
   private boolean o;
   private ahk p;
   private boolean q;


   public lt(File var1) {
      super(var1, Proxy.NO_PROXY);
      new lu(this, "Server Infinisleeper");
   }

   protected boolean e() {
      lv var1 = new lv(this, "Server console handler");
      var1.setDaemon(true);
      var1.start();
      i.info("Starting minecraft server version 1.7.10");
      if(Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         i.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      i.info("Loading properties");
      this.m = new lq(new File("server.properties"));
      this.n = new lg(new File("eula.txt"));
      if(!this.n.a()) {
         i.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
         this.n.b();
         return false;
      } else {
         if(this.N()) {
            this.c("127.0.0.1");
         } else {
            this.d(this.m.a("online-mode", true));
            this.c(this.m.a("server-ip", ""));
         }

         this.e(this.m.a("spawn-animals", true));
         this.f(this.m.a("spawn-npcs", true));
         this.g(this.m.a("pvp", true));
         this.h(this.m.a("allow-flight", false));
         this.m(this.m.a("resource-pack", ""));
         this.n(this.m.a("motd", "A Minecraft Server"));
         this.i(this.m.a("force-gamemode", false));
         this.d(this.m.a("player-idle-timeout", 0));
         if(this.m.a("difficulty", 1) < 0) {
            this.m.a("difficulty", (Object)Integer.valueOf(0));
         } else if(this.m.a("difficulty", 1) > 3) {
            this.m.a("difficulty", (Object)Integer.valueOf(3));
         }

         this.o = this.m.a("generate-structures", true);
         int var2 = this.m.a("gamemode", ahk.b.a());
         this.p = ahj.a(var2);
         i.info("Default game type: " + this.p);
         InetAddress var3 = null;
         if(this.p().length() > 0) {
            var3 = InetAddress.getByName(this.p());
         }

         if(this.L() < 0) {
            this.b(this.m.a("server-port", 25565));
         }

         i.info("Generating keypair");
         this.a(pt.b());
         i.info("Starting Minecraft server on " + (this.p().length() == 0?"*":this.p()) + ":" + this.L());

         try {
            this.ai().a(var3, this.L());
         } catch (IOException var16) {
            i.warn("**** FAILED TO BIND TO PORT!");
            i.warn("The exception was: {}", new Object[]{var16.toString()});
            i.warn("Perhaps a server is already running on that port?");
            return false;
         }

         if(!this.Y()) {
            i.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
            i.warn("The server will make no attempt to authenticate usernames. Beware.");
            i.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
            i.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
         }

         if(this.aE()) {
            this.ax().c();
         }

         if(!nz.a(this.m)) {
            return false;
         } else {
            this.a((oi)(new ls(this)));
            long var4 = System.nanoTime();
            if(this.O() == null) {
               this.k(this.m.a("level-name", "world"));
            }

            String var6 = this.m.a("level-seed", "");
            String var7 = this.m.a("level-type", "DEFAULT");
            String var8 = this.m.a("generator-settings", "");
            long var9 = (new Random()).nextLong();
            if(var6.length() > 0) {
               try {
                  long var11 = Long.parseLong(var6);
                  if(var11 != 0L) {
                     var9 = var11;
                  }
               } catch (NumberFormatException var15) {
                  var9 = (long)var6.hashCode();
               }
            }

            ahm var17 = ahm.a(var7);
            if(var17 == null) {
               var17 = ahm.b;
            }

            this.at();
            this.ad();
            this.l();
            this.W();
            this.c(this.m.a("max-build-height", 256));
            this.c((this.af() + 8) / 16 * 16);
            this.c(qh.a(this.af(), 64, 256));
            this.m.a("max-build-height", (Object)Integer.valueOf(this.af()));
            i.info("Preparing level \"" + this.O() + "\"");
            this.a(this.O(), this.O(), var9, var17, var8);
            long var12 = System.nanoTime() - var4;
            String var14 = String.format("%.3fs", new Object[]{Double.valueOf((double)var12 / 1.0E9D)});
            i.info("Done (" + var14 + ")! For help, type \"help\" or \"?\"");
            if(this.m.a("enable-query", false)) {
               i.info("Starting GS4 status listener");
               this.k = new ox(this);
               this.k.a();
            }

            if(this.m.a("enable-rcon", false)) {
               i.info("Starting remote control listener");
               this.l = new pa(this);
               this.l.a();
            }

            return true;
         }
      }
   }

   public boolean h() {
      return this.o;
   }

   public ahk i() {
      return this.p;
   }

   public rd j() {
      return rd.a(this.m.a("difficulty", 1));
   }

   public boolean k() {
      return this.m.a("hardcore", false);
   }

   protected void a(b var1) {}

   public b b(b var1) {
      var1 = super.b(var1);
      var1.g().a("Is Modded", (Callable)(new lw(this)));
      var1.g().a("Type", (Callable)(new lx(this)));
      return var1;
   }

   protected void t() {
      System.exit(0);
   }

   protected void v() {
      super.v();
      this.aB();
   }

   public boolean w() {
      return this.m.a("allow-nether", true);
   }

   public boolean Q() {
      return this.m.a("spawn-monsters", true);
   }

   public void a(ri var1) {
      var1.a("whitelist_enabled", Boolean.valueOf(this.aC().r()));
      var1.a("whitelist_count", Integer.valueOf(this.aC().l().length));
      super.a(var1);
   }

   public boolean W() {
      return this.m.a("snooper-enabled", true);
   }

   public void a(String var1, ac var2) {
      this.j.add(new le(var1, var2));
   }

   public void aB() {
      while(!this.j.isEmpty()) {
         le var1 = (le)this.j.remove(0);
         this.J().a(var1.b, var1.a);
      }

   }

   public boolean X() {
      return true;
   }

   public ls aC() {
      return (ls)super.ah();
   }

   public int a(String var1, int var2) {
      return this.m.a(var1, var2);
   }

   public String a(String var1, String var2) {
      return this.m.a(var1, var2);
   }

   public boolean a(String var1, boolean var2) {
      return this.m.a(var1, var2);
   }

   public void a(String var1, Object var2) {
      this.m.a(var1, var2);
   }

   public void a() {
      this.m.b();
   }

   public String b() {
      File var1 = this.m.c();
      return var1 != null?var1.getAbsolutePath():"No settings file";
   }

   public void aD() {
      ly.a(this);
      this.q = true;
   }

   public boolean ak() {
      return this.q;
   }

   public String a(ahk var1, boolean var2) {
      return "";
   }

   public boolean ad() {
      return this.m.a("enable-command-block", false);
   }

   public int ao() {
      return this.m.a("spawn-protection", super.ao());
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5) {
      if(var1.t.i != 0) {
         return false;
      } else if(this.aC().m().d()) {
         return false;
      } else if(this.aC().g(var5.bJ())) {
         return false;
      } else if(this.ao() <= 0) {
         return false;
      } else {
         r var6 = var1.K();
         int var7 = qh.a(var2 - var6.a);
         int var8 = qh.a(var4 - var6.c);
         int var9 = Math.max(var7, var8);
         return var9 <= this.ao();
      }
   }

   public int l() {
      return this.m.a("op-permission-level", 4);
   }

   public void d(int var1) {
      super.d(var1);
      this.m.a("player-idle-timeout", (Object)Integer.valueOf(var1));
      this.a();
   }

   public boolean m() {
      return this.m.a("broadcast-rcon-to-ops", true);
   }

   public boolean at() {
      return this.m.a("announce-player-achievements", true);
   }

   protected boolean aE() {
      boolean var2 = false;

      int var1;
      for(var1 = 0; !var2 && var1 <= 2; ++var1) {
         if(var1 > 0) {
            i.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.aG();
         }

         var2 = nz.a((MinecraftServer)this);
      }

      boolean var3 = false;

      for(var1 = 0; !var3 && var1 <= 2; ++var1) {
         if(var1 > 0) {
            i.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.aG();
         }

         var3 = nz.b((MinecraftServer)this);
      }

      boolean var4 = false;

      for(var1 = 0; !var4 && var1 <= 2; ++var1) {
         if(var1 > 0) {
            i.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.aG();
         }

         var4 = nz.c((MinecraftServer)this);
      }

      boolean var5 = false;

      for(var1 = 0; !var5 && var1 <= 2; ++var1) {
         if(var1 > 0) {
            i.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.aG();
         }

         var5 = nz.d((MinecraftServer)this);
      }

      boolean var6 = false;

      for(var1 = 0; !var6 && var1 <= 2; ++var1) {
         if(var1 > 0) {
            i.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.aG();
         }

         var6 = nz.a(this, this.m);
      }

      return var2 || var3 || var4 || var5 || var6;
   }

   private void aG() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
         ;
      }
   }

   // $FF: synthetic method
   public oi ah() {
      return this.aC();
   }

   // $FF: synthetic method
   static Logger aF() {
      return i;
   }

}
