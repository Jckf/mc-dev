import java.util.Random;

public class bhj extends bhp {

   public boolean b(aqu var1, Random var2, dt var3) {
      for(int var4 = 0; var4 < 10; ++var4) {
         dt var5 = var3.a(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
         if(var1.d(var5)) {
            int var6 = 1 + var2.nextInt(var2.nextInt(3) + 1);

            for(int var7 = 0; var7 < var6; ++var7) {
               if(aty.aK.d(var1, var5)) {
                  var1.a(var5.b(var7), aty.aK.P(), 2);
               }
            }
         }
      }

      return true;
   }
}
