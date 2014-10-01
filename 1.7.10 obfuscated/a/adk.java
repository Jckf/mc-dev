
final class adk extends cm {

   private final cm b = new cm();


   public add b(ck var1, add var2) {
      cr var3 = akm.b(var1.h());
      ahb var4 = var1.k();
      double var5 = var1.a() + (double)((float)var3.c() * 1.125F);
      double var7 = var1.b() + (double)((float)var3.d() * 1.125F);
      double var9 = var1.c() + (double)((float)var3.e() * 1.125F);
      int var11 = var1.d() + var3.c();
      int var12 = var1.e() + var3.d();
      int var13 = var1.f() + var3.e();
      aji var14 = var4.a(var11, var12, var13);
      double var15;
      if(aje.a(var14)) {
         var15 = 0.0D;
      } else {
         if(var14.o() != awt.a || !aje.a(var4.a(var11, var12 - 1, var13))) {
            return this.b.a(var1, var2);
         }

         var15 = -1.0D;
      }

      xl var17 = xl.a(var4, var5, var7 + var15, var9, ((adj)var2.b()).a);
      if(var2.u()) {
         var17.a(var2.s());
      }

      var4.d((sa)var17);
      var2.a(1);
      return var2;
   }

   protected void a(ck var1) {
      var1.k().c(1000, var1.d(), var1.e(), var1.f(), 0);
   }
}
