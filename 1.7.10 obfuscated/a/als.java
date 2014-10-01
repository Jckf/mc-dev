import java.util.Random;

public class als extends aji {

   protected als() {
      super(awt.q);
      this.a(abt.c);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.b(var1.e(var2, var3, var4));
   }

   public void b(int var1) {
      float var3 = 0.125F;
      if(var1 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var3, 1.0F, 1.0F, 1.0F);
      }

      if(var1 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var3);
      }

      if(var1 == 4) {
         this.a(1.0F - var3, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var1 == 5) {
         this.a(0.0F, 0.0F, 0.0F, var3, 1.0F, 1.0F);
      }

   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 8;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2 - 1, var3, var4).r()?true:(var1.a(var2 + 1, var3, var4).r()?true:(var1.a(var2, var3, var4 - 1).r()?true:var1.a(var2, var3, var4 + 1).r()));
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = var9;
      if((var9 == 0 || var5 == 2) && var1.a(var2, var3, var4 + 1).r()) {
         var10 = 2;
      }

      if((var10 == 0 || var5 == 3) && var1.a(var2, var3, var4 - 1).r()) {
         var10 = 3;
      }

      if((var10 == 0 || var5 == 4) && var1.a(var2 + 1, var3, var4).r()) {
         var10 = 4;
      }

      if((var10 == 0 || var5 == 5) && var1.a(var2 - 1, var3, var4).r()) {
         var10 = 5;
      }

      return var10;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = false;
      if(var6 == 2 && var1.a(var2, var3, var4 + 1).r()) {
         var7 = true;
      }

      if(var6 == 3 && var1.a(var2, var3, var4 - 1).r()) {
         var7 = true;
      }

      if(var6 == 4 && var1.a(var2 + 1, var3, var4).r()) {
         var7 = true;
      }

      if(var6 == 5 && var1.a(var2 - 1, var3, var4).r()) {
         var7 = true;
      }

      if(!var7) {
         this.b(var1, var2, var3, var4, var6, 0);
         var1.f(var2, var3, var4);
      }

      super.a(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 1;
   }
}
