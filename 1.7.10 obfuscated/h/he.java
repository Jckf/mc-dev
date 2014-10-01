
public class he extends ft {

   private int a;
   private byte[] b;


   public he() {}

   public he(int var1, byte[] var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(et var1) {
      this.a = var1.a();
      this.b = new byte[var1.readUnsignedShort()];
      var1.readBytes(this.b);
   }

   public void b(et var1) {
      var1.b(this.a);
      var1.writeShort(this.b.length);
      var1.writeBytes(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, length=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b.length)});
   }
}
