import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bac {

   private final Map a = new HashMap();
   private final Map b = new HashMap();
   private final Map c = new HashMap();
   private final azx[] d = new azx[3];
   private final Map e = new HashMap();
   private final Map f = new HashMap();


   public azx b(String var1) {
      return (azx)this.a.get(var1);
   }

   public azx a(String var1, bah var2) {
      azx var3 = this.b(var1);
      if(var3 != null) {
         throw new IllegalArgumentException("An objective with the name \'" + var1 + "\' already exists!");
      } else {
         var3 = new azx(this, var1, var2);
         Object var4 = (List)this.b.get(var2);
         if(var4 == null) {
            var4 = new ArrayList();
            this.b.put(var2, var4);
         }

         ((List)var4).add(var3);
         this.a.put(var1, var3);
         this.a(var3);
         return var3;
      }
   }

   public Collection a(bah var1) {
      Collection var2 = (Collection)this.b.get(var1);
      return var2 == null?new ArrayList():new ArrayList(var2);
   }

   public azz a(String var1, azx var2) {
      Object var3 = (Map)this.c.get(var1);
      if(var3 == null) {
         var3 = new HashMap();
         this.c.put(var1, var3);
      }

      azz var4 = (azz)((Map)var3).get(var2);
      if(var4 == null) {
         var4 = new azz(this, var2, var1);
         ((Map)var3).put(var2, var4);
      }

      return var4;
   }

   public Collection i(azx var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.c.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         azz var5 = (azz)var4.get(var1);
         if(var5 != null) {
            var2.add(var5);
         }
      }

      Collections.sort(var2, azz.a);
      return var2;
   }

   public Collection c() {
      return this.a.values();
   }

   public Collection d() {
      return this.c.keySet();
   }

   public void c(String var1) {
      Map var2 = (Map)this.c.remove(var1);
      if(var2 != null) {
         this.a(var1);
      }

   }

   public Collection e() {
      Collection var1 = this.c.values();
      ArrayList var2 = new ArrayList();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         var2.addAll(var4.values());
      }

      return var2;
   }

   public Map d(String var1) {
      Object var2 = (Map)this.c.get(var1);
      if(var2 == null) {
         var2 = new HashMap();
      }

      return (Map)var2;
   }

   public void k(azx var1) {
      this.a.remove(var1.b());

      for(int var2 = 0; var2 < 3; ++var2) {
         if(this.a(var2) == var1) {
            this.a(var2, (azx)null);
         }
      }

      List var5 = (List)this.b.get(var1.c());
      if(var5 != null) {
         var5.remove(var1);
      }

      Iterator var3 = this.c.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         var4.remove(var1);
      }

      this.c(var1);
   }

   public void a(int var1, azx var2) {
      this.d[var1] = var2;
   }

   public azx a(int var1) {
      return this.d[var1];
   }

   public azy e(String var1) {
      return (azy)this.e.get(var1);
   }

   public azy f(String var1) {
      azy var2 = this.e(var1);
      if(var2 != null) {
         throw new IllegalArgumentException("A team with the name \'" + var1 + "\' already exists!");
      } else {
         var2 = new azy(this, var1);
         this.e.put(var1, var2);
         this.a(var2);
         return var2;
      }
   }

   public void d(azy var1) {
      this.e.remove(var1.b());
      Iterator var2 = var1.d().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.f.remove(var3);
      }

      this.c(var1);
   }

   public boolean a(String var1, String var2) {
      if(!this.e.containsKey(var2)) {
         return false;
      } else {
         azy var3 = this.e(var2);
         if(this.i(var1) != null) {
            this.g(var1);
         }

         this.f.put(var1, var3);
         var3.d().add(var1);
         return true;
      }
   }

   public boolean g(String var1) {
      azy var2 = this.i(var1);
      if(var2 != null) {
         this.a(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public void a(String var1, azy var2) {
      if(this.i(var1) != var2) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team \'" + var2.b() + "\'.");
      } else {
         this.f.remove(var1);
         var2.d().remove(var1);
      }
   }

   public Collection f() {
      return this.e.keySet();
   }

   public Collection g() {
      return this.e.values();
   }

   public azy i(String var1) {
      return (azy)this.f.get(var1);
   }

   public void a(azx var1) {}

   public void b(azx var1) {}

   public void c(azx var1) {}

   public void a(azz var1) {}

   public void a(String var1) {}

   public void a(azy var1) {}

   public void b(azy var1) {}

   public void c(azy var1) {}

   public static String b(int var0) {
      switch(var0) {
      case 0:
         return "list";
      case 1:
         return "sidebar";
      case 2:
         return "belowName";
      default:
         return null;
      }
   }

   public static int j(String var0) {
      return var0.equalsIgnoreCase("list")?0:(var0.equalsIgnoreCase("sidebar")?1:(var0.equalsIgnoreCase("belowName")?2:-1));
   }
}
