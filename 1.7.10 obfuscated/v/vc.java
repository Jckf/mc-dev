
public class vc extends ui {

   private td a;
   private double b;
   private double c;
   private double d;
   private double e;


   public vc(td var1, double var2) {
      this.a = var1;
      this.e = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.aN() >= 100) {
         return false;
      } else if(this.a.aI().nextInt(120) != 0) {
         return false;
      } else {
         azw var1 = vx.a(this.a, 10, 7);
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.a;
            this.c = var1.b;
            this.d = var1.c;
            return true;
         }
      }
   }

   public boolean b() {
      return !this.a.m().g();
   }

   public void c() {
      this.a.m().a(this.b, this.c, this.d, this.e);
   }
}
