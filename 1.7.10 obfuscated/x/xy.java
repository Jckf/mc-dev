
public class xy extends yn {

   public xy(ahb var1) {
      super(var1);
      this.a(0.7F, 0.5F);
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(12.0D);
   }

   public boolean n(sa var1) {
      if(super.n(var1)) {
         if(var1 instanceof sv) {
            byte var2 = 0;
            if(this.o.r == rd.c) {
               var2 = 7;
            } else if(this.o.r == rd.d) {
               var2 = 15;
            }

            if(var2 > 0) {
               ((sv)var1).c(new rw(rv.u.H, var2 * 20, 0));
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public sy a(sy var1) {
      return var1;
   }
}
