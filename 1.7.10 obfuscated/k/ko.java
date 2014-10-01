
final class ko extends cm {

   private final cm b = new cm();


   public add b(ck var1, add var2) {
      cr var3 = akm.b(var1.h());
      ahb var4 = var1.k();
      int var5 = var1.d() + var3.c();
      int var6 = var1.e() + var3.d();
      int var7 = var1.f() + var3.e();
      awt var8 = var4.a(var5, var6, var7).o();
      int var9 = var4.e(var5, var6, var7);
      adb var10;
      if(awt.h.equals(var8) && var9 == 0) {
         var10 = ade.as;
      } else {
         if(!awt.i.equals(var8) || var9 != 0) {
            return super.b(var1, var2);
         }

         var10 = ade.at;
      }

      var4.f(var5, var6, var7);
      if(--var2.b == 0) {
         var2.a(var10);
         var2.b = 1;
      } else if(((apb)var1.j()).a(new add(var10)) < 0) {
         this.b.a(var1, new add(var10));
      }

      return var2;
   }
}
