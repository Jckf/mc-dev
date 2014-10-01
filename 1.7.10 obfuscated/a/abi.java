
public class abi extends adb {

   private aji a;


   public abi(aji var1) {
      this.a = var1;
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      aji var11 = var3.a(var4, var5, var6);
      if(var11 == ajn.aC && (var3.e(var4, var5, var6) & 7) < 1) {
         var7 = 1;
      } else if(var11 != ajn.bd && var11 != ajn.H && var11 != ajn.I) {
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
      }

      if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else if(var1.b == 0) {
         return false;
      } else {
         if(var3.a(this.a, var4, var5, var6, false, var7, (sa)null, var1)) {
            int var12 = this.a.a(var3, var4, var5, var6, var7, var8, var9, var10, 0);
            if(var3.d(var4, var5, var6, this.a, var12, 3)) {
               if(var3.a(var4, var5, var6) == this.a) {
                  this.a.a(var3, var4, var5, var6, (sv)var2, var1);
                  this.a.e(var3, var4, var5, var6, var12);
               }

               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.a.H.b(), (this.a.H.c() + 1.0F) / 2.0F, this.a.H.d() * 0.8F);
               --var1.b;
            }
         }

         return true;
      }
   }
}
