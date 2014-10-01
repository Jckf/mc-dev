
public class je extends jd {

   public je() {
      this.h = true;
   }

   public void a(et var1) {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.d = var1.readDouble();
      this.c = var1.readDouble();
      super.a(var1);
   }

   public void b(et var1) {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.d);
      var1.writeDouble(this.c);
      super.b(var1);
   }
}
