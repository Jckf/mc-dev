import java.util.ArrayList;
import java.util.Iterator;

class ed extends ec {

   protected ArrayList b = new ArrayList();


   public ed(String var1) {
      this.a = var1;
   }

   public dy a() {
      dh var1 = new dh();
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         ec var3 = (ec)var2.next();
         var1.a(var3.a, var3.a());
      }

      return var1;
   }
}
