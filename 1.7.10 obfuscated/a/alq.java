
public class alq extends ajc {

   protected alq() {
      super(awt.d);
      this.a(abt.c);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.e(var2, var3, var4) == 0) {
         return false;
      } else {
         this.e(var1, var2, var3, var4);
         return true;
      }
   }

   public void b(ahb var1, int var2, int var3, int var4, add var5) {
      if(!var1.E) {
         alr var6 = (alr)var1.o(var2, var3, var4);
         if(var6 != null) {
            var6.a(var5.m());
            var1.a(var2, var3, var4, 1, 2);
         }
      }
   }

   public void e(ahb var1, int var2, int var3, int var4) {
      if(!var1.E) {
         alr var5 = (alr)var1.o(var2, var3, var4);
         if(var5 != null) {
            add var6 = var5.a();
            if(var6 != null) {
               var1.c(1005, var2, var3, var4, 0);
               var1.a((String)null, var2, var3, var4);
               var5.a((add)null);
               var1.a(var2, var3, var4, 0, 2);
               float var7 = 0.7F;
               double var8 = (double)(var1.s.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
               double var10 = (double)(var1.s.nextFloat() * var7) + (double)(1.0F - var7) * 0.2D + 0.6D;
               double var12 = (double)(var1.s.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
               add var14 = var6.m();
               xk var15 = new xk(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, var14);
               var15.b = 10;
               var1.d((sa)var15);
            }
         }
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      this.e(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.E) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }
   }

   public aor a(ahb var1, int var2) {
      return new alr();
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      add var6 = ((alr)var1.o(var2, var3, var4)).a();
      return var6 == null?0:adb.b(var6.b()) + 1 - adb.b(ade.cd);
   }
}
