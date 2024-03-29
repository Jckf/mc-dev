import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bsd {

   private final Map a = Maps.newHashMap();
   private final Map b = Maps.newHashMap();
   private final Map c = Maps.newHashMap();
   private final bry[] d = new bry[19];
   private final Map e = Maps.newHashMap();
   private final Map f = Maps.newHashMap();
   private static String[] g = null;


   public bry b(String var1) {
      return (bry)this.a.get(var1);
   }

   public bry a(String var1, bsk var2) {
      bry var3 = this.b(var1);
      if(var3 != null) {
         throw new IllegalArgumentException("An objective with the name \'" + var1 + "\' already exists!");
      } else {
         var3 = new bry(this, var1, var2);
         Object var4 = (List)this.b.get(var2);
         if(var4 == null) {
            var4 = Lists.newArrayList();
            this.b.put(var2, var4);
         }

         ((List)var4).add(var3);
         this.a.put(var1, var3);
         this.a(var3);
         return var3;
      }
   }

   public Collection a(bsk var1) {
      Collection var2 = (Collection)this.b.get(var1);
      return var2 == null?Lists.newArrayList():Lists.newArrayList((Iterable)var2);
   }

   public boolean b(String var1, bry var2) {
      Map var3 = (Map)this.c.get(var1);
      if(var3 == null) {
         return false;
      } else {
         bsa var4 = (bsa)var3.get(var2);
         return var4 != null;
      }
   }

   public bsa c(String var1, bry var2) {
      Object var3 = (Map)this.c.get(var1);
      if(var3 == null) {
         var3 = Maps.newHashMap();
         this.c.put(var1, var3);
      }

      bsa var4 = (bsa)((Map)var3).get(var2);
      if(var4 == null) {
         var4 = new bsa(this, var2, var1);
         ((Map)var3).put(var2, var4);
      }

      return var4;
   }

   public Collection i(bry var1) {
      ArrayList var2 = Lists.newArrayList();
      Iterator var3 = this.c.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         bsa var5 = (bsa)var4.get(var1);
         if(var5 != null) {
            var2.add(var5);
         }
      }

      Collections.sort(var2, bsa.a);
      return var2;
   }

   public Collection c() {
      return this.a.values();
   }

   public Collection d() {
      return this.c.keySet();
   }

   public void d(String var1, bry var2) {
      Map var3;
      if(var2 == null) {
         var3 = (Map)this.c.remove(var1);
         if(var3 != null) {
            this.a(var1);
         }
      } else {
         var3 = (Map)this.c.get(var1);
         if(var3 != null) {
            bsa var4 = (bsa)var3.remove(var2);
            if(var3.size() < 1) {
               Map var5 = (Map)this.c.remove(var1);
               if(var5 != null) {
                  this.a(var1);
               }
            } else if(var4 != null) {
               this.a(var1, var2);
            }
         }
      }

   }

   public Collection e() {
      Collection var1 = this.c.values();
      ArrayList var2 = Lists.newArrayList();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         var2.addAll(var4.values());
      }

      return var2;
   }

   public Map c(String var1) {
      Object var2 = (Map)this.c.get(var1);
      if(var2 == null) {
         var2 = Maps.newHashMap();
      }

      return (Map)var2;
   }

   public void k(bry var1) {
      this.a.remove(var1.b());

      for(int var2 = 0; var2 < 19; ++var2) {
         if(this.a(var2) == var1) {
            this.a(var2, (bry)null);
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

   public void a(int var1, bry var2) {
      this.d[var1] = var2;
   }

   public bry a(int var1) {
      return this.d[var1];
   }

   public brz d(String var1) {
      return (brz)this.e.get(var1);
   }

   public brz e(String var1) {
      brz var2 = this.d(var1);
      if(var2 != null) {
         throw new IllegalArgumentException("A team with the name \'" + var1 + "\' already exists!");
      } else {
         var2 = new brz(this, var1);
         this.e.put(var1, var2);
         this.a(var2);
         return var2;
      }
   }

   public void d(brz var1) {
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
         brz var3 = this.d(var2);
         if(this.h(var1) != null) {
            this.f(var1);
         }

         this.f.put(var1, var3);
         var3.d().add(var1);
         return true;
      }
   }

   public boolean f(String var1) {
      brz var2 = this.h(var1);
      if(var2 != null) {
         this.a(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public void a(String var1, brz var2) {
      if(this.h(var1) != var2) {
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

   public brz h(String var1) {
      return (brz)this.f.get(var1);
   }

   public void a(bry var1) {}

   public void b(bry var1) {}

   public void c(bry var1) {}

   public void a(bsa var1) {}

   public void a(String var1) {}

   public void a(String var1, bry var2) {}

   public void a(brz var1) {}

   public void b(brz var1) {}

   public void c(brz var1) {}

   public static String b(int var0) {
      switch(var0) {
      case 0:
         return "list";
      case 1:
         return "sidebar";
      case 2:
         return "belowName";
      default:
         if(var0 >= 3 && var0 <= 18) {
            a var1 = a.a(var0 - 3);
            if(var1 != null && var1 != a.v) {
               return "sidebar.team." + var1.e();
            }
         }

         return null;
      }
   }

   public static int i(String var0) {
      if(var0.equalsIgnoreCase("list")) {
         return 0;
      } else if(var0.equalsIgnoreCase("sidebar")) {
         return 1;
      } else if(var0.equalsIgnoreCase("belowName")) {
         return 2;
      } else {
         if(var0.startsWith("sidebar.team.")) {
            String var1 = var0.substring("sidebar.team.".length());
            a var2 = a.b(var1);
            if(var2 != null && var2.b() >= 0) {
               return var2.b() + 3;
            }
         }

         return -1;
      }
   }

   public static String[] h() {
      if(g == null) {
         g = new String[19];

         for(int var0 = 0; var0 < 19; ++var0) {
            g[var0] = b(var0);
         }
      }

      return g;
   }

}
