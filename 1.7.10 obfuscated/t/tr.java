
public class tr {

   private sv a;
   private int b;
   private float c;


   public tr(sv var1) {
      this.a = var1;
   }

   public void a() {
      double var1 = this.a.s - this.a.p;
      double var3 = this.a.u - this.a.r;
      if(var1 * var1 + var3 * var3 > 2.500000277905201E-7D) {
         this.a.aM = this.a.y;
         this.a.aO = this.a(this.a.aM, this.a.aO, 75.0F);
         this.c = this.a.aO;
         this.b = 0;
      } else {
         float var5 = 75.0F;
         if(Math.abs(this.a.aO - this.c) > 15.0F) {
            this.b = 0;
            this.c = this.a.aO;
         } else {
            ++this.b;
            boolean var6 = true;
            if(this.b > 10) {
               var5 = Math.max(1.0F - (float)(this.b - 10) / 10.0F, 0.0F) * 75.0F;
            }
         }

         this.a.aM = this.a(this.a.aO, this.a.aM, var5);
      }
   }

   private float a(float var1, float var2, float var3) {
      float var4 = qh.g(var1 - var2);
      if(var4 < -var3) {
         var4 = -var3;
      }

      if(var4 >= var3) {
         var4 = var3;
      }

      return var1 - var4;
   }
}
