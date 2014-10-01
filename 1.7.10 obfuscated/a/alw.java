import java.util.Random;

public abstract class alw extends aji {

   protected alw(awt var1) {
      super(var1);
      float var2 = 0.0F;
      float var3 = 0.0F;
      this.a(0.0F + var3, 0.0F + var2, 0.0F + var3, 1.0F + var3, 1.0F + var2, 1.0F + var3);
      this.a(true);
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return this.J != awt.i;
   }

   public static float b(int var0) {
      if(var0 >= 8) {
         var0 = 0;
      }

      return (float)(var0 + 1) / 9.0F;
   }

   protected int e(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4).o() == this.J?var1.e(var2, var3, var4):-1;
   }

   protected int e(ahl var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4).o() != this.J) {
         return -1;
      } else {
         int var5 = var1.e(var2, var3, var4);
         if(var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean d(ahl var1, int var2, int var3, int var4, int var5) {
      awt var6 = var1.a(var2, var3, var4).o();
      return var6 == this.J?false:(var5 == 1?true:(var6 == awt.w?false:super.d(var1, var2, var3, var4, var5)));
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public int b() {
      return 4;
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }

   public int a(Random var1) {
      return 0;
   }

   private azw f(ahl var1, int var2, int var3, int var4) {
      azw var5 = azw.a(0.0D, 0.0D, 0.0D);
      int var6 = this.e(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if(var7 == 0) {
            var8 = var2 - 1;
         }

         if(var7 == 1) {
            var10 = var4 - 1;
         }

         if(var7 == 2) {
            ++var8;
         }

         if(var7 == 3) {
            ++var10;
         }

         int var11 = this.e(var1, var8, var3, var10);
         int var12;
         if(var11 < 0) {
            if(!var1.a(var8, var3, var10).o().c()) {
               var11 = this.e(var1, var8, var3 - 1, var10);
               if(var11 >= 0) {
                  var12 = var11 - (var6 - 8);
                  var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if(var11 >= 0) {
            var12 = var11 - var6;
            var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
         }
      }

      if(var1.e(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if(var13 || this.d(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.d(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.d(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.d(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if(var13 || this.d(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.d(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.d(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.d(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if(var13) {
            var5 = var5.a().c(0.0D, -6.0D, 0.0D);
         }
      }

      var5 = var5.a();
      return var5;
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5, azw var6) {
      azw var7 = this.f(var1, var2, var3, var4);
      var6.a += var7.a;
      var6.b += var7.b;
      var6.c += var7.c;
   }

   public int a(ahb var1) {
      return this.J == awt.h?5:(this.J == awt.i?(var1.t.g?10:30):0);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      this.n(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      this.n(var1, var2, var3, var4);
   }

   private void n(ahb var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this) {
         if(this.J == awt.i) {
            boolean var5 = false;
            if(var5 || var1.a(var2, var3, var4 - 1).o() == awt.h) {
               var5 = true;
            }

            if(var5 || var1.a(var2, var3, var4 + 1).o() == awt.h) {
               var5 = true;
            }

            if(var5 || var1.a(var2 - 1, var3, var4).o() == awt.h) {
               var5 = true;
            }

            if(var5 || var1.a(var2 + 1, var3, var4).o() == awt.h) {
               var5 = true;
            }

            if(var5 || var1.a(var2, var3 + 1, var4).o() == awt.h) {
               var5 = true;
            }

            if(var5) {
               int var6 = var1.e(var2, var3, var4);
               if(var6 == 0) {
                  var1.b(var2, var3, var4, ajn.Z);
               } else if(var6 <= 4) {
                  var1.b(var2, var3, var4, ajn.e);
               }

               this.m(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void m(ahb var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.s.nextFloat() - var1.s.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }
}
