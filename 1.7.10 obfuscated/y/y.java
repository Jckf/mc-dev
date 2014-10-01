import com.google.common.primitives.Doubles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public abstract class y implements aa {

   private static x a;


   public int a() {
      return 4;
   }

   public List b() {
      return null;
   }

   public boolean a(ac var1) {
      return var1.a(this.a(), this.c());
   }

   public List a(ac var1, String[] var2) {
      return null;
   }

   public static int a(ac var0, String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         throw new ce("commands.generic.num.invalid", new Object[]{var1});
      }
   }

   public static int a(ac var0, String var1, int var2) {
      return a(var0, var1, var2, Integer.MAX_VALUE);
   }

   public static int a(ac var0, String var1, int var2, int var3) {
      int var4 = a(var0, var1);
      if(var4 < var2) {
         throw new ce("commands.generic.num.tooSmall", new Object[]{Integer.valueOf(var4), Integer.valueOf(var2)});
      } else if(var4 > var3) {
         throw new ce("commands.generic.num.tooBig", new Object[]{Integer.valueOf(var4), Integer.valueOf(var3)});
      } else {
         return var4;
      }
   }

   public static double b(ac var0, String var1) {
      try {
         double var2 = Double.parseDouble(var1);
         if(!Doubles.isFinite(var2)) {
            throw new ce("commands.generic.num.invalid", new Object[]{var1});
         } else {
            return var2;
         }
      } catch (NumberFormatException var4) {
         throw new ce("commands.generic.num.invalid", new Object[]{var1});
      }
   }

   public static double a(ac var0, String var1, double var2) {
      return a(var0, var1, var2, Double.MAX_VALUE);
   }

   public static double a(ac var0, String var1, double var2, double var4) {
      double var6 = b(var0, var1);
      if(var6 < var2) {
         throw new ce("commands.generic.double.tooSmall", new Object[]{Double.valueOf(var6), Double.valueOf(var2)});
      } else if(var6 > var4) {
         throw new ce("commands.generic.double.tooBig", new Object[]{Double.valueOf(var6), Double.valueOf(var4)});
      } else {
         return var6;
      }
   }

   public static boolean c(ac var0, String var1) {
      if(!var1.equals("true") && !var1.equals("1")) {
         if(!var1.equals("false") && !var1.equals("0")) {
            throw new cd("commands.generic.boolean.invalid", new Object[]{var1});
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static mw b(ac var0) {
      if(var0 instanceof mw) {
         return (mw)var0;
      } else {
         throw new cg("You must specify which player you wish to perform this action on.", new Object[0]);
      }
   }

   public static mw d(ac var0, String var1) {
      mw var2 = ad.a(var0, var1);
      if(var2 != null) {
         return var2;
      } else {
         var2 = MinecraftServer.I().ah().a(var1);
         if(var2 == null) {
            throw new cg();
         } else {
            return var2;
         }
      }
   }

   public static String e(ac var0, String var1) {
      mw var2 = ad.a(var0, var1);
      if(var2 != null) {
         return var2.b_();
      } else if(ad.b(var1)) {
         throw new cg();
      } else {
         return var1;
      }
   }

   public static fj a(ac var0, String[] var1, int var2) {
      return a(var0, var1, var2, false);
   }

   public static fj a(ac var0, String[] var1, int var2, boolean var3) {
      fq var4 = new fq("");

      for(int var5 = var2; var5 < var1.length; ++var5) {
         if(var5 > var2) {
            var4.a(" ");
         }

         Object var6 = new fq(var1[var5]);
         if(var3) {
            fj var7 = ad.b(var0, var1[var5]);
            if(var7 != null) {
               var6 = var7;
            } else if(ad.b(var1[var5])) {
               throw new cg();
            }
         }

         var4.a((fj)var6);
      }

      return var4;
   }

   public static String b(ac var0, String[] var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var2; var4 < var1.length; ++var4) {
         if(var4 > var2) {
            var3.append(" ");
         }

         String var5 = var1[var4];
         var3.append(var5);
      }

      return var3.toString();
   }

   public static double a(ac var0, double var1, String var3) {
      return a(var0, var1, var3, -30000000, 30000000);
   }

   public static double a(ac var0, double var1, String var3, int var4, int var5) {
      boolean var6 = var3.startsWith("~");
      if(var6 && Double.isNaN(var1)) {
         throw new ce("commands.generic.num.invalid", new Object[]{Double.valueOf(var1)});
      } else {
         double var7 = var6?var1:0.0D;
         if(!var6 || var3.length() > 1) {
            boolean var9 = var3.contains(".");
            if(var6) {
               var3 = var3.substring(1);
            }

            var7 += b(var0, var3);
            if(!var9 && !var6) {
               var7 += 0.5D;
            }
         }

         if(var4 != 0 || var5 != 0) {
            if(var7 < (double)var4) {
               throw new ce("commands.generic.double.tooSmall", new Object[]{Double.valueOf(var7), Integer.valueOf(var4)});
            }

            if(var7 > (double)var5) {
               throw new ce("commands.generic.double.tooBig", new Object[]{Double.valueOf(var7), Integer.valueOf(var5)});
            }
         }

         return var7;
      }
   }

   public static adb f(ac var0, String var1) {
      adb var2 = (adb)adb.e.a(var1);
      if(var2 == null) {
         try {
            adb var3 = adb.d(Integer.parseInt(var1));
            if(var3 != null) {
               fr var4 = new fr("commands.generic.deprecatedId", new Object[]{adb.e.c((Object)var3)});
               var4.b().a(a.h);
               var0.a(var4);
            }

            var2 = var3;
         } catch (NumberFormatException var5) {
            ;
         }
      }

      if(var2 == null) {
         throw new ce("commands.give.notFound", new Object[]{var1});
      } else {
         return var2;
      }
   }

   public static aji g(ac var0, String var1) {
      if(aji.c.b(var1)) {
         return (aji)aji.c.a(var1);
      } else {
         try {
            int var2 = Integer.parseInt(var1);
            if(aji.c.b(var2)) {
               aji var3 = aji.e(var2);
               fr var4 = new fr("commands.generic.deprecatedId", new Object[]{aji.c.c((Object)var3)});
               var4.b().a(a.h);
               var0.a(var4);
               return var3;
            }
         } catch (NumberFormatException var5) {
            ;
         }

         throw new ce("commands.give.notFound", new Object[]{var1});
      }
   }

   public static String a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2].toString();
         if(var2 > 0) {
            if(var2 == var0.length - 1) {
               var1.append(" and ");
            } else {
               var1.append(", ");
            }
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   public static fj a(fj[] var0) {
      fq var1 = new fq("");

      for(int var2 = 0; var2 < var0.length; ++var2) {
         if(var2 > 0) {
            if(var2 == var0.length - 1) {
               var1.a(" and ");
            } else if(var2 > 0) {
               var1.a(", ");
            }
         }

         var1.a(var0[var2]);
      }

      return var1;
   }

   public static String a(Collection var0) {
      return a(var0.toArray(new String[var0.size()]));
   }

   public static boolean a(String var0, String var1) {
      return var1.regionMatches(true, 0, var0, 0, var0.length());
   }

   public static List a(String[] var0, String ... var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = new ArrayList();
      String[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if(a(var2, var7)) {
            var3.add(var7);
         }
      }

      return var3;
   }

   public static List a(String[] var0, Iterable var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if(a(var2, var5)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public boolean a(String[] var1, int var2) {
      return false;
   }

   public static void a(ac var0, aa var1, String var2, Object ... var3) {
      a(var0, var1, 0, var2, var3);
   }

   public static void a(ac var0, aa var1, int var2, String var3, Object ... var4) {
      if(a != null) {
         a.a(var0, var1, var2, var3, var4);
      }

   }

   public static void a(x var0) {
      a = var0;
   }

   public int a(aa var1) {
      return this.c().compareTo(var1.c());
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((aa)var1);
   }
}
