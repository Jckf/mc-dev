import java.util.Random;

public class anz extends ajr implements ajo {

   private static final String[] a = new String[]{"deadbush", "tallgrass", "fern"};


   protected anz() {
      super(awt.l);
      float var1 = 0.4F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return this.a(var1.a(var2, var3 - 1, var4));
   }

   public adb a(int var1, Random var2, int var3) {
      return var2.nextInt(8) == 0?ade.N:null;
   }

   public int a(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      if(!var1.E && var2.bF() != null && var2.bF().b() == ade.aZ) {
         var2.a(pp.C[aji.b((aji)this)], 1);
         this.a(var1, var3, var4, var5, new add(ajn.H, 1, var6));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int k(ahb var1, int var2, int var3, int var4) {
      return var1.e(var2, var3, var4);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.e(var2, var3, var4);
      return var6 != 0;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var1.e(var3, var4, var5);
      byte var7 = 2;
      if(var6 == 2) {
         var7 = 3;
      }

      if(ajn.cm.c(var1, var3, var4, var5)) {
         ajn.cm.c(var1, var3, var4, var5, var7, 2);
      }

   }

}
