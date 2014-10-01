import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class gd extends ft {

   private Map a;


   public gd() {}

   public gd(Map var1) {
      this.a = var1;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void a(et var1) {
      int var2 = var1.a();
      this.a = Maps.newHashMap();

      for(int var3 = 0; var3 < var2; ++var3) {
         ph var4 = pp.a(var1.c(32767));
         int var5 = var1.a();
         if(var4 != null) {
            this.a.put(var4, Integer.valueOf(var5));
         }
      }

   }

   public void b(et var1) {
      var1.b(this.a.size());
      Iterator var2 = this.a.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.a(((ph)var3.getKey()).e);
         var1.b(((Integer)var3.getValue()).intValue());
      }

   }

   public String b() {
      return String.format("count=%d", new Object[]{Integer.valueOf(this.a.size())});
   }
}
