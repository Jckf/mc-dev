import java.util.Random;

public class akr extends alw {

   int a;
   boolean[] b = new boolean[4];
   int[] M = new int[4];


   protected akr(awt var1) {
      super(var1);
   }

   private void n(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.d(var2, var3, var4, aji.e(aji.b((aji)this) + 1), var5, 2);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.e(var1, var2, var3, var4);
      byte var7 = 1;
      if(this.J == awt.i && !var1.t.f) {
         var7 = 2;
      }

      boolean var8 = true;
      int var9 = this.a(var1);
      int var11;
      if(var6 > 0) {
         byte var10 = -100;
         this.a = 0;
         int var13 = this.a(var1, var2 - 1, var3, var4, var10);
         var13 = this.a(var1, var2 + 1, var3, var4, var13);
         var13 = this.a(var1, var2, var3, var4 - 1, var13);
         var13 = this.a(var1, var2, var3, var4 + 1, var13);
         var11 = var13 + var7;
         if(var11 >= 8 || var13 < 0) {
            var11 = -1;
         }

         if(this.e(var1, var2, var3 + 1, var4) >= 0) {
            int var12 = this.e(var1, var2, var3 + 1, var4);
            if(var12 >= 8) {
               var11 = var12;
            } else {
               var11 = var12 + 8;
            }
         }

         if(this.a >= 2 && this.J == awt.h) {
            if(var1.a(var2, var3 - 1, var4).o().a()) {
               var11 = 0;
            } else if(var1.a(var2, var3 - 1, var4).o() == this.J && var1.e(var2, var3 - 1, var4) == 0) {
               var11 = 0;
            }
         }

         if(this.J == awt.i && var6 < 8 && var11 < 8 && var11 > var6 && var5.nextInt(4) != 0) {
            var9 *= 4;
         }

         if(var11 == var6) {
            if(var8) {
               this.n(var1, var2, var3, var4);
            }
         } else {
            var6 = var11;
            if(var11 < 0) {
               var1.f(var2, var3, var4);
            } else {
               var1.a(var2, var3, var4, var11, 2);
               var1.a(var2, var3, var4, this, var9);
               var1.d(var2, var3, var4, this);
            }
         }
      } else {
         this.n(var1, var2, var3, var4);
      }

      if(this.q(var1, var2, var3 - 1, var4)) {
         if(this.J == awt.i && var1.a(var2, var3 - 1, var4).o() == awt.h) {
            var1.b(var2, var3 - 1, var4, ajn.b);
            this.m(var1, var2, var3 - 1, var4);
            return;
         }

         if(var6 >= 8) {
            this.h(var1, var2, var3 - 1, var4, var6);
         } else {
            this.h(var1, var2, var3 - 1, var4, var6 + 8);
         }
      } else if(var6 >= 0 && (var6 == 0 || this.p(var1, var2, var3 - 1, var4))) {
         boolean[] var14 = this.o(var1, var2, var3, var4);
         var11 = var6 + var7;
         if(var6 >= 8) {
            var11 = 1;
         }

         if(var11 >= 8) {
            return;
         }

         if(var14[0]) {
            this.h(var1, var2 - 1, var3, var4, var11);
         }

         if(var14[1]) {
            this.h(var1, var2 + 1, var3, var4, var11);
         }

         if(var14[2]) {
            this.h(var1, var2, var3, var4 - 1, var11);
         }

         if(var14[3]) {
            this.h(var1, var2, var3, var4 + 1, var11);
         }
      }

   }

   private void h(ahb var1, int var2, int var3, int var4, int var5) {
      if(this.q(var1, var2, var3, var4)) {
         aji var6 = var1.a(var2, var3, var4);
         if(this.J == awt.i) {
            this.m(var1, var2, var3, var4);
         } else {
            var6.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         }

         var1.d(var2, var3, var4, this, var5, 3);
      }

   }

   private int c(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for(int var8 = 0; var8 < 4; ++var8) {
         if((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var11 = var4;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var11 = var4 - 1;
            }

            if(var8 == 3) {
               ++var11;
            }

            if(!this.p(var1, var9, var3, var11) && (var1.a(var9, var3, var11).o() != this.J || var1.e(var9, var3, var11) != 0)) {
               if(!this.p(var1, var9, var3 - 1, var11)) {
                  return var5;
               }

               if(var5 < 4) {
                  int var12 = this.c(var1, var9, var3, var11, var5 + 1, var8);
                  if(var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] o(ahb var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 4; ++var5) {
         this.M[var5] = 1000;
         var6 = var2;
         int var8 = var4;
         if(var5 == 0) {
            var6 = var2 - 1;
         }

         if(var5 == 1) {
            ++var6;
         }

         if(var5 == 2) {
            var8 = var4 - 1;
         }

         if(var5 == 3) {
            ++var8;
         }

         if(!this.p(var1, var6, var3, var8) && (var1.a(var6, var3, var8).o() != this.J || var1.e(var6, var3, var8) != 0)) {
            if(this.p(var1, var6, var3 - 1, var8)) {
               this.M[var5] = this.c(var1, var6, var3, var8, 1, var5);
            } else {
               this.M[var5] = 0;
            }
         }
      }

      var5 = this.M[0];

      for(var6 = 1; var6 < 4; ++var6) {
         if(this.M[var6] < var5) {
            var5 = this.M[var6];
         }
      }

      for(var6 = 0; var6 < 4; ++var6) {
         this.b[var6] = this.M[var6] == var5;
      }

      return this.b;
   }

   private boolean p(ahb var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3, var4);
      return var5 != ajn.ao && var5 != ajn.av && var5 != ajn.an && var5 != ajn.ap && var5 != ajn.aH?(var5.J == awt.E?true:var5.J.c()):true;
   }

   protected int a(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = this.e(var1, var2, var3, var4);
      if(var6 < 0) {
         return var5;
      } else {
         if(var6 == 0) {
            ++this.a;
         }

         if(var6 >= 8) {
            var6 = 0;
         }

         return var5 >= 0 && var6 >= var5?var5:var6;
      }
   }

   private boolean q(ahb var1, int var2, int var3, int var4) {
      awt var5 = var1.a(var2, var3, var4).o();
      return var5 == this.J?false:(var5 == awt.i?false:!this.p(var1, var2, var3, var4));
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      if(var1.a(var2, var3, var4) == this) {
         var1.a(var2, var3, var4, this, this.a(var1));
      }

   }

   public boolean L() {
      return true;
   }
}
