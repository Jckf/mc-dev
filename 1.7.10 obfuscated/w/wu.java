
public abstract class wu extends td implements ry {

   public wu(ahb var1) {
      super(var1);
   }

   public boolean aE() {
      return true;
   }

   public boolean by() {
      return this.o.b(this.C);
   }

   public int q() {
      return 120;
   }

   protected boolean v() {
      return true;
   }

   protected int e(yz var1) {
      return 1 + this.o.s.nextInt(3);
   }

   public void C() {
      int var1 = this.ar();
      super.C();
      if(this.Z() && !this.M()) {
         --var1;
         this.h(var1);
         if(this.ar() == -20) {
            this.h(0);
            this.a(ro.e, 2.0F);
         }
      } else {
         this.h(300);
      }

   }
}
