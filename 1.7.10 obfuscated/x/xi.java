import java.util.List;

public class xi extends sa {

   private boolean a;
   private double b;
   private int c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;


   public xi(ahb var1) {
      super(var1);
      this.a = true;
      this.b = 0.07D;
      this.k = true;
      this.a(1.5F, 0.6F);
      this.L = this.N / 2.0F;
   }

   protected boolean g_() {
      return false;
   }

   protected void c() {
      this.af.a(17, new Integer(0));
      this.af.a(18, new Integer(1));
      this.af.a(19, new Float(0.0F));
   }

   public azt h(sa var1) {
      return var1.C;
   }

   public azt J() {
      return this.C;
   }

   public boolean S() {
      return true;
   }

   public xi(ahb var1, double var2, double var4, double var6) {
      this(var1);
      this.b(var2, var4 + (double)this.L, var6);
      this.v = 0.0D;
      this.w = 0.0D;
      this.x = 0.0D;
      this.p = var2;
      this.q = var4;
      this.r = var6;
   }

   public double ae() {
      return (double)this.N * 0.0D - 0.30000001192092896D;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if(!this.o.E && !this.K) {
         this.c(-this.i());
         this.a(10);
         this.a(this.e() + var2 * 10.0F);
         this.Q();
         boolean var3 = var1.j() instanceof yz && ((yz)var1.j()).bE.d;
         if(var3 || this.e() > 40.0F) {
            if(this.l != null) {
               this.l.a((sa)this);
            }

            if(!var3) {
               this.a(ade.az, 1, 0.0F);
            }

            this.B();
         }

         return true;
      } else {
         return true;
      }
   }

   public boolean R() {
      return !this.K;
   }

