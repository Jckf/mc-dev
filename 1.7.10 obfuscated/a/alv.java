
public class alv extends aji {

   protected alv() {
      super(awt.q);
      this.a(abt.d);
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
      return 12;
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && var1.a(var2, var3 + 1, var4).r()?true:(var5 == 1 && ahb.a((ahl)var1, var2, var3 - 1, var4)?true:(var5 == 2 && var1.a(var2, var3, var4 + 1).r()?true:(var5 == 3 && var1.a(var2, var3, var4 - 1).r()?true:(var5 == 4 && var1.a(var2 + 1, var3, var4).r()?true:var5 == 5 && var1.a(var2 - 1, var3, var4).r()))));
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2 - 1, var3, var4).r()?true:(var1.a(var2 + 1, var3, var4).r()?true:(var1.a(var2, var3, var4 - 1).r()?true:(var1.a(var2, var3, var4 + 1).r()?true:(ahb.a((ahl)var1, var2, var3 - 1, var4)?true:var1.a(var2, var3 + 1, var4).r()))));
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var11 = var9 & 8;
      int var10 = var9 & 7;
      byte var12 = -1;
      if(var5 == 0 && var1.a(var2, var3 + 1, var4).r()) {
         var12 = 0;
      }

      if(var5 == 1 && ahb.a((ahl)var1, var2, var3 - 1, var4)) {
         var12 = 5;
      }

      if(var5 == 2 && var1.a(var2, var3, var4 + 1).r()) {
         var12 = 4;
      }

      if(var5 == 3 && var1.a(var2, var3, var4 - 1).r()) {
         var12 = 3;
      }

      if(var5 == 4 && var1.a(var2 + 1, var3, var4).r()) {
         var12 = 2;
      }

      if(var5 == 5 && var1.a(var2 - 1, var3, var4).r()) {
         var12 = 1;
      }

      return var12 + var11;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = var1.e(var2, var3, var4);
      int var8 = var7 & 7;
      int var9 = var7 & 8;
      if(var8 == b(1)) {
         if((qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 1) == 0) {
            var1.a(var2, var3, var4, 5 | var9, 2);
         } else {
            var1.a(var2, var3, var4, 6 | var9, 2);
         }
      } else if(var8 == b(0)) {
         if((qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 1) == 0) {
            var1.a(var2, var3, var4, 7 | var9, 2);
         } else {
            var1.a(var2, var3, var4, 0 | var9, 2);
         }
      }

   }

   public static int b(int var0) {
      switch(var0) {
      case 0:
         return 0;
      case 1:
         return 5;
      case 2:
         return 4;
      case 3:
         return 3;
      case 4:
         return 2;
      case 5:
         return 1;
      default:
         return -1;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(this.e(var1, var2, var3, var4)) {
         int var6 = var1.e(var2, var3, var4) & 7;
         boolean var7 = false;
         if(!var1.a(var2 - 1, var3, var4).r() && var6 == 1) {
            var7 = true;
         }

         if(!var1.a(var2 + 1, var3, var4).r() && var6 == 2) {
            var7 = true;
         }

         if(!var1.a(var2, var3, var4 - 1).r() && var6 == 3) {
            var7 = true;
         }

         if(!var1.a(var2, var3, var4 + 1).r() && var6 == 4) {
            var7 = true;
         }

         if(!ahb.a((ahl)var1, var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if(!ahb.a((ahl)var1, var2, var3 - 1, var4) && var6 == 6) {
            var7 = true;
         }

         if(!var1.a(var2, var3 + 1, var4).r() && var6 == 0) {
            var7 = true;
         }

         if(!var1.a(var2, var3 + 1, var4).r() && var6 == 7) {
            var7 = true;
         }

         if(var7) {
            this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.f(var2, var3, var4);
         }
      }

   }

   private boolean e(ahb var1, int var2, int var3, int var4) {
      if(!this.c(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) & 7;
      float var6 = 0.1875F;
      if(var5 == 1) {
         this.a(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 2) {
         this.a(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 3) {
         this.a(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if(var5 == 4) {
         this.a(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      } else if(var5 != 5 && var5 != 6) {
         if(var5 == 0 || var5 == 7) {
            var6 = 0.25F;
            this.a(0.5F - var6, 0.4F, 0.5F - var6, 0.5F + var6, 1.0F, 0.5F + var6);
         }
      } else {
         var6 = 0.25F;
         this.a(0.5F - var6, 0.0F, 0.5F - var6, 0.5F + var6, 0.6F, 0.5F + var6);
      }

   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         int var10 = var1.e(var2, var3, var4);
         int var11 = var10 & 7;
         int var12 = 8 - (var10 & 8);
         var1.a(var2, var3, var4, var11 + var12, 3);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, var12 > 0?0.6F:0.5F);
         var1.d(var2, var3, var4, this);
         if(var11 == 1) {
            var1.d(var2 - 1, var3, var4, this);
         } else if(var11 == 2) {
            var1.d(var2 + 1, var3, var4, this);
         } else if(var11 == 3) {
            var1.d(var2, var3, var4 - 1, this);
         } else if(var11 == 4) {
            var1.d(var2, var3, var4 + 1, this);
         } else if(var11 != 5 && var11 != 6) {
            if(var11 == 0 || var11 == 7) {
               var1.d(var2, var3 + 1, var4, this);
            }
         } else {
            var1.d(var2, var3 - 1, var4, this);
         }

         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if((var6 & 8) > 0) {
         var1.d(var2, var3, var4, this);
         int var7 = var6 & 7;
         if(var7 == 1) {
            var1.d(var2 - 1, var3, var4, this);
         } else if(var7 == 2) {
            var1.d(var2 + 1, var3, var4, this);
         } else if(var7 == 3) {
            var1.d(var2, var3, var4 - 1, this);
         } else if(var7 == 4) {
            var1.d(var2, var3, var4 + 1, this);
         } else if(var7 != 5 && var7 != 6) {
            if(var7 == 0 || var7 == 7) {
               var1.d(var2, var3 + 1, var4, this);
            }
         } else {
            var1.d(var2, var3 - 1, var4, this);
         }
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      return (var1.e(var2, var3, var4) & 8) > 0?15:0;
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if((var6 & 8) == 0) {
         return 0;
      } else {
         int var7 = var6 & 7;
         return var7 == 0 && var5 == 0?15:(var7 == 7 && var5 == 0?15:(var7 == 6 && var5 == 1?15:(var7 == 5 && var5 == 1?15:(var7 == 4 && var5 == 2?15:(var7 == 3 && var5 == 3?15:(var7 == 2 && var5 == 4?15:(var7 == 1 && var5 == 5?15:0)))))));
      }
   }

   public boolean f() {
      return true;
   }
}
