
public class hr extends ft {

   private int a;
   private int b;


   public hr() {}

   public hr(int var1, rw var2) {
      this.a = var1;
      this.b = var2.a();
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readUnsignedByte();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
