import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class z implements ab {

   private static final Logger a = LogManager.getLogger();
   private final Map b = new HashMap();
   private final Set c = new HashSet();


   public int a(ac var1, String var2) {
      var2 = var2.trim();
      if(var2.startsWith("/")) {
         var2 = var2.substring(1);
      }

      String[] var3 = var2.split(" ");
      String var4 = var3[0];
      var3 = a(var3);
      aa var5 = (aa)this.b.get(var4);
      int var6 = this.a(var5, var3);
      int var7 = 0;

      fr var9;
      try {
         if(var5 == null) {
            throw new ch();
         }

         if(var5.a(var1)) {
            if(var6 > -1) {
               mw[] var8 = ad.c(var1, var3[var6]);
               String var22 = var3[var6];
               mw[] var10 = var8;
               int var11 = var8.length;

               for(int var12 = 0; var12 < var11; ++var12) {
                  mw var13 = var10[var12];
                  var3[var6] = var13.b_();

                  try {
                     var5.b(var1, var3);
                     ++var7;
                  } catch (cd var17) {
                     fr var15 = new fr(var17.getMessage(), var17.a());
                     var15.b().a(a.m);
                     var1.a(var15);
                  }
               }

               var3[var6] = var22;
            } else {
               try {
                  var5.b(var1, var3);
                  ++var7;
               } catch (cd var16) {
                  var9 = new fr(var16.getMessage(), var16.a());
                  var9.b().a(a.m);
                  var1.a(var9);
               }
            }
         } else {
            fr var21 = new fr("commands.generic.permission", new Object[0]);
            var21.b().a(a.m);
            var1.a(var21);
         }
      } catch (ci var18) {
         var9 = new fr("commands.generic.usage", new Object[]{new fr(var18.getMessage(), var18.a())});
         var9.b().a(a.m);
         var1.a(var9);
      } catch (cd var19) {
         var9 = new fr(var19.getMessage(), var19.a());
         var9.b().a(a.m);
         var1.a(var9);
      } catch (Throwable var20) {
         var9 = new fr("commands.generic.exception", new Object[0]);
         var9.b().a(a.m);
         var1.a(var9);
         a.error("Couldn\'t process command: \'" + var2 + "\'", var20);
      }

      return var7;
   }

   public aa a(aa var1) {
      List var2 = var1.b();
      this.b.put(var1.c(), var1);
      this.c.add(var1);
      if(var2 != null) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            aa var5 = (aa)this.b.get(var4);
            if(var5 == null || !var5.c().equals(var4)) {
               this.b.put(var4, var1);
            }
         }
      }

      return var1;
   }

   private static String[] a(String[] var0) {
      String[] var1 = new String[var0.length - 1];

      for(int var2 = 1; var2 < var0.length; ++var2) {
         var1[var2 - 1] = var0[var2];
      }

      return var1;
   }

   public List b(ac var1, String var2) {
      String[] var3 = var2.split(" ", -1);
      String var4 = var3[0];
      if(var3.length == 1) {
         ArrayList var8 = new ArrayList();
         Iterator var6 = this.b.entrySet().iterator();

         while(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            if(y.a(var4, (String)var7.getKey()) && ((aa)var7.getValue()).a(var1)) {
               var8.add(var7.getKey());
            }
         }

         return var8;
      } else {
         if(var3.length > 1) {
            aa var5 = (aa)this.b.get(var4);
            if(var5 != null) {
               return var5.a(var1, a(var3));
            }
         }

         return null;
      }
   }

   public List a(ac var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.c.iterator();

      while(var3.hasNext()) {
         aa var4 = (aa)var3.next();
         if(var4.a(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public Map a() {
      return this.b;
   }

   private int a(aa var1, String[] var2) {
      if(var1 == null) {
         return -1;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if(var1.a(var2, var3) && ad.a(var2[var3])) {
               return var3;
            }
         }

         return -1;
      }
   }

}
