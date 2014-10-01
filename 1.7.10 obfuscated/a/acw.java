
public class acw extends adb {

   public acw() {
      this.h = 1;
      this.f(64);
      this.a(abt.i);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
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

      if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         if(var3.a(var4, var5, var6).o() == awt.a) {
            var3.a((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, g.nextFloat() * 0.4F + 0.8F);
            var3.b(var4, var5, var6, (aji)ajn.ab);
         }

         var1.a(1, (sv)var2);
         return true;
      }
   }
}
