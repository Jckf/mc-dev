import java.util.Iterator;
import java.util.List;

public class bag extends baf {

   public bag(String var1) {
      super(var1);
   }

   public int a(List var1) {
      float var2 = 0.0F;

      yz var4;
      for(Iterator var3 = var1.iterator(); var3.hasNext(); var2 += var4.aS() + var4.bs()) {
         var4 = (yz)var3.next();
      }

      if(var1.size() > 0) {
         var2 /= (float)var1.size();
      }

      return qh.f(var2);
   }

   public boolean b() {
      return true;
   }
}
