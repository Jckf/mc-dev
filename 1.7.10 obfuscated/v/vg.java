
public class vg extends ui {

   private wi a;
   private double b;
   private double c;
   private double d;
   private double e;


   public vg(wi var1, double var2) {
      this.a = var1;
      this.b = var2;
      this.a(1);
   }

   public boolean a() {
      if(!this.a.cc() && this.a.l != null) {
         azw var1 = vx.a(this.a, 5, 4);
         if(var1 == null) {
            return false;
         } else {
            this.c = var1.a;
            this.d = var1.b;
            this.e = var1.c;
            return true;
         }
      } else {
         return false;
      }
   }

   public void c() {
      this.a.m().a(this.c, this.d, this.e, this.b);
   }

   public boolean b() {
      return !this.a.m().g() && this.a.l != null;
   }

   public void e() {
      if(this.a.aI().nextInt(50) == 0) {
         if(this.a.l instanceof yz) {
            int var1 = this.a.cq();
            int var2 = this.a.cw();
            if(var2 > 0 && this.a.aI().nextInt(var2) < var1) {
               this.a.h((yz)this.a.l);
               this.a.o.a(this.a, (byte)7);
               return;
            }

            this.a.v(5);
         }

         this.a.l.a((sa)null);
         this.a.l = null;
         this.a.cJ();
         this.a.o.a(this.a, (byte)6);
      }

   }
}
