
public class gg extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private aji f;


   public gg() {}

   public gg(int var1, int var2, int var3, aji var4, int var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var5;
      this.e = var6;
      this.f = var4;
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = var1.readUnsignedByte();
      this.e = var1.readUnsignedByte();
      this.f = aji.e(var1.a() & 4095);
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);
      var1.writeByte(this.d);
      var1.writeByte(this.e);
      var1.b(aji.b(this.f) & 4095);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
