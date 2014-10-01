import java.util.Random;

public class anf extends akj {

   public static final double[] b = new double[]{-0.0625D, 0.0625D, 0.1875D, 0.3125D};
   private static final int[] M = new int[]{1, 2, 3, 4};


   protected anf(boolean var1) {
      super(var1);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.e(var2, var3, var4);
      int var11 = (var10 & 12) >> 2;
      var11 = var11 + 1 << 2 & 12;
      var1.a(var2, var3, var4, var11 | var10 & 3, 3);
      return true;
   }

   protected int b(int var1) {
      return M[(var1 & 12) >> 2] * 2;
   }

   protected akj e() {
      return ajn.aS;
   }

   protected akj i() {
      return ajn.aR;
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.aW;
   }

   public int b() {
      return 15;
   }

   public boolean g(ahl var1, int var2, int var3, int var4, int var5) {
      return this.h(var1, var2, var3, var4, var5) > 0;
   }

   protected boolean a(aji var1) {
      return d(var1);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.e(var1, var2, var3, var4);
   }

}
