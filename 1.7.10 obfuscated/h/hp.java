
public class hp extends ft {

   private int a;
   private int b;
   private int c;
   private int d;


   public hp() {}

   public hp(yz var1, int var2, int var3, int var4) {
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.a = var1.y();
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readByte();
      this.d = var1.readInt();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeByte(this.c);
      var1.writeInt(this.d);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
