import java.util.Random;

public class arx extends arn {

   private aji a;


   public arx(aji var1) {
      this.a = var1;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      var3 -= 8;

      for(var5 -= 8; var4 > 5 && var1.c(var3, var4, var5); --var4) {
         ;
      }

      if(var4 <= 4) {
         return false;
      } else {
         var4 -= 4;
         boolean[] var6 = new boolean[2048];
         int var7 = var2.nextInt(4) + 4;

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            double var9 = var2.nextDouble() * 6.0D + 3.0D;
            double var11 = var2.nextDouble() * 4.0D + 2.0D;
            double var13 = var2.nextDouble() * 6.0D + 3.0D;
            double var15 = var2.nextDouble() * (16.0D - var9 - 2.0D) + 1.0D + var9 / 2.0D;
            double var17 = var2.nextDouble() * (8.0D - var11 - 4.0D) + 2.0D + var11 / 2.0D;
            double var19 = var2.nextDouble() * (16.0D - var13 - 2.0D) + 1.0D + var13 / 2.0D;

            for(int var21 = 1; var21 < 15; ++var21) {
               for(int var22 = 1; var22 < 15; ++var22) {
                  for(int var23 = 1; var23 < 7; ++var23) {
                     double var24 = ((double)var21 - var15) / (var9 / 2.0D);
                     double var26 = ((double)var23 - var17) / (var11 / 2.0D);
                     double var28 = ((double)var22 - var19) / (var13 / 2.0D);
                     double var30 = var24 * var24 + var26 * var26 + var28 * var28;
                     if(var30 < 1.0D) {
                        var6[(var21 * 16 + var22) * 8 + var23] = true;
                     }
                  }
               }
            }
         }

         int var10;
         int var32;
         boolean var34;
         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 0; var10 < 8; ++var10) {
                  var34 = !var6[(var8 * 16 + var32) * 8 + var10] && (var8 < 15 && var6[((var8 + 1) * 16 + var32) * 8 + var10] || var8 > 0 && var6[((var8 - 1) * 16 + var32) * 8 + var10] || var32 < 15 && var6[(var8 * 16 + var32 + 1) * 8 + var10] || var32 > 0 && var6[(var8 * 16 + (var32 - 1)) * 8 + var10] || var10 < 7 && var6[(var8 * 16 + var32) * 8 + var10 + 1] || var10 > 0 && var6[(var8 * 16 + var32) * 8 + (var10 - 1)]);
                  if(var34) {
                     awt var12 = var1.a(var3 + var8, var4 + var10, var5 + var32).o();
                     if(var10 >= 4 && var12.d()) {
                        return false;
                     }

                     if(var10 < 4 && !var12.a() && var1.a(var3 + var8, var4 + var10, var5 + var32) != this.a) {
                        return false;
                     }
                  }
               }
            }
         }

         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 0; var10 < 8; ++var10) {
                  if(var6[(var8 * 16 + var32) * 8 + var10]) {
                     var1.d(var3 + var8, var4 + var10, var5 + var32, var10 >= 4?ajn.a:this.a, 0, 2);
                  }
               }
            }
         }

         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 4; var10 < 8; ++var10) {
                  if(var6[(var8 * 16 + var32) * 8 + var10] && var1.a(var3 + var8, var4 + var10 - 1, var5 + var32) == ajn.d && var1.b(ahn.a, var3 + var8, var4 + var10, var5 + var32) > 0) {
                     ahu var35 = var1.a(var3 + var8, var5 + var32);
                     if(var35.ai == ajn.bh) {
                        var1.d(var3 + var8, var4 + var10 - 1, var5 + var32, ajn.bh, 0, 2);
                     } else {
                        var1.d(var3 + var8, var4 + var10 - 1, var5 + var32, ajn.c, 0, 2);
                     }
                  }
               }
            }
         }

         if(this.a.o() == awt.i) {
            for(var8 = 0; var8 < 16; ++var8) {
               for(var32 = 0; var32 < 16; ++var32) {
                  for(var10 = 0; var10 < 8; ++var10) {
                     var34 = !var6[(var8 * 16 + var32) * 8 + var10] && (var8 < 15 && var6[((var8 + 1) * 16 + var32) * 8 + var10] || var8 > 0 && var6[((var8 - 1) * 16 + var32) * 8 + var10] || var32 < 15 && var6[(var8 * 16 + var32 + 1) * 8 + var10] || var32 > 0 && var6[(var8 * 16 + (var32 - 1)) * 8 + var10] || var10 < 7 && var6[(var8 * 16 + var32) * 8 + var10 + 1] || var10 > 0 && var6[(var8 * 16 + var32) * 8 + (var10 - 1)]);
                     if(var34 && (var10 < 4 || var2.nextInt(2) != 0) && var1.a(var3 + var8, var4 + var10, var5 + var32).o().a()) {
                        var1.d(var3 + var8, var4 + var10, var5 + var32, ajn.b, 0, 2);
                     }
                  }
               }
            }
         }

         if(this.a.o() == awt.h) {
            for(var8 = 0; var8 < 16; ++var8) {
               for(var32 = 0; var32 < 16; ++var32) {
                  byte var33 = 4;
                  if(var1.r(var3 + var8, var4 + var33, var5 + var32)) {
                     var1.d(var3 + var8, var4 + var33, var5 + var32, ajn.aD, 0, 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
