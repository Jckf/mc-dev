
public class ht extends ft {

   private int a;
   private byte b;


   public ht() {}

   public ht(sa var1, byte var2) {
      this.a = var1.y();
      this.b = var2;
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, rot=%d", new Object[]{Integer.valueOf(this.a), Byte.valueOf(this.b)});
   }
}
