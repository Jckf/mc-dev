
public class ik extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private byte e;
   private byte f;


   public ik() {}

   public ik(sa var1) {
      this.a = var1.y();
      this.b = qh.c(var1.s * 32.0D);
      this.c = qh.c(var1.t * 32.0D);
      this.d = qh.c(var1.u * 32.0D);
      this.e = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.f = (byte)((int)(var1.z * 256.0F / 360.0F));
   }

   public ik(int var1, int var2, int var3, int var4, byte var5, byte var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
