import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class adp extends adb {

   private HashMap a = new HashMap();
   private static final Map b = new LinkedHashMap();


   public adp() {
      this.e(1);
      this.a(true);
      this.f(0);
      this.a(abt.k);
   }

   public List g(add var1) {
      if(var1.p() && var1.q().b("CustomPotionEffects", 9)) {
         ArrayList var7 = new ArrayList();
         dq var3 = var1.q().c("CustomPotionEffects", 10);

         for(int var4 = 0; var4 < var3.c(); ++var4) {
            dh var5 = var3.b(var4);
            rw var6 = rw.b(var5);
            if(var6 != null) {
               var7.add(var6);
            }
         }

         return var7;
      } else {
         List var2 = (List)this.a.get(Integer.valueOf(var1.k()));
         if(var2 == null) {
            var2 = aen.b(var1.k(), false);
            this.a.put(Integer.valueOf(var1.k()), var2);
         }

         return var2;
      }
   }

   public List c(int var1) {
      List var2 = (List)this.a.get(Integer.valueOf(var1));
      if(var2 == null) {
         var2 = aen.b(var1, false);
         this.a.put(Integer.valueOf(var1), var2);
      }

      return var2;
   }

   public add b(add var1, ahb var2, yz var3) {
      if(!var3.bE.d) {
         --var1.b;
      }

      if(!var2.E) {
         List var4 = this.g(var1);
         if(var4 != null) {
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               rw var6 = (rw)var5.next();
               var3.c(new rw(var6));
            }
         }
      }

      if(!var3.bE.d) {
         if(var1.b <= 0) {
            return new add(ade.bo);
         }

         var3.bm.a(new add(ade.bo));
      }

      return var1;
   }

   public int d_(add var1) {
      return 32;
   }

   public aei d(add var1) {
      return aei.c;
   }

   public add a(add var1, ahb var2, yz var3) {
      if(g(var1.k())) {
         if(!var3.bE.d) {
            --var1.b;
         }

         var2.a((sa)var3, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
         if(!var2.E) {
            var2.d((sa)(new zo(var2, var3, var1)));
         }

         return var1;
      } else {
         var3.a(var1, this.d_(var1));
         return var1;
      }
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   public static boolean g(int var0) {
      return (var0 & 16384) != 0;
   }

   public String n(add var1) {
      if(var1.k() == 0) {
         return dd.a("item.emptyPotion.name").trim();
      } else {
         String var2 = "";
         if(g(var1.k())) {
            var2 = dd.a("potion.prefix.grenade").trim() + " ";
         }

         List var3 = ade.bn.g(var1);
         String var4;
         if(var3 != null && !var3.isEmpty()) {
            var4 = ((rw)var3.get(0)).f();
            var4 = var4 + ".postfix";
            return var2 + dd.a(var4).trim();
         } else {
            var4 = aen.c(var1.k());
            return dd.a(var4).trim() + " " + super.n(var1);
         }
      }
   }

}
