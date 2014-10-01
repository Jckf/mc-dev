import java.util.List;
import java.util.Random;

public class aqz implements apu {

   private Random i;
   private awk j;
   private awk k;
   private awk l;
   private awl m;
   public awk a;
   public awk b;
   public awk c;
   private ahb n;
   private final boolean o;
   private ahm p;
   private final double[] q;
   private final float[] r;
   private double[] s = new double[256];
   private aqx t = new aqw();
   private aug u = new aug();
   private avn v = new avn();
   private asw w = new asw();
   private atx x = new atx();
   private aqx y = new aqs();
   private ahu[] z;
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   int[][] h = new int[32][32];


   public aqz(ahb var1, long var2, boolean var4) {
      this.n = var1;
      this.o = var4;
      this.p = var1.N().u();
      this.i = new Random(var2);
      this.j = new awk(this.i, 16);
      this.k = new awk(this.i, 16);
      this.l = new awk(this.i, 8);
      this.m = new awl(this.i, 4);
      this.a = new awk(this.i, 10);
      this.b = new awk(this.i, 16);
      this.c = new awk(this.i, 8);
      this.q = new double[825];
      this.r = new float[25];

      for(int var5 = -2; var5 <= 2; ++var5) {
         for(int var6 = -2; var6 <= 2; ++var6) {
            float var7 = 10.0F / qh.c((float)(var5 * var5 + var6 * var6) + 0.2F);
            this.r[var5 + 2 + (var6 + 2) * 5] = var7;
         }
      }

   }

   public void a(int var1, int var2, aji[] var3) {
      byte var4 = 63;
      this.z = this.n.v().a(this.z, var1 * 4 - 2, var2 * 4 - 2, 10, 10);
      this.a(var1 * 4, 0, var2 * 4);

      for(int var5 = 0; var5 < 4; ++var5) {
         int var6 = var5 * 5;
         int var7 = (var5 + 1) * 5;

         for(int var8 = 0; var8 < 4; ++var8) {
            int var9 = (var6 + var8) * 33;
            int var10 = (var6 + var8 + 1) * 33;
            int var11 = (var7 + var8) * 33;
            int var12 = (var7 + var8 + 1) * 33;

            for(int var13 = 0; var13 < 32; ++var13) {
               double var14 = 0.125D;
               double var16 = this.q[var9 + var13];
               double var18 = this.q[var10 + var13];
               double var20 = this.q[var11 + var13];
               double var22 = this.q[var12 + var13];
               double var24 = (this.q[var9 + var13 + 1] - var16) * var14;
               double var26 = (this.q[var10 + var13 + 1] - var18) * var14;
               double var28 = (this.q[var11 + var13 + 1] - var20) * var14;
               double var30 = (this.q[var12 + var13 + 1] - var22) * var14;

               for(int var32 = 0; var32 < 8; ++var32) {
                  double var33 = 0.25D;
                  double var35 = var16;
                  double var37 = var18;
                  double var39 = (var20 - var16) * var33;
                  double var41 = (var22 - var18) * var33;

                  for(int var43 = 0; var43 < 4; ++var43) {
                     int var44 = var43 + var5 * 4 << 12 | 0 + var8 * 4 << 8 | var13 * 8 + var32;
                     short var45 = 256;
                     var44 -= var45;
                     double var46 = 0.25D;
                     double var50 = (var37 - var35) * var46;
                     double var48 = var35 - var50;

                     for(int var52 = 0; var52 < 4; ++var52) {
                        if((var48 += var50) > 0.0D) {
                           var3[var44 += var45] = ajn.b;
                        } else if(var13 * 8 + var32 < var4) {
                           var3[var44 += var45] = ajn.j;
                        } else {
                           var3[var44 += var45] = null;
                        }
                     }

                     var35 += var39;
                     var37 += var41;
                  }

                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
                  var22 += var30;
               }
            }
         }
      }

   }