   public void h() {
      super.h();
      if(this.f() > 0) {
         this.a(this.f() - 1);
      }

      if(this.e() > 0.0F) {
         this.a(this.e() - 1.0F);
      }

      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.C.b + (this.C.e - this.C.b) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.C.b + (this.C.e - this.C.b) * (double)(var4 + 1) / (double)var1 - 0.125D;
         azt var9 = azt.a(this.C.a, var5, this.C.c, this.C.d, var7, this.C.f);
         if(this.o.b(var9, awt.h)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var19 = Math.sqrt(this.v * this.v + this.x * this.x);
      double var6;
      double var8;
      int var10;
      if(var19 > 0.26249999999999996D) {
         var6 = Math.cos((double)this.y * 3.141592653589793D / 180.0D);
         var8 = Math.sin((double)this.y * 3.141592653589793D / 180.0D);

         for(var10 = 0; (double)var10 < 1.0D + var19 * 60.0D; ++var10) {
            double var11 = (double)(this.Z.nextFloat() * 2.0F - 1.0F);
            double var13 = (double)(this.Z.nextInt(2) * 2 - 1) * 0.7D;
            double var15;
            double var17;
            if(this.Z.nextBoolean()) {
               var15 = this.s - var6 * var11 * 0.8D + var8 * var13;
               var17 = this.u - var8 * var11 * 0.8D - var6 * var13;
               this.o.a("splash", var15, this.t - 0.125D, var17, this.v, this.w, this.x);
            } else {
               var15 = this.s + var6 + var8 * var11 * 0.7D;
               var17 = this.u + var8 - var6 * var11 * 0.7D;
               this.o.a("splash", var15, this.t - 0.125D, var17, this.v, this.w, this.x);
            }
         }
      }

      double var24;
      double var26;
      if(this.o.E && this.a) {
         if(this.c > 0) {
            var6 = this.s + (this.d - this.s) / (double)this.c;
            var8 = this.t + (this.e - this.t) / (double)this.c;
            var24 = this.u + (this.f - this.u) / (double)this.c;
            var26 = qh.g(this.g - (double)this.y);
            this.y = (float)((double)this.y + var26 / (double)this.c);
            this.z = (float)((double)this.z + (this.h - (double)this.z) / (double)this.c);
            --this.c;
            this.b(var6, var8, var24);
            this.b(this.y, this.z);
         } else {
            var6 = this.s + this.v;
            var8 = this.t + this.w;
            var24 = this.u + this.x;
            this.b(var6, var8, var24);
            if(this.D) {
               this.v *= 0.5D;
               this.w *= 0.5D;
               this.x *= 0.5D;
            }

            this.v *= 0.9900000095367432D;
            this.w *= 0.949999988079071D;
            this.x *= 0.9900000095367432D;
         }

      } else {
         if(var2 < 1.0D) {
            var6 = var2 * 2.0D - 1.0D;
            this.w += 0.03999999910593033D * var6;
         } else {
            if(this.w < 0.0D) {
               this.w /= 2.0D;
            }

            this.w += 0.007000000216066837D;
         }

         if(this.l != null && this.l instanceof sv) {
            sv var20 = (sv)this.l;
            float var21 = this.l.y + -var20.bd * 90.0F;
            this.v += -Math.sin((double)(var21 * 3.1415927F / 180.0F)) * this.b * (double)var20.be * 0.05000000074505806D;
            this.x += Math.cos((double)(var21 * 3.1415927F / 180.0F)) * this.b * (double)var20.be * 0.05000000074505806D;
         }

         var6 = Math.sqrt(this.v * this.v + this.x * this.x);
         if(var6 > 0.35D) {
            var8 = 0.35D / var6;
            this.v *= var8;
            this.x *= var8;
            var6 = 0.35D;
         }

         if(var6 > var19 && this.b < 0.35D) {
            this.b += (0.35D - this.b) / 35.0D;
            if(this.b > 0.35D) {
               this.b = 0.35D;
            }
         } else {
            this.b -= (this.b - 0.07D) / 35.0D;
            if(this.b < 0.07D) {
               this.b = 0.07D;
            }
         }

         int var22;
         for(var22 = 0; var22 < 4; ++var22) {
            int var23 = qh.c(this.s + ((double)(var22 % 2) - 0.5D) * 0.8D);
            var10 = qh.c(this.u + ((double)(var22 / 2) - 0.5D) * 0.8D);

            for(int var25 = 0; var25 < 2; ++var25) {
               int var12 = qh.c(this.t) + var25;
               aji var27 = this.o.a(var23, var12, var10);
               if(var27 == ajn.aC) {
                  this.o.f(var23, var12, var10);
                  this.E = false;
               } else if(var27 == ajn.bi) {
                  this.o.a(var23, var12, var10, true);
                  this.E = false;
               }
            }
         }

         if(this.D) {
            this.v *= 0.5D;
            this.w *= 0.5D;
            this.x *= 0.5D;
         }

         this.d(this.v, this.w, this.x);
         if(this.E && var19 > 0.2D) {
            if(!this.o.E && !this.K) {
               this.B();

               for(var22 = 0; var22 < 3; ++var22) {
                  this.a(adb.a(ajn.f), 1, 0.0F);
               }

               for(var22 = 0; var22 < 2; ++var22) {
                  this.a(ade.y, 1, 0.0F);
               }
            }
         } else {
            this.v *= 0.9900000095367432D;
            this.w *= 0.949999988079071D;
            this.x *= 0.9900000095367432D;
         }

         this.z = 0.0F;
         var8 = (double)this.y;
         var24 = this.p - this.s;
         var26 = this.r - this.u;
         if(var24 * var24 + var26 * var26 > 0.001D) {
            var8 = (double)((float)(Math.atan2(var26, var24) * 180.0D / 3.141592653589793D));
         }

         double var14 = qh.g(var8 - (double)this.y);
         if(var14 > 20.0D) {
            var14 = 20.0D;
         }

         if(var14 < -20.0D) {
            var14 = -20.0D;
         }

         this.y = (float)((double)this.y + var14);
         this.b(this.y, this.z);
         if(!this.o.E) {
            List var16 = this.o.b((sa)this, this.C.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
            if(var16 != null && !var16.isEmpty()) {
               for(int var28 = 0; var28 < var16.size(); ++var28) {
                  sa var18 = (sa)var16.get(var28);
                  if(var18 != this.l && var18.S() && var18 instanceof xi) {
                     var18.g(this);
                  }
               }
            }

            if(this.l != null && this.l.K) {
               this.l = null;
            }

         }
      }
   }

   public void ac() {
      if(this.l != null) {
         double var1 = Math.cos((double)this.y * 3.141592653589793D / 180.0D) * 0.4D;
         double var3 = Math.sin((double)this.y * 3.141592653589793D / 180.0D) * 0.4D;
         this.l.b(this.s + var1, this.t + this.ae() + this.l.ad(), this.u + var3);
      }
   }

   protected void b(dh var1) {}

   protected void a(dh var1) {}

   public boolean c(yz var1) {
      if(this.l != null && this.l instanceof yz && this.l != var1) {
         return true;
      } else {
         if(!this.o.E) {
            var1.a((sa)this);
         }

         return true;
      }
   }

   protected void a(double var1, boolean var3) {
      int var4 = qh.c(this.s);
      int var5 = qh.c(this.t);
      int var6 = qh.c(this.u);
      if(var3) {
         if(this.R > 3.0F) {
            this.b(this.R);
            if(!this.o.E && !this.K) {
               this.B();

               int var7;
               for(var7 = 0; var7 < 3; ++var7) {
                  this.a(adb.a(ajn.f), 1, 0.0F);
               }

               for(var7 = 0; var7 < 2; ++var7) {
                  this.a(ade.y, 1, 0.0F);
               }
            }

            this.R = 0.0F;
         }
      } else if(this.o.a(var4, var5 - 1, var6).o() != awt.h && var1 < 0.0D) {
         this.R = (float)((double)this.R - var1);
      }

   }

   public void a(float var1) {
      this.af.b(19, Float.valueOf(var1));
   }

   public float e() {
      return this.af.d(19);
   }

   public void a(int var1) {
      this.af.b(17, Integer.valueOf(var1));
   }

   public int f() {
      return this.af.c(17);
   }

   public void c(int var1) {
      this.af.b(18, Integer.valueOf(var1));
   }

   public int i() {
      return this.af.c(18);
   }
}
