
public class hu extends ft {

   private int a;


   public hu() {}

   public hu(int var1) {
      this.a = var1;
   }

   public void a(et var1) {
      this.a = var1.readByte();
   }

   public void b(et var1) {
      var1.writeByte(this.a);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
