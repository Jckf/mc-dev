import java.util.Random;

public abstract class alt extends aod {

   int[] a;
   protected rf[][] M = new rf[2][];


   public alt() {
      super(awt.j, false);
      this.a(true);
      this.a(abt.c);
      this.c(0.2F);
      this.g(1);
      this.a(h);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      byte var7 = 1;
      int var8 = var7 + 1;
      if(var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  if(var1.a(var2 + var9, var3 + var10, var4 + var11).o() == awt.j) {
                     int var12 = var1.e(var2 + var9, var3 + var10, var4 + var11);
                     var1.a(var2 + var9, var3 + var10, var4 + var11, var12 | 8, 4);
                  }
               }
            }
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         int var6 = var1.e(var2, var3, var4);
         if((var6 & 8) != 0 && (var6 & 4) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if(this.a == null) {
               this.a = new int[var9 * var9 * var9];
            }

            int var12;
            if(var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
               int var13;
               int var14;
               for(var12 = -var7; var12 <= var7; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        aji var15 = var1.a(var2 + var12, var3 + var13, var4 + var14);
                        if(var15 != ajn.r && var15 != ajn.s) {
                           if(var15.o() == awt.j) {
                              this.a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
                           } else {
                              this.a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
                           }
                        } else {
                           this.a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        }
                     }
                  }
               }

               for(var12 = 1; var12 <= 4; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        for(int var16 = -var7; var16 <= var7; ++var16) {
                           if(this.a[(var13 + var11) * var10 + (var14 + var11) * var9 + var16 + var11] == var12 - 1) {
                              if(this.a[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var16 + var11] == -2) {
                                 this.a[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var16 + var11] = var12;
                              }

                              if(this.a[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var16 + var11] == -2) {
                                 this.a[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var16 + var11] = var12;
                              }

                              if(this.a[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var16 + var11] == -2) {
                                 this.a[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var16 + var11] = var12;
                              }

                              if(this.a[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var16 + var11] == -2) {
                                 this.a[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var16 + var11] = var12;
                              }

                              if(this.a[(var13 + var11) * var10 + (var14 + var11) * var9 + (var16 + var11 - 1)] == -2) {
                                 this.a[(var13 + var11) * var10 + (var14 + var11) * var9 + (var16 + var11 - 1)] = var12;
                              }

                              if(this.a[(var13 + var11) * var10 + (var14 + var11) * var9 + var16 + var11 + 1] == -2) {
                                 this.a[(var13 + var11) * var10 + (var14 + var11) * var9 + var16 + var11 + 1] = var12;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var12 = this.a[var11 * var10 + var11 * var9 + var11];
            if(var12 >= 0) {
               var1.a(var2, var3, var4, var6 & -9, 4);
            } else {
               this.e(var1, var2, var3, var4);
            }
         }

      }
   }

   private void e(ahb var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
      var1.f(var2, var3, var4);
   }

   public int a(Random var1) {
      return var1.nextInt(20) == 0?1:0;
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a(ajn.g);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.E) {
         int var8 = this.b(var5);
         if(var7 > 0) {
            var8 -= 2 << var7;
            if(var8 < 10) {
               var8 = 10;
            }
         }

         if(var1.s.nextInt(var8) == 0) {
            adb var9 = this.a(var5, var1.s, var7);
            this.a(var1, var2, var3, var4, new add(var9, 1, this.a(var5)));
         }

         var8 = 200;
         if(var7 > 0) {
            var8 -= 10 << var7;
            if(var8 < 40) {
               var8 = 40;
            }
         }

         this.c(var1, var2, var3, var4, var5, var8);
      }

   }

   protected void c(ahb var1, int var2, int var3, int var4, int var5, int var6) {}

   protected int b(int var1) {
      return 20;
   }

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      if(!var1.E && var2.bF() != null && var2.bF().b() == ade.aZ) {
         var2.a(pp.C[aji.b((aji)this)], 1);
         this.a(var1, var3, var4, var5, new add(adb.a((aji)this), 1, var6 & 3));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int a(int var1) {
      return var1 & 3;
   }

   public boolean c() {
      return !this.P;
   }

   protected add j(int var1) {
      return new add(adb.a((aji)this), 1, var1 & 3);
   }

   public abstract String[] e();
}
