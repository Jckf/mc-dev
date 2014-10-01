
public class abo extends adb {

   private aji a;


   public abo(aji var1) {
      this.h = 1;
      this.a = var1;
      this.a(abt.f);
   }

   public add a(add var1, ahb var2, yz var3) {
      boolean var4 = this.a == ajn.a;
      azu var5 = this.a(var2, var3, var4);
      if(var5 == null) {
         return var1;
      } else {
         if(var5.a == azv.b) {
            int var6 = var5.b;
            int var7 = var5.c;
            int var8 = var5.d;
            if(!var2.a(var3, var6, var7, var8)) {
               return var1;
            }

            if(var4) {
               if(!var3.a(var6, var7, var8, var5.e, var1)) {
                  return var1;
               }

               awt var9 = var2.a(var6, var7, var8).o();
               int var10 = var2.e(var6, var7, var8);
               if(var9 == awt.h && var10 == 0) {
                  var2.f(var6, var7, var8);
                  return this.a(var1, var3, ade.as);
               }

               if(var9 == awt.i && var10 == 0) {
                  var2.f(var6, var7, var8);
                  return this.a(var1, var3, ade.at);
               }
            } else {
               if(this.a == ajn.a) {
                  return new add(ade.ar);
               }

               if(var5.e == 0) {
                  --var7;
               }

               if(var5.e == 1) {
                  ++var7;
               }

               if(var5.e == 2) {
                  --var8;
               }

               if(var5.e == 3) {
                  ++var8;
               }

               if(var5.e == 4) {
                  --var6;
               }

               if(var5.e == 5) {
                  ++var6;
               }

               if(!var3.a(var6, var7, var8, var5.e, var1)) {
                  return var1;
               }

               if(this.a(var2, var6, var7, var8) && !var3.bE.d) {
                  return new add(ade.ar);
               }
            }
         }

         return var1;
      }
   }

   private add a(add var1, yz var2, adb var3) {
      if(var2.bE.d) {
         return var1;
      } else if(--var1.b <= 0) {
         return new add(var3);
      } else {
         if(!var2.bm.a(new add(var3))) {
            var2.a(new add(var3, 1, 0), false);
         }

         return var1;
      }
   }

   public boolean a(ahb var1, int var2, int var3, int var4) {
      if(this.a == ajn.a) {
         return false;
      } else {
         awt var5 = var1.a(var2, var3, var4).o();
         boolean var6 = !var5.a();
         if(!var1.c(var2, var3, var4) && !var6) {
            return false;
         } else {
            if(var1.t.f && this.a == ajn.i) {
               var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.s.nextFloat() - var1.s.nextFloat()) * 0.8F);

               for(int var7 = 0; var7 < 8; ++var7) {
                  var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + Math.random(), (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
               }
            } else {
               if(!var1.E && var6 && !var5.d()) {
                  var1.a(var2, var3, var4, true);
               }

               var1.d(var2, var3, var4, this.a, 0, 3);
            }

            return true;
         }
      }
   }
}
