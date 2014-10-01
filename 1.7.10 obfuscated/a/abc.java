import java.util.List;

final class abc extends cm {

   protected add b(ck var1, add var2) {
      cr var3 = akm.b(var1.h());
      int var4 = var1.d() + var3.c();
      int var5 = var1.e() + var3.d();
      int var6 = var1.f() + var3.e();
      azt var7 = azt.a((double)var4, (double)var5, (double)var6, (double)(var4 + 1), (double)(var5 + 1), (double)(var6 + 1));
      List var8 = var1.k().a(sv.class, var7, (sj)(new sp(var2)));
      if(var8.size() > 0) {
         sv var9 = (sv)var8.get(0);
         int var10 = var9 instanceof yz?1:0;
         int var11 = sw.b(var2);
         add var12 = var2.m();
         var12.b = 1;
         var9.c(var11 - var10, var12);
         if(var9 instanceof sw) {
            ((sw)var9).a(var11, 2.0F);
         }

         --var2.b;
         return var2;
      } else {
         return super.b(var1, var2);
      }
   }
}
