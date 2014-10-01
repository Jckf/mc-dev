
public class aee extends adb {

   public aee() {
      this.a(true);
      this.a(abt.f);
   }

   public String n(add var1) {
      String var2 = ("" + dd.a(this.a() + ".name")).trim();
      String var3 = sg.b(var1.k());
      if(var3 != null) {
         var2 = var2 + " " + dd.a("entity." + var3 + ".name");
      }

      return var2;
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var3.E) {
         return true;
      } else {
         aji var11 = var3.a(var4, var5, var6);
         var4 += q.b[var7];
         var5 += q.c[var7];
         var6 += q.d[var7];
         double var12 = 0.0D;
         if(var7 == 1 && var11.b() == 11) {
            var12 = 0.5D;
         }

         sa var14 = a(var3, var1.k(), (double)var4 + 0.5D, (double)var5 + var12, (double)var6 + 0.5D);
         if(var14 != null) {
            if(var14 instanceof sv && var1.u()) {
               ((sw)var14).a(var1.s());
            }

            if(!var2.bE.d) {
               --var1.b;
            }
         }

         return true;
      }
   }

   public add a(add var1, ahb var2, yz var3) {
      if(var2.E) {
         return var1;
      } else {
         azu var4 = this.a(var2, var3, true);
         if(var4 == null) {
            return var1;
         } else {
            if(var4.a == azv.b) {
               int var5 = var4.b;
               int var6 = var4.c;
               int var7 = var4.d;
               if(!var2.a(var3, var5, var6, var7)) {
                  return var1;
               }

               if(!var3.a(var5, var6, var7, var4.e, var1)) {
                  return var1;
               }

               if(var2.a(var5, var6, var7) instanceof alw) {
                  sa var8 = a(var2, var1.k(), (double)var5, (double)var6, (double)var7);
                  if(var8 != null) {
                     if(var8 instanceof sv && var1.u()) {
                        ((sw)var8).a(var1.s());
                     }

                     if(!var3.bE.d) {
                        --var1.b;
                     }
                  }
               }
            }

            return var1;
         }
      }
   }

   public static sa a(ahb var0, int var1, double var2, double var4, double var6) {
      if(!sg.a.containsKey(Integer.valueOf(var1))) {
         return null;
      } else {
         sa var8 = null;

         for(int var9 = 0; var9 < 1; ++var9) {
            var8 = sg.a(var1, var0);
            if(var8 != null && var8 instanceof sv) {
               sw var10 = (sw)var8;
               var8.b(var2, var4, var6, qh.g(var0.s.nextFloat() * 360.0F), 0.0F);
               var10.aO = var10.y;
               var10.aM = var10.y;
               var10.a((sy)null);
               var0.d(var8);
               var10.r();
            }
         }

         return var8;
      }
   }
}
