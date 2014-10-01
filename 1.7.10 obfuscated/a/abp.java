
public class abp extends adb {

   public abp() {
      this.a(abt.e);
      this.e(1);
      this.f(25);
   }

   public add a(add var1, ahb var2, yz var3) {
      if(var3.am() && var3.m instanceof wo) {
         wo var4 = (wo)var3.m;
         if(var4.ca().h() && var1.l() - var1.k() >= 7) {
            var4.ca().g();
            var1.a(7, (sv)var3);
            if(var1.b == 0) {
               add var5 = new add(ade.aM);
               var5.d(var1.d);
               return var5;
            }
         }
      }

      return var1;
   }
}
