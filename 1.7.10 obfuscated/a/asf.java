import java.util.Random;

public class asf extends arc {

   public asf() {
      super(false);
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(5) + 7;
      int var7 = var6 - var2.nextInt(2) - 3;
      int var8 = var6 - var7;
      int var9 = 1 + var2.nextInt(var8 + 1);
      boolean var10 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var13;
         int var14;
         int var19;
         for(int var11 = var4; var11 <= var4 + 1 + var6 && var10; ++var11) {
            boolean var12 = true;
            if(var11 - var4 < var7) {
               var19 = 0;
            } else {
               var19 = var9;
            }

            for(var13 = var3 - var19; var13 <= var3 + var19 && var10; ++var13) {
               for(var14 = var5 - var19; var14 <= var5 + var19 && var10; ++var14) {
                  if(var11 >= 0 && var11 < 256) {
                     aji var15 = var1.a(var13, var11, var14);
                     if(!this.a(var15)) {
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
            aji var18 = var1.a(var3, var4 - 1, var5);
            if((var18 == ajn.c || var18 == ajn.d) && var4 < 256 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, ajn.d);
               var19 = 0;

               for(var13 = var4 + var6; var13 >= var4 + var7; --var13) {
                  for(var14 = var3 - var19; var14 <= var3 + var19; ++var14) {
                     int var21 = var14 - var3;

                     for(int var16 = var5 - var19; var16 <= var5 + var19; ++var16) {
                        int var17 = var16 - var5;
                        if((Math.abs(var21) != var19 || Math.abs(var17) != var19 || var19 <= 0) && !var1.a(var14, var13, var16).j()) {
                           this.a(var1, var14, var13, var16, ajn.t, 1);
                        }
                     }
                  }

                  if(var19 >= 1 && var13 == var4 + var7 + 1) {
                     --var19;
                  } else if(var19 < var9) {
                     ++var19;
                  }
               }

               for(var13 = 0; var13 < var6 - 1; ++var13) {
                  aji var20 = var1.a(var3, var4 + var13, var5);
                  if(var20.o() == awt.a || var20.o() == awt.j) {
                     this.a(var1, var3, var4 + var13, var5, ajn.r, 1);
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
