import java.util.Random;

public class arh extends arn {

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.c(var7, var8, var9)) {
            int var10 = 1 + var2.nextInt(var2.nextInt(3) + 1);

            for(int var11 = 0; var11 < var10; ++var11) {
               if(ajn.aF.j(var1, var7, var8 + var11, var9)) {
                  var1.d(var7, var8 + var11, var9, ajn.aF, 0, 2);
               }
            }
         }
      }

      return true;
   }
}
