import java.util.Random;

public class ajz extends akk implements ajo {

   public ajz() {
      super(awt.k);
      this.a(true);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!this.j(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.d(var2, var3, var4, e(0), 0, 2);
      } else if(var1.s.nextInt(5) == 0) {
         int var6 = var1.e(var2, var3, var4);
         int var7 = c(var6);
         if(var7 < 2) {
            ++var7;
            var1.a(var2, var3, var4, var7 << 2 | l(var6), 2);
         }
      }

   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      int var5 = l(var1.e(var2, var3, var4));
      var2 += p.a[var5];
      var4 += p.b[var5];
      aji var6 = var1.a(var2, var3, var4);
      return var6 == ajn.r && alx.c(var1.e(var2, var3, var4)) == 3;
   }

   public int b() {
      return 28;
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = l(var5);
      int var7 = c(var5);
      int var8 = 4 + var7 * 2;
      int var9 = 5 + var7 * 2;
      float var10 = (float)var8 / 2.0F;
      switch(var6) {
      case 0:
         this.a((8.0F - var10) / 16.0F, (12.0F - (float)var9) / 16.0F, (15.0F - (float)var8) / 16.0F, (8.0F + var10) / 16.0F, 0.75F, 0.9375F);
         break;
      case 1:
         this.a(0.0625F, (12.0F - (float)var9) / 16.0F, (8.0F - var10) / 16.0F, (1.0F + (float)var8) / 16.0F, 0.75F, (8.0F + var10) / 16.0F);
         break;
      case 2:
         this.a((8.0F - var10) / 16.0F, (12.0F - (float)var9) / 16.0F, 0.0625F, (8.0F + var10) / 16.0F, 0.75F, (1.0F + (float)var8) / 16.0F);
         break;
      case 3:
         this.a((15.0F - (float)var8) / 16.0F, (12.0F - (float)var9) / 16.0F, (8.0F - var10) / 16.0F, 0.9375F, 0.75F, (8.0F + var10) / 16.0F);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = ((qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3) + 0) % 4;
      var1.a(var2, var3, var4, var7, 2);
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      if(var5 == 1 || var5 == 0) {
         var5 = 2;
      }

      return p.f[p.e[var5]];
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!this.j(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.d(var2, var3, var4, e(0), 0, 2);
      }

   }

   public static int c(int var0) {
      return (var0 & 12) >> 2;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      int var8 = c(var5);
      byte var9 = 1;
      if(var8 >= 2) {
         var9 = 3;
      }

      for(int var10 = 0; var10 < var9; ++var10) {
         this.a(var1, var2, var3, var4, new add(ade.aR, 1, 3));
      }

   }

   public int k(ahb var1, int var2, int var3, int var4) {
      return 3;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.e(var2, var3, var4);
      int var7 = c(var6);
      return var7 < 2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var1.e(var3, var4, var5);
      int var7 = akk.l(var6);
      int var8 = c(var6);
      ++var8;
      var1.a(var3, var4, var5, var8 << 2 | var7, 2);
   }
}
