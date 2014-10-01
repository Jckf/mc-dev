
public class ie extends ft {

   private String a = "";
   private String b = "";
   private int c;
   private int d;


   public ie() {}

   public ie(azz var1, int var2) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = var2;
   }

   public ie(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = 1;
   }

   public void a(et var1) {
      this.a = var1.c(16);
      this.d = var1.readByte();
      if(this.d != 1) {
         this.b = var1.c(16);
         this.c = var1.readInt();
      }

   }

   public void b(et var1) {
      var1.a(this.a);
      var1.writeByte(this.d);
      if(this.d != 1) {
         var1.a(this.b);
         var1.writeInt(this.c);
      }

   }

   public void a(fv var1) {
      var1.a(this);
   }
}
