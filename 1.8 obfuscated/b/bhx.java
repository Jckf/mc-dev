import java.util.Random;

public class bhx extends bhp {

   public boolean b(aqu var1, Random var2, dt var3) {
      while(var1.d(var3) && var3.o() > 2) {
         var3 = var3.b();
      }

      if(var1.p(var3).c() != aty.aJ) {
         return false;
      } else {
         var3 = var3.b(var2.nextInt(4));
         int var4 = var2.nextInt(4) + 7;
         int var5 = var4 / 4 + var2.nextInt(2);
         if(var5 > 1 && var2.nextInt(60) == 0) {
            var3 = var3.b(10 + var2.nextInt(30));
         }

         int var6;
         int var8;
         for(var6 = 0; var6 < var4; ++var6) {
            float var7 = (1.0F - (float)var6 / (float)var4) * (float)var5;
            var8 = uv.f(var7);

            for(int var9 = -var8; var9 <= var8; ++var9) {
               float var10 = (float)uv.a(var9) - 0.25F;

               for(int var11 = -var8; var11 <= var8; ++var11) {
                  float var12 = (float)uv.a(var11) - 0.25F;
                  if((var9 == 0 && var11 == 0 || var10 * var10 + var12 * var12 <= var7 * var7) && (var9 != -var8 && var9 != var8 && var11 != -var8 && var11 != var8 || var2.nextFloat() <= 0.75F)) {
                     atr var13 = var1.p(var3.a(var9, var6, var11)).c();
                     if(var13.r() == bof.a || var13 == aty.d || var13 == aty.aJ || var13 == aty.aI) {
                        this.a(var1, var3.a(var9, var6, var11), aty.cB);
                     }

                     if(var6 != 0 && var8 > 1) {
                        var13 = var1.p(var3.a(var9, -var6, var11)).c();
                        if(var13.r() == bof.a || var13 == aty.d || var13 == aty.aJ || var13 == aty.aI) {
                           this.a(var1, var3.a(var9, -var6, var11), aty.cB);
                        }
                     }
                  }
               }
            }
         }

         var6 = var5 - 1;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 1) {
            var6 = 1;
         }

         for(int var14 = -var6; var14 <= var6; ++var14) {
            var8 = -var6;

            while(var8 <= var6) {
               dt var15 = var3.a(var14, -1, var8);
               int var16 = 50;
               if(Math.abs(var14) == 1 && Math.abs(var8) == 1) {
                  var16 = var2.nextInt(5);
               }

               while(true) {
                  if(var15.o() > 50) {
                     atr var17 = var1.p(var15).c();
                     if(var17.r() == bof.a || var17 == aty.d || var17 == aty.aJ || var17 == aty.aI || var17 == aty.cB) {
                        this.a(var1, var15, aty.cB);
                        var15 = var15.b();
                        --var16;
                        if(var16 <= 0) {
                           var15 = var15.c(var2.nextInt(5) + 1);
                           var16 = var2.nextInt(5);
                        }
                        continue;
                     }
                  }

                  ++var8;
                  break;
               }
            }
         }

         return true;
      }
   }
}
