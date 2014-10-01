import java.util.Random;

public class anu extends ajr implements ajo {

   private final aji a;


   protected anu(aji var1) {
      this.a = var1;
      this.a(true);
      float var2 = 0.125F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
      this.a((abt)null);
   }

   protected boolean a(aji var1) {
      return var1 == ajn.ak;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.k(var2, var3 + 1, var4) >= 9) {
         float var6 = this.n(var1, var2, var3, var4);
         if(var5.nextInt((int)(25.0F / var6) + 1) == 0) {
            int var7 = var1.e(var2, var3, var4);
            if(var7 < 7) {
               ++var7;
               var1.a(var2, var3, var4, var7, 2);
            } else {
               if(var1.a(var2 - 1, var3, var4) == this.a) {
                  return;
               }

               if(var1.a(var2 + 1, var3, var4) == this.a) {
                  return;
               }

               if(var1.a(var2, var3, var4 - 1) == this.a) {
                  return;
               }

               if(var1.a(var2, var3, var4 + 1) == this.a) {
                  return;
               }

               int var8 = var5.nextInt(4);
               int var9 = var2;
               int var10 = var4;
               if(var8 == 0) {
                  var9 = var2 - 1;
               }

               if(var8 == 1) {
                  ++var9;
               }

               if(var8 == 2) {
                  var10 = var4 - 1;
               }

               if(var8 == 3) {
                  ++var10;
               }

               aji var11 = var1.a(var9, var3 - 1, var10);
               if(var1.a(var9, var3, var10).J == awt.a && (var11 == ajn.ak || var11 == ajn.d || var11 == ajn.c)) {
                  var1.b(var9, var3, var10, this.a);
               }
            }
         }
      }

   }

   public void m(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) + qh.a(var1.s, 2, 5);
      if(var5 > 7) {
         var5 = 7;
      }

      var1.a(var2, var3, var4, var5, 2);
   }

   private float n(ahb var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      aji var6 = var1.a(var2, var3, var4 - 1);
      aji var7 = var1.a(var2, var3, var4 + 1);
      aji var8 = var1.a(var2 - 1, var3, var4);
      aji var9 = var1.a(var2 + 1, var3, var4);
      aji var10 = var1.a(var2 - 1, var3, var4 - 1);
      aji var11 = var1.a(var2 + 1, var3, var4 - 1);
      aji var12 = var1.a(var2 + 1, var3, var4 + 1);
      aji var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this || var9 == this;
      boolean var15 = var6 == this || var7 == this;
      boolean var16 = var10 == this || var11 == this || var12 == this || var13 == this;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            aji var19 = var1.a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if(var19 == ajn.ak) {
               var20 = 1.0F;
               if(var1.e(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if(var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public void g() {
      float var1 = 0.125F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.F = (double)((float)(var1.e(var2, var3, var4) * 2 + 2) / 16.0F);
      float var5 = 0.125F;
      this.a(0.5F - var5, 0.0F, 0.5F - var5, 0.5F + var5, (float)this.F, 0.5F + var5);
   }

   public int b() {
      return 19;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if(!var1.E) {
         adb var8 = null;
         if(this.a == ajn.aK) {
            var8 = ade.bb;
         }

         if(this.a == ajn.ba) {
            var8 = ade.bc;
         }

         for(int var9 = 0; var9 < 3; ++var9) {
            if(var1.s.nextInt(15) <= var5) {
               this.a(var1, var2, var3, var4, new add(var8));
            }
         }

      }
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }

   public int a(Random var1) {
      return 1;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      return var1.e(var2, var3, var4) != 7;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      this.m(var1, var3, var4, var5);
   }
}
