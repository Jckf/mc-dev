import java.util.Random;

class bs {

   double a;
   double b;


   bs() {}

   bs(double var1, double var3) {
      this.a = var1;
      this.b = var3;
   }

   double a(bs var1) {
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
      return qh.a(this.a * this.a + this.b * this.b);
   }

   public void b(bs var1) {
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

   public int a(ahb var1) {
      int var2 = qh.c(this.a);
      int var3 = qh.c(this.b);

      for(int var4 = 256; var4 > 0; --var4) {
         if(var1.a(var2, var4, var3).o() != awt.a) {
            return var4 + 1;
         }
      }

      return 257;
   }

   public boolean b(ahb var1) {
      int var2 = qh.c(this.a);
      int var3 = qh.c(this.b);
      short var4 = 256;
      if(var4 <= 0) {
         return false;
      } else {
         awt var5 = var1.a(var2, var4, var3).o();
         return !var5.d() && var5 != awt.o;
      }
   }

   public void a(Random var1, double var2, double var4, double var6, double var8) {
      this.a = qh.a(var1, var2, var6);
      this.b = qh.a(var1, var4, var8);
   }
}
