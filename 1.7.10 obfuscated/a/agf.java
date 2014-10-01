
public class agf extends aft {

   protected agf(int var1, int var2) {
      super(var1, var2, afu.g);
      this.b("knockback");
   }

   public int a(int var1) {
      return 5 + 20 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 2;
   }
}
