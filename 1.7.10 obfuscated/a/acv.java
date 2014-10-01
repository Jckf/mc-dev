
public class acv extends adb {

   public acv() {
      this.f(64);
      this.e(1);
      this.a(abt.i);
   }

   public add a(add var1, ahb var2, yz var3) {
      if(var3.bK != null) {
         int var4 = var3.bK.e();
         var1.a(var4, (sv)var3);
         var3.ba();
      } else {
         var2.a((sa)var3, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
         if(!var2.E) {
            var2.d((sa)(new xe(var2, var3)));
         }

         var3.ba();
      }

      return var1;
   }

   public boolean e_(add var1) {
      return super.e_(var1);
   }

   public int c() {
      return 1;
   }
}
