
public class ads extends adb {

   public ads() {
      this.a(abt.d);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var3.a(var4, var5, var6) != ajn.aC) {
         if(var7 == 0) {
            --var5;
         }

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

         if(!var3.c(var4, var5, var6)) {
            return false;
         }
      }

      if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         if(ajn.af.c(var3, var4, var5, var6)) {
            --var1.b;
            var3.b(var4, var5, var6, (aji)ajn.af);
         }

         return true;
      }
   }
}
