import java.util.Random;

public class ako extends ajr implements ajo {

   public static final String[] a = new String[]{"sunflower", "syringa", "grass", "fern", "rose", "paeonia"};


   public ako() {
      super(awt.k);
      this.c(0.0F);
      this.a(h);
      this.c("doublePlant");
   }

   public int b() {
      return 40;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int e(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return !c(var5)?var5 & 7:var1.e(var2, var3 - 1, var4) & 7;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4) && var1.c(var2, var3 + 1, var4);
   }

   protected void e(ahb var1, int var2, int var3, int var4) {
      if(!this.j(var1, var2, var3, var4)) {
         int var5 = var1.e(var2, var3, var4);
         if(!c(var5)) {
            this.b(var1, var2, var3, var4, var5, 0);
            if(var1.a(var2, var3 + 1, var4) == this) {
               var1.d(var2, var3 + 1, var4, ajn.a, 0, 2);
            }
         }

         var1.d(var2, var3, var4, ajn.a, 0, 2);
      }

   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return c(var5)?var1.a(var2, var3 - 1, var4) == this:var1.a(var2, var3 + 1, var4) == this && super.j(var1, var2, var3, var4);
   }

   public adb a(int var1, Random var2, int var3) {
      if(c(var1)) {
         return null;
      } else {
         int var4 = d(var1);
         return var4 != 3 && var4 != 2?adb.a((aji)this):null;
      }
   }

   public int a(int var1) {
      return c(var1)?0:var1 & 7;
   }

   public static boolean c(int var0) {
      return (var0 & 8) != 0;
   }

   public static int d(int var0) {
      return var0 & 7;
   }

   public void c(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      var1.d(var2, var3, var4, this, var5, var6);
      var1.d(var2, var3 + 1, var4, this, 8, var6);
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = ((qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.d(var2, var3 + 1, var4, this, 8 | var7, 2);
   }

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      if(var1.E || var2.bF() == null || var2.bF().b() != ade.aZ || c(var6) || !this.b(var1, var3, var4, var5, var6, var2)) {
         super.a(var1, var2, var3, var4, var5, var6);
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      if(c(var5)) {
         if(var1.a(var2, var3 - 1, var4) == this) {
            if(!var6.bE.d) {
               int var7 = var1.e(var2, var3 - 1, var4);
               int var8 = d(var7);
               if(var8 != 3 && var8 != 2) {
                  var1.a(var2, var3 - 1, var4, true);
               } else {
                  if(!var1.E && var6.bF() != null && var6.bF().b() == ade.aZ) {
                     this.b(var1, var2, var3, var4, var7, var6);
                  }

                  var1.f(var2, var3 - 1, var4);
               }
            } else {
               var1.f(var2, var3 - 1, var4);
            }
         }
      } else if(var6.bE.d && var1.a(var2, var3 + 1, var4) == this) {
         var1.d(var2, var3 + 1, var4, ajn.a, 0, 2);
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   private boolean b(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      int var7 = d(var5);
      if(var7 != 3 && var7 != 2) {
         return false;
      } else {
         var6.a(pp.C[aji.b((aji)this)], 1);
         byte var8 = 1;
         if(var7 == 3) {
            var8 = 2;
         }

         this.a(var1, var2, var3, var4, new add(ajn.H, 2, var8));
         return true;
      }
   }

   public int k(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return c(var5)?d(var1.e(var2, var3 - 1, var4)):d(var5);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.e((ahl)var1, var2, var3, var4);
      return var6 != 2 && var6 != 3;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = this.e((ahl)var1, var3, var4, var5);
      this.a(var1, var3, var4, var5, new add(this, 1, var6));
   }

}
