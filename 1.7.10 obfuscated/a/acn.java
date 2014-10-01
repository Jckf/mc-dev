
public class acn extends adb {

   public acn() {
      this.a(abt.f);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      aji var11 = var3.a(var4, var5, var6);
      int var12 = var3.e(var4, var5, var6);
      if(var2.a(var4, var5, var6, var7, var1) && var11 == ajn.br && !aku.b(var12)) {
         if(var3.E) {
            return true;
         } else {
            var3.a(var4, var5, var6, var12 + 4, 2);
            var3.f(var4, var5, var6, ajn.br);
            --var1.b;

            int var13;
            for(var13 = 0; var13 < 16; ++var13) {
               double var14 = (double)((float)var4 + (5.0F + g.nextFloat() * 6.0F) / 16.0F);
               double var16 = (double)((float)var5 + 0.8125F);
               double var18 = (double)((float)var6 + (5.0F + g.nextFloat() * 6.0F) / 16.0F);
               double var20 = 0.0D;
               double var22 = 0.0D;
               double var24 = 0.0D;
               var3.a("smoke", var14, var16, var18, var20, var22, var24);
            }

            var13 = var12 & 3;
            int var26 = 0;
            int var15 = 0;
            boolean var27 = false;
            boolean var17 = true;
            int var28 = p.g[var13];

            int var19;
            int var21;
            int var29;
            for(var19 = -2; var19 <= 2; ++var19) {
               var29 = var4 + p.a[var28] * var19;
               var21 = var6 + p.b[var28] * var19;
               if(var3.a(var29, var5, var21) == ajn.br) {
                  if(!aku.b(var3.e(var29, var5, var21))) {
                     var17 = false;
                     break;
                  }

                  var15 = var19;
                  if(!var27) {
                     var26 = var19;
                     var27 = true;
                  }
               }
            }

            if(var17 && var15 == var26 + 2) {
               for(var19 = var26; var19 <= var15; ++var19) {
                  var29 = var4 + p.a[var28] * var19;
                  var21 = var6 + p.b[var28] * var19;
                  var29 += p.a[var13] * 4;
                  var21 += p.b[var13] * 4;
                  if(var3.a(var29, var5, var21) != ajn.br || !aku.b(var3.e(var29, var5, var21))) {
                     var17 = false;
                     break;
                  }
               }

               int var30;
               for(var19 = var26 - 1; var19 <= var15 + 1; var19 += 4) {
                  for(var29 = 1; var29 <= 3; ++var29) {
                     var21 = var4 + p.a[var28] * var19;
                     var30 = var6 + p.b[var28] * var19;
                     var21 += p.a[var13] * var29;
                     var30 += p.b[var13] * var29;
                     if(var3.a(var21, var5, var30) != ajn.br || !aku.b(var3.e(var21, var5, var30))) {
                        var17 = false;
                        break;
                     }
                  }
               }

               if(var17) {
                  for(var19 = var26; var19 <= var15; ++var19) {
                     for(var29 = 1; var29 <= 3; ++var29) {
                        var21 = var4 + p.a[var28] * var19;
                        var30 = var6 + p.b[var28] * var19;
                        var21 += p.a[var13] * var29;
                        var30 += p.b[var13] * var29;
                        var3.d(var21, var5, var30, ajn.bq, 0, 2);
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public add a(add var1, ahb var2, yz var3) {
      azu var4 = this.a(var2, var3, false);
      if(var4 != null && var4.a == azv.b && var2.a(var4.b, var4.c, var4.d) == ajn.br) {
         return var1;
      } else {
         if(!var2.E) {
            agt var5 = var2.b("Stronghold", (int)var3.s, (int)var3.t, (int)var3.u);
            if(var5 != null) {
               zd var6 = new zd(var2, var3.s, var3.t + 1.62D - (double)var3.L, var3.u);
               var6.a((double)var5.a, var5.b, (double)var5.c);
               var2.d((sa)var6);
               var2.a((sa)var3, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
               var2.a((yz)null, 1002, (int)var3.s, (int)var3.t, (int)var3.u, 0);
               if(!var3.bE.d) {
                  --var1.b;
               }
            }
         }

         return var1;
      }
   }
}
