import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class atx extends ave {

   private static List e = Arrays.asList(new ahu[]{ahu.q, ahu.F, ahu.J, ahu.K, ahu.u});
   private List f;
   private int g;
   private int h;


   public atx() {
      this.f = new ArrayList();
      this.g = 32;
      this.h = 8;
      this.f.add(new ahx(yp.class, 1, 1, 1));
   }

   public atx(Map var1) {
      this();
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(((String)var3.getKey()).equals("distance")) {
            this.g = qh.a((String)var3.getValue(), this.g, this.h + 1);
         }
      }

   }

   public String a() {
      return "Temple";
   }

   protected boolean a(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      if(var1 < 0) {
         var1 -= this.g - 1;
      }

      if(var2 < 0) {
         var2 -= this.g - 1;
      }

      int var5 = var1 / this.g;
      int var6 = var2 / this.g;
      Random var7 = this.c.A(var5, var6, 14357617);
      var5 *= this.g;
      var6 *= this.g;
      var5 += var7.nextInt(this.g - this.h);
      var6 += var7.nextInt(this.g - this.h);
      if(var3 == var5 && var4 == var6) {
         ahu var8 = this.c.v().a(var3 * 16 + 8, var4 * 16 + 8);
         Iterator var9 = e.iterator();

         while(var9.hasNext()) {
            ahu var10 = (ahu)var9.next();
            if(var8 == var10) {
               return true;
            }
         }
      }

      return false;
   }

   protected avm b(int var1, int var2) {
      return new aty(this.c, this.b, var1, var2);
   }

   public boolean a(int var1, int var2, int var3) {
      avm var4 = this.c(var1, var2, var3);
      if(var4 != null && var4 instanceof aty && !var4.a.isEmpty()) {
         avk var5 = (avk)var4.a.getFirst();
         return var5 instanceof auf;
      } else {
         return false;
      }
   }

   public List b() {
      return this.f;
   }

}
