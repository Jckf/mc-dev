import java.util.Random;

public class arl extends arn {

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      while(var1.c(var3, var4, var5) && var4 > 2) {
         --var4;
      }

      if(var1.a(var3, var4, var5) != ajn.m) {
         return false;
      } else {
         int var6;
         int var7;
         for(var6 = -2; var6 <= 2; ++var6) {
            for(var7 = -2; var7 <= 2; ++var7) {
               if(var1.c(var3 + var6, var4 - 1, var5 + var7) && var1.c(var3 + var6, var4 - 2, var5 + var7)) {
                  return false;
               }
            }
         }

         for(var6 = -1; var6 <= 0; ++var6) {
            for(var7 = -2; var7 <= 2; ++var7) {
               for(int var8 = -2; var8 <= 2; ++var8) {
                  var1.d(var3 + var7, var4 + var6, var5 + var8, ajn.A, 0, 2);
               }
            }
         }

         var1.d(var3, var4, var5, ajn.i, 0, 2);
         var1.d(var3 - 1, var4, var5, ajn.i, 0, 2);
         var1.d(var3 + 1, var4, var5, ajn.i, 0, 2);
         var1.d(var3, var4, var5 - 1, ajn.i, 0, 2);
         var1.d(var3, var4, var5 + 1, ajn.i, 0, 2);

         for(var6 = -2; var6 <= 2; ++var6) {
            for(var7 = -2; var7 <= 2; ++var7) {
               if(var6 == -2 || var6 == 2 || var7 == -2 || var7 == 2) {
                  var1.d(var3 + var6, var4 + 1, var5 + var7, ajn.A, 0, 2);
               }
            }
         }

         var1.d(var3 + 2, var4 + 1, var5, ajn.U, 1, 2);
         var1.d(var3 - 2, var4 + 1, var5, ajn.U, 1, 2);
         var1.d(var3, var4 + 1, var5 + 2, ajn.U, 1, 2);
         var1.d(var3, var4 + 1, var5 - 2, ajn.U, 1, 2);

         for(var6 = -1; var6 <= 1; ++var6) {
            for(var7 = -1; var7 <= 1; ++var7) {
               if(var6 == 0 && var7 == 0) {
                  var1.d(var3 + var6, var4 + 4, var5 + var7, ajn.A, 0, 2);
               } else {
                  var1.d(var3 + var6, var4 + 4, var5 + var7, ajn.U, 1, 2);
               }
            }
         }

         for(var6 = 1; var6 <= 3; ++var6) {
            var1.d(var3 - 1, var4 + var6, var5 - 1, ajn.A, 0, 2);
            var1.d(var3 - 1, var4 + var6, var5 + 1, ajn.A, 0, 2);
            var1.d(var3 + 1, var4 + var6, var5 - 1, ajn.A, 0, 2);
            var1.d(var3 + 1, var4 + var6, var5 + 1, ajn.A, 0, 2);
         }

         return true;
      }
   }
}
