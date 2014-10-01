
public class vv {

   private sw a;
   private ahb b;
   private ayf c;
   private double d;
   private ti e;
   private boolean f;
   private int g;
   private int h;
   private azw i = azw.a(0.0D, 0.0D, 0.0D);
   private boolean j = true;
   private boolean k;
   private boolean l;
   private boolean m;


   public vv(sw var1, ahb var2) {
      this.a = var1;
      this.b = var2;
      this.e = var1.a(yj.b);
   }

   public void a(boolean var1) {
      this.l = var1;
   }

   public boolean a() {
      return this.l;
   }

   public void b(boolean var1) {
      this.k = var1;
   }

   public void c(boolean var1) {
      this.j = var1;
   }

   public boolean c() {
      return this.k;
   }

   public void d(boolean var1) {
      this.f = var1;
   }

   public void a(double var1) {
      this.d = var1;
   }

   public void e(boolean var1) {
      this.m = var1;
   }

   public float d() {
      return (float)this.e.e();
   }

   public ayf a(double var1, double var3, double var5) {
      return !this.l()?null:this.b.a(this.a, qh.c(var1), (int)var3, qh.c(var5), this.d(), this.j, this.k, this.l, this.m);
   }

   public boolean a(double var1, double var3, double var5, double var7) {
      ayf var9 = this.a((double)qh.c(var1), (double)((int)var3), (double)qh.c(var5));
      return this.a(var9, var7);
   }

   public ayf a(sa var1) {
      return !this.l()?null:this.b.a(this.a, var1, this.d(), this.j, this.k, this.l, this.m);
   }

   public boolean a(sa var1, double var2) {
      ayf var4 = this.a(var1);
      return var4 != null?this.a(var4, var2):false;
   }

   public boolean a(ayf var1, double var2) {
      if(var1 == null) {
         this.c = null;
         return false;
      } else {
         if(!var1.a(this.c)) {
            this.c = var1;
         }

         if(this.f) {
            this.n();
         }

         if(this.c.d() == 0) {
            return false;
         } else {
            this.d = var2;
            azw var4 = this.j();
            this.h = this.g;
            this.i.a = var4.a;
            this.i.b = var4.b;
            this.i.c = var4.c;
            return true;
         }
      }
   }

   public ayf e() {
      return this.c;
   }

   public void f() {
      ++this.g;
      if(!this.g()) {
         if(this.l()) {
            this.i();
         }

         if(!this.g()) {
            azw var1 = this.c.a((sa)this.a);
            if(var1 != null) {
               this.a.k().a(var1.a, var1.b, var1.c, this.d);
            }
         }
      }
   }

   private void i() {
      azw var1 = this.j();
      int var2 = this.c.d();

      for(int var3 = this.c.e(); var3 < this.c.d(); ++var3) {
         if(this.c.a(var3).b != (int)var1.b) {
            var2 = var3;
            break;
         }
      }

      float var8 = this.a.M * this.a.M;

      int var4;
      for(var4 = this.c.e(); var4 < var2; ++var4) {
         if(var1.e(this.c.a(this.a, var4)) < (double)var8) {
            this.c.c(var4 + 1);
         }
      }

      var4 = qh.f(this.a.M);
      int var5 = (int)this.a.N + 1;
      int var6 = var4;

      for(int var7 = var2 - 1; var7 >= this.c.e(); --var7) {
         if(this.a(var1, this.c.a(this.a, var7), var4, var5, var6)) {
            this.c.c(var7);
            break;
         }
      }

      if(this.g - this.h > 100) {
         if(var1.e(this.i) < 2.25D) {
            this.h();
         }

         this.h = this.g;
         this.i.a = var1.a;
         this.i.b = var1.b;
         this.i.c = var1.c;
      }

   }

   public boolean g() {
      return this.c == null || this.c.b();
   }

   public void h() {
      this.c = null;
   }

   private azw j() {
      return azw.a(this.a.s, (double)this.k(), this.a.u);
   }

