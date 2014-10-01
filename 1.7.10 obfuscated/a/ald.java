import java.util.Random;

public class ald extends ajc {

   public ald() {
      super(awt.q);
      this.g();
   }

   public void g() {
      float var1 = 0.375F;
      float var2 = var1 / 2.0F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var1, 0.5F + var2);
   }

   public boolean c() {
      return false;
   }

   public int b() {
      return 33;
   }

   public boolean d() {
      return false;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      add var10 = var5.bm.h();
      if(var10 != null && var10.b() instanceof abh) {
         apf var11 = this.e(var1, var2, var3, var4);
         if(var11 != null) {
            if(var11.a() != null) {
               return false;
            } else {
               aji var12 = aji.a(var10.b());
               if(!this.a(var12, var10.k())) {
                  return false;
               } else {
                  var11.a(var10.b(), var10.k());
                  var11.e();
                  if(!var1.a(var2, var3, var4, var10.k(), 2)) {
                     var1.g(var2, var3, var4);
                  }

                  if(!var5.bE.d && --var10.b <= 0) {
                     var5.bm.a(var5.bm.c, (add)null);
                  }

                  return true;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean a(aji var1, int var2) {
      return var1 != ajn.N && var1 != ajn.O && var1 != ajn.aF && var1 != ajn.P && var1 != ajn.Q && var1 != ajn.g && var1 != ajn.I?var1 == ajn.H && var2 == 2:true;
   }

   public int k(ahb var1, int var2, int var3, int var4) {
      apf var5 = this.e(var1, var2, var3, var4);
      return var5 != null && var5.a() != null?var5.b():0;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4) && ahb.a((ahl)var1, var2, var3 - 1, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!ahb.a((ahl)var1, var2, var3 - 1, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      apf var7 = this.e(var1, var2, var3, var4);
      if(var7 != null && var7.a() != null) {
         this.a(var1, var2, var3, var4, new add(var7.a(), 1, var7.b()));
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      if(var6.bE.d) {
         apf var7 = this.e(var1, var2, var3, var4);
         if(var7 != null) {
            var7.a(adb.d(0), 0);
         }
      }

   }

   public adb a(int var1, Random var2, int var3) {
      return ade.bE;
   }

   private apf e(ahb var1, int var2, int var3, int var4) {
      aor var5 = var1.o(var2, var3, var4);
      return var5 != null && var5 instanceof apf?(apf)var5:null;
   }

   public aor a(ahb var1, int var2) {
      Object var3 = null;
      byte var4 = 0;
      switch(var2) {
      case 1:
         var3 = ajn.O;
         var4 = 0;
         break;
      case 2:
         var3 = ajn.N;
         break;
      case 3:
         var3 = ajn.g;
         var4 = 0;
         break;
      case 4:
         var3 = ajn.g;
         var4 = 1;
         break;
      case 5:
         var3 = ajn.g;
         var4 = 2;
         break;
      case 6:
         var3 = ajn.g;
         var4 = 3;
         break;
      case 7:
         var3 = ajn.Q;
         break;
      case 8:
         var3 = ajn.P;
         break;
      case 9:
         var3 = ajn.aF;
         break;
      case 10:
         var3 = ajn.I;
         break;
      case 11:
         var3 = ajn.H;
         var4 = 2;
         break;
      case 12:
         var3 = ajn.g;
         var4 = 4;
         break;
      case 13:
         var3 = ajn.g;
         var4 = 5;
      }

      return new apf(adb.a((aji)var3), var4);
   }
}
