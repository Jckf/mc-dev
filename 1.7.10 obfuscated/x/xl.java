import java.util.List;
import net.minecraft.server.MinecraftServer;

public abstract class xl extends sa {

   private boolean a;
   private String b;
   private static final int[][][] c = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int d;
   private double e;
   private double f;
   private double g;
   private double h;
   private double i;


   public xl(ahb var1) {
      super(var1);
      this.k = true;
      this.a(0.98F, 0.7F);
      this.L = this.N / 2.0F;
   }

   public static xl a(ahb var0, double var1, double var3, double var5, int var7) {
      switch(var7) {
      case 1:
         return new xm(var0, var1, var3, var5);
      case 2:
         return new xq(var0, var1, var3, var5);
      case 3:
         return new xv(var0, var1, var3, var5);
      case 4:
         return new xt(var0, var1, var3, var5);
      case 5:
         return new xr(var0, var1, var3, var5);
      case 6:
         return new xn(var0, var1, var3, var5);
      default:
         return new xs(var0, var1, var3, var5);
      }
   }

   protected boolean g_() {
      return false;
   }

   protected void c() {
      this.af.a(17, new Integer(0));
      this.af.a(18, new Integer(1));
      this.af.a(19, new Float(0.0F));
      this.af.a(20, new Integer(0));
      this.af.a(21, new Integer(6));
      this.af.a(22, Byte.valueOf((byte)0));
   }

   public azt h(sa var1) {
      return var1.S()?var1.C:null;
   }

   public azt J() {
      return null;
   }

   public boolean S() {
      return true;
   }

   public xl(ahb var1, double var2, double var4, double var6) {
      this(var1);
      this.b(var2, var4, var6);
      this.v = 0.0D;
      this.w = 0.0D;
      this.x = 0.0D;
      this.p = var2;
      this.q = var4;
      this.r = var6;
   }

   public double ae() {
      return (double)this.N * 0.0D - 0.30000001192092896D;
   }

