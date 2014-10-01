import java.util.Random;

public class amz extends aji {

   private boolean a;


   public amz(boolean var1) {
      super(awt.e);
      if(var1) {
         this.a(true);
      }

      this.a = var1;
   }

   public int a(ahb var1) {
      return 30;
   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {
      this.e(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5);
   }

   public void b(ahb var1, int var2, int var3, int var4, sa var5) {
      this.e(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      this.e(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private void e(ahb var1, int var2, int var3, int var4) {
      this.m(var1, var2, var3, var4);
      if(this == ajn.ax) {
         var1.b(var2, var3, var4, ajn.ay);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(this == ajn.ay) {
         var1.b(var2, var3, var4, ajn.ax);
      }

   }

   public adb a(int var1, Random var2, int var3) {
      return ade.ax;
   }

   public int a(int var1, Random var2) {
      return this.a(var2) + var2.nextInt(var1 + 1);
   }

   public int a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if(this.a(var5, var1.s, var7) != adb.a((aji)this)) {
         int var8 = 1 + var1.s.nextInt(5);
         this.c(var1, var2, var3, var4, var8);
      }

   }

   private void m(ahb var1, int var2, int var3, int var4) {
      Random var5 = var1.s;
      double var6 = 0.0625D;

      for(int var8 = 0; var8 < 6; ++var8) {
         double var9 = (double)((float)var2 + var5.nextFloat());
         double var11 = (double)((float)var3 + var5.nextFloat());
         double var13 = (double)((float)var4 + var5.nextFloat());
         if(var8 == 0 && !var1.a(var2, var3 + 1, var4).c()) {
            var11 = (double)(var3 + 1) + var6;
         }

         if(var8 == 1 && !var1.a(var2, var3 - 1, var4).c()) {
            var11 = (double)(var3 + 0) - var6;
         }

         if(var8 == 2 && !var1.a(var2, var3, var4 + 1).c()) {
            var13 = (double)(var4 + 1) + var6;
         }

         if(var8 == 3 && !var1.a(var2, var3, var4 - 1).c()) {
            var13 = (double)(var4 + 0) - var6;
         }

         if(var8 == 4 && !var1.a(var2 + 1, var3, var4).c()) {
            var9 = (double)(var2 + 1) + var6;
         }

         if(var8 == 5 && !var1.a(var2 - 1, var3, var4).c()) {
            var9 = (double)(var2 + 0) - var6;
         }

         if(var9 < (double)var2 || var9 > (double)(var2 + 1) || var11 < 0.0D || var11 > (double)(var3 + 1) || var13 < (double)var4 || var13 > (double)(var4 + 1)) {
            var1.a("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   protected add j(int var1) {
      return new add(ajn.ax);
   }
}
