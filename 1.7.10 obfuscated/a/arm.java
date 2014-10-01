import java.util.Random;

public class arm extends arn {

   private int a;


   public void a(int var1) {
      this.a = var1;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      boolean var6 = false;

      for(int var7 = 0; var7 < 64; ++var7) {
         int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.c(var8, var9, var10) && (!var1.t.g || var9 < 254) && ajn.cm.c(var1, var8, var9, var10)) {
            ajn.cm.c(var1, var8, var9, var10, this.a, 2);
            var6 = true;
         }
      }

      return var6;
   }
}
