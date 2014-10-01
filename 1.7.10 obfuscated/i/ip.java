
public class ip extends ft {

   private int a;
   private int b;


   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(io var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
   }

   public int d() {
      return this.b;
   }
}
