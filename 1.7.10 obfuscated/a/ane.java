import java.util.Random;

public class ane extends aji {

   protected ane() {
      super(awt.k);
      float var1 = 0.375F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 1.0F, 0.5F + var1);
      this.a(true);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(var2, var3 - 1, var4) == ajn.aH || this.e(var1, var2, var3, var4)) {
         if(var1.c(var2, var3 + 1, var4)) {
            int var6;
            for(var6 = 1; var1.a(var2, var3 - var6, var4) == this; ++var6) {
               ;
            }

            if(var6 < 3) {
               int var7 = var1.e(var2, var3, var4);
               if(var7 == 15) {
                  var1.b(var2, var3 + 1, var4, (aji)this);
                  var1.a(var2, var3, var4, 0, 4);
               } else {
                  var1.a(var2, var3, var4, var7 + 1, 4);
               }
            }
         }

      }
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3 - 1, var4);
      return var5 == this?true:(var5 != ajn.c && var5 != ajn.d && var5 != ajn.m?false:(var1.a(var2 - 1, var3 - 1, var4).o() == awt.h?true:(var1.a(var2 + 1, var3 - 1, var4).o() == awt.h?true:(var1.a(var2, var3 - 1, var4 - 1).o() == awt.h?true:var1.a(var2, var3 - 1, var4 + 1).o() == awt.h))));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      this.e(var1, var2, var3, var4);
   }

   protected final boolean e(ahb var1, int var2, int var3, int var4) {
      if(!this.j(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return this.c(var1, var2, var3, var4);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.aE;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 1;
   }
}
