
public class acj extends adb {

   public static final String[] a = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
   public static final String[] b = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};
   public static final int[] c = new int[]{1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};


   public acj() {
      this.a(true);
      this.f(0);
      this.a(abt.l);
   }

   public String a(add var1) {
      int var2 = qh.a(var1.k(), 0, 15);
      return super.a() + "." + a[var2];
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         if(var1.k() == 15) {
            if(a(var1, var3, var4, var5, var6)) {
               if(!var3.E) {
                  var3.c(2005, var4, var5, var6, 0);
               }

               return true;
            }
         } else if(var1.k() == 3) {
            aji var11 = var3.a(var4, var5, var6);
            int var12 = var3.e(var4, var5, var6);
            if(var11 == ajn.r && alx.c(var12) == 3) {
               if(var7 == 0) {
                  return false;
               }

               if(var7 == 1) {
                  return false;
               }

               if(var7 == 2) {
                  --var6;
               }

               if(var7 == 3) {
                  ++var6;
               }

               if(var7 == 4) {
                  --var4;
               }

               if(var7 == 5) {
                  ++var4;
               }

               if(var3.c(var4, var5, var6)) {
                  int var13 = ajn.by.a(var3, var4, var5, var6, var7, var8, var9, var10, 0);
                  var3.d(var4, var5, var6, ajn.by, var13, 2);
                  if(!var2.bE.d) {
                     --var1.b;
                  }
               }

               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(add var0, ahb var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3, var4);
      if(var5 instanceof ajo) {
         ajo var6 = (ajo)var5;
         if(var6.a(var1, var2, var3, var4, var1.E)) {
            if(!var1.E) {
               if(var6.a(var1, var1.s, var2, var3, var4)) {
                  var6.b(var1, var1.s, var2, var3, var4);
               }

               --var0.b;
            }

            return true;
         }
      }

      return false;
   }

   public boolean a(add var1, yz var2, sv var3) {
      if(var3 instanceof wp) {
         wp var4 = (wp)var3;
         int var5 = aka.b(var1.k());
         if(!var4.ca() && var4.bZ() != var5) {
            var4.s(var5);
            --var1.b;
         }

         return true;
      } else {
         return false;
      }
   }

}
