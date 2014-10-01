import java.util.Random;

public abstract class alx extends ang {

   public alx() {
      super(awt.d);
      this.a(abt.b);
      this.c(2.0F);
      this.a(f);
   }

   public static int c(int var0) {
      return var0 & 3;
   }

   public int a(Random var1) {
      return 1;
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a((aji)this);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      byte var7 = 4;
      int var8 = var7 + 1;
      if(var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  if(var1.a(var2 + var9, var3 + var10, var4 + var11).o() == awt.j) {
                     int var12 = var1.e(var2 + var9, var3 + var10, var4 + var11);
                     if((var12 & 8) == 0) {
                        var1.a(var2 + var9, var3 + var10, var4 + var11, var12 | 8, 4);
                     }
                  }
               }
            }
         }
      }

   }
}
