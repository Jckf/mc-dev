package net.minecraft.server;

import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MinecraftServer implements ac, Runnable, rk {

   private static final Logger i = LogManager.getLogger();
   public static final File a = new File("usercache.json");
   private static MinecraftServer j;
   private final aze k;
   private final ri l = new ri("server", this, ar());
   private final File m;
   private final List n = new ArrayList();
   private final ab o;
   public final qi b = new qi();
   private final nc p;
   private final kb q = new kb();
   private final Random r = new Random();
   private String s;
   private int t = -1;
   public mt[] c;
   private oi u;
   private boolean v = true;
   private boolean w;
   private int x;
   protected final Proxy d;
   public String e;
   public int f;
   private boolean y;
   private boolean z;
   private boolean A;
   private boolean B;
   private boolean C;
   private String D;
   private int E;
   private int F = 0;
   public final long[] g = new long[100];
   public long[][] h;
   private KeyPair G;
   private String H;
   private String I;
   private boolean K;
   private boolean L;
   private boolean M;
   private String N = "";
   private boolean O;
   private long P;
   private String Q;
   private boolean R;
   private boolean S;
   private final YggdrasilAuthenticationService T;
   private final MinecraftSessionService U;
   private long V = 0L;
   private final GameProfileRepository W;
   private final ns X;


   public MinecraftServer(File var1, Proxy var2) {
      this.X = new ns(this, a);
      j = this;
      this.d = var2;
      this.m = var1;
      this.p = new nc(this);
      this.o = new bl();
      this.k = new ayn(var1);
      this.T = new YggdrasilAuthenticationService(var2, UUID.randomUUID().toString());
      this.U = this.T.createMinecraftSessionService();
      this.W = this.T.createProfileRepository();
   }

   protected abstract boolean e();

   protected void a(String var1) {
      if(this.S().b(var1)) {
         i.info("Converting map!");
         this.b("menu.convertingLevel");
         this.S().a(var1, new lh(this));
      }

   }

   protected synchronized void b(String var1) {
      this.Q = var1;
   }

   protected void a(String var1, String var2, long var3, ahm var5, String var6) {
      this.a(var1);
      this.b("menu.loadingLevel");
      this.c = new mt[3];
      this.h = new long[this.c.length][100];
      azc var7 = this.k.a(var1, true);
      ays var9 = var7.d();
      ahj var8;
      if(var9 == null) {
         var8 = new ahj(var3, this.i(), this.h(), this.k(), var5);
         var8.a(var6);
      } else {
         var8 = new ahj(var9);
      }

      if(this.L) {
         var8.a();
      }

      for(int var10 = 0; var10 < this.c.length; ++var10) {
         byte var11 = 0;
         if(var10 == 1) {
            var11 = -1;
         }

         if(var10 == 2) {
            var11 = 1;
         }

         if(var10 == 0) {
            if(this.R()) {
               this.c[var10] = new mk(this, var7, var2, var11, this.b);
            } else {
               this.c[var10] = new mt(this, var7, var2, var11, var8, this.b);
            }
         } else {
            this.c[var10] = new mm(this, var7, var2, var11, var8, this.c[0], this.b);
         }

         this.c[var10].a((ahh)(new mp(this, this.c[var10])));
         if(!this.N()) {
            this.c[var10].N().a(this.i());
         }

         this.u.a(this.c);
      }

      this.a(this.j());
      this.g();
   }

   protected void g() {
      boolean var1 = true;
      boolean var2 = true;
      boolean var3 = true;
      boolean var4 = true;
      int var5 = 0;
      this.b("menu.generatingTerrain");
      byte var6 = 0;
      i.info("Preparing start region for level " + var6);
      mt var7 = this.c[var6];
      r var8 = var7.K();
      long var9 = ar();

      for(int var11 = -192; var11 <= 192 && this.q(); var11 += 16) {
         for(int var12 = -192; var12 <= 192 && this.q(); var12 += 16) {
            long var13 = ar();
            if(var13 - var9 > 1000L) {
               this.a_("Preparing spawn area", var5 * 100 / 625);
               var9 = var13;
            }

            ++var5;
            var7.b.c(var8.a + var11 >> 4, var8.c + var12 >> 4);
         }
      }

      this.n();
   }

   public abstract boolean h();

   public abstract ahk i();

   public abstract rd j();

   public abstract boolean k();

   public abstract int l();

   public abstract boolean m();

   protected void a_(String var1, int var2) {
      this.e = var1;
      this.f = var2;
      i.info(var1 + ": " + var2 + "%");
   }

   protected void n() {
      this.e = null;
      this.f = 0;
   }

   protected void a(boolean var1) {
      if(!this.M) {
         mt[] var2 = this.c;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            mt var5 = var2[var4];
            if(var5 != null) {
               if(!var1) {
                  i.info("Saving chunks for level \'" + var5.N().k() + "\'/" + var5.t.l());
               }

               try {
                  var5.a(true, (qk)null);
               } catch (ahg var7) {
                  i.warn(var7.getMessage());
               }
            }
         }

      }
   }

   public void o() {
      if(!this.M) {
         i.info("Stopping server");
         if(this.ai() != null) {
            this.ai().b();
         }

         if(this.u != null) {
            i.info("Saving players");
            this.u.j();
            this.u.u();
         }

         if(this.c != null) {
            i.info("Saving worlds");
            this.a(false);

            for(int var1 = 0; var1 < this.c.length; ++var1) {
               mt var2 = this.c[var1];
               var2.n();
            }
         }

         if(this.l.d()) {
            this.l.e();
         }

      }
   }

   public String p() {
      return this.s;
   }

   public void c(String var1) {
      this.s = var1;
   }

   public boolean q() {
      return this.v;
   }

   public void r() {
      this.v = false;
   }

   public void run() {
      try {
         if(this.e()) {
            long var1 = ar();
            long var50 = 0L;
            this.q.a((fj)(new fq(this.D)));
            this.q.a(new kf("1.7.10", 5));
            this.a(this.q);

            while(this.v) {
               long var5 = ar();
               long var7 = var5 - var1;
               if(var7 > 2000L && var1 - this.P >= 15000L) {
                  i.warn("Can\'t keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[]{Long.valueOf(var7), Long.valueOf(var7 / 50L)});
                  var7 = 2000L;
                  this.P = var1;
               }

               if(var7 < 0L) {
                  i.warn("Time ran backwards! Did the system time change?");
                  var7 = 0L;
               }

               var50 += var7;
               var1 = var5;
               if(this.c[0].e()) {
                  this.u();
                  var50 = 0L;
               } else {
                  while(var50 > 50L) {
                     var50 -= 50L;
                     this.u();
                  }
               }

               Thread.sleep(Math.max(1L, 50L - var50));
               this.O = true;
            }
         } else {
            this.a((b)null);
         }
      } catch (Throwable var48) {
         i.error("Encountered an unexpected exception", var48);
         b var2 = null;
         if(var48 instanceof s) {
            var2 = this.b(((s)var48).a());
         } else {
            var2 = this.b(new b("Exception in server tick loop", var48));
         }

         File var3 = new File(new File(this.s(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-server.txt");
         if(var2.a(var3)) {
            i.error("This crash report has been saved to: " + var3.getAbsolutePath());
         } else {
            i.error("We were unable to save this crash report to disk.");
         }

         this.a(var2);
      } finally {
         try {
            this.o();
            this.w = true;
         } catch (Throwable var46) {
            i.error("Exception stopping the server", var46);
         } finally {
            this.t();
         }

      }

   }

   private void a(kb var1) {
      File var2 = this.d("server-icon.png");
      if(var2.isFile()) {
         ByteBuf var3 = Unpooled.buffer();

         try {
            BufferedImage var4 = ImageIO.read(var2);
            Validate.validState(var4.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var4.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            ImageIO.write(var4, "PNG", new ByteBufOutputStream(var3));
            ByteBuf var5 = Base64.encode(var3);
            var1.a("data:image/png;base64," + var5.toString(Charsets.UTF_8));
         } catch (Exception var9) {
            i.error("Couldn\'t load server icon", (Throwable)var9);
         } finally {
            var3.release();
         }
      }

   }

   protected File s() {
      return new File(".");
   }

   protected void a(b var1) {}

   protected void t() {}

   protected void u() {
      long var1 = System.nanoTime();
      ++this.x;
      if(this.R) {
         this.R = false;
         this.b.a = true;
         this.b.a();
      }

      this.b.a("root");
      this.v();
      if(var1 - this.V >= 5000000000L) {
         this.V = var1;
         this.q.a(new kc(this.D(), this.C()));
         GameProfile[] var3 = new GameProfile[Math.min(this.C(), 12)];
         int var4 = qh.a(this.r, 0, this.C() - var3.length);

         for(int var5 = 0; var5 < var3.length; ++var5) {
            var3[var5] = ((mw)this.u.e.get(var4 + var5)).bJ();
         }

         Collections.shuffle(Arrays.asList(var3));
         this.q.b().a(var3);
      }

      if(this.x % 900 == 0) {
         this.b.a("save");
         this.u.j();
         this.a(true);
         this.b.b();
      }

      this.b.a("tallying");
      this.g[this.x % 100] = System.nanoTime() - var1;
      this.b.b();
      this.b.a("snooper");
      if(!this.l.d() && this.x > 100) {
         this.l.a();
      }

      if(this.x % 6000 == 0) {
         this.l.b();
      }

      this.b.b();
      this.b.b();
   }

   public void v() {
      this.b.a("levels");

      int var1;
      for(var1 = 0; var1 < this.c.length; ++var1) {
         long var2 = System.nanoTime();
         if(var1 == 0 || this.w()) {
            mt var4 = this.c[var1];
            this.b.a(var4.N().k());
            this.b.a("pools");
            this.b.b();
            if(this.x % 20 == 0) {
               this.b.a("timeSync");
               this.u.a((ft)(new ih(var4.I(), var4.J(), var4.O().b("doDaylightCycle"))), var4.t.i);
               this.b.b();
            }

            this.b.a("tick");

            b var6;
            try {
               var4.b();
            } catch (Throwable var8) {
               var6 = b.a(var8, "Exception ticking world");
               var4.a(var6);
               throw new s(var6);
            }

            try {
               var4.h();
            } catch (Throwable var7) {
               var6 = b.a(var7, "Exception ticking world entities");
               var4.a(var6);
               throw new s(var6);
            }

            this.b.b();
            this.b.a("tracker");
            var4.r().a();
            this.b.b();
            this.b.b();
         }

         this.h[var1][this.x % 100] = System.nanoTime() - var2;
      }

      this.b.c("connection");
      this.ai().c();
      this.b.c("players");
      this.u.e();
      this.b.c("tickables");

      for(var1 = 0; var1 < this.n.size(); ++var1) {
         ((lr)this.n.get(var1)).a();
      }

      this.b.b();
   }

   public boolean w() {
      return true;
   }

   public void a(lr var1) {
      this.n.add(var1);
   }

   public static void main(String[] var0) {
      kl.b();

      try {
         boolean var1 = true;
         String var2 = null;
         String var3 = ".";
         String var4 = null;
         boolean var5 = false;
         boolean var6 = false;
         int var7 = -1;

         for(int var8 = 0; var8 < var0.length; ++var8) {
            String var9 = var0[var8];
            String var10 = var8 == var0.length - 1?null:var0[var8 + 1];
            boolean var11 = false;
            if(!var9.equals("nogui") && !var9.equals("--nogui")) {
               if(var9.equals("--port") && var10 != null) {
                  var11 = true;

                  try {
                     var7 = Integer.parseInt(var10);
                  } catch (NumberFormatException var13) {
                     ;
                  }
               } else if(var9.equals("--singleplayer") && var10 != null) {
                  var11 = true;
                  var2 = var10;
               } else if(var9.equals("--universe") && var10 != null) {
                  var11 = true;
                  var3 = var10;
               } else if(var9.equals("--world") && var10 != null) {
                  var11 = true;
                  var4 = var10;
               } else if(var9.equals("--demo")) {
                  var5 = true;
               } else if(var9.equals("--bonusChest")) {
                  var6 = true;
               }
            } else {
               var1 = false;
            }

            if(var11) {
               ++var8;
            }
         }

         lt var15 = new lt(new File(var3));
         if(var2 != null) {
            var15.j(var2);
         }

         if(var4 != null) {
            var15.k(var4);
         }

         if(var7 >= 0) {
            var15.b(var7);
         }

         if(var5) {
            var15.b(true);
         }

         if(var6) {
            var15.c(true);
         }

         if(var1 && !GraphicsEnvironment.isHeadless()) {
            var15.aD();
         }

         var15.x();
         Runtime.getRuntime().addShutdownHook(new li("Server Shutdown Thread", var15));
      } catch (Exception var14) {
         i.fatal("Failed to start the minecraft server", (Throwable)var14);
      }

   }

   public void x() {
      (new lj(this, "Server thread")).start();
   }

   public File d(String var1) {
      return new File(this.s(), var1);
   }

   public void e(String var1) {
      i.info(var1);
   }

   public void f(String var1) {
      i.warn(var1);
   }

   public mt a(int var1) {
      return var1 == -1?this.c[1]:(var1 == 1?this.c[2]:this.c[0]);
   }

   public String y() {
      return this.s;
   }

   public int z() {
      return this.t;
   }

   public String A() {
      return this.D;
   }

   public String B() {
      return "1.7.10";
   }

   public int C() {
      return this.u.o();
   }

   public int D() {
      return this.u.p();
   }

   public String[] E() {
      return this.u.f();
   }

   public GameProfile[] F() {
      return this.u.g();
   }

   public String G() {
      return "";
   }

   public String g(String var1) {
      ov.a.e();
      this.o.a(ov.a, var1);
      return ov.a.f();
   }

   public boolean H() {
      return false;
   }

   public void h(String var1) {
      i.error(var1);
   }

   public void i(String var1) {
      if(this.H()) {
         i.info(var1);
      }

   }

   public String getServerModName() {
      return "vanilla";
   }

   public b b(b var1) {
      var1.g().a("Profiler Position", (Callable)(new lk(this)));
      if(this.c != null && this.c.length > 0 && this.c[0] != null) {
         var1.g().a("Vec3 Pool Size", (Callable)(new ll(this)));
      }

      if(this.u != null) {
         var1.g().a("Player Count", (Callable)(new lm(this)));
      }

      return var1;
   }

   public List a(ac var1, String var2) {
      ArrayList var3 = new ArrayList();
      if(var2.startsWith("/")) {
         var2 = var2.substring(1);
         boolean var10 = !var2.contains(" ");
         List var11 = this.o.b(var1, var2);
         if(var11 != null) {
            Iterator var12 = var11.iterator();

            while(var12.hasNext()) {
               String var13 = (String)var12.next();
               if(var10) {
                  var3.add("/" + var13);
               } else {
                  var3.add(var13);
               }
            }
         }

         return var3;
      } else {
         String[] var4 = var2.split(" ", -1);
         String var5 = var4[var4.length - 1];
         String[] var6 = this.u.f();
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            if(y.a(var5, var9)) {
               var3.add(var9);
            }
         }

         return var3;
      }
   }

   public static MinecraftServer I() {
      return j;
   }

   public String b_() {
      return "Server";
   }

   public void a(fj var1) {
      i.info(var1.c());
   }

   public boolean a(int var1, String var2) {
      return true;
   }

   public ab J() {
      return this.o;
   }

   public KeyPair K() {
      return this.G;
   }

   public int L() {
      return this.t;
   }

   public void b(int var1) {
      this.t = var1;
   }

   public String M() {
      return this.H;
   }

   public void j(String var1) {
      this.H = var1;
   }

   public boolean N() {
      return this.H != null;
   }

   public String O() {
      return this.I;
   }

   public void k(String var1) {
      this.I = var1;
   }

   public void a(KeyPair var1) {
      this.G = var1;
   }

   public void a(rd var1) {
      for(int var2 = 0; var2 < this.c.length; ++var2) {
         mt var3 = this.c[var2];
         if(var3 != null) {
            if(var3.N().t()) {
               var3.r = rd.d;
               var3.a(true, true);
            } else if(this.N()) {
               var3.r = var1;
               var3.a(var3.r != rd.a, true);
            } else {
               var3.r = var1;
               var3.a(this.Q(), this.z);
            }
         }
      }

   }

   protected boolean Q() {
      return true;
   }

   public boolean R() {
      return this.K;
   }

   public void b(boolean var1) {
      this.K = var1;
   }

   public void c(boolean var1) {
      this.L = var1;
   }

   public aze S() {
      return this.k;
   }

   public void U() {
      this.M = true;
      this.S().d();

      for(int var1 = 0; var1 < this.c.length; ++var1) {
         mt var2 = this.c[var1];
         if(var2 != null) {
            var2.n();
         }
      }

      this.S().e(this.c[0].M().g());
      this.r();
   }

   public String V() {
      return this.N;
   }

   public void m(String var1) {
      this.N = var1;
   }

   public void a(ri var1) {
      var1.a("whitelist_enabled", Boolean.valueOf(false));
      var1.a("whitelist_count", Integer.valueOf(0));
      var1.a("players_current", Integer.valueOf(this.C()));
      var1.a("players_max", Integer.valueOf(this.D()));
      var1.a("players_seen", Integer.valueOf(this.u.q().length));
      var1.a("uses_auth", Boolean.valueOf(this.y));
      var1.a("gui_state", this.ak()?"enabled":"disabled");
      var1.a("run_time", Long.valueOf((ar() - var1.g()) / 60L * 1000L));
      var1.a("avg_tick_ms", Integer.valueOf((int)(qh.a(this.g) * 1.0E-6D)));
      int var2 = 0;

      for(int var3 = 0; var3 < this.c.length; ++var3) {
         if(this.c[var3] != null) {
            mt var4 = this.c[var3];
            ays var5 = var4.N();
            var1.a("world[" + var2 + "][dimension]", Integer.valueOf(var4.t.i));
            var1.a("world[" + var2 + "][mode]", var5.r());
            var1.a("world[" + var2 + "][difficulty]", var4.r);
            var1.a("world[" + var2 + "][hardcore]", Boolean.valueOf(var5.t()));
            var1.a("world[" + var2 + "][generator_name]", var5.u().a());
            var1.a("world[" + var2 + "][generator_version]", Integer.valueOf(var5.u().d()));
            var1.a("world[" + var2 + "][height]", Integer.valueOf(this.E));
            var1.a("world[" + var2 + "][chunks_loaded]", Integer.valueOf(var4.L().g()));
            ++var2;
         }
      }

      var1.a("worlds", Integer.valueOf(var2));
   }

   public void b(ri var1) {
      var1.b("singleplayer", Boolean.valueOf(this.N()));
      var1.b("server_brand", this.getServerModName());
      var1.b("gui_supported", GraphicsEnvironment.isHeadless()?"headless":"supported");
      var1.b("dedicated", Boolean.valueOf(this.X()));
   }

   public boolean W() {
      return true;
   }

   public abstract boolean X();

   public boolean Y() {
      return this.y;
   }

   public void d(boolean var1) {
      this.y = var1;
   }

   public boolean Z() {
      return this.z;
   }

   public void e(boolean var1) {
      this.z = var1;
   }

   public boolean aa() {
      return this.A;
   }

   public void f(boolean var1) {
      this.A = var1;
   }

   public boolean ab() {
      return this.B;
   }

   public void g(boolean var1) {
      this.B = var1;
   }

   public boolean ac() {
      return this.C;
   }

   public void h(boolean var1) {
      this.C = var1;
   }

   public abstract boolean ad();

   public String ae() {
      return this.D;
   }

   public void n(String var1) {
      this.D = var1;
   }

   public int af() {
      return this.E;
   }

   public void c(int var1) {
      this.E = var1;
   }

   public boolean ag() {
      return this.w;
   }

   public oi ah() {
      return this.u;
   }

   public void a(oi var1) {
      this.u = var1;
   }

   public void a(ahk var1) {
      for(int var2 = 0; var2 < this.c.length; ++var2) {
         I().c[var2].N().a(var1);
      }

   }

   public nc ai() {
      return this.p;
   }

   public boolean ak() {
      return false;
   }

   public abstract String a(ahk var1, boolean var2);

   public int al() {
      return this.x;
   }

   public void am() {
      this.R = true;
   }

   public r f_() {
      return new r(0, 0, 0);
   }

   public ahb d() {
      return this.c[0];
   }

   public int ao() {
      return 16;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5) {
      return false;
   }

   public void i(boolean var1) {
      this.S = var1;
   }

   public boolean ap() {
      return this.S;
   }

   public Proxy aq() {
      return this.d;
   }

   public static long ar() {
      return System.currentTimeMillis();
   }

   public int as() {
      return this.F;
   }

   public void d(int var1) {
      this.F = var1;
   }

   public fj c_() {
      return new fq(this.b_());
   }

   public boolean at() {
      return true;
   }

   public MinecraftSessionService av() {
      return this.U;
   }

   public GameProfileRepository aw() {
      return this.W;
   }

   public ns ax() {
      return this.X;
   }

   public kb ay() {
      return this.q;
   }

   public void az() {
      this.V = 0L;
   }

   // $FF: synthetic method
   public static Logger aA() {
      return i;
   }

   // $FF: synthetic method
   public static oi a(MinecraftServer var0) {
      return var0.u;
   }

}
