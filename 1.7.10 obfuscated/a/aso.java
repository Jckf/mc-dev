import java.util.Random;

public class aso extends arc {

   public aso() {
      super(false);
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6;
      for(var6 = var2.nextInt(4) + 5; var1.a(var3, var4 - 1, var5).o() == awt.h; --var4) {
         ;
      }

      boolean var7 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var10;
         int var11;
         for(int var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 1;
            if(var8 == var4) {
               var9 = 0;
            }

            if(var8 >= var4 + 1 + var6 - 2) {
               var9 = 3;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if(var8 >= 0 && var8 < 256) {
                     aji var12 = var1.a(var10, var8, var11);
                     if(var12.o() != awt.a && var12.o() != awt.j) {
                        if(var12 != ajn.j && var12 != ajn.i) {
                           var7 = false;
                        } else if(var8 > var4) {
                           var7 = false;
                        }
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         if(!var7) {
            return false;
         } else {
            aji var16 = var1.a(var3, var4 - 1, var5);
            if((var16 == ajn.c || var16 == ajn.d) && var4 < 256 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, ajn.d);

               int var13;
               int var17;
               int var19;
               for(var17 = var4 - 3 + var6; var17 <= var4 + var6; ++var17) {
                  var10 = var17 - (var4 + var6);
                  var11 = 2 - var10 / 2;

                  for(var19 = var3 - var11; var19 <= var3 + var11; ++var19) {
                     var13 = var19 - var3;

                     for(int var14 = var5 - var11; var14 <= var5 + var11; ++var14) {
                        int var15 = var14 - var5;
                        if((Math.abs(var13) != var11 || Math.abs(var15) != var11 || var2.nextInt(2) != 0 && var10 != 0) && !var1.a(var19, var17, var14).j()) {
                           this.a(var1, var19, var17, var14, ajn.t);
                        }
                     }
                  }
               }

               for(var17 = 0; var17 < var6; ++var17) {
                  aji var18 = var1.a(var3, var4 + var17, var5);
                  if(var18.o() == awt.a || var18.o() == awt.j || var18 == ajn.i || var18 == ajn.j) {
                     this.a(var1, var3, var4 + var17, var5, ajn.r);
                  }
               }

               for(var17 = var4 - 3 + var6; var17 <= var4 + var6; ++var17) {
                  var10 = var17 - (var4 + var6);
                  var11 = 2 - var10 / 2;

                  for(var19 = var3 - var11; var19 <= var3 + var11; ++var19) {
                     for(var13 = var5 - var11; var13 <= var5 + var11; ++var13) {
                        if(var1.a(var19, var17, var13).o() == awt.j) {
                           if(var2.nextInt(4) == 0 && var1.a(var19 - 1, var17, var13).o() == awt.a) {
                              this.a(var1, var19 - 1, var17, var13, 8);
                           }

                           if(var2.nextInt(4) == 0 && var1.a(var19 + 1, var17, var13).o() == awt.a) {
                              this.a(var1, var19 + 1, var17, var13, 2);
                           }

                           if(var2.nextInt(4) == 0 && var1.a(var19, var17, var13 - 1).o() == awt.a) {
                              this.a(var1, var19, var17, var13 - 1, 1);
                           }

                           if(var2.nextInt(4) == 0 && var1.a(var19, var17, var13 + 1).o() == awt.a) {
                              this.a(var1, var19, var17, var13 + 1, 4);
                           }
                        }
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void a(ahb var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, ajn.bd, var5);
      int var6 = 4;

      while(true) {
         --var3;
         if(var1.a(var2, var3, var4).o() != awt.a || var6 <= 0) {
            return;
         }

         this.a(var1, var2, var3, var4, ajn.bd, var5);
         --var6;
      }
   }
}
