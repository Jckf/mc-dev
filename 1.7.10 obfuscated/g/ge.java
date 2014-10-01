
public class ge extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public ge() {}

   public ge(int var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void a(et var1) {
      this.a = var1.a();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readUnsignedByte();
   }

   public void b(et var1) {
      var1.b(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.e);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
