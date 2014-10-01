
public class hj extends ft {

   private int a;
   private int b;
   private int c;


   public hj() {}

   public hj(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
   }
}
