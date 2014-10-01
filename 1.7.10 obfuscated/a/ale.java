import java.util.Random;

public class ale extends ajc {

   private final Random a = new Random();
   private final boolean b;
   private static boolean M;


   protected ale(boolean var1) {
      super(awt.e);
      this.b = var1;
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a(ajn.al);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      this.e(var1, var2, var3, var4);
   }

   private void e(ahb var1, int var2, int var3, int var4) {
      if(!var1.E) {
         aji var5 = var1.a(var2, var3, var4 - 1);
         aji var6 = var1.a(var2, var3, var4 + 1);
         aji var7 = var1.a(var2 - 1, var3, var4);
         aji var8 = var1.a(var2 + 1, var3, var4);
         byte var9 = 3;
         if(var5.j() && !var6.j()) {
            var9 = 3;
         }

         if(var6.j() && !var5.j()) {
            var9 = 2;
         }

         if(var7.j() && !var8.j()) {
            var9 = 5;
         }

         if(var8.j() && !var7.j()) {
            var9 = 4;
         }

         var1.a(var2, var3, var4, var9, 2);
      }
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         apg var10 = (apg)var1.o(var2, var3, var4);
         if(var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public static void a(boolean var0, ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      aor var6 = var1.o(var2, var3, var4);
      M = true;
      if(var0) {
         var1.b(var2, var3, var4, ajn.am);
      } else {
         var1.b(var2, var3, var4, ajn.al);
      }

      M = false;
      var1.a(var2, var3, var4, var5, 2);
      if(var6 != null) {
         var6.t();
         var1.a(var2, var3, var4, var6);
      }

   }

   public aor a(ahb var1, int var2) {
      return new apg();
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3;
      if(var7 == 0) {
         var1.a(var2, var3, var4, 2, 2);
      }

      if(var7 == 1) {
         var1.a(var2, var3, var4, 5, 2);
      }

      if(var7 == 2) {
         var1.a(var2, var3, var4, 3, 2);
      }

      if(var7 == 3) {
         var1.a(var2, var3, var4, 4, 2);
      }

      if(var6.u()) {
         ((apg)var1.o(var2, var3, var4)).a(var6.s());
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if(!M) {
         apg var7 = (apg)var1.o(var2, var3, var4);
         if(var7 != null) {
            for(int var8 = 0; var8 < var7.a(); ++var8) {
               add var9 = var7.a(var8);
               if(var9 != null) {
                  float var10 = this.a.nextFloat() * 0.8F + 0.1F;
                  float var11 = this.a.nextFloat() * 0.8F + 0.1F;
                  float var12 = this.a.nextFloat() * 0.8F + 0.1F;

                  while(var9.b > 0) {
                     int var13 = this.a.nextInt(21) + 10;
                     if(var13 > var9.b) {
                        var13 = var9.b;
                     }

                     var9.b -= var13;
                     xk var14 = new xk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new add(var9.b(), var13, var9.k()));
                     if(var9.p()) {
                        var14.f().d((dh)var9.q().b());
                     }

                     float var15 = 0.05F;
                     var14.v = (double)((float)this.a.nextGaussian() * var15);
                     var14.w = (double)((float)this.a.nextGaussian() * var15 + 0.2F);
                     var14.x = (double)((float)this.a.nextGaussian() * var15);
                     var1.d((sa)var14);
                  }
               }
            }

            var1.f(var2, var3, var4, var5);
         }
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      return zs.b((rb)var1.o(var2, var3, var4));
   }
}
