import java.util.Random;

public class afr extends aft {

   protected afr(int var1, int var2) {
      super(var1, var2, afu.j);
      this.b("durability");
   }

   public int a(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 3;
   }

   public boolean a(add var1) {
      return var1.g()?true:super.a(var1);
   }

   public static boolean a(add var0, int var1, Random var2) {
      return var0.b() instanceof abb && var2.nextFloat() < 0.6F?false:var2.nextInt(var1 + 1) > 0;
   }
}
