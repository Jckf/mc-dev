import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class tl {

   protected final Map a = new HashMap();
   protected final Map b = new py();


   public ti a(th var1) {
      return (ti)this.a.get(var1);
   }

   public ti a(String var1) {
      return (ti)this.b.get(var1);
   }

   public abstract ti b(th var1);

   public Collection a() {
      return this.b.values();
   }

   public void a(tn var1) {}

   public void a(Multimap var1) {
      Iterator var2 = var1.entries().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         ti var4 = this.a((String)var3.getKey());
         if(var4 != null) {
            var4.b((tj)var3.getValue());
         }
      }

   }

   public void b(Multimap var1) {
      Iterator var2 = var1.entries().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         ti var4 = this.a((String)var3.getKey());
         if(var4 != null) {
            var4.b((tj)var3.getValue());
            var4.a((tj)var3.getValue());
         }
      }

   }
}
