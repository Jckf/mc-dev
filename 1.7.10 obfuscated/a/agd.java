
public class agd extends aft {

   protected agd(int var1, int var2) {
      super(var1, var2, afu.g);
      this.b("fire");
   }

   public int a(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 2;
   }
}
