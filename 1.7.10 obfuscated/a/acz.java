
public class acz extends adb {

   private final Class a;


   public acz(Class var1) {
      this.a = var1;
      this.a(abt.c);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 == 0) {
         return false;
      } else if(var7 == 1) {
         return false;
      } else {
         int var11 = p.e[var7];
         ss var12 = this.a(var3, var4, var5, var6, var11);
         if(!var2.a(var4, var5, var6, var7, var1)) {
            return false;
         } else {
            if(var12 != null && var12.e()) {
               if(!var3.E) {
                  var3.d((sa)var12);
               }

               --var1.b;
            }

            return true;
         }
      }
   }

   private ss a(ahb var1, int var2, int var3, int var4, int var5) {
      return (ss)(this.a == tb.class?new tb(var1, var2, var3, var4, var5):(this.a == st.class?new st(var1, var2, var3, var4, var5):null));
   }
}
