import java.util.Random;

public class asq extends arc {

   private final int a;
   private final boolean b;
   private final int c;
   private final int d;


   public asq(boolean var1) {
      this(var1, 4, 0, 0, false);
   }

   public asq(boolean var1, int var2, int var3, int var4, boolean var5) {
      super(var1);
      this.a = var2;
      this.c = var3;
      this.d = var4;
      this.b = var5;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + this.a;
      boolean var7 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         byte var9;
         int var11;
         aji var12;
         for(int var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            var9 = 1;
            if(var8 == var4) {
               var9 = 0;
            }

            if(var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(int var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if(var8 >= 0 && var8 < 256) {
                     var12 = var1.a(var10, var8, var11);
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
            aji var19 = var1.a(var3, var4 - 1, var5);
            if((var19 == ajn.c || var19 == ajn.d || var19 == ajn.ak) && var4 < 256 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, ajn.d);
               var9 = 3;
               byte var20 = 0;

               int var13;
               int var14;
               int var15;
               int var21;
               for(var11 = var4 - var9 + var6; var11 <= var4 + var6; ++var11) {
                  var21 = var11 - (var4 + var6);
                  var13 = var20 + 1 - var21 / 2;

                  for(var14 = var3 - var13; var14 <= var3 + var13; ++var14) {
                     var15 = var14 - var3;

                     for(int var16 = var5 - var13; var16 <= var5 + var13; ++var16) {
                        int var17 = var16 - var5;
                        if(Math.abs(var15) != var13 || Math.abs(var17) != var13 || var2.nextInt(2) != 0 && var21 != 0) {
                           aji var18 = var1.a(var14, var11, var16);
                           if(var18.o() == awt.a || var18.o() == awt.j) {
                              this.a(var1, var14, var11, var16, ajn.t, this.d);
                           }
                        }
                     }
                  }
               }

               for(var11 = 0; var11 < var6; ++var11) {
                  var12 = var1.a(var3, var4 + var11, var5);
                  if(var12.o() == awt.a || var12.o() == awt.j) {
                     this.a(var1, var3, var4 + var11, var5, ajn.r, this.c);
                     if(this.b && var11 > 0) {
                        if(var2.nextInt(3) > 0 && var1.c(var3 - 1, var4 + var11, var5)) {
                           this.a(var1, var3 - 1, var4 + var11, var5, ajn.bd, 8);
                        }

                        if(var2.nextInt(3) > 0 && var1.c(var3 + 1, var4 + var11, var5)) {
                           this.a(var1, var3 + 1, var4 + var11, var5, ajn.bd, 2);
                        }

                        if(var2.nextInt(3) > 0 && var1.c(var3, var4 + var11, var5 - 1)) {
                           this.a(var1, var3, var4 + var11, var5 - 1, ajn.bd, 1);
                        }

                        if(var2.nextInt(3) > 0 && var1.c(var3, var4 + var11, var5 + 1)) {
                           this.a(var1, var3, var4 + var11, var5 + 1, ajn.bd, 4);
                        }
                     }
                  }
               }

               if(this.b) {
                  for(var11 = var4 - 3 + var6; var11 <= var4 + var6; ++var11) {
                     var21 = var11 - (var4 + var6);
                     var13 = 2 - var21 / 2;

                     for(var14 = var3 - var13; var14 <= var3 + var13; ++var14) {
                        for(var15 = var5 - var13; var15 <= var5 + var13; ++var15) {
                           if(var1.a(var14, var11, var15).o() == awt.j) {
                              if(var2.nextInt(4) == 0 && var1.a(var14 - 1, var11, var15).o() == awt.a) {
                                 this.a(var1, var14 - 1, var11, var15, 8);
                              }

                              if(var2.nextInt(4) == 0 && var1.a(var14 + 1, var11, var15).o() == awt.a) {
                                 this.a(var1, var14 + 1, var11, var15, 2);
                              }

                              if(var2.nextInt(4) == 0 && var1.a(var14, var11, var15 - 1).o() == awt.a) {
                                 this.a(var1, var14, var11, var15 - 1, 1);
                              }

                              if(var2.nextInt(4) == 0 && var1.a(var14, var11, var15 + 1).o() == awt.a) {
                                 this.a(var1, var14, var11, var15 + 1, 4);
                              }
                           }
                        }
                     }
                  }

                  if(var2.nextInt(5) == 0 && var6 > 5) {
                     for(var11 = 0; var11 < 2; ++var11) {
                        for(var21 = 0; var21 < 4; ++var21) {
                           if(var2.nextInt(4 - var11) == 0) {
                              var13 = var2.nextInt(3);
                              this.a(var1, var3 + p.a[p.f[var21]], var4 + var6 - 5 + var11, var5 + p.b[p.f[var21]], ajn.by, var13 << 2 | var21);
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
