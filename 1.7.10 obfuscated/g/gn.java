
public class gn extends ft {

   private int a;
   private int b;
   private String c;
   private int d;
   private boolean e;
   private int f;


   public gn() {}

   public gn(int var1, int var2, String var3, int var4, boolean var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public gn(int var1, int var2, String var3, int var4, boolean var5, int var6) {
      this(var1, var2, var3, var4, var5);
      this.f = var6;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readUnsignedByte();
      this.b = var1.readUnsignedByte();
      this.c = var1.c(32);
      this.d = var1.readUnsignedByte();
      this.e = var1.readBoolean();
      if(this.b == 11) {
         this.f = var1.readInt();
      }

   }

   public void b(et var1) {
      var1.writeByte(this.a);
      var1.writeByte(this.b);
      var1.a(this.c);
      var1.writeByte(this.d);
      var1.writeBoolean(this.e);
      if(this.b == 11) {
         var1.writeInt(this.f);
      }

   }
}
