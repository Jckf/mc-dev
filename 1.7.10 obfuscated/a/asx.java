import java.util.List;
import java.util.Random;

public class asx {

   private static final qx[] a = new qx[]{new qx(ade.j, 0, 1, 5, 10), new qx(ade.k, 0, 1, 3, 5), new qx(ade.ax, 0, 4, 9, 5), new qx(ade.aR, 4, 4, 9, 5), new qx(ade.i, 0, 1, 2, 3), new qx(ade.h, 0, 3, 8, 10), new qx(ade.P, 0, 1, 3, 15), new qx(ade.b, 0, 1, 1, 1), new qx(adb.a(ajn.aq), 0, 4, 8, 1), new qx(ade.bc, 0, 2, 4, 10), new qx(ade.bb, 0, 2, 4, 10), new qx(ade.av, 0, 1, 1, 3), new qx(ade.bX, 0, 1, 1, 1)};


   public static void a() {
      avi.a(asy.class, "MSCorridor");
      avi.a(asz.class, "MSCrossing");
      avi.a(ata.class, "MSRoom");
      avi.a(atb.class, "MSStairs");
   }

   private static avk a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1.nextInt(100);
      asv var8;
      if(var7 >= 80) {
         var8 = asz.a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new asz(var6, var1, var8, var5);
         }
      } else if(var7 >= 70) {
         var8 = atb.a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new atb(var6, var1, var8, var5);
         }
      } else {
         var8 = asy.a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new asy(var6, var1, var8, var5);
         }
      }

      return null;
   }

   private static avk b(avk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 8) {
         return null;
      } else if(Math.abs(var3 - var0.c().a) <= 80 && Math.abs(var5 - var0.c().c) <= 80) {
         avk var8 = a(var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            var1.add(var8);
            var8.a(var0, var1, var2);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static avk a(avk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return b(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static qx[] b() {
      return a;
   }

}
