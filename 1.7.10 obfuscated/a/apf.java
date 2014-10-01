
public class apf extends aor {

   private adb a;
   private int i;


   public apf() {}

   public apf(adb var1, int var2) {
      this.a = var1;
      this.i = var2;
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Item", adb.b(this.a));
      var1.a("Data", this.i);
   }

   public void a(dh var1) {
      super.a(var1);
      this.a = adb.d(var1.f("Item"));
      this.i = var1.f("Data");
   }

   public ft m() {
      dh var1 = new dh();
      this.b(var1);
      return new gf(this.c, this.d, this.e, 5, var1);
   }

   public void a(adb var1, int var2) {
      this.a = var1;
      this.i = var2;
   }

   public adb a() {
      return this.a;
   }

   public int b() {
      return this.i;
   }
}
