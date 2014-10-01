
public class jg extends jd {

   public jg() {
      this.i = true;
   }

   public void a(et var1) {
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      super.a(var1);
   }

   public void b(et var1) {
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      super.b(var1);
   }
}
