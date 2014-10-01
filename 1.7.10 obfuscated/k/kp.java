
final class kp extends cm {

   private boolean b = true;


   protected add b(ck var1, add var2) {
      cr var3 = akm.b(var1.h());
      ahb var4 = var1.k();
      int var5 = var1.d() + var3.c();
      int var6 = var1.e() + var3.d();
      int var7 = var1.f() + var3.e();
      if(var4.c(var5, var6, var7)) {
         var4.b(var5, var6, var7, (aji)ajn.ab);
         if(var2.a(1, var4.s)) {
            var2.b = 0;
         }
      } else if(var4.a(var5, var6, var7) == ajn.W) {
         ajn.W.b(var4, var5, var6, var7, 1);
         var4.f(var5, var6, var7);
      } else {
         this.b = false;
      }

      return var2;
   }

   protected void a(ck var1) {
      if(this.b) {
         var1.k().c(1000, var1.d(), var1.e(), var1.f(), 0);
      } else {
         var1.k().c(1001, var1.d(), var1.e(), var1.f(), 0);
      }

   }
}
