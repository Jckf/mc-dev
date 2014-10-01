import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ana extends aji {

   private boolean a = true;
   private Set b = new HashSet();


   public ana() {
      super(awt.q);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
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
      return 5;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return ahb.a((ahl)var1, var2, var3 - 1, var4) || var1.a(var2, var3 - 1, var4) == ajn.aN;
   }

   private void e(ahb var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, var2, var3, var4);
      ArrayList var5 = new ArrayList(this.b);
      this.b.clear();

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         agt var7 = (agt)var5.get(var6);
         var1.d(var7.a, var7.b, var7.c, this);
      }

   }

   private void a(ahb var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.e(var2, var3, var4);
      byte var9 = 0;
      int var15 = this.a(var1, var5, var6, var7, var9);
      this.a = false;
      int var10 = var1.w(var2, var3, var4);
      this.a = true;
      if(var10 > 0 && var10 > var15 - 1) {
         var15 = var10;
      }

      int var11 = 0;

      for(int var12 = 0; var12 < 4; ++var12) {
         int var13 = var2;
         int var14 = var4;
         if(var12 == 0) {
            var13 = var2 - 1;
         }

         if(var12 == 1) {
            ++var13;
         }

         if(var12 == 2) {
            var14 = var4 - 1;
         }

         if(var12 == 3) {
            ++var14;
         }

         if(var13 != var5 || var14 != var7) {
            var11 = this.a(var1, var13, var3, var14, var11);
         }

         if(var1.a(var13, var3, var14).r() && !var1.a(var2, var3 + 1, var4).r()) {
            if((var13 != var5 || var14 != var7) && var3 >= var6) {
               var11 = this.a(var1, var13, var3 + 1, var14, var11);
            }
         } else if(!var1.a(var13, var3, var14).r() && (var13 != var5 || var14 != var7) && var3 <= var6) {
            var11 = this.a(var1, var13, var3 - 1, var14, var11);
         }
      }

      if(var11 > var15) {
         var15 = var11 - 1;
      } else if(var15 > 0) {
         --var15;
      } else {
         var15 = 0;
      }

      if(var10 > var15 - 1) {
         var15 = var10;
      }

      if(var8 != var15) {
         var1.a(var2, var3, var4, var15, 2);
         this.b.add(new agt(var2, var3, var4));
         this.b.add(new agt(var2 - 1, var3, var4));
         this.b.add(new agt(var2 + 1, var3, var4));
         this.b.add(new agt(var2, var3 - 1, var4));
         this.b.add(new agt(var2, var3 + 1, var4));
         this.b.add(new agt(var2, var3, var4 - 1));
         this.b.add(new agt(var2, var3, var4 + 1));
      }

   }

   private void m(ahb var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this) {
         var1.d(var2, var3, var4, this);
         var1.d(var2 - 1, var3, var4, this);
         var1.d(var2 + 1, var3, var4, this);
         var1.d(var2, var3, var4 - 1, this);
         var1.d(var2, var3, var4 + 1, this);
         var1.d(var2, var3 - 1, var4, this);
         var1.d(var2, var3 + 1, var4, this);
      }
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      if(!var1.E) {
         this.e(var1, var2, var3, var4);
         var1.d(var2, var3 + 1, var4, this);
         var1.d(var2, var3 - 1, var4, this);
         this.m(var1, var2 - 1, var3, var4);
         this.m(var1, var2 + 1, var3, var4);
         this.m(var1, var2, var3, var4 - 1);
         this.m(var1, var2, var3, var4 + 1);
         if(var1.a(var2 - 1, var3, var4).r()) {
            this.m(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.m(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.a(var2 + 1, var3, var4).r()) {
            this.m(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.m(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.a(var2, var3, var4 - 1).r()) {
            this.m(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.m(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.a(var2, var3, var4 + 1).r()) {
            this.m(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.m(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      if(!var1.E) {
         var1.d(var2, var3 + 1, var4, this);
         var1.d(var2, var3 - 1, var4, this);
         var1.d(var2 + 1, var3, var4, this);
         var1.d(var2 - 1, var3, var4, this);
         var1.d(var2, var3, var4 + 1, this);
         var1.d(var2, var3, var4 - 1, this);
         this.e(var1, var2, var3, var4);
         this.m(var1, var2 - 1, var3, var4);
         this.m(var1, var2 + 1, var3, var4);
         this.m(var1, var2, var3, var4 - 1);
         this.m(var1, var2, var3, var4 + 1);
         if(var1.a(var2 - 1, var3, var4).r()) {
            this.m(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.m(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.a(var2 + 1, var3, var4).r()) {
            this.m(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.m(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.a(var2, var3, var4 - 1).r()) {
            this.m(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.m(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.a(var2, var3, var4 + 1).r()) {
            this.m(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.m(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   private int a(ahb var1, int var2, int var3, int var4, int var5) {
      if(var1.a(var2, var3, var4) != this) {
         return var5;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var6 > var5?var6:var5;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         boolean var6 = this.c(var1, var2, var3, var4);
         if(var6) {
            this.e(var1, var2, var3, var4);
         } else {
            this.b(var1, var2, var3, var4, 0, 0);
            var1.f(var2, var3, var4);
         }

         super.a(var1, var2, var3, var4, var5);
      }
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.ax;
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      return !this.a?0:this.b(var1, var2, var3, var4, var5);
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      if(!this.a) {
         return 0;
      } else {
         int var6 = var1.e(var2, var3, var4);
         if(var6 == 0) {
            return 0;
         } else if(var5 == 1) {
            return var6;
         } else {
            boolean var7 = g(var1, var2 - 1, var3, var4, 1) || !var1.a(var2 - 1, var3, var4).r() && g(var1, var2 - 1, var3 - 1, var4, -1);
            boolean var8 = g(var1, var2 + 1, var3, var4, 3) || !var1.a(var2 + 1, var3, var4).r() && g(var1, var2 + 1, var3 - 1, var4, -1);
            boolean var9 = g(var1, var2, var3, var4 - 1, 2) || !var1.a(var2, var3, var4 - 1).r() && g(var1, var2, var3 - 1, var4 - 1, -1);
            boolean var10 = g(var1, var2, var3, var4 + 1, 0) || !var1.a(var2, var3, var4 + 1).r() && g(var1, var2, var3 - 1, var4 + 1, -1);
            if(!var1.a(var2, var3 + 1, var4).r()) {
               if(var1.a(var2 - 1, var3, var4).r() && g(var1, var2 - 1, var3 + 1, var4, -1)) {
                  var7 = true;
               }

               if(var1.a(var2 + 1, var3, var4).r() && g(var1, var2 + 1, var3 + 1, var4, -1)) {
                  var8 = true;
               }

               if(var1.a(var2, var3, var4 - 1).r() && g(var1, var2, var3 + 1, var4 - 1, -1)) {
                  var9 = true;
               }

               if(var1.a(var2, var3, var4 + 1).r() && g(var1, var2, var3 + 1, var4 + 1, -1)) {
                  var10 = true;
               }
            }

            return !var9 && !var8 && !var7 && !var10 && var5 >= 2 && var5 <= 5?var6:(var5 == 2 && var9 && !var7 && !var8?var6:(var5 == 3 && var10 && !var7 && !var8?var6:(var5 == 4 && var7 && !var9 && !var10?var6:(var5 == 5 && var8 && !var9 && !var10?var6:0))));
         }
      }
   }

   public boolean f() {
      return this.a;
   }

   public static boolean f(ahl var0, int var1, int var2, int var3, int var4) {
      aji var5 = var0.a(var1, var2, var3);
      if(var5 == ajn.af) {
         return true;
      } else if(!ajn.aR.e(var5)) {
         return var5.f() && var4 != -1;
      } else {
         int var6 = var0.e(var1, var2, var3);
         return var4 == (var6 & 3) || var4 == p.f[var6 & 3];
      }
   }

   public static boolean g(ahl var0, int var1, int var2, int var3, int var4) {
      if(f(var0, var1, var2, var3, var4)) {
         return true;
      } else if(var0.a(var1, var2, var3) == ajn.aS) {
         int var5 = var0.e(var1, var2, var3);
         return var4 == (var5 & 3);
      } else {
         return false;
      }
   }
}
