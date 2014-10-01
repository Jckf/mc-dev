import java.util.Random;

public class aoh extends aji {

   public aoh() {
      super(awt.l);
      this.a(true);
      this.a(abt.c);
   }

   public void g() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int b() {
      return 20;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      int var6 = var1.e(var2, var3, var4);
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = 1.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      boolean var13 = var6 > 0;
      if((var6 & 2) != 0) {
         var10 = Math.max(var10, 0.0625F);
         var7 = 0.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if((var6 & 8) != 0) {
         var7 = Math.min(var7, 0.9375F);
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if((var6 & 4) != 0) {
         var12 = Math.max(var12, 0.0625F);
         var9 = 0.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if((var6 & 1) != 0) {
         var9 = Math.min(var9, 0.9375F);
         var12 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if(!var13 && this.a(var1.a(var2, var3 + 1, var4))) {
         var8 = Math.min(var8, 0.9375F);
         var11 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
      }

      this.a(var7, var8, var9, var10, var11, var12);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      switch(var5) {
      case 1:
         return this.a(var1.a(var2, var3 + 1, var4));
      case 2:
         return this.a(var1.a(var2, var3, var4 + 1));
      case 3:
         return this.a(var1.a(var2, var3, var4 - 1));
      case 4:
         return this.a(var1.a(var2 + 1, var3, var4));
      case 5:
         return this.a(var1.a(var2 - 1, var3, var4));
      default:
         return false;
      }
   }

   private boolean a(aji var1) {
      return var1.d() && var1.J.c();
   }

   private boolean e(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = var5;
      if(var5 > 0) {
         for(int var7 = 0; var7 <= 3; ++var7) {
            int var8 = 1 << var7;
            if((var5 & var8) != 0 && !this.a(var1.a(var2 + p.a[var7], var3, var4 + p.b[var7])) && (var1.a(var2, var3 + 1, var4) != this || (var1.e(var2, var3 + 1, var4) & var8) == 0)) {
               var6 &= ~var8;
            }
         }
      }

      if(var6 == 0 && !this.a(var1.a(var2, var3 + 1, var4))) {
         return false;
      } else {
         if(var6 != var5) {
            var1.a(var2, var3, var4, var6, 2);
         }

         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E && !this.e(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E && var1.s.nextInt(4) == 0) {
         byte var6 = 4;
         int var7 = 5;
         boolean var8 = false;

         int var9;
         int var10;
         int var11;
         label134:
         for(var9 = var2 - var6; var9 <= var2 + var6; ++var9) {
            for(var10 = var4 - var6; var10 <= var4 + var6; ++var10) {
               for(var11 = var3 - 1; var11 <= var3 + 1; ++var11) {
                  if(var1.a(var9, var11, var10) == this) {
                     --var7;
                     if(var7 <= 0) {
                        var8 = true;
                        break label134;
                     }
                  }
               }
            }
         }

         var9 = var1.e(var2, var3, var4);
         var10 = var1.s.nextInt(6);
         var11 = p.e[var10];
         int var13;
         if(var10 == 1 && var3 < 255 && var1.c(var2, var3 + 1, var4)) {
            if(var8) {
               return;
            }

            int var15 = var1.s.nextInt(16) & var9;
            if(var15 > 0) {
               for(var13 = 0; var13 <= 3; ++var13) {
                  if(!this.a(var1.a(var2 + p.a[var13], var3 + 1, var4 + p.b[var13]))) {
                     var15 &= ~(1 << var13);
                  }
               }

               if(var15 > 0) {
                  var1.d(var2, var3 + 1, var4, this, var15, 2);
               }
            }
         } else {
            aji var12;
            int var14;
            if(var10 >= 2 && var10 <= 5 && (var9 & 1 << var11) == 0) {
               if(var8) {
                  return;
               }

               var12 = var1.a(var2 + p.a[var11], var3, var4 + p.b[var11]);
               if(var12.J == awt.a) {
                  var13 = var11 + 1 & 3;
                  var14 = var11 + 3 & 3;
                  if((var9 & 1 << var13) != 0 && this.a(var1.a(var2 + p.a[var11] + p.a[var13], var3, var4 + p.b[var11] + p.b[var13]))) {
                     var1.d(var2 + p.a[var11], var3, var4 + p.b[var11], this, 1 << var13, 2);
                  } else if((var9 & 1 << var14) != 0 && this.a(var1.a(var2 + p.a[var11] + p.a[var14], var3, var4 + p.b[var11] + p.b[var14]))) {
                     var1.d(var2 + p.a[var11], var3, var4 + p.b[var11], this, 1 << var14, 2);
                  } else if((var9 & 1 << var13) != 0 && var1.c(var2 + p.a[var11] + p.a[var13], var3, var4 + p.b[var11] + p.b[var13]) && this.a(var1.a(var2 + p.a[var13], var3, var4 + p.b[var13]))) {
                     var1.d(var2 + p.a[var11] + p.a[var13], var3, var4 + p.b[var11] + p.b[var13], this, 1 << (var11 + 2 & 3), 2);
                  } else if((var9 & 1 << var14) != 0 && var1.c(var2 + p.a[var11] + p.a[var14], var3, var4 + p.b[var11] + p.b[var14]) && this.a(var1.a(var2 + p.a[var14], var3, var4 + p.b[var14]))) {
                     var1.d(var2 + p.a[var11] + p.a[var14], var3, var4 + p.b[var11] + p.b[var14], this, 1 << (var11 + 2 & 3), 2);
                  } else if(this.a(var1.a(var2 + p.a[var11], var3 + 1, var4 + p.b[var11]))) {
                     var1.d(var2 + p.a[var11], var3, var4 + p.b[var11], this, 0, 2);
                  }
               } else if(var12.J.k() && var12.d()) {
                  var1.a(var2, var3, var4, var9 | 1 << var11, 2);
               }
            } else if(var3 > 1) {
               var12 = var1.a(var2, var3 - 1, var4);
               if(var12.J == awt.a) {
                  var13 = var1.s.nextInt(16) & var9;
                  if(var13 > 0) {
                     var1.d(var2, var3 - 1, var4, this, var13, 2);
                  }
               } else if(var12 == this) {
                  var13 = var1.s.nextInt(16) & var9;
                  var14 = var1.e(var2, var3 - 1, var4);
                  if(var14 != (var14 | var13)) {
                     var1.a(var2, var3 - 1, var4, var14 | var13, 2);
                  }
               }
            }
         }
      }

   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      byte var10 = 0;
      switch(var5) {
      case 2:
         var10 = 1;
         break;
      case 3:
         var10 = 4;
         break;
      case 4:
         var10 = 8;
         break;
      case 5:
         var10 = 2;
      }

      return var10 != 0?var10:var9;
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      if(!var1.E && var2.bF() != null && var2.bF().b() == ade.aZ) {
         var2.a(pp.C[aji.b((aji)this)], 1);
         this.a(var1, var3, var4, var5, new add(ajn.bd, 1, 0));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
