import java.util.Random;

public class amf extends ajr {

   protected amf() {
      this.a(true);
      float var1 = 0.5F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.a((abt)null);
   }

   protected boolean a(aji var1) {
      return var1 == ajn.aM;
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return this.a(var1.a(var2, var3 - 1, var4));
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      if(var6 < 3 && var5.nextInt(10) == 0) {
         ++var6;
         var1.a(var2, var3, var4, var6, 2);
      }

      super.a(var1, var2, var3, var4, var5);
   }

   public int b() {
      return 6;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.E) {
         int var8 = 1;
         if(var5 >= 3) {
            var8 = 2 + var1.s.nextInt(3);
            if(var7 > 0) {
               var8 += var1.s.nextInt(var7 + 1);
            }
         }

         for(int var9 = 0; var9 < var8; ++var9) {
            this.a(var1, var2, var3, var4, new add(ade.bm));
         }

      }
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }

   public int a(Random var1) {
      return 0;
   }
}