   public void a(int var1, int var2, aji[] var3, byte[] var4, ahu[] var5) {
      double var6 = 0.03125D;
      this.s = this.m.a(this.s, (double)(var1 * 16), (double)(var2 * 16), 16, 16, var6 * 2.0D, var6 * 2.0D, 1.0D);

      for(int var8 = 0; var8 < 16; ++var8) {
         for(int var9 = 0; var9 < 16; ++var9) {
            ahu var10 = var5[var9 + var8 * 16];
            var10.a(this.n, this.i, var3, var4, var1 * 16 + var8, var2 * 16 + var9, this.s[var9 + var8 * 16]);
         }
      }

   }

   public apx c(int var1, int var2) {
      return this.d(var1, var2);
   }

   public apx d(int var1, int var2) {
      this.i.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      aji[] var3 = new aji[65536];
      byte[] var4 = new byte[65536];
      this.a(var1, var2, var3);
      this.z = this.n.v().b(this.z, var1 * 16, var2 * 16, 16, 16);
      this.a(var1, var2, var3, var4, this.z);
      this.t.a(this, this.n, var1, var2, var3);
      this.y.a(this, this.n, var1, var2, var3);
      if(this.o) {
         this.w.a(this, this.n, var1, var2, var3);
         this.v.a(this, this.n, var1, var2, var3);
         this.u.a(this, this.n, var1, var2, var3);
         this.x.a(this, this.n, var1, var2, var3);
      }

      apx var5 = new apx(this.n, var3, var4, var1, var2);
      byte[] var6 = var5.m();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)this.z[var7].ay;
      }

      var5.b();
      return var5;
   }

   private void a(int var1, int var2, int var3) {
      double var4 = 684.412D;
      double var6 = 684.412D;
      double var8 = 512.0D;
      double var10 = 512.0D;
      this.g = this.b.a(this.g, var1, var3, 5, 5, 200.0D, 200.0D, 0.5D);
      this.d = this.l.a(this.d, var1, var2, var3, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
      this.e = this.j.a(this.e, var1, var2, var3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
      this.f = this.k.a(this.f, var1, var2, var3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
      boolean var45 = false;
      boolean var44 = false;
      int var12 = 0;
      int var13 = 0;
      double var14 = 8.5D;

      for(int var16 = 0; var16 < 5; ++var16) {
         for(int var17 = 0; var17 < 5; ++var17) {
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;
            byte var21 = 2;
            ahu var22 = this.z[var16 + 2 + (var17 + 2) * 10];

            for(int var23 = -var21; var23 <= var21; ++var23) {
               for(int var24 = -var21; var24 <= var21; ++var24) {
                  ahu var25 = this.z[var16 + var23 + 2 + (var17 + var24 + 2) * 10];
                  float var26 = var25.am;
                  float var27 = var25.an;
                  if(this.p == ahm.e && var26 > 0.0F) {
                     var26 = 1.0F + var26 * 2.0F;
                     var27 = 1.0F + var27 * 4.0F;
                  }

                  float var28 = this.r[var23 + 2 + (var24 + 2) * 5] / (var26 + 2.0F);
                  if(var25.am > var22.am) {
                     var28 /= 2.0F;
                  }

                  var18 += var27 * var28;
                  var19 += var26 * var28;
                  var20 += var28;
               }
            }

            var18 /= var20;
            var19 /= var20;
            var18 = var18 * 0.9F + 0.1F;
            var19 = (var19 * 4.0F - 1.0F) / 8.0F;
            double var46 = this.g[var13] / 8000.0D;
            if(var46 < 0.0D) {
               var46 = -var46 * 0.3D;
            }

            var46 = var46 * 3.0D - 2.0D;
            if(var46 < 0.0D) {
               var46 /= 2.0D;
               if(var46 < -1.0D) {
                  var46 = -1.0D;
               }

               var46 /= 1.4D;
               var46 /= 2.0D;
            } else {
               if(var46 > 1.0D) {
                  var46 = 1.0D;
               }

               var46 /= 8.0D;
            }

            ++var13;
            double var47 = (double)var19;
            double var48 = (double)var18;
            var47 += var46 * 0.2D;
            var47 = var47 * 8.5D / 8.0D;
            double var29 = 8.5D + var47 * 4.0D;

            for(int var31 = 0; var31 < 33; ++var31) {
               double var32 = ((double)var31 - var29) * 12.0D * 128.0D / 256.0D / var48;
               if(var32 < 0.0D) {
                  var32 *= 4.0D;
               }

               double var34 = this.e[var12] / 512.0D;
               double var36 = this.f[var12] / 512.0D;
               double var38 = (this.d[var12] / 10.0D + 1.0D) / 2.0D;
               double var40 = qh.b(var34, var36, var38) - var32;
               if(var31 > 29) {
                  double var42 = (double)((float)(var31 - 29) / 3.0F);
                  var40 = var40 * (1.0D - var42) + -10.0D * var42;
               }

               this.q[var12] = var40;
               ++var12;
            }
         }
      }

   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void a(apu var1, int var2, int var3) {
      akx.M = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      ahu var6 = this.n.a(var4 + 16, var5 + 16);
      this.i.setSeed(this.n.H());
      long var7 = this.i.nextLong() / 2L * 2L + 1L;
      long var9 = this.i.nextLong() / 2L * 2L + 1L;
      this.i.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.n.H());
      boolean var11 = false;
      if(this.o) {
         this.w.a(this.n, this.i, var2, var3);
         var11 = this.v.a(this.n, this.i, var2, var3);
         this.u.a(this.n, this.i, var2, var3);
         this.x.a(this.n, this.i, var2, var3);
      }

      int var12;
      int var13;
      int var14;
      if(var6 != ahu.q && var6 != ahu.F && !var11 && this.i.nextInt(4) == 0) {
         var12 = var4 + this.i.nextInt(16) + 8;
         var13 = this.i.nextInt(256);
         var14 = var5 + this.i.nextInt(16) + 8;
         (new arx(ajn.j)).a(this.n, this.i, var12, var13, var14);
      }

      if(!var11 && this.i.nextInt(8) == 0) {
         var12 = var4 + this.i.nextInt(16) + 8;
         var13 = this.i.nextInt(this.i.nextInt(248) + 8);
         var14 = var5 + this.i.nextInt(16) + 8;
         if(var13 < 63 || this.i.nextInt(10) == 0) {
            (new arx(ajn.l)).a(this.n, this.i, var12, var13, var14);
         }
      }

      for(var12 = 0; var12 < 8; ++var12) {
         var13 = var4 + this.i.nextInt(16) + 8;
         var14 = this.i.nextInt(256);
         int var15 = var5 + this.i.nextInt(16) + 8;
         (new asd()).a(this.n, this.i, var13, var14, var15);
      }

      var6.a(this.n, this.i, var4, var5);
      aho.a(this.n, var6, var4 + 8, var5 + 8, 16, 16, this.i);
      var4 += 8;
      var5 += 8;

      for(var12 = 0; var12 < 16; ++var12) {
         for(var13 = 0; var13 < 16; ++var13) {
            var14 = this.n.h(var4 + var12, var5 + var13);
            if(this.n.r(var12 + var4, var14 - 1, var13 + var5)) {
               this.n.d(var12 + var4, var14 - 1, var13 + var5, ajn.aD, 0, 2);
            }

            if(this.n.e(var12 + var4, var14, var13 + var5, true)) {
               this.n.d(var12 + var4, var14, var13 + var5, ajn.aC, 0, 2);
            }
         }
      }

      akx.M = false;
   }

   public boolean a(boolean var1, qk var2) {
      return true;
   }

   public void c() {}

   public boolean d() {
      return false;
   }

   public boolean e() {
      return true;
   }

   public String f() {
      return "RandomLevelSource";
   }

   public List a(sx var1, int var2, int var3, int var4) {
      ahu var5 = this.n.a(var2, var4);
      return var1 == sx.a && this.x.a(var2, var3, var4)?this.x.b():var5.a(var1);
   }

   public agt a(ahb var1, String var2, int var3, int var4, int var5) {
      return "Stronghold".equals(var2) && this.u != null?this.u.a(var1, var3, var4, var5):null;
   }

   public int g() {
      return 0;
   }

   public void e(int var1, int var2) {
      if(this.o) {
         this.w.a(this, this.n, var1, var2, (aji[])null);
         this.v.a(this, this.n, var1, var2, (aji[])null);
         this.u.a(this, this.n, var1, var2, (aji[])null);
         this.x.a(this, this.n, var1, var2, (aji[])null);
      }

   }
}
