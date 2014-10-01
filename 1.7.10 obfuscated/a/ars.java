import java.util.Random;

public class ars extends arn {

   private aji a;
   private boolean b;


   public ars(aji var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      if(var1.a(var3, var4 + 1, var5) != ajn.aL) {
         return false;
      } else if(var1.a(var3, var4, var5).o() != awt.a && var1.a(var3, var4, var5) != ajn.aL) {
         return false;
      } else {
         int var6 = 0;
         if(var1.a(var3 - 1, var4, var5) == ajn.aL) {
            ++var6;
         }

         if(var1.a(var3 + 1, var4, var5) == ajn.aL) {
            ++var6;
         }

         if(var1.a(var3, var4, var5 - 1) == ajn.aL) {
            ++var6;
         }

         if(var1.a(var3, var4, var5 + 1) == ajn.aL) {
            ++var6;
         }

         if(var1.a(var3, var4 - 1, var5) == ajn.aL) {
            ++var6;
         }

         int var7 = 0;
         if(var1.c(var3 - 1, var4, var5)) {
            ++var7;
         }

         if(var1.c(var3 + 1, var4, var5)) {
            ++var7;
         }

         if(var1.c(var3, var4, var5 - 1)) {
            ++var7;
         }

         if(var1.c(var3, var4, var5 + 1)) {
            ++var7;
         }

         if(var1.c(var3, var4 - 1, var5)) {
            ++var7;
         }

         if(!this.b && var6 == 4 && var7 == 1 || var6 == 5) {
            var1.d(var3, var4, var5, this.a, 0, 2);
            var1.d = true;
            this.a.a(var1, var3, var4, var5, var2);
            var1.d = false;
         }

         return true;
      }
   }
}
