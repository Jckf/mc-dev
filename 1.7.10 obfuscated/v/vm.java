
public class vm extends vu {

   wt a;
   sv b;


   public vm(wt var1) {
      super(var1, false, true);
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      vz var1 = this.a.bZ();
      if(var1 == null) {
         return false;
      } else {
         this.b = var1.b((sv)this.a);
         if(!this.a(this.b, false)) {
            if(this.c.aI().nextInt(20) == 0) {
               this.b = var1.c(this.a);
               return this.a(this.b, false);
            } else {
               return false;
            }
         } else {
            return true;
         }
      }
   }

   public void c() {
      this.a.d(this.b);
      super.c();
   }
}
