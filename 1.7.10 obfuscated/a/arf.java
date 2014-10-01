import java.util.Random;

public class arf extends arn {

   private aji a;
   private int b;


   public arf(aji var1, int var2) {
      super(false);
      this.a = var1;
      this.b = var2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      while(true) {
         if(var4 > 3) {
            label63: {
               if(!var1.c(var3, var4 - 1, var5)) {
                  aji var6 = var1.a(var3, var4 - 1, var5);
                  if(var6 == ajn.c || var6 == ajn.d || var6 == ajn.b) {
                     break label63;
                  }
               }

               --var4;
               continue;
            }
         }

         if(var4 <= 3) {
            return false;
         }

         int var18 = this.b;

         for(int var7 = 0; var18 >= 0 && var7 < 3; ++var7) {
            int var8 = var18 + var2.nextInt(2);
            int var9 = var18 + var2.nextInt(2);
            int var10 = var18 + var2.nextInt(2);
            float var11 = (float)(var8 + var9 + var10) * 0.333F + 0.5F;

            for(int var12 = var3 - var8; var12 <= var3 + var8; ++var12) {
               for(int var13 = var5 - var10; var13 <= var5 + var10; ++var13) {
                  for(int var14 = var4 - var9; var14 <= var4 + var9; ++var14) {
                     float var15 = (float)(var12 - var3);
                     float var16 = (float)(var13 - var5);
                     float var17 = (float)(var14 - var4);
                     if(var15 * var15 + var16 * var16 + var17 * var17 <= var11 * var11) {
                        var1.d(var12, var14, var13, this.a, 0, 4);
                     }
                  }
               }
            }

            var3 += -(var18 + 1) + var2.nextInt(2 + var18 * 2);
            var5 += -(var18 + 1) + var2.nextInt(2 + var18 * 2);
            var4 += 0 - var2.nextInt(2);
         }

         return true;
      }
   }
}
