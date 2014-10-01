import java.util.Random;

public abstract class asb extends arc {

   protected final int a;
   protected final int b;
   protected final int c;
   protected int d;


   public asb(boolean var1, int var2, int var3, int var4, int var5) {
      super(var1);
      this.a = var2;
      this.d = var3;
      this.b = var4;
      this.c = var5;
   }

   protected int a(Random var1) {
      int var2 = var1.nextInt(3) + this.a;
      if(this.d > 1) {
         var2 += var1.nextInt(this.d);
      }

      return var2;
   }

   private boolean b(ahb var1, Random var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         for(int var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 2;
            if(var8 == var4) {
               var9 = 1;
            }

            if(var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(int var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(int var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if(var8 >= 0 && var8 < 256) {
                     aji var12 = var1.a(var10, var8, var11);
                     if(!this.a(var12)) {
                        var7 = false;
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         return var7;
      } else {
         return false;
      }
   }

   private boolean c(ahb var1, Random var2, int var3, int var4, int var5) {
      aji var6 = var1.a(var3, var4 - 1, var5);
      if((var6 == ajn.c || var6 == ajn.d) && var4 >= 2) {
         var1.d(var3, var4 - 1, var5, ajn.d, 0, 2);
         var1.d(var3 + 1, var4 - 1, var5, ajn.d, 0, 2);
         var1.d(var3, var4 - 1, var5 + 1, ajn.d, 0, 2);
         var1.d(var3 + 1, var4 - 1, var5 + 1, ajn.d, 0, 2);
         return true;
      } else {
         return false;
      }
   }

   protected boolean a(ahb var1, Random var2, int var3, int var4, int var5, int var6) {
      return this.b(var1, var2, var3, var4, var5, var6) && this.c(var1, var2, var3, var4, var5);
   }

   protected void a(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = var5 * var5;

      for(int var8 = var2 - var5; var8 <= var2 + var5 + 1; ++var8) {
         int var9 = var8 - var2;

         for(int var10 = var4 - var5; var10 <= var4 + var5 + 1; ++var10) {
            int var11 = var10 - var4;
            int var12 = var9 - 1;
            int var13 = var11 - 1;
            if(var9 * var9 + var11 * var11 <= var7 || var12 * var12 + var13 * var13 <= var7 || var9 * var9 + var13 * var13 <= var7 || var12 * var12 + var11 * var11 <= var7) {
               aji var14 = var1.a(var8, var3, var10);
               if(var14.o() == awt.a || var14.o() == awt.j) {
                  this.a(var1, var8, var3, var10, ajn.t, this.c);
               }
            }
         }
      }

   }

   protected void b(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = var5 * var5;

      for(int var8 = var2 - var5; var8 <= var2 + var5; ++var8) {
         int var9 = var8 - var2;

         for(int var10 = var4 - var5; var10 <= var4 + var5; ++var10) {
            int var11 = var10 - var4;
            if(var9 * var9 + var11 * var11 <= var7) {
               aji var12 = var1.a(var8, var3, var10);
               if(var12.o() == awt.a || var12.o() == awt.j) {
                  this.a(var1, var8, var3, var10, ajn.t, this.c);
               }
            }
         }
      }

   }
}
