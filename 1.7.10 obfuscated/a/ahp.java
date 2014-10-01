import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ahp {

   private final mt a;
   private final Random b;
   private final qd c = new qd();
   private final List d = new ArrayList();


   public ahp(mt var1) {
      this.a = var1;
      this.b = new Random(var1.H());
   }

   public void a(sa var1, double var2, double var4, double var6, float var8) {
      if(this.a.t.i != 1) {
         if(!this.b(var1, var2, var4, var6, var8)) {
            this.a(var1);
            this.b(var1, var2, var4, var6, var8);
         }
      } else {
         int var9 = qh.c(var1.s);
         int var10 = qh.c(var1.t) - 1;
         int var11 = qh.c(var1.u);
         byte var12 = 1;
         byte var13 = 0;

         for(int var14 = -2; var14 <= 2; ++var14) {
            for(int var15 = -2; var15 <= 2; ++var15) {
               for(int var16 = -1; var16 < 3; ++var16) {
                  int var17 = var9 + var15 * var12 + var14 * var13;
                  int var18 = var10 + var16;
                  int var19 = var11 + var15 * var13 - var14 * var12;
                  boolean var20 = var16 < 0;
                  this.a.b(var17, var18, var19, var20?ajn.Z:ajn.a);
               }
            }
         }

         var1.b((double)var9, (double)var10, (double)var11, var1.y, 0.0F);
         var1.v = var1.w = var1.x = 0.0D;
      }
   }

   public boolean b(sa var1, double var2, double var4, double var6, float var8) {
      short var9 = 128;
      double var10 = -1.0D;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = qh.c(var1.s);
      int var16 = qh.c(var1.u);
      long var17 = agu.a(var15, var16);
      boolean var19 = true;
      double var27;
      int var48;
      if(this.c.b(var17)) {
         ahq var20 = (ahq)this.c.a(var17);
         var10 = 0.0D;
         var12 = var20.a;
         var13 = var20.b;
         var14 = var20.c;
         var20.d = this.a.I();
         var19 = false;
      } else {
         for(var48 = var15 - var9; var48 <= var15 + var9; ++var48) {
            double var21 = (double)var48 + 0.5D - var1.s;

            for(int var23 = var16 - var9; var23 <= var16 + var9; ++var23) {
               double var24 = (double)var23 + 0.5D - var1.u;

               for(int var26 = this.a.S() - 1; var26 >= 0; --var26) {
                  if(this.a.a(var48, var26, var23) == ajn.aO) {
                     while(this.a.a(var48, var26 - 1, var23) == ajn.aO) {
                        --var26;
                     }

                     var27 = (double)var26 + 0.5D - var1.t;
                     double var29 = var21 * var21 + var27 * var27 + var24 * var24;
                     if(var10 < 0.0D || var29 < var10) {
                        var10 = var29;
                        var12 = var48;
                        var13 = var26;
                        var14 = var23;
                     }
                  }
               }
            }
         }
      }

      if(var10 >= 0.0D) {
         if(var19) {
            this.c.a(var17, new ahq(this, var12, var13, var14, this.a.I()));
            this.d.add(Long.valueOf(var17));
         }

         double var49 = (double)var12 + 0.5D;
         double var25 = (double)var13 + 0.5D;
         var27 = (double)var14 + 0.5D;
         int var50 = -1;
         if(this.a.a(var12 - 1, var13, var14) == ajn.aO) {
            var50 = 2;
         }

         if(this.a.a(var12 + 1, var13, var14) == ajn.aO) {
            var50 = 0;
         }

         if(this.a.a(var12, var13, var14 - 1) == ajn.aO) {
            var50 = 3;
         }

         if(this.a.a(var12, var13, var14 + 1) == ajn.aO) {
            var50 = 1;
         }

         int var30 = var1.ay();
         if(var50 > -1) {
            int var31 = p.h[var50];
            int var32 = p.a[var50];
            int var33 = p.b[var50];
            int var34 = p.a[var31];
            int var35 = p.b[var31];
            boolean var36 = !this.a.c(var12 + var32 + var34, var13, var14 + var33 + var35) || !this.a.c(var12 + var32 + var34, var13 + 1, var14 + var33 + var35);
            boolean var37 = !this.a.c(var12 + var32, var13, var14 + var33) || !this.a.c(var12 + var32, var13 + 1, var14 + var33);
            if(var36 && var37) {
               var50 = p.f[var50];
               var31 = p.f[var31];
               var32 = p.a[var50];
               var33 = p.b[var50];
               var34 = p.a[var31];
               var35 = p.b[var31];
               var48 = var12 - var34;
               var49 -= (double)var34;
               int var22 = var14 - var35;
               var27 -= (double)var35;
               var36 = !this.a.c(var48 + var32 + var34, var13, var22 + var33 + var35) || !this.a.c(var48 + var32 + var34, var13 + 1, var22 + var33 + var35);
               var37 = !this.a.c(var48 + var32, var13, var22 + var33) || !this.a.c(var48 + var32, var13 + 1, var22 + var33);
            }

            float var38 = 0.5F;
            float var39 = 0.5F;
            if(!var36 && var37) {
               var38 = 1.0F;
            } else if(var36 && !var37) {
               var38 = 0.0F;
            } else if(var36 && var37) {
               var39 = 0.0F;
            }

            var49 += (double)((float)var34 * var38 + var39 * (float)var32);
            var27 += (double)((float)var35 * var38 + var39 * (float)var33);
            float var40 = 0.0F;
            float var41 = 0.0F;
            float var42 = 0.0F;
            float var43 = 0.0F;
            if(var50 == var30) {
               var40 = 1.0F;
               var41 = 1.0F;
            } else if(var50 == p.f[var30]) {
               var40 = -1.0F;
               var41 = -1.0F;
            } else if(var50 == p.g[var30]) {
               var42 = 1.0F;
               var43 = -1.0F;
            } else {
               var42 = -1.0F;
               var43 = 1.0F;
            }

            double var44 = var1.v;
            double var46 = var1.x;
            var1.v = var44 * (double)var40 + var46 * (double)var43;
            var1.x = var44 * (double)var42 + var46 * (double)var41;
            var1.y = var8 - (float)(var30 * 90) + (float)(var50 * 90);
         } else {
            var1.v = var1.w = var1.x = 0.0D;
         }

         var1.b(var49, var25, var27, var1.y, var1.z);
         return true;
      } else {
         return false;
      }
   }

   public boolean a(sa var1) {
      byte var2 = 16;
      double var3 = -1.0D;
      int var5 = qh.c(var1.s);
      int var6 = qh.c(var1.t);
      int var7 = qh.c(var1.u);
      int var8 = var5;
      int var9 = var6;
      int var10 = var7;
      int var11 = 0;
      int var12 = this.b.nextInt(4);

      int var13;
      double var14;
      int var16;
      double var17;
      int var19;
      int var20;
      int var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      double var31;
      double var32;
      for(var13 = var5 - var2; var13 <= var5 + var2; ++var13) {
         var14 = (double)var13 + 0.5D - var1.s;

         for(var16 = var7 - var2; var16 <= var7 + var2; ++var16) {
            var17 = (double)var16 + 0.5D - var1.u;

            label274:
            for(var19 = this.a.S() - 1; var19 >= 0; --var19) {
               if(this.a.c(var13, var19, var16)) {
                  while(var19 > 0 && this.a.c(var13, var19 - 1, var16)) {
                     --var19;
                  }

                  for(var20 = var12; var20 < var12 + 4; ++var20) {
                     var21 = var20 % 2;
                     var22 = 1 - var21;
                     if(var20 % 4 >= 2) {
                        var21 = -var21;
                        var22 = -var22;
                     }

                     for(var23 = 0; var23 < 3; ++var23) {
                        for(var24 = 0; var24 < 4; ++var24) {
                           for(var25 = -1; var25 < 4; ++var25) {
                              var26 = var13 + (var24 - 1) * var21 + var23 * var22;
                              var27 = var19 + var25;
                              int var28 = var16 + (var24 - 1) * var22 - var23 * var21;
                              if(var25 < 0 && !this.a.a(var26, var27, var28).o().a() || var25 >= 0 && !this.a.c(var26, var27, var28)) {
                                 continue label274;
                              }
                           }
                        }
                     }

                     var31 = (double)var19 + 0.5D - var1.t;
                     var32 = var14 * var14 + var31 * var31 + var17 * var17;
                     if(var3 < 0.0D || var32 < var3) {
                        var3 = var32;
                        var8 = var13;
                        var9 = var19;
                        var10 = var16;
                        var11 = var20 % 4;
                     }
                  }
               }
            }
         }
      }

      if(var3 < 0.0D) {
         for(var13 = var5 - var2; var13 <= var5 + var2; ++var13) {
            var14 = (double)var13 + 0.5D - var1.s;

            for(var16 = var7 - var2; var16 <= var7 + var2; ++var16) {
               var17 = (double)var16 + 0.5D - var1.u;

               label222:
               for(var19 = this.a.S() - 1; var19 >= 0; --var19) {
                  if(this.a.c(var13, var19, var16)) {
                     while(var19 > 0 && this.a.c(var13, var19 - 1, var16)) {
                        --var19;
                     }

                     for(var20 = var12; var20 < var12 + 2; ++var20) {
                        var21 = var20 % 2;
                        var22 = 1 - var21;

                        for(var23 = 0; var23 < 4; ++var23) {
                           for(var24 = -1; var24 < 4; ++var24) {
                              var25 = var13 + (var23 - 1) * var21;
                              var26 = var19 + var24;
                              var27 = var16 + (var23 - 1) * var22;
                              if(var24 < 0 && !this.a.a(var25, var26, var27).o().a() || var24 >= 0 && !this.a.c(var25, var26, var27)) {
                                 continue label222;
                              }
                           }
                        }

                        var31 = (double)var19 + 0.5D - var1.t;
                        var32 = var14 * var14 + var31 * var31 + var17 * var17;
                        if(var3 < 0.0D || var32 < var3) {
                           var3 = var32;
                           var8 = var13;
                           var9 = var19;
                           var10 = var16;
                           var11 = var20 % 2;
                        }
                     }
                  }
               }
            }
         }
      }

      int var29 = var8;
      int var15 = var9;
      var16 = var10;
      int var30 = var11 % 2;
      int var18 = 1 - var30;
      if(var11 % 4 >= 2) {
         var30 = -var30;
         var18 = -var18;
      }

      boolean var33;
      if(var3 < 0.0D) {
         if(var9 < 70) {
            var9 = 70;
         }

         if(var9 > this.a.S() - 10) {
            var9 = this.a.S() - 10;
         }

         var15 = var9;

         for(var19 = -1; var19 <= 1; ++var19) {
            for(var20 = 1; var20 < 3; ++var20) {
               for(var21 = -1; var21 < 3; ++var21) {
                  var22 = var29 + (var20 - 1) * var30 + var19 * var18;
                  var23 = var15 + var21;
                  var24 = var16 + (var20 - 1) * var18 - var19 * var30;
                  var33 = var21 < 0;
                  this.a.b(var22, var23, var24, var33?ajn.Z:ajn.a);
               }
            }
         }
      }

      for(var19 = 0; var19 < 4; ++var19) {
         for(var20 = 0; var20 < 4; ++var20) {
            for(var21 = -1; var21 < 4; ++var21) {
               var22 = var29 + (var20 - 1) * var30;
               var23 = var15 + var21;
               var24 = var16 + (var20 - 1) * var18;
               var33 = var20 == 0 || var20 == 3 || var21 == -1 || var21 == 3;
               this.a.d(var22, var23, var24, (aji)(var33?ajn.Z:ajn.aO), 0, 2);
            }
         }

         for(var20 = 0; var20 < 4; ++var20) {
            for(var21 = -1; var21 < 4; ++var21) {
               var22 = var29 + (var20 - 1) * var30;
               var23 = var15 + var21;
               var24 = var16 + (var20 - 1) * var18;
               this.a.d(var22, var23, var24, this.a.a(var22, var23, var24));
            }
         }
      }

      return true;
   }

   public void a(long var1) {
      if(var1 % 100L == 0L) {
         Iterator var3 = this.d.iterator();
         long var4 = var1 - 600L;

         while(var3.hasNext()) {
            Long var6 = (Long)var3.next();
            ahq var7 = (ahq)this.c.a(var6.longValue());
            if(var7 == null || var7.d < var4) {
               var3.remove();
               this.c.d(var6.longValue());
            }
         }
      }

   }
}
