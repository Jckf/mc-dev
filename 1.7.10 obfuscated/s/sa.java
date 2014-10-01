import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public abstract class sa {

   private static int b;
   private int c;
   public double j;
   public boolean k;
   public sa l;
   public sa m;
   public boolean n;
   public ahb o;
   public double p;
   public double q;
   public double r;
   public double s;
   public double t;
   public double u;
   public double v;
   public double w;
   public double x;
   public float y;
   public float z;
   public float A;
   public float B;
   public final azt C;
   public boolean D;
   public boolean E;
   public boolean F;
   public boolean G;
   public boolean H;
   protected boolean I;
   public boolean J;
   public boolean K;
   public float L;
   public float M;
   public float N;
   public float O;
   public float P;
   public float Q;
   public float R;
   private int d;
   public double S;
   public double T;
   public double U;
   public float V;
   public float W;
   public boolean X;
   public float Y;
   protected Random Z;
   public int aa;
   public int ab;
   private int e;
   protected boolean ac;
   public int ad;
   private boolean f;
   protected boolean ae;
   protected te af;
   private double g;
   private double h;
   public boolean ag;
   public int ah;
   public int ai;
   public int aj;
   public boolean ak;
   public boolean al;
   public int am;
   protected boolean an;
   protected int ao;
   public int ap;
   protected int aq;
   private boolean i;
   protected UUID ar;
   public se as;


   public int y() {
      return this.c;
   }

   public void d(int var1) {
      this.c = var1;
   }

   public sa(ahb var1) {
      this.c = b++;
      this.j = 1.0D;
      this.C = azt.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      this.J = true;
      this.M = 0.6F;
      this.N = 1.8F;
      this.d = 1;
      this.Z = new Random();
      this.ab = 1;
      this.f = true;
      this.ar = UUID.randomUUID();
      this.as = se.b;
      this.o = var1;
      this.b(0.0D, 0.0D, 0.0D);
      if(var1 != null) {
         this.ap = var1.t.i;
      }

      this.af = new te(this);
      this.af.a(0, Byte.valueOf((byte)0));
      this.af.a(1, Short.valueOf((short)300));
      this.c();
   }

   protected abstract void c();

   public te z() {
      return this.af;
   }

   public boolean equals(Object var1) {
      return var1 instanceof sa?((sa)var1).c == this.c:false;
   }

   public int hashCode() {
      return this.c;
   }

   public void B() {
      this.K = true;
   }

   protected void a(float var1, float var2) {
      float var3;
      if(var1 != this.M || var2 != this.N) {
         var3 = this.M;
         this.M = var1;
         this.N = var2;
         this.C.d = this.C.a + (double)this.M;
         this.C.f = this.C.c + (double)this.M;
         this.C.e = this.C.b + (double)this.N;
         if(this.M > var3 && !this.f && !this.o.E) {
            this.d((double)(var3 - this.M), 0.0D, (double)(var3 - this.M));
         }
      }

      var3 = var1 % 2.0F;
      if((double)var3 < 0.375D) {
         this.as = se.a;
      } else if((double)var3 < 0.75D) {
         this.as = se.b;
      } else if((double)var3 < 1.0D) {
         this.as = se.c;
      } else if((double)var3 < 1.375D) {
         this.as = se.d;
      } else if((double)var3 < 1.75D) {
         this.as = se.e;
      } else {
         this.as = se.f;
      }

   }

   protected void b(float var1, float var2) {
      this.y = var1 % 360.0F;
      this.z = var2 % 360.0F;
   }

   public void b(double var1, double var3, double var5) {
      this.s = var1;
      this.t = var3;
      this.u = var5;
      float var7 = this.M / 2.0F;
      float var8 = this.N;
      this.C.b(var1 - (double)var7, var3 - (double)this.L + (double)this.V, var5 - (double)var7, var1 + (double)var7, var3 - (double)this.L + (double)this.V + (double)var8, var5 + (double)var7);
   }

   public void h() {
      this.C();
   }

   public void C() {
      this.o.C.a("entityBaseTick");
      if(this.m != null && this.m.K) {
         this.m = null;
      }

      this.O = this.P;
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.B = this.z;
      this.A = this.y;
      int var2;
      if(!this.o.E && this.o instanceof mt) {
         this.o.C.a("portal");
         MinecraftServer var1 = ((mt)this.o).q();
         var2 = this.D();
         if(this.an) {
            if(var1.w()) {
               if(this.m == null && this.ao++ >= var2) {
                  this.ao = var2;
                  this.am = this.ai();
                  byte var3;
                  if(this.o.t.i == -1) {
                     var3 = 0;
                  } else {
                     var3 = -1;
                  }

                  this.b(var3);
               }

               this.an = false;
            }
         } else {
            if(this.ao > 0) {
               this.ao -= 4;
            }

            if(this.ao < 0) {
               this.ao = 0;
            }
         }

         if(this.am > 0) {
            --this.am;
         }

         this.o.C.b();
      }

      if(this.ao() && !this.M()) {
         int var5 = qh.c(this.s);
         var2 = qh.c(this.t - 0.20000000298023224D - (double)this.L);
         int var6 = qh.c(this.u);
         aji var4 = this.o.a(var5, var2, var6);
         if(var4.o() != awt.a) {
            this.o.a("blockcrack_" + aji.b(var4) + "_" + this.o.e(var5, var2, var6), this.s + ((double)this.Z.nextFloat() - 0.5D) * (double)this.M, this.C.b + 0.1D, this.u + ((double)this.Z.nextFloat() - 0.5D) * (double)this.M, -this.v * 4.0D, 1.5D, -this.x * 4.0D);
         }
      }

      this.N();
      if(this.o.E) {
         this.e = 0;
      } else if(this.e > 0) {
         if(this.ae) {
            this.e -= 4;
            if(this.e < 0) {
               this.e = 0;
            }
         } else {
            if(this.e % 20 == 0) {
               this.a(ro.b, 1.0F);
            }

            --this.e;
         }
      }

      if(this.P()) {
         this.E();
         this.R *= 0.5F;
      }

      if(this.t < -64.0D) {
         this.G();
      }

      if(!this.o.E) {
         this.a(0, this.e > 0);
      }

      this.f = false;
      this.o.C.b();
   }

   public int D() {
      return 0;
   }

   protected void E() {
      if(!this.ae) {
         this.a(ro.c, 4.0F);
         this.e(15);
      }

   }

   public void e(int var1) {
      int var2 = var1 * 20;
      var2 = agi.a(this, var2);
      if(this.e < var2) {
         this.e = var2;
      }

   }

   public void F() {
      this.e = 0;
   }

   protected void G() {
      this.B();
   }

   public boolean c(double var1, double var3, double var5) {
      azt var7 = this.C.c(var1, var3, var5);
      List var8 = this.o.a(this, var7);
      return !var8.isEmpty()?false:!this.o.d(var7);
   }

   public void d(double var1, double var3, double var5) {
      if(this.X) {
         this.C.d(var1, var3, var5);
         this.s = (this.C.a + this.C.d) / 2.0D;
         this.t = this.C.b + (double)this.L - (double)this.V;
         this.u = (this.C.c + this.C.f) / 2.0D;
      } else {
         this.o.C.a("move");
         this.V *= 0.4F;
         double var7 = this.s;
         double var9 = this.t;
         double var11 = this.u;
         if(this.I) {
            this.I = false;
            var1 *= 0.25D;
            var3 *= 0.05000000074505806D;
            var5 *= 0.25D;
            this.v = 0.0D;
            this.w = 0.0D;
            this.x = 0.0D;
         }

         double var13 = var1;
         double var15 = var3;
         double var17 = var5;
         azt var19 = this.C.b();
         boolean var20 = this.D && this.an() && this instanceof yz;
         if(var20) {
            double var21;
            for(var21 = 0.05D; var1 != 0.0D && this.o.a(this, this.C.c(var1, -1.0D, 0.0D)).isEmpty(); var13 = var1) {
               if(var1 < var21 && var1 >= -var21) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var21;
               } else {
                  var1 += var21;
               }
            }

            for(; var5 != 0.0D && this.o.a(this, this.C.c(0.0D, -1.0D, var5)).isEmpty(); var17 = var5) {
               if(var5 < var21 && var5 >= -var21) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var21;
               } else {
                  var5 += var21;
               }
            }

            while(var1 != 0.0D && var5 != 0.0D && this.o.a(this, this.C.c(var1, -1.0D, var5)).isEmpty()) {
               if(var1 < var21 && var1 >= -var21) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var21;
               } else {
                  var1 += var21;
               }

               if(var5 < var21 && var5 >= -var21) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var21;
               } else {
                  var5 += var21;
               }

               var13 = var1;
               var17 = var5;
            }
         }

         List var36 = this.o.a(this, this.C.a(var1, var3, var5));

         for(int var22 = 0; var22 < var36.size(); ++var22) {
            var3 = ((azt)var36.get(var22)).b(this.C, var3);
         }

         this.C.d(0.0D, var3, 0.0D);
         if(!this.J && var15 != var3) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         boolean var37 = this.D || var15 != var3 && var15 < 0.0D;

         int var23;
         for(var23 = 0; var23 < var36.size(); ++var23) {
            var1 = ((azt)var36.get(var23)).a(this.C, var1);
         }

         this.C.d(var1, 0.0D, 0.0D);
         if(!this.J && var13 != var1) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         for(var23 = 0; var23 < var36.size(); ++var23) {
            var5 = ((azt)var36.get(var23)).c(this.C, var5);
         }

         this.C.d(0.0D, 0.0D, var5);
         if(!this.J && var17 != var5) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         double var25;
         double var27;
         int var30;
         double var38;
         if(this.W > 0.0F && var37 && (var20 || this.V < 0.05F) && (var13 != var1 || var17 != var5)) {
            var38 = var1;
            var25 = var3;
            var27 = var5;
            var1 = var13;
            var3 = (double)this.W;
            var5 = var17;
            azt var29 = this.C.b();
            this.C.d(var19);
            var36 = this.o.a(this, this.C.a(var13, var3, var17));

            for(var30 = 0; var30 < var36.size(); ++var30) {
               var3 = ((azt)var36.get(var30)).b(this.C, var3);
            }

            this.C.d(0.0D, var3, 0.0D);
            if(!this.J && var15 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var30 = 0; var30 < var36.size(); ++var30) {
               var1 = ((azt)var36.get(var30)).a(this.C, var1);
            }

            this.C.d(var1, 0.0D, 0.0D);
            if(!this.J && var13 != var1) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var30 = 0; var30 < var36.size(); ++var30) {
               var5 = ((azt)var36.get(var30)).c(this.C, var5);
            }

            this.C.d(0.0D, 0.0D, var5);
            if(!this.J && var17 != var5) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            if(!this.J && var15 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            } else {
               var3 = (double)(-this.W);

               for(var30 = 0; var30 < var36.size(); ++var30) {
                  var3 = ((azt)var36.get(var30)).b(this.C, var3);
               }

               this.C.d(0.0D, var3, 0.0D);
            }

            if(var38 * var38 + var27 * var27 >= var1 * var1 + var5 * var5) {
               var1 = var38;
               var3 = var25;
               var5 = var27;
               this.C.d(var29);
            }
         }

         this.o.C.b();
         this.o.C.a("rest");
         this.s = (this.C.a + this.C.d) / 2.0D;
         this.t = this.C.b + (double)this.L - (double)this.V;
         this.u = (this.C.c + this.C.f) / 2.0D;
         this.E = var13 != var1 || var17 != var5;
         this.F = var15 != var3;
         this.D = var15 != var3 && var15 < 0.0D;
         this.G = this.E || this.F;
         this.a(var3, this.D);
         if(var13 != var1) {
            this.v = 0.0D;
         }

         if(var15 != var3) {
            this.w = 0.0D;
         }

         if(var17 != var5) {
            this.x = 0.0D;
         }

         var38 = this.s - var7;
         var25 = this.t - var9;
         var27 = this.u - var11;
         if(this.g_() && !var20 && this.m == null) {
            int var39 = qh.c(this.s);
            var30 = qh.c(this.t - 0.20000000298023224D - (double)this.L);
            int var31 = qh.c(this.u);
            aji var32 = this.o.a(var39, var30, var31);
            int var33 = this.o.a(var39, var30 - 1, var31).b();
            if(var33 == 11 || var33 == 32 || var33 == 21) {
               var32 = this.o.a(var39, var30 - 1, var31);
            }

            if(var32 != ajn.ap) {
               var25 = 0.0D;
            }

            this.P = (float)((double)this.P + (double)qh.a(var38 * var38 + var27 * var27) * 0.6D);
            this.Q = (float)((double)this.Q + (double)qh.a(var38 * var38 + var25 * var25 + var27 * var27) * 0.6D);
            if(this.Q > (float)this.d && var32.o() != awt.a) {
               this.d = (int)this.Q + 1;
               if(this.M()) {
                  float var34 = qh.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.35F;
                  if(var34 > 1.0F) {
                     var34 = 1.0F;
                  }

                  this.a(this.H(), var34, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
               }

               this.a(var39, var30, var31, var32);
               var32.b(this.o, var39, var30, var31, this);
            }
         }

         try {
            this.I();
         } catch (Throwable var35) {
            b var41 = b.a(var35, "Checking entity block collision");
            k var42 = var41.a("Entity being checked for collision");
            this.a(var42);
            throw new s(var41);
         }

         boolean var40 = this.L();
         if(this.o.e(this.C.e(0.001D, 0.001D, 0.001D))) {
            this.f(1);
            if(!var40) {
               ++this.e;
               if(this.e == 0) {
                  this.e(8);
               }
            }
         } else if(this.e <= 0) {
            this.e = -this.ab;
         }

         if(var40 && this.e > 0) {
            this.a("random.fizz", 0.7F, 1.6F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
            this.e = -this.ab;
         }

         this.o.C.b();
      }
   }

   protected String H() {
      return "game.neutral.swim";
   }

   protected void I() {
      int var1 = qh.c(this.C.a + 0.001D);
      int var2 = qh.c(this.C.b + 0.001D);
      int var3 = qh.c(this.C.c + 0.001D);
      int var4 = qh.c(this.C.d - 0.001D);
      int var5 = qh.c(this.C.e - 0.001D);
      int var6 = qh.c(this.C.f - 0.001D);
      if(this.o.b(var1, var2, var3, var4, var5, var6)) {
         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var2; var8 <= var5; ++var8) {
               for(int var9 = var3; var9 <= var6; ++var9) {
                  aji var10 = this.o.a(var7, var8, var9);

                  try {
                     var10.a(this.o, var7, var8, var9, this);
                  } catch (Throwable var14) {
                     b var12 = b.a(var14, "Colliding entity with block");
                     k var13 = var12.a("Block being collided with");
                     k.a(var13, var7, var8, var9, var10, this.o.e(var7, var8, var9));
                     throw new s(var12);
                  }
               }
            }
         }
      }

   }

   protected void a(int var1, int var2, int var3, aji var4) {
      ajm var5 = var4.H;
      if(this.o.a(var1, var2 + 1, var3) == ajn.aC) {
         var5 = ajn.aC.H;
         this.a(var5.e(), var5.c() * 0.15F, var5.d());
      } else if(!var4.o().d()) {
         this.a(var5.e(), var5.c() * 0.15F, var5.d());
      }

   }

   public void a(String var1, float var2, float var3) {
      this.o.a(this, var1, var2, var3);
   }

   protected boolean g_() {
      return true;
   }

   protected void a(double var1, boolean var3) {
      if(var3) {
         if(this.R > 0.0F) {
            this.b(this.R);
            this.R = 0.0F;
         }
      } else if(var1 < 0.0D) {
         this.R = (float)((double)this.R - var1);
      }

   }

   public azt J() {
      return null;
   }

   protected void f(int var1) {
      if(!this.ae) {
         this.a(ro.a, (float)var1);
      }

   }

   public final boolean K() {
      return this.ae;
   }

   protected void b(float var1) {
      if(this.l != null) {
         this.l.b(var1);
      }

   }

   public boolean L() {
      return this.ac || this.o.y(qh.c(this.s), qh.c(this.t), qh.c(this.u)) || this.o.y(qh.c(this.s), qh.c(this.t + (double)this.N), qh.c(this.u));
   }

   public boolean M() {
      return this.ac;
   }

   public boolean N() {
      if(this.o.a(this.C.b(0.0D, -0.4000000059604645D, 0.0D).e(0.001D, 0.001D, 0.001D), awt.h, this)) {
         if(!this.ac && !this.f) {
            float var1 = qh.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.2F;
            if(var1 > 1.0F) {
               var1 = 1.0F;
            }

            this.a(this.O(), var1, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
            float var2 = (float)qh.c(this.C.b);

            int var3;
            float var4;
            float var5;
            for(var3 = 0; (float)var3 < 1.0F + this.M * 20.0F; ++var3) {
               var4 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
               var5 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
               this.o.a("bubble", this.s + (double)var4, (double)(var2 + 1.0F), this.u + (double)var5, this.v, this.w - (double)(this.Z.nextFloat() * 0.2F), this.x);
            }

            for(var3 = 0; (float)var3 < 1.0F + this.M * 20.0F; ++var3) {
               var4 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
               var5 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
               this.o.a("splash", this.s + (double)var4, (double)(var2 + 1.0F), this.u + (double)var5, this.v, this.w, this.x);
            }
         }

         this.R = 0.0F;
         this.ac = true;
         this.e = 0;
      } else {
         this.ac = false;
      }

      return this.ac;
   }

   protected String O() {
      return "game.neutral.swim.splash";
   }

   public boolean a(awt var1) {
      double var2 = this.t + (double)this.g();
      int var4 = qh.c(this.s);
      int var5 = qh.d((float)qh.c(var2));
      int var6 = qh.c(this.u);
      aji var7 = this.o.a(var4, var5, var6);
      if(var7.o() == var1) {
         float var8 = alw.b(this.o.e(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   public float g() {
      return 0.0F;
   }

   public boolean P() {
      return this.o.a(this.C.b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), awt.i);
   }

   public void a(float var1, float var2, float var3) {
      float var4 = var1 * var1 + var2 * var2;
      if(var4 >= 1.0E-4F) {
         var4 = qh.c(var4);
         if(var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = qh.a(this.y * 3.1415927F / 180.0F);
         float var6 = qh.b(this.y * 3.1415927F / 180.0F);
         this.v += (double)(var1 * var6 - var2 * var5);
         this.x += (double)(var2 * var6 + var1 * var5);
      }
   }

   public float d(float var1) {
      int var2 = qh.c(this.s);
      int var3 = qh.c(this.u);
      if(this.o.d(var2, 0, var3)) {
         double var4 = (this.C.e - this.C.b) * 0.66D;
         int var6 = qh.c(this.t - (double)this.L + var4);
         return this.o.n(var2, var6, var3);
      } else {
         return 0.0F;
      }
   }

   public void a(ahb var1) {
      this.o = var1;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.p = this.s = var1;
      this.q = this.t = var3;
      this.r = this.u = var5;
      this.A = this.y = var7;
      this.B = this.z = var8;
      this.V = 0.0F;
      double var9 = (double)(this.A - var7);
      if(var9 < -180.0D) {
         this.A += 360.0F;
      }

      if(var9 >= 180.0D) {
         this.A -= 360.0F;
      }

      this.b(this.s, this.t, this.u);
      this.b(var7, var8);
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.S = this.p = this.s = var1;
      this.T = this.q = this.t = var3 + (double)this.L;
      this.U = this.r = this.u = var5;
      this.y = var7;
      this.z = var8;
      this.b(this.s, this.t, this.u);
   }

   public float e(sa var1) {
      float var2 = (float)(this.s - var1.s);
      float var3 = (float)(this.t - var1.t);
      float var4 = (float)(this.u - var1.u);
      return qh.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double e(double var1, double var3, double var5) {
      double var7 = this.s - var1;
      double var9 = this.t - var3;
      double var11 = this.u - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double f(double var1, double var3, double var5) {
      double var7 = this.s - var1;
      double var9 = this.t - var3;
      double var11 = this.u - var5;
      return (double)qh.a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double f(sa var1) {
      double var2 = this.s - var1.s;
      double var4 = this.t - var1.t;
      double var6 = this.u - var1.u;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void b_(yz var1) {}

   public void g(sa var1) {
      if(var1.l != this && var1.m != this) {
         double var2 = var1.s - this.s;
         double var4 = var1.u - this.u;
         double var6 = qh.a(var2, var4);
         if(var6 >= 0.009999999776482582D) {
            var6 = (double)qh.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0D / var6;
            if(var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05000000074505806D;
            var4 *= 0.05000000074505806D;
            var2 *= (double)(1.0F - this.Y);
            var4 *= (double)(1.0F - this.Y);
            this.g(-var2, 0.0D, -var4);
            var1.g(var2, 0.0D, var4);
         }

      }
   }

   public void g(double var1, double var3, double var5) {
      this.v += var1;
      this.w += var3;
      this.x += var5;
      this.al = true;
   }

   protected void Q() {
      this.H = true;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         this.Q();
         return false;
      }
   }

   public boolean R() {
      return false;
   }

   public boolean S() {
      return false;
   }

   public void b(sa var1, int var2) {}

   public boolean c(dh var1) {
      String var2 = this.W();
      if(!this.K && var2 != null) {
         var1.a("id", var2);
         this.e(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean d(dh var1) {
      String var2 = this.W();
      if(!this.K && var2 != null && this.l == null) {
         var1.a("id", var2);
         this.e(var1);
         return true;
      } else {
         return false;
      }
   }

   public void e(dh var1) {
      try {
         var1.a("Pos", (dy)this.a(new double[]{this.s, this.t + (double)this.V, this.u}));
         var1.a("Motion", (dy)this.a(new double[]{this.v, this.w, this.x}));
         var1.a("Rotation", (dy)this.a(new float[]{this.y, this.z}));
         var1.a("FallDistance", this.R);
         var1.a("Fire", (short)this.e);
         var1.a("Air", (short)this.ar());
         var1.a("OnGround", this.D);
         var1.a("Dimension", this.ap);
         var1.a("Invulnerable", this.i);
         var1.a("PortalCooldown", this.am);
         var1.a("UUIDMost", this.aB().getMostSignificantBits());
         var1.a("UUIDLeast", this.aB().getLeastSignificantBits());
         this.b(var1);
         if(this.m != null) {
            dh var2 = new dh();
            if(this.m.c(var2)) {
               var1.a("Riding", (dy)var2);
            }
         }

      } catch (Throwable var5) {
         b var3 = b.a(var5, "Saving entity NBT");
         k var4 = var3.a("Entity being saved");
         this.a(var4);
         throw new s(var3);
      }
   }

   public void f(dh var1) {
      try {
         dq var2 = var1.c("Pos", 6);
         dq var6 = var1.c("Motion", 6);
         dq var7 = var1.c("Rotation", 5);
         this.v = var6.d(0);
         this.w = var6.d(1);
         this.x = var6.d(2);
         if(Math.abs(this.v) > 10.0D) {
            this.v = 0.0D;
         }

         if(Math.abs(this.w) > 10.0D) {
            this.w = 0.0D;
         }

         if(Math.abs(this.x) > 10.0D) {
            this.x = 0.0D;
         }

         this.p = this.S = this.s = var2.d(0);
         this.q = this.T = this.t = var2.d(1);
         this.r = this.U = this.u = var2.d(2);
         this.A = this.y = var7.e(0);
         this.B = this.z = var7.e(1);
         this.R = var1.h("FallDistance");
         this.e = var1.e("Fire");
         this.h(var1.e("Air"));
         this.D = var1.n("OnGround");
         this.ap = var1.f("Dimension");
         this.i = var1.n("Invulnerable");
         this.am = var1.f("PortalCooldown");
         if(var1.b("UUIDMost", 4) && var1.b("UUIDLeast", 4)) {
            this.ar = new UUID(var1.g("UUIDMost"), var1.g("UUIDLeast"));
         }

         this.b(this.s, this.t, this.u);
         this.b(this.y, this.z);
         this.a(var1);
         if(this.V()) {
            this.b(this.s, this.t, this.u);
         }

      } catch (Throwable var5) {
         b var3 = b.a(var5, "Loading entity NBT");
         k var4 = var3.a("Entity being loaded");
         this.a(var4);
         throw new s(var3);
      }
   }

   protected boolean V() {
      return true;
   }

   protected final String W() {
      return sg.b(this);
   }

   protected abstract void a(dh var1);

   protected abstract void b(dh var1);

   public void X() {}

   protected dq a(double ... var1) {
      dq var2 = new dq();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.a((dy)(new dk(var6)));
      }

      return var2;
   }

   protected dq a(float ... var1) {
      dq var2 = new dq();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.a((dy)(new dm(var6)));
      }

      return var2;
   }

   public xk a(adb var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public xk a(adb var1, int var2, float var3) {
      return this.a(new add(var1, var2, 0), var3);
   }

   public xk a(add var1, float var2) {
      if(var1.b != 0 && var1.b() != null) {
         xk var3 = new xk(this.o, this.s, this.t + (double)var2, this.u, var1);
         var3.b = 10;
         this.o.d((sa)var3);
         return var3;
      } else {
         return null;
      }
   }

   public boolean Z() {
      return !this.K;
   }

   public boolean aa() {
      for(int var1 = 0; var1 < 8; ++var1) {
         float var2 = ((float)((var1 >> 0) % 2) - 0.5F) * this.M * 0.8F;
         float var3 = ((float)((var1 >> 1) % 2) - 0.5F) * 0.1F;
         float var4 = ((float)((var1 >> 2) % 2) - 0.5F) * this.M * 0.8F;
         int var5 = qh.c(this.s + (double)var2);
         int var6 = qh.c(this.t + (double)this.g() + (double)var3);
         int var7 = qh.c(this.u + (double)var4);
         if(this.o.a(var5, var6, var7).r()) {
            return true;
         }
      }

      return false;
   }

   public boolean c(yz var1) {
      return false;
   }

   public azt h(sa var1) {
      return null;
   }

   public void ab() {
      if(this.m.K) {
         this.m = null;
      } else {
         this.v = 0.0D;
         this.w = 0.0D;
         this.x = 0.0D;
         this.h();
         if(this.m != null) {
            this.m.ac();
            this.h += (double)(this.m.y - this.m.A);

            for(this.g += (double)(this.m.z - this.m.B); this.h >= 180.0D; this.h -= 360.0D) {
               ;
            }

            while(this.h < -180.0D) {
               this.h += 360.0D;
            }

            while(this.g >= 180.0D) {
               this.g -= 360.0D;
            }

            while(this.g < -180.0D) {
               this.g += 360.0D;
            }

            double var1 = this.h * 0.5D;
            double var3 = this.g * 0.5D;
            float var5 = 10.0F;
            if(var1 > (double)var5) {
               var1 = (double)var5;
            }

            if(var1 < (double)(-var5)) {
               var1 = (double)(-var5);
            }

            if(var3 > (double)var5) {
               var3 = (double)var5;
            }

            if(var3 < (double)(-var5)) {
               var3 = (double)(-var5);
            }

            this.h -= var1;
            this.g -= var3;
         }
      }
   }

   public void ac() {
      if(this.l != null) {
         this.l.b(this.s, this.t + this.ae() + this.l.ad(), this.u);
      }
   }

   public double ad() {
      return (double)this.L;
   }

   public double ae() {
      return (double)this.N * 0.75D;
   }

   public void a(sa var1) {
      this.g = 0.0D;
      this.h = 0.0D;
      if(var1 == null) {
         if(this.m != null) {
            this.b(this.m.s, this.m.C.b + (double)this.m.N, this.m.u, this.y, this.z);
            this.m.l = null;
         }

         this.m = null;
      } else {
         if(this.m != null) {
            this.m.l = null;
         }

         if(var1 != null) {
            for(sa var2 = var1.m; var2 != null; var2 = var2.m) {
               if(var2 == this) {
                  return;
               }
            }
         }

         this.m = var1;
         var1.l = this;
      }
   }

   public float af() {
      return 0.1F;
   }

   public azw ag() {
      return null;
   }

   public void ah() {
      if(this.am > 0) {
         this.am = this.ai();
      } else {
         double var1 = this.p - this.s;
         double var3 = this.r - this.u;
         if(!this.o.E && !this.an) {
            this.aq = p.a(var1, var3);
         }

         this.an = true;
      }
   }

   public int ai() {
      return 300;
   }

   public add[] ak() {
      return null;
   }

   public void c(int var1, add var2) {}

   public boolean al() {
      boolean var1 = this.o != null && this.o.E;
      return !this.ae && (this.e > 0 || var1 && this.g(0));
   }

   public boolean am() {
      return this.m != null;
   }

   public boolean an() {
      return this.g(1);
   }

   public void b(boolean var1) {
      this.a(1, var1);
   }

   public boolean ao() {
      return this.g(3);
   }

   public void c(boolean var1) {
      this.a(3, var1);
   }

   public boolean ap() {
      return this.g(5);
   }

   public void d(boolean var1) {
      this.a(5, var1);
   }

   public void e(boolean var1) {
      this.a(4, var1);
   }

   protected boolean g(int var1) {
      return (this.af.a(0) & 1 << var1) != 0;
   }

   protected void a(int var1, boolean var2) {
      byte var3 = this.af.a(0);
      if(var2) {
         this.af.b(0, Byte.valueOf((byte)(var3 | 1 << var1)));
      } else {
         this.af.b(0, Byte.valueOf((byte)(var3 & ~(1 << var1))));
      }

   }

   public int ar() {
      return this.af.b(1);
   }

   public void h(int var1) {
      this.af.b(1, Short.valueOf((short)var1));
   }

   public void a(xh var1) {
      this.f(5);
      ++this.e;
      if(this.e == 0) {
         this.e(8);
      }

   }

   public void a(sv var1) {}

   protected boolean j(double var1, double var3, double var5) {
      int var7 = qh.c(var1);
      int var8 = qh.c(var3);
      int var9 = qh.c(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      List var16 = this.o.a(this.C);
      if(var16.isEmpty() && !this.o.q(var7, var8, var9)) {
         return false;
      } else {
         boolean var17 = !this.o.q(var7 - 1, var8, var9);
         boolean var18 = !this.o.q(var7 + 1, var8, var9);
         boolean var19 = !this.o.q(var7, var8 - 1, var9);
         boolean var20 = !this.o.q(var7, var8 + 1, var9);
         boolean var21 = !this.o.q(var7, var8, var9 - 1);
         boolean var22 = !this.o.q(var7, var8, var9 + 1);
         byte var23 = 3;
         double var24 = 9999.0D;
         if(var17 && var10 < var24) {
            var24 = var10;
            var23 = 0;
         }

         if(var18 && 1.0D - var10 < var24) {
            var24 = 1.0D - var10;
            var23 = 1;
         }

         if(var20 && 1.0D - var12 < var24) {
            var24 = 1.0D - var12;
            var23 = 3;
         }

         if(var21 && var14 < var24) {
            var24 = var14;
            var23 = 4;
         }

         if(var22 && 1.0D - var14 < var24) {
            var24 = 1.0D - var14;
            var23 = 5;
         }

         float var26 = this.Z.nextFloat() * 0.2F + 0.1F;
         if(var23 == 0) {
            this.v = (double)(-var26);
         }

         if(var23 == 1) {
            this.v = (double)var26;
         }

         if(var23 == 2) {
            this.w = (double)(-var26);
         }

         if(var23 == 3) {
            this.w = (double)var26;
         }

         if(var23 == 4) {
            this.x = (double)(-var26);
         }

         if(var23 == 5) {
            this.x = (double)var26;
         }

         return true;
      }
   }

   public void as() {
      this.I = true;
      this.R = 0.0F;
   }

   public String b_() {
      String var1 = sg.b(this);
      if(var1 == null) {
         var1 = "generic";
      }

      return dd.a("entity." + var1 + ".name");
   }

   public sa[] at() {
      return null;
   }

   public boolean i(sa var1) {
      return this == var1;
   }

   public float au() {
      return 0.0F;
   }

   public boolean av() {
      return true;
   }

   public boolean j(sa var1) {
      return false;
   }

   public String toString() {
      return String.format("%s[\'%s\'/%d, l=\'%s\', x=%.2f, y=%.2f, z=%.2f]", new Object[]{this.getClass().getSimpleName(), this.b_(), Integer.valueOf(this.c), this.o == null?"~NULL~":this.o.N().k(), Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u)});
   }

   public boolean aw() {
      return this.i;
   }

   public void k(sa var1) {
      this.b(var1.s, var1.t, var1.u, var1.y, var1.z);
   }

   public void a(sa var1, boolean var2) {
      dh var3 = new dh();
      var1.e(var3);
      this.f(var3);
      this.am = var1.am;
      this.aq = var1.aq;
   }

   public void b(int var1) {
      if(!this.o.E && !this.K) {
         this.o.C.a("changeDimension");
         MinecraftServer var2 = MinecraftServer.I();
         int var3 = this.ap;
         mt var4 = var2.a(var3);
         mt var5 = var2.a(var1);
         this.ap = var1;
         if(var3 == 1 && var1 == 1) {
            var5 = var2.a(0);
            this.ap = 0;
         }

         this.o.e(this);
         this.K = false;
         this.o.C.a("reposition");
         var2.ah().a(this, var3, var4, var5);
         this.o.C.c("reloading");
         sa var6 = sg.a(sg.b(this), var5);
         if(var6 != null) {
            var6.a(this, true);
            if(var3 == 1 && var1 == 1) {
               r var7 = var5.K();
               var7.b = this.o.i(var7.a, var7.c);
               var6.b((double)var7.a, (double)var7.b, (double)var7.c, var6.y, var6.z);
            }

            var5.d(var6);
         }

         this.K = true;
         this.o.C.b();
         var4.i();
         var5.i();
         this.o.C.b();
      }
   }

   public float a(agw var1, ahb var2, int var3, int var4, int var5, aji var6) {
      return var6.a(this);
   }

   public boolean a(agw var1, ahb var2, int var3, int var4, int var5, aji var6, float var7) {
      return true;
   }

   public int ax() {
      return 3;
   }

   public int ay() {
      return this.aq;
   }

   public boolean az() {
      return false;
   }

   public void a(k var1) {
      var1.a("Entity Type", (Callable)(new sb(this)));
      var1.a("Entity ID", (Object)Integer.valueOf(this.c));
      var1.a("Entity Name", (Callable)(new sc(this)));
      var1.a("Entity\'s Exact location", (Object)String.format("%.2f, %.2f, %.2f", new Object[]{Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u)}));
      var1.a("Entity\'s Block location", (Object)k.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)));
      var1.a("Entity\'s Momentum", (Object)String.format("%.2f, %.2f, %.2f", new Object[]{Double.valueOf(this.v), Double.valueOf(this.w), Double.valueOf(this.x)}));
   }

   public UUID aB() {
      return this.ar;
   }

   public boolean aC() {
      return true;
   }

   public fj c_() {
      return new fq(this.b_());
   }

   public void i(int var1) {}
}
