
public class hx extends ft {

   private int a;
   private int b;
   private int c;


   public hx() {}

   public hx(int var1, sa var2, sa var3) {
      this.a = var1;
      this.b = var2.y();
      this.c = var3 != null?var3.y():-1;
   }

   public void a(et var1) {
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.a = var1.readUnsignedByte();
   }

   public void b(et var1) {
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeByte(this.a);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
