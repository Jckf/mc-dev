
public class iu implements id {

   private dt a;
   private int b;
   private fn c;


   public iu() {}

   public iu(dt var1, int var2, fn var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(hd var1) {
      this.a = var1.c();
      this.b = var1.readUnsignedByte();
      this.c = var1.h();
   }

   public void b(hd var1) {
      var1.a(this.a);
      var1.writeByte((byte)this.b);
      var1.a(this.c);
   }

   public void a(ik var1) {
      var1.a(this);
   }
}
