import java.util.Random;

public class akg extends ajc {

   private rf[] a = new rf[2];


   public akg() {
      super(awt.d);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
      this.a(abt.d);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      return var1.e(var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {}

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {}

   public void b(ahb var1, int var2, int var3, int var4) {}

   public void e(ahb var1, int var2, int var3, int var4) {
      if(!var1.t.g) {
         int var5 = var1.e(var2, var3, var4);
         int var6 = var1.b(ahn.a, var2, var3, var4) - var1.j;
         float var7 = var1.d(1.0F);
         if(var7 < 3.1415927F) {
            var7 += (0.0F - var7) * 0.2F;
         } else {
            var7 += (6.2831855F - var7) * 0.2F;
         }

         var6 = Math.round((float)var6 * qh.b(var7));
         if(var6 < 0) {
            var6 = 0;
         }

         if(var6 > 15) {
            var6 = 15;
         }

         if(var5 != var6) {
            var1.a(var2, var3, var4, var6, 3);
         }

      }
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean f() {
      return true;
   }

   public aor a(ahb var1, int var2) {
      return new apa();
   }
}
