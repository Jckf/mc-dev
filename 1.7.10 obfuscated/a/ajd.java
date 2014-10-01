import java.util.Random;

public abstract class ajd extends aji {

   private String a;


   protected ajd(String var1, awt var2) {
      super(var2);
      this.a = var1;
      this.a(abt.d);
      this.a(true);
      this.b(this.d(15));
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.b(var1.e(var2, var3, var4));
   }

   protected void b(int var1) {
      boolean var2 = this.c(var1) > 0;
      float var3 = 0.0625F;
      if(var2) {
         this.a(var3, 0.0F, var3, 1.0F - var3, 0.03125F, 1.0F - var3);
      } else {
         this.a(var3, 0.0F, var3, 1.0F - var3, 0.0625F, 1.0F - var3);
      }

   }

   public int a(ahb var1) {
      return 20;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return true;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return ahb.a((ahl)var1, var2, var3 - 1, var4) || akz.a(var1.a(var2, var3 - 1, var4));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      boolean var6 = false;
      if(!ahb.a((ahl)var1, var2, var3 - 1, var4) && !akz.a(var1.a(var2, var3 - 1, var4))) {
         var6 = true;
      }

      if(var6) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         int var6 = this.c(var1.e(var2, var3, var4));
         if(var6 > 0) {
            this.a(var1, var2, var3, var4, var6);
         }

      }
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      if(!var1.E) {
         int var6 = this.c(var1.e(var2, var3, var4));
         if(var6 == 0) {
            this.a(var1, var2, var3, var4, var6);
         }

      }
   }

   protected void a(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = this.e(var1, var2, var3, var4);
      boolean var7 = var5 > 0;
      boolean var8 = var6 > 0;
      if(var5 != var6) {
         var1.a(var2, var3, var4, this.d(var6), 2);
         this.a_(var1, var2, var3, var4);
         var1.c(var2, var3, var4, var2, var3, var4);
      }

      if(!var8 && var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      } else if(var8 && !var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if(var8) {
         var1.a(var2, var3, var4, this, this.a(var1));
      }

   }

   protected azt a(int var1, int var2, int var3) {
      float var4 = 0.125F;
      return azt.a((double)((float)var1 + var4), (double)var2, (double)((float)var3 + var4), (double)((float)(var1 + 1) - var4), (double)var2 + 0.25D, (double)((float)(var3 + 1) - var4));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if(this.c(var6) > 0) {
         this.a_(var1, var2, var3, var4);
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   protected void a_(ahb var1, int var2, int var3, int var4) {
      var1.d(var2, var3, var4, this);
      var1.d(var2, var3 - 1, var4, this);
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      return this.c(var1.e(var2, var3, var4));
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      return var5 == 1?this.c(var1.e(var2, var3, var4)):0;
   }

   public boolean f() {
      return true;
   }

   public void g() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public int h() {
      return 1;
   }

   protected abstract int e(ahb var1, int var2, int var3, int var4);

   protected abstract int c(int var1);

   protected abstract int d(int var1);
}
