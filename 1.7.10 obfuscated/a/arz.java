import java.util.Random;

public class arz extends asb {

   public arz(boolean var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = this.a(var2);
      if(!this.a(var1, var2, var3, var4, var5, var6)) {
         return false;
      } else {
         this.c(var1, var3, var5, var4 + var6, 2, var2);

         for(int var7 = var4 + var6 - 2 - var2.nextInt(4); var7 > var4 + var6 / 2; var7 -= 2 + var2.nextInt(4)) {
            float var8 = var2.nextFloat() * 3.1415927F * 2.0F;
            int var9 = var3 + (int)(0.5F + qh.b(var8) * 4.0F);
            int var10 = var5 + (int)(0.5F + qh.a(var8) * 4.0F);

            int var11;
            for(var11 = 0; var11 < 5; ++var11) {
               var9 = var3 + (int)(1.5F + qh.b(var8) * (float)var11);
               var10 = var5 + (int)(1.5F + qh.a(var8) * (float)var11);
               this.a(var1, var9, var7 - 3 + var11 / 2, var10, ajn.r, this.b);
            }

            var11 = 1 + var2.nextInt(2);
            int var12 = var7;

            for(int var13 = var7 - var11; var13 <= var12; ++var13) {
               int var14 = var13 - var12;
               this.b(var1, var9, var13, var10, 1 - var14, var2);
            }
         }

         for(int var15 = 0; var15 < var6; ++var15) {
            aji var16 = var1.a(var3, var4 + var15, var5);
            if(var16.o() == awt.a || var16.o() == awt.j) {
               this.a(var1, var3, var4 + var15, var5, ajn.r, this.b);
               if(var15 > 0) {
                  if(var2.nextInt(3) > 0 && var1.c(var3 - 1, var4 + var15, var5)) {
                     this.a(var1, var3 - 1, var4 + var15, var5, ajn.bd, 8);
                  }

                  if(var2.nextInt(3) > 0 && var1.c(var3, var4 + var15, var5 - 1)) {
                     this.a(var1, var3, var4 + var15, var5 - 1, ajn.bd, 1);
                  }
               }
            }

            if(var15 < var6 - 1) {
               var16 = var1.a(var3 + 1, var4 + var15, var5);
               if(var16.o() == awt.a || var16.o() == awt.j) {
                  this.a(var1, var3 + 1, var4 + var15, var5, ajn.r, this.b);
                  if(var15 > 0) {
                     if(var2.nextInt(3) > 0 && var1.c(var3 + 2, var4 + var15, var5)) {
                        this.a(var1, var3 + 2, var4 + var15, var5, ajn.bd, 2);
                     }

                     if(var2.nextInt(3) > 0 && var1.c(var3 + 1, var4 + var15, var5 - 1)) {
                        this.a(var1, var3 + 1, var4 + var15, var5 - 1, ajn.bd, 1);
                     }
                  }
               }

               var16 = var1.a(var3 + 1, var4 + var15, var5 + 1);
               if(var16.o() == awt.a || var16.o() == awt.j) {
                  this.a(var1, var3 + 1, var4 + var15, var5 + 1, ajn.r, this.b);
                  if(var15 > 0) {
                     if(var2.nextInt(3) > 0 && var1.c(var3 + 2, var4 + var15, var5 + 1)) {
                        this.a(var1, var3 + 2, var4 + var15, var5 + 1, ajn.bd, 2);
                     }

                     if(var2.nextInt(3) > 0 && var1.c(var3 + 1, var4 + var15, var5 + 2)) {
                        this.a(var1, var3 + 1, var4 + var15, var5 + 2, ajn.bd, 4);
                     }
                  }
               }

               var16 = var1.a(var3, var4 + var15, var5 + 1);
               if(var16.o() == awt.a || var16.o() == awt.j) {
                  this.a(var1, var3, var4 + var15, var5 + 1, ajn.r, this.b);
                  if(var15 > 0) {
                     if(var2.nextInt(3) > 0 && var1.c(var3 - 1, var4 + var15, var5 + 1)) {
                        this.a(var1, var3 - 1, var4 + var15, var5 + 1, ajn.bd, 8);
                     }

                     if(var2.nextInt(3) > 0 && var1.c(var3, var4 + var15, var5 + 2)) {
                        this.a(var1, var3, var4 + var15, var5 + 2, ajn.bd, 4);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   private void c(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      byte var7 = 2;

      for(int var8 = var4 - var7; var8 <= var4; ++var8) {
         int var9 = var8 - var4;
         this.a(var1, var2, var8, var3, var5 + 1 - var9, var6);
      }

   }
}
