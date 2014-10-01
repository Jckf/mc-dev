
public class vl extends ui {

   private yv a;


   public vl(yv var1) {
      this.a = var1;
      this.a(5);
   }

   public boolean a() {
      if(!this.a.Z()) {
         return false;
      } else if(this.a.M()) {
         return false;
      } else if(!this.a.D) {
         return false;
      } else if(this.a.H) {
         return false;
      } else {
         yz var1 = this.a.b();
         return var1 == null?false:(this.a.f(var1) > 16.0D?false:var1.bo instanceof zs);
      }
   }

   public void c() {
      this.a.m().h();
   }

   public void d() {
      this.a.a_((yz)null);
   }
}
