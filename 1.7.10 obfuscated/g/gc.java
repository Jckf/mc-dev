
public class gc extends ft {

   private int a;
   private int b;


   public gc() {}

   public gc(sa var1, int var2) {
      this.a = var1.y();
      this.b = var2;
   }

   public void a(et var1) {
      this.a = var1.a();
      this.b = var1.readUnsignedByte();
   }

   public void b(et var1) {
      var1.b(this.a);
      var1.writeByte(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
   }
}
