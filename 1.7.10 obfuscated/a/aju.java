import java.util.Random;

public class aju extends aji {

   protected aju() {
      super(awt.F);
      this.a(true);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      this.a(var7, 0.0F, var6, 1.0F - var6, var8, 1.0F - var6);
   }

   public void g() {
      float var1 = 0.0625F;
      float var2 = 0.5F;
      this.a(var1, 0.0F, var1, 1.0F - var1, var2, 1.0F - var1);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return azt.a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8 - var6), (double)((float)(var4 + 1) - var6));
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      this.b(var1, var2, var3, var4, var5);
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {
      this.b(var1, var2, var3, var4, var5);
   }

   private void b(ahb var1, int var2, int var3, int var4, yz var5) {
      if(var5.g(false)) {
         var5.bQ().a(2, 0.1F);
         int var6 = var1.e(var2, var3, var4) + 1;
         if(var6 >= 6) {
            var1.f(var2, var3, var4);
         } else {
            var1.a(var2, var3, var4, var6, 2);
         }
      }

   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return !super.c(var1, var2, var3, var4)?false:this.j(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!this.j(var1, var2, var3, var4)) {
         var1.f(var2, var3, var4);
      }

   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2, var3 - 1, var4).o().a();
   }

   public int a(Random var1) {
      return 0;
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }
}
