
public class jf extends jd {

   public jf() {
      this.h = true;
      this.i = true;
   }

   public void a(et var1) {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.d = var1.readDouble();
      this.c = var1.readDouble();
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      super.a(var1);
   }

   public void b(et var1) {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.d);
      var1.writeDouble(this.c);
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      super.b(var1);
   }
}
