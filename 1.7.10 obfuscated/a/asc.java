import java.util.Random;

public class asc extends arn {

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 64; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(ajn.ba.c(var1, var7, var8, var9) && var1.a(var7, var8 - 1, var9) == ajn.c) {
            var1.d(var7, var8, var9, ajn.ba, 0, 2);
         }
      }

      return true;
   }
}
