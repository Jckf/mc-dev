
public class ael extends adb {

   public ael() {
      this.e(1);
   }

   public add a(add var1, ahb var2, yz var3) {
      var3.b(var1);
      return var1;
   }

   public boolean s() {
      return true;
   }

   public static boolean a(dh var0) {
      if(var0 == null) {
         return false;
      } else if(!var0.b("pages", 9)) {
         return false;
      } else {
         dq var1 = var0.c("pages", 8);

         for(int var2 = 0; var2 < var1.c(); ++var2) {
            String var3 = var1.f(var2);
            if(var3 == null) {
               return false;
            }

            if(var3.length() > 256) {
               return false;
            }
         }

         return true;
      }
   }
}
