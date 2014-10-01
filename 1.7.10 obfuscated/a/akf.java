import java.util.Random;

public class akf extends ajr implements ajo {

   protected akf() {
      this.a(true);
      float var1 = 0.5F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.a((abt)null);
      this.c(0.0F);
      this.a(h);
      this.H();
   }

   protected boolean a(aji var1) {
      return var1 == ajn.ak;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.k(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.e(var2, var3, var4);
         if(var6 < 7) {
            float var7 = this.n(var1, var2, var3, var4);
            if(var5.nextInt((int)(25.0F / var7) + 1) == 0) {
               ++var6;
               var1.a(var2, var3, var4, var6, 2);
            }
         }
      }

   }

   public void m(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) + qh.a(var1.s, 2, 5);
      if(var5 > 7) {
         var5 = 7;
      }

      var1.a(var2, var3, var4, var5, 2);
   }

   private float n(ahb var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      aji var6 = var1.a(var2, var3, var4 - 1);
      aji var7 = var1.a(var2, var3, var4 + 1);
      aji var8 = var1.a(var2 - 1, var3, var4);
      aji var9 = var1.a(var2 + 1, var3, var4);
      aji var10 = var1.a(var2 - 1, var3, var4 - 1);
      aji var11 = var1.a(var2 + 1, var3, var4 - 1);
      aji var12 = var1.a(var2 + 1, var3, var4 + 1);
      aji var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this || var9 == this;
      boolean var15 = var6 == this || var7 == this;
      boolean var16 = var10 == this || var11 == this || var12 == this || var13 == this;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            float var19 = 0.0F;
            if(var1.a(var17, var3 - 1, var18) == ajn.ak) {
               var19 = 1.0F;
               if(var1.e(var17, var3 - 1, var18) > 0) {
                  var19 = 3.0F;
               }
            }

            if(var17 != var2 || var18 != var4) {
               var19 /= 4.0F;
            }

            var5 += var19;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int b() {
      return 6;
   }

   protected adb i() {
      return ade.N;
   }

   protected adb P() {
      return ade.O;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, 0);
      if(!var1.E) {
         if(var5 >= 7) {
            int var8 = 3 + var7;

            for(int var9 = 0; var9 < var8; ++var9) {
               if(var1.s.nextInt(15) <= var5) {
                  this.a(var1, var2, var3, var4, new add(this.i(), 1, 0));
               }
            }
         }

      }
   }

   public adb a(int var1, Random var2, int var3) {
      return var1 == 7?this.P():this.i();
   }

   public int a(Random var1) {
      return 1;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      return var1.e(var2, var3, var4) != 7;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      this.m(var1, var3, var4, var5);
   }
}
