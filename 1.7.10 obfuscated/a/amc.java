import java.util.Random;

public class amc extends ajr implements ajo {

   protected amc() {
      float var1 = 0.2F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var1 * 2.0F, 0.5F + var1);
      this.a(true);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(25) == 0) {
         byte var6 = 4;
         int var7 = 5;

         int var8;
         int var9;
         int var10;
         for(var8 = var2 - var6; var8 <= var2 + var6; ++var8) {
            for(var9 = var4 - var6; var9 <= var4 + var6; ++var9) {
               for(var10 = var3 - 1; var10 <= var3 + 1; ++var10) {
                  if(var1.a(var8, var10, var9) == this) {
                     --var7;
                     if(var7 <= 0) {
                        return;
                     }
                  }
               }
            }
         }

         var8 = var2 + var5.nextInt(3) - 1;
         var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
         var10 = var4 + var5.nextInt(3) - 1;

         for(int var11 = 0; var11 < 4; ++var11) {
            if(var1.c(var8, var9, var10) && this.j(var1, var8, var9, var10)) {
               var2 = var8;
               var3 = var9;
               var4 = var10;
            }

            var8 = var2 + var5.nextInt(3) - 1;
            var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
            var10 = var4 + var5.nextInt(3) - 1;
         }

         if(var1.c(var8, var9, var10) && this.j(var1, var8, var9, var10)) {
            var1.d(var8, var9, var10, this, 0, 2);
         }
      }

   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4) && this.j(var1, var2, var3, var4);
   }

   protected boolean a(aji var1) {
      return var1.j();
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      if(var3 >= 0 && var3 < 256) {
         aji var5 = var1.a(var2, var3 - 1, var4);
         return var5 == ajn.bh || var5 == ajn.d && var1.e(var2, var3 - 1, var4) == 2 || var1.j(var2, var3, var4) < 13 && this.a(var5);
      } else {
         return false;
      }
   }

   public boolean c(ahb var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      var1.f(var2, var3, var4);
      aru var7 = null;
      if(this == ajn.P) {
         var7 = new aru(0);
      } else if(this == ajn.Q) {
         var7 = new aru(1);
      }

      if(var7 != null && var7.a(var1, var5, var2, var3, var4)) {
         return true;
      } else {
         var1.d(var2, var3, var4, this, var6, 3);
         return false;
      }
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      return true;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return (double)var2.nextFloat() < 0.4D;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      this.c(var1, var3, var4, var5, var2);
   }
}
