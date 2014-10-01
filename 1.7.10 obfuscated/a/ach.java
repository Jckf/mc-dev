
public class ach extends adb {

   private awt a;


   public ach(awt var1) {
      this.a = var1;
      this.h = 1;
      this.a(abt.d);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 != 1) {
         return false;
      } else {
         ++var5;
         aji var11;
         if(this.a == awt.d) {
            var11 = ajn.ao;
         } else {
            var11 = ajn.av;
         }

         if(var2.a(var4, var5, var6, var7, var1) && var2.a(var4, var5 + 1, var6, var7, var1)) {
            if(!var11.c(var3, var4, var5, var6)) {
               return false;
            } else {
               int var12 = qh.c((double)((var2.y + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
               a(var3, var4, var5, var6, var12, var11);
               --var1.b;
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public static void a(ahb var0, int var1, int var2, int var3, int var4, aji var5) {
      byte var6 = 0;
      byte var7 = 0;
      if(var4 == 0) {
         var7 = 1;
      }

      if(var4 == 1) {
         var6 = -1;
      }

      if(var4 == 2) {
         var7 = -1;
      }

      if(var4 == 3) {
         var6 = 1;
      }

      int var8 = (var0.a(var1 - var6, var2, var3 - var7).r()?1:0) + (var0.a(var1 - var6, var2 + 1, var3 - var7).r()?1:0);
      int var9 = (var0.a(var1 + var6, var2, var3 + var7).r()?1:0) + (var0.a(var1 + var6, var2 + 1, var3 + var7).r()?1:0);
      boolean var10 = var0.a(var1 - var6, var2, var3 - var7) == var5 || var0.a(var1 - var6, var2 + 1, var3 - var7) == var5;
      boolean var11 = var0.a(var1 + var6, var2, var3 + var7) == var5 || var0.a(var1 + var6, var2 + 1, var3 + var7) == var5;
      boolean var12 = false;
      if(var10 && !var11) {
         var12 = true;
      } else if(var9 > var8) {
         var12 = true;
      }

      var0.d(var1, var2, var3, var5, var4, 2);
      var0.d(var1, var2 + 1, var3, var5, 8 | (var12?1:0), 2);
      var0.d(var1, var2, var3, var5);
      var0.d(var1, var2 + 1, var3, var5);
   }
}
