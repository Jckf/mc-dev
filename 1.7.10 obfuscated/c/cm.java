
public class cm implements cp {

   public final add a(ck var1, add var2) {
      add var3 = this.b(var1, var2);
      this.a(var1);
      this.a(var1, akm.b(var1.h()));
      return var3;
   }

   protected add b(ck var1, add var2) {
      cr var3 = akm.b(var1.h());
      cx var4 = akm.a(var1);
      add var5 = var2.a(1);
      a(var1.k(), var5, 6, var3, var4);
      return var2;
   }

   public static void a(ahb var0, add var1, int var2, cr var3, cx var4) {
      double var5 = var4.a();
      double var7 = var4.b();
      double var9 = var4.c();
      xk var11 = new xk(var0, var5, var7 - 0.3D, var9, var1);
      double var12 = var0.s.nextDouble() * 0.1D + 0.2D;
      var11.v = (double)var3.c() * var12;
      var11.w = 0.20000000298023224D;
      var11.x = (double)var3.e() * var12;
      var11.v += var0.s.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.w += var0.s.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.x += var0.s.nextGaussian() * 0.007499999832361937D * (double)var2;
      var0.d((sa)var11);
   }

   protected void a(ck var1) {
      var1.k().c(1000, var1.d(), var1.e(), var1.f(), 0);
   }

   protected void a(ck var1, cr var2) {
      var1.k().c(2000, var1.d(), var1.e(), var1.f(), this.a(var2));
   }

   private int a(cr var1) {
      return var1.c() + 1 + (var1.e() + 1) * 3;
   }
}