   public boolean a(ro var1, float var2) {
      if(!this.o.E && !this.K) {
         if(this.aw()) {
            return false;
         } else {
            this.j(-this.l());
            this.c(10);
            this.Q();
            this.a(this.j() + var2 * 10.0F);
            boolean var3 = var1.j() instanceof yz && ((yz)var1.j()).bE.d;
            if(var3 || this.j() > 40.0F) {
               if(this.l != null) {
                  this.l.a((sa)this);
               }

               if(var3 && !this.k_()) {
                  this.B();
               } else {
                  this.a(var1);
               }
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public void a(ro var1) {
      this.B();
      add var2 = new add(ade.au, 1);
      if(this.b != null) {
         var2.c(this.b);
      }

      this.a(var2, 0.0F);
   }

   public boolean R() {
      return !this.K;
   }

   public void B() {
      super.B();
   }

   public void h() {
      if(this.k() > 0) {
         this.c(this.k() - 1);
      }

      if(this.j() > 0.0F) {
         this.a(this.j() - 1.0F);
      }

      if(this.t < -64.0D) {
         this.G();
      }

      int var2;
      if(!this.o.E && this.o instanceof mt) {
         this.o.C.a("portal");
         MinecraftServer var1 = ((mt)this.o).q();
         var2 = this.D();
         if(this.an) {
            if(var1.w()) {
               if(this.m == null && this.ao++ >= var2) {
                  this.ao = var2;
                  this.am = this.ai();
                  byte var3;
                  if(this.o.t.i == -1) {
                     var3 = 0;
                  } else {
                     var3 = -1;
                  }

                  this.b(var3);
               }

               this.an = false;
            }
         } else {
            if(this.ao > 0) {
               this.ao -= 4;
            }

            if(this.ao < 0) {
               this.ao = 0;
            }
         }

         if(this.am > 0) {
            --this.am;
         }

         this.o.C.b();
      }

      if(this.o.E) {
         if(this.d > 0) {
            double var19 = this.s + (this.e - this.s) / (double)this.d;
            double var21 = this.t + (this.f - this.t) / (double)this.d;
            double var5 = this.u + (this.g - this.u) / (double)this.d;
            double var7 = qh.g(this.h - (double)this.y);
            this.y = (float)((double)this.y + var7 / (double)this.d);
            this.z = (float)((double)this.z + (this.i - (double)this.z) / (double)this.d);
            --this.d;
            this.b(var19, var21, var5);
            this.b(this.y, this.z);
         } else {
            this.b(this.s, this.t, this.u);
            this.b(this.y, this.z);
         }

      } else {
         this.p = this.s;
         this.q = this.t;
         this.r = this.u;
         this.w -= 0.03999999910593033D;
         int var18 = qh.c(this.s);
         var2 = qh.c(this.t);
         int var20 = qh.c(this.u);
         if(aje.b_(this.o, var18, var2 - 1, var20)) {
            --var2;
         }

         double var4 = 0.4D;
         double var6 = 0.0078125D;
         aji var8 = this.o.a(var18, var2, var20);
         if(aje.a(var8)) {
            int var9 = this.o.e(var18, var2, var20);
            this.a(var18, var2, var20, var4, var6, var8, var9);
            if(var8 == ajn.cc) {
               this.a(var18, var2, var20, (var9 & 8) != 0);
            }
         } else {
            this.b(var4);
         }

         this.I();
         this.z = 0.0F;
         double var22 = this.p - this.s;
         double var11 = this.r - this.u;
         if(var22 * var22 + var11 * var11 > 0.001D) {
            this.y = (float)(Math.atan2(var11, var22) * 180.0D / 3.141592653589793D);
            if(this.a) {
               this.y += 180.0F;
            }
         }

         double var13 = (double)qh.g(this.y - this.A);
         if(var13 < -170.0D || var13 >= 170.0D) {
            this.y += 180.0F;
            this.a = !this.a;
         }

         this.b(this.y, this.z);
         List var15 = this.o.b((sa)this, this.C.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if(var15 != null && !var15.isEmpty()) {
            for(int var16 = 0; var16 < var15.size(); ++var16) {
               sa var17 = (sa)var15.get(var16);
               if(var17 != this.l && var17.S() && var17 instanceof xl) {
                  var17.g(this);
               }
            }
         }

         if(this.l != null && this.l.K) {
            if(this.l.m == this) {
               this.l.m = null;
            }

            this.l = null;
         }

      }
   }

   public void a(int var1, int var2, int var3, boolean var4) {}

   protected void b(double var1) {
      if(this.v < -var1) {
         this.v = -var1;
      }

      if(this.v > var1) {
         this.v = var1;
      }

      if(this.x < -var1) {
         this.x = -var1;
      }

      if(this.x > var1) {
         this.x = var1;
      }

      if(this.D) {
         this.v *= 0.5D;
         this.w *= 0.5D;
         this.x *= 0.5D;
      }

      this.d(this.v, this.w, this.x);
      if(!this.D) {
         this.v *= 0.949999988079071D;
         this.w *= 0.949999988079071D;
         this.x *= 0.949999988079071D;
      }

   }

   protected void a(int var1, int var2, int var3, double var4, double var6, aji var8, int var9) {
      this.R = 0.0F;
      azw var10 = this.a(this.s, this.t, this.u);
      this.t = (double)var2;
      boolean var11 = false;
      boolean var12 = false;
      if(var8 == ajn.D) {
         var11 = (var9 & 8) != 0;
         var12 = !var11;
      }

      if(((aje)var8).e()) {
         var9 &= 7;
      }

      if(var9 >= 2 && var9 <= 5) {
         this.t = (double)(var2 + 1);
      }

      if(var9 == 2) {
         this.v -= var6;
      }

      if(var9 == 3) {
         this.v += var6;
      }

      if(var9 == 4) {
         this.x += var6;
      }

      if(var9 == 5) {
         this.x -= var6;
      }

      int[][] var13 = c[var9];
      double var14 = (double)(var13[1][0] - var13[0][0]);
      double var16 = (double)(var13[1][2] - var13[0][2]);
      double var18 = Math.sqrt(var14 * var14 + var16 * var16);
      double var20 = this.v * var14 + this.x * var16;
      if(var20 < 0.0D) {
         var14 = -var14;
         var16 = -var16;
      }

      double var22 = Math.sqrt(this.v * this.v + this.x * this.x);
      if(var22 > 2.0D) {
         var22 = 2.0D;
      }

      this.v = var22 * var14 / var18;
      this.x = var22 * var16 / var18;
      double var24;
      double var26;
      double var28;
      double var30;
      if(this.l != null && this.l instanceof sv) {
         var24 = (double)((sv)this.l).be;
         if(var24 > 0.0D) {
            var26 = -Math.sin((double)(this.l.y * 3.1415927F / 180.0F));
            var28 = Math.cos((double)(this.l.y * 3.1415927F / 180.0F));
            var30 = this.v * this.v + this.x * this.x;
            if(var30 < 0.01D) {
               this.v += var26 * 0.1D;
               this.x += var28 * 0.1D;
               var12 = false;
            }
         }
      }

      if(var12) {
         var24 = Math.sqrt(this.v * this.v + this.x * this.x);
         if(var24 < 0.03D) {
            this.v *= 0.0D;
            this.w *= 0.0D;
            this.x *= 0.0D;
         } else {
            this.v *= 0.5D;
            this.w *= 0.0D;
            this.x *= 0.5D;
         }
      }

      var24 = 0.0D;
      var26 = (double)var1 + 0.5D + (double)var13[0][0] * 0.5D;
      var28 = (double)var3 + 0.5D + (double)var13[0][2] * 0.5D;
      var30 = (double)var1 + 0.5D + (double)var13[1][0] * 0.5D;
      double var32 = (double)var3 + 0.5D + (double)var13[1][2] * 0.5D;
      var14 = var30 - var26;
      var16 = var32 - var28;
      double var34;
      double var36;
      if(var14 == 0.0D) {
         this.s = (double)var1 + 0.5D;
         var24 = this.u - (double)var3;
      } else if(var16 == 0.0D) {
         this.u = (double)var3 + 0.5D;
         var24 = this.s - (double)var1;
      } else {
         var34 = this.s - var26;
         var36 = this.u - var28;
         var24 = (var34 * var14 + var36 * var16) * 2.0D;
      }

      this.s = var26 + var14 * var24;
      this.u = var28 + var16 * var24;
      this.b(this.s, this.t + (double)this.L, this.u);
      var34 = this.v;
      var36 = this.x;
      if(this.l != null) {
         var34 *= 0.75D;
         var36 *= 0.75D;
      }

      if(var34 < -var4) {
         var34 = -var4;
      }

      if(var34 > var4) {
         var34 = var4;
      }

      if(var36 < -var4) {
         var36 = -var4;
      }

      if(var36 > var4) {
         var36 = var4;
      }

      this.d(var34, 0.0D, var36);
      if(var13[0][1] != 0 && qh.c(this.s) - var1 == var13[0][0] && qh.c(this.u) - var3 == var13[0][2]) {
         this.b(this.s, this.t + (double)var13[0][1], this.u);
      } else if(var13[1][1] != 0 && qh.c(this.s) - var1 == var13[1][0] && qh.c(this.u) - var3 == var13[1][2]) {
         this.b(this.s, this.t + (double)var13[1][1], this.u);
      }

      this.i();
      azw var38 = this.a(this.s, this.t, this.u);
      if(var38 != null && var10 != null) {
         double var39 = (var10.b - var38.b) * 0.05D;
         var22 = Math.sqrt(this.v * this.v + this.x * this.x);
         if(var22 > 0.0D) {
            this.v = this.v / var22 * (var22 + var39);
            this.x = this.x / var22 * (var22 + var39);
         }

         this.b(this.s, var38.b, this.u);
      }

      int var45 = qh.c(this.s);
      int var40 = qh.c(this.u);
      if(var45 != var1 || var40 != var3) {
         var22 = Math.sqrt(this.v * this.v + this.x * this.x);
         this.v = var22 * (double)(var45 - var1);
         this.x = var22 * (double)(var40 - var3);
      }

      if(var11) {
         double var41 = Math.sqrt(this.v * this.v + this.x * this.x);
         if(var41 > 0.01D) {
            double var43 = 0.06D;
            this.v += this.v / var41 * var43;
            this.x += this.x / var41 * var43;
         } else if(var9 == 1) {
            if(this.o.a(var1 - 1, var2, var3).r()) {
               this.v = 0.02D;
            } else if(this.o.a(var1 + 1, var2, var3).r()) {
               this.v = -0.02D;
            }
         } else if(var9 == 0) {
            if(this.o.a(var1, var2, var3 - 1).r()) {
               this.x = 0.02D;
            } else if(this.o.a(var1, var2, var3 + 1).r()) {
               this.x = -0.02D;
            }
         }
      }

   }

   protected void i() {
      if(this.l != null) {
         this.v *= 0.996999979019165D;
         this.w *= 0.0D;
         this.x *= 0.996999979019165D;
      } else {
         this.v *= 0.9599999785423279D;
         this.w *= 0.0D;
         this.x *= 0.9599999785423279D;
      }

   }

   public azw a(double var1, double var3, double var5) {
      int var7 = qh.c(var1);
      int var8 = qh.c(var3);
      int var9 = qh.c(var5);
      if(aje.b_(this.o, var7, var8 - 1, var9)) {
         --var8;
      }

      aji var10 = this.o.a(var7, var8, var9);
      if(aje.a(var10)) {
         int var11 = this.o.e(var7, var8, var9);
         var3 = (double)var8;
         if(((aje)var10).e()) {
            var11 &= 7;
         }

         if(var11 >= 2 && var11 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var12 = c[var11];
         double var13 = 0.0D;
         double var15 = (double)var7 + 0.5D + (double)var12[0][0] * 0.5D;
         double var17 = (double)var8 + 0.5D + (double)var12[0][1] * 0.5D;
         double var19 = (double)var9 + 0.5D + (double)var12[0][2] * 0.5D;
         double var21 = (double)var7 + 0.5D + (double)var12[1][0] * 0.5D;
         double var23 = (double)var8 + 0.5D + (double)var12[1][1] * 0.5D;
         double var25 = (double)var9 + 0.5D + (double)var12[1][2] * 0.5D;
         double var27 = var21 - var15;
         double var29 = (var23 - var17) * 2.0D;
         double var31 = var25 - var19;
         if(var27 == 0.0D) {
            var1 = (double)var7 + 0.5D;
            var13 = var5 - (double)var9;
         } else if(var31 == 0.0D) {
            var5 = (double)var9 + 0.5D;
            var13 = var1 - (double)var7;
         } else {
            double var33 = var1 - var15;
            double var35 = var5 - var19;
            var13 = (var33 * var27 + var35 * var31) * 2.0D;
         }

         var1 = var15 + var27 * var13;
         var3 = var17 + var29 * var13;
         var5 = var19 + var31 * var13;
         if(var29 < 0.0D) {
            ++var3;
         }

         if(var29 > 0.0D) {
            var3 += 0.5D;
         }

         return azw.a(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void a(dh var1) {
      if(var1.n("CustomDisplayTile")) {
         this.k(var1.f("DisplayTile"));
         this.l(var1.f("DisplayData"));
         this.m(var1.f("DisplayOffset"));
      }

      if(var1.b("CustomName", 8) && var1.j("CustomName").length() > 0) {
         this.b = var1.j("CustomName");
      }

   }

   protected void b(dh var1) {
      if(this.t()) {
         var1.a("CustomDisplayTile", true);
         var1.a("DisplayTile", this.n().o() == awt.a?0:aji.b(this.n()));
         var1.a("DisplayData", this.p());
         var1.a("DisplayOffset", this.r());
      }

      if(this.b != null && this.b.length() > 0) {
         var1.a("CustomName", this.b);
      }

   }

   public void g(sa var1) {
      if(!this.o.E) {
         if(var1 != this.l) {
            if(var1 instanceof sv && !(var1 instanceof yz) && !(var1 instanceof wt) && this.m() == 0 && this.v * this.v + this.x * this.x > 0.01D && this.l == null && var1.m == null) {
               var1.a((sa)this);
            }

            double var2 = var1.s - this.s;
            double var4 = var1.u - this.u;
            double var6 = var2 * var2 + var4 * var4;
            if(var6 >= 9.999999747378752E-5D) {
               var6 = (double)qh.a(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = 1.0D / var6;
               if(var8 > 1.0D) {
                  var8 = 1.0D;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= 0.10000000149011612D;
               var4 *= 0.10000000149011612D;
               var2 *= (double)(1.0F - this.Y);
               var4 *= (double)(1.0F - this.Y);
               var2 *= 0.5D;
               var4 *= 0.5D;
               if(var1 instanceof xl) {
                  double var10 = var1.s - this.s;
                  double var12 = var1.u - this.u;
                  azw var14 = azw.a(var10, 0.0D, var12).a();
                  azw var15 = azw.a((double)qh.b(this.y * 3.1415927F / 180.0F), 0.0D, (double)qh.a(this.y * 3.1415927F / 180.0F)).a();
                  double var16 = Math.abs(var14.b(var15));
                  if(var16 < 0.800000011920929D) {
                     return;
                  }

                  double var18 = var1.v + this.v;
                  double var20 = var1.x + this.x;
                  if(((xl)var1).m() == 2 && this.m() != 2) {
                     this.v *= 0.20000000298023224D;
                     this.x *= 0.20000000298023224D;
                     this.g(var1.v - var2, 0.0D, var1.x - var4);
                     var1.v *= 0.949999988079071D;
                     var1.x *= 0.949999988079071D;
                  } else if(((xl)var1).m() != 2 && this.m() == 2) {
                     var1.v *= 0.20000000298023224D;
                     var1.x *= 0.20000000298023224D;
                     var1.g(this.v + var2, 0.0D, this.x + var4);
                     this.v *= 0.949999988079071D;
                     this.x *= 0.949999988079071D;
                  } else {
                     var18 /= 2.0D;
                     var20 /= 2.0D;
                     this.v *= 0.20000000298023224D;
                     this.x *= 0.20000000298023224D;
                     this.g(var18 - var2, 0.0D, var20 - var4);
                     var1.v *= 0.20000000298023224D;
                     var1.x *= 0.20000000298023224D;
                     var1.g(var18 + var2, 0.0D, var20 + var4);
                  }
               } else {
                  this.g(-var2, 0.0D, -var4);
                  var1.g(var2 / 4.0D, 0.0D, var4 / 4.0D);
               }
            }

         }
      }
   }

   public void a(float var1) {
      this.af.b(19, Float.valueOf(var1));
   }

   public float j() {
      return this.af.d(19);
   }

   public void c(int var1) {
      this.af.b(17, Integer.valueOf(var1));
   }

   public int k() {
      return this.af.c(17);
   }

   public void j(int var1) {
      this.af.b(18, Integer.valueOf(var1));
   }

   public int l() {
      return this.af.c(18);
   }

   public abstract int m();

   public aji n() {
      if(!this.t()) {
         return this.o();
      } else {
         int var1 = this.z().c(20) & '\uffff';
         return aji.e(var1);
      }
   }

   public aji o() {
      return ajn.a;
   }

   public int p() {
      return !this.t()?this.q():this.z().c(20) >> 16;
   }

   public int q() {
      return 0;
   }

   public int r() {
      return !this.t()?this.s():this.z().c(21);
   }

   public int s() {
      return 6;
   }

   public void k(int var1) {
      this.z().b(20, Integer.valueOf(var1 & '\uffff' | this.p() << 16));
      this.a(true);
   }

   public void l(int var1) {
      this.z().b(20, Integer.valueOf(aji.b(this.n()) & '\uffff' | var1 << 16));
      this.a(true);
   }

   public void m(int var1) {
      this.z().b(21, Integer.valueOf(var1));
      this.a(true);
   }

   public boolean t() {
      return this.z().a(22) == 1;
   }

   public void a(boolean var1) {
      this.z().b(22, Byte.valueOf((byte)(var1?1:0)));
   }

   public void a(String var1) {
      this.b = var1;
   }

   public String b_() {
      return this.b != null?this.b:super.b_();
   }

   public boolean k_() {
      return this.b != null;
   }

   public String u() {
      return this.b;
   }

}
