import java.util.Iterator;
import java.util.List;

public class adf extends adb {

   public adf() {
      this.a(abt.i);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      aji var11 = var3.a(var4, var5, var6);
      if(var11.b() == 11) {
         if(var3.E) {
            return true;
         } else {
            a(var2, var3, var4, var5, var6);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean a(yz var0, ahb var1, int var2, int var3, int var4) {
      su var5 = su.b(var1, var2, var3, var4);
      boolean var6 = false;
      double var7 = 7.0D;
      List var9 = var1.a(sw.class, azt.a((double)var2 - var7, (double)var3 - var7, (double)var4 - var7, (double)var2 + var7, (double)var3 + var7, (double)var4 + var7));
      if(var9 != null) {
         Iterator var10 = var9.iterator();

         while(var10.hasNext()) {
            sw var11 = (sw)var10.next();
            if(var11.bN() && var11.bO() == var0) {
               if(var5 == null) {
                  var5 = su.a(var1, var2, var3, var4);
               }

               var11.b(var5, true);
               var6 = true;
            }
         }
      }

      return var6;
   }
}
