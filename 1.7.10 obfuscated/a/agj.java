import java.util.Random;

public class agj extends aft {

   public agj(int var1, int var2) {
      super(var1, var2, afu.e);
      this.b("thorns");
   }

   public int a(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 3;
   }

   public boolean a(add var1) {
      return var1.b() instanceof abb?true:super.a(var1);
   }

   public void b(sv var1, sa var2, int var3) {
      Random var4 = var1.aI();
      add var5 = afv.a(aft.k, var1);
      if(a(var3, var4)) {
         var2.a(ro.a((sa)var1), (float)b(var3, var4));
         var2.a("damage.thorns", 0.5F, 1.0F);
         if(var5 != null) {
            var5.a(3, var1);
         }
      } else if(var5 != null) {
         var5.a(1, var1);
      }

   }

   public static boolean a(int var0, Random var1) {
      return var0 <= 0?false:var1.nextFloat() < 0.15F * (float)var0;
   }

   public static int b(int var0, Random var1) {
      return var0 > 10?var0 - 10:1 + var1.nextInt(4);
   }
}
