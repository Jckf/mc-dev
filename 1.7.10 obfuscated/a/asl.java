import java.util.Random;

public class asl extends arn {

   private aji a;


   public asl(aji var1) {
      this.a = var1;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      if(var1.c(var3, var4, var5) && var1.a(var3, var4 - 1, var5) == this.a) {
         int var6 = var2.nextInt(32) + 6;
         int var7 = var2.nextInt(4) + 1;

         int var8;
         int var9;
         int var10;
         int var11;
         for(var8 = var3 - var7; var8 <= var3 + var7; ++var8) {
            for(var9 = var5 - var7; var9 <= var5 + var7; ++var9) {
               var10 = var8 - var3;
               var11 = var9 - var5;
               if(var10 * var10 + var11 * var11 <= var7 * var7 + 1 && var1.a(var8, var4 - 1, var9) != this.a) {
                  return false;
               }
            }
         }

         for(var8 = var4; var8 < var4 + var6 && var8 < 256; ++var8) {
            for(var9 = var3 - var7; var9 <= var3 + var7; ++var9) {
               for(var10 = var5 - var7; var10 <= var5 + var7; ++var10) {
                  var11 = var9 - var3;
                  int var12 = var10 - var5;
                  if(var11 * var11 + var12 * var12 <= var7 * var7 + 1) {
                     var1.d(var9, var8, var10, ajn.Z, 0, 2);
                  }
               }
            }
         }

         wz var13 = new wz(var1);
         var13.b((double)((float)var3 + 0.5F), (double)(var4 + var6), (double)((float)var5 + 0.5F), var2.nextFloat() * 360.0F, 0.0F);
         var1.d((sa)var13);
         var1.d(var3, var4 + var6, var5, ajn.h, 0, 2);
         return true;
      } else {
         return false;
      }
   }
}
