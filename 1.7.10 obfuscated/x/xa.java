import java.util.Iterator;
import java.util.List;

public class xa extends sw implements wx, yb {

   public double h;
   public double i;
   public double bm;
   public double[][] bn = new double[64][3];
   public int bo = -1;
   public wy[] bp;
   public wy bq;
   public wy br;
   public wy bs;
   public wy bt;
   public wy bu;
   public wy bv;
   public wy bw;
   public float bx;
   public float by;
   public boolean bz;
   public boolean bA;
   private sa bD;
   public int bB;
   public wz bC;


   public xa(ahb var1) {
      super(var1);
      this.bp = new wy[]{this.bq = new wy(this, "head", 6.0F, 6.0F), this.br = new wy(this, "body", 8.0F, 8.0F), this.bs = new wy(this, "tail", 4.0F, 4.0F), this.bt = new wy(this, "tail", 4.0F, 4.0F), this.bu = new wy(this, "tail", 4.0F, 4.0F), this.bv = new wy(this, "wing", 4.0F, 4.0F), this.bw = new wy(this, "wing", 4.0F, 4.0F)};
      this.g(this.aY());
      this.a(16.0F, 8.0F);
      this.X = true;
      this.ae = true;
      this.i = 100.0D;
      this.ak = true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(200.0D);
   }

   protected void c() {
      super.c();
   }

