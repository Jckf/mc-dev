import java.util.Random;

public class asa extends asb {

   private boolean e;


   public asa(boolean var1, boolean var2) {
      super(var1, 13, 15, 1, 1);
      this.e = var2;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = this.a(var2);
      if(!this.a(var1, var2, var3, var4, var5, var6)) {
         return false;
      } else {
         this.c(var1, var3, var5, var4 + var6, 0, var2);

         for(int var7 = 0; var7 < var6; ++var7) {
            aji var8 = var1.a(var3, var4 + var7, var5);
            if(var8.o() == awt.a || var8.o() == awt.j) {
               this.a(var1, var3, var4 + var7, var5, ajn.r, this.b);
            }

            if(var7 < var6 - 1) {
               var8 = var1.a(var3 + 1, var4 + var7, var5);
               if(var8.o() == awt.a || var8.o() == awt.j) {
                  this.a(var1, var3 + 1, var4 + var7, var5, ajn.r, this.b);
               }

               var8 = var1.a(var3 + 1, var4 + var7, var5 + 1);
               if(var8.o() == awt.a || var8.o() == awt.j) {
                  this.a(var1, var3 + 1, var4 + var7, var5 + 1, ajn.r, this.b);
               }

               var8 = var1.a(var3, var4 + var7, var5 + 1);
               if(var8.o() == awt.a || var8.o() == awt.j) {
                  this.a(var1, var3, var4 + var7, var5 + 1, ajn.r, this.b);
               }
            }
         }

         return true;
      }
   }

   private void c(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = var6.nextInt(5);
      if(this.e) {
         var7 += this.a;
      } else {
         var7 += 3;
      }

      int var8 = 0;

      for(int var9 = var4 - var7; var9 <= var4; ++var9) {
         int var10 = var4 - var9;
         int var11 = var5 + qh.d((float)var10 / (float)var7 * 3.5F);
         this.a(var1, var2, var9, var3, var11 + (var10 > 0 && var11 == var8 && (var9 & 1) == 0?1:0), var6);
         var8 = var11;
      }

   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      this.c(var1, var2, var3 - 1, var4, var5 - 1);
      this.c(var1, var2, var3 + 2, var4, var5 - 1);
      this.c(var1, var2, var3 - 1, var4, var5 + 2);
      this.c(var1, var2, var3 + 2, var4, var5 + 2);

      for(int var6 = 0; var6 < 5; ++var6) {
         int var7 = var2.nextInt(64);
         int var8 = var7 % 8;
         int var9 = var7 / 8;
         if(var8 == 0 || var8 == 7 || var9 == 0 || var9 == 7) {
            this.c(var1, var2, var3 - 3 + var8, var4, var5 - 3 + var9);
         }
      }

   }

   private void c(ahb var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = -2; var6 <= 2; ++var6) {
         for(int var7 = -2; var7 <= 2; ++var7) {
            if(Math.abs(var6) != 2 || Math.abs(var7) != 2) {
               this.a(var1, var3 + var6, var4, var5 + var7);
            }
         }
      }

   }

   private void a(ahb var1, int var2, int var3, int var4) {
      for(int var5 = var3 + 2; var5 >= var3 - 3; --var5) {
         aji var6 = var1.a(var2, var5, var4);
         if(var6 == ajn.c || var6 == ajn.d) {
            this.a(var1, var2, var5, var4, ajn.d, 2);
            break;
         }

         if(var6.o() != awt.a && var5 < var3) {
            break;
         }
      }

   }
}
