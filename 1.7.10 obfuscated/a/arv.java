import java.util.Random;

public class arv extends arn {

   private aji a;
   private int b;


   public arv(int var1) {
      this.a = ajn.cj;
      this.b = var1;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      while(var1.c(var3, var4, var5) && var4 > 2) {
         --var4;
      }

      if(var1.a(var3, var4, var5) != ajn.aE) {
         return false;
      } else {
         int var6 = var2.nextInt(this.b - 2) + 2;
         byte var7 = 1;

         for(int var8 = var3 - var6; var8 <= var3 + var6; ++var8) {
            for(int var9 = var5 - var6; var9 <= var5 + var6; ++var9) {
               int var10 = var8 - var3;
               int var11 = var9 - var5;
               if(var10 * var10 + var11 * var11 <= var6 * var6) {
                  for(int var12 = var4 - var7; var12 <= var4 + var7; ++var12) {
                     aji var13 = var1.a(var8, var12, var9);
                     if(var13 == ajn.d || var13 == ajn.aE || var13 == ajn.aD) {
                        var1.d(var8, var12, var9, this.a, 0, 2);
                     }
                  }
               }
            }
         }

         return true;
      }
   }
}
