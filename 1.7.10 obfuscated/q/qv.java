import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class qv {

   public static int a(Collection var0) {
      int var1 = 0;

      qw var3;
      for(Iterator var2 = var0.iterator(); var2.hasNext(); var1 += var3.a) {
         var3 = (qw)var2.next();
      }

      return var1;
   }

   public static qw a(Random var0, Collection var1, int var2) {
      if(var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);
         Iterator var4 = var1.iterator();

         qw var5;
         do {
            if(!var4.hasNext()) {
               return null;
            }

            var5 = (qw)var4.next();
            var3 -= var5.a;
         } while(var3 >= 0);

         return var5;
      }
   }

   public static qw a(Random var0, Collection var1) {
      return a(var0, var1, a(var1));
   }

   public static int a(qw[] var0) {
      int var1 = 0;
      qw[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         qw var5 = var2[var4];
         var1 += var5.a;
      }

      return var1;
   }

   public static qw a(Random var0, qw[] var1, int var2) {
      if(var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);
         qw[] var4 = var1;
         int var5 = var1.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            qw var7 = var4[var6];
            var3 -= var7.a;
            if(var3 < 0) {
               return var7;
            }
         }

         return null;
      }
   }

   public static qw a(Random var0, qw[] var1) {
      return a(var0, var1, a(var1));
   }
}
