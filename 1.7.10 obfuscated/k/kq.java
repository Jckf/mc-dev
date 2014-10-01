
final class kq extends cm {

   private boolean b = true;


   protected add b(ck var1, add var2) {
      if(var2.k() == 15) {
         cr var3 = akm.b(var1.h());
         ahb var4 = var1.k();
         int var5 = var1.d() + var3.c();
         int var6 = var1.e() + var3.d();
         int var7 = var1.f() + var3.e();
         if(acj.a(var2, var4, var5, var6, var7)) {
            if(!var4.E) {
               var4.c(2005, var5, var6, var7, 0);
            }
         } else {
            this.b = false;
         }

         return var2;
      } else {
         return super.b(var1, var2);
      }
   }

   protected void a(ck var1) {
      if(this.b) {
         var1.k().c(1000, var1.d(), var1.e(), var1.f(), 0);
      } else {
         var1.k().c(1001, var1.d(), var1.e(), var1.f(), 0);
      }

   }
}
