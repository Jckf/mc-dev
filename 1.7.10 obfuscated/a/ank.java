import java.util.Random;

public class ank extends ajc {

   private Class a;
   private boolean b;


   protected ank(Class var1, boolean var2) {
      super(awt.d);
      this.b = var2;
      this.a = var1;
      float var3 = 0.25F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      if(!this.b) {
         int var5 = var1.e(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if(var5 == 2) {
            this.a(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if(var5 == 3) {
            this.a(var8, var6, 0.0F, var9, var7, var10);
         }

         if(var5 == 4) {
            this.a(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if(var5 == 5) {
            this.a(0.0F, var6, var8, var10, var7, var9);
         }

      }
   }

   public int b() {
      return -1;
   }

   public boolean d() {
      return false;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return true;
   }

   public boolean c() {
      return false;
   }

   public aor a(ahb var1, int var2) {
      try {
         return (aor)this.a.newInstance();
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.ap;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      boolean var6 = false;
      if(this.b) {
         if(!var1.a(var2, var3 - 1, var4).o().a()) {
            var6 = true;
         }
      } else {
         int var7 = var1.e(var2, var3, var4);
         var6 = true;
         if(var7 == 2 && var1.a(var2, var3, var4 + 1).o().a()) {
            var6 = false;
         }

         if(var7 == 3 && var1.a(var2, var3, var4 - 1).o().a()) {
            var6 = false;
         }

         if(var7 == 4 && var1.a(var2 + 1, var3, var4).o().a()) {
            var6 = false;
         }

         if(var7 == 5 && var1.a(var2 - 1, var3, var4).o().a()) {
            var6 = false;
         }
      }

      if(var6) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
      }

      super.a(var1, var2, var3, var4, var5);
   }
}
