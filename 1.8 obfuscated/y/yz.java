
public class yz extends zb {

   private xx d;
   private xm e;
   aqu a;
   private double f;
   private aaz g;
   private int h;
   float b;
   float c;
   private boolean i;


   public yz(xx var1, double var2, float var4, float var5) {
      this.d = var1;
      this.a = var1.o;
      this.f = var2;
      this.g = var1.s();
      this.c = var4;
      this.b = var5;
      this.a(3);
      if(!(var1.s() instanceof aay)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   public boolean a() {
      xm var1 = this.d.cm();
      if(var1 == null) {
         return false;
      } else if(this.d.cl()) {
         return false;
      } else if(this.d.h(var1) < (double)(this.c * this.c)) {
         return false;
      } else {
         this.e = var1;
         return true;
      }
   }

   public boolean b() {
      return !this.g.m() && this.d.h(this.e) > (double)(this.b * this.b) && !this.d.cl();
   }

   public void c() {
      this.h = 0;
      this.i = ((aay)this.d.s()).e();
      ((aay)this.d.s()).a(false);
   }

   public void d() {
      this.e = null;
      this.g.n();
      ((aay)this.d.s()).a(true);
   }

   public void e() {
      this.d.p().a(this.e, 10.0F, (float)this.d.bP());
      if(!this.d.cl()) {
         if(--this.h <= 0) {
            this.h = 10;
            if(!this.g.a((wv)this.e, this.f)) {
               if(!this.d.cb()) {
                  if(this.d.h(this.e) >= 144.0D) {
                     int var1 = uv.c(this.e.s) - 2;
                     int var2 = uv.c(this.e.u) - 2;
                     int var3 = uv.c(this.e.aQ().b);

                     for(int var4 = 0; var4 <= 4; ++var4) {
                        for(int var5 = 0; var5 <= 4; ++var5) {
                           if((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && aqu.a((ard)this.a, new dt(var1 + var4, var3 - 1, var2 + var5)) && !this.a.p(new dt(var1 + var4, var3, var2 + var5)).c().d() && !this.a.p(new dt(var1 + var4, var3 + 1, var2 + var5)).c().d()) {
                              this.d.b((double)((float)(var1 + var4) + 0.5F), (double)var3, (double)((float)(var2 + var5) + 0.5F), this.d.y, this.d.z);
                              this.g.n();
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
