
public class agh extends aft {

   public agh(int var1, int var2) {
      super(var1, var2, afu.f);
      this.b("oxygen");
   }

   public int a(int var1) {
      return 10 * var1;
   }

   public int b(int var1) {
      return this.a(var1) + 30;
   }

   public int b() {
      return 3;
   }
}
