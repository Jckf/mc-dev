
public class abg extends adb {

   public abg() {
      this.a(abt.c);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var3.E) {
         return true;
      } else if(var7 != 1) {
         return false;
      } else {
         ++var5;
         ajh var11 = (ajh)ajn.C;
         int var12 = qh.c((double)(var2.y * 4.0F / 360.0F) + 0.5D) & 3;
         byte var13 = 0;
         byte var14 = 0;
         if(var12 == 0) {
            var14 = 1;
         }

         if(var12 == 1) {
            var13 = -1;
         }

         if(var12 == 2) {
            var14 = -1;
         }

         if(var12 == 3) {
            var13 = 1;
         }

         if(var2.a(var4, var5, var6, var7, var1) && var2.a(var4 + var13, var5, var6 + var14, var7, var1)) {
            if(var3.c(var4, var5, var6) && var3.c(var4 + var13, var5, var6 + var14) && ahb.a((ahl)var3, var4, var5 - 1, var6) && ahb.a((ahl)var3, var4 + var13, var5 - 1, var6 + var14)) {
               var3.d(var4, var5, var6, var11, var12, 3);
               if(var3.a(var4, var5, var6) == var11) {
                  var3.d(var4 + var13, var5, var6 + var14, var11, var12 + 8, 3);
               }

               --var1.b;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }
}
