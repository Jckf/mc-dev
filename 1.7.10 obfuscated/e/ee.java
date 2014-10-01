import java.util.ArrayList;
import java.util.Iterator;

class ee extends ec {

   protected ArrayList b = new ArrayList();


   public ee(String var1) {
      this.a = var1;
   }

   public dy a() {
      dq var1 = new dq();
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         ec var3 = (ec)var2.next();
         var1.a(var3.a());
      }

      return var1;
   }
}
