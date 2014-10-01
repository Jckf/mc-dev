import java.util.Iterator;
import java.util.Random;

public class ajh extends akk {

   public static final int[][] a = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};


   public ajh() {
      super(awt.n);
      this.e();
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         int var10 = var1.e(var2, var3, var4);
         if(!b(var10)) {
            int var11 = l(var10);
            var2 += a[var11][0];
            var4 += a[var11][1];
            if(var1.a(var2, var3, var4) != this) {
               return true;
            }

            var10 = var1.e(var2, var3, var4);
         }

         if(var1.t.e() && var1.a(var2, var4) != ahu.w) {
            if(c(var10)) {
               yz var19 = null;
               Iterator var12 = var1.h.iterator();

               while(var12.hasNext()) {
                  yz var21 = (yz)var12.next();
                  if(var21.bm()) {
                     r var14 = var21.bB;
                     if(var14.a == var2 && var14.b == var3 && var14.c == var4) {
                        var19 = var21;
                     }
                  }
               }

               if(var19 != null) {
                  var5.b((fj)(new fr("tile.bed.occupied", new Object[0])));
                  return true;
               }

               a(var1, var2, var3, var4, false);
            }

            za var20 = var5.a(var2, var3, var4);
            if(var20 == za.a) {
               a(var1, var2, var3, var4, true);
               return true;
            } else {
               if(var20 == za.c) {
                  var5.b((fj)(new fr("tile.bed.noSleep", new Object[0])));
               } else if(var20 == za.f) {
                  var5.b((fj)(new fr("tile.bed.notSafe", new Object[0])));
               }

               return true;
            }
         } else {
            double var18 = (double)var2 + 0.5D;
            double var13 = (double)var3 + 0.5D;
            double var15 = (double)var4 + 0.5D;
            var1.f(var2, var3, var4);
            int var17 = l(var10);
            var2 += a[var17][0];
            var4 += a[var17][1];
            if(var1.a(var2, var3, var4) == this) {
               var1.f(var2, var3, var4);
               var18 = (var18 + (double)var2 + 0.5D) / 2.0D;
               var13 = (var13 + (double)var3 + 0.5D) / 2.0D;
               var15 = (var15 + (double)var4 + 0.5D) / 2.0D;
            }

            var1.a((sa)null, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), 5.0F, true, true);
            return true;
         }
      }
   }

   public int b() {
      return 14;
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.e();
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      int var6 = var1.e(var2, var3, var4);
      int var7 = l(var6);
      if(b(var6)) {
         if(var1.a(var2 - a[var7][0], var3, var4 - a[var7][1]) != this) {
            var1.f(var2, var3, var4);
         }
      } else if(var1.a(var2 + a[var7][0], var3, var4 + a[var7][1]) != this) {
         var1.f(var2, var3, var4);
         if(!var1.E) {
            this.b(var1, var2, var3, var4, var6, 0);
         }
      }

   }

   public adb a(int var1, Random var2, int var3) {
      return b(var1)?adb.d(0):ade.aV;
   }

   private void e() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   public static boolean b(int var0) {
      return (var0 & 8) != 0;
   }

   public static boolean c(int var0) {
      return (var0 & 4) != 0;
   }

   public static void a(ahb var0, int var1, int var2, int var3, boolean var4) {
      int var5 = var0.e(var1, var2, var3);
      if(var4) {
         var5 |= 4;
      } else {
         var5 &= -5;
      }

      var0.a(var1, var2, var3, var5, 4);
   }

   public static r a(ahb var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.e(var1, var2, var3);
      int var6 = akk.l(var5);

      for(int var7 = 0; var7 <= 1; ++var7) {
         int var8 = var1 - a[var6][0] * var7 - 1;
         int var9 = var3 - a[var6][1] * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               if(ahb.a((ahl)var0, var12, var2 - 1, var13) && !var0.a(var12, var2, var13).o().k() && !var0.a(var12, var2 + 1, var13).o().k()) {
                  if(var4 <= 0) {
                     return new r(var12, var2, var13);
                  }

                  --var4;
               }
            }
         }
      }

      return null;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!b(var5)) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }

   }

   public int h() {
      return 1;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      if(var6.bE.d && b(var5)) {
         int var7 = l(var5);
         var2 -= a[var7][0];
         var4 -= a[var7][1];
         if(var1.a(var2, var3, var4) == this) {
            var1.f(var2, var3, var4);
         }
      }

   }

}
