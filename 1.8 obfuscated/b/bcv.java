
public class bcv extends bcm {

   private int a;


   public void b(fn var1) {
      super.b(var1);
      var1.a("OutputSignal", this.a);
   }

   public void a(fn var1) {
      super.a(var1);
      this.a = var1.f("OutputSignal");
   }

   public int b() {
      return this.a;
   }

   public void a(int var1) {
      this.a = var1;
   }
}
