import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class anc extends aoc {

   private boolean a;
   private static Map b = new HashMap();


   private boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      if(!b.containsKey(var1)) {
         b.put(var1, new ArrayList());
      }

      List var6 = (List)b.get(var1);
      if(var5) {
         var6.add(new and(var2, var3, var4, var1.I()));
      }

      int var7 = 0;

      for(int var8 = 0; var8 < var6.size(); ++var8) {
         and var9 = (and)var6.get(var8);
         if(var9.a == var2 && var9.b == var3 && var9.c == var4) {
            ++var7;
            if(var7 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected anc(boolean var1) {
      this.a = var1;
      this.a(true);
      this.a((abt)null);
   }

   public int a(ahb var1) {
      return 2;
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      if(var1.e(var2, var3, var4) == 0) {
         super.b(var1, var2, var3, var4);
      }

      if(this.a) {
         var1.d(var2, var3 - 1, var4, this);
         var1.d(var2, var3 + 1, var4, this);
         var1.d(var2 - 1, var3, var4, this);
         var1.d(var2 + 1, var3, var4, this);
         var1.d(var2, var3, var4 - 1, this);
         var1.d(var2, var3, var4 + 1, this);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if(this.a) {
         var1.d(var2, var3 - 1, var4, this);
         var1.d(var2, var3 + 1, var4, this);
         var1.d(var2 - 1, var3, var4, this);
         var1.d(var2 + 1, var3, var4, this);
         var1.d(var2, var3, var4 - 1, this);
         var1.d(var2, var3, var4 + 1, this);
      }

   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      if(!this.a) {
         return 0;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var6 == 5 && var5 == 1?0:(var6 == 3 && var5 == 3?0:(var6 == 4 && var5 == 2?0:(var6 == 1 && var5 == 5?0:(var6 == 2 && var5 == 4?0:15))));
      }
   }

   private boolean m(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return var5 == 5 && var1.f(var2, var3 - 1, var4, 0)?true:(var5 == 3 && var1.f(var2, var3, var4 - 1, 2)?true:(var5 == 4 && var1.f(var2, var3, var4 + 1, 3)?true:(var5 == 1 && var1.f(var2 - 1, var3, var4, 4)?true:var5 == 2 && var1.f(var2 + 1, var3, var4, 5))));
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = this.m(var1, var2, var3, var4);
      List var7 = (List)b.get(var1);

      while(var7 != null && !var7.isEmpty() && var1.I() - ((and)var7.get(0)).d > 60L) {
         var7.remove(0);
      }

      if(this.a) {
         if(var6) {
            var1.d(var2, var3, var4, ajn.az, var1.e(var2, var3, var4), 3);
            if(this.a(var1, var2, var3, var4, true)) {
               var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.s.nextFloat() - var1.s.nextFloat()) * 0.8F);

               for(int var8 = 0; var8 < 5; ++var8) {
                  double var9 = (double)var2 + var5.nextDouble() * 0.6D + 0.2D;
                  double var11 = (double)var3 + var5.nextDouble() * 0.6D + 0.2D;
                  double var13 = (double)var4 + var5.nextDouble() * 0.6D + 0.2D;
                  var1.a("smoke", var9, var11, var13, 0.0D, 0.0D, 0.0D);
               }
            }
         }
      } else if(!var6 && !this.a(var1, var2, var3, var4, false)) {
         var1.d(var2, var3, var4, ajn.aA, var1.e(var2, var3, var4), 3);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!this.b(var1, var2, var3, var4, var5)) {
         boolean var6 = this.m(var1, var2, var3, var4);
         if(this.a && var6 || !this.a && !var6) {
            var1.a(var2, var3, var4, this, this.a(var1));
         }

      }
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      return var5 == 0?this.b(var1, var2, var3, var4, var5):0;
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a(ajn.aA);
   }

   public boolean f() {
      return true;
   }

   public boolean c(aji var1) {
      return var1 == ajn.az || var1 == ajn.aA;
   }

}
