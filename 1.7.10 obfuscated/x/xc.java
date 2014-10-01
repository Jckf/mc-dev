import java.util.Iterator;
import java.util.List;

public class xc extends yg implements yi {

   private float[] bp = new float[2];
   private float[] bq = new float[2];
   private float[] br = new float[2];
   private float[] bs = new float[2];
   private int[] bt = new int[2];
   private int[] bu = new int[2];
   private int bv;
   private static final sj bw = new xd();


   public xc(ahb var1) {
      super(var1);
      this.g(this.aY());
      this.a(0.9F, 4.0F);
      this.ae = true;
      this.m().e(true);
      this.c.a(0, new uf(this));
      this.c.a(2, new vd(this, 1.0D, 40, 20.0F));
      this.c.a(5, new vc(this, 1.0D));
      this.c.a(6, new un(this, yz.class, 8.0F));
      this.c.a(7, new vb(this));
      this.d.a(1, new vn(this, false));
      this.d.a(2, new vo(this, sw.class, 0, false, false, bw));
      this.b = 50;
   }

   protected void c() {
      super.c();
      this.af.a(17, new Integer(0));
      this.af.a(18, new Integer(0));
      this.af.a(19, new Integer(0));
      this.af.a(20, new Integer(0));
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Invul", this.ca());
   }

   public void a(dh var1) {
      super.a(var1);
      this.s(var1.f("Invul"));
   }

   protected String t() {
      return "mob.wither.idle";
   }

   protected String aT() {
      return "mob.wither.hurt";
   }

   protected String aU() {
      return "mob.wither.death";
   }

