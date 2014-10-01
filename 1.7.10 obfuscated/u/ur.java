
public class ur extends ui {

   private td a;
   private vy b;
   private int c = -1;
   private int d = -1;


   public ur(td var1) {
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      int var1 = qh.c(this.a.s);
      int var2 = qh.c(this.a.t);
      int var3 = qh.c(this.a.u);
      if((!this.a.o.w() || this.a.o.Q() || !this.a.o.a(var1, var3).e()) && !this.a.o.t.g) {
         if(this.a.aI().nextInt(50) != 0) {
            return false;
         } else if(this.c != -1 && this.a.e((double)this.c, this.a.t, (double)this.d) < 4.0D) {
            return false;
         } else {
            vz var4 = this.a.o.A.a(var1, var2, var3, 14);
            if(var4 == null) {
               return false;
            } else {
               this.b = var4.c(var1, var2, var3);
               return this.b != null;
            }
         }
      } else {
         return false;
      }
   }

   public boolean b() {
      return !this.a.m().g();
   }

   public void c() {
      this.c = -1;
      if(this.a.e((double)this.b.a(), (double)this.b.b, (double)this.b.c()) > 256.0D) {
         azw var1 = vx.a(this.a, 14, 3, azw.a((double)this.b.a() + 0.5D, (double)this.b.b(), (double)this.b.c() + 0.5D));
         if(var1 != null) {
            this.a.m().a(var1.a, var1.b, var1.c, 1.0D);
         }
      } else {
         this.a.m().a((double)this.b.a() + 0.5D, (double)this.b.b(), (double)this.b.c() + 0.5D, 1.0D);
      }

   }

   public void d() {
      this.c = this.b.a();
      this.d = this.b.c();
      this.b = null;
   }
}
