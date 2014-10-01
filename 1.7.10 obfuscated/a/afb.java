
public class afb implements afg {

   public boolean a(aae var1, ahb var2) {
      int var3 = 0;
      add var4 = null;

      for(int var5 = 0; var5 < var1.a(); ++var5) {
         add var6 = var1.a(var5);
         if(var6 != null) {
            if(var6.b() == ade.aY) {
               if(var4 != null) {
                  return false;
               }

               var4 = var6;
            } else {
               if(var6.b() != ade.bJ) {
                  return false;
               }

               ++var3;
            }
         }
      }

      return var4 != null && var3 > 0;
   }

   public add a(aae var1) {
      int var2 = 0;
      add var3 = null;

      for(int var4 = 0; var4 < var1.a(); ++var4) {
         add var5 = var1.a(var4);
         if(var5 != null) {
            if(var5.b() == ade.aY) {
               if(var3 != null) {
                  return null;
               }

               var3 = var5;
            } else {
               if(var5.b() != ade.bJ) {
                  return null;
               }

               ++var2;
            }
         }
      }

      if(var3 != null && var2 >= 1) {
         add var6 = new add(ade.aY, var2 + 1, var3.k());
         if(var3.u()) {
            var6.c(var3.s());
         }

         return var6;
      } else {
         return null;
      }
   }

   public int a() {
      return 9;
   }

   public add b() {
      return null;
   }
}
