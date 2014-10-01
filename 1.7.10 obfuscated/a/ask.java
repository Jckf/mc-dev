import java.util.Random;

public class ask extends arc {

   public ask(boolean var1) {
      super(var1);
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + var2.nextInt(3) + 5;
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
               var9 = 2;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if(var8 >= 0 && var8 < 256) {
                     aji var12 = var1.a(var10, var8, var11);
                     if(!this.a(var12)) {
                        var7 = false;
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
            aji var21 = var1.a(var3, var4 - 1, var5);
            if((var21 == ajn.c || var21 == ajn.d) && var4 < 256 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, ajn.d);
               int var22 = var2.nextInt(4);
               var10 = var6 - var2.nextInt(4) - 1;
               var11 = 3 - var2.nextInt(3);
               int var23 = var3;
               int var13 = var5;
               int var14 = 0;

               int var15;
               int var16;
               for(var15 = 0; var15 < var6; ++var15) {
                  var16 = var4 + var15;
                  if(var15 >= var10 && var11 > 0) {
                     var23 += p.a[var22];
                     var13 += p.b[var22];
                     --var11;
                  }

                  aji var17 = var1.a(var23, var16, var13);
                  if(var17.o() == awt.a || var17.o() == awt.j) {
                     this.a(var1, var23, var16, var13, ajn.s, 0);
                     var14 = var16;
                  }
               }

               for(var15 = -1; var15 <= 1; ++var15) {
                  for(var16 = -1; var16 <= 1; ++var16) {
                     this.a(var1, var23 + var15, var14 + 1, var13 + var16);
                  }
               }

               this.a(var1, var23 + 2, var14 + 1, var13);
               this.a(var1, var23 - 2, var14 + 1, var13);
               this.a(var1, var23, var14 + 1, var13 + 2);
               this.a(var1, var23, var14 + 1, var13 - 2);

               for(var15 = -3; var15 <= 3; ++var15) {
                  for(var16 = -3; var16 <= 3; ++var16) {
                     if(Math.abs(var15) != 3 || Math.abs(var16) != 3) {
                        this.a(var1, var23 + var15, var14, var13 + var16);
                     }
                  }
               }

               var23 = var3;
               var13 = var5;
               var15 = var2.nextInt(4);
               if(var15 != var22) {
                  var16 = var10 - var2.nextInt(2) - 1;
                  int var24 = 1 + var2.nextInt(3);
                  var14 = 0;

                  int var18;
                  int var19;
                  for(var18 = var16; var18 < var6 && var24 > 0; --var24) {
                     if(var18 >= 1) {
                        var19 = var4 + var18;
                        var23 += p.a[var15];
                        var13 += p.b[var15];
                        aji var20 = var1.a(var23, var19, var13);
                        if(var20.o() == awt.a || var20.o() == awt.j) {
                           this.a(var1, var23, var19, var13, ajn.s, 0);
                           var14 = var19;
                        }
                     }

                     ++var18;
                  }

                  if(var14 > 0) {
                     for(var18 = -1; var18 <= 1; ++var18) {
                        for(var19 = -1; var19 <= 1; ++var19) {
                           this.a(var1, var23 + var18, var14 + 1, var13 + var19);
                        }
                     }

                     for(var18 = -2; var18 <= 2; ++var18) {
                        for(var19 = -2; var19 <= 2; ++var19) {
                           if(Math.abs(var18) != 2 || Math.abs(var19) != 2) {
                              this.a(var1, var23 + var18, var14, var13 + var19);
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

   private void a(ahb var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3, var4);
      if(var5.o() == awt.a || var5.o() == awt.j) {
         this.a(var1, var2, var3, var4, ajn.u, 0);
      }

   }
}
