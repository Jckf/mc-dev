
public class abm extends adb {

   public static final String[] a = new String[]{"pulling_0", "pulling_1", "pulling_2"};


   public abm() {
      this.h = 1;
      this.f(384);
      this.a(abt.j);
   }

   public void a(add var1, ahb var2, yz var3, int var4) {
      boolean var5 = var3.bE.d || afv.a(aft.y.B, var1) > 0;
      if(var5 || var3.bm.b(ade.g)) {
         int var6 = this.d_(var1) - var4;
         float var7 = (float)var6 / 20.0F;
         var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;
         if((double)var7 < 0.1D) {
            return;
         }

         if(var7 > 1.0F) {
            var7 = 1.0F;
         }

         zc var8 = new zc(var2, var3, var7 * 2.0F);
         if(var7 == 1.0F) {
            var8.a(true);
         }

         int var9 = afv.a(aft.v.B, var1);
         if(var9 > 0) {
            var8.b(var8.e() + (double)var9 * 0.5D + 0.5D);
         }

         int var10 = afv.a(aft.w.B, var1);
         if(var10 > 0) {
            var8.a(var10);
         }

         if(afv.a(aft.x.B, var1) > 0) {
            var8.e(100);
         }

         var1.a(1, (sv)var3);
         var2.a((sa)var3, "random.bow", 1.0F, 1.0F / (g.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);
         if(var5) {
            var8.a = 2;
         } else {
            var3.bm.a(ade.g);
         }

         if(!var2.E) {
            var2.d((sa)var8);
         }
      }

   }

   public add b(add var1, ahb var2, yz var3) {
      return var1;
   }

   public int d_(add var1) {
      return 72000;
   }

   public aei d(add var1) {
      return aei.e;
   }

   public add a(add var1, ahb var2, yz var3) {
      if(var3.bE.d || var3.bm.b(ade.g)) {
         var3.a(var1, this.d_(var1));
      }

      return var1;
   }

   public int c() {
      return 1;
   }

}
