import java.util.Random;

public class asd extends arn {

   private static final qx[] a = new qx[]{new qx(ade.av, 0, 1, 1, 10), new qx(ade.j, 0, 1, 4, 10), new qx(ade.P, 0, 1, 1, 10), new qx(ade.O, 0, 1, 4, 10), new qx(ade.H, 0, 1, 4, 10), new qx(ade.F, 0, 1, 4, 10), new qx(ade.ar, 0, 1, 1, 10), new qx(ade.ao, 0, 1, 1, 1), new qx(ade.ax, 0, 1, 4, 10), new qx(ade.cd, 0, 1, 1, 10), new qx(ade.ce, 0, 1, 1, 10), new qx(ade.cb, 0, 1, 1, 10), new qx(ade.bY, 0, 1, 1, 2), new qx(ade.bX, 0, 1, 1, 5), new qx(ade.bZ, 0, 1, 1, 1)};


   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               awt var13 = var1.a(var10, var11, var12).o();
               if(var11 == var4 - 1 && !var13.a()) {
                  return false;
               }

               if(var11 == var4 + var6 + 1 && !var13.a()) {
                  return false;
               }

               if((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.c(var10, var11, var12) && var1.c(var10, var11 + 1, var12)) {
                  ++var9;
               }
            }
         }
      }

      if(var9 >= 1 && var9 <= 5) {
         for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
            for(var11 = var4 + var6; var11 >= var4 - 1; --var11) {
               for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
                  if(var10 != var3 - var7 - 1 && var11 != var4 - 1 && var12 != var5 - var8 - 1 && var10 != var3 + var7 + 1 && var11 != var4 + var6 + 1 && var12 != var5 + var8 + 1) {
                     var1.f(var10, var11, var12);
                  } else if(var11 >= 0 && !var1.a(var10, var11 - 1, var12).o().a()) {
                     var1.f(var10, var11, var12);
                  } else if(var1.a(var10, var11, var12).o().a()) {
                     if(var11 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.d(var10, var11, var12, ajn.Y, 0, 2);
                     } else {
                        var1.d(var10, var11, var12, ajn.e, 0, 2);
                     }
                  }
               }
            }
         }

         var10 = 0;

         while(var10 < 2) {
            var11 = 0;

            while(true) {
               if(var11 < 3) {
                  label101: {
                     var12 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
                     int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
                     if(var1.c(var12, var4, var14)) {
                        int var15 = 0;
                        if(var1.a(var12 - 1, var4, var14).o().a()) {
                           ++var15;
                        }

                        if(var1.a(var12 + 1, var4, var14).o().a()) {
                           ++var15;
                        }

                        if(var1.a(var12, var4, var14 - 1).o().a()) {
                           ++var15;
                        }

                        if(var1.a(var12, var4, var14 + 1).o().a()) {
                           ++var15;
                        }

                        if(var15 == 1) {
                           var1.d(var12, var4, var14, ajn.ae, 0, 2);
                           qx[] var16 = qx.a(a, new qx[]{ade.bR.b(var2)});
                           aow var17 = (aow)var1.o(var12, var4, var14);
                           if(var17 != null) {
                              qx.a(var2, var16, (rb)var17, 8);
                           }
                           break label101;
                        }
                     }

                     ++var11;
                     continue;
                  }
               }

               ++var10;
               break;
            }
         }

         var1.d(var3, var4, var5, ajn.ac, 0, 2);
         apj var18 = (apj)var1.o(var3, var4, var5);
         if(var18 != null) {
            var18.a().a(this.a(var2));
         } else {
            System.err.println("Failed to fetch mob spawner entity at (" + var3 + ", " + var4 + ", " + var5 + ")");
         }

         return true;
      } else {
         return false;
      }
   }

   private String a(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0?"Skeleton":(var2 == 1?"Zombie":(var2 == 2?"Zombie":(var2 == 3?"Spider":"")));
   }

}
