
class afd extends zb {

   private afa b;
   public int a;


   public afd(afa var1) {
      this.b = var1;
   }

   public boolean a() {
      return this.b.u() != null;
   }

   public void c() {
      this.a = 0;
   }

   public void d() {
      this.b.a(false);
   }

   public void e() {
      xm var1 = this.b.u();
      double var2 = 64.0D;
      if(var1.h(this.b) < var2 * var2 && this.b.t(var1)) {
         aqu var4 = this.b.o;
         ++this.a;
         if(this.a == 10) {
            var4.a((ahd)null, 1007, new dt(this.b), 0);
         }

         if(this.a == 20) {
            double var5 = 4.0D;
            brw var7 = this.b.d(1.0F);
            double var8 = var1.s - (this.b.s + var7.a * var5);
            double var10 = var1.aQ().b + (double)(var1.K / 2.0F) - (0.5D + this.b.t + (double)(this.b.K / 2.0F));
            double var12 = var1.u - (this.b.u + var7.c * var5);
            var4.a((ahd)null, 1008, new dt(this.b), 0);
            ahn var14 = new ahn(var4, this.b, var8, var10, var12);
            var14.e = this.b.cd();
            var14.s = this.b.s + var7.a * var5;
            var14.t = this.b.t + (double)(this.b.K / 2.0F) + 0.5D;
            var14.u = this.b.u + var7.c * var5;
            var4.d((wv)var14);
            this.a = -40;
         }
      } else if(this.a > 0) {
         --this.a;
      }

      this.b.a(this.a > 10);
   }
}
