
public abstract class yg extends td implements yb {

   public yg(ahb var1) {
      super(var1);
      this.b = 5;
   }

   public void e() {
      this.bb();
      float var1 = this.d(1.0F);
      if(var1 > 0.5F) {
         this.aU += 2;
      }

      super.e();
   }

   public void h() {
      super.h();
      if(!this.o.E && this.o.r == rd.a) {
         this.B();
      }

   }

   protected String H() {
      return "game.hostile.swim";
   }

   protected String O() {
      return "game.hostile.swim.splash";
   }

   protected sa bR() {
      yz var1 = this.o.b(this, 16.0D);
      return var1 != null && this.p(var1)?var1:null;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if(super.a(var1, var2)) {
         sa var3 = var1.j();
         if(this.l != var3 && this.m != var3) {
            if(var3 != this) {
               this.bm = var3;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   protected String aT() {
      return "game.hostile.hurt";
   }

   protected String aU() {
      return "game.hostile.die";
   }

   protected String o(int var1) {
      return var1 > 4?"game.hostile.hurt.fall.big":"game.hostile.hurt.fall.small";
   }

   public boolean n(sa var1) {
      float var2 = (float)this.a(yj.e).e();
      int var3 = 0;
      if(var1 instanceof sv) {
         var2 += afv.a((sv)this, (sv)var1);
         var3 += afv.b(this, (sv)var1);
      }

      boolean var4 = var1.a(ro.a((sv)this), var2);
      if(var4) {
         if(var3 > 0) {
            var1.g((double)(-qh.a(this.y * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(qh.b(this.y * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
            this.v *= 0.6D;
            this.x *= 0.6D;
         }

         int var5 = afv.a((sv)this);
         if(var5 > 0) {
            var1.e(var5 * 4);
         }

         if(var1 instanceof sv) {
            afv.a((sv)var1, (sa)this);
         }

         afv.b(this, var1);
      }

      return var4;
   }

   protected void a(sa var1, float var2) {
      if(this.aB <= 0 && var2 < 2.0F && var1.C.e > this.C.b && var1.C.b < this.C.e) {
         this.aB = 20;
         this.n(var1);
      }

   }

   public float a(int var1, int var2, int var3) {
      return 0.5F - this.o.n(var1, var2, var3);
   }

   protected boolean j_() {
      int var1 = qh.c(this.s);
      int var2 = qh.c(this.C.b);
      int var3 = qh.c(this.u);
      if(this.o.b(ahn.a, var1, var2, var3) > this.Z.nextInt(32)) {
         return false;
      } else {
         int var4 = this.o.k(var1, var2, var3);
         if(this.o.P()) {
            int var5 = this.o.j;
            this.o.j = 10;
            var4 = this.o.k(var1, var2, var3);
            this.o.j = var5;
         }

         return var4 <= this.Z.nextInt(8);
      }
   }

   public boolean by() {
      return this.o.r != rd.a && this.j_() && super.by();
   }

   protected void aD() {
      super.aD();
      this.bc().b(yj.e);
   }

   protected boolean aG() {
      return true;
   }
}
