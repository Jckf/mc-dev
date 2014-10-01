import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class afv {

   private static final Random a = new Random();
   private static final agb b = new agb((afw)null);
   private static final aga c = new aga((afw)null);
   private static final afy d = new afy((afw)null);
   private static final afx e = new afx((afw)null);


   public static int a(int var0, add var1) {
      if(var1 == null) {
         return 0;
      } else {
         dq var2 = var1.r();
         if(var2 == null) {
            return 0;
         } else {
            for(int var3 = 0; var3 < var2.c(); ++var3) {
               short var4 = var2.b(var3).e("id");
               short var5 = var2.b(var3).e("lvl");
               if(var4 == var0) {
                  return var5;
               }
            }

            return 0;
         }
      }
   }

   public static Map a(add var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      dq var2 = var0.b() == ade.bR?ade.bR.g(var0):var0.r();
      if(var2 != null) {
         for(int var3 = 0; var3 < var2.c(); ++var3) {
            short var4 = var2.b(var3).e("id");
            short var5 = var2.b(var3).e("lvl");
            var1.put(Integer.valueOf(var4), Integer.valueOf(var5));
         }
      }

      return var1;
   }

   public static void a(Map var0, add var1) {
      dq var2 = new dq();
      Iterator var3 = var0.keySet().iterator();

      while(var3.hasNext()) {
         int var4 = ((Integer)var3.next()).intValue();
         dh var5 = new dh();
         var5.a("id", (short)var4);
         var5.a("lvl", (short)((Integer)var0.get(Integer.valueOf(var4))).intValue());
         var2.a((dy)var5);
         if(var1.b() == ade.bR) {
            ade.bR.a(var1, new agc(var4, ((Integer)var0.get(Integer.valueOf(var4))).intValue()));
         }
      }

      if(var2.c() > 0) {
         if(var1.b() != ade.bR) {
            var1.a("ench", (dy)var2);
         }
      } else if(var1.p()) {
         var1.q().o("ench");
      }

   }

   public static int a(int var0, add[] var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         add[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            add var6 = var3[var5];
            int var7 = a(var0, var6);
            if(var7 > var2) {
               var2 = var7;
            }
         }

         return var2;
      }
   }

   private static void a(afz var0, add var1) {
      if(var1 != null) {
         dq var2 = var1.r();
         if(var2 != null) {
            for(int var3 = 0; var3 < var2.c(); ++var3) {
               short var4 = var2.b(var3).e("id");
               short var5 = var2.b(var3).e("lvl");
               if(aft.b[var4] != null) {
                  var0.a(aft.b[var4], var5);
               }
            }

         }
      }
   }

   private static void a(afz var0, add[] var1) {
      add[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         add var5 = var2[var4];
         a(var0, var5);
      }

   }

   public static int a(add[] var0, ro var1) {
      b.a = 0;
      b.b = var1;
      a((afz)b, var0);
      if(b.a > 25) {
         b.a = 25;
      }

      return (b.a + 1 >> 1) + a.nextInt((b.a >> 1) + 1);
   }

   public static float a(sv var0, sv var1) {
      return a(var0.be(), var1.bd());
   }

   public static float a(add var0, sz var1) {
      c.a = 0.0F;
      c.b = var1;
      a((afz)c, var0);
      return c.a;
   }

   public static void a(sv var0, sa var1) {
      d.b = var1;
      d.a = var0;
      a((afz)d, var0.ak());
      if(var1 instanceof yz) {
         a((afz)d, var0.be());
      }

   }

   public static void b(sv var0, sa var1) {
      e.a = var0;
      e.b = var1;
      a((afz)e, var0.ak());
      if(var0 instanceof yz) {
         a((afz)e, var0.be());
      }

   }

   public static int b(sv var0, sv var1) {
      return a(aft.o.B, var0.be());
   }

   public static int a(sv var0) {
      return a(aft.p.B, var0.be());
   }

   public static int b(sv var0) {
      return a(aft.i.B, var0.ak());
   }

   public static int c(sv var0) {
      return a(aft.r.B, var0.be());
   }

   public static boolean e(sv var0) {
      return a(aft.s.B, var0.be()) > 0;
   }

   public static int f(sv var0) {
      return a(aft.u.B, var0.be());
   }

   public static int g(sv var0) {
      return a(aft.z.B, var0.be());
   }

   public static int h(sv var0) {
      return a(aft.A.B, var0.be());
   }

   public static int i(sv var0) {
      return a(aft.q.B, var0.be());
   }

   public static boolean j(sv var0) {
      return a(aft.j.B, var0.ak()) > 0;
   }

   public static add a(aft var0, sv var1) {
      add[] var2 = var1.ak();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         add var5 = var2[var4];
         if(var5 != null && a(var0.B, var5) > 0) {
            return var5;
         }
      }

      return null;
   }

   public static int a(Random var0, int var1, int var2, add var3) {
      adb var4 = var3.b();
      int var5 = var4.c();
      if(var5 <= 0) {
         return 0;
      } else {
         if(var2 > 15) {
            var2 = 15;
         }

         int var6 = var0.nextInt(8) + 1 + (var2 >> 1) + var0.nextInt(var2 + 1);
         return var1 == 0?Math.max(var6 / 3, 1):(var1 == 1?var6 * 2 / 3 + 1:Math.max(var6, var2 * 2));
      }
   }

   public static add a(Random var0, add var1, int var2) {
      List var3 = b(var0, var1, var2);
      boolean var4 = var1.b() == ade.aG;
      if(var4) {
         var1.a((adb)ade.bR);
      }

      if(var3 != null) {
         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            agc var6 = (agc)var5.next();
            if(var4) {
               ade.bR.a(var1, var6);
            } else {
               var1.a(var6.b, var6.c);
            }
         }
      }

      return var1;
   }

   public static List b(Random var0, add var1, int var2) {
      adb var3 = var1.b();
      int var4 = var3.c();
      if(var4 <= 0) {
         return null;
      } else {
         var4 /= 2;
         var4 = 1 + var0.nextInt((var4 >> 1) + 1) + var0.nextInt((var4 >> 1) + 1);
         int var5 = var4 + var2;
         float var6 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         int var7 = (int)((float)var5 * (1.0F + var6) + 0.5F);
         if(var7 < 1) {
            var7 = 1;
         }

         ArrayList var8 = null;
         Map var9 = b(var7, var1);
         if(var9 != null && !var9.isEmpty()) {
            agc var10 = (agc)qv.a(var0, var9.values());
            if(var10 != null) {
               var8 = new ArrayList();
               var8.add(var10);

               for(int var11 = var7; var0.nextInt(50) <= var11; var11 >>= 1) {
                  Iterator var12 = var9.keySet().iterator();

                  while(var12.hasNext()) {
                     Integer var13 = (Integer)var12.next();
                     boolean var14 = true;
                     Iterator var15 = var8.iterator();

                     while(true) {
                        if(var15.hasNext()) {
                           agc var16 = (agc)var15.next();
                           if(var16.b.a(aft.b[var13.intValue()])) {
                              continue;
                           }

                           var14 = false;
                        }

                        if(!var14) {
                           var12.remove();
                        }
                        break;
                     }
                  }

                  if(!var9.isEmpty()) {
                     agc var17 = (agc)qv.a(var0, var9.values());
                     var8.add(var17);
                  }
               }
            }
         }

         return var8;
      }
   }

   public static Map b(int var0, add var1) {
      adb var2 = var1.b();
      HashMap var3 = null;
      boolean var4 = var1.b() == ade.aG;
      aft[] var5 = aft.b;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         aft var8 = var5[var7];
         if(var8 != null && (var8.C.a(var2) || var4)) {
            for(int var9 = var8.d(); var9 <= var8.b(); ++var9) {
               if(var0 >= var8.a(var9) && var0 <= var8.b(var9)) {
                  if(var3 == null) {
                     var3 = new HashMap();
                  }

                  var3.put(Integer.valueOf(var8.B), new agc(var8, var9));
               }
            }
         }
      }

      return var3;
   }

}
