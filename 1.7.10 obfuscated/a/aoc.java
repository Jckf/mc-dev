import java.util.Random;

public class aoc extends aji {

   protected aoc() {
      super(awt.q);
      this.a(true);
      this.a(abt.c);
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

   public int b() {
      return 2;
   }

   private boolean m(ahb var1, int var2, int var3, int var4) {
      if(ahb.a((ahl)var1, var2, var3, var4)) {
         return true;
      } else {
         aji var5 = var1.a(var2, var3, var4);
         return var5 == ajn.aJ || var5 == ajn.bk || var5 == ajn.w || var5 == ajn.bK;
      }
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var1.c(var2 - 1, var3, var4, true)?true:(var1.c(var2 + 1, var3, var4, true)?true:(var1.c(var2, var3, var4 - 1, true)?true:(var1.c(var2, var3, var4 + 1, true)?true:this.m(var1, var2, var3 - 1, var4))));
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = var9;
      if(var5 == 1 && this.m(var1, var2, var3 - 1, var4)) {
         var10 = 5;
      }

      if(var5 == 2 && var1.c(var2, var3, var4 + 1, true)) {
         var10 = 4;
      }

      if(var5 == 3 && var1.c(var2, var3, var4 - 1, true)) {
         var10 = 3;
      }

      if(var5 == 4 && var1.c(var2 + 1, var3, var4, true)) {
         var10 = 2;
      }

      if(var5 == 5 && var1.c(var2 - 1, var3, var4, true)) {
         var10 = 1;
      }

      return var10;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.e(var2, var3, var4) == 0) {
         this.b(var1, var2, var3, var4);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      if(var1.e(var2, var3, var4) == 0) {
         if(var1.c(var2 - 1, var3, var4, true)) {
            var1.a(var2, var3, var4, 1, 2);
         } else if(var1.c(var2 + 1, var3, var4, true)) {
            var1.a(var2, var3, var4, 2, 2);
         } else if(var1.c(var2, var3, var4 - 1, true)) {
            var1.a(var2, var3, var4, 3, 2);
         } else if(var1.c(var2, var3, var4 + 1, true)) {
            var1.a(var2, var3, var4, 4, 2);
         } else if(this.m(var1, var2, var3 - 1, var4)) {
            var1.a(var2, var3, var4, 5, 2);
         }
      }

      this.e(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      this.b(var1, var2, var3, var4, var5);
   }

   protected boolean b(ahb var1, int var2, int var3, int var4, aji var5) {
      if(this.e(var1, var2, var3, var4)) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = false;
         if(!var1.c(var2 - 1, var3, var4, true) && var6 == 1) {
            var7 = true;
         }

         if(!var1.c(var2 + 1, var3, var4, true) && var6 == 2) {
            var7 = true;
         }

         if(!var1.c(var2, var3, var4 - 1, true) && var6 == 3) {
            var7 = true;
         }

         if(!var1.c(var2, var3, var4 + 1, true) && var6 == 4) {
            var7 = true;
         }

         if(!this.m(var1, var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if(var7) {
            this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.f(var2, var3, var4);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   protected boolean e(ahb var1, int var2, int var3, int var4) {
      if(!this.c(var1, var2, var3, var4)) {
         if(var1.a(var2, var3, var4) == this) {
            this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.f(var2, var3, var4);
         }

         return false;
      } else {
         return true;
      }
   }

   public azu a(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      int var7 = var1.e(var2, var3, var4) & 7;
      float var8 = 0.15F;
      if(var7 == 1) {
         this.a(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 2) {
         this.a(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 3) {
         this.a(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if(var7 == 4) {
         this.a(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.a(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.a(var1, var2, var3, var4, var5, var6);
   }
}
