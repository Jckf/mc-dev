
public class ic extends ft {

   private String a;
   private String b;
   private int c;


   public ic() {}

   public ic(azx var1, int var2) {
      this.a = var1.b();
      this.b = var1.d();
      this.c = var2;
   }

   public void a(et var1) {
      this.a = var1.c(16);
      this.b = var1.c(32);
      this.c = var1.readByte();
   }

   public void b(et var1) {
      var1.a(this.a);
      var1.a(this.b);
      var1.writeByte(this.c);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
