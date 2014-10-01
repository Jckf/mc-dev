import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class aui {

   private static final aur[] b = new aur[]{new aur(ava.class, 40, 0), new aur(aut.class, 5, 5), new aur(aup.class, 20, 0), new aur(auu.class, 20, 0), new aur(auv.class, 10, 6), new aur(avb.class, 5, 5), new aur(auy.class, 5, 5), new aur(auo.class, 5, 4), new aur(aum.class, 5, 4), new auj(auq.class, 10, 2), new auk(aus.class, 20, 1)};
   private static List c;
   private static Class d;
   static int a;
   private static final auw e = new auw((auj)null);


   public static void a() {
      avi.a(aum.class, "SHCC");
      avi.a(aun.class, "SHFC");
      avi.a(auo.class, "SH5C");
      avi.a(aup.class, "SHLT");
      avi.a(auq.class, "SHLi");
      avi.a(aus.class, "SHPR");
      avi.a(aut.class, "SHPH");
      avi.a(auu.class, "SHRT");
      avi.a(auv.class, "SHRC");
      avi.a(auy.class, "SHSD");
      avi.a(auz.class, "SHStart");
      avi.a(ava.class, "SHS");
      avi.a(avb.class, "SHSSD");
   }

   public static void b() {
      c = new ArrayList();
      aur[] var0 = b;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         aur var3 = var0[var2];
         var3.c = 0;
         c.add(var3);
      }

      d = null;
   }

   private static boolean d() {
      boolean var0 = false;
      a = 0;

      aur var2;
      for(Iterator var1 = c.iterator(); var1.hasNext(); a += var2.b) {
         var2 = (aur)var1.next();
         if(var2.d > 0 && var2.c < var2.d) {
            var0 = true;
         }
      }

      return var0;
   }

   private static avc a(Class var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Object var8 = null;
      if(var0 == ava.class) {
         var8 = ava.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == aut.class) {
         var8 = aut.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == aup.class) {
         var8 = aup.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == auu.class) {
         var8 = auu.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == auv.class) {
         var8 = auv.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == avb.class) {
         var8 = avb.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == auy.class) {
         var8 = auy.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == auo.class) {
         var8 = auo.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == aum.class) {
         var8 = aum.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == auq.class) {
         var8 = auq.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == aus.class) {
         var8 = aus.a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (avc)var8;
   }

   private static avc b(auz var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(!d()) {
         return null;
      } else {
         if(d != null) {
            avc var8 = a(d, var1, var2, var3, var4, var5, var6, var7);
            d = null;
            if(var8 != null) {
               return var8;
            }
         }

         int var13 = 0;

         while(var13 < 5) {
            ++var13;
            int var9 = var2.nextInt(a);
            Iterator var10 = c.iterator();

            while(var10.hasNext()) {
               aur var11 = (aur)var10.next();
               var9 -= var11.b;
               if(var9 < 0) {
                  if(!var11.a(var7) || var11 == var0.a) {
                     break;
                  }

                  avc var12 = a(var11.a, var1, var2, var3, var4, var5, var6, var7);
                  if(var12 != null) {
                     ++var11.c;
                     var0.a = var11;
                     if(!var11.a()) {
                        c.remove(var11);
                     }

                     return var12;
                  }
               }
            }
         }

         asv var14 = aun.a(var1, var2, var3, var4, var5, var6);
         if(var14 != null && var14.b > 1) {
            return new aun(var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static avk c(auz var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.c().a) <= 112 && Math.abs(var5 - var0.c().c) <= 112) {
         avc var8 = b(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            var1.add(var8);
            var0.c.add(var8);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static avk a(auz var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return c(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static Class a(Class var0) {
      d = var0;
      return var0;
   }

   // $FF: synthetic method
   static auw c() {
      return e;
   }

}
