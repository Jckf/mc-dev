
public class jo extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private add e;
   private float f;
   private float g;
   private float h;


   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readUnsignedByte();
      this.c = var1.readInt();
      this.d = var1.readUnsignedByte();
      this.e = var1.c();
      this.f = (float)var1.readUnsignedByte() / 16.0F;
      this.g = (float)var1.readUnsignedByte() / 16.0F;
      this.h = (float)var1.readUnsignedByte() / 16.0F;
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
      var1.writeByte(this.d);
      var1.a(this.e);
      var1.writeByte((int)(this.f * 16.0F));
      var1.writeByte((int)(this.g * 16.0F));
      var1.writeByte((int)(this.h * 16.0F));
   }

   public void a(io var1) {
      var1.a(this);
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public add g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public float i() {
      return this.g;
   }

   public float j() {
      return this.h;
   }
}
