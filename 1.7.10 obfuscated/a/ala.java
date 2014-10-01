
public class ala extends akk {

   public ala() {
      super(awt.d);
      this.a(abt.d);
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return !var1.a(var2, var3 - 1, var4).o().a()?false:super.c(var1, var2, var3, var4);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return b(var5)?null:(var5 != 2 && var5 != 0?azt.a((double)((float)var2 + 0.375F), (double)var3, (double)var4, (double)((float)var2 + 0.625F), (double)((float)var3 + 1.5F), (double)(var4 + 1)):azt.a((double)var2, (double)var3, (double)((float)var4 + 0.375F), (double)(var2 + 1), (double)((float)var3 + 1.5F), (double)((float)var4 + 0.625F)));
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = l(var1.e(var2, var3, var4));
      if(var5 != 2 && var5 != 0) {
         this.a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
      }

   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return b(var1.e(var2, var3, var4));
   }

   public int b() {
      return 21;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = (qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3) % 4;
      var1.a(var2, var3, var4, var7, 2);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.e(var2, var3, var4);
      if(b(var10)) {
         var1.a(var2, var3, var4, var10 & -5, 2);
      } else {
         int var11 = (qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3) % 4;
         int var12 = l(var10);
         if(var12 == (var11 + 2) % 4) {
            var10 = var11;
         }

         var1.a(var2, var3, var4, var10 | 4, 2);
      }

      var1.a(var5, 1003, var2, var3, var4, 0);
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = var1.v(var2, var3, var4);
         if(var7 || var5.f()) {
            if(var7 && !b(var6)) {
               var1.a(var2, var3, var4, var6 | 4, 2);
               var1.a((yz)null, 1003, var2, var3, var4, 0);
            } else if(!var7 && b(var6)) {
               var1.a(var2, var3, var4, var6 & -5, 2);
               var1.a((yz)null, 1003, var2, var3, var4, 0);
            }
         }

      }
   }

   public static boolean b(int var0) {
      return (var0 & 4) != 0;
   }
}
