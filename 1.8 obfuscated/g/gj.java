import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

class gj extends gh {

   protected List b = Lists.newArrayList();


   public gj(String var1) {
      this.a = var1;
   }

   public gd a() {
      fv var1 = new fv();
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         gh var3 = (gh)var2.next();
         var1.a(var3.a());
      }

      return var1;
   }
}
