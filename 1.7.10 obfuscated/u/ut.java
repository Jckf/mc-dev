
public class ut extends ui {

   private td a;
   private double b;
   private double c;
   private double d;
   private double e;


   public ut(td var1, double var2) {
      this.a = var1;
      this.e = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.bU()) {
         return false;
      } else {
         r var1 = this.a.bV();
         azw var2 = vx.a(this.a, 16, 7, azw.a((double)var1.a, (double)var1.b, (double)var1.c));
         if(var2 == null) {
            return false;
         } else {
            this.b = var2.a;
            this.c = var2.b;
            this.d = var2.c;
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
