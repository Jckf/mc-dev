import java.util.Random;

public class amd extends aji {

   protected amd() {
      super(awt.b);
      this.a(true);
      this.a(abt.b);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         if(var1.k(var2, var3 + 1, var4) < 4 && var1.a(var2, var3 + 1, var4).k() > 2) {
            var1.b(var2, var3, var4, ajn.d);
         } else if(var1.k(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               aji var10 = var1.a(var7, var8 + 1, var9);
               if(var1.a(var7, var8, var9) == ajn.d && var1.e(var7, var8, var9) == 0 && var1.k(var7, var8 + 1, var9) >= 4 && var10.k() <= 2) {
                  var1.b(var7, var8, var9, (aji)this);
               }
            }
         }

      }
   }

   public adb a(int var1, Random var2, int var3) {
      return ajn.d.a(0, var2, var3);
   }
}
