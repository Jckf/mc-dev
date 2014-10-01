import java.util.Random;

public class arp extends asq {

   private int a;
   private int b;


   public arp(int var1, int var2) {
      super(false);
      this.b = var1;
      this.a = var2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      aji var6;
      while(((var6 = var1.a(var3, var4, var5)).o() == awt.a || var6.o() == awt.j) && var4 > 0) {
         --var4;
      }

      aji var7 = var1.a(var3, var4, var5);
      if(var7 == ajn.d || var7 == ajn.c) {
         ++var4;
         this.a(var1, var3, var4, var5, ajn.r, this.b);

         for(int var8 = var4; var8 <= var4 + 2; ++var8) {
            int var9 = var8 - var4;
            int var10 = 2 - var9;

            for(int var11 = var3 - var10; var11 <= var3 + var10; ++var11) {
               int var12 = var11 - var3;

               for(int var13 = var5 - var10; var13 <= var5 + var10; ++var13) {
                  int var14 = var13 - var5;
                  if((Math.abs(var12) != var10 || Math.abs(var14) != var10 || var2.nextInt(2) != 0) && !var1.a(var11, var8, var13).j()) {
                     this.a(var1, var11, var8, var13, ajn.t, this.a);
                  }
               }
            }
         }
      }

      return true;
   }
}
