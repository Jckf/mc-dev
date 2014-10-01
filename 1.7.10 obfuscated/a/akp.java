import java.util.Random;

public class akp extends aji {

   public akp() {
      super(awt.D);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      var1.a(var2, var3, var4, this, this.a(var1));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      var1.a(var2, var3, var4, this, this.a(var1));
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      this.e(var1, var2, var3, var4);
   }

   private void e(ahb var1, int var2, int var3, int var4) {
      if(akx.e(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var5 = 32;
         if(!akx.M && var1.b(var2 - var5, var3 - var5, var4 - var5, var2 + var5, var3 + var5, var4 + var5)) {
            xj var6 = new xj(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this);
            var1.d((sa)var6);
         } else {
            var1.f(var2, var3, var4);

            while(akx.e(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if(var3 > 0) {
               var1.d(var2, var3, var4, this, 0, 2);
            }
         }
      }

   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      this.m(var1, var2, var3, var4);
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {
      this.m(var1, var2, var3, var4);
   }

   private void m(ahb var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this) {
         for(int var5 = 0; var5 < 1000; ++var5) {
            int var6 = var2 + var1.s.nextInt(16) - var1.s.nextInt(16);
            int var7 = var3 + var1.s.nextInt(8) - var1.s.nextInt(8);
            int var8 = var4 + var1.s.nextInt(16) - var1.s.nextInt(16);
            if(var1.a(var6, var7, var8).J == awt.a) {
               if(!var1.E) {
                  var1.d(var6, var7, var8, this, var1.e(var2, var3, var4), 2);
                  var1.f(var2, var3, var4);
               } else {
                  short var9 = 128;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     double var11 = var1.s.nextDouble();
                     float var13 = (var1.s.nextFloat() - 0.5F) * 0.2F;
                     float var14 = (var1.s.nextFloat() - 0.5F) * 0.2F;
                     float var15 = (var1.s.nextFloat() - 0.5F) * 0.2F;
                     double var16 = (double)var6 + (double)(var2 - var6) * var11 + (var1.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     double var18 = (double)var7 + (double)(var3 - var7) * var11 + var1.s.nextDouble() * 1.0D - 0.5D;
                     double var20 = (double)var8 + (double)(var4 - var8) * var11 + (var1.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     var1.a("portal", var16, var18, var20, (double)var13, (double)var14, (double)var15);
                  }
               }

               return;
            }
         }

      }
   }

   public int a(ahb var1) {
      return 5;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 27;
   }
}
