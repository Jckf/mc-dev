
public class vh extends ui {

   private tg a;
   private boolean b;


   public vh(tg var1) {
      this.a = var1;
      this.a(5);
   }

   public boolean a() {
      if(!this.a.bZ()) {
         return false;
      } else if(this.a.M()) {
         return false;
      } else if(!this.a.D) {
         return false;
      } else {
         sv var1 = this.a.cb();
         return var1 == null?true:(this.a.f(var1) < 144.0D && var1.aJ() != null?false:this.b);
      }
   }

   public void c() {
      this.a.m().h();
      this.a.k(true);
   }

   public void d() {
      this.a.k(false);
   }

   public void a(boolean var1) {
      this.b = var1;
   }
}
