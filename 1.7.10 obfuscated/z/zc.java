import java.util.List;

public class zc extends sa implements zh {

   private int d = -1;
   private int e = -1;
   private int f = -1;
   private aji g;
   private int h;
   private boolean i;
   public int a;
   public int b;
   public sa c;
   private int at;
   private int au;
   private double av = 2.0D;
   private int aw;


   public zc(ahb var1) {
      super(var1);
      this.j = 10.0D;
      this.a(0.5F, 0.5F);
   }

   public zc(ahb var1, double var2, double var4, double var6) {
      super(var1);
      this.j = 10.0D;
      this.a(0.5F, 0.5F);
      this.b(var2, var4, var6);
      this.L = 0.0F;
   }

   public zc(ahb var1, sv var2, sv var3, float var4, float var5) {
      super(var1);
      this.j = 10.0D;
      this.c = var2;
      if(var2 instanceof yz) {
         this.a = 1;
      }

      this.t = var2.t + (double)var2.g() - 0.10000000149011612D;
      double var6 = var3.s - var2.s;
      double var8 = var3.C.b + (double)(var3.N / 3.0F) - this.t;
      double var10 = var3.u - var2.u;
      double var12 = (double)qh.a(var6 * var6 + var10 * var10);
      if(var12 >= 1.0E-7D) {
         float var14 = (float)(Math.atan2(var10, var6) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var15 = (float)(-(Math.atan2(var8, var12) * 180.0D / 3.1415927410125732D));
         double var16 = var6 / var12;
         double var18 = var10 / var12;
         this.b(var2.s + var16, this.t, var2.u + var18, var14, var15);
         this.L = 0.0F;
         float var20 = (float)var12 * 0.2F;
         this.c(var6, var8 + (double)var20, var10, var4, var5);
      }
   }

   public zc(ahb var1, sv var2, float var3) {
      super(var1);
      this.j = 10.0D;
      this.c = var2;
      if(var2 instanceof yz) {
         this.a = 1;
      }

      this.a(0.5F, 0.5F);
      this.b(var2.s, var2.t + (double)var2.g(), var2.u, var2.y, var2.z);
      this.s -= (double)(qh.b(this.y / 180.0F * 3.1415927F) * 0.16F);
      this.t -= 0.10000000149011612D;
      this.u -= (double)(qh.a(this.y / 180.0F * 3.1415927F) * 0.16F);
      this.b(this.s, this.t, this.u);
      this.L = 0.0F;
      this.v = (double)(-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F));
      this.x = (double)(qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F));
      this.w = (double)(-qh.a(this.z / 180.0F * 3.1415927F));
      this.c(this.v, this.w, this.x, var3 * 1.5F, 1.0F);
   }

   protected void c() {
      this.af.a(16, Byte.valueOf((byte)0));
   }

   public void c(double var1, double var3, double var5, float var7, float var8) {
      float var9 = qh.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.Z.nextGaussian() * (double)(this.Z.nextBoolean()?-1:1) * 0.007499999832361937D * (double)var8;
      var3 += this.Z.nextGaussian() * (double)(this.Z.nextBoolean()?-1:1) * 0.007499999832361937D * (double)var8;
      var5 += this.Z.nextGaussian() * (double)(this.Z.nextBoolean()?-1:1) * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.v = var1;
      this.w = var3;
      this.x = var5;
      float var10 = qh.a(var1 * var1 + var5 * var5);
      this.A = this.y = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.B = this.z = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.at = 0;
   }

   public void h() {
      super.h();
      if(this.B == 0.0F && this.A == 0.0F) {
         float var1 = qh.a(this.v * this.v + this.x * this.x);
         this.A = this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);
         this.B = this.z = (float)(Math.atan2(this.w, (double)var1) * 180.0D / 3.1415927410125732D);
      }

      aji var16 = this.o.a(this.d, this.e, this.f);
      if(var16.o() != awt.a) {
         var16.a((ahl)this.o, this.d, this.e, this.f);
         azt var2 = var16.a(this.o, this.d, this.e, this.f);
         if(var2 != null && var2.a(azw.a(this.s, this.t, this.u))) {
            this.i = true;
         }
      }

      if(this.b > 0) {
         --this.b;
      }

      if(this.i) {
         int var18 = this.o.e(this.d, this.e, this.f);
         if(var16 == this.g && var18 == this.h) {
            ++this.at;
            if(this.at == 1200) {
               this.B();
            }

         } else {
            this.i = false;
            this.v *= (double)(this.Z.nextFloat() * 0.2F);
            this.w *= (double)(this.Z.nextFloat() * 0.2F);
            this.x *= (double)(this.Z.nextFloat() * 0.2F);
            this.at = 0;
            this.au = 0;
         }
      } else {
         ++this.au;
         azw var17 = azw.a(this.s, this.t, this.u);
         azw var3 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
         azu var4 = this.o.a(var17, var3, false, true, false);
         var17 = azw.a(this.s, this.t, this.u);
         var3 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
         if(var4 != null) {
            var3 = azw.a(var4.f.a, var4.f.b, var4.f.c);
         }

         sa var5 = null;
         List var6 = this.o.b((sa)this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
         double var7 = 0.0D;

         int var9;
         float var11;
         for(var9 = 0; var9 < var6.size(); ++var9) {
            sa var10 = (sa)var6.get(var9);
            if(var10.R() && (var10 != this.c || this.au >= 5)) {
               var11 = 0.3F;
               azt var12 = var10.C.b((double)var11, (double)var11, (double)var11);
               azu var13 = var12.a(var17, var3);
               if(var13 != null) {
                  double var14 = var17.d(var13.f);
                  if(var14 < var7 || var7 == 0.0D) {
                     var5 = var10;
                     var7 = var14;
                  }
               }
            }
         }

         if(var5 != null) {
            var4 = new azu(var5);
         }

         if(var4 != null && var4.g != null && var4.g instanceof yz) {
            yz var19 = (yz)var4.g;
            if(var19.bE.a || this.c instanceof yz && !((yz)this.c).a(var19)) {
               var4 = null;
            }
         }

         float var20;
         float var26;
         if(var4 != null) {
            if(var4.g != null) {
               var20 = qh.a(this.v * this.v + this.w * this.w + this.x * this.x);
               int var21 = qh.f((double)var20 * this.av);
               if(this.f()) {
                  var21 += this.Z.nextInt(var21 / 2 + 2);
               }

               ro var23 = null;
               if(this.c == null) {
                  var23 = ro.a(this, this);
               } else {
                  var23 = ro.a(this, this.c);
               }

               if(this.al() && !(var4.g instanceof ya)) {
                  var4.g.e(5);
               }

               if(var4.g.a(var23, (float)var21)) {
                  if(var4.g instanceof sv) {
                     sv var24 = (sv)var4.g;
                     if(!this.o.E) {
                        var24.p(var24.aZ() + 1);
                     }

                     if(this.aw > 0) {
                        var26 = qh.a(this.v * this.v + this.x * this.x);
                        if(var26 > 0.0F) {
                           var4.g.g(this.v * (double)this.aw * 0.6000000238418579D / (double)var26, 0.1D, this.x * (double)this.aw * 0.6000000238418579D / (double)var26);
                        }
                     }

                     if(this.c != null && this.c instanceof sv) {
                        afv.a(var24, this.c);
                        afv.b((sv)this.c, (sa)var24);
                     }

                     if(this.c != null && var4.g != this.c && var4.g instanceof yz && this.c instanceof mw) {
                        ((mw)this.c).a.a((ft)(new gv(6, 0.0F)));
                     }
                  }

                  this.a("random.bowhit", 1.0F, 1.2F / (this.Z.nextFloat() * 0.2F + 0.9F));
                  if(!(var4.g instanceof ya)) {
                     this.B();
                  }
               } else {
                  this.v *= -0.10000000149011612D;
                  this.w *= -0.10000000149011612D;
                  this.x *= -0.10000000149011612D;
                  this.y += 180.0F;
                  this.A += 180.0F;
                  this.au = 0;
               }
            } else {
               this.d = var4.b;
               this.e = var4.c;
               this.f = var4.d;
               this.g = this.o.a(this.d, this.e, this.f);
               this.h = this.o.e(this.d, this.e, this.f);
               this.v = (double)((float)(var4.f.a - this.s));
               this.w = (double)((float)(var4.f.b - this.t));
               this.x = (double)((float)(var4.f.c - this.u));
               var20 = qh.a(this.v * this.v + this.w * this.w + this.x * this.x);
               this.s -= this.v / (double)var20 * 0.05000000074505806D;
               this.t -= this.w / (double)var20 * 0.05000000074505806D;
               this.u -= this.x / (double)var20 * 0.05000000074505806D;
               this.a("random.bowhit", 1.0F, 1.2F / (this.Z.nextFloat() * 0.2F + 0.9F));
               this.i = true;
               this.b = 7;
               this.a(false);
               if(this.g.o() != awt.a) {
                  this.g.a(this.o, this.d, this.e, this.f, (sa)this);
               }
            }
         }

         if(this.f()) {
            for(var9 = 0; var9 < 4; ++var9) {
               this.o.a("crit", this.s + this.v * (double)var9 / 4.0D, this.t + this.w * (double)var9 / 4.0D, this.u + this.x * (double)var9 / 4.0D, -this.v, -this.w + 0.2D, -this.x);
            }
         }

         this.s += this.v;
         this.t += this.w;
         this.u += this.x;
         var20 = qh.a(this.v * this.v + this.x * this.x);
         this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);

         for(this.z = (float)(Math.atan2(this.w, (double)var20) * 180.0D / 3.1415927410125732D); this.z - this.B < -180.0F; this.B -= 360.0F) {
            ;
         }

         while(this.z - this.B >= 180.0F) {
            this.B += 360.0F;
         }

         while(this.y - this.A < -180.0F) {
            this.A -= 360.0F;
         }

         while(this.y - this.A >= 180.0F) {
            this.A += 360.0F;
         }

         this.z = this.B + (this.z - this.B) * 0.2F;
         this.y = this.A + (this.y - this.A) * 0.2F;
         float var22 = 0.99F;
         var11 = 0.05F;
         if(this.M()) {
            for(int var25 = 0; var25 < 4; ++var25) {
               var26 = 0.25F;
               this.o.a("bubble", this.s - this.v * (double)var26, this.t - this.w * (double)var26, this.u - this.x * (double)var26, this.v, this.w, this.x);
            }

            var22 = 0.8F;
         }

         if(this.L()) {
            this.F();
         }

         this.v *= (double)var22;
         this.w *= (double)var22;
         this.x *= (double)var22;
         this.w -= (double)var11;
         this.b(this.s, this.t, this.u);
         this.I();
      }
   }

   public void b(dh var1) {
      var1.a("xTile", (short)this.d);
      var1.a("yTile", (short)this.e);
      var1.a("zTile", (short)this.f);
      var1.a("life", (short)this.at);
      var1.a("inTile", (byte)aji.b(this.g));
      var1.a("inData", (byte)this.h);
      var1.a("shake", (byte)this.b);
      var1.a("inGround", (byte)(this.i?1:0));
      var1.a("pickup", (byte)this.a);
      var1.a("damage", this.av);
   }

   public void a(dh var1) {
      this.d = var1.e("xTile");
      this.e = var1.e("yTile");
      this.f = var1.e("zTile");
      this.at = var1.e("life");
      this.g = aji.e(var1.d("inTile") & 255);
      this.h = var1.d("inData") & 255;
      this.b = var1.d("shake") & 255;
      this.i = var1.d("inGround") == 1;
      if(var1.b("damage", 99)) {
         this.av = var1.i("damage");
      }

      if(var1.b("pickup", 99)) {
         this.a = var1.d("pickup");
      } else if(var1.b("player", 99)) {
         this.a = var1.n("player")?1:0;
      }

   }

   public void b_(yz var1) {
      if(!this.o.E && this.i && this.b <= 0) {
         boolean var2 = this.a == 1 || this.a == 2 && var1.bE.d;
         if(this.a == 1 && !var1.bm.a(new add(ade.g, 1))) {
            var2 = false;
         }

         if(var2) {
            this.a("random.pop", 0.2F, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.a((sa)this, 1);
            this.B();
         }

      }
   }

   protected boolean g_() {
      return false;
   }

   public void b(double var1) {
      this.av = var1;
   }

   public double e() {
      return this.av;
   }

   public void a(int var1) {
      this.aw = var1;
   }

   public boolean av() {
      return false;
   }

   public void a(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public boolean f() {
      byte var1 = this.af.a(16);
      return (var1 & 1) != 0;
   }
}
