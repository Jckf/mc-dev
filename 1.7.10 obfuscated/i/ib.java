
public class ib extends ft {

   private float a;
   private int b;
   private float c;


   public ib() {}

   public ib(float var1, int var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(et var1) {
      this.a = var1.readFloat();
      this.b = var1.readShort();
      this.c = var1.readFloat();
   }

   public void b(et var1) {
      var1.writeFloat(this.a);
      var1.writeShort(this.b);
      var1.writeFloat(this.c);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
