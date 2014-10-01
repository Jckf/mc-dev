import java.util.List;
import java.util.Random;

public class ans extends aji {

   private static final int[][] a = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
   private final aji b;
   private final int M;
   private boolean N;
   private int O;


   protected ans(aji var1, int var2) {
      super(var1.J);
      this.b = var1;
      this.M = var2;
      this.c(var1.v);
      this.b(var1.w / 3.0F);
      this.a(var1.H);
      this.g(255);
      this.a(abt.b);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      if(this.N) {
         this.a(0.5F * (float)(this.O % 2), 0.5F * (float)(this.O / 2 % 2), 0.5F * (float)(this.O / 4 % 2), 0.5F + 0.5F * (float)(this.O % 2), 0.5F + 0.5F * (float)(this.O / 2 % 2), 0.5F + 0.5F * (float)(this.O / 4 % 2));
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 10;
   }

   public void e(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if((var5 & 4) != 0) {
         this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public static boolean a(aji var0) {
      return var0 instanceof ans;
   }

   private boolean f(ahl var1, int var2, int var3, int var4, int var5) {
      aji var6 = var1.a(var2, var3, var4);
      return a(var6) && var1.e(var2, var3, var4) == var5;
   }

   public boolean f(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = var5 & 3;
      float var7 = 0.5F;
      float var8 = 1.0F;
      if((var5 & 4) != 0) {
         var7 = 0.0F;
         var8 = 0.5F;
      }

      float var9 = 0.0F;
      float var10 = 1.0F;
      float var11 = 0.0F;
      float var12 = 0.5F;
      boolean var13 = true;
      aji var14;
      int var15;
      int var16;
      if(var6 == 0) {
         var9 = 0.5F;
         var12 = 1.0F;
         var14 = var1.a(var2 + 1, var3, var4);
         var15 = var1.e(var2 + 1, var3, var4);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 3 && !this.f(var1, var2, var3, var4 + 1, var5)) {
               var12 = 0.5F;
               var13 = false;
            } else if(var16 == 2 && !this.f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.5F;
               var13 = false;
            }
         }
      } else if(var6 == 1) {
         var10 = 0.5F;
         var12 = 1.0F;
         var14 = var1.a(var2 - 1, var3, var4);
         var15 = var1.e(var2 - 1, var3, var4);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 3 && !this.f(var1, var2, var3, var4 + 1, var5)) {
               var12 = 0.5F;
               var13 = false;
            } else if(var16 == 2 && !this.f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.5F;
               var13 = false;
            }
         }
      } else if(var6 == 2) {
         var11 = 0.5F;
         var12 = 1.0F;
         var14 = var1.a(var2, var3, var4 + 1);
         var15 = var1.e(var2, var3, var4 + 1);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 1 && !this.f(var1, var2 + 1, var3, var4, var5)) {
               var10 = 0.5F;
               var13 = false;
            } else if(var16 == 0 && !this.f(var1, var2 - 1, var3, var4, var5)) {
               var9 = 0.5F;
               var13 = false;
            }
         }
      } else if(var6 == 3) {
         var14 = var1.a(var2, var3, var4 - 1);
         var15 = var1.e(var2, var3, var4 - 1);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 1 && !this.f(var1, var2 + 1, var3, var4, var5)) {
               var10 = 0.5F;
               var13 = false;
            } else if(var16 == 0 && !this.f(var1, var2 - 1, var3, var4, var5)) {
               var9 = 0.5F;
               var13 = false;
            }
         }
      }

      this.a(var9, var7, var11, var10, var8, var12);
      return var13;
   }

   public boolean g(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = var5 & 3;
      float var7 = 0.5F;
      float var8 = 1.0F;
      if((var5 & 4) != 0) {
         var7 = 0.0F;
         var8 = 0.5F;
      }

      float var9 = 0.0F;
      float var10 = 0.5F;
      float var11 = 0.5F;
      float var12 = 1.0F;
      boolean var13 = false;
      aji var14;
      int var15;
      int var16;
      if(var6 == 0) {
         var14 = var1.a(var2 - 1, var3, var4);
         var15 = var1.e(var2 - 1, var3, var4);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 3 && !this.f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.0F;
               var12 = 0.5F;
               var13 = true;
            } else if(var16 == 2 && !this.f(var1, var2, var3, var4 + 1, var5)) {
               var11 = 0.5F;
               var12 = 1.0F;
               var13 = true;
            }
         }
      } else if(var6 == 1) {
         var14 = var1.a(var2 + 1, var3, var4);
         var15 = var1.e(var2 + 1, var3, var4);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var9 = 0.5F;
            var10 = 1.0F;
            var16 = var15 & 3;
            if(var16 == 3 && !this.f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.0F;
               var12 = 0.5F;
               var13 = true;
            } else if(var16 == 2 && !this.f(var1, var2, var3, var4 + 1, var5)) {
               var11 = 0.5F;
               var12 = 1.0F;
               var13 = true;
            }
         }
      } else if(var6 == 2) {
         var14 = var1.a(var2, var3, var4 - 1);
         var15 = var1.e(var2, var3, var4 - 1);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var11 = 0.0F;
            var12 = 0.5F;
            var16 = var15 & 3;
            if(var16 == 1 && !this.f(var1, var2 - 1, var3, var4, var5)) {
               var13 = true;
            } else if(var16 == 0 && !this.f(var1, var2 + 1, var3, var4, var5)) {
               var9 = 0.5F;
               var10 = 1.0F;
               var13 = true;
            }
         }
      } else if(var6 == 3) {
         var14 = var1.a(var2, var3, var4 + 1);
         var15 = var1.e(var2, var3, var4 + 1);
         if(a(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 1 && !this.f(var1, var2 - 1, var3, var4, var5)) {
               var13 = true;
            } else if(var16 == 0 && !this.f(var1, var2 + 1, var3, var4, var5)) {
               var9 = 0.5F;
               var10 = 1.0F;
               var13 = true;
            }
         }
      }

      if(var13) {
         this.a(var9, var7, var11, var10, var8, var12);
      }

      return var13;
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      this.e(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      boolean var8 = this.f(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if(var8 && this.g(var1, var2, var3, var4)) {
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {
      this.b.a(var1, var2, var3, var4, var5);
   }

   public void b(ahb var1, int var2, int var3, int var4, int var5) {
      this.b.b(var1, var2, var3, var4, var5);
   }

   public float a(sa var1) {
      return this.b.a(var1);
   }

   public int a(ahb var1) {
      return this.b.a(var1);
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5, azw var6) {
      this.b.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean v() {
      return this.b.v();
   }

   public boolean a(int var1, boolean var2) {
      return this.b.a(var1, var2);
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return this.b.c(var1, var2, var3, var4);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, ajn.a);
      this.b.b(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      this.b.a(var1, var2, var3, var4, var5, var6);
   }

   public void b(ahb var1, int var2, int var3, int var4, sa var5) {
      this.b.b(var1, var2, var3, var4, var5);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      this.b.a(var1, var2, var3, var4, var5);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      return this.b.a(var1, var2, var3, var4, var5, 0, 0.0F, 0.0F, 0.0F);
   }

   public void a(ahb var1, int var2, int var3, int var4, agw var5) {
      this.b.a(var1, var2, var3, var4, var5);
   }

   public awv f(int var1) {
      return this.b.f(this.M);
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3;
      int var8 = var1.e(var2, var3, var4) & 4;
      if(var7 == 0) {
         var1.a(var2, var3, var4, 2 | var8, 2);
      }

      if(var7 == 1) {
         var1.a(var2, var3, var4, 1 | var8, 2);
      }

      if(var7 == 2) {
         var1.a(var2, var3, var4, 3 | var8, 2);
      }

      if(var7 == 3) {
         var1.a(var2, var3, var4, 0 | var8, 2);
      }

   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      return var5 != 0 && (var5 == 1 || (double)var7 <= 0.5D)?var9:var9 | 4;
   }

   public azu a(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      azu[] var7 = new azu[8];
      int var8 = var1.e(var2, var3, var4);
      int var9 = var8 & 3;
      boolean var10 = (var8 & 4) == 4;
      int[] var11 = a[var9 + (var10?4:0)];
      this.N = true;

      int var14;
      int var15;
      int var16;
      for(int var12 = 0; var12 < 8; ++var12) {
         this.O = var12;
         int[] var13 = var11;
         var14 = var11.length;

         for(var15 = 0; var15 < var14; ++var15) {
            var16 = var13[var15];
            if(var16 == var12) {
               ;
            }
         }

         var7[var12] = super.a(var1, var2, var3, var4, var5, var6);
      }

      int[] var21 = var11;
      int var23 = var11.length;

      for(var14 = 0; var14 < var23; ++var14) {
         var15 = var21[var14];
         var7[var15] = null;
      }

      azu var22 = null;
      double var24 = 0.0D;
      azu[] var25 = var7;
      var16 = var7.length;

      for(int var17 = 0; var17 < var16; ++var17) {
         azu var18 = var25[var17];
         if(var18 != null) {
            double var19 = var18.f.e(var6);
            if(var19 > var24) {
               var22 = var18;
               var24 = var19;
            }
         }
      }

      return var22;
   }

}