   private int k() {
      if(this.a.M() && this.m) {
         int var1 = (int)this.a.C.b;
         aji var2 = this.b.a(qh.c(this.a.s), var1, qh.c(this.a.u));
         int var3 = 0;

         do {
            if(var2 != ajn.i && var2 != ajn.j) {
               return var1;
            }

            ++var1;
            var2 = this.b.a(qh.c(this.a.s), var1, qh.c(this.a.u));
            ++var3;
         } while(var3 <= 16);

         return (int)this.a.C.b;
      } else {
         return (int)(this.a.C.b + 0.5D);
      }
   }

   private boolean l() {
      return this.a.D || this.m && this.m() || this.a.am() && this.a instanceof yq && this.a.m instanceof wg;
   }

   private boolean m() {
      return this.a.M() || this.a.P();
   }

   private void n() {
      if(!this.b.i(qh.c(this.a.s), (int)(this.a.C.b + 0.5D), qh.c(this.a.u))) {
         for(int var1 = 0; var1 < this.c.d(); ++var1) {
            aye var2 = this.c.a(var1);
            if(this.b.i(var2.a, var2.b, var2.c)) {
               this.c.b(var1 - 1);
               return;
            }
         }

      }
   }

   private boolean a(azw var1, azw var2, int var3, int var4, int var5) {
      int var6 = qh.c(var1.a);
      int var7 = qh.c(var1.c);
      double var8 = var2.a - var1.a;
      double var10 = var2.c - var1.c;
      double var12 = var8 * var8 + var10 * var10;
      if(var12 < 1.0E-8D) {
         return false;
      } else {
         double var14 = 1.0D / Math.sqrt(var12);
         var8 *= var14;
         var10 *= var14;
         var3 += 2;
         var5 += 2;
         if(!this.a(var6, (int)var1.b, var7, var3, var4, var5, var1, var8, var10)) {
            return false;
         } else {
            var3 -= 2;
            var5 -= 2;
            double var16 = 1.0D / Math.abs(var8);
            double var18 = 1.0D / Math.abs(var10);
            double var20 = (double)(var6 * 1) - var1.a;
            double var22 = (double)(var7 * 1) - var1.c;
            if(var8 >= 0.0D) {
               ++var20;
            }

            if(var10 >= 0.0D) {
               ++var22;
            }

            var20 /= var8;
            var22 /= var10;
            int var24 = var8 < 0.0D?-1:1;
            int var25 = var10 < 0.0D?-1:1;
            int var26 = qh.c(var2.a);
            int var27 = qh.c(var2.c);
            int var28 = var26 - var6;
            int var29 = var27 - var7;

            do {
               if(var28 * var24 <= 0 && var29 * var25 <= 0) {
                  return true;
               }

               if(var20 < var22) {
                  var20 += var16;
                  var6 += var24;
                  var28 = var26 - var6;
               } else {
                  var22 += var18;
                  var7 += var25;
                  var29 = var27 - var7;
               }
            } while(this.a(var6, (int)var1.b, var7, var3, var4, var5, var1, var8, var10));

            return false;
         }
      }
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, azw var7, double var8, double var10) {
      int var12 = var1 - var4 / 2;
      int var13 = var3 - var6 / 2;
      if(!this.b(var12, var2, var13, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for(int var14 = var12; var14 < var12 + var4; ++var14) {
            for(int var15 = var13; var15 < var13 + var6; ++var15) {
               double var16 = (double)var14 + 0.5D - var7.a;
               double var18 = (double)var15 + 0.5D - var7.c;
               if(var16 * var8 + var18 * var10 >= 0.0D) {
                  aji var20 = this.b.a(var14, var2 - 1, var15);
                  awt var21 = var20.o();
                  if(var21 == awt.a) {
                     return false;
                  }

                  if(var21 == awt.h && !this.a.M()) {
                     return false;
                  }

                  if(var21 == awt.i) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private boolean b(int var1, int var2, int var3, int var4, int var5, int var6, azw var7, double var8, double var10) {
      for(int var12 = var1; var12 < var1 + var4; ++var12) {
         for(int var13 = var2; var13 < var2 + var5; ++var13) {
            for(int var14 = var3; var14 < var3 + var6; ++var14) {
               double var15 = (double)var12 + 0.5D - var7.a;
               double var17 = (double)var14 + 0.5D - var7.c;
               if(var15 * var8 + var17 * var10 >= 0.0D) {
                  aji var19 = this.b.a(var12, var13, var14);
                  if(!var19.b((ahl)this.b, var12, var13, var14)) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }
}
