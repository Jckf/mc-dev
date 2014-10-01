
public class jm extends ft {

   private int a;
   private add b;


   public void a(io var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readShort();
      this.b = var1.c();
   }

   public void b(et var1) {
      var1.writeShort(this.a);
      var1.a(this.b);
   }

   public int c() {
      return this.a;
   }

   public add d() {
      return this.b;
   }
}
