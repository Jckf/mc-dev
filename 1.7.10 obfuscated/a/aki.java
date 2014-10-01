import java.util.List;
import java.util.Random;

public class aki extends aje {

   public aki() {
      super(true);
      this.a(true);
   }

   public int a(ahb var1) {
      return 20;
   }

   public boolean f() {
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      if(!var1.E) {
         int var6 = var1.e(var2, var3, var4);
         if((var6 & 8) == 0) {
            this.a(var1, var2, var3, var4, var6);
         }
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         int var6 = var1.e(var2, var3, var4);
         if((var6 & 8) != 0) {
            this.a(var1, var2, var3, var4, var6);
         }
      }
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      return (var1.e(var2, var3, var4) & 8) != 0?15:0;
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      return (var1.e(var2, var3, var4) & 8) == 0?0:(var5 == 1?15:0);
   }

   private void a(ahb var1, int var2, int var3, int var4, int var5) {
      boolean var6 = (var5 & 8) != 0;
      boolean var7 = false;
      float var8 = 0.125F;
      List var9 = var1.a(xl.class, azt.a((double)((float)var2 + var8), (double)var3, (double)((float)var4 + var8), (double)((float)(var2 + 1) - var8), (double)((float)(var3 + 1) - var8), (double)((float)(var4 + 1) - var8)));
      if(!var9.isEmpty()) {
         var7 = true;
      }

      if(var7 && !var6) {
         var1.a(var2, var3, var4, var5 | 8, 3);
         var1.d(var2, var3, var4, this);
         var1.d(var2, var3 - 1, var4, this);
         var1.c(var2, var3, var4, var2, var3, var4);
      }

      if(!var7 && var6) {
         var1.a(var2, var3, var4, var5 & 7, 3);
         var1.d(var2, var3, var4, this);
         var1.d(var2, var3 - 1, var4, this);
         var1.c(var2, var3, var4, var2, var3, var4);
      }

      if(var7) {
         var1.a(var2, var3, var4, this, this.a(var1));
      }

      var1.f(var2, var3, var4, this);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      this.a(var1, var2, var3, var4, var1.e(var2, var3, var4));
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      if((var1.e(var2, var3, var4) & 8) > 0) {
         float var6 = 0.125F;
         List var7 = var1.a(xn.class, azt.a((double)((float)var2 + var6), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)(var3 + 1) - var6), (double)((float)(var4 + 1) - var6)));
         if(var7.size() > 0) {
            return ((xn)var7.get(0)).e().g();
         }

         List var8 = var1.a(xl.class, azt.a((double)((float)var2 + var6), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)(var3 + 1) - var6), (double)((float)(var4 + 1) - var6)), sj.c);
         if(var8.size() > 0) {
            return zs.b((rb)var8.get(0));
         }
      }

      return 0;
   }
}
