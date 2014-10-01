import java.util.Random;

public class akn extends aji {

   protected akn(awt var1) {
      super(var1);
      float var2 = 0.5F;
      float var3 = 1.0F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var3, 0.5F + var2);
   }

   public boolean c() {
      return false;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      int var5 = this.g(var1, var2, var3, var4);
      return (var5 & 4) != 0;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 7;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.b(this.g(var1, var2, var3, var4));
   }

   public int e(ahl var1, int var2, int var3, int var4) {
      return this.g(var1, var2, var3, var4) & 3;
   }

   public boolean f(ahl var1, int var2, int var3, int var4) {
      return (this.g(var1, var2, var3, var4) & 4) != 0;
   }

   private void b(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      int var3 = var1 & 3;
      boolean var4 = (var1 & 4) != 0;
      boolean var5 = (var1 & 16) != 0;
      if(var3 == 0) {
         if(var4) {
            if(!var5) {
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
            } else {
               this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
            }
         } else {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
      } else if(var3 == 1) {
         if(var4) {
            if(!var5) {
               this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else {
               this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
            }
         } else {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }
      } else if(var3 == 2) {
         if(var4) {
            if(!var5) {
               this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
            } else {
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
            }
         } else {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }
      } else if(var3 == 3) {
         if(var4) {
            if(!var5) {
               this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
            } else {
               this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
         } else {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {}

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(this.J == awt.f) {
         return true;
      } else {
         int var10 = this.g(var1, var2, var3, var4);
         int var11 = var10 & 7;
         var11 ^= 4;
         if((var10 & 8) == 0) {
            var1.a(var2, var3, var4, var11, 2);
            var1.c(var2, var3, var4, var2, var3, var4);
         } else {
            var1.a(var2, var3 - 1, var4, var11, 2);
            var1.c(var2, var3 - 1, var4, var2, var3, var4);
         }

         var1.a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.g(var1, var2, var3, var4);
      boolean var7 = (var6 & 4) != 0;
      if(var7 != var5) {
         int var8 = var6 & 7;
         var8 ^= 4;
         if((var6 & 8) == 0) {
            var1.a(var2, var3, var4, var8, 2);
            var1.c(var2, var3, var4, var2, var3, var4);
         } else {
            var1.a(var2, var3 - 1, var4, var8, 2);
            var1.c(var2, var3 - 1, var4, var2, var3, var4);
         }

         var1.a((yz)null, 1003, var2, var3, var4, 0);
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      int var6 = var1.e(var2, var3, var4);
      if((var6 & 8) == 0) {
         boolean var7 = false;
         if(var1.a(var2, var3 + 1, var4) != this) {
            var1.f(var2, var3, var4);
            var7 = true;
         }

         if(!ahb.a((ahl)var1, var2, var3 - 1, var4)) {
            var1.f(var2, var3, var4);
            var7 = true;
            if(var1.a(var2, var3 + 1, var4) == this) {
               var1.f(var2, var3 + 1, var4);
            }
         }

         if(var7) {
            if(!var1.E) {
               this.b(var1, var2, var3, var4, var6, 0);
            }
         } else {
            boolean var8 = var1.v(var2, var3, var4) || var1.v(var2, var3 + 1, var4);
            if((var8 || var5.f()) && var5 != this) {
               this.a(var1, var2, var3, var4, var8);
            }
         }
      } else {
         if(var1.a(var2, var3 - 1, var4) != this) {
            var1.f(var2, var3, var4);
         }

         if(var5 != this) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }
      }

   }

   public adb a(int var1, Random var2, int var3) {
      return (var1 & 8) != 0?null:(this.J == awt.f?ade.aw:ade.aq);
   }

   public azu a(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var3 >= 255?false:ahb.a((ahl)var1, var2, var3 - 1, var4) && super.c(var1, var2, var3, var4) && super.c(var1, var2, var3 + 1, var4);
   }

   public int h() {
      return 1;
   }

   public int g(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      boolean var6 = (var5 & 8) != 0;
      int var7;
      int var8;
      if(var6) {
         var7 = var1.e(var2, var3 - 1, var4);
         var8 = var5;
      } else {
         var7 = var5;
         var8 = var1.e(var2, var3 + 1, var4);
      }

      boolean var9 = (var8 & 1) != 0;
      return var7 & 7 | (var6?8:0) | (var9?16:0);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      if(var6.bE.d && (var5 & 8) != 0 && var1.a(var2, var3 - 1, var4) == this) {
         var1.f(var2, var3 - 1, var4);
      }

   }
}
