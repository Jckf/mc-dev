
public class aoe extends aji {

   protected aoe(awt var1) {
      super(var1);
      float var2 = 0.5F;
      float var3 = 1.0F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var3, 0.5F + var2);
      this.a(abt.d);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return !d(var1.e(var2, var3, var4));
   }

   public int b() {
      return 0;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.b(var1.e(var2, var3, var4));
   }

   public void g() {
      float var1 = 0.1875F;
      this.a(0.0F, 0.5F - var1 / 2.0F, 0.0F, 1.0F, 0.5F + var1 / 2.0F, 1.0F);
   }

   public void b(int var1) {
      float var2 = 0.1875F;
      if((var1 & 8) != 0) {
         this.a(0.0F, 1.0F - var2, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, var2, 1.0F);
      }

      if(d(var1)) {
         if((var1 & 3) == 0) {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }

         if((var1 & 3) == 1) {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }

         if((var1 & 3) == 2) {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         if((var1 & 3) == 3) {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {}

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(this.J == awt.f) {
         return true;
      } else {
         int var10 = var1.e(var2, var3, var4);
         var1.a(var2, var3, var4, var10 ^ 4, 2);
         var1.a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = (var6 & 4) > 0;
      if(var7 != var5) {
         var1.a(var2, var3, var4, var6 ^ 4, 2);
         var1.a((yz)null, 1003, var2, var3, var4, 0);
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         int var6 = var1.e(var2, var3, var4);
         int var7 = var2;
         int var8 = var4;
         if((var6 & 3) == 0) {
            var8 = var4 + 1;
         }

         if((var6 & 3) == 1) {
            --var8;
         }

         if((var6 & 3) == 2) {
            var7 = var2 + 1;
         }

         if((var6 & 3) == 3) {
            --var7;
         }

         if(!a(var1.a(var7, var3, var8))) {
            var1.f(var2, var3, var4);
            this.b(var1, var2, var3, var4, var6, 0);
         }

         boolean var9 = var1.v(var2, var3, var4);
         if(var9 || var5.f()) {
            this.a(var1, var2, var3, var4, var9);
         }

      }
   }

   public azu a(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = 0;
      if(var5 == 2) {
         var10 = 0;
      }

      if(var5 == 3) {
         var10 = 1;
      }

      if(var5 == 4) {
         var10 = 2;
      }

      if(var5 == 5) {
         var10 = 3;
      }

      if(var5 != 1 && var5 != 0 && var7 > 0.5F) {
         var10 |= 8;
      }

      return var10;
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0) {
         return false;
      } else if(var5 == 1) {
         return false;
      } else {
         if(var5 == 2) {
            ++var4;
         }

         if(var5 == 3) {
            --var4;
         }

         if(var5 == 4) {
            ++var2;
         }

         if(var5 == 5) {
            --var2;
         }

         return a(var1.a(var2, var3, var4));
      }
   }

   public static boolean d(int var0) {
      return (var0 & 4) != 0;
   }

   private static boolean a(aji var0) {
      return var0.J.k() && var0.d() || var0 == ajn.aN || var0 instanceof alj || var0 instanceof ans;
   }
}