   public void e() {
      this.w *= 0.6000000238418579D;
      double var4;
      double var6;
      double var8;
      if(!this.o.E && this.t(0) > 0) {
         sa var1 = this.o.a(this.t(0));
         if(var1 != null) {
            if(this.t < var1.t || !this.cb() && this.t < var1.t + 5.0D) {
               if(this.w < 0.0D) {
                  this.w = 0.0D;
               }

               this.w += (0.5D - this.w) * 0.6000000238418579D;
            }

            double var2 = var1.s - this.s;
            var4 = var1.u - this.u;
            var6 = var2 * var2 + var4 * var4;
            if(var6 > 9.0D) {
               var8 = (double)qh.a(var6);
               this.v += (var2 / var8 * 0.5D - this.v) * 0.6000000238418579D;
               this.x += (var4 / var8 * 0.5D - this.x) * 0.6000000238418579D;
            }
         }
      }

      if(this.v * this.v + this.x * this.x > 0.05000000074505806D) {
         this.y = (float)Math.atan2(this.x, this.v) * 57.295776F - 90.0F;
      }

      super.e();

      int var20;
      for(var20 = 0; var20 < 2; ++var20) {
         this.bs[var20] = this.bq[var20];
         this.br[var20] = this.bp[var20];
      }

      int var22;
      for(var20 = 0; var20 < 2; ++var20) {
         var22 = this.t(var20 + 1);
         sa var3 = null;
         if(var22 > 0) {
            var3 = this.o.a(var22);
         }

         if(var3 != null) {
            var4 = this.u(var20 + 1);
            var6 = this.v(var20 + 1);
            var8 = this.w(var20 + 1);
            double var10 = var3.s - var4;
            double var12 = var3.t + (double)var3.g() - var6;
            double var14 = var3.u - var8;
            double var16 = (double)qh.a(var10 * var10 + var14 * var14);
            float var18 = (float)(Math.atan2(var14, var10) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var19 = (float)(-(Math.atan2(var12, var16) * 180.0D / 3.1415927410125732D));
            this.bp[var20] = this.b(this.bp[var20], var19, 40.0F);
            this.bq[var20] = this.b(this.bq[var20], var18, 10.0F);
         } else {
            this.bq[var20] = this.b(this.bq[var20], this.aM, 10.0F);
         }
      }

      boolean var21 = this.cb();

      for(var22 = 0; var22 < 3; ++var22) {
         double var23 = this.u(var22);
         double var5 = this.v(var22);
         double var7 = this.w(var22);
         this.o.a("smoke", var23 + this.Z.nextGaussian() * 0.30000001192092896D, var5 + this.Z.nextGaussian() * 0.30000001192092896D, var7 + this.Z.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
         if(var21 && this.o.s.nextInt(4) == 0) {
            this.o.a("mobSpell", var23 + this.Z.nextGaussian() * 0.30000001192092896D, var5 + this.Z.nextGaussian() * 0.30000001192092896D, var7 + this.Z.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
         }
      }

      if(this.ca() > 0) {
         for(var22 = 0; var22 < 3; ++var22) {
            this.o.a("mobSpell", this.s + this.Z.nextGaussian() * 1.0D, this.t + (double)(this.Z.nextFloat() * 3.3F), this.u + this.Z.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
         }
      }

   }

   protected void bn() {
      int var1;
      if(this.ca() > 0) {
         var1 = this.ca() - 1;
         if(var1 <= 0) {
            this.o.a(this, this.s, this.t + (double)this.g(), this.u, 7.0F, false, this.o.O().b("mobGriefing"));
            this.o.b(1013, (int)this.s, (int)this.t, (int)this.u, 0);
         }

         this.s(var1);
         if(this.aa % 10 == 0) {
            this.f(10.0F);
         }

      } else {
         super.bn();

         int var12;
         for(var1 = 1; var1 < 3; ++var1) {
            if(this.aa >= this.bt[var1 - 1]) {
               this.bt[var1 - 1] = this.aa + 10 + this.Z.nextInt(10);
               if(this.o.r == rd.c || this.o.r == rd.d) {
                  int var10001 = var1 - 1;
                  int var10003 = this.bu[var1 - 1];
                  this.bu[var10001] = this.bu[var1 - 1] + 1;
                  if(var10003 > 15) {
                     float var2 = 10.0F;
                     float var3 = 5.0F;
                     double var4 = qh.a(this.Z, this.s - (double)var2, this.s + (double)var2);
                     double var6 = qh.a(this.Z, this.t - (double)var3, this.t + (double)var3);
                     double var8 = qh.a(this.Z, this.u - (double)var2, this.u + (double)var2);
                     this.a(var1 + 1, var4, var6, var8, true);
                     this.bu[var1 - 1] = 0;
                  }
               }

               var12 = this.t(var1);
               if(var12 > 0) {
                  sa var14 = this.o.a(var12);
                  if(var14 != null && var14.Z() && this.f(var14) <= 900.0D && this.p(var14)) {
                     this.a(var1 + 1, (sv)var14);
                     this.bt[var1 - 1] = this.aa + 40 + this.Z.nextInt(20);
                     this.bu[var1 - 1] = 0;
                  } else {
                     this.b(var1, 0);
                  }
               } else {
                  List var13 = this.o.a(sv.class, this.C.b(20.0D, 8.0D, 20.0D), bw);

                  for(int var16 = 0; var16 < 10 && !var13.isEmpty(); ++var16) {
                     sv var5 = (sv)var13.get(this.Z.nextInt(var13.size()));
                     if(var5 != this && var5.Z() && this.p(var5)) {
                        if(var5 instanceof yz) {
                           if(!((yz)var5).bE.a) {
                              this.b(var1, var5.y());
                           }
                        } else {
                           this.b(var1, var5.y());
                        }
                        break;
                     }

                     var13.remove(var5);
                  }
               }
            }
         }

         if(this.o() != null) {
            this.b(0, this.o().y());
         } else {
            this.b(0, 0);
         }

         if(this.bv > 0) {
            --this.bv;
            if(this.bv == 0 && this.o.O().b("mobGriefing")) {
               var1 = qh.c(this.t);
               var12 = qh.c(this.s);
               int var15 = qh.c(this.u);
               boolean var17 = false;

               for(int var18 = -1; var18 <= 1; ++var18) {
                  for(int var19 = -1; var19 <= 1; ++var19) {
                     for(int var7 = 0; var7 <= 3; ++var7) {
                        int var20 = var12 + var18;
                        int var9 = var1 + var7;
                        int var10 = var15 + var19;
                        aji var11 = this.o.a(var20, var9, var10);
                        if(var11.o() != awt.a && var11 != ajn.h && var11 != ajn.bq && var11 != ajn.br && var11 != ajn.bI) {
                           var17 = this.o.a(var20, var9, var10, true) || var17;
                        }
                     }
                  }
               }

               if(var17) {
                  this.o.a((yz)null, 1012, (int)this.s, (int)this.t, (int)this.u, 0);
               }
            }
         }

         if(this.aa % 20 == 0) {
            this.f(1.0F);
         }

      }
   }

   public void bZ() {
      this.s(220);
      this.g(this.aY() / 3.0F);
   }

   public void as() {}

   public int aV() {
      return 4;
   }

   private double u(int var1) {
      if(var1 <= 0) {
         return this.s;
      } else {
         float var2 = (this.aM + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = qh.b(var2);
         return this.s + (double)var3 * 1.3D;
      }
   }

   private double v(int var1) {
      return var1 <= 0?this.t + 3.0D:this.t + 2.2D;
   }

   private double w(int var1) {
      if(var1 <= 0) {
         return this.u;
      } else {
         float var2 = (this.aM + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = qh.a(var2);
         return this.u + (double)var3 * 1.3D;
      }
   }

   private float b(float var1, float var2, float var3) {
      float var4 = qh.g(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   private void a(int var1, sv var2) {
      this.a(var1, var2.s, var2.t + (double)var2.g() * 0.5D, var2.u, var1 == 0 && this.Z.nextFloat() < 0.001F);
   }

   private void a(int var1, double var2, double var4, double var6, boolean var8) {
      this.o.a((yz)null, 1014, (int)this.s, (int)this.t, (int)this.u, 0);
      double var9 = this.u(var1);
      double var11 = this.v(var1);
      double var13 = this.w(var1);
      double var15 = var2 - var9;
      double var17 = var4 - var11;
      double var19 = var6 - var13;
      zp var21 = new zp(this.o, this, var15, var17, var19);
      if(var8) {
         var21.a(true);
      }

      var21.t = var11;
      var21.s = var9;
      var21.u = var13;
      this.o.d((sa)var21);
   }

   public void a(sv var1, float var2) {
      this.a(0, var1);
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if(var1 == ro.e) {
         return false;
      } else if(this.ca() > 0) {
         return false;
      } else {
         sa var3;
         if(this.cb()) {
            var3 = var1.i();
            if(var3 instanceof zc) {
               return false;
            }
         }

         var3 = var1.j();
         if(var3 != null && !(var3 instanceof yz) && var3 instanceof sv && ((sv)var3).bd() == this.bd()) {
            return false;
         } else {
            if(this.bv <= 0) {
               this.bv = 20;
            }

            for(int var4 = 0; var4 < this.bu.length; ++var4) {
               this.bu[var4] += 3;
            }

            return super.a(var1, var2);
         }
      }
   }

   protected void b(boolean var1, int var2) {
      this.a(ade.bN, 1);
      if(!this.o.E) {
         Iterator var3 = this.o.a(yz.class, this.C.b(50.0D, 100.0D, 50.0D)).iterator();

         while(var3.hasNext()) {
            yz var4 = (yz)var3.next();
            var4.a((ph)pc.J);
         }
      }

   }

   protected void w() {
      this.aU = 0;
   }

   protected void b(float var1) {}

   public void c(rw var1) {}

   protected boolean bk() {
      return true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(300.0D);
      this.a(yj.d).a(0.6000000238418579D);
      this.a(yj.b).a(40.0D);
   }

   public int ca() {
      return this.af.c(20);
   }

   public void s(int var1) {
      this.af.b(20, Integer.valueOf(var1));
   }

   public int t(int var1) {
      return this.af.c(17 + var1);
   }

   public void b(int var1, int var2) {
      this.af.b(17 + var1, Integer.valueOf(var2));
   }

   public boolean cb() {
      return this.aS() <= this.aY() / 2.0F;
   }

   public sz bd() {
      return sz.b;
   }

   public void a(sa var1) {
      this.m = null;
   }

}
