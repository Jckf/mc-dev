
public class afp extends aft {

   public afp(int var1, int var2) {
      super(var1, var2, afu.k);
      this.b("arrowKnockback");
   }

   public int a(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   public int b(int var1) {
      return this.a(var1) + 25;
   }

   public int b() {
      return 2;
   }
}
