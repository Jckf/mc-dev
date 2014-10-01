import java.util.List;

public class hw extends ft {

   private int a;
   private List b;


   public hw() {}

   public hw(int var1, te var2, boolean var3) {
      this.a = var1;
      if(var3) {
         this.b = var2.c();
      } else {
         this.b = var2.b();
      }

   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = te.b(var1);
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      te.a(this.b, var1);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
