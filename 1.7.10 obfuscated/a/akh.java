import java.util.Random;

public class akh extends ajr {

   protected akh() {
      super(awt.l);
      float var1 = 0.4F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   protected boolean a(aji var1) {
      return var1 == ajn.m || var1 == ajn.ch || var1 == ajn.ce || var1 == ajn.d;
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      if(!var1.E && var2.bF() != null && var2.bF().b() == ade.aZ) {
         var2.a(pp.C[aji.b((aji)this)], 1);
         this.a(var1, var3, var4, var5, new add(ajn.I, 1, var6));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
