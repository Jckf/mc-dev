import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;

public class adh extends abs {

   protected adh() {
      this.a(true);
   }

   public ayi a(add var1, ahb var2) {
      String var3 = "map_" + var1.k();
      ayi var4 = (ayi)var2.a(ayi.class, var3);
      if(var4 == null && !var2.E) {
         var1.b(var2.b("map"));
         var3 = "map_" + var1.k();
         var4 = new ayi(var3);
         var4.d = 3;
         int var5 = 128 * (1 << var4.d);
         var4.a = Math.round((float)var2.N().c() / (float)var5) * var5;
         var4.b = Math.round((float)(var2.N().e() / var5)) * var5;
         var4.c = (byte)var2.t.i;
         var4.c();
         var2.a(var3, (ayl)var4);
      }

      return var4;
   }

   public void a(ahb var1, sa var2, ayi var3) {
      if(var1.t.i == var3.c && var2 instanceof yz) {
         int var4 = 1 << var3.d;
         int var5 = var3.a;
         int var6 = var3.b;
         int var7 = qh.c(var2.s - (double)var5) / var4 + 64;
         int var8 = qh.c(var2.u - (double)var6) / var4 + 64;
         int var9 = 128 / var4;
         if(var1.t.g) {
            var9 /= 2;
         }

         ayj var10 = var3.a((yz)var2);
         ++var10.d;

         for(int var11 = var7 - var9 + 1; var11 < var7 + var9; ++var11) {
            if((var11 & 15) == (var10.d & 15)) {
               int var12 = 255;
               int var13 = 0;
               double var14 = 0.0D;

               for(int var16 = var8 - var9 - 1; var16 < var8 + var9; ++var16) {
                  if(var11 >= 0 && var16 >= -1 && var11 < 128 && var16 < 128) {
                     int var17 = var11 - var7;
                     int var18 = var16 - var8;
                     boolean var19 = var17 * var17 + var18 * var18 > (var9 - 2) * (var9 - 2);
                     int var20 = (var5 / var4 + var11 - 64) * var4;
                     int var21 = (var6 / var4 + var16 - 64) * var4;
                     HashMultiset var22 = HashMultiset.create();
                     apx var23 = var1.d(var20, var21);
                     if(!var23.g()) {
                        int var24 = var20 & 15;
                        int var25 = var21 & 15;
                        int var26 = 0;
                        double var27 = 0.0D;
                        int var29;
                        if(var1.t.g) {
                           var29 = var20 + var21 * 231871;
                           var29 = var29 * var29 * 31287121 + var29 * 11;
                           if((var29 >> 20 & 1) == 0) {
                              var22.add(ajn.d.f(0), 10);
                           } else {
                              var22.add(ajn.b.f(0), 100);
                           }

                           var27 = 100.0D;
                        } else {
                           for(var29 = 0; var29 < var4; ++var29) {
                              for(int var30 = 0; var30 < var4; ++var30) {
                                 int var31 = var23.b(var29 + var24, var30 + var25) + 1;
                                 aji var32 = ajn.a;
                                 int var33 = 0;
                                 if(var31 > 1) {
                                    do {
                                       --var31;
                                       var32 = var23.a(var29 + var24, var31, var30 + var25);
                                       var33 = var23.c(var29 + var24, var31, var30 + var25);
                                    } while(var32.f(var33) == awv.b && var31 > 0);

                                    if(var31 > 0 && var32.o().d()) {
                                       int var34 = var31 - 1;

                                       aji var35;
                                       do {
                                          var35 = var23.a(var29 + var24, var34--, var30 + var25);
                                          ++var26;
                                       } while(var34 > 0 && var35.o().d());
                                    }
                                 }

                                 var27 += (double)var31 / (double)(var4 * var4);
                                 var22.add(var32.f(var33));
                              }
                           }
                        }

                        var26 /= var4 * var4;
                        double var36 = (var27 - var14) * 4.0D / (double)(var4 + 4) + ((double)(var11 + var16 & 1) - 0.5D) * 0.4D;
                        byte var37 = 1;
                        if(var36 > 0.6D) {
                           var37 = 2;
                        }

                        if(var36 < -0.6D) {
                           var37 = 0;
                        }

                        awv var38 = (awv)Iterables.getFirst(Multisets.copyHighestCountFirst(var22), awv.b);
                        if(var38 == awv.n) {
                           var36 = (double)var26 * 0.1D + (double)(var11 + var16 & 1) * 0.2D;
                           var37 = 1;
                           if(var36 < 0.5D) {
                              var37 = 2;
                           }

                           if(var36 > 0.9D) {
                              var37 = 0;
                           }
                        }

                        var14 = var27;
                        if(var16 >= 0 && var17 * var17 + var18 * var18 < var9 * var9 && (!var19 || (var11 + var16 & 1) != 0)) {
                           byte var39 = var3.e[var11 + var16 * 128];
                           byte var40 = (byte)(var38.M * 4 + var37);
                           if(var39 != var40) {
                              if(var12 > var16) {
                                 var12 = var16;
                              }

                              if(var13 < var16) {
                                 var13 = var16;
                              }

                              var3.e[var11 + var16 * 128] = var40;
                           }
                        }
                     }
                  }
               }

               if(var12 <= var13) {
                  var3.a(var11, var12, var13);
               }
            }
         }

      }
   }

   public void a(add var1, ahb var2, sa var3, int var4, boolean var5) {
      if(!var2.E) {
         ayi var6 = this.a(var1, var2);
         if(var3 instanceof yz) {
            yz var7 = (yz)var3;
            var6.a(var7, var1);
         }

         if(var5) {
            this.a(var2, var3, var6);
         }

      }
   }

   public ft c(add var1, ahb var2, yz var3) {
      byte[] var4 = this.a(var1, var2).a(var1, var2, var3);
      return var4 == null?null:new he(var1.k(), var4);
   }

   public void d(add var1, ahb var2, yz var3) {
      if(var1.p() && var1.q().n("map_is_scaling")) {
         ayi var4 = ade.aY.a(var1, var2);
         var1.b(var2.b("map"));
         ayi var5 = new ayi("map_" + var1.k());
         var5.d = (byte)(var4.d + 1);
         if(var5.d > 4) {
            var5.d = 4;
         }

         var5.a = var4.a;
         var5.b = var4.b;
         var5.c = var4.c;
         var5.c();
         var2.a("map_" + var1.k(), (ayl)var5);
      }

   }
}
