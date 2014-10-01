import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class aho {

   private HashMap a = new HashMap();


   protected static agt a(ahb var0, int var1, int var2) {
      apx var3 = var0.e(var1, var2);
      int var4 = var1 * 16 + var0.s.nextInt(16);
      int var5 = var2 * 16 + var0.s.nextInt(16);
      int var6 = var0.s.nextInt(var3 == null?var0.S():var3.h() + 16 - 1);
      return new agt(var4, var6, var5);
   }

   public int a(mt var1, boolean var2, boolean var3, boolean var4) {
      if(!var2 && !var3) {
         return 0;
      } else {
         this.a.clear();

         int var5;
         int var8;
         for(var5 = 0; var5 < var1.h.size(); ++var5) {
            yz var6 = (yz)var1.h.get(var5);
            int var7 = qh.c(var6.s / 16.0D);
            var8 = qh.c(var6.u / 16.0D);
            byte var9 = 8;

            for(int var10 = -var9; var10 <= var9; ++var10) {
               for(int var11 = -var9; var11 <= var9; ++var11) {
                  boolean var12 = var10 == -var9 || var10 == var9 || var11 == -var9 || var11 == var9;
                  agu var13 = new agu(var10 + var7, var11 + var8);
                  if(!var12) {
                     this.a.put(var13, Boolean.valueOf(false));
                  } else if(!this.a.containsKey(var13)) {
                     this.a.put(var13, Boolean.valueOf(true));
                  }
               }
            }
         }

         var5 = 0;
         r var34 = var1.K();
         sx[] var35 = sx.values();
         var8 = var35.length;

         for(int var36 = 0; var36 < var8; ++var36) {
            sx var37 = var35[var36];
            if((!var37.d() || var3) && (var37.d() || var2) && (!var37.e() || var4) && var1.a(var37.a()) <= var37.b() * this.a.size() / 256) {
               Iterator var38 = this.a.keySet().iterator();

               label110:
               while(var38.hasNext()) {
                  agu var39 = (agu)var38.next();
                  if(!((Boolean)this.a.get(var39)).booleanValue()) {
                     agt var40 = a(var1, var39.a, var39.b);
                     int var14 = var40.a;
                     int var15 = var40.b;
                     int var16 = var40.c;
                     if(!var1.a(var14, var15, var16).r() && var1.a(var14, var15, var16).o() == var37.c()) {
                        int var17 = 0;
                        int var18 = 0;

                        while(var18 < 3) {
                           int var19 = var14;
                           int var20 = var15;
                           int var21 = var16;
                           byte var22 = 6;
                           ahx var23 = null;
                           sy var24 = null;
                           int var25 = 0;

                           while(true) {
                              if(var25 < 4) {
                                 label103: {
                                    var19 += var1.s.nextInt(var22) - var1.s.nextInt(var22);
                                    var20 += var1.s.nextInt(1) - var1.s.nextInt(1);
                                    var21 += var1.s.nextInt(var22) - var1.s.nextInt(var22);
                                    if(a(var37, var1, var19, var20, var21)) {
                                       float var26 = (float)var19 + 0.5F;
                                       float var27 = (float)var20;
                                       float var28 = (float)var21 + 0.5F;
                                       if(var1.a((double)var26, (double)var27, (double)var28, 24.0D) == null) {
                                          float var29 = var26 - (float)var34.a;
                                          float var30 = var27 - (float)var34.b;
                                          float var31 = var28 - (float)var34.c;
                                          float var32 = var29 * var29 + var30 * var30 + var31 * var31;
                                          if(var32 >= 576.0F) {
                                             if(var23 == null) {
                                                var23 = var1.a(var37, var19, var20, var21);
                                                if(var23 == null) {
                                                   break label103;
                                                }
                                             }

                                             sw var41;
                                             try {
                                                var41 = (sw)var23.b.getConstructor(new Class[]{ahb.class}).newInstance(new Object[]{var1});
                                             } catch (Exception var33) {
                                                var33.printStackTrace();
                                                return var5;
                                             }

                                             var41.b((double)var26, (double)var27, (double)var28, var1.s.nextFloat() * 360.0F, 0.0F);
                                             if(var41.by()) {
                                                ++var17;
                                                var1.d(var41);
                                                var24 = var41.a(var24);
                                                if(var17 >= var41.bB()) {
                                                   continue label110;
                                                }
                                             }

                                             var5 += var17;
                                          }
                                       }
                                    }

                                    ++var25;
                                    continue;
                                 }
                              }

                              ++var18;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         return var5;
      }
   }

   public static boolean a(sx var0, ahb var1, int var2, int var3, int var4) {
      if(var0.c() == awt.h) {
         return var1.a(var2, var3, var4).o().d() && var1.a(var2, var3 - 1, var4).o().d() && !var1.a(var2, var3 + 1, var4).r();
      } else if(!ahb.a((ahl)var1, var2, var3 - 1, var4)) {
         return false;
      } else {
         aji var5 = var1.a(var2, var3 - 1, var4);
         return var5 != ajn.h && !var1.a(var2, var3, var4).r() && !var1.a(var2, var3, var4).o().d() && !var1.a(var2, var3 + 1, var4).r();
      }
   }

   public static void a(ahb var0, ahu var1, int var2, int var3, int var4, int var5, Random var6) {
      List var7 = var1.a(sx.b);
      if(!var7.isEmpty()) {
         while(var6.nextFloat() < var1.g()) {
            ahx var8 = (ahx)qv.a(var0.s, (Collection)var7);
            sy var9 = null;
            int var10 = var8.c + var6.nextInt(1 + var8.d - var8.c);
            int var11 = var2 + var6.nextInt(var4);
            int var12 = var3 + var6.nextInt(var5);
            int var13 = var11;
            int var14 = var12;

            for(int var15 = 0; var15 < var10; ++var15) {
               boolean var16 = false;

               for(int var17 = 0; !var16 && var17 < 4; ++var17) {
                  int var18 = var0.i(var11, var12);
                  if(a(sx.b, var0, var11, var18, var12)) {
                     float var19 = (float)var11 + 0.5F;
                     float var20 = (float)var18;
                     float var21 = (float)var12 + 0.5F;

                     sw var22;
                     try {
                        var22 = (sw)var8.b.getConstructor(new Class[]{ahb.class}).newInstance(new Object[]{var0});
                     } catch (Exception var24) {
                        var24.printStackTrace();
                        continue;
                     }

                     var22.b((double)var19, (double)var20, (double)var21, var6.nextFloat() * 360.0F, 0.0F);
                     var0.d((sa)var22);
                     var9 = var22.a(var9);
                     var16 = true;
                  }

                  var11 += var6.nextInt(5) - var6.nextInt(5);

                  for(var12 += var6.nextInt(5) - var6.nextInt(5); var11 < var2 || var11 >= var2 + var4 || var12 < var3 || var12 >= var3 + var4; var12 = var14 + var6.nextInt(5) - var6.nextInt(5)) {
                     var11 = var13 + var6.nextInt(5) - var6.nextInt(5);
                  }
               }
            }
         }

      }
   }
}
