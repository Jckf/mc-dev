import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class xe extends sa {

   private static final List d = Arrays.asList(new xf[]{(new xf(new add(ade.T), 10)).a(0.9F), new xf(new add(ade.aA), 10), new xf(new add(ade.aS), 10), new xf(new add(ade.bn), 10), new xf(new add(ade.F), 5), (new xf(new add(ade.aM), 2)).a(0.9F), new xf(new add(ade.z), 10), new xf(new add(ade.y), 5), new xf(new add(ade.aR, 10, 0), 1), new xf(new add(ajn.bC), 10), new xf(new add(ade.bh), 10)});
   private static final List e = Arrays.asList(new xf[]{new xf(new add(ajn.bi), 1), new xf(new add(ade.cb), 1), new xf(new add(ade.av), 1), (new xf(new add(ade.f), 1)).a(0.25F).a(), (new xf(new add(ade.aM), 1)).a(0.25F).a(), (new xf(new add(ade.aG), 1)).a()});
   private static final List f = Arrays.asList(new xf[]{new xf(new add(ade.aP, 1, acu.a.a()), 60), new xf(new add(ade.aP, 1, acu.b.a()), 25), new xf(new add(ade.aP, 1, acu.c.a()), 2), new xf(new add(ade.aP, 1, acu.d.a()), 13)});
   private int g = -1;
   private int h = -1;
   private int i = -1;
   private aji at;
   private boolean au;
   public int a;
   public yz b;
   private int av;
   private int aw;
   private int ax;
   private int ay;
   private int az;
   private float aA;
   public sa c;
   private int aB;
   private double aC;
   private double aD;
   private double aE;
   private double aF;
   private double aG;


   public xe(ahb var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.ak = true;
   }

   public xe(ahb var1, yz var2) {
      super(var1);
      this.ak = true;
      this.b = var2;
      this.b.bK = this;
      this.a(0.25F, 0.25F);
      this.b(var2.s, var2.t + 1.62D - (double)var2.L, var2.u, var2.y, var2.z);
      this.s -= (double)(qh.b(this.y / 180.0F * 3.1415927F) * 0.16F);
      this.t -= 0.10000000149011612D;
      this.u -= (double)(qh.a(this.y / 180.0F * 3.1415927F) * 0.16F);
      this.b(this.s, this.t, this.u);
      this.L = 0.0F;
      float var3 = 0.4F;
      this.v = (double)(-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * var3);
      this.x = (double)(qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * var3);
      this.w = (double)(-qh.a(this.z / 180.0F * 3.1415927F) * var3);
      this.c(this.v, this.w, this.x, 1.5F, 1.0F);
   }

   protected void c() {}

   public void c(double var1, double var3, double var5, float var7, float var8) {
      float var9 = qh.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.Z.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.Z.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.Z.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.v = var1;
      this.w = var3;
      this.x = var5;
      float var10 = qh.a(var1 * var1 + var5 * var5);
      this.A = this.y = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.B = this.z = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.av = 0;
   }

   public void h() {
      super.h();
      if(this.aB > 0) {
         double var27 = this.s + (this.aC - this.s) / (double)this.aB;
         double var28 = this.t + (this.aD - this.t) / (double)this.aB;
         double var29 = this.u + (this.aE - this.u) / (double)this.aB;
         double var7 = qh.g(this.aF - (double)this.y);
         this.y = (float)((double)this.y + var7 / (double)this.aB);
         this.z = (float)((double)this.z + (this.aG - (double)this.z) / (double)this.aB);
         --this.aB;
         this.b(var27, var28, var29);
         this.b(this.y, this.z);
      } else {
         if(!this.o.E) {
            add var1 = this.b.bF();
            if(this.b.K || !this.b.Z() || var1 == null || var1.b() != ade.aM || this.f(this.b) > 1024.0D) {
               this.B();
               this.b.bK = null;
               return;
            }

            if(this.c != null) {
               if(!this.c.K) {
                  this.s = this.c.s;
                  this.t = this.c.C.b + (double)this.c.N * 0.8D;
                  this.u = this.c.u;
                  return;
               }

               this.c = null;
            }
         }

         if(this.a > 0) {
            --this.a;
         }

         if(this.au) {
            if(this.o.a(this.g, this.h, this.i) == this.at) {
               ++this.av;
               if(this.av == 1200) {
                  this.B();
               }

               return;
            }

            this.au = false;
            this.v *= (double)(this.Z.nextFloat() * 0.2F);
            this.w *= (double)(this.Z.nextFloat() * 0.2F);
            this.x *= (double)(this.Z.nextFloat() * 0.2F);
            this.av = 0;
            this.aw = 0;
         } else {
            ++this.aw;
         }

         azw var26 = azw.a(this.s, this.t, this.u);
         azw var2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
         azu var3 = this.o.a(var26, var2);
         var26 = azw.a(this.s, this.t, this.u);
         var2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
         if(var3 != null) {
            var2 = azw.a(var3.f.a, var3.f.b, var3.f.c);
         }

         sa var4 = null;
         List var5 = this.o.b((sa)this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         double var13;
         for(int var8 = 0; var8 < var5.size(); ++var8) {
            sa var9 = (sa)var5.get(var8);
            if(var9.R() && (var9 != this.b || this.aw >= 5)) {
               float var10 = 0.3F;
               azt var11 = var9.C.b((double)var10, (double)var10, (double)var10);
               azu var12 = var11.a(var26, var2);
               if(var12 != null) {
                  var13 = var26.d(var12.f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new azu(var4);
         }

         if(var3 != null) {
            if(var3.g != null) {
               if(var3.g.a(ro.a((sa)this, this.b), 0.0F)) {
                  this.c = var3.g;
               }
            } else {
               this.au = true;
            }
         }

         if(!this.au) {
            this.d(this.v, this.w, this.x);
            float var30 = qh.a(this.v * this.v + this.x * this.x);
            this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);

            for(this.z = (float)(Math.atan2(this.w, (double)var30) * 180.0D / 3.1415927410125732D); this.z - this.B < -180.0F; this.B -= 360.0F) {
               ;
            }

            while(this.z - this.B >= 180.0F) {
               this.B += 360.0F;
            }

            while(this.y - this.A < -180.0F) {
               this.A -= 360.0F;
            }

            while(this.y - this.A >= 180.0F) {
               this.A += 360.0F;
            }

            this.z = this.B + (this.z - this.B) * 0.2F;
            this.y = this.A + (this.y - this.A) * 0.2F;
            float var31 = 0.92F;
            if(this.D || this.E) {
               var31 = 0.5F;
            }

            byte var32 = 5;
            double var33 = 0.0D;

            for(int var34 = 0; var34 < var32; ++var34) {
               double var14 = this.C.b + (this.C.e - this.C.b) * (double)(var34 + 0) / (double)var32 - 0.125D + 0.125D;
               double var16 = this.C.b + (this.C.e - this.C.b) * (double)(var34 + 1) / (double)var32 - 0.125D + 0.125D;
               azt var18 = azt.a(this.C.a, var14, this.C.c, this.C.d, var16, this.C.f);
               if(this.o.b(var18, awt.h)) {
                  var33 += 1.0D / (double)var32;
               }
            }

            if(!this.o.E && var33 > 0.0D) {
               mt var35 = (mt)this.o;
               int var36 = 1;
               if(this.Z.nextFloat() < 0.25F && this.o.y(qh.c(this.s), qh.c(this.t) + 1, qh.c(this.u))) {
                  var36 = 2;
               }

               if(this.Z.nextFloat() < 0.5F && !this.o.i(qh.c(this.s), qh.c(this.t) + 1, qh.c(this.u))) {
                  --var36;
               }

               if(this.ax > 0) {
                  --this.ax;
                  if(this.ax <= 0) {
                     this.ay = 0;
                     this.az = 0;
                  }
               } else {
                  float var15;
                  float var17;
                  double var20;
                  double var22;
                  float var37;
                  double var38;
                  if(this.az > 0) {
                     this.az -= var36;
                     if(this.az <= 0) {
                        this.w -= 0.20000000298023224D;
                        this.a("random.splash", 0.25F, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
                        var15 = (float)qh.c(this.C.b);
                        var35.a("bubble", this.s, (double)(var15 + 1.0F), this.u, (int)(1.0F + this.M * 20.0F), (double)this.M, 0.0D, (double)this.M, 0.20000000298023224D);
                        var35.a("wake", this.s, (double)(var15 + 1.0F), this.u, (int)(1.0F + this.M * 20.0F), (double)this.M, 0.0D, (double)this.M, 0.20000000298023224D);
                        this.ax = qh.a(this.Z, 10, 30);
                     } else {
                        this.aA = (float)((double)this.aA + this.Z.nextGaussian() * 4.0D);
                        var15 = this.aA * 0.017453292F;
                        var37 = qh.a(var15);
                        var17 = qh.b(var15);
                        var38 = this.s + (double)(var37 * (float)this.az * 0.1F);
                        var20 = (double)((float)qh.c(this.C.b) + 1.0F);
                        var22 = this.u + (double)(var17 * (float)this.az * 0.1F);
                        if(this.Z.nextFloat() < 0.15F) {
                           var35.a("bubble", var38, var20 - 0.10000000149011612D, var22, 1, (double)var37, 0.1D, (double)var17, 0.0D);
                        }

                        float var24 = var37 * 0.04F;
                        float var25 = var17 * 0.04F;
                        var35.a("wake", var38, var20, var22, 0, (double)var25, 0.01D, (double)(-var24), 1.0D);
                        var35.a("wake", var38, var20, var22, 0, (double)(-var25), 0.01D, (double)var24, 1.0D);
                     }
                  } else if(this.ay > 0) {
                     this.ay -= var36;
                     var15 = 0.15F;
                     if(this.ay < 20) {
                        var15 = (float)((double)var15 + (double)(20 - this.ay) * 0.05D);
                     } else if(this.ay < 40) {
                        var15 = (float)((double)var15 + (double)(40 - this.ay) * 0.02D);
                     } else if(this.ay < 60) {
                        var15 = (float)((double)var15 + (double)(60 - this.ay) * 0.01D);
                     }

                     if(this.Z.nextFloat() < var15) {
                        var37 = qh.a(this.Z, 0.0F, 360.0F) * 0.017453292F;
                        var17 = qh.a(this.Z, 25.0F, 60.0F);
                        var38 = this.s + (double)(qh.a(var37) * var17 * 0.1F);
                        var20 = (double)((float)qh.c(this.C.b) + 1.0F);
                        var22 = this.u + (double)(qh.b(var37) * var17 * 0.1F);
                        var35.a("splash", var38, var20, var22, 2 + this.Z.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D);
                     }

                     if(this.ay <= 0) {
                        this.aA = qh.a(this.Z, 0.0F, 360.0F);
                        this.az = qh.a(this.Z, 20, 80);
                     }
                  } else {
                     this.ay = qh.a(this.Z, 100, 900);
                     this.ay -= afv.h(this.b) * 20 * 5;
                  }
               }

               if(this.ax > 0) {
                  this.w -= (double)(this.Z.nextFloat() * this.Z.nextFloat() * this.Z.nextFloat()) * 0.2D;
               }
            }

            var13 = var33 * 2.0D - 1.0D;
            this.w += 0.03999999910593033D * var13;
            if(var33 > 0.0D) {
               var31 = (float)((double)var31 * 0.9D);
               this.w *= 0.8D;
            }

            this.v *= (double)var31;
            this.w *= (double)var31;
            this.x *= (double)var31;
            this.b(this.s, this.t, this.u);
         }
      }
   }

   public void b(dh var1) {
      var1.a("xTile", (short)this.g);
      var1.a("yTile", (short)this.h);
      var1.a("zTile", (short)this.i);
      var1.a("inTile", (byte)aji.b(this.at));
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.au?1:0));
   }

   public void a(dh var1) {
      this.g = var1.e("xTile");
      this.h = var1.e("yTile");
      this.i = var1.e("zTile");
      this.at = aji.e(var1.d("inTile") & 255);
      this.a = var1.d("shake") & 255;
      this.au = var1.d("inGround") == 1;
   }

   public int e() {
      if(this.o.E) {
         return 0;
      } else {
         byte var1 = 0;
         if(this.c != null) {
            double var2 = this.b.s - this.s;
            double var4 = this.b.t - this.t;
            double var6 = this.b.u - this.u;
            double var8 = (double)qh.a(var2 * var2 + var4 * var4 + var6 * var6);
            double var10 = 0.1D;
            this.c.v += var2 * var10;
            this.c.w += var4 * var10 + (double)qh.a(var8) * 0.08D;
            this.c.x += var6 * var10;
            var1 = 3;
         } else if(this.ax > 0) {
            xk var13 = new xk(this.o, this.s, this.t, this.u, this.f());
            double var3 = this.b.s - this.s;
            double var5 = this.b.t - this.t;
            double var7 = this.b.u - this.u;
            double var9 = (double)qh.a(var3 * var3 + var5 * var5 + var7 * var7);
            double var11 = 0.1D;
            var13.v = var3 * var11;
            var13.w = var5 * var11 + (double)qh.a(var9) * 0.08D;
            var13.x = var7 * var11;
            this.o.d((sa)var13);
            this.b.o.d((sa)(new sq(this.b.o, this.b.s, this.b.t + 0.5D, this.b.u + 0.5D, this.Z.nextInt(6) + 1)));
            var1 = 1;
         }

         if(this.au) {
            var1 = 2;
         }

         this.B();
         this.b.bK = null;
         return var1;
      }
   }

   private add f() {
      float var1 = this.o.s.nextFloat();
      int var2 = afv.g(this.b);
      int var3 = afv.h(this.b);
      float var4 = 0.1F - (float)var2 * 0.025F - (float)var3 * 0.01F;
      float var5 = 0.05F + (float)var2 * 0.01F - (float)var3 * 0.01F;
      var4 = qh.a(var4, 0.0F, 1.0F);
      var5 = qh.a(var5, 0.0F, 1.0F);
      if(var1 < var4) {
         this.b.a(pp.A, 1);
         return ((xf)qv.a(this.Z, (Collection)d)).a(this.Z);
      } else {
         var1 -= var4;
         if(var1 < var5) {
            this.b.a(pp.B, 1);
            return ((xf)qv.a(this.Z, (Collection)e)).a(this.Z);
         } else {
            float var10000 = var1 - var5;
            this.b.a(pp.z, 1);
            return ((xf)qv.a(this.Z, (Collection)f)).a(this.Z);
         }
      }
   }

   public void B() {
      super.B();
      if(this.b != null) {
         this.b.bK = null;
      }

   }

}
