import java.util.HashMap;
import java.util.Map;

public class adr extends adb {

   private static final Map b = new HashMap();
   public final String a;


   protected adr(String var1) {
      this.a = var1;
      this.h = 1;
      this.a(abt.f);
      b.put(var1, this);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var3.a(var4, var5, var6) == ajn.aI && var3.e(var4, var5, var6) == 0) {
         if(var3.E) {
            return true;
         } else {
            ((alq)ajn.aI).b(var3, var4, var5, var6, var1);
            var3.a((yz)null, 1005, var4, var5, var6, adb.b((adb)this));
            --var1.b;
            return true;
         }
      } else {
         return false;
      }
   }

   public adq f(add var1) {
      return adq.c;
   }

}
