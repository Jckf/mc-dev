import java.util.Random;

public class aro extends arn {

   private aji a;
   private int b;


   public aro(aji var1) {
      this.a = var1;
   }

   public void a(aji var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 64; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.c(var7, var8, var9) && (!var1.t.g || var8 < 255) && this.a.j(var1, var7, var8, var9)) {
            var1.d(var7, var8, var9, this.a, this.b, 2);
         }
      }

      return true;
   }
}
