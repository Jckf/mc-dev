import java.util.Random;

final class kz extends cm {

   public add b(ck var1, add var2) {
      cr var3 = akm.b(var1.h());
      cx var4 = akm.a(var1);
      double var5 = var4.a() + (double)((float)var3.c() * 0.3F);
      double var7 = var4.b() + (double)((float)var3.c() * 0.3F);
      double var9 = var4.c() + (double)((float)var3.e() * 0.3F);
      ahb var11 = var1.k();
      Random var12 = var11.s;
      double var13 = var12.nextGaussian() * 0.05D + (double)var3.c();
      double var15 = var12.nextGaussian() * 0.05D + (double)var3.d();
      double var17 = var12.nextGaussian() * 0.05D + (double)var3.e();
      var11.d((sa)(new zi(var11, var5, var7, var9, var13, var15, var17)));
      var2.a(1);
      return var2;
   }

   protected void a(ck var1) {
      var1.k().c(1009, var1.d(), var1.e(), var1.f(), 0);
   }
}