   public double[] b(int var1, float var2) {
      if(this.aS() <= 0.0F) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.bo - var1 * 1 & 63;
      int var4 = this.bo - var1 * 1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.bn[var3][0];
      double var8 = qh.g(this.bn[var4][0] - var6);
      var5[0] = var6 + var8 * (double)var2;
      var6 = this.bn[var3][1];
      var8 = this.bn[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = this.bn[var3][2] + (this.bn[var4][2] - this.bn[var3][2]) * (double)var2;
      return var5;
   }

   public void e() {
      float var1;
      float var2;
      if(this.o.E) {
         var1 = qh.b(this.by * 3.1415927F * 2.0F);
         var2 = qh.b(this.bx * 3.1415927F * 2.0F);
         if(var2 <= -0.3F && var1 >= -0.3F) {
            this.o.a(this.s, this.t, this.u, "mob.enderdragon.wings", 5.0F, 0.8F + this.Z.nextFloat() * 0.3F, false);
         }
      }

      this.bx = this.by;
      float var3;
      if(this.aS() <= 0.0F) {
         var1 = (this.Z.nextFloat() - 0.5F) * 8.0F;
         var2 = (this.Z.nextFloat() - 0.5F) * 4.0F;
         var3 = (this.Z.nextFloat() - 0.5F) * 8.0F;
         this.o.a("largeexplode", this.s + (double)var1, this.t + 2.0D + (double)var2, this.u + (double)var3, 0.0D, 0.0D, 0.0D);
      } else {
         this.bP();
         var1 = 0.2F / (qh.a(this.v * this.v + this.x * this.x) * 10.0F + 1.0F);
         var1 *= (float)Math.pow(2.0D, this.w);
         if(this.bA) {
            this.by += var1 * 0.5F;
         } else {
            this.by += var1;
         }

         this.y = qh.g(this.y);
         if(this.bo < 0) {
            for(int var25 = 0; var25 < this.bn.length; ++var25) {
               this.bn[var25][0] = (double)this.y;
               this.bn[var25][1] = this.t;
            }
         }

         if(++this.bo == this.bn.length) {
            this.bo = 0;
         }

         this.bn[this.bo][0] = (double)this.y;
         this.bn[this.bo][1] = this.t;
         double var4;
         double var6;
         double var8;
         double var26;
         float var31;
         if(this.o.E) {
            if(this.bg > 0) {
               var26 = this.s + (this.bh - this.s) / (double)this.bg;
               var4 = this.t + (this.bi - this.t) / (double)this.bg;
               var6 = this.u + (this.bj - this.u) / (double)this.bg;
               var8 = qh.g(this.bk - (double)this.y);
               this.y = (float)((double)this.y + var8 / (double)this.bg);
               this.z = (float)((double)this.z + (this.bl - (double)this.z) / (double)this.bg);
               --this.bg;
               this.b(var26, var4, var6);
               this.b(this.y, this.z);
            }
         } else {
            var26 = this.h - this.s;
            var4 = this.i - this.t;
            var6 = this.bm - this.u;
            var8 = var26 * var26 + var4 * var4 + var6 * var6;
            if(this.bD != null) {
               this.h = this.bD.s;
               this.bm = this.bD.u;
               double var10 = this.h - this.s;
               double var12 = this.bm - this.u;
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               double var16 = 0.4000000059604645D + var14 / 80.0D - 1.0D;
               if(var16 > 10.0D) {
                  var16 = 10.0D;
               }

               this.i = this.bD.C.b + var16;
            } else {
               this.h += this.Z.nextGaussian() * 2.0D;
               this.bm += this.Z.nextGaussian() * 2.0D;
            }

            if(this.bz || var8 < 100.0D || var8 > 22500.0D || this.E || this.F) {
               this.bQ();
            }

            var4 /= (double)qh.a(var26 * var26 + var6 * var6);
            var31 = 0.6F;
            if(var4 < (double)(-var31)) {
               var4 = (double)(-var31);
            }

            if(var4 > (double)var31) {
               var4 = (double)var31;
            }

            this.w += var4 * 0.10000000149011612D;
            this.y = qh.g(this.y);
            double var11 = 180.0D - Math.atan2(var26, var6) * 180.0D / 3.1415927410125732D;
            double var13 = qh.g(var11 - (double)this.y);
            if(var13 > 50.0D) {
               var13 = 50.0D;
            }

            if(var13 < -50.0D) {
               var13 = -50.0D;
            }

            azw var15 = azw.a(this.h - this.s, this.i - this.t, this.bm - this.u).a();
            azw var39 = azw.a((double)qh.a(this.y * 3.1415927F / 180.0F), this.w, (double)(-qh.b(this.y * 3.1415927F / 180.0F))).a();
            float var17 = (float)(var39.b(var15) + 0.5D) / 1.5F;
            if(var17 < 0.0F) {
               var17 = 0.0F;
            }

            this.bf *= 0.8F;
            float var18 = qh.a(this.v * this.v + this.x * this.x) * 1.0F + 1.0F;
            double var19 = Math.sqrt(this.v * this.v + this.x * this.x) * 1.0D + 1.0D;
            if(var19 > 40.0D) {
               var19 = 40.0D;
            }

            this.bf = (float)((double)this.bf + var13 * (0.699999988079071D / var19 / (double)var18));
            this.y += this.bf * 0.1F;
            float var21 = (float)(2.0D / (var19 + 1.0D));
            float var22 = 0.06F;
            this.a(0.0F, -1.0F, var22 * (var17 * var21 + (1.0F - var21)));
            if(this.bA) {
               this.d(this.v * 0.800000011920929D, this.w * 0.800000011920929D, this.x * 0.800000011920929D);
            } else {
               this.d(this.v, this.w, this.x);
            }

            azw var23 = azw.a(this.v, this.w, this.x).a();
            float var24 = (float)(var23.b(var39) + 1.0D) / 2.0F;
            var24 = 0.8F + 0.15F * var24;
            this.v *= (double)var24;
            this.x *= (double)var24;
            this.w *= 0.9100000262260437D;
         }

         this.aM = this.y;
         this.bq.M = this.bq.N = 3.0F;
         this.bs.M = this.bs.N = 2.0F;
         this.bt.M = this.bt.N = 2.0F;
         this.bu.M = this.bu.N = 2.0F;
         this.br.N = 3.0F;
         this.br.M = 5.0F;
         this.bv.N = 2.0F;
         this.bv.M = 4.0F;
         this.bw.N = 3.0F;
         this.bw.M = 4.0F;
         var2 = (float)(this.b(5, 1.0F)[1] - this.b(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
         var3 = qh.b(var2);
         float var27 = -qh.a(var2);
         float var5 = this.y * 3.1415927F / 180.0F;
         float var28 = qh.a(var5);
         float var7 = qh.b(var5);
         this.br.h();
         this.br.b(this.s + (double)(var28 * 0.5F), this.t, this.u - (double)(var7 * 0.5F), 0.0F, 0.0F);
         this.bv.h();
         this.bv.b(this.s + (double)(var7 * 4.5F), this.t + 2.0D, this.u + (double)(var28 * 4.5F), 0.0F, 0.0F);
         this.bw.h();
         this.bw.b(this.s - (double)(var7 * 4.5F), this.t + 2.0D, this.u - (double)(var28 * 4.5F), 0.0F, 0.0F);
         if(!this.o.E && this.ax == 0) {
            this.a(this.o.b((sa)this, this.bv.C.b(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
            this.a(this.o.b((sa)this, this.bw.C.b(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
            this.b(this.o.b((sa)this, this.bq.C.b(1.0D, 1.0D, 1.0D)));
         }

         double[] var29 = this.b(5, 1.0F);
         double[] var9 = this.b(0, 1.0F);
         var31 = qh.a(this.y * 3.1415927F / 180.0F - this.bf * 0.01F);
         float var33 = qh.b(this.y * 3.1415927F / 180.0F - this.bf * 0.01F);
         this.bq.h();
         this.bq.b(this.s + (double)(var31 * 5.5F * var3), this.t + (var9[1] - var29[1]) * 1.0D + (double)(var27 * 5.5F), this.u - (double)(var33 * 5.5F * var3), 0.0F, 0.0F);

         for(int var30 = 0; var30 < 3; ++var30) {
            wy var32 = null;
            if(var30 == 0) {
               var32 = this.bs;
            }

            if(var30 == 1) {
               var32 = this.bt;
            }

            if(var30 == 2) {
               var32 = this.bu;
            }

            double[] var34 = this.b(12 + var30 * 2, 1.0F);
            float var35 = this.y * 3.1415927F / 180.0F + this.b(var34[0] - var29[0]) * 3.1415927F / 180.0F * 1.0F;
            float var36 = qh.a(var35);
            float var37 = qh.b(var35);
            float var38 = 1.5F;
            float var40 = (float)(var30 + 1) * 2.0F;
            var32.h();
            var32.b(this.s - (double)((var28 * var38 + var36 * var40) * var3), this.t + (var34[1] - var29[1]) * 1.0D - (double)((var40 + var38) * var27) + 1.5D, this.u + (double)((var7 * var38 + var37 * var40) * var3), 0.0F, 0.0F);
         }

         if(!this.o.E) {
            this.bA = this.a(this.bq.C) | this.a(this.br.C);
         }

      }
   }

   private void bP() {
      if(this.bC != null) {
         if(this.bC.K) {
            if(!this.o.E) {
               this.a(this.bq, ro.a((agw)null), 10.0F);
            }

            this.bC = null;
         } else if(this.aa % 10 == 0 && this.aS() < this.aY()) {
            this.g(this.aS() + 1.0F);
         }
      }

      if(this.Z.nextInt(10) == 0) {
         float var1 = 32.0F;
         List var2 = this.o.a(wz.class, this.C.b((double)var1, (double)var1, (double)var1));
         wz var3 = null;
         double var4 = Double.MAX_VALUE;
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            wz var7 = (wz)var6.next();
            double var8 = var7.f(this);
            if(var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }

         this.bC = var3;
      }

   }

   private void a(List var1) {
      double var2 = (this.br.C.a + this.br.C.d) / 2.0D;
      double var4 = (this.br.C.c + this.br.C.f) / 2.0D;
      Iterator var6 = var1.iterator();

      while(var6.hasNext()) {
         sa var7 = (sa)var6.next();
         if(var7 instanceof sv) {
            double var8 = var7.s - var2;
            double var10 = var7.u - var4;
            double var12 = var8 * var8 + var10 * var10;
            var7.g(var8 / var12 * 4.0D, 0.20000000298023224D, var10 / var12 * 4.0D);
         }
      }

   }

   private void b(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         sa var3 = (sa)var1.get(var2);
         if(var3 instanceof sv) {
            var3.a(ro.a((sv)this), 10.0F);
         }
      }

   }

   private void bQ() {
      this.bz = false;
      if(this.Z.nextInt(2) == 0 && !this.o.h.isEmpty()) {
         this.bD = (sa)this.o.h.get(this.Z.nextInt(this.o.h.size()));
      } else {
         boolean var1 = false;

         do {
            this.h = 0.0D;
            this.i = (double)(70.0F + this.Z.nextFloat() * 50.0F);
            this.bm = 0.0D;
            this.h += (double)(this.Z.nextFloat() * 120.0F - 60.0F);
            this.bm += (double)(this.Z.nextFloat() * 120.0F - 60.0F);
            double var2 = this.s - this.h;
            double var4 = this.t - this.i;
            double var6 = this.u - this.bm;
            var1 = var2 * var2 + var4 * var4 + var6 * var6 > 100.0D;
         } while(!var1);

         this.bD = null;
      }

   }

   private float b(double var1) {
      return (float)qh.g(var1);
   }

   private boolean a(azt var1) {
      int var2 = qh.c(var1.a);
      int var3 = qh.c(var1.b);
      int var4 = qh.c(var1.c);
      int var5 = qh.c(var1.d);
      int var6 = qh.c(var1.e);
      int var7 = qh.c(var1.f);
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var2; var10 <= var5; ++var10) {
         for(int var11 = var3; var11 <= var6; ++var11) {
            for(int var12 = var4; var12 <= var7; ++var12) {
               aji var13 = this.o.a(var10, var11, var12);
               if(var13.o() != awt.a) {
                  if(var13 != ajn.Z && var13 != ajn.bs && var13 != ajn.h && this.o.O().b("mobGriefing")) {
                     var9 = this.o.f(var10, var11, var12) || var9;
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if(var9) {
         double var16 = var1.a + (var1.d - var1.a) * (double)this.Z.nextFloat();
         double var17 = var1.b + (var1.e - var1.b) * (double)this.Z.nextFloat();
         double var14 = var1.c + (var1.f - var1.c) * (double)this.Z.nextFloat();
         this.o.a("largeexplode", var16, var17, var14, 0.0D, 0.0D, 0.0D);
      }

      return var8;
   }

   public boolean a(wy var1, ro var2, float var3) {
      if(var1 != this.bq) {
         var3 = var3 / 4.0F + 1.0F;
      }

      float var4 = this.y * 3.1415927F / 180.0F;
      float var5 = qh.a(var4);
      float var6 = qh.b(var4);
      this.h = this.s + (double)(var5 * 5.0F) + (double)((this.Z.nextFloat() - 0.5F) * 2.0F);
      this.i = this.t + (double)(this.Z.nextFloat() * 3.0F) + 1.0D;
      this.bm = this.u - (double)(var6 * 5.0F) + (double)((this.Z.nextFloat() - 0.5F) * 2.0F);
      this.bD = null;
      if(var2.j() instanceof yz || var2.c()) {
         this.e(var2, var3);
      }

      return true;
   }

   public boolean a(ro var1, float var2) {
      return false;
   }

   protected boolean e(ro var1, float var2) {
      return super.a(var1, var2);
   }

   protected void aF() {
      ++this.bB;
      if(this.bB >= 180 && this.bB <= 200) {
         float var1 = (this.Z.nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.Z.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.Z.nextFloat() - 0.5F) * 8.0F;
         this.o.a("hugeexplosion", this.s + (double)var1, this.t + 2.0D + (double)var2, this.u + (double)var3, 0.0D, 0.0D, 0.0D);
      }

      int var4;
      int var5;
      if(!this.o.E) {
         if(this.bB > 150 && this.bB % 5 == 0) {
            var4 = 1000;

            while(var4 > 0) {
               var5 = sq.a(var4);
               var4 -= var5;
               this.o.d((sa)(new sq(this.o, this.s, this.t, this.u, var5)));
            }
         }

         if(this.bB == 1) {
            this.o.b(1018, (int)this.s, (int)this.t, (int)this.u, 0);
         }
      }

      this.d(0.0D, 0.10000000149011612D, 0.0D);
      this.aM = this.y += 20.0F;
      if(this.bB == 200 && !this.o.E) {
         var4 = 2000;

         while(var4 > 0) {
            var5 = sq.a(var4);
            var4 -= var5;
            this.o.d((sa)(new sq(this.o, this.s, this.t, this.u, var5)));
         }

         this.b(qh.c(this.s), qh.c(this.u));
         this.B();
      }

   }

   private void b(int var1, int var2) {
      byte var3 = 64;
      akt.a = true;
      byte var4 = 4;

      for(int var5 = var3 - 1; var5 <= var3 + 32; ++var5) {
         for(int var6 = var1 - var4; var6 <= var1 + var4; ++var6) {
            for(int var7 = var2 - var4; var7 <= var2 + var4; ++var7) {
               double var8 = (double)(var6 - var1);
               double var10 = (double)(var7 - var2);
               double var12 = var8 * var8 + var10 * var10;
               if(var12 <= ((double)var4 - 0.5D) * ((double)var4 - 0.5D)) {
                  if(var5 < var3) {
                     if(var12 <= ((double)(var4 - 1) - 0.5D) * ((double)(var4 - 1) - 0.5D)) {
                        this.o.b(var6, var5, var7, ajn.h);
                     }
                  } else if(var5 > var3) {
                     this.o.b(var6, var5, var7, ajn.a);
                  } else if(var12 > ((double)(var4 - 1) - 0.5D) * ((double)(var4 - 1) - 0.5D)) {
                     this.o.b(var6, var5, var7, ajn.h);
                  } else {
                     this.o.b(var6, var5, var7, ajn.bq);
                  }
               }
            }
         }
      }

      this.o.b(var1, var3 + 0, var2, ajn.h);
      this.o.b(var1, var3 + 1, var2, ajn.h);
      this.o.b(var1, var3 + 2, var2, ajn.h);
      this.o.b(var1 - 1, var3 + 2, var2, ajn.aa);
      this.o.b(var1 + 1, var3 + 2, var2, ajn.aa);
      this.o.b(var1, var3 + 2, var2 - 1, ajn.aa);
      this.o.b(var1, var3 + 2, var2 + 1, ajn.aa);
      this.o.b(var1, var3 + 3, var2, ajn.h);
      this.o.b(var1, var3 + 4, var2, ajn.bt);
      akt.a = false;
   }

   protected void w() {}

   public sa[] at() {
      return this.bp;
   }

   public boolean R() {
      return false;
   }

   public ahb a() {
      return this.o;
   }

   protected String t() {
      return "mob.enderdragon.growl";
   }

   protected String aT() {
      return "mob.enderdragon.hit";
   }

   protected float bf() {
      return 5.0F;
   }
}
