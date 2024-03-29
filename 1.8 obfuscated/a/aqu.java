import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public abstract class aqu implements ard {

   protected boolean e;
   public final List f = Lists.newArrayList();
   protected final List g = Lists.newArrayList();
   public final List h = Lists.newArrayList();
   public final List i = Lists.newArrayList();
   private final List a = Lists.newArrayList();
   private final List b = Lists.newArrayList();
   public final List j = Lists.newArrayList();
   public final List k = Lists.newArrayList();
   protected final um l = new um();
   private long c = 16777215L;
   private int d;
   protected int m = (new Random()).nextInt();
   protected final int n = 1013904223;
   protected float o;
   protected float p;
   protected float q;
   protected float r;
   private int I;
   public final Random s = new Random();
   public final bgd t;
   protected List u = Lists.newArrayList();
   protected bfe v;
   protected final bqy w;
   protected bqo x;
   protected boolean y;
   protected brn z;
   protected abl A;
   public final uw B;
   private final Calendar J = Calendar.getInstance();
   protected bsd C = new bsd();
   public final boolean D;
   protected Set E = Sets.newHashSet();
   private int K;
   protected boolean F;
   protected boolean G;
   private boolean L;
   private final bfb M;
   int[] H;


   protected aqu(bqy var1, bqo var2, bgd var3, uw var4, boolean var5) {
      this.K = this.s.nextInt(12000);
      this.F = true;
      this.G = true;
      this.H = new int['\u8000'];
      this.w = var1;
      this.B = var4;
      this.x = var2;
      this.t = var3;
      this.D = var5;
      this.M = var3.r();
   }

   public aqu b() {
      return this;
   }

   public arm b(dt var1) {
      if(this.e(var1)) {
         bfh var2 = this.f(var1);

         try {
            return var2.a(var1, this.t.m());
         } catch (Throwable var6) {
            b var4 = b.a(var6, "Getting biome");
            j var5 = var4.a("Coordinates of biome request");
            var5.a("Location", (Callable)(new aqv(this, var1)));
            throw new u(var4);
         }
      } else {
         return this.t.m().a(var1, arm.q);
      }
   }

   public arz v() {
      return this.t.m();
   }

   protected abstract bfe k();

   public void a(arb var1) {
      this.x.d(true);
   }

   public atr c(dt var1) {
      dt var2;
      for(var2 = new dt(var1.n(), 63, var1.p()); !this.d(var2.a()); var2 = var2.a()) {
         ;
      }

      return this.p(var2).c();
   }

   private boolean a(dt var1) {
      return var1.n() >= -30000000 && var1.p() >= -30000000 && var1.n() < 30000000 && var1.p() < 30000000 && var1.o() >= 0 && var1.o() < 256;
   }

   public boolean d(dt var1) {
      return this.p(var1).c().r() == bof.a;
   }

   public boolean e(dt var1) {
      return this.a(var1, true);
   }

   public boolean a(dt var1, boolean var2) {
      return !this.a(var1)?false:this.a(var1.n() >> 4, var1.p() >> 4, var2);
   }

   public boolean a(dt var1, int var2) {
      return this.a(var1, var2, true);
   }

   public boolean a(dt var1, int var2, boolean var3) {
      return this.a(var1.n() - var2, var1.o() - var2, var1.p() - var2, var1.n() + var2, var1.o() + var2, var1.p() + var2, var3);
   }

   public boolean a(dt var1, dt var2) {
      return this.a(var1, var2, true);
   }

   public boolean a(dt var1, dt var2, boolean var3) {
      return this.a(var1.n(), var1.o(), var1.p(), var2.n(), var2.o(), var2.p(), var3);
   }

   public boolean a(bjb var1) {
      return this.b(var1, true);
   }

   public boolean b(bjb var1, boolean var2) {
      return this.a(var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var2);
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if(var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for(int var8 = var1; var8 <= var4; ++var8) {
            for(int var9 = var3; var9 <= var6; ++var9) {
               if(!this.a(var8, var9, var7)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(int var1, int var2, boolean var3) {
      return this.v.a(var1, var2) && (var3 || !this.v.d(var1, var2).f());
   }

   public bfh f(dt var1) {
      return this.a(var1.n() >> 4, var1.p() >> 4);
   }

   public bfh a(int var1, int var2) {
      return this.v.d(var1, var2);
   }

   public boolean a(dt var1, bec var2, int var3) {
      if(!this.a(var1)) {
         return false;
      } else if(!this.D && this.x.u() == are.g) {
         return false;
      } else {
         bfh var4 = this.f(var1);
         atr var5 = var2.c();
         bec var6 = var4.a(var1, var2);
         if(var6 == null) {
            return false;
         } else {
            atr var7 = var6.c();
            if(var5.n() != var7.n() || var5.p() != var7.p()) {
               this.B.a("checkLight");
               this.x(var1);
               this.B.b();
            }

            if((var3 & 2) != 0 && (!this.D || (var3 & 4) == 0) && var4.i()) {
               this.h(var1);
            }

            if(!this.D && (var3 & 1) != 0) {
               this.b(var1, var6.c());
               if(var5.N()) {
                  this.e(var1, var5);
               }
            }

            return true;
         }
      }
   }

   public boolean g(dt var1) {
      return this.a(var1, aty.a.P(), 3);
   }

   public boolean b(dt var1, boolean var2) {
      bec var3 = this.p(var1);
      atr var4 = var3.c();
      if(var4.r() == bof.a) {
         return false;
      } else {
         this.b(2001, var1, atr.f(var3));
         if(var2) {
            var4.b(this, var1, var3, 0);
         }

         return this.a(var1, aty.a.P(), 3);
      }
   }

   public boolean a(dt var1, bec var2) {
      return this.a(var1, var2, 3);
   }

   public void h(dt var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((ara)this.u.get(var2)).a(var1);
      }

   }

   public void b(dt var1, atr var2) {
      if(this.x.u() != are.g) {
         this.c(var1, var2);
      }

   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5;
      if(var3 > var4) {
         var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if(!this.t.o()) {
         for(var5 = var3; var5 <= var4; ++var5) {
            this.c(arf.a, new dt(var1, var5, var2));
         }
      }

      this.b(var1, var3, var2, var1, var4, var2);
   }

   public void b(dt var1, dt var2) {
      this.b(var1.n(), var1.o(), var1.p(), var2.n(), var2.o(), var2.p());
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.u.size(); ++var7) {
         ((ara)this.u.get(var7)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public void c(dt var1, atr var2) {
      this.d(var1.e(), var2);
      this.d(var1.f(), var2);
      this.d(var1.b(), var2);
      this.d(var1.a(), var2);
      this.d(var1.c(), var2);
      this.d(var1.d(), var2);
   }

   public void a(dt var1, atr var2, ej var3) {
      if(var3 != ej.e) {
         this.d(var1.e(), var2);
      }

      if(var3 != ej.f) {
         this.d(var1.f(), var2);
      }

      if(var3 != ej.a) {
         this.d(var1.b(), var2);
      }

      if(var3 != ej.b) {
         this.d(var1.a(), var2);
      }

      if(var3 != ej.c) {
         this.d(var1.c(), var2);
      }

      if(var3 != ej.d) {
         this.d(var1.d(), var2);
      }

   }

   public void d(dt var1, atr var2) {
      if(!this.D) {
         bec var3 = this.p(var1);

         try {
            var3.c().a(this, var1, var3, var2);
         } catch (Throwable var7) {
            b var5 = b.a(var7, "Exception while updating neighbours");
            j var6 = var5.a("Block being updated");
            var6.a("Source block type", (Callable)(new aqw(this, var2)));
            j.a(var6, var1, var3);
            throw new u(var5);
         }
      }
   }

   public boolean a(dt var1, atr var2) {
      return false;
   }

   public boolean i(dt var1) {
      return this.f(var1).d(var1);
   }

   public boolean j(dt var1) {
      if(var1.o() >= 63) {
         return this.i(var1);
      } else {
         dt var2 = new dt(var1.n(), 63, var1.p());
         if(!this.i(var2)) {
            return false;
         } else {
            for(var2 = var2.b(); var2.o() > var1.o(); var2 = var2.b()) {
               atr var3 = this.p(var2).c();
               if(var3.n() > 0 && !var3.r().d()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public int k(dt var1) {
      if(var1.o() < 0) {
         return 0;
      } else {
         if(var1.o() >= 256) {
            var1 = new dt(var1.n(), 255, var1.p());
         }

         return this.f(var1).a(var1, 0);
      }
   }

   public int l(dt var1) {
      return this.c(var1, true);
   }

   public int c(dt var1, boolean var2) {
      if(var1.n() >= -30000000 && var1.p() >= -30000000 && var1.n() < 30000000 && var1.p() < 30000000) {
         if(var2 && this.p(var1).c().q()) {
            int var8 = this.c(var1.a(), false);
            int var4 = this.c(var1.f(), false);
            int var5 = this.c(var1.e(), false);
            int var6 = this.c(var1.d(), false);
            int var7 = this.c(var1.c(), false);
            if(var4 > var8) {
               var8 = var4;
            }

            if(var5 > var8) {
               var8 = var5;
            }

            if(var6 > var8) {
               var8 = var6;
            }

            if(var7 > var8) {
               var8 = var7;
            }

            return var8;
         } else if(var1.o() < 0) {
            return 0;
         } else {
            if(var1.o() >= 256) {
               var1 = new dt(var1.n(), 255, var1.p());
            }

            bfh var3 = this.f(var1);
            return var3.a(var1, this.d);
         }
      } else {
         return 15;
      }
   }

   public dt m(dt var1) {
      int var2;
      if(var1.n() >= -30000000 && var1.p() >= -30000000 && var1.n() < 30000000 && var1.p() < 30000000) {
         if(this.a(var1.n() >> 4, var1.p() >> 4, true)) {
            var2 = this.a(var1.n() >> 4, var1.p() >> 4).b(var1.n() & 15, var1.p() & 15);
         } else {
            var2 = 0;
         }
      } else {
         var2 = 64;
      }

      return new dt(var1.n(), var2, var1.p());
   }

   public int b(int var1, int var2) {
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(!this.a(var1 >> 4, var2 >> 4, true)) {
            return 0;
         } else {
            bfh var3 = this.a(var1 >> 4, var2 >> 4);
            return var3.v();
         }
      } else {
         return 64;
      }
   }

   public int b(arf var1, dt var2) {
      if(var2.o() < 0) {
         var2 = new dt(var2.n(), 0, var2.p());
      }

      if(!this.a(var2)) {
         return var1.c;
      } else if(!this.e(var2)) {
         return var1.c;
      } else {
         bfh var3 = this.f(var2);
         return var3.a(var1, var2);
      }
   }

   public void a(arf var1, dt var2, int var3) {
      if(this.a(var2)) {
         if(this.e(var2)) {
            bfh var4 = this.f(var2);
            var4.a(var1, var2, var3);
            this.n(var2);
         }
      }
   }

   public void n(dt var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((ara)this.u.get(var2)).b(var1);
      }

   }

   public float o(dt var1) {
      return this.t.p()[this.l(var1)];
   }

   public bec p(dt var1) {
      if(!this.a(var1)) {
         return aty.a.P();
      } else {
         bfh var2 = this.f(var1);
         return var2.g(var1);
      }
   }

   public boolean w() {
      return this.d < 4;
   }

   public bru a(brw var1, brw var2) {
      return this.a(var1, var2, false, false, false);
   }

   public bru a(brw var1, brw var2, boolean var3) {
      return this.a(var1, var2, var3, false, false);
   }

   public bru a(brw var1, brw var2, boolean var3, boolean var4, boolean var5) {
      if(!Double.isNaN(var1.a) && !Double.isNaN(var1.b) && !Double.isNaN(var1.c)) {
         if(!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
            int var6 = uv.c(var2.a);
            int var7 = uv.c(var2.b);
            int var8 = uv.c(var2.c);
            int var9 = uv.c(var1.a);
            int var10 = uv.c(var1.b);
            int var11 = uv.c(var1.c);
            dt var12 = new dt(var9, var10, var11);
            new dt(var6, var7, var8);
            bec var14 = this.p(var12);
            atr var15 = var14.c();
            if((!var4 || var15.a(this, var12, var14) != null) && var15.a(var14, var3)) {
               bru var16 = var15.a(this, var12, var1, var2);
               if(var16 != null) {
                  return var16;
               }
            }

            bru var41 = null;
            int var42 = 200;

            while(var42-- >= 0) {
               if(Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
                  return null;
               }

               if(var9 == var6 && var10 == var7 && var11 == var8) {
                  return var5?var41:null;
               }

               boolean var43 = true;
               boolean var17 = true;
               boolean var18 = true;
               double var19 = 999.0D;
               double var21 = 999.0D;
               double var23 = 999.0D;
               if(var6 > var9) {
                  var19 = (double)var9 + 1.0D;
               } else if(var6 < var9) {
                  var19 = (double)var9 + 0.0D;
               } else {
                  var43 = false;
               }

               if(var7 > var10) {
                  var21 = (double)var10 + 1.0D;
               } else if(var7 < var10) {
                  var21 = (double)var10 + 0.0D;
               } else {
                  var17 = false;
               }

               if(var8 > var11) {
                  var23 = (double)var11 + 1.0D;
               } else if(var8 < var11) {
                  var23 = (double)var11 + 0.0D;
               } else {
                  var18 = false;
               }

               double var25 = 999.0D;
               double var27 = 999.0D;
               double var29 = 999.0D;
               double var31 = var2.a - var1.a;
               double var33 = var2.b - var1.b;
               double var35 = var2.c - var1.c;
               if(var43) {
                  var25 = (var19 - var1.a) / var31;
               }

               if(var17) {
                  var27 = (var21 - var1.b) / var33;
               }

               if(var18) {
                  var29 = (var23 - var1.c) / var35;
               }

               if(var25 == -0.0D) {
                  var25 = -1.0E-4D;
               }

               if(var27 == -0.0D) {
                  var27 = -1.0E-4D;
               }

               if(var29 == -0.0D) {
                  var29 = -1.0E-4D;
               }

               ej var37;
               if(var25 < var27 && var25 < var29) {
                  var37 = var6 > var9?ej.e:ej.f;
                  var1 = new brw(var19, var1.b + var33 * var25, var1.c + var35 * var25);
               } else if(var27 < var29) {
                  var37 = var7 > var10?ej.a:ej.b;
                  var1 = new brw(var1.a + var31 * var27, var21, var1.c + var35 * var27);
               } else {
                  var37 = var8 > var11?ej.c:ej.d;
                  var1 = new brw(var1.a + var31 * var29, var1.b + var33 * var29, var23);
               }

               var9 = uv.c(var1.a) - (var37 == ej.f?1:0);
               var10 = uv.c(var1.b) - (var37 == ej.b?1:0);
               var11 = uv.c(var1.c) - (var37 == ej.d?1:0);
               var12 = new dt(var9, var10, var11);
               bec var38 = this.p(var12);
               atr var39 = var38.c();
               if(!var4 || var39.a(this, var12, var38) != null) {
                  if(var39.a(var38, var3)) {
                     bru var40 = var39.a(this, var12, var1, var2);
                     if(var40 != null) {
                        return var40;
                     }
                  } else {
                     var41 = new bru(brv.a, var1, var37, var12);
                  }
               }
            }

            return var5?var41:null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(wv var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((ara)this.u.get(var5)).a(var2, var1.s, var1.t, var1.u, var3, var4);
      }

   }

   public void a(ahd var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((ara)this.u.get(var5)).a(var1, var2, var1.s, var1.t, var1.u, var3, var4);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for(int var10 = 0; var10 < this.u.size(); ++var10) {
         ((ara)this.u.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {}

   public void a(dt var1, String var2) {
      for(int var3 = 0; var3 < this.u.size(); ++var3) {
         ((ara)this.u.get(var3)).a(var2, var1);
      }

   }

   public void a(ew var1, double var2, double var4, double var6, double var8, double var10, double var12, int ... var14) {
      this.a(var1.c(), var1.e(), var2, var4, var6, var8, var10, var12, var14);
   }

   private void a(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int ... var15) {
      for(int var16 = 0; var16 < this.u.size(); ++var16) {
         ((ara)this.u.get(var16)).a(var1, var2, var3, var5, var7, var9, var11, var13, var15);
      }

   }

   public boolean c(wv var1) {
      this.k.add(var1);
      return true;
   }

   public boolean d(wv var1) {
      int var2 = uv.c(var1.s / 16.0D);
      int var3 = uv.c(var1.u / 16.0D);
      boolean var4 = var1.n;
      if(var1 instanceof ahd) {
         var4 = true;
      }

      if(!var4 && !this.a(var2, var3, true)) {
         return false;
      } else {
         if(var1 instanceof ahd) {
            ahd var5 = (ahd)var1;
            this.j.add(var5);
            this.d();
         }

         this.a(var2, var3).a(var1);
         this.f.add(var1);
         this.a(var1);
         return true;
      }
   }

   protected void a(wv var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((ara)this.u.get(var2)).a(var1);
      }

   }

   protected void b(wv var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((ara)this.u.get(var2)).b(var1);
      }

   }

   public void e(wv var1) {
      if(var1.l != null) {
         var1.l.a((wv)null);
      }

      if(var1.m != null) {
         var1.a((wv)null);
      }

      var1.J();
      if(var1 instanceof ahd) {
         this.j.remove(var1);
         this.d();
         this.b(var1);
      }

   }

   public void f(wv var1) {
      var1.J();
      if(var1 instanceof ahd) {
         this.j.remove(var1);
         this.d();
      }

      int var2 = var1.ae;
      int var3 = var1.ag;
      if(var1.ad && this.a(var2, var3, true)) {
         this.a(var2, var3).b(var1);
      }

      this.f.remove(var1);
      this.b(var1);
   }

   public void a(ara var1) {
      this.u.add(var1);
   }

   public List a(wv var1, brt var2) {
      ArrayList var3 = Lists.newArrayList();
      int var4 = uv.c(var2.a);
      int var5 = uv.c(var2.d + 1.0D);
      int var6 = uv.c(var2.b);
      int var7 = uv.c(var2.e + 1.0D);
      int var8 = uv.c(var2.c);
      int var9 = uv.c(var2.f + 1.0D);

      for(int var10 = var4; var10 < var5; ++var10) {
         for(int var11 = var8; var11 < var9; ++var11) {
            if(this.e(new dt(var10, 64, var11))) {
               for(int var12 = var6 - 1; var12 < var7; ++var12) {
                  dt var13 = new dt(var10, var12, var11);
                  boolean var14 = var1.aS();
                  boolean var15 = this.a(this.af(), var1);
                  if(var14 && var15) {
                     var1.h(false);
                  } else if(!var14 && !var15) {
                     var1.h(true);
                  }

                  bec var16;
                  if(!this.af().a(var13) && var15) {
                     var16 = aty.b.P();
                  } else {
                     var16 = this.p(var13);
                  }

                  var16.c().a(this, var13, var16, var2, var3, var1);
               }
            }
         }
      }

      double var17 = 0.25D;
      List var18 = this.b(var1, var2.b(var17, var17, var17));

      for(int var19 = 0; var19 < var18.size(); ++var19) {
         if(var1.l != var18 && var1.m != var18) {
            brt var20 = ((wv)var18.get(var19)).S();
            if(var20 != null && var20.b(var2)) {
               var3.add(var20);
            }

            var20 = var1.j((wv)var18.get(var19));
            if(var20 != null && var20.b(var2)) {
               var3.add(var20);
            }
         }
      }

      return var3;
   }

   public boolean a(bfb var1, wv var2) {
      double var3 = var1.b();
      double var5 = var1.c();
      double var7 = var1.d();
      double var9 = var1.e();
      if(var2.aS()) {
         ++var3;
         ++var5;
         --var7;
         --var9;
      } else {
         --var3;
         --var5;
         ++var7;
         ++var9;
      }

      return var2.s > var3 && var2.s < var7 && var2.u > var5 && var2.u < var9;
   }

   public List a(brt var1) {
      ArrayList var2 = Lists.newArrayList();
      int var3 = uv.c(var1.a);
      int var4 = uv.c(var1.d + 1.0D);
      int var5 = uv.c(var1.b);
      int var6 = uv.c(var1.e + 1.0D);
      int var7 = uv.c(var1.c);
      int var8 = uv.c(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if(this.e(new dt(var9, 64, var10))) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  dt var13 = new dt(var9, var11, var10);
                  bec var12;
                  if(var9 >= -30000000 && var9 < 30000000 && var10 >= -30000000 && var10 < 30000000) {
                     var12 = this.p(var13);
                  } else {
                     var12 = aty.h.P();
                  }

                  var12.c().a(this, var13, var12, var1, var2, (wv)null);
               }
            }
         }
      }

      return var2;
   }

   public int a(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (uv.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      var3 = uv.a(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.j(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.h(var1) * 5.0F) / 16.0D));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float c(float var1) {
      return this.t.a(this.x.g(), var1);
   }

   public float y() {
      return bgd.a[this.t.a(this.x.g())];
   }

   public float d(float var1) {
      float var2 = this.c(var1);
      return var2 * 3.1415927F * 2.0F;
   }

   public dt q(dt var1) {
      return this.f(var1).h(var1);
   }

   public dt r(dt var1) {
      bfh var2 = this.f(var1);

      dt var3;
      dt var4;
      for(var3 = new dt(var1.n(), var2.g() + 16, var1.p()); var3.o() >= 0; var3 = var4) {
         var4 = var3.b();
         bof var5 = var2.a(var4).r();
         if(var5.c() && var5 != bof.j) {
            break;
         }
      }

      return var3;
   }

   public void a(dt var1, atr var2, int var3) {}

   public void a(dt var1, atr var2, int var3, int var4) {}

   public void b(dt var1, atr var2, int var3, int var4) {}

   public void i() {
      this.B.a("entities");
      this.B.a("global");

      int var1;
      wv var2;
      b var4;
      j var5;
      for(var1 = 0; var1 < this.k.size(); ++var1) {
         var2 = (wv)this.k.get(var1);

         try {
            ++var2.W;
            var2.s_();
         } catch (Throwable var9) {
            var4 = b.a(var9, "Ticking entity");
            var5 = var4.a("Entity being ticked");
            if(var2 == null) {
               var5.a("Entity", (Object)"~~NULL~~");
            } else {
               var2.a(var5);
            }

            throw new u(var4);
         }

         if(var2.I) {
            this.k.remove(var1--);
         }
      }

      this.B.c("remove");
      this.f.removeAll(this.g);

      int var3;
      int var15;
      for(var1 = 0; var1 < this.g.size(); ++var1) {
         var2 = (wv)this.g.get(var1);
         var3 = var2.ae;
         var15 = var2.ag;
         if(var2.ad && this.a(var3, var15, true)) {
            this.a(var3, var15).b(var2);
         }
      }

      for(var1 = 0; var1 < this.g.size(); ++var1) {
         this.b((wv)this.g.get(var1));
      }

      this.g.clear();
      this.B.c("regular");

      for(var1 = 0; var1 < this.f.size(); ++var1) {
         var2 = (wv)this.f.get(var1);
         if(var2.m != null) {
            if(!var2.m.I && var2.m.l == var2) {
               continue;
            }

            var2.m.l = null;
            var2.m = null;
         }

         this.B.a("tick");
         if(!var2.I) {
            try {
               this.g(var2);
            } catch (Throwable var8) {
               var4 = b.a(var8, "Ticking entity");
               var5 = var4.a("Entity being ticked");
               var2.a(var5);
               throw new u(var4);
            }
         }

         this.B.b();
         this.B.a("remove");
         if(var2.I) {
            var3 = var2.ae;
            var15 = var2.ag;
            if(var2.ad && this.a(var3, var15, true)) {
               this.a(var3, var15).b(var2);
            }

            this.f.remove(var1--);
            this.b(var2);
         }

         this.B.b();
      }

      this.B.c("blockEntities");
      this.L = true;
      Iterator var10 = this.i.iterator();

      while(var10.hasNext()) {
         bcm var11 = (bcm)var10.next();
         if(!var11.x() && var11.t()) {
            dt var13 = var11.v();
            if(this.e(var13) && this.M.a(var13)) {
               try {
                  ((pm)var11).c();
               } catch (Throwable var7) {
                  b var16 = b.a(var7, "Ticking block entity");
                  j var6 = var16.a("Block entity being ticked");
                  var11.a(var6);
                  throw new u(var16);
               }
            }
         }

         if(var11.x()) {
            var10.remove();
            this.h.remove(var11);
            if(this.e(var11.v())) {
               this.f(var11.v()).e(var11.v());
            }
         }
      }

      this.L = false;
      if(!this.b.isEmpty()) {
         this.i.removeAll(this.b);
         this.h.removeAll(this.b);
         this.b.clear();
      }

      this.B.c("pendingBlockEntities");
      if(!this.a.isEmpty()) {
         for(int var12 = 0; var12 < this.a.size(); ++var12) {
            bcm var14 = (bcm)this.a.get(var12);
            if(!var14.x()) {
               if(!this.h.contains(var14)) {
                  this.a(var14);
               }

               if(this.e(var14.v())) {
                  this.f(var14.v()).a(var14.v(), var14);
               }

               this.h(var14.v());
            }
         }

         this.a.clear();
      }

      this.B.b();
      this.B.b();
   }

   public boolean a(bcm var1) {
      boolean var2 = this.h.add(var1);
      if(var2 && var1 instanceof pm) {
         this.i.add(var1);
      }

      return var2;
   }

   public void a(Collection var1) {
      if(this.L) {
         this.a.addAll(var1);
      } else {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            bcm var3 = (bcm)var2.next();
            this.h.add(var3);
            if(var3 instanceof pm) {
               this.i.add(var3);
            }
         }
      }

   }

   public void g(wv var1) {
      this.a(var1, true);
   }

   public void a(wv var1, boolean var2) {
      int var3 = uv.c(var1.s);
      int var4 = uv.c(var1.u);
      byte var5 = 32;
      if(!var2 || this.a(var3 - var5, 0, var4 - var5, var3 + var5, 0, var4 + var5, true)) {
         var1.P = var1.s;
         var1.Q = var1.t;
         var1.R = var1.u;
         var1.A = var1.y;
         var1.B = var1.z;
         if(var2 && var1.ad) {
            ++var1.W;
            if(var1.m != null) {
               var1.ak();
            } else {
               var1.s_();
            }
         }

         this.B.a("chunkCheck");
         if(Double.isNaN(var1.s) || Double.isInfinite(var1.s)) {
            var1.s = var1.P;
         }

         if(Double.isNaN(var1.t) || Double.isInfinite(var1.t)) {
            var1.t = var1.Q;
         }

         if(Double.isNaN(var1.u) || Double.isInfinite(var1.u)) {
            var1.u = var1.R;
         }

         if(Double.isNaN((double)var1.z) || Double.isInfinite((double)var1.z)) {
            var1.z = var1.B;
         }

         if(Double.isNaN((double)var1.y) || Double.isInfinite((double)var1.y)) {
            var1.y = var1.A;
         }

         int var6 = uv.c(var1.s / 16.0D);
         int var7 = uv.c(var1.t / 16.0D);
         int var8 = uv.c(var1.u / 16.0D);
         if(!var1.ad || var1.ae != var6 || var1.af != var7 || var1.ag != var8) {
            if(var1.ad && this.a(var1.ae, var1.ag, true)) {
               this.a(var1.ae, var1.ag).a(var1, var1.af);
            }

            if(this.a(var6, var8, true)) {
               var1.ad = true;
               this.a(var6, var8).a(var1);
            } else {
               var1.ad = false;
            }
         }

         this.B.b();
         if(var2 && var1.ad && var1.l != null) {
            if(!var1.l.I && var1.l.m == var1) {
               this.g(var1.l);
            } else {
               var1.l.m = null;
               var1.l = null;
            }
         }

      }
   }

   public boolean b(brt var1) {
      return this.a(var1, (wv)null);
   }

   public boolean a(brt var1, wv var2) {
      List var3 = this.b((wv)null, var1);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         wv var5 = (wv)var3.get(var4);
         if(!var5.I && var5.k && var5 != var2 && (var2 == null || var2.m != var5 && var2.l != var5)) {
            return false;
         }
      }

      return true;
   }

   public boolean c(brt var1) {
      int var2 = uv.c(var1.a);
      int var3 = uv.c(var1.d);
      int var4 = uv.c(var1.b);
      int var5 = uv.c(var1.e);
      int var6 = uv.c(var1.c);
      int var7 = uv.c(var1.f);

      for(int var8 = var2; var8 <= var3; ++var8) {
         for(int var9 = var4; var9 <= var5; ++var9) {
            for(int var10 = var6; var10 <= var7; ++var10) {
               atr var11 = this.p(new dt(var8, var9, var10)).c();
               if(var11.r() != bof.a) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean d(brt var1) {
      int var2 = uv.c(var1.a);
      int var3 = uv.c(var1.d);
      int var4 = uv.c(var1.b);
      int var5 = uv.c(var1.e);
      int var6 = uv.c(var1.c);
      int var7 = uv.c(var1.f);

      for(int var8 = var2; var8 <= var3; ++var8) {
         for(int var9 = var4; var9 <= var5; ++var9) {
            for(int var10 = var6; var10 <= var7; ++var10) {
               atr var11 = this.p(new dt(var8, var9, var10)).c();
               if(var11.r().d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean e(brt var1) {
      int var2 = uv.c(var1.a);
      int var3 = uv.c(var1.d + 1.0D);
      int var4 = uv.c(var1.b);
      int var5 = uv.c(var1.e + 1.0D);
      int var6 = uv.c(var1.c);
      int var7 = uv.c(var1.f + 1.0D);
      if(this.a(var2, var4, var6, var3, var5, var7, true)) {
         for(int var8 = var2; var8 < var3; ++var8) {
            for(int var9 = var4; var9 < var5; ++var9) {
               for(int var10 = var6; var10 < var7; ++var10) {
                  atr var11 = this.p(new dt(var8, var9, var10)).c();
                  if(var11 == aty.ab || var11 == aty.k || var11 == aty.l) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public boolean a(brt var1, bof var2, wv var3) {
      int var4 = uv.c(var1.a);
      int var5 = uv.c(var1.d + 1.0D);
      int var6 = uv.c(var1.b);
      int var7 = uv.c(var1.e + 1.0D);
      int var8 = uv.c(var1.c);
      int var9 = uv.c(var1.f + 1.0D);
      if(!this.a(var4, var6, var8, var5, var7, var9, true)) {
         return false;
      } else {
         boolean var10 = false;
         brw var11 = new brw(0.0D, 0.0D, 0.0D);

         for(int var12 = var4; var12 < var5; ++var12) {
            for(int var13 = var6; var13 < var7; ++var13) {
               for(int var14 = var8; var14 < var9; ++var14) {
                  dt var15 = new dt(var12, var13, var14);
                  bec var16 = this.p(var15);
                  atr var17 = var16.c();
                  if(var17.r() == var2) {
                     double var18 = (double)((float)(var13 + 1) - axl.b(((Integer)var16.b(axl.b)).intValue()));
                     if((double)var7 >= var18) {
                        var10 = true;
                        var11 = var17.a(this, var15, var3, var11);
                     }
                  }
               }
            }
         }

         if(var11.b() > 0.0D && var3.aK()) {
            var11 = var11.a();
            double var20 = 0.014D;
            var3.v += var11.a * var20;
            var3.w += var11.b * var20;
            var3.x += var11.c * var20;
         }

         return var10;
      }
   }

   public boolean a(brt var1, bof var2) {
      int var3 = uv.c(var1.a);
      int var4 = uv.c(var1.d + 1.0D);
      int var5 = uv.c(var1.b);
      int var6 = uv.c(var1.e + 1.0D);
      int var7 = uv.c(var1.c);
      int var8 = uv.c(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               if(this.p(new dt(var9, var10, var11)).c().r() == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(brt var1, bof var2) {
      int var3 = uv.c(var1.a);
      int var4 = uv.c(var1.d + 1.0D);
      int var5 = uv.c(var1.b);
      int var6 = uv.c(var1.e + 1.0D);
      int var7 = uv.c(var1.c);
      int var8 = uv.c(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               dt var12 = new dt(var9, var10, var11);
               bec var13 = this.p(var12);
               atr var14 = var13.c();
               if(var14.r() == var2) {
                  int var15 = ((Integer)var13.b(axl.b)).intValue();
                  double var16 = (double)(var10 + 1);
                  if(var15 < 8) {
                     var16 = (double)(var10 + 1) - (double)var15 / 8.0D;
                  }

                  if(var16 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public aqo a(wv var1, double var2, double var4, double var6, float var8, boolean var9) {
      return this.a(var1, var2, var4, var6, var8, false, var9);
   }

   public aqo a(wv var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      aqo var11 = new aqo(this, var1, var2, var4, var6, var8, var9, var10);
      var11.a();
      var11.a(true);
      return var11;
   }

   public float a(brw var1, brt var2) {
      double var3 = 1.0D / ((var2.d - var2.a) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.e - var2.b) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.f - var2.c) * 2.0D + 1.0D);
      if(var3 >= 0.0D && var5 >= 0.0D && var7 >= 0.0D) {
         int var9 = 0;
         int var10 = 0;

         for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
            for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
               for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
                  double var14 = var2.a + (var2.d - var2.a) * (double)var11;
                  double var16 = var2.b + (var2.e - var2.b) * (double)var12;
                  double var18 = var2.c + (var2.f - var2.c) * (double)var13;
                  if(this.a(new brw(var14, var16, var18), var1) == null) {
                     ++var9;
                  }

                  ++var10;
               }
            }
         }

         return (float)var9 / (float)var10;
      } else {
         return 0.0F;
      }
   }

   public boolean a(ahd var1, dt var2, ej var3) {
      var2 = var2.a(var3);
      if(this.p(var2).c() == aty.ab) {
         this.a(var1, 1004, var2, 0);
         this.g(var2);
         return true;
      } else {
         return false;
      }
   }

   public bcm s(dt var1) {
      if(!this.a(var1)) {
         return null;
      } else {
         bcm var2 = null;
         int var3;
         bcm var4;
         if(this.L) {
            for(var3 = 0; var3 < this.a.size(); ++var3) {
               var4 = (bcm)this.a.get(var3);
               if(!var4.x() && var4.v().equals(var1)) {
                  var2 = var4;
                  break;
               }
            }
         }

         if(var2 == null) {
            var2 = this.f(var1).a(var1, bfl.a);
         }

         if(var2 == null) {
            for(var3 = 0; var3 < this.a.size(); ++var3) {
               var4 = (bcm)this.a.get(var3);
               if(!var4.x() && var4.v().equals(var1)) {
                  var2 = var4;
                  break;
               }
            }
         }

         return var2;
      }
   }

   public void a(dt var1, bcm var2) {
      if(var2 != null && !var2.x()) {
         if(this.L) {
            var2.a(var1);
            Iterator var3 = this.a.iterator();

            while(var3.hasNext()) {
               bcm var4 = (bcm)var3.next();
               if(var4.v().equals(var1)) {
                  var4.y();
                  var3.remove();
               }
            }

            this.a.add(var2);
         } else {
            this.a(var2);
            this.f(var1).a(var1, var2);
         }
      }

   }

   public void t(dt var1) {
      bcm var2 = this.s(var1);
      if(var2 != null && this.L) {
         var2.y();
         this.a.remove(var2);
      } else {
         if(var2 != null) {
            this.a.remove(var2);
            this.h.remove(var2);
            this.i.remove(var2);
         }

         this.f(var1).e(var1);
      }

   }

   public void b(bcm var1) {
      this.b.add(var1);
   }

   public boolean u(dt var1) {
      bec var2 = this.p(var1);
      brt var3 = var2.c().a(this, var1, var2);
      return var3 != null && var3.a() >= 1.0D;
   }

   public static boolean a(ard var0, dt var1) {
      bec var2 = var0.p(var1);
      atr var3 = var2.c();
      return var3.r().k() && var3.d()?true:(var3 instanceof bat?var2.b(bat.b) == bau.a:(var3 instanceof awq?var2.b(awq.a) == awr.a:(var3 instanceof awx?true:(var3 instanceof bao?((Integer)var2.b(bao.a)).intValue() == 7:false))));
   }

   public boolean d(dt var1, boolean var2) {
      if(!this.a(var1)) {
         return var2;
      } else {
         bfh var3 = this.v.a(var1);
         if(var3.f()) {
            return var2;
         } else {
            atr var4 = this.p(var1).c();
            return var4.r().k() && var4.d();
         }
      }
   }

   public void B() {
      int var1 = this.a(1.0F);
      if(var1 != this.d) {
         this.d = var1;
      }

   }

   public void a(boolean var1, boolean var2) {
      this.F = var1;
      this.G = var2;
   }

   public void c() {
      this.p();
   }

   protected void C() {
      if(this.x.p()) {
         this.p = 1.0F;
         if(this.x.n()) {
            this.r = 1.0F;
         }
      }

   }

   protected void p() {
      if(!this.t.o()) {
         if(!this.D) {
            int var1 = this.x.A();
            if(var1 > 0) {
               --var1;
               this.x.i(var1);
               this.x.f(this.x.n()?1:2);
               this.x.g(this.x.p()?1:2);
            }

            int var2 = this.x.o();
            if(var2 <= 0) {
               if(this.x.n()) {
                  this.x.f(this.s.nextInt(12000) + 3600);
               } else {
                  this.x.f(this.s.nextInt(168000) + 12000);
               }
            } else {
               --var2;
               this.x.f(var2);
               if(var2 <= 0) {
                  this.x.a(!this.x.n());
               }
            }

            this.q = this.r;
            if(this.x.n()) {
               this.r = (float)((double)this.r + 0.01D);
            } else {
               this.r = (float)((double)this.r - 0.01D);
            }

            this.r = uv.a(this.r, 0.0F, 1.0F);
            int var3 = this.x.q();
            if(var3 <= 0) {
               if(this.x.p()) {
                  this.x.g(this.s.nextInt(12000) + 12000);
               } else {
                  this.x.g(this.s.nextInt(168000) + 12000);
               }
            } else {
               --var3;
               this.x.g(var3);
               if(var3 <= 0) {
                  this.x.b(!this.x.p());
               }
            }

            this.o = this.p;
            if(this.x.p()) {
               this.p = (float)((double)this.p + 0.01D);
            } else {
               this.p = (float)((double)this.p - 0.01D);
            }

            this.p = uv.a(this.p, 0.0F, 1.0F);
         }
      }
   }

   protected void D() {
      this.E.clear();
      this.B.a("buildList");

      int var1;
      ahd var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < this.j.size(); ++var1) {
         var2 = (ahd)this.j.get(var1);
         var3 = uv.c(var2.s / 16.0D);
         var4 = uv.c(var2.u / 16.0D);
         var5 = this.q();

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               this.E.add(new aqm(var6 + var3, var7 + var4));
            }
         }
      }

      this.B.b();
      if(this.K > 0) {
         --this.K;
      }

      this.B.a("playerCheckLight");
      if(!this.j.isEmpty()) {
         var1 = this.s.nextInt(this.j.size());
         var2 = (ahd)this.j.get(var1);
         var3 = uv.c(var2.s) + this.s.nextInt(11) - 5;
         var4 = uv.c(var2.t) + this.s.nextInt(11) - 5;
         var5 = uv.c(var2.u) + this.s.nextInt(11) - 5;
         this.x(new dt(var3, var4, var5));
      }

      this.B.b();
   }

   protected abstract int q();

   protected void a(int var1, int var2, bfh var3) {
      this.B.c("moodSound");
      if(this.K == 0 && !this.D) {
         this.m = this.m * 3 + 1013904223;
         int var4 = this.m >> 2;
         int var5 = var4 & 15;
         int var6 = var4 >> 8 & 15;
         int var7 = var4 >> 16 & 255;
         dt var8 = new dt(var5, var7, var6);
         atr var9 = var3.a(var8);
         var5 += var1;
         var6 += var2;
         if(var9.r() == bof.a && this.k(var8) <= this.s.nextInt(8) && this.b(arf.a, var8) <= 0) {
            ahd var10 = this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, 8.0D);
            if(var10 != null && var10.e((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D) > 4.0D) {
               this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.s.nextFloat() * 0.2F);
               this.K = this.s.nextInt(12000) + 6000;
            }
         }
      }

      this.B.c("checkLight");
      var3.m();
   }

   protected void h() {
      this.D();
   }

   public void a(atr var1, dt var2, Random var3) {
      this.e = true;
      var1.b(this, var2, this.p(var2), var3);
      this.e = false;
   }

   public boolean v(dt var1) {
      return this.e(var1, false);
   }

   public boolean w(dt var1) {
      return this.e(var1, true);
   }

   public boolean e(dt var1, boolean var2) {
      arm var3 = this.b(var1);
      float var4 = var3.a(var1);
      if(var4 > 0.15F) {
         return false;
      } else {
         if(var1.o() >= 0 && var1.o() < 256 && this.b(arf.b, var1) < 10) {
            bec var5 = this.p(var1);
            atr var6 = var5.c();
            if((var6 == aty.j || var6 == aty.i) && ((Integer)var5.b(axl.b)).intValue() == 0) {
               if(!var2) {
                  return true;
               }

               boolean var7 = this.F(var1.e()) && this.F(var1.f()) && this.F(var1.c()) && this.F(var1.d());
               if(!var7) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private boolean F(dt var1) {
      return this.p(var1).c().r() == bof.h;
   }

   public boolean f(dt var1, boolean var2) {
      arm var3 = this.b(var1);
      float var4 = var3.a(var1);
      if(var4 > 0.15F) {
         return false;
      } else if(!var2) {
         return true;
      } else {
         if(var1.o() >= 0 && var1.o() < 256 && this.b(arf.b, var1) < 10) {
            atr var5 = this.p(var1).c();
            if(var5.r() == bof.a && aty.aH.c(this, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean x(dt var1) {
      boolean var2 = false;
      if(!this.t.o()) {
         var2 |= this.c(arf.a, var1);
      }

      var2 |= this.c(arf.b, var1);
      return var2;
   }

   private int a(dt var1, arf var2) {
      if(var2 == arf.a && this.i(var1)) {
         return 15;
      } else {
         atr var3 = this.p(var1).c();
         int var4 = var2 == arf.a?0:var3.p();
         int var5 = var3.n();
         if(var5 >= 15 && var3.p() > 0) {
            var5 = 1;
         }

         if(var5 < 1) {
            var5 = 1;
         }

         if(var5 >= 15) {
            return 0;
         } else if(var4 >= 14) {
            return var4;
         } else {
            ej[] var6 = ej.values();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               ej var9 = var6[var8];
               dt var10 = var1.a(var9);
               int var11 = this.b(var2, var10) - var5;
               if(var11 > var4) {
                  var4 = var11;
               }

               if(var4 >= 14) {
                  return var4;
               }
            }

            return var4;
         }
      }
   }

   public boolean c(arf var1, dt var2) {
      if(!this.a(var2, 17, false)) {
         return false;
      } else {
         int var3 = 0;
         int var4 = 0;
         this.B.a("getBrightness");
         int var5 = this.b(var1, var2);
         int var6 = this.a(var2, var1);
         int var7 = var2.n();
         int var8 = var2.o();
         int var9 = var2.p();
         int var10;
         int var11;
         int var12;
         int var13;
         int var16;
         int var17;
         int var18;
         int var19;
         if(var6 > var5) {
            this.H[var4++] = 133152;
         } else if(var6 < var5) {
            this.H[var4++] = 133152 | var5 << 18;

            while(var3 < var4) {
               var10 = this.H[var3++];
               var11 = (var10 & 63) - 32 + var7;
               var12 = (var10 >> 6 & 63) - 32 + var8;
               var13 = (var10 >> 12 & 63) - 32 + var9;
               int var14 = var10 >> 18 & 15;
               dt var15 = new dt(var11, var12, var13);
               var16 = this.b(var1, var15);
               if(var16 == var14) {
                  this.a(var1, var15, 0);
                  if(var14 > 0) {
                     var17 = uv.a(var11 - var7);
                     var18 = uv.a(var12 - var8);
                     var19 = uv.a(var13 - var9);
                     if(var17 + var18 + var19 < 17) {
                        ej[] var20 = ej.values();
                        int var21 = var20.length;

                        for(int var22 = 0; var22 < var21; ++var22) {
                           ej var23 = var20[var22];
                           int var24 = var11 + var23.g();
                           int var25 = var12 + var23.h();
                           int var26 = var13 + var23.i();
                           dt var27 = new dt(var24, var25, var26);
                           int var28 = Math.max(1, this.p(var27).c().n());
                           var16 = this.b(var1, var27);
                           if(var16 == var14 - var28 && var4 < this.H.length) {
                              this.H[var4++] = var24 - var7 + 32 | var25 - var8 + 32 << 6 | var26 - var9 + 32 << 12 | var14 - var28 << 18;
                           }
                        }
                     }
                  }
               }
            }

            var3 = 0;
         }

         this.B.b();
         this.B.a("checkedPosition < toCheckCount");

         while(var3 < var4) {
            var10 = this.H[var3++];
            var11 = (var10 & 63) - 32 + var7;
            var12 = (var10 >> 6 & 63) - 32 + var8;
            var13 = (var10 >> 12 & 63) - 32 + var9;
            dt var29 = new dt(var11, var12, var13);
            int var30 = this.b(var1, var29);
            var16 = this.a(var29, var1);
            if(var16 != var30) {
               this.a(var1, var29, var16);
               if(var16 > var30) {
                  var17 = Math.abs(var11 - var7);
                  var18 = Math.abs(var12 - var8);
                  var19 = Math.abs(var13 - var9);
                  boolean var31 = var4 < this.H.length - 6;
                  if(var17 + var18 + var19 < 17 && var31) {
                     if(this.b(var1, var29.e()) < var16) {
                        this.H[var4++] = var11 - 1 - var7 + 32 + (var12 - var8 + 32 << 6) + (var13 - var9 + 32 << 12);
                     }

                     if(this.b(var1, var29.f()) < var16) {
                        this.H[var4++] = var11 + 1 - var7 + 32 + (var12 - var8 + 32 << 6) + (var13 - var9 + 32 << 12);
                     }

                     if(this.b(var1, var29.b()) < var16) {
                        this.H[var4++] = var11 - var7 + 32 + (var12 - 1 - var8 + 32 << 6) + (var13 - var9 + 32 << 12);
                     }

                     if(this.b(var1, var29.a()) < var16) {
                        this.H[var4++] = var11 - var7 + 32 + (var12 + 1 - var8 + 32 << 6) + (var13 - var9 + 32 << 12);
                     }

                     if(this.b(var1, var29.c()) < var16) {
                        this.H[var4++] = var11 - var7 + 32 + (var12 - var8 + 32 << 6) + (var13 - 1 - var9 + 32 << 12);
                     }

                     if(this.b(var1, var29.d()) < var16) {
                        this.H[var4++] = var11 - var7 + 32 + (var12 - var8 + 32 << 6) + (var13 + 1 - var9 + 32 << 12);
                     }
                  }
               }
            }
         }

         this.B.b();
         return true;
      }
   }

   public boolean a(boolean var1) {
      return false;
   }

   public List a(bfh var1, boolean var2) {
      return null;
   }

   public List a(bjb var1, boolean var2) {
      return null;
   }

   public List b(wv var1, brt var2) {
      return this.a(var1, var2, xe.d);
   }

   public List a(wv var1, brt var2, Predicate var3) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = uv.c((var2.a - 2.0D) / 16.0D);
      int var6 = uv.c((var2.d + 2.0D) / 16.0D);
      int var7 = uv.c((var2.c - 2.0D) / 16.0D);
      int var8 = uv.c((var2.f + 2.0D) / 16.0D);

      for(int var9 = var5; var9 <= var6; ++var9) {
         for(int var10 = var7; var10 <= var8; ++var10) {
            if(this.a(var9, var10, true)) {
               this.a(var9, var10).a(var1, var2, var4, var3);
            }
         }
      }

      return var4;
   }

   public List a(Class var1, Predicate var2) {
      ArrayList var3 = Lists.newArrayList();
      Iterator var4 = this.f.iterator();

      while(var4.hasNext()) {
         wv var5 = (wv)var4.next();
         if(var1.isAssignableFrom(var5.getClass()) && var2.apply(var5)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public List b(Class var1, Predicate var2) {
      ArrayList var3 = Lists.newArrayList();
      Iterator var4 = this.j.iterator();

      while(var4.hasNext()) {
         wv var5 = (wv)var4.next();
         if(var1.isAssignableFrom(var5.getClass()) && var2.apply(var5)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public List a(Class var1, brt var2) {
      return this.a(var1, var2, xe.d);
   }

   public List a(Class var1, brt var2, Predicate var3) {
      int var4 = uv.c((var2.a - 2.0D) / 16.0D);
      int var5 = uv.c((var2.d + 2.0D) / 16.0D);
      int var6 = uv.c((var2.c - 2.0D) / 16.0D);
      int var7 = uv.c((var2.f + 2.0D) / 16.0D);
      ArrayList var8 = Lists.newArrayList();

      for(int var9 = var4; var9 <= var5; ++var9) {
         for(int var10 = var6; var10 <= var7; ++var10) {
            if(this.a(var9, var10, true)) {
               this.a(var9, var10).a(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public wv a(Class var1, brt var2, wv var3) {
      List var4 = this.a(var1, var2);
      wv var5 = null;
      double var6 = Double.MAX_VALUE;

      for(int var8 = 0; var8 < var4.size(); ++var8) {
         wv var9 = (wv)var4.get(var8);
         if(var9 != var3 && xe.d.apply(var9)) {
            double var10 = var3.h(var9);
            if(var10 <= var6) {
               var5 = var9;
               var6 = var10;
            }
         }
      }

      return var5;
   }

   public wv a(int var1) {
      return (wv)this.l.a(var1);
   }

   public void b(dt var1, bcm var2) {
      if(this.e(var1)) {
         this.f(var1).e();
      }

   }

   public int a(Class var1) {
      int var2 = 0;
      Iterator var3 = this.f.iterator();

      while(var3.hasNext()) {
         wv var4 = (wv)var3.next();
         if((!(var4 instanceof xn) || !((xn)var4).bY()) && var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void b(Collection var1) {
      this.f.addAll(var1);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         wv var3 = (wv)var2.next();
         this.a(var3);
      }

   }

   public void c(Collection var1) {
      this.g.addAll(var1);
   }

   public boolean a(atr var1, dt var2, boolean var3, ej var4, wv var5, amj var6) {
      atr var7 = this.p(var2).c();
      brt var8 = var3?null:var1.a(this, var2, var1.P());
      return var8 != null && !this.a(var8, var5)?false:(var7.r() == bof.q && var1 == aty.cf?true:var7.r().j() && var1.a(this, var2, var4, var6));
   }

   public int a(dt var1, ej var2) {
      bec var3 = this.p(var1);
      return var3.c().b((ard)this, var1, var3, var2);
   }

   public are G() {
      return this.x.u();
   }

   public int y(dt var1) {
      byte var2 = 0;
      int var3 = Math.max(var2, this.a(var1.b(), ej.a));
      if(var3 >= 15) {
         return var3;
      } else {
         var3 = Math.max(var3, this.a(var1.a(), ej.b));
         if(var3 >= 15) {
            return var3;
         } else {
            var3 = Math.max(var3, this.a(var1.c(), ej.c));
            if(var3 >= 15) {
               return var3;
            } else {
               var3 = Math.max(var3, this.a(var1.d(), ej.d));
               if(var3 >= 15) {
                  return var3;
               } else {
                  var3 = Math.max(var3, this.a(var1.e(), ej.e));
                  if(var3 >= 15) {
                     return var3;
                  } else {
                     var3 = Math.max(var3, this.a(var1.f(), ej.f));
                     return var3 >= 15?var3:var3;
                  }
               }
            }
         }
      }
   }

   public boolean b(dt var1, ej var2) {
      return this.c(var1, var2) > 0;
   }

   public int c(dt var1, ej var2) {
      bec var3 = this.p(var1);
      atr var4 = var3.c();
      return var4.t()?this.y(var1):var4.a((ard)this, var1, var3, var2);
   }

   public boolean z(dt var1) {
      return this.c(var1.b(), ej.a) > 0?true:(this.c(var1.a(), ej.b) > 0?true:(this.c(var1.c(), ej.c) > 0?true:(this.c(var1.d(), ej.d) > 0?true:(this.c(var1.e(), ej.e) > 0?true:this.c(var1.f(), ej.f) > 0))));
   }

   public int A(dt var1) {
      int var2 = 0;
      ej[] var3 = ej.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         ej var6 = var3[var5];
         int var7 = this.c(var1.a(var6), var6);
         if(var7 >= 15) {
            return 15;
         }

         if(var7 > var2) {
            var2 = var7;
         }
      }

      return var2;
   }

   public ahd a(wv var1, double var2) {
      return this.a(var1.s, var1.t, var1.u, var2);
   }

   public ahd a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      ahd var11 = null;

      for(int var12 = 0; var12 < this.j.size(); ++var12) {
         ahd var13 = (ahd)this.j.get(var12);
         if(xe.d.apply(var13)) {
            double var14 = var13.e(var1, var3, var5);
            if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
               var9 = var14;
               var11 = var13;
            }
         }
      }

      return var11;
   }

   public boolean b(double var1, double var3, double var5, double var7) {
      for(int var9 = 0; var9 < this.j.size(); ++var9) {
         ahd var10 = (ahd)this.j.get(var9);
         if(xe.d.apply(var10)) {
            double var11 = var10.e(var1, var3, var5);
            if(var7 < 0.0D || var11 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   public ahd a(String var1) {
      for(int var2 = 0; var2 < this.j.size(); ++var2) {
         ahd var3 = (ahd)this.j.get(var2);
         if(var1.equals(var3.d_())) {
            return var3;
         }
      }

      return null;
   }

   public ahd b(UUID var1) {
      for(int var2 = 0; var2 < this.j.size(); ++var2) {
         ahd var3 = (ahd)this.j.get(var2);
         if(var1.equals(var3.aJ())) {
            return var3;
         }
      }

      return null;
   }

   public void I() {
      this.w.c();
   }

   public long J() {
      return this.x.b();
   }

   public long K() {
      return this.x.f();
   }

   public long L() {
      return this.x.g();
   }

   public void b(long var1) {
      this.x.c(var1);
   }

   public dt M() {
      dt var1 = new dt(this.x.c(), this.x.d(), this.x.e());
      if(!this.af().a(var1)) {
         var1 = this.m(new dt(this.af().f(), 0.0D, this.af().g()));
      }

      return var1;
   }

   public void B(dt var1) {
      this.x.a(var1);
   }

   public boolean a(ahd var1, dt var2) {
      return true;
   }

   public void a(wv var1, byte var2) {}

   public bfe N() {
      return this.v;
   }

   public void c(dt var1, atr var2, int var3, int var4) {
      var2.a(this, var1, this.p(var1), var3, var4);
   }

   public bqy O() {
      return this.w;
   }

   public bqo P() {
      return this.x;
   }

   public aqq Q() {
      return this.x.x();
   }

   public void d() {}

   public float h(float var1) {
      return (this.q + (this.r - this.q) * var1) * this.j(var1);
   }

   public float j(float var1) {
      return this.o + (this.p - this.o) * var1;
   }

   public boolean R() {
      return (double)this.h(1.0F) > 0.9D;
   }

   public boolean S() {
      return (double)this.j(1.0F) > 0.2D;
   }

   public boolean C(dt var1) {
      if(!this.S()) {
         return false;
      } else if(!this.i(var1)) {
         return false;
      } else if(this.q(var1).o() > var1.o()) {
         return false;
      } else {
         arm var2 = this.b(var1);
         return var2.d()?false:(this.f(var1, false)?false:var2.e());
      }
   }

   public boolean D(dt var1) {
      arm var2 = this.b(var1);
      return var2.f();
   }

   public brn T() {
      return this.z;
   }

   public void a(String var1, bqc var2) {
      this.z.a(var1, var2);
   }

   public bqc a(Class var1, String var2) {
      return this.z.a(var1, var2);
   }

   public int b(String var1) {
      return this.z.a(var1);
   }

   public void a(int var1, dt var2, int var3) {
      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ((ara)this.u.get(var4)).a(var1, var2, var3);
      }

   }

   public void b(int var1, dt var2, int var3) {
      this.a((ahd)null, var1, var2, var3);
   }

   public void a(ahd var1, int var2, dt var3, int var4) {
      try {
         for(int var5 = 0; var5 < this.u.size(); ++var5) {
            ((ara)this.u.get(var5)).a(var1, var2, var3, var4);
         }

      } catch (Throwable var8) {
         b var6 = b.a(var8, "Playing level event");
         j var7 = var6.a("Level event being played");
         var7.a("Block coordinates", (Object)j.a(var3));
         var7.a("Event source", (Object)var1);
         var7.a("Event type", (Object)Integer.valueOf(var2));
         var7.a("Event data", (Object)Integer.valueOf(var4));
         throw new u(var6);
      }
   }

   public int U() {
      return 256;
   }

   public int V() {
      return this.t.o()?128:256;
   }

   public Random a(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.P().b() + (long)var3;
      this.s.setSeed(var4);
      return this.s;
   }

   public dt a(String var1, dt var2) {
      return this.N().a(this, var1, var2);
   }

   public j a(b var1) {
      j var2 = var1.a("Affected level", 1);
      var2.a("Level name", (Object)(this.x == null?"????":this.x.k()));
      var2.a("All players", (Callable)(new aqx(this)));
      var2.a("Chunk stats", (Callable)(new aqy(this)));

      try {
         this.x.a(var2);
      } catch (Throwable var4) {
         var2.a("Level Data Unobtainable", var4);
      }

      return var2;
   }

   public void c(int var1, dt var2, int var3) {
      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ara var5 = (ara)this.u.get(var4);
         var5.b(var1, var2, var3);
      }

   }

   public Calendar Y() {
      if(this.K() % 600L == 0L) {
         this.J.setTimeInMillis(MinecraftServer.ax());
      }

      return this.J;
   }

   public bsd Z() {
      return this.C;
   }

   public void e(dt var1, atr var2) {
      Iterator var3 = en.a.iterator();

      while(var3.hasNext()) {
         ej var4 = (ej)var3.next();
         dt var5 = var1.a(var4);
         if(this.e(var5)) {
            bec var6 = this.p(var5);
            if(aty.cj.e(var6.c())) {
               var6.c().a(this, var5, var6, var2);
            } else if(var6.c().t()) {
               var5 = var5.a(var4);
               var6 = this.p(var5);
               if(aty.cj.e(var6.c())) {
                  var6.c().a(this, var5, var6, var2);
               }
            }
         }
      }

   }

   public vu E(dt var1) {
      long var2 = 0L;
      float var4 = 0.0F;
      if(this.e(var1)) {
         var4 = this.y();
         var2 = this.f(var1).w();
      }

      return new vu(this.aa(), this.L(), var2, var4);
   }

   public vt aa() {
      return this.P().y();
   }

   public int ab() {
      return this.d;
   }

   public void b(int var1) {
      this.d = var1;
   }

   public void c(int var1) {
      this.I = var1;
   }

   public boolean ad() {
      return this.y;
   }

   public abl ae() {
      return this.A;
   }

   public bfb af() {
      return this.M;
   }

   public boolean c(int var1, int var2) {
      dt var3 = this.M();
      int var4 = var1 * 16 + 8 - var3.n();
      int var5 = var2 * 16 + 8 - var3.p();
      short var6 = 128;
      return var4 >= -var6 && var4 <= var6 && var5 >= -var6 && var5 <= var6;
   }
}
