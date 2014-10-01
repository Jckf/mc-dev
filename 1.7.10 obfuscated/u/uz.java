
public class uz extends ui {

   private td a;
   private double b;
   private double c;
   private double d;
   private double e;


   public uz(td var1, double var2) {
      this.a = var1;
      this.b = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.aJ() == null && !this.a.al()) {
         return false;
      } else {
         azw var1 = vx.a(this.a, 5, 4);
         if(var1 == null) {
            return false;
         } else {
            this.c = var1.a;
            this.d = var1.b;
            this.e = var1.c;
            return true;
         }
      }
   }

   public void c() {
      this.a.m().a(this.c, this.d, this.e, this.b);
   }

   public boolean b() {
      return !this.a.m().g();
   }
}
