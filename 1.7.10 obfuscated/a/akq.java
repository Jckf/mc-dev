
public class akq extends akm {

   private final cp P = new cm();


   protected cp a(add var1) {
      return this.P;
   }

   public aor a(ahb var1, int var2) {
      return new apc();
   }

   protected void e(ahb var1, int var2, int var3, int var4) {
      cl var5 = new cl(var1, var2, var3, var4);
      apb var6 = (apb)var5.j();
      if(var6 != null) {
         int var7 = var6.i();
         if(var7 < 0) {
            var1.c(1001, var2, var3, var4, 0);
         } else {
            add var8 = var6.a(var7);
            int var9 = var1.e(var2, var3, var4) & 7;
            rb var10 = api.b(var1, (double)(var2 + q.b[var9]), (double)(var3 + q.c[var9]), (double)(var4 + q.d[var9]));
            add var11;
            if(var10 != null) {
               var11 = api.a(var10, var8.m().a(1), q.a[var9]);
               if(var11 == null) {
                  var11 = var8.m();
                  if(--var11.b == 0) {
                     var11 = null;
                  }
               } else {
                  var11 = var8.m();
               }
            } else {
               var11 = this.P.a(var5, var8);
               if(var11 != null && var11.b == 0) {
                  var11 = null;
               }
            }

            var6.a(var7, var11);
         }

      }
   }
}
