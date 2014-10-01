import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class afi implements afg {

   private final add a;
   private final List b;


   public afi(add var1, List var2) {
      this.a = var1;
      this.b = var2;
   }

   public add b() {
      return this.a;
   }

   public boolean a(aae var1, ahb var2) {
      ArrayList var3 = new ArrayList(this.b);

      for(int var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 3; ++var5) {
            add var6 = var1.b(var5, var4);
            if(var6 != null) {
               boolean var7 = false;
               Iterator var8 = var3.iterator();

               while(var8.hasNext()) {
                  add var9 = (add)var8.next();
                  if(var6.b() == var9.b() && (var9.k() == 32767 || var6.k() == var9.k())) {
                     var7 = true;
                     var3.remove(var9);
                     break;
                  }
               }

               if(!var7) {
                  return false;
               }
            }
         }
      }

      return var3.isEmpty();
   }

   public add a(aae var1) {
      return this.a.m();
   }

   public int a() {
      return this.b.size();
   }
}
