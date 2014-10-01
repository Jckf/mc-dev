import java.util.Random;

public class vx {

   private static azw a = azw.a(0.0D, 0.0D, 0.0D);


   public static azw a(td var0, int var1, int var2) {
      return c(var0, var1, var2, (azw)null);
   }

   public static azw a(td var0, int var1, int var2, azw var3) {
      a.a = var3.a - var0.s;
      a.b = var3.b - var0.t;
      a.c = var3.c - var0.u;
      return c(var0, var1, var2, a);
   }

   public static azw b(td var0, int var1, int var2, azw var3) {
      a.a = var0.s - var3.a;
      a.b = var0.t - var3.b;
      a.c = var0.u - var3.c;
      return c(var0, var1, var2, a);
   }

   private static azw c(td var0, int var1, int var2, azw var3) {
      Random var4 = var0.aI();
      boolean var5 = false;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      float var9 = -99999.0F;
      boolean var10;
      if(var0.bY()) {
         double var11 = (double)(var0.bV().e(qh.c(var0.s), qh.c(var0.t), qh.c(var0.u)) + 4.0F);
         double var13 = (double)(var0.bW() + (float)var1);
         var10 = var11 < var13 * var13;
      } else {
         var10 = false;
      }

      for(int var16 = 0; var16 < 10; ++var16) {
         int var12 = var4.nextInt(2 * var1) - var1;
         int var17 = var4.nextInt(2 * var2) - var2;
         int var14 = var4.nextInt(2 * var1) - var1;
         if(var3 == null || (double)var12 * var3.a + (double)var14 * var3.c >= 0.0D) {
            var12 += qh.c(var0.s);
            var17 += qh.c(var0.t);
            var14 += qh.c(var0.u);
            if(!var10 || var0.b(var12, var17, var14)) {
               float var15 = var0.a(var12, var17, var14);
               if(var15 > var9) {
                  var9 = var15;
                  var6 = var12;
                  var7 = var17;
                  var8 = var14;
                  var5 = true;
               }
            }
         }
      }

      if(var5) {
         return azw.a((double)var6, (double)var7, (double)var8);
      } else {
         return null;
      }
   }

}
