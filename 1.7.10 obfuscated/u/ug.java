
public class ug extends ui {

   private tg d;
   private sv e;
   ahb a;
   private double f;
   private vv g;
   private int h;
   float b;
   float c;
   private boolean i;


   public ug(tg var1, double var2, float var4, float var5) {
      this.d = var1;
      this.a = var1.o;
      this.f = var2;
      this.g = var1.m();
      this.c = var4;
      this.b = var5;
      this.a(3);
   }

   public boolean a() {
      sv var1 = this.d.cb();
      if(var1 == null) {
         return false;
      } else if(this.d.ca()) {
         return false;
      } else if(this.d.f(var1) < (double)(this.c * this.c)) {
         return false;
      } else {
         this.e = var1;
         return true;
      }
   }

   public boolean b() {
      return !this.g.g() && this.d.f(this.e) > (double)(this.b * this.b) && !this.d.ca();
   }

   public void c() {
      this.h = 0;
      this.i = this.d.m().a();
      this.d.m().a(false);
   }

   public void d() {
      this.e = null;
      this.g.h();
      this.d.m().a(this.i);
   }

   public void e() {
      this.d.j().a(this.e, 10.0F, (float)this.d.x());
      if(!this.d.ca()) {
         if(--this.h <= 0) {
            this.h = 10;
            if(!this.g.a((sa)this.e, this.f)) {
               if(!this.d.bN()) {
                  if(this.d.f(this.e) >= 144.0D) {
                     int var1 = qh.c(this.e.s) - 2;
                     int var2 = qh.c(this.e.u) - 2;
                     int var3 = qh.c(this.e.C.b);

                     for(int var4 = 0; var4 <= 4; ++var4) {
                        for(int var5 = 0; var5 <= 4; ++var5) {
                           if((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && ahb.a((ahl)this.a, var1 + var4, var3 - 1, var2 + var5) && !this.a.a(var1 + var4, var3, var2 + var5).r() && !this.a.a(var1 + var4, var3 + 1, var2 + var5).r()) {
                              this.d.b((double)((float)(var1 + var4) + 0.5F), (double)var3, (double)((float)(var2 + var5) + 0.5F), this.d.y, this.d.z);
                              this.g.h();
                              return;
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }
}
