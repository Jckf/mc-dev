
public class gm extends ft {

   private int a;


   public gm() {}

   public gm(int var1) {
      this.a = var1;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readUnsignedByte();
   }

   public void b(et var1) {
      var1.writeByte(this.a);
   }
}
