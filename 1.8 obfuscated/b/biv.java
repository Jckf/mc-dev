import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class biv {

   private final List a = Lists.newArrayList();
   private final Map b = Maps.newHashMap();
   private int c;


   public int a() {
      return this.c;
   }

   public void a(int var1) {
      this.c = var1;
   }

   public Map b() {
      return this.b;
   }

   public List c() {
      return this.a;
   }

   public void d() {
      int var1 = 0;

      biw var3;
      for(Iterator var2 = this.a.iterator(); var2.hasNext(); var1 += var3.b()) {
         var3 = (biw)var2.next();
         var3.b(var1);
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(3);
      var1.append(";");

      int var2;
      for(var2 = 0; var2 < this.a.size(); ++var2) {
         if(var2 > 0) {
            var1.append(",");
         }

         var1.append(((biw)this.a.get(var2)).toString());
      }

      var1.append(";");
      var1.append(this.c);
      if(!this.b.isEmpty()) {
         var1.append(";");
         var2 = 0;
         Iterator var3 = this.b.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            if(var2++ > 0) {
               var1.append(",");
            }

            var1.append(((String)var4.getKey()).toLowerCase());
            Map var5 = (Map)var4.getValue();
            if(!var5.isEmpty()) {
               var1.append("(");
               int var6 = 0;
               Iterator var7 = var5.entrySet().iterator();

               while(var7.hasNext()) {
                  Entry var8 = (Entry)var7.next();
                  if(var6++ > 0) {
                     var1.append(" ");
                  }

                  var1.append((String)var8.getKey());
                  var1.append("=");
                  var1.append((String)var8.getValue());
               }

               var1.append(")");
            }
         }
      } else {
         var1.append(";");
      }

      return var1.toString();
   }

   private static biw a(int var0, String var1, int var2) {
      String[] var3 = var0 >= 3?var1.split("\\*", 2):var1.split("x", 2);
      int var4 = 1;
      int var5 = 0;
      if(var3.length == 2) {
         try {
            var4 = Integer.parseInt(var3[0]);
            if(var2 + var4 >= 256) {
               var4 = 256 - var2;
            }

            if(var4 < 0) {
               var4 = 0;
            }
         } catch (Throwable var8) {
            return null;
         }
      }

      atr var6 = null;

      try {
         String var7 = var3[var3.length - 1];
         if(var0 < 3) {
            var3 = var7.split(":", 2);
            if(var3.length > 1) {
               var5 = Integer.parseInt(var3[1]);
            }

            var6 = atr.c(Integer.parseInt(var3[0]));
         } else {
            var3 = var7.split(":", 3);
            var6 = var3.length > 1?atr.b(var3[0] + ":" + var3[1]):null;
            if(var6 != null) {
               var5 = var3.length > 2?Integer.parseInt(var3[2]):0;
            } else {
               var6 = atr.b(var3[0]);
               if(var6 != null) {
                  var5 = var3.length > 1?Integer.parseInt(var3[1]):0;
               }
            }

            if(var6 == null) {
               return null;
            }
         }

         if(var6 == aty.a) {
            var5 = 0;
         }

         if(var5 < 0 || var5 > 15) {
            var5 = 0;
         }
      } catch (Throwable var9) {
         return null;
      }

      biw var10 = new biw(var0, var4, var6, var5);
      var10.b(var2);
      return var10;
   }

   private static List a(int var0, String var1) {
      if(var1 != null && var1.length() >= 1) {
         ArrayList var2 = Lists.newArrayList();
         String[] var3 = var1.split(",");
         int var4 = 0;
         String[] var5 = var3;
         int var6 = var3.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            biw var9 = a(var0, var8, var4);
            if(var9 == null) {
               return null;
            }

            var2.add(var9);
            var4 += var9.b();
         }

         return var2;
      } else {
         return null;
      }
   }

   public static biv a(String var0) {
      if(var0 == null) {
         return e();
      } else {
         String[] var1 = var0.split(";", -1);
         int var2 = var1.length == 1?0:uv.a(var1[0], 0);
         if(var2 >= 0 && var2 <= 3) {
            biv var3 = new biv();
            int var4 = var1.length == 1?0:1;
            List var5 = a(var2, var1[var4++]);
            if(var5 != null && !var5.isEmpty()) {
               var3.c().addAll(var5);
               var3.d();
               int var6 = arm.q.az;
               if(var2 > 0 && var1.length > var4) {
                  var6 = uv.a(var1[var4++], var6);
               }

               var3.a(var6);
               if(var2 > 0 && var1.length > var4) {
                  String[] var7 = var1[var4++].toLowerCase().split(",");
                  String[] var8 = var7;
                  int var9 = var7.length;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     String var11 = var8[var10];
                     String[] var12 = var11.split("\\(", 2);
                     HashMap var13 = Maps.newHashMap();
                     if(var12[0].length() > 0) {
                        var3.b().put(var12[0], var13);
                        if(var12.length > 1 && var12[1].endsWith(")") && var12[1].length() > 1) {
                           String[] var14 = var12[1].substring(0, var12[1].length() - 1).split(" ");

                           for(int var15 = 0; var15 < var14.length; ++var15) {
                              String[] var16 = var14[var15].split("=", 2);
                              if(var16.length == 2) {
                                 var13.put(var16[0], var16[1]);
                              }
                           }
                        }
                     }
                  }
               } else {
                  var3.b().put("village", Maps.newHashMap());
               }

               return var3;
            } else {
               return e();
            }
         } else {
            return e();
         }
      }
   }

   public static biv e() {
      biv var0 = new biv();
      var0.a(arm.q.az);
      var0.c().add(new biw(1, aty.h));
      var0.c().add(new biw(2, aty.d));
      var0.c().add(new biw(1, aty.c));
      var0.d();
      var0.b().put("village", Maps.newHashMap());
      return var0;
   }
}
