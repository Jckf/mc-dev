
public class vk extends ui {

   private td a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   private yz h;
   private int i;
   private boolean j;
   private adb k;
   private boolean l;
   private boolean m;


   public vk(td var1, double var2, adb var4, boolean var5) {
      this.a = var1;
      this.b = var2;
      this.k = var4;
      this.l = var5;
      this.a(3);
   }

   public boolean a() {
      if(this.i > 0) {
         --this.i;
         return false;
      } else {
         this.h = this.a.o.a(this.a, 10.0D);
         if(this.h == null) {
            return false;
         } else {
            add var1 = this.h.bF();
            return var1 == null?false:var1.b() == this.k;
         }
      }
   }

   public boolean b() {
      if(this.l) {
         if(this.a.f(this.h) < 36.0D) {
            if(this.h.e(this.c, this.d, this.e) > 0.010000000000000002D) {
               return false;
            }

            if(Math.abs((double)this.h.z - this.f) > 5.0D || Math.abs((double)this.h.y - this.g) > 5.0D) {
               return false;
            }
         } else {
            this.c = this.h.s;
            this.d = this.h.t;
            this.e = this.h.u;
         }

         this.f = (double)this.h.z;
         this.g = (double)this.h.y;
      }

      return this.a();
   }

   public void c() {
      this.c = this.h.s;
      this.d = this.h.t;
      this.e = this.h.u;
      this.j = true;
      this.m = this.a.m().a();
      this.a.m().a(false);
   }

   public void d() {
      this.h = null;
      this.a.m().h();
      this.i = 100;
      this.j = false;
      this.a.m().a(this.m);
   }

   public void e() {
      this.a.j().a(this.h, 30.0F, (float)this.a.x());
      if(this.a.f(this.h) < 6.25D) {
         this.a.m().h();
      } else {
         this.a.m().a((sa)this.h, this.b);
      }

   }

   public boolean f() {
      return this.j;
   }
}
