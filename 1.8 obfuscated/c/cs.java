import java.util.Random;

class cs {

   double a;
   double b;


   cs() {}

   cs(double var1, double var3) {
      this.a = var1;
      this.b = var3;
   }

   double a(cs var1) {
      double var2 = this.a - var1.a;
      double var4 = this.b - var1.b;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   void a() {
      double var1 = (double)this.b();
      this.a /= var1;
      this.b /= var1;
   }

   float b() {
      return uv.a(this.a * this.a + this.b * this.b);
   }

   public void b(cs var1) {
      this.a -= var1.a;
      this.b -= var1.b;
   }

   public boolean a(double var1, double var3, double var5, double var7) {
      boolean var9 = false;
      if(this.a < var1) {
         this.a = var1;
         var9 = true;
      } else if(this.a > var5) {
         this.a = var5;
         var9 = true;
      }

      if(this.b < var3) {
         this.b = var3;
         var9 = true;
      } else if(this.b > var7) {
         this.b = var7;
         var9 = true;
      }

      return var9;
   }

   public int a(aqu var1) {
      dt var2 = new dt(this.a, 256.0D, this.b);

      do {
         if(var2.o() <= 0) {
            return 257;
         }

         var2 = var2.b();
      } while(var1.p(var2).c().r() == bof.a);

      return var2.o() + 1;
   }

   public boolean b(aqu var1) {
      dt var2 = new dt(this.a, 256.0D, this.b);

      bof var3;
      do {
         if(var2.o() <= 0) {
            return false;
         }

         var2 = var2.b();
         var3 = var1.p(var2).c().r();
      } while(var3 == bof.a);

      return !var3.d() && var3 != bof.o;
   }

   public void a(Random var1, double var2, double var4, double var6, double var8) {
      this.a = uv.a(var1, var2, var6);
      this.b = uv.a(var1, var4, var8);
   }
}
