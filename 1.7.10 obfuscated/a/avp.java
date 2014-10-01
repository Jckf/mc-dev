import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class avp {

   public static void a() {
      avi.a(avq.class, "ViBH");
      avi.a(avr.class, "ViDF");
      avi.a(avs.class, "ViF");
      avi.a(avt.class, "ViL");
      avi.a(avv.class, "ViPH");
      avi.a(avw.class, "ViSH");
      avi.a(avx.class, "ViSmH");
      avi.a(avy.class, "ViST");
      avi.a(avz.class, "ViS");
      avi.a(awa.class, "ViStart");
      avi.a(awb.class, "ViSR");
      avi.a(awc.class, "ViTRH");
      avi.a(awf.class, "ViW");
   }

   public static List a(Random var0, int var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new avu(avw.class, 4, qh.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new avu(avy.class, 20, qh.a(var0, 0 + var1, 1 + var1)));
      var2.add(new avu(avq.class, 20, qh.a(var0, 0 + var1, 2 + var1)));
      var2.add(new avu(avx.class, 3, qh.a(var0, 2 + var1, 5 + var1 * 3)));
      var2.add(new avu(avv.class, 15, qh.a(var0, 0 + var1, 2 + var1)));
      var2.add(new avu(avr.class, 3, qh.a(var0, 1 + var1, 4 + var1)));
      var2.add(new avu(avs.class, 3, qh.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new avu(avz.class, 15, qh.a(var0, 0, 1 + var1)));
      var2.add(new avu(awc.class, 8, qh.a(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if(((avu)var3.next()).d == 0) {
            var3.remove();
         }
      }

      return var2;
   }

   private static int a(List var0) {
      boolean var1 = false;
      int var2 = 0;

      avu var4;
      for(Iterator var3 = var0.iterator(); var3.hasNext(); var2 += var4.b) {
         var4 = (avu)var3.next();
         if(var4.d > 0 && var4.c < var4.d) {
            var1 = true;
         }
      }

      return var1?var2:-1;
   }

   private static awd a(awa var0, avu var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      Class var9 = var1.a;
      Object var10 = null;
      if(var9 == avw.class) {
         var10 = avw.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == avy.class) {
         var10 = avy.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == avq.class) {
         var10 = avq.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == avx.class) {
         var10 = avx.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == avv.class) {
         var10 = avv.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == avr.class) {
         var10 = avr.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == avs.class) {
         var10 = avs.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == avz.class) {
         var10 = avz.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == awc.class) {
         var10 = awc.a(var0, var2, var3, var4, var5, var6, var7, var8);
      }

      return (awd)var10;
   }

   private static awd c(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = a(var0.e);
      if(var8 <= 0) {
         return null;
      } else {
         int var9 = 0;

         while(var9 < 5) {
            ++var9;
            int var10 = var2.nextInt(var8);
            Iterator var11 = var0.e.iterator();

            while(var11.hasNext()) {
               avu var12 = (avu)var11.next();
               var10 -= var12.b;
               if(var10 < 0) {
                  if(!var12.a(var7) || var12 == var0.d && var0.e.size() > 1) {
                     break;
                  }

                  awd var13 = a(var0, var12, var1, var2, var3, var4, var5, var6, var7);
                  if(var13 != null) {
                     ++var12.c;
                     var0.d = var12;
                     if(!var12.a()) {
                        var0.e.remove(var12);
                     }

                     return var13;
                  }
               }
            }
         }

         asv var14 = avt.a(var0, var1, var2, var3, var4, var5, var6);
         if(var14 != null) {
            return new avt(var0, var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static avk d(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.c().a) <= 112 && Math.abs(var5 - var0.c().c) <= 112) {
         awd var8 = c(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            int var9 = (var8.f.a + var8.f.d) / 2;
            int var10 = (var8.f.c + var8.f.f) / 2;
            int var11 = var8.f.d - var8.f.a;
            int var12 = var8.f.f - var8.f.c;
            int var13 = var11 > var12?var11:var12;
            if(var0.e().a(var9, var10, var13 / 2 + 4, avn.e)) {
               var1.add(var8);
               var0.i.add(var8);
               return var8;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static avk e(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 3 + var0.c) {
         return null;
      } else if(Math.abs(var3 - var0.c().a) <= 112 && Math.abs(var5 - var0.c().c) <= 112) {
         asv var8 = awb.a(var0, var1, var2, var3, var4, var5, var6);
         if(var8 != null && var8.b > 10) {
            awb var9 = new awb(var0, var7, var2, var8, var6);
            int var10 = (var9.f.a + var9.f.d) / 2;
            int var11 = (var9.f.c + var9.f.f) / 2;
            int var12 = var9.f.d - var9.f.a;
            int var13 = var9.f.f - var9.f.c;
            int var14 = var12 > var13?var12:var13;
            if(var0.e().a(var10, var11, var14 / 2 + 4, avn.e)) {
               var1.add(var9);
               var0.j.add(var9);
               return var9;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static avk a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return d(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static avk b(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return e(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
