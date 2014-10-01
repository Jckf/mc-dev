import java.util.List;
import java.util.Random;

public abstract class ajs extends aji {

   private final boolean a;


   protected ajs(boolean var1) {
      super(awt.q);
      this.a(true);
      this.a(abt.d);
      this.a = var1;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(ahb var1) {
      return this.a?30:20;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      return var5 == 2 && var1.a(var2, var3, var4 + 1).r()?true:(var5 == 3 && var1.a(var2, var3, var4 - 1).r()?true:(var5 == 4 && var1.a(var2 + 1, var3, var4).r()?true:var5 == 5 && var1.a(var2 - 1, var3, var4).r()));
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2 - 1, var3, var4).r()?true:(var1.a(var2 + 1, var3, var4).r()?true:(var1.a(var2, var3, var4 - 1).r()?true:var1.a(var2, var3, var4 + 1).r()));
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = var1.e(var2, var3, var4);
      int var11 = var10 & 8;
      var10 &= 7;
      if(var5 == 2 && var1.a(var2, var3, var4 + 1).r()) {
         var10 = 4;
      } else if(var5 == 3 && var1.a(var2, var3, var4 - 1).r()) {
         var10 = 3;
      } else if(var5 == 4 && var1.a(var2 + 1, var3, var4).r()) {
         var10 = 2;
      } else if(var5 == 5 && var1.a(var2 - 1, var3, var4).r()) {
         var10 = 1;
      } else {
         var10 = this.e(var1, var2, var3, var4);
      }

      return var10 + var11;
   }

   private int e(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2 - 1, var3, var4).r()?1:(var1.a(var2 + 1, var3, var4).r()?2:(var1.a(var2, var3, var4 - 1).r()?3:(var1.a(var2, var3, var4 + 1).r()?4:1)));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(this.m(var1, var2, var3, var4)) {
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

         if(var7) {
            this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.f(var2, var3, var4);
         }
      }

   }

   private boolean m(ahb var1, int var2, int var3, int var4) {
      if(!this.c(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      this.b(var5);
   }

   private void b(int var1) {
      int var2 = var1 & 7;
      boolean var3 = (var1 & 8) > 0;
      float var4 = 0.375F;
      float var5 = 0.625F;
      float var6 = 0.1875F;
      float var7 = 0.125F;
      if(var3) {
         var7 = 0.0625F;
      }

      if(var2 == 1) {
         this.a(0.0F, var4, 0.5F - var6, var7, var5, 0.5F + var6);
      } else if(var2 == 2) {
         this.a(1.0F - var7, var4, 0.5F - var6, 1.0F, var5, 0.5F + var6);
      } else if(var2 == 3) {
         this.a(0.5F - var6, var4, 0.0F, 0.5F + var6, var5, var7);
      } else if(var2 == 4) {
         this.a(0.5F - var6, var4, 1.0F - var7, 0.5F + var6, var5, 1.0F);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {}

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.e(var2, var3, var4);
      int var11 = var10 & 7;
      int var12 = 8 - (var10 & 8);
      if(var12 == 0) {
         return true;
      } else {
         var1.a(var2, var3, var4, var11 + var12, 3);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
         this.a(var1, var2, var3, var4, var11);
         var1.a(var2, var3, var4, this, this.a(var1));
         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if((var6 & 8) > 0) {
         int var7 = var6 & 7;
         this.a(var1, var2, var3, var4, var7);
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
         return var7 == 5 && var5 == 1?15:(var7 == 4 && var5 == 2?15:(var7 == 3 && var5 == 3?15:(var7 == 2 && var5 == 4?15:(var7 == 1 && var5 == 5?15:0))));
      }
   }

   public boolean f() {
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         int var6 = var1.e(var2, var3, var4);
         if((var6 & 8) != 0) {
            if(this.a) {
               this.n(var1, var2, var3, var4);
            } else {
               var1.a(var2, var3, var4, var6 & 7, 3);
               int var7 = var6 & 7;
               this.a(var1, var2, var3, var4, var7);
               var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
               var1.c(var2, var3, var4, var2, var3, var4);
            }

         }
      }
   }

   public void g() {
      float var1 = 0.1875F;
      float var2 = 0.125F;
      float var3 = 0.125F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      if(!var1.E) {
         if(this.a) {
            if((var1.e(var2, var3, var4) & 8) == 0) {
               this.n(var1, var2, var3, var4);
            }
         }
      }
   }

   private void n(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) != 0;
      this.b(var5);
      List var9 = var1.a(zc.class, azt.a((double)var2 + this.B, (double)var3 + this.C, (double)var4 + this.D, (double)var2 + this.E, (double)var3 + this.F, (double)var4 + this.G));
      boolean var8 = !var9.isEmpty();
      if(var8 && !var7) {
         var1.a(var2, var3, var4, var6 | 8, 3);
         this.a(var1, var2, var3, var4, var6);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if(!var8 && var7) {
         var1.a(var2, var3, var4, var6, 3);
         this.a(var1, var2, var3, var4, var6);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      }

      if(var8) {
         var1.a(var2, var3, var4, this, this.a(var1));
      }

   }

   private void a(ahb var1, int var2, int var3, int var4, int var5) {
      var1.d(var2, var3, var4, this);
      if(var5 == 1) {
         var1.d(var2 - 1, var3, var4, this);
      } else if(var5 == 2) {
         var1.d(var2 + 1, var3, var4, this);
      } else if(var5 == 3) {
         var1.d(var2, var3, var4 - 1, this);
      } else if(var5 == 4) {
         var1.d(var2, var3, var4 + 1, this);
      } else {
         var1.d(var2, var3 - 1, var4, this);
      }

   }
}
