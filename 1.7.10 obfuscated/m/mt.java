import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mt extends ahb {

   private static final Logger a = LogManager.getLogger();
   private final MinecraftServer J;
   private final mn K;
   private final mq L;
   private Set M;
   private TreeSet N;
   public ms b;
   public boolean c;
   private boolean O;
   private int P;
   private final ahp Q;
   private final aho R = new aho();
   private mv[] S = new mv[]{new mv((mu)null), new mv((mu)null)};
   private int T;
   private static final qx[] U = new qx[]{new qx(ade.y, 0, 1, 3, 10), new qx(adb.a(ajn.f), 0, 1, 3, 10), new qx(adb.a(ajn.r), 0, 1, 3, 10), new qx(ade.t, 0, 1, 1, 3), new qx(ade.p, 0, 1, 1, 5), new qx(ade.s, 0, 1, 1, 3), new qx(ade.o, 0, 1, 1, 5), new qx(ade.e, 0, 2, 3, 5), new qx(ade.P, 0, 2, 3, 3), new qx(adb.a(ajn.s), 0, 1, 3, 10)};
   private List V = new ArrayList();
   private pz W;


   public mt(MinecraftServer var1, azc var2, String var3, int var4, ahj var5, qi var6) {
      super(var2, var3, var5, aqo.a(var4), var6);
      this.J = var1;
      this.K = new mn(this);
      this.L = new mq(this);
      if(this.W == null) {
         this.W = new pz();
      }

      if(this.M == null) {
         this.M = new HashSet();
      }

      if(this.N == null) {
         this.N = new TreeSet();
      }

      this.Q = new ahp(this);
      this.D = new lp(var1);
      bad var7 = (bad)this.z.a(bad.class, "scoreboard");
      if(var7 == null) {
         var7 = new bad();
         this.z.a("scoreboard", (ayl)var7);
      }

      var7.a(this.D);
      ((lp)this.D).a(var7);
   }

   public void b() {
      super.b();
      if(this.N().t() && this.r != rd.d) {
         this.r = rd.d;
      }

      this.t.e.b();
      if(this.e()) {
         if(this.O().b("doDaylightCycle")) {
            long var1 = this.x.g() + 24000L;
            this.x.c(var1 - var1 % 24000L);
         }

         this.d();
      }

      this.C.a("mobSpawner");
      if(this.O().b("doMobSpawning")) {
         this.R.a(this, this.G, this.H, this.x.f() % 400L == 0L);
      }

      this.C.c("chunkSource");
      this.v.d();
      int var3 = this.a(1.0F);
      if(var3 != this.j) {
         this.j = var3;
      }

      this.x.b(this.x.f() + 1L);
      if(this.O().b("doDaylightCycle")) {
         this.x.c(this.x.g() + 1L);
      }

      this.C.c("tickPending");
      this.a(false);
      this.C.c("tickBlocks");
      this.g();
      this.C.c("chunkMap");
      this.L.b();
      this.C.c("village");
      this.A.a();
      this.B.a();
      this.C.c("portalForcer");
      this.Q.a(this.I());
      this.C.b();
      this.Z();
   }

   public ahx a(sx var1, int var2, int var3, int var4) {
      List var5 = this.L().a(var1, var2, var3, var4);
      return var5 != null && !var5.isEmpty()?(ahx)qv.a(this.s, (Collection)var5):null;
   }

   public void c() {
      this.O = !this.h.isEmpty();
      Iterator var1 = this.h.iterator();

      while(var1.hasNext()) {
         yz var2 = (yz)var1.next();
         if(!var2.bm()) {
            this.O = false;
            break;
         }
      }

   }

   protected void d() {
      this.O = false;
      Iterator var1 = this.h.iterator();

      while(var1.hasNext()) {
         yz var2 = (yz)var1.next();
         if(var2.bm()) {
            var2.a(false, false, true);
         }
      }

      this.Y();
   }

   private void Y() {
      this.x.g(0);
      this.x.b(false);
      this.x.f(0);
      this.x.a(false);
   }

   public boolean e() {
      if(this.O && !this.E) {
         Iterator var1 = this.h.iterator();

         yz var2;
         do {
            if(!var1.hasNext()) {
               return true;
            }

            var2 = (yz)var1.next();
         } while(var2.bL());

         return false;
      } else {
         return false;
      }
   }

   protected void g() {
      super.g();
      int var1 = 0;
      int var2 = 0;
      Iterator var3 = this.F.iterator();

      while(var3.hasNext()) {
         agu var4 = (agu)var3.next();
         int var5 = var4.a * 16;
         int var6 = var4.b * 16;
         this.C.a("getChunk");
         apx var7 = this.e(var4.a, var4.b);
         this.a(var5, var6, var7);
         this.C.c("tickChunk");
         var7.b(false);
         this.C.c("thunder");
         int var8;
         int var9;
         int var10;
         int var11;
         if(this.s.nextInt(100000) == 0 && this.Q() && this.P()) {
            this.k = this.k * 3 + 1013904223;
            var8 = this.k >> 2;
            var9 = var5 + (var8 & 15);
            var10 = var6 + (var8 >> 8 & 15);
            var11 = this.h(var9, var10);
            if(this.y(var9, var11, var10)) {
               this.c(new xh(this, (double)var9, (double)var11, (double)var10));
            }
         }

         this.C.c("iceandsnow");
         if(this.s.nextInt(16) == 0) {
            this.k = this.k * 3 + 1013904223;
            var8 = this.k >> 2;
            var9 = var8 & 15;
            var10 = var8 >> 8 & 15;
            var11 = this.h(var9 + var5, var10 + var6);
            if(this.s(var9 + var5, var11 - 1, var10 + var6)) {
               this.b(var9 + var5, var11 - 1, var10 + var6, ajn.aD);
            }

            if(this.Q() && this.e(var9 + var5, var11, var10 + var6, true)) {
               this.b(var9 + var5, var11, var10 + var6, ajn.aC);
            }

            if(this.Q()) {
               ahu var12 = this.a(var9 + var5, var10 + var6);
               if(var12.e()) {
                  this.a(var9 + var5, var11 - 1, var10 + var6).l(this, var9 + var5, var11 - 1, var10 + var6);
               }
            }
         }

         this.C.c("tickBlocks");
         apz[] var18 = var7.i();
         var9 = var18.length;

         for(var10 = 0; var10 < var9; ++var10) {
            apz var19 = var18[var10];
            if(var19 != null && var19.b()) {
               for(int var20 = 0; var20 < 3; ++var20) {
                  this.k = this.k * 3 + 1013904223;
                  int var13 = this.k >> 2;
                  int var14 = var13 & 15;
                  int var15 = var13 >> 8 & 15;
                  int var16 = var13 >> 16 & 15;
                  ++var2;
                  aji var17 = var19.a(var14, var16, var15);
                  if(var17.t()) {
                     ++var1;
                     var17.a(this, var14 + var5, var16 + var19.d(), var15 + var6, this.s);
                  }
               }
            }
         }

         this.C.b();
      }

   }

   public boolean a(int var1, int var2, int var3, aji var4) {
      ahs var5 = new ahs(var1, var2, var3, var4);
      return this.V.contains(var5);
   }

   public void a(int var1, int var2, int var3, aji var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 0);
   }

   public void a(int var1, int var2, int var3, aji var4, int var5, int var6) {
      ahs var7 = new ahs(var1, var2, var3, var4);
      byte var8 = 0;
      if(this.d && var4.o() != awt.a) {
         if(var4.L()) {
            var8 = 8;
            if(this.b(var7.a - var8, var7.b - var8, var7.c - var8, var7.a + var8, var7.b + var8, var7.c + var8)) {
               aji var9 = this.a(var7.a, var7.b, var7.c);
               if(var9.o() != awt.a && var9 == var7.a()) {
                  var9.a(this, var7.a, var7.b, var7.c, this.s);
               }
            }

            return;
         }

         var5 = 1;
      }

      if(this.b(var1 - var8, var2 - var8, var3 - var8, var1 + var8, var2 + var8, var3 + var8)) {
         if(var4.o() != awt.a) {
            var7.a((long)var5 + this.x.f());
            var7.a(var6);
         }

         if(!this.M.contains(var7)) {
            this.M.add(var7);
            this.N.add(var7);
         }
      }

   }

   public void b(int var1, int var2, int var3, aji var4, int var5, int var6) {
      ahs var7 = new ahs(var1, var2, var3, var4);
      var7.a(var6);
      if(var4.o() != awt.a) {
         var7.a((long)var5 + this.x.f());
      }

      if(!this.M.contains(var7)) {
         this.M.add(var7);
         this.N.add(var7);
      }

   }

   public void h() {
      if(this.h.isEmpty()) {
         if(this.P++ >= 1200) {
            return;
         }
      } else {
         this.i();
      }

      super.h();
   }

   public void i() {
      this.P = 0;
   }

   public boolean a(boolean var1) {
      int var2 = this.N.size();
      if(var2 != this.M.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if(var2 > 1000) {
            var2 = 1000;
         }

         this.C.a("cleaning");

         ahs var4;
         for(int var3 = 0; var3 < var2; ++var3) {
            var4 = (ahs)this.N.first();
            if(!var1 && var4.d > this.x.f()) {
               break;
            }

            this.N.remove(var4);
            this.M.remove(var4);
            this.V.add(var4);
         }

         this.C.b();
         this.C.a("ticking");
         Iterator var14 = this.V.iterator();

         while(var14.hasNext()) {
            var4 = (ahs)var14.next();
            var14.remove();
            byte var5 = 0;
            if(this.b(var4.a - var5, var4.b - var5, var4.c - var5, var4.a + var5, var4.b + var5, var4.c + var5)) {
               aji var6 = this.a(var4.a, var4.b, var4.c);
               if(var6.o() != awt.a && aji.a(var6, var4.a())) {
                  try {
                     var6.a(this, var4.a, var4.b, var4.c, this.s);
                  } catch (Throwable var13) {
                     b var8 = b.a(var13, "Exception while ticking a block");
                     k var9 = var8.a("Block being ticked");

                     int var10;
                     try {
                        var10 = this.e(var4.a, var4.b, var4.c);
                     } catch (Throwable var12) {
                        var10 = -1;
                     }

                     k.a(var9, var4.a, var4.b, var4.c, var6, var10);
                     throw new s(var8);
                  }
               }
            } else {
               this.a(var4.a, var4.b, var4.c, var4.a(), 0);
            }
         }

         this.C.b();
         this.V.clear();
         return !this.N.isEmpty();
      }
   }

   public List a(apx var1, boolean var2) {
      ArrayList var3 = null;
      agu var4 = var1.l();
      int var5 = (var4.a << 4) - 2;
      int var6 = var5 + 16 + 2;
      int var7 = (var4.b << 4) - 2;
      int var8 = var7 + 16 + 2;

      for(int var9 = 0; var9 < 2; ++var9) {
         Iterator var10;
         if(var9 == 0) {
            var10 = this.N.iterator();
         } else {
            var10 = this.V.iterator();
            if(!this.V.isEmpty()) {
               a.debug("toBeTicked = " + this.V.size());
            }
         }

         while(var10.hasNext()) {
            ahs var11 = (ahs)var10.next();
            if(var11.a >= var5 && var11.a < var6 && var11.c >= var7 && var11.c < var8) {
               if(var2) {
                  this.M.remove(var11);
                  var10.remove();
               }

               if(var3 == null) {
                  var3 = new ArrayList();
               }

               var3.add(var11);
            }
         }
      }

      return var3;
   }

   public void a(sa var1, boolean var2) {
      if(!this.J.Z() && (var1 instanceof wf || var1 instanceof wu)) {
         var1.B();
      }

      if(!this.J.aa() && var1 instanceof yu) {
         var1.B();
      }

      super.a(var1, var2);
   }

   protected apu j() {
      aqc var1 = this.w.a(this.t);
      this.b = new ms(this, var1, this.t.c());
      return this.b;
   }

   public List a(int var1, int var2, int var3, int var4, int var5, int var6) {
      ArrayList var7 = new ArrayList();

      for(int var8 = 0; var8 < this.g.size(); ++var8) {
         aor var9 = (aor)this.g.get(var8);
         if(var9.c >= var1 && var9.d >= var2 && var9.e >= var3 && var9.c < var4 && var9.d < var5 && var9.e < var6) {
            var7.add(var9);
         }
      }

      return var7;
   }

   public boolean a(yz var1, int var2, int var3, int var4) {
      return !this.J.a(this, var2, var3, var4, var1);
   }

   protected void a(ahj var1) {
      if(this.W == null) {
         this.W = new pz();
      }

      if(this.M == null) {
         this.M = new HashSet();
      }

      if(this.N == null) {
         this.N = new TreeSet();
      }

      this.b(var1);
      super.a(var1);
   }

   protected void b(ahj var1) {
      if(!this.t.e()) {
         this.x.a(0, this.t.i(), 0);
      } else {
         this.y = true;
         aib var2 = this.t.e;
         List var3 = var2.a();
         Random var4 = new Random(this.H());
         agt var5 = var2.a(0, 0, 256, var3, var4);
         int var6 = 0;
         int var7 = this.t.i();
         int var8 = 0;
         if(var5 != null) {
            var6 = var5.a;
            var8 = var5.c;
         } else {
            a.warn("Unable to find spawn biome");
         }

         int var9 = 0;

         while(!this.t.a(var6, var8)) {
            var6 += var4.nextInt(64) - var4.nextInt(64);
            var8 += var4.nextInt(64) - var4.nextInt(64);
            ++var9;
            if(var9 == 1000) {
               break;
            }
         }

         this.x.a(var6, var7, var8);
         this.y = false;
         if(var1.c()) {
            this.k();
         }

      }
   }

   protected void k() {
      arg var1 = new arg(U, 10);

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = this.x.c() + this.s.nextInt(6) - this.s.nextInt(6);
         int var4 = this.x.e() + this.s.nextInt(6) - this.s.nextInt(6);
         int var5 = this.i(var3, var4) + 1;
         if(var1.a(this, this.s, var3, var5, var4)) {
            break;
         }
      }

   }

   public r l() {
      return this.t.h();
   }

   public void a(boolean var1, qk var2) {
      if(this.v.e()) {
         if(var2 != null) {
            var2.a("Saving level");
         }

         this.a();
         if(var2 != null) {
            var2.c("Saving chunks");
         }

         this.v.a(var1, var2);
         ArrayList var3 = Lists.newArrayList((Iterable)this.b.a());
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            apx var5 = (apx)var4.next();
            if(var5 != null && !this.L.a(var5.g, var5.h)) {
               this.b.b(var5.g, var5.h);
            }
         }

      }
   }

   public void m() {
      if(this.v.e()) {
         this.v.c();
      }
   }

   protected void a() {
      this.G();
      this.w.a(this.x, this.J.ah().t());
      this.z.a();
   }

   protected void a(sa var1) {
      super.a(var1);
      this.W.a(var1.y(), var1);
      sa[] var2 = var1.at();
      if(var2 != null) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            this.W.a(var2[var3].y(), var2[var3]);
         }
      }

   }

   protected void b(sa var1) {
      super.b(var1);
      this.W.d(var1.y());
      sa[] var2 = var1.at();
      if(var2 != null) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            this.W.d(var2[var3].y());
         }
      }

   }

   public sa a(int var1) {
      return (sa)this.W.a(var1);
   }

   public boolean c(sa var1) {
      if(super.c(var1)) {
         this.J.ah().a(var1.s, var1.t, var1.u, 512.0D, this.t.i, new fy(var1));
         return true;
      } else {
         return false;
      }
   }

   public void a(sa var1, byte var2) {
      this.r().b(var1, new gt(var1, var2));
   }

   public agw a(sa var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      agw var11 = new agw(this, var1, var2, var4, var6, var8);
      var11.a = var9;
      var11.b = var10;
      var11.a();
      var11.a(false);
      if(!var10) {
         var11.h.clear();
      }

      Iterator var12 = this.h.iterator();

      while(var12.hasNext()) {
         yz var13 = (yz)var12.next();
         if(var13.e(var2, var4, var6) < 4096.0D) {
            ((mw)var13).a.a((ft)(new gu(var2, var4, var6, var8, var11.h, (azw)var11.b().get(var13))));
         }
      }

      return var11;
   }

   public void c(int var1, int var2, int var3, aji var4, int var5, int var6) {
      ags var7 = new ags(var1, var2, var3, var4, var5, var6);
      Iterator var8 = this.S[this.T].iterator();

      ags var9;
      do {
         if(!var8.hasNext()) {
            this.S[this.T].add(var7);
            return;
         }

         var9 = (ags)var8.next();
      } while(!var9.equals(var7));

   }

   private void Z() {
      while(!this.S[this.T].isEmpty()) {
         int var1 = this.T;
         this.T ^= 1;
         Iterator var2 = this.S[var1].iterator();

         while(var2.hasNext()) {
            ags var3 = (ags)var2.next();
            if(this.a(var3)) {
               this.J.ah().a((double)var3.a(), (double)var3.b(), (double)var3.c(), 64.0D, this.t.i, new gg(var3.a(), var3.b(), var3.c(), var3.f(), var3.d(), var3.e()));
            }
         }

         this.S[var1].clear();
      }

   }

   private boolean a(ags var1) {
      aji var2 = this.a(var1.a(), var1.b(), var1.c());
      return var2 == var1.f()?var2.a(this, var1.a(), var1.b(), var1.c(), var1.d(), var1.e()):false;
   }

   public void n() {
      this.w.a();
   }

   protected void o() {
      boolean var1 = this.Q();
      super.o();
      if(this.m != this.n) {
         this.J.ah().a((ft)(new gv(7, this.n)), this.t.i);
      }

      if(this.o != this.p) {
         this.J.ah().a((ft)(new gv(8, this.p)), this.t.i);
      }

      if(var1 != this.Q()) {
         if(var1) {
            this.J.ah().a((ft)(new gv(2, 0.0F)));
         } else {
            this.J.ah().a((ft)(new gv(1, 0.0F)));
         }

         this.J.ah().a((ft)(new gv(7, this.n)));
         this.J.ah().a((ft)(new gv(8, this.p)));
      }

   }

   protected int p() {
      return this.J.ah().s();
   }

   public MinecraftServer q() {
      return this.J;
   }

   public mn r() {
      return this.K;
   }

   public mq t() {
      return this.L;
   }

   public ahp u() {
      return this.Q;
   }

   public void a(String var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15) {
      hb var17 = new hb(var1, (float)var2, (float)var4, (float)var6, (float)var9, (float)var11, (float)var13, (float)var15, var8);

      for(int var18 = 0; var18 < this.h.size(); ++var18) {
         mw var19 = (mw)this.h.get(var18);
         r var20 = var19.f_();
         double var21 = var2 - (double)var20.a;
         double var23 = var4 - (double)var20.b;
         double var25 = var6 - (double)var20.c;
         double var27 = var21 * var21 + var23 * var23 + var25 * var25;
         if(var27 <= 256.0D) {
            var19.a.a((ft)var17);
         }
      }

   }

}
