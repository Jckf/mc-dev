
public class jh implements id {

   private int a;
   private int b;
   private amj c;


   public jh() {}

   public jh(int var1, int var2, amj var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3 == null?null:var3.k();
   }

   public void a(ik var1) {
      var1.a(this);
   }

   public void a(hd var1) {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.i();
   }

   public void b(hd var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.a(this.c);
   }
}
