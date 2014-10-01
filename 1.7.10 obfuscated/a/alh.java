import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class alh extends aji implements ajo {

   private static final Logger a = LogManager.getLogger();


   protected alh() {
      super(awt.b);
      this.a(true);
      this.a(abt.b);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         if(var1.k(var2, var3 + 1, var4) < 4 && var1.a(var2, var3 + 1, var4).k() > 2) {
            var1.b(var2, var3, var4, ajn.d);
         } else if(var1.k(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               aji var10 = var1.a(var7, var8 + 1, var9);
               if(var1.a(var7, var8, var9) == ajn.d && var1.e(var7, var8, var9) == 0 && var1.k(var7, var8 + 1, var9) >= 4 && var10.k() <= 2) {
                  var1.b(var7, var8, var9, (aji)ajn.c);
               }
            }
         }

      }
   }

   public adb a(int var1, Random var2, int var3) {
      return ajn.d.a(0, var2, var3);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      return true;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = 0;

      while(var6 < 128) {
         int var7 = var3;
         int var8 = var4 + 1;
         int var9 = var5;
         int var10 = 0;

         while(true) {
            if(var10 < var6 / 16) {
               var7 += var2.nextInt(3) - 1;
               var8 += (var2.nextInt(3) - 1) * var2.nextInt(3) / 2;
               var9 += var2.nextInt(3) - 1;
               if(var1.a(var7, var8 - 1, var9) == ajn.c && !var1.a(var7, var8, var9).r()) {
                  ++var10;
                  continue;
               }
            } else if(var1.a(var7, var8, var9).J == awt.a) {
               if(var2.nextInt(8) != 0) {
                  if(ajn.H.j(var1, var7, var8, var9)) {
                     var1.d(var7, var8, var9, ajn.H, 1, 3);
                  }
               } else {
                  String var13 = var1.a(var7, var9).a(var2, var7, var8, var9);
                  a.debug("Flower in " + var1.a(var7, var9).af + ": " + var13);
                  alc var11 = alc.e(var13);
                  if(var11 != null && var11.j(var1, var7, var8, var9)) {
                     int var12 = alc.f(var13);
                     var1.d(var7, var8, var9, var11, var12, 3);
                  }
               }
            }

            ++var6;
            break;
         }
      }

   }

}
