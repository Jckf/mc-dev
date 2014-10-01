
public class ada extends adb {

   protected adc a;


   public ada(adc var1) {
      this.a = var1;
      this.h = 1;
      this.f(var1.a());
      this.a(abt.i);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         aji var11 = var3.a(var4, var5, var6);
         if(var7 != 0 && var3.a(var4, var5 + 1, var6).o() == awt.a && (var11 == ajn.c || var11 == ajn.d)) {
            aji var12 = ajn.ak;
            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var12.H.e(), (var12.H.c() + 1.0F) / 2.0F, var12.H.d() * 0.8F);
            if(var3.E) {
               return true;
            } else {
               var3.b(var4, var5, var6, var12);
               var1.a(1, (sv)var2);
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public String i() {
      return this.a.toString();
   }
}
