
public class ve extends ui {

   private td a;
   private vy b;


   public ve(td var1) {
      this.a = var1;
   }

   public boolean a() {
      if(this.a.o.w()) {
         return false;
      } else {
         vz var1 = this.a.o.A.a(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u), 16);
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.b(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u));
            return this.b == null?false:(double)this.b.c(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u)) < 2.25D;
         }
      }
   }

   public boolean b() {
      return this.a.o.w()?false:!this.b.g && this.b.a(qh.c(this.a.s), qh.c(this.a.u));
   }

   public void c() {
      this.a.m().b(false);
      this.a.m().c(false);
   }

   public void d() {
      this.a.m().b(true);
      this.a.m().c(true);
      this.b = null;
   }

   public void e() {
      this.b.e();
   }
}
