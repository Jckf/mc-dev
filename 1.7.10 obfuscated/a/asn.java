import java.util.Random;

public class asn extends arc {

   public asn(boolean var1) {
      super(var1);
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(4) + 6;
      int var7 = 1 + var2.nextInt(2);
      int var8 = var6 - var7;
      int var9 = 2 + var2.nextInt(2);
      boolean var10 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var13;
         int var22;
         for(int var11 = var4; var11 <= var4 + 1 + var6 && var10; ++var11) {
            boolean var12 = true;
            if(var11 - var4 < var7) {
               var22 = 0;
            } else {
               var22 = var9;
            }

            for(var13 = var3 - var22; var13 <= var3 + var22 && var10; ++var13) {
               for(int var14 = var5 - var22; var14 <= var5 + var22 && var10; ++var14) {
                  if(var11 >= 0 && var11 < 256) {
                     aji var15 = var1.a(var13, var11, var14);
                     if(var15.o() != awt.a && var15.o() != awt.j) {
                        var10 = false;
                     }
                  } else {
                     var10 = false;
                  }
               }
            }
         }

         if(!var10) {
            return false;
         } else {
            aji var21 = var1.a(var3, var4 - 1, var5);
            if((var21 == ajn.c || var21 == ajn.d || var21 == ajn.ak) && var4 < 256 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, ajn.d);
               var22 = var2.nextInt(2);
               var13 = 1;
               byte var23 = 0;

               int var16;
               int var24;
               for(var24 = 0; var24 <= var8; ++var24) {
                  var16 = var4 + var6 - var24;

                  for(int var17 = var3 - var22; var17 <= var3 + var22; ++var17) {
                     int var18 = var17 - var3;

                     for(int var19 = var5 - var22; var19 <= var5 + var22; ++var19) {
                        int var20 = var19 - var5;
                        if((Math.abs(var18) != var22 || Math.abs(var20) != var22 || var22 <= 0) && !var1.a(var17, var16, var19).j()) {
                           this.a(var1, var17, var16, var19, ajn.t, 1);
                        }
                     }
                  }

                  if(var22 >= var13) {
                     var22 = var23;
                     var23 = 1;
                     ++var13;
                     if(var13 > var9) {
                        var13 = var9;
                     }
                  } else {
                     ++var22;
                  }
               }

               var24 = var2.nextInt(3);

               for(var16 = 0; var16 < var6 - var24; ++var16) {
                  aji var25 = var1.a(var3, var4 + var16, var5);
                  if(var25.o() == awt.a || var25.o() == awt.j) {
                     this.a(var1, var3, var4 + var16, var5, ajn.r, 1);
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
}
