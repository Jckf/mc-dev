
public class tu {

   private sw a;
   private float b;
   private float c;
   private boolean d;
   private double e;
   private double f;
   private double g;


   public tu(sw var1) {
      this.a = var1;
   }

   public void a(sa var1, float var2, float var3) {
      this.e = var1.s;
      if(var1 instanceof sv) {
         this.f = var1.t + (double)var1.g();
      } else {
         this.f = (var1.C.b + var1.C.e) / 2.0D;
      }

      this.g = var1.u;
      this.b = var2;
      this.c = var3;
      this.d = true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.e = var1;
      this.f = var3;
      this.g = var5;
      this.b = var7;
      this.c = var8;
      this.d = true;
   }

   public void a() {
      this.a.z = 0.0F;
      if(this.d) {
         this.d = false;
         double var1 = this.e - this.a.s;
         double var3 = this.f - (this.a.t + (double)this.a.g());
         double var5 = this.g - this.a.u;
         double var7 = (double)qh.a(var1 * var1 + var5 * var5);
         float var9 = (float)(Math.atan2(var5, var1) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var10 = (float)(-(Math.atan2(var3, var7) * 180.0D / 3.1415927410125732D));
         this.a.z = this.a(this.a.z, var10, this.c);
         this.a.aO = this.a(this.a.aO, var9, this.b);
      } else {
         this.a.aO = this.a(this.a.aO, this.a.aM, 10.0F);
      }

      float var11 = qh.g(this.a.aO - this.a.aM);
      if(!this.a.m().g()) {
         if(var11 < -75.0F) {
            this.a.aO = this.a.aM - 75.0F;
         }

         if(var11 > 75.0F) {
            this.a.aO = this.a.aM + 75.0F;
         }
      }

   }

   private float a(float var1, float var2, float var3) {
      float var4 = qh.g(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }
}
