import java.util.List;

public class akz extends aji {

   private final String a;


   public akz(String var1, awt var2) {
      super(var2);
      this.a = var1;
      this.a(abt.c);
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      boolean var8 = this.e(var1, var2, var3, var4 - 1);
      boolean var9 = this.e(var1, var2, var3, var4 + 1);
      boolean var10 = this.e(var1, var2 - 1, var3, var4);
      boolean var11 = this.e(var1, var2 + 1, var3, var4);
      float var12 = 0.375F;
      float var13 = 0.625F;
      float var14 = 0.375F;
      float var15 = 0.625F;
      if(var8) {
         var14 = 0.0F;
      }

      if(var9) {
         var15 = 1.0F;
      }

      if(var8 || var9) {
         this.a(var12, 0.0F, var14, var13, 1.5F, var15);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      var14 = 0.375F;
      var15 = 0.625F;
      if(var10) {
         var12 = 0.0F;
      }

      if(var11) {
         var13 = 1.0F;
      }

      if(var10 || var11 || !var8 && !var9) {
         this.a(var12, 0.0F, var14, var13, 1.5F, var15);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      if(var8) {
         var14 = 0.0F;
      }

      if(var9) {
         var15 = 1.0F;
      }

      this.a(var12, 0.0F, var14, var13, 1.0F, var15);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      boolean var5 = this.e(var1, var2, var3, var4 - 1);
      boolean var6 = this.e(var1, var2, var3, var4 + 1);
      boolean var7 = this.e(var1, var2 - 1, var3, var4);
      boolean var8 = this.e(var1, var2 + 1, var3, var4);
      float var9 = 0.375F;
      float var10 = 0.625F;
      float var11 = 0.375F;
      float var12 = 0.625F;
      if(var5) {
         var11 = 0.0F;
      }

      if(var6) {
         var12 = 1.0F;
      }

      if(var7) {
         var9 = 0.0F;
      }

      if(var8) {
         var10 = 1.0F;
      }

      this.a(var9, 0.0F, var11, var10, 1.0F, var12);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return false;
   }

   public int b() {
      return 11;
   }

   public boolean e(ahl var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3, var4);
      return var5 != this && var5 != ajn.be?(var5.J.k() && var5.d()?var5.J != awt.C:false):true;
   }

   public static boolean a(aji var0) {
      return var0 == ajn.aJ || var0 == ajn.bk;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      return var1.E?true:adf.a(var5, var1, var2, var3, var4);
   }
}
