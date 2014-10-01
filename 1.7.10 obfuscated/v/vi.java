
public class vi extends ui {

   xz a;
   sv b;


   public vi(xz var1) {
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      sv var1 = this.a.o();
      return this.a.cb() > 0 || var1 != null && this.a.f(var1) < 9.0D;
   }

   public void c() {
      this.a.m().h();
      this.b = this.a.o();
   }

   public void d() {
      this.b = null;
   }

   public void e() {
      if(this.b == null) {
         this.a.a(-1);
      } else if(this.a.f(this.b) > 49.0D) {
         this.a.a(-1);
      } else if(!this.a.n().a(this.b)) {
         this.a.a(-1);
      } else {
         this.a.a(1);
      }
   }
}
