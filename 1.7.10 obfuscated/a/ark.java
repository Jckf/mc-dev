import java.util.Random;

public class ark extends arn {

   private aji a;


   public ark(aji var1) {
      this.a = var1;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      aji var6;
      while(((var6 = var1.a(var3, var4, var5)).o() == awt.a || var6.o() == awt.j) && var4 > 0) {
         --var4;
      }

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.c(var8, var9, var10) && this.a.j(var1, var8, var9, var10)) {
            var1.d(var8, var9, var10, this.a, 0, 2);
         }
      }

      return true;
   }
}
