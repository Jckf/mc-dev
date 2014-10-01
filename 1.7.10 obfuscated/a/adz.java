
public class adz extends adb {

   public adz() {
      this.h = 16;
      this.a(abt.c);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 == 0) {
         return false;
      } else if(!var3.a(var4, var5, var6).o().a()) {
         return false;
      } else {
         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }

         if(!var2.a(var4, var5, var6, var7, var1)) {
            return false;
         } else if(!ajn.an.c(var3, var4, var5, var6)) {
            return false;
         } else if(var3.E) {
            return true;
         } else {
            if(var7 == 1) {
               int var11 = qh.c((double)((var2.y + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
               var3.d(var4, var5, var6, ajn.an, var11, 3);
            } else {
               var3.d(var4, var5, var6, ajn.as, var7, 3);
            }

            --var1.b;
            apm var12 = (apm)var3.o(var4, var5, var6);
            if(var12 != null) {
               var2.a((aor)var12);
            }

            return true;
         }
      }
   }
}
