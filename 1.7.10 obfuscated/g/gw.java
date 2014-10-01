
public class gw extends ft {

   private int a;


   public gw() {}

   public gw(int var1) {
      this.a = var1;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readInt();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
   }

   public boolean a() {
      return true;
   }
}
