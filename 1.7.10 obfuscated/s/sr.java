
public abstract class sr extends sw {

   public sr(ahb var1) {
      super(var1);
   }

   protected void b(float var1) {}

   protected void a(double var1, boolean var3) {}

   public void e(float var1, float var2) {
      if(this.M()) {
         this.a(var1, var2, 0.02F);
         this.d(this.v, this.w, this.x);
         this.v *= 0.800000011920929D;
         this.w *= 0.800000011920929D;
         this.x *= 0.800000011920929D;
      } else if(this.P()) {
         this.a(var1, var2, 0.02F);
         this.d(this.v, this.w, this.x);
         this.v *= 0.5D;
         this.w *= 0.5D;
         this.x *= 0.5D;
      } else {
         float var3 = 0.91F;
         if(this.D) {
            var3 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
         }

         float var4 = 0.16277136F / (var3 * var3 * var3);
         this.a(var1, var2, this.D?0.1F * var4:0.02F);
         var3 = 0.91F;
         if(this.D) {
            var3 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
         }

         this.d(this.v, this.w, this.x);
         this.v *= (double)var3;
         this.w *= (double)var3;
         this.x *= (double)var3;
      }

      this.aE = this.aF;
      double var8 = this.s - this.p;
      double var5 = this.u - this.r;
      float var7 = qh.a(var8 * var8 + var5 * var5) * 4.0F;
      if(var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.aF += (var7 - this.aF) * 0.4F;
      this.aG += this.aF;
   }

   public boolean h_() {
      return false;
   }
}
