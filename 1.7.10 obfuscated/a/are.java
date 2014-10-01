import java.util.Random;

public class are extends arc {

   private boolean a;


   public are(boolean var1, boolean var2) {
      super(var1);
      this.a = var2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + 5;
      if(this.a) {
         var6 += var2.nextInt(7);
      }

      boolean var7 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var10;
         int var11;
         for(int var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 1;
            if(var8 == var4) {
               var9 = 0;
            }

            if(var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
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

         if(!var7) {
            return false;
         } else {
            aji var17 = var1.a(var3, var4 - 1, var5);
            if((var17 == ajn.c || var17 == ajn.d || var17 == ajn.ak) && var4 < 256 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, ajn.d);

               int var18;
               for(var18 = var4 - 3 + var6; var18 <= var4 + var6; ++var18) {
                  var10 = var18 - (var4 + var6);
                  var11 = 1 - var10 / 2;

                  for(int var20 = var3 - var11; var20 <= var3 + var11; ++var20) {
                     int var13 = var20 - var3;

                     for(int var14 = var5 - var11; var14 <= var5 + var11; ++var14) {
                        int var15 = var14 - var5;
                        if(Math.abs(var13) != var11 || Math.abs(var15) != var11 || var2.nextInt(2) != 0 && var10 != 0) {
                           aji var16 = var1.a(var20, var18, var14);
                           if(var16.o() == awt.a || var16.o() == awt.j) {
                              this.a(var1, var20, var18, var14, ajn.t, 2);
                           }
                        }
                     }
                  }
               }

               for(var18 = 0; var18 < var6; ++var18) {
                  aji var19 = var1.a(var3, var4 + var18, var5);
                  if(var19.o() == awt.a || var19.o() == awt.j) {
                     this.a(var1, var3, var4 + var18, var5, ajn.r, 2);
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }
}
