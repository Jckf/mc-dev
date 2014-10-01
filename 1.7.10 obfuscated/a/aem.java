
public class aem extends adb {

   public aem() {
      this.e(1);
   }

   public static boolean a(dh var0) {
      if(!ael.a(var0)) {
         return false;
      } else if(!var0.b("title", 8)) {
         return false;
      } else {
         String var1 = var0.j("title");
         return var1 != null && var1.length() <= 16?var0.b("author", 8):false;
      }
   }

   public String n(add var1) {
      if(var1.p()) {
         dh var2 = var1.q();
         String var3 = var2.j("title");
         if(!qn.b(var3)) {
            return var3;
         }
      }

      return super.n(var1);
   }

   public add a(add var1, ahb var2, yz var3) {
      var3.b(var1);
      return var1;
   }

   public boolean s() {
      return true;
   }
}
