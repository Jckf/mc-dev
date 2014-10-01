
public class azw {

   public double a;
   public double b;
   public double c;


   public static azw a(double var0, double var2, double var4) {
      return new azw(var0, var2, var4);
   }

   protected azw(double var1, double var3, double var5) {
      if(var1 == -0.0D) {
         var1 = 0.0D;
      }

      if(var3 == -0.0D) {
         var3 = 0.0D;
      }

      if(var5 == -0.0D) {
         var5 = 0.0D;
      }

      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   protected azw b(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      return this;
   }

   public azw a() {
      double var1 = (double)qh.a(this.a * this.a + this.b * this.b + this.c * this.c);
      return var1 < 1.0E-4D?a(0.0D, 0.0D, 0.0D):a(this.a / var1, this.b / var1, this.c / var1);
   }

   public double b(azw var1) {
      return this.a * var1.a + this.b * var1.b + this.c * var1.c;
   }

   public azw c(double var1, double var3, double var5) {
      return a(this.a + var1, this.b + var3, this.c + var5);
   }

   public double d(azw var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return (double)qh.a(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double e(azw var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double d(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double b() {
      return (double)qh.a(this.a * this.a + this.b * this.b + this.c * this.c);
   }

   public azw b(azw var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.a) / var4;
         return var10 >= 0.0D && var10 <= 1.0D?a(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public azw c(azw var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var6 * var6 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.b) / var6;
         return var10 >= 0.0D && var10 <= 1.0D?a(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public azw d(azw var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var8 * var8 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.c) / var8;
         return var10 >= 0.0D && var10 <= 1.0D?a(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + ")";
   }

   public void a(float var1) {
      float var2 = qh.b(var1);
      float var3 = qh.a(var1);
      double var4 = this.a;
      double var6 = this.b * (double)var2 + this.c * (double)var3;
      double var8 = this.c * (double)var2 - this.b * (double)var3;
      this.b(var4, var6, var8);
   }

   public void b(float var1) {
      float var2 = qh.b(var1);
      float var3 = qh.a(var1);
      double var4 = this.a * (double)var2 + this.c * (double)var3;
      double var6 = this.b;
      double var8 = this.c * (double)var2 - this.a * (double)var3;
      this.b(var4, var6, var8);
   }
}
