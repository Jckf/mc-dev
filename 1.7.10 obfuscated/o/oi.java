import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class oi {

   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   private static final Logger g = LogManager.getLogger();
   private static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd \'at\' HH:mm:ss z");
   private final MinecraftServer i;
   public final List e = new ArrayList();
   private final op j;
   private final nx k;
   private final oj l;
   private final or m;
   private final Map n;
   private azp o;
   private boolean p;
   protected int f;
   private int q;
   private ahk r;
   private boolean s;
   private int t;


   public oi(MinecraftServer var1) {
      this.j = new op(a);
      this.k = new nx(b);
      this.l = new oj(c);
      this.m = new or(d);
      this.n = Maps.newHashMap();
      this.i = var1;
      this.j.a(false);
      this.k.a(false);
      this.f = 8;
   }

   public void a(ej var1, mw var2) {
      GameProfile var3 = var2.bJ();
      ns var4 = this.i.ax();
      GameProfile var5 = var4.a(var3.getId());
      String var6 = var5 == null?var3.getName():var5.getName();
      var4.a(var3);
      dh var7 = this.a(var2);
      var2.a((ahb)this.i.a(var2.ap));
      var2.c.a((mt)var2.o);
      String var8 = "local";
      if(var1.b() != null) {
         var8 = var1.b().toString();
      }

      g.info(var2.b_() + "[" + var8 + "] logged in with entity id " + var2.y() + " at (" + var2.s + ", " + var2.t + ", " + var2.u + ")");
      mt var9 = this.i.a(var2.ap);
      r var10 = var9.K();
      this.a(var2, (mw)null, var9);
      nh var11 = new nh(this.i, var1, var2);
      var11.a((ft)(new hd(var2.y(), var2.c.b(), var9.N().t(), var9.t.i, var9.r, this.p(), var9.N().u())));
      var11.a((ft)(new gr("MC|Brand", this.c().getServerModName().getBytes(Charsets.UTF_8))));
      var11.a((ft)(new ig(var10.a, var10.b, var10.c)));
      var11.a((ft)(new hk(var2.bE)));
      var11.a((ft)(new hu(var2.bm.c)));
      var2.w().d();
      var2.w().b(var2);
      this.a((lp)var9.W(), var2);
      this.i.az();
      fr var12;
      if(!var2.b_().equalsIgnoreCase(var6)) {
         var12 = new fr("multiplayer.player.joined.renamed", new Object[]{var2.c_(), var6});
      } else {
         var12 = new fr("multiplayer.player.joined", new Object[]{var2.c_()});
      }

      var12.b().a(a.o);
      this.a((fj)var12);
      this.c(var2);
      var11.a(var2.s, var2.t, var2.u, var2.y, var2.z);
      this.b(var2, var9);
      if(this.i.V().length() > 0) {
         var2.a(this.i.V());
      }

      Iterator var13 = var2.aQ().iterator();

      while(var13.hasNext()) {
         rw var14 = (rw)var13.next();
         var11.a((ft)(new in(var2.y(), var14)));
      }

      var2.d_();
      if(var7 != null && var7.b("Riding", 10)) {
         sa var15 = sg.a(var7.m("Riding"), var9);
         if(var15 != null) {
            var15.n = true;
            var9.d(var15);
            var2.a(var15);
            var15.n = false;
         }
      }

   }

   protected void a(lp var1, mw var2) {
      HashSet var3 = new HashSet();
      Iterator var4 = var1.g().iterator();

      while(var4.hasNext()) {
         azy var5 = (azy)var4.next();
         var2.a.a((ft)(new id(var5, 0)));
      }

      for(int var9 = 0; var9 < 3; ++var9) {
         azx var10 = var1.a(var9);
         if(var10 != null && !var3.contains(var10)) {
            List var6 = var1.d(var10);
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               ft var8 = (ft)var7.next();
               var2.a.a(var8);
            }

            var3.add(var10);
         }
      }

   }

   public void a(mt[] var1) {
      this.o = var1[0].M().e();
   }

   public void a(mw var1, mt var2) {
      mt var3 = var1.r();
      if(var2 != null) {
         var2.t().c(var1);
      }

      var3.t().a(var1);
      var3.b.c((int)var1.s >> 4, (int)var1.u >> 4);
   }

   public int d() {
      return mq.b(this.s());
   }

   public dh a(mw var1) {
      dh var2 = this.i.c[0].N().i();
      dh var3;
      if(var1.b_().equals(this.i.M()) && var2 != null) {
         var1.f(var2);
         var3 = var2;
         g.debug("loading single player");
      } else {
         var3 = this.o.b(var1);
      }

      return var3;
   }

   protected void b(mw var1) {
      this.o.a(var1);
      pg var2 = (pg)this.n.get(var1.aB());
      if(var2 != null) {
         var2.b();
      }

   }

   public void c(mw var1) {
      this.a((ft)(new ho(var1.b_(), true, 1000)));
      this.e.add(var1);
      mt var2 = this.i.a(var1.ap);
      var2.d(var1);
      this.a(var1, (mt)null);

      for(int var3 = 0; var3 < this.e.size(); ++var3) {
         mw var4 = (mw)this.e.get(var3);
         var1.a.a((ft)(new ho(var4.b_(), true, var4.h)));
      }

   }

   public void d(mw var1) {
      var1.r().t().d(var1);
   }

   public void e(mw var1) {
      var1.a(pp.f);
      this.b(var1);
      mt var2 = var1.r();
      if(var1.m != null) {
         var2.f(var1.m);
         g.debug("removing player mount");
      }

      var2.e(var1);
      var2.t().c(var1);
      this.e.remove(var1);
      this.n.remove(var1.aB());
      this.a((ft)(new ho(var1.b_(), false, 9999)));
   }

   public String a(SocketAddress var1, GameProfile var2) {
      String var4;
      if(this.j.a(var2)) {
         oq var5 = (oq)this.j.b(var2);
         var4 = "You are banned from this server!\nReason: " + var5.d();
         if(var5.c() != null) {
            var4 = var4 + "\nYour ban will be removed on " + h.format(var5.c());
         }

         return var4;
      } else if(!this.e(var2)) {
         return "You are not white-listed on this server!";
      } else if(this.k.a(var1)) {
         ny var3 = this.k.b(var1);
         var4 = "Your IP address is banned from this server!\nReason: " + var3.d();
         if(var3.c() != null) {
            var4 = var4 + "\nYour ban will be removed on " + h.format(var3.c());
         }

         return var4;
      } else {
         return this.e.size() >= this.f?"The server is full!":null;
      }
   }

   public mw f(GameProfile var1) {
      UUID var2 = yz.a(var1);
      ArrayList var3 = Lists.newArrayList();

      mw var5;
      for(int var4 = 0; var4 < this.e.size(); ++var4) {
         var5 = (mw)this.e.get(var4);
         if(var5.aB().equals(var2)) {
            var3.add(var5);
         }
      }

      Iterator var6 = var3.iterator();

      while(var6.hasNext()) {
         var5 = (mw)var6.next();
         var5.a.c("You logged in from another location");
      }

      Object var7;
      if(this.i.R()) {
         var7 = new ml(this.i.a(0));
      } else {
         var7 = new mx(this.i.a(0));
      }

      return new mw(this.i, this.i.a(0), var1, (mx)var7);
   }

   public mw a(mw var1, int var2, boolean var3) {
      var1.r().r().a(var1);
      var1.r().r().b(var1);
      var1.r().t().c(var1);
      this.e.remove(var1);
      this.i.a(var1.ap).f(var1);
      r var4 = var1.bN();
      boolean var5 = var1.bO();
      var1.ap = var2;
      Object var6;
      if(this.i.R()) {
         var6 = new ml(this.i.a(var1.ap));
      } else {
         var6 = new mx(this.i.a(var1.ap));
      }

      mw var7 = new mw(this.i, this.i.a(var1.ap), var1.bJ(), (mx)var6);
      var7.a = var1.a;
      var7.a((yz)var1, var3);
      var7.d(var1.y());
      mt var8 = this.i.a(var1.ap);
      this.a(var7, var1, var8);
      r var9;
      if(var4 != null) {
         var9 = yz.a(this.i.a(var1.ap), var4, var5);
         if(var9 != null) {
            var7.b((double)((float)var9.a + 0.5F), (double)((float)var9.b + 0.1F), (double)((float)var9.c + 0.5F), 0.0F, 0.0F);
            var7.a(var4, var5);
         } else {
            var7.a.a((ft)(new gv(0, 0.0F)));
         }
      }

      var8.b.c((int)var7.s >> 4, (int)var7.u >> 4);

      while(!var8.a(var7, var7.C).isEmpty()) {
         var7.b(var7.s, var7.t + 1.0D, var7.u);
      }

      var7.a.a((ft)(new hs(var7.ap, var7.o.r, var7.o.N().u(), var7.c.b())));
      var9 = var8.K();
      var7.a.a(var7.s, var7.t, var7.u, var7.y, var7.z);
      var7.a.a((ft)(new ig(var9.a, var9.b, var9.c)));
      var7.a.a((ft)(new ia(var7.bH, var7.bG, var7.bF)));
      this.b(var7, var8);
      var8.t().a(var7);
      var8.d(var7);
      this.e.add(var7);
      var7.d_();
      var7.g(var7.aS());
      return var7;
   }

   public void a(mw var1, int var2) {
      int var3 = var1.ap;
      mt var4 = this.i.a(var1.ap);
      var1.ap = var2;
      mt var5 = this.i.a(var1.ap);
      var1.a.a((ft)(new hs(var1.ap, var1.o.r, var1.o.N().u(), var1.c.b())));
      var4.f(var1);
      var1.K = false;
      this.a(var1, var3, var4, var5);
      this.a(var1, var4);
      var1.a.a(var1.s, var1.t, var1.u, var1.y, var1.z);
      var1.c.a(var5);
      this.b(var1, var5);
      this.f(var1);
      Iterator var6 = var1.aQ().iterator();

      while(var6.hasNext()) {
         rw var7 = (rw)var6.next();
         var1.a.a((ft)(new in(var1.y(), var7)));
      }

   }

   public void a(sa var1, int var2, mt var3, mt var4) {
      double var5 = var1.s;
      double var7 = var1.u;
      double var9 = 8.0D;
      double var11 = var1.s;
      double var13 = var1.t;
      double var15 = var1.u;
      float var17 = var1.y;
      var3.C.a("moving");
      if(var1.ap == -1) {
         var5 /= var9;
         var7 /= var9;
         var1.b(var5, var1.t, var7, var1.y, var1.z);
         if(var1.Z()) {
            var3.a(var1, false);
         }
      } else if(var1.ap == 0) {
         var5 *= var9;
         var7 *= var9;
         var1.b(var5, var1.t, var7, var1.y, var1.z);
         if(var1.Z()) {
            var3.a(var1, false);
         }
      } else {
         r var18;
         if(var2 == 1) {
            var18 = var4.K();
         } else {
            var18 = var4.l();
         }

         var5 = (double)var18.a;
         var1.t = (double)var18.b;
         var7 = (double)var18.c;
         var1.b(var5, var1.t, var7, 90.0F, 0.0F);
         if(var1.Z()) {
            var3.a(var1, false);
         }
      }

      var3.C.b();
      if(var2 != 1) {
         var3.C.a("placing");
         var5 = (double)qh.a((int)var5, -29999872, 29999872);
         var7 = (double)qh.a((int)var7, -29999872, 29999872);
         if(var1.Z()) {
            var1.b(var5, var1.t, var7, var1.y, var1.z);
            var4.u().a(var1, var11, var13, var15, var17);
            var4.d(var1);
            var4.a(var1, false);
         }

         var3.C.b();
      }

      var1.a((ahb)var4);
   }

   public void e() {
      if(++this.t > 600) {
         this.t = 0;
      }

      if(this.t < this.e.size()) {
         mw var1 = (mw)this.e.get(this.t);
         this.a((ft)(new ho(var1.b_(), true, var1.h)));
      }

   }

   public void a(ft var1) {
      for(int var2 = 0; var2 < this.e.size(); ++var2) {
         ((mw)this.e.get(var2)).a.a(var1);
      }

   }

   public void a(ft var1, int var2) {
      for(int var3 = 0; var3 < this.e.size(); ++var3) {
         mw var4 = (mw)this.e.get(var3);
         if(var4.ap == var2) {
            var4.a.a(var1);
         }
      }

   }

   public String b(boolean var1) {
      String var2 = "";
      ArrayList var3 = Lists.newArrayList((Iterable)this.e);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         if(var4 > 0) {
            var2 = var2 + ", ";
         }

         var2 = var2 + ((mw)var3.get(var4)).b_();
         if(var1) {
            var2 = var2 + " (" + ((mw)var3.get(var4)).aB().toString() + ")";
         }
      }

      return var2;
   }

   public String[] f() {
      String[] var1 = new String[this.e.size()];

      for(int var2 = 0; var2 < this.e.size(); ++var2) {
         var1[var2] = ((mw)this.e.get(var2)).b_();
      }

      return var1;
   }

   public GameProfile[] g() {
      GameProfile[] var1 = new GameProfile[this.e.size()];

      for(int var2 = 0; var2 < this.e.size(); ++var2) {
         var1[var2] = ((mw)this.e.get(var2)).bJ();
      }

      return var1;
   }

   public op h() {
      return this.j;
   }

   public nx i() {
      return this.k;
   }

   public void a(GameProfile var1) {
      this.l.a((ol)(new ok(var1, this.i.l())));
   }

   public void b(GameProfile var1) {
      this.l.c(var1);
   }

   public boolean e(GameProfile var1) {
      return !this.p || this.l.d(var1) || this.m.d(var1);
   }

   public boolean g(GameProfile var1) {
      return this.l.d(var1) || this.i.N() && this.i.c[0].N().v() && this.i.M().equalsIgnoreCase(var1.getName()) || this.s;
   }

   public mw a(String var1) {
      Iterator var2 = this.e.iterator();

      mw var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (mw)var2.next();
      } while(!var3.b_().equalsIgnoreCase(var1));

      return var3;
   }

   public List a(r var1, int var2, int var3, int var4, int var5, int var6, int var7, Map var8, String var9, String var10, ahb var11) {
      if(this.e.isEmpty()) {
         return Collections.emptyList();
      } else {
         Object var12 = new ArrayList();
         boolean var13 = var4 < 0;
         boolean var14 = var9 != null && var9.startsWith("!");
         boolean var15 = var10 != null && var10.startsWith("!");
         int var16 = var2 * var2;
         int var17 = var3 * var3;
         var4 = qh.a(var4);
         if(var14) {
            var9 = var9.substring(1);
         }

         if(var15) {
            var10 = var10.substring(1);
         }

         for(int var18 = 0; var18 < this.e.size(); ++var18) {
            mw var19 = (mw)this.e.get(var18);
            if((var11 == null || var19.o == var11) && (var9 == null || var14 != var9.equalsIgnoreCase(var19.b_()))) {
               if(var10 != null) {
                  bae var20 = var19.bt();
                  String var21 = var20 == null?"":var20.b();
                  if(var15 == var10.equalsIgnoreCase(var21)) {
                     continue;
                  }
               }

               if(var1 != null && (var2 > 0 || var3 > 0)) {
                  float var22 = var1.e(var19.f_());
                  if(var2 > 0 && var22 < (float)var16 || var3 > 0 && var22 > (float)var17) {
                     continue;
                  }
               }

               if(this.a((yz)var19, var8) && (var5 == ahk.a.a() || var5 == var19.c.b().a()) && (var6 <= 0 || var19.bF >= var6) && var19.bF <= var7) {
                  ((List)var12).add(var19);
               }
            }
         }

         if(var1 != null) {
            Collections.sort((List)var12, new ln(var1));
         }

         if(var13) {
            Collections.reverse((List)var12);
         }

         if(var4 > 0) {
            var12 = ((List)var12).subList(0, Math.min(var4, ((List)var12).size()));
         }

         return (List)var12;
      }
   }

   private boolean a(yz var1, Map var2) {
      if(var2 != null && var2.size() != 0) {
         Iterator var3 = var2.entrySet().iterator();

         Entry var4;
         boolean var6;
         int var10;
         do {
            if(!var3.hasNext()) {
               return true;
            }

            var4 = (Entry)var3.next();
            String var5 = (String)var4.getKey();
            var6 = false;
            if(var5.endsWith("_min") && var5.length() > 4) {
               var6 = true;
               var5 = var5.substring(0, var5.length() - 4);
            }

            bac var7 = var1.bU();
            azx var8 = var7.b(var5);
            if(var8 == null) {
               return false;
            }

            azz var9 = var1.bU().a(var1.b_(), var8);
            var10 = var9.c();
            if(var10 < ((Integer)var4.getValue()).intValue() && var6) {
               return false;
            }
         } while(var10 <= ((Integer)var4.getValue()).intValue() || var6);

         return false;
      } else {
         return true;
      }
   }

   public void a(double var1, double var3, double var5, double var7, int var9, ft var10) {
      this.a((yz)null, var1, var3, var5, var7, var9, var10);
   }

   public void a(yz var1, double var2, double var4, double var6, double var8, int var10, ft var11) {
      for(int var12 = 0; var12 < this.e.size(); ++var12) {
         mw var13 = (mw)this.e.get(var12);
         if(var13 != var1 && var13.ap == var10) {
            double var14 = var2 - var13.s;
            double var16 = var4 - var13.t;
            double var18 = var6 - var13.u;
            if(var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
               var13.a.a(var11);
            }
         }
      }

   }

   public void j() {
      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         this.b((mw)this.e.get(var1));
      }

   }

   public void d(GameProfile var1) {
      this.m.a((ol)(new os(var1)));
   }

   public void c(GameProfile var1) {
      this.m.c(var1);
   }

   public or k() {
      return this.m;
   }

   public String[] l() {
      return this.m.a();
   }

   public oj m() {
      return this.l;
   }

   public String[] n() {
      return this.l.a();
   }

   public void a() {}

   public void b(mw var1, mt var2) {
      var1.a.a((ft)(new ih(var2.I(), var2.J(), var2.O().b("doDaylightCycle"))));
      if(var2.Q()) {
         var1.a.a((ft)(new gv(1, 0.0F)));
         var1.a.a((ft)(new gv(7, var2.j(1.0F))));
         var1.a.a((ft)(new gv(8, var2.h(1.0F))));
      }

   }

   public void f(mw var1) {
      var1.a(var1.bn);
      var1.o();
      var1.a.a((ft)(new hu(var1.bm.c)));
   }

   public int o() {
      return this.e.size();
   }

   public int p() {
      return this.f;
   }

   public String[] q() {
      return this.i.c[0].M().e().f();
   }

   public boolean r() {
      return this.p;
   }

   public void a(boolean var1) {
      this.p = var1;
   }

   public List b(String var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.e.iterator();

      while(var3.hasNext()) {
         mw var4 = (mw)var3.next();
         if(var4.s().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public int s() {
      return this.q;
   }

   public MinecraftServer c() {
      return this.i;
   }

   public dh t() {
      return null;
   }

   private void a(mw var1, mw var2, ahb var3) {
      if(var2 != null) {
         var1.c.a(var2.c.b());
      } else if(this.r != null) {
         var1.c.a(this.r);
      }

      var1.c.b(var3.N().r());
   }

   public void u() {
      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         ((mw)this.e.get(var1)).a.c("Server closed");
      }

   }

   public void a(fj var1, boolean var2) {
      this.i.a(var1);
      this.a((ft)(new gj(var1, var2)));
   }

   public void a(fj var1) {
      this.a(var1, true);
   }

   public pg a(yz var1) {
      UUID var2 = var1.aB();
      pg var3 = var2 == null?null:(pg)this.n.get(var2);
      if(var3 == null) {
         File var4 = new File(this.i.a(0).M().b(), "stats");
         File var5 = new File(var4, var2.toString() + ".json");
         if(!var5.exists()) {
            File var6 = new File(var4, var1.b_() + ".json");
            if(var6.exists() && var6.isFile()) {
               var6.renameTo(var5);
            }
         }

         var3 = new pg(this.i, var5);
         var3.a();
         this.n.put(var2, var3);
      }

      return var3;
   }

   public void a(int var1) {
      this.q = var1;
      if(this.i.c != null) {
         mt[] var2 = this.i.c;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            mt var5 = var2[var4];
            if(var5 != null) {
               var5.t().a(var1);
            }
         }

      }
   }

}
