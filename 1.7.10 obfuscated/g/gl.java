
public class gl extends ft {

   private int a;
   private short b;
   private boolean c;


   public gl() {}

   public gl(int var1, short var2, boolean var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readUnsignedByte();
      this.b = var1.readShort();
      this.c = var1.readBoolean();
   }

   public void b(et var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeBoolean(this.c);
   }

   public String b() {
      return String.format("id=%d, uid=%d, accepted=%b", new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Boolean.valueOf(this.c)});
   }
}
