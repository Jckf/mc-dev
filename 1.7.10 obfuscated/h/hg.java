
public class hg extends hf {

   public hg() {}

   public hg(int var1, byte var2, byte var3, byte var4) {
      super(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void a(et var1) {
      super.a(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
   }

   public void b(et var1) {
      super.b(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
   }

   public String b() {
      return super.b() + String.format(", xa=%d, ya=%d, za=%d", new Object[]{Byte.valueOf(this.b), Byte.valueOf(this.c), Byte.valueOf(this.d)});
   }
}
