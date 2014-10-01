
public class aoi extends aji {

   public static final String[] a = new String[]{"normal", "mossy"};


   public aoi(aji var1) {
      super(var1.J);
      this.c(var1.v);
      this.b(var1.w / 3.0F);
      this.a(var1.H);
      this.a(abt.b);
   }

   public int b() {
      return 32;
   }

   public boolean d() {
      return false;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean c() {
      return false;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      boolean var5 = this.e(var1, var2, var3, var4 - 1);
      boolean var6 = this.e(var1, var2, var3, var4 + 1);
      boolean var7 = this.e(var1, var2 - 1, var3, var4);
      boolean var8 = this.e(var1, var2 + 1, var3, var4);
      float var9 = 0.25F;
      float var10 = 0.75F;
      float var11 = 0.25F;
      float var12 = 0.75F;
      float var13 = 1.0F;
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

      if(var5 && var6 && !var7 && !var8) {
         var13 = 0.8125F;
         var9 = 0.3125F;
         var10 = 0.6875F;
      } else if(!var5 && !var6 && var7 && var8) {
         var13 = 0.8125F;
         var11 = 0.3125F;
         var12 = 0.6875F;
      }

      this.a(var9, 0.0F, var11, var10, var13, var12);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      this.a((ahl)var1, var2, var3, var4);
      this.F = 1.5D;
      return super.a(var1, var2, var3, var4);
   }

   public boolean e(ahl var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3, var4);
      return var5 != this && var5 != ajn.be?(var5.J.k() && var5.d()?var5.J != awt.C:false):true;
   }

   public int a(int var1) {
      return var1;
   }

}
