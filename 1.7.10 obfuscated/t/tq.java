import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class tq extends tl {

   private final Set d = Sets.newHashSet();
   protected final Map c = new py();


   public tn c(th var1) {
      return (tn)super.a(var1);
   }

   public tn b(String var1) {
      ti var2 = super.a(var1);
      if(var2 == null) {
         var2 = (ti)this.c.get(var1);
      }

      return (tn)var2;
   }

   public ti b(th var1) {
      if(this.b.containsKey(var1.a())) {
         throw new IllegalArgumentException("Attribute is already registered!");
      } else {
         tn var2 = new tn(this, var1);
         this.b.put(var1.a(), var2);
         if(var1 instanceof to && ((to)var1).f() != null) {
            this.c.put(((to)var1).f(), var2);
         }

         this.a.put(var1, var2);
         return var2;
      }
   }

   public void a(tn var1) {
      if(var1.a().c()) {
         this.d.add(var1);
      }

   }

   public Set b() {
      return this.d;
   }

   public Collection c() {
      HashSet var1 = Sets.newHashSet();
      Iterator var2 = this.a().iterator();

      while(var2.hasNext()) {
         ti var3 = (ti)var2.next();
         if(var3.a().c()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   public ti a(String var1) {
      return this.b(var1);
   }

   // $FF: synthetic method
   public ti a(th var1) {
      return this.c(var1);
   }
}
