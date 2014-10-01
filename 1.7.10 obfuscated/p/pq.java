import com.google.common.collect.Maps;
import java.util.Map;

public class pq {

   protected final Map a = Maps.newConcurrentMap();


   public boolean a(pb var1) {
      return this.a((ph)var1) > 0;
   }

   public boolean b(pb var1) {
      return var1.c == null || this.a(var1.c);
   }

   public void b(yz var1, ph var2, int var3) {
      if(!var2.d() || this.b((pb)var2)) {
         this.a(var1, var2, this.a(var2) + var3);
      }
   }

   public void a(yz var1, ph var2, int var3) {
      pn var4 = (pn)this.a.get(var2);
      if(var4 == null) {
         var4 = new pn();
         this.a.put(var2, var4);
      }

      var4.a(var3);
   }

   public int a(ph var1) {
      pn var2 = (pn)this.a.get(var1);
      return var2 == null?0:var2.a();
   }

   public po b(ph var1) {
      pn var2 = (pn)this.a.get(var1);
      return var2 != null?var2.b():null;
   }

   public po a(ph var1, po var2) {
      pn var3 = (pn)this.a.get(var1);
      if(var3 == null) {
         var3 = new pn();
         this.a.put(var1, var3);
      }

      var3.a(var2);
      return var2;
   }
}
