import java.util.Random;

public class asr extends arn {

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var3;

      for(int var7 = var5; var4 < 128; ++var4) {
         if(var1.c(var3, var4, var5)) {
            for(int var8 = 2; var8 <= 5; ++var8) {
               if(ajn.bd.d(var1, var3, var4, var5, var8)) {
                  var1.d(var3, var4, var5, ajn.bd, 1 << p.e[q.a[var8]], 2);
                  break;
               }
            }
         } else {
            var3 = var6 + var2.nextInt(4) - var2.nextInt(4);
            var5 = var7 + var2.nextInt(4) - var2.nextInt(4);
         }
      }

      return true;
   }
}
