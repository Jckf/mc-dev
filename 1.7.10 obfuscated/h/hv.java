
public class hv extends ft {

   private int a;
   private String b;


   public hv() {}

   public hv(int var1, azx var2) {
      this.a = var1;
      if(var2 == null) {
         this.b = "";
      } else {
         this.b = var2.b();
      }

   }

   public void a(et var1) {
      this.a = var1.readByte();
      this.b = var1.c(16);
   }

   public void b(et var1) {
      var1.writeByte(this.a);
      var1.a(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
