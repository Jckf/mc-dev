
public class vt extends vu {

   tg a;
   sv b;
   private int e;


   public vt(tg var1) {
      super(var1, false);
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      if(!this.a.bZ()) {
         return false;
      } else {
         sv var1 = this.a.cb();
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.aL();
            int var2 = var1.aM();
            return var2 != this.e && this.a(this.b, false) && this.a.a(this.b, var1);
         }
      }
   }

   public void c() {
      this.c.d(this.b);
      sv var1 = this.a.cb();
      if(var1 != null) {
         this.e = var1.aM();
      }

      super.c();
   }
}
