
public class iw extends ft {

   private int a;
   private int b;


   public void a(io var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readByte();
      this.b = var1.readByte();
   }

   public void b(et var1) {
      var1.writeByte(this.a);
      var1.writeByte(this.b);
   }

   public String b() {
      return String.format("id=%d, button=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
