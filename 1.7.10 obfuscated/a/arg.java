import java.util.Random;

public class arg extends arn {

   private final qx[] a;
   private final int b;


   public arg(qx[] var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      aji var6;
      while(((var6 = var1.a(var3, var4, var5)).o() == awt.a || var6.o() == awt.j) && var4 > 1) {
         --var4;
      }

      if(var4 < 1) {
         return false;
      } else {
         ++var4;

         for(int var7 = 0; var7 < 4; ++var7) {
            int var8 = var3 + var2.nextInt(4) - var2.nextInt(4);
            int var9 = var4 + var2.nextInt(3) - var2.nextInt(3);
            int var10 = var5 + var2.nextInt(4) - var2.nextInt(4);
            if(var1.c(var8, var9, var10) && ahb.a((ahl)var1, var8, var9 - 1, var10)) {
               var1.d(var8, var9, var10, ajn.ae, 0, 2);
               aow var11 = (aow)var1.o(var8, var9, var10);
               if(var11 != null && var11 != null) {
                  qx.a(var2, this.a, (rb)var11, this.b);
               }

               if(var1.c(var8 - 1, var9, var10) && ahb.a((ahl)var1, var8 - 1, var9 - 1, var10)) {
                  var1.d(var8 - 1, var9, var10, ajn.aa, 0, 2);
               }

               if(var1.c(var8 + 1, var9, var10) && ahb.a((ahl)var1, var8 - 1, var9 - 1, var10)) {
                  var1.d(var8 + 1, var9, var10, ajn.aa, 0, 2);
               }

               if(var1.c(var8, var9, var10 - 1) && ahb.a((ahl)var1, var8 - 1, var9 - 1, var10)) {
                  var1.d(var8, var9, var10 - 1, ajn.aa, 0, 2);
               }

               if(var1.c(var8, var9, var10 + 1) && ahb.a((ahl)var1, var8 - 1, var9 - 1, var10)) {
                  var1.d(var8, var9, var10 + 1, ajn.aa, 0, 2);
               }

               return true;
            }
         }

         return false;
      }
   }
}
