
public class abh extends adb {

   protected final aji a;


   public abh(aji var1) {
      this.a = var1;
   }

   public abh b(String var1) {
      super.c(var1);
      return this;
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

      if(var1.b == 0) {
         return false;
      } else if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else if(var5 == 255 && this.a.o().a()) {
         return false;
      } else if(var3.a(this.a, var4, var5, var6, false, var7, var2, var1)) {
         int var12 = this.a(var1.k());
         int var13 = this.a.a(var3, var4, var5, var6, var7, var8, var9, var10, var12);
         if(var3.d(var4, var5, var6, this.a, var13, 3)) {
            if(var3.a(var4, var5, var6) == this.a) {
               this.a.a(var3, var4, var5, var6, (sv)var2, var1);
               this.a.e(var3, var4, var5, var6, var13);
            }

            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.a.H.b(), (this.a.H.c() + 1.0F) / 2.0F, this.a.H.d() * 0.8F);
            --var1.b;
         }

         return true;
      } else {
         return false;
      }
   }

   public String a(add var1) {
      return this.a.a();
   }

   public String a() {
      return this.a.a();
   }

   // $FF: synthetic method
   public adb c(String var1) {
      return this.b(var1);
   }
}
