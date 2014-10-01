import java.util.Random;

public class aog extends aji {

   public aog() {
      super(awt.q);
      this.a(abt.d);
      this.a(true);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 29;
   }

   public int a(ahb var1) {
      return 10;
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      return var5 == 2 && var1.a(var2, var3, var4 + 1).r()?true:(var5 == 3 && var1.a(var2, var3, var4 - 1).r()?true:(var5 == 4 && var1.a(var2 + 1, var3, var4).r()?true:var5 == 5 && var1.a(var2 - 1, var3, var4).r()));
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2 - 1, var3, var4).r()?true:(var1.a(var2 + 1, var3, var4).r()?true:(var1.a(var2, var3, var4 - 1).r()?true:var1.a(var2, var3, var4 + 1).r()));
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      byte var10 = 0;
      if(var5 == 2 && var1.c(var2, var3, var4 + 1, true)) {
         var10 = 2;
      }

      if(var5 == 3 && var1.c(var2, var3, var4 - 1, true)) {
         var10 = 0;
      }

      if(var5 == 4 && var1.c(var2 + 1, var3, var4, true)) {
         var10 = 1;
      }

      if(var5 == 5 && var1.c(var2 - 1, var3, var4, true)) {
         var10 = 3;
      }

      return var10;
   }

   public void e(ahb var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, false, var5, false, -1, 0);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(var5 != this) {
         if(this.e(var1, var2, var3, var4)) {
            int var6 = var1.e(var2, var3, var4);
            int var7 = var6 & 3;
            boolean var8 = false;
            if(!var1.a(var2 - 1, var3, var4).r() && var7 == 3) {
               var8 = true;
            }

            if(!var1.a(var2 + 1, var3, var4).r() && var7 == 1) {
               var8 = true;
            }

            if(!var1.a(var2, var3, var4 - 1).r() && var7 == 0) {
               var8 = true;
            }

            if(!var1.a(var2, var3, var4 + 1).r() && var7 == 2) {
               var8 = true;
            }

            if(var8) {
               this.b(var1, var2, var3, var4, var6, 0);
               var1.f(var2, var3, var4);
            }
         }

      }
   }

   public void a(ahb var1, int var2, int var3, int var4, boolean var5, int var6, boolean var7, int var8, int var9) {
      int var10 = var6 & 3;
      boolean var11 = (var6 & 4) == 4;
      boolean var12 = (var6 & 8) == 8;
      boolean var13 = !var5;
      boolean var14 = false;
      boolean var15 = !ahb.a((ahl)var1, var2, var3 - 1, var4);
      int var16 = p.a[var10];
      int var17 = p.b[var10];
      int var18 = 0;
      int[] var19 = new int[42];

      int var20;
      int var21;
      int var22;
      int var24;
      for(var20 = 1; var20 < 42; ++var20) {
         var21 = var2 + var16 * var20;
         var22 = var4 + var17 * var20;
         aji var23 = var1.a(var21, var3, var22);
         if(var23 == ajn.bC) {
            var24 = var1.e(var21, var3, var22);
            if((var24 & 3) == p.f[var10]) {
               var18 = var20;
            }
            break;
         }

         if(var23 != ajn.bD && var20 != var8) {
            var19[var20] = -1;
            var13 = false;
         } else {
            var24 = var20 == var8?var9:var1.e(var21, var3, var22);
            boolean var25 = (var24 & 8) != 8;
            boolean var26 = (var24 & 1) == 1;
            boolean var27 = (var24 & 2) == 2;
            var13 &= var27 == var15;
            var14 |= var25 && var26;
            var19[var20] = var24;
            if(var20 == var8) {
               var1.a(var2, var3, var4, this, this.a(var1));
               var13 &= var25;
            }
         }
      }

      var13 &= var18 > 1;
      var14 &= var13;
      var20 = (var13?4:0) | (var14?8:0);
      var6 = var10 | var20;
      int var28;
      if(var18 > 0) {
         var21 = var2 + var16 * var18;
         var22 = var4 + var17 * var18;
         var28 = p.f[var10];
         var1.a(var21, var3, var22, var28 | var20, 3);
         this.a(var1, var21, var3, var22, var28);
         this.a(var1, var21, var3, var22, var13, var14, var11, var12);
      }

      this.a(var1, var2, var3, var4, var13, var14, var11, var12);
      if(!var5) {
         var1.a(var2, var3, var4, var6, 3);
         if(var7) {
            this.a(var1, var2, var3, var4, var10);
         }
      }

      if(var11 != var13) {
         for(var21 = 1; var21 < var18; ++var21) {
            var22 = var2 + var16 * var21;
            var28 = var4 + var17 * var21;
            var24 = var19[var21];
            if(var24 >= 0) {
               if(var13) {
                  var24 |= 4;
               } else {
                  var24 &= -5;
               }

               var1.a(var22, var3, var28, var24, 3);
            }
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      this.a(var1, var2, var3, var4, false, var1.e(var2, var3, var4), true, -1, 0);
   }

   private void a(ahb var1, int var2, int var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      if(var6 && !var8) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.6F);
      } else if(!var6 && var8) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.5F);
      } else if(var5 && !var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.7F);
      } else if(!var5 && var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.bowhit", 0.4F, 1.2F / (var1.s.nextFloat() * 0.2F + 0.9F));
      }

   }

   private void a(ahb var1, int var2, int var3, int var4, int var5) {
      var1.d(var2, var3, var4, this);
      if(var5 == 3) {
         var1.d(var2 - 1, var3, var4, this);
      } else if(var5 == 1) {
         var1.d(var2 + 1, var3, var4, this);
      } else if(var5 == 0) {
         var1.d(var2, var3, var4 - 1, this);
      } else if(var5 == 2) {
         var1.d(var2, var3, var4 + 1, this);
      }

   }

   private boolean e(ahb var1, int var2, int var3, int var4) {
      if(!this.c(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) & 3;
      float var6 = 0.1875F;
      if(var5 == 3) {
         this.a(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 1) {
         this.a(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 0) {
         this.a(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if(var5 == 2) {
         this.a(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      boolean var7 = (var6 & 4) == 4;
      boolean var8 = (var6 & 8) == 8;
      if(var7 || var8) {
         this.a(var1, var2, var3, var4, true, var6, false, -1, 0);
      }

      if(var8) {
         var1.d(var2, var3, var4, this);
         int var9 = var6 & 3;
         if(var9 == 3) {
            var1.d(var2 - 1, var3, var4, this);
         } else if(var9 == 1) {
            var1.d(var2 + 1, var3, var4, this);
         } else if(var9 == 0) {
            var1.d(var2, var3, var4 - 1, this);
         } else if(var9 == 2) {
            var1.d(var2, var3, var4 + 1, this);
         }
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      return (var1.e(var2, var3, var4) & 8) == 8?15:0;
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if((var6 & 8) != 8) {
         return 0;
      } else {
         int var7 = var6 & 3;
         return var7 == 2 && var5 == 2?15:(var7 == 0 && var5 == 3?15:(var7 == 1 && var5 == 4?15:(var7 == 3 && var5 == 5?15:0)));
      }
   }

   public boolean f() {
      return true;
   }
}
