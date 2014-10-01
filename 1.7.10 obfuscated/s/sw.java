import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public abstract class sw extends sv {

   public int a_;
   protected int b;
   private tu h;
   private tv i;
   private tt bm;
   private tr bn;
   private vv bo;
   protected final uj c;
   protected final uj d;
   private sv bp;
   private vw bq;
   private add[] br = new add[5];
   protected float[] e = new float[5];
   private boolean bs;
   private boolean bt;
   protected float f;
   private sa bu;
   protected int g;
   private boolean bv;
   private sa bw;
   private dh bx;


   public sw(ahb var1) {
      super(var1);
      this.c = new uj(var1 != null && var1.C != null?var1.C:null);
      this.d = new uj(var1 != null && var1.C != null?var1.C:null);
      this.h = new tu(this);
      this.i = new tv(this);
      this.bm = new tt(this);
      this.bn = new tr(this);
      this.bo = new vv(this, var1);
      this.bq = new vw(this);

      for(int var2 = 0; var2 < this.e.length; ++var2) {
         this.e[var2] = 0.085F;
      }

   }

   protected void aD() {
      super.aD();
      this.bc().b(yj.b).a(16.0D);
   }

   public tu j() {
      return this.h;
   }

   public tv k() {
      return this.i;
   }

   public tt l() {
      return this.bm;
   }

   public vv m() {
      return this.bo;
   }

   public vw n() {
      return this.bq;
   }

   public sv o() {
      return this.bp;
   }

   public void d(sv var1) {
      this.bp = var1;
   }

   public boolean a(Class var1) {
      return xz.class != var1 && yd.class != var1;
   }

   public void p() {}

   protected void c() {
      super.c();
      this.af.a(11, Byte.valueOf((byte)0));
      this.af.a(10, "");
   }

   public int q() {
      return 80;
   }

   public void r() {
      String var1 = this.t();
      if(var1 != null) {
         this.a(var1, this.bf(), this.bg());
      }

   }

   public void C() {
      super.C();
      this.o.C.a("mobBaseTick");
      if(this.Z() && this.Z.nextInt(1000) < this.a_++) {
         this.a_ = -this.q();
         this.r();
      }

      this.o.C.b();
   }

   protected int e(yz var1) {
      if(this.b > 0) {
         int var2 = this.b;
         add[] var3 = this.ak();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if(var3[var4] != null && this.e[var4] <= 1.0F) {
               var2 += 1 + this.Z.nextInt(3);
            }
         }

         return var2;
      } else {
         return this.b;
      }
   }

   public void s() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.Z.nextGaussian() * 0.02D;
         double var4 = this.Z.nextGaussian() * 0.02D;
         double var6 = this.Z.nextGaussian() * 0.02D;
         double var8 = 10.0D;
         this.o.a("explode", this.s + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M - var2 * var8, this.t + (double)(this.Z.nextFloat() * this.N) - var4 * var8, this.u + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M - var6 * var8, var2, var4, var6);
      }

   }

   public void h() {
      super.h();
      if(!this.o.E) {
         this.bL();
      }

   }

   protected float f(float var1, float var2) {
      if(this.bk()) {
         this.bn.a();
         return var2;
      } else {
         return super.f(var1, var2);
      }
   }

   protected String t() {
      return null;
   }

   protected adb u() {
      return adb.d(0);
   }

   protected void b(boolean var1, int var2) {
      adb var3 = this.u();
      if(var3 != null) {
         int var4 = this.Z.nextInt(3);
         if(var2 > 0) {
            var4 += this.Z.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.a(var3, 1);
         }
      }

   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("CanPickUpLoot", this.bJ());
      var1.a("PersistenceRequired", this.bt);
      dq var2 = new dq();

      dh var4;
      for(int var3 = 0; var3 < this.br.length; ++var3) {
         var4 = new dh();
         if(this.br[var3] != null) {
            this.br[var3].b(var4);
         }

         var2.a((dy)var4);
      }

      var1.a("Equipment", (dy)var2);
      dq var6 = new dq();

      for(int var7 = 0; var7 < this.e.length; ++var7) {
         var6.a((dy)(new dm(this.e[var7])));
      }

      var1.a("DropChances", (dy)var6);
      var1.a("CustomName", this.bG());
      var1.a("CustomNameVisible", this.bI());
      var1.a("Leashed", this.bv);
      if(this.bw != null) {
         var4 = new dh();
         if(this.bw instanceof sv) {
            var4.a("UUIDMost", this.bw.aB().getMostSignificantBits());
            var4.a("UUIDLeast", this.bw.aB().getLeastSignificantBits());
         } else if(this.bw instanceof ss) {
            ss var5 = (ss)this.bw;
            var4.a("X", var5.b);
            var4.a("Y", var5.c);
            var4.a("Z", var5.d);
         }

         var1.a("Leash", (dy)var4);
      }

   }

   public void a(dh var1) {
      super.a(var1);
      this.h(var1.n("CanPickUpLoot"));
      this.bt = var1.n("PersistenceRequired");
      if(var1.b("CustomName", 8) && var1.j("CustomName").length() > 0) {
         this.a(var1.j("CustomName"));
      }

      this.g(var1.n("CustomNameVisible"));
      dq var2;
      int var3;
      if(var1.b("Equipment", 9)) {
         var2 = var1.c("Equipment", 10);

         for(var3 = 0; var3 < this.br.length; ++var3) {
            this.br[var3] = add.a(var2.b(var3));
         }
      }

      if(var1.b("DropChances", 9)) {
         var2 = var1.c("DropChances", 5);

         for(var3 = 0; var3 < var2.c(); ++var3) {
            this.e[var3] = var2.e(var3);
         }
      }

      this.bv = var1.n("Leashed");
      if(this.bv && var1.b("Leash", 10)) {
         this.bx = var1.m("Leash");
      }

   }

   public void n(float var1) {
      this.be = var1;
   }

   public void i(float var1) {
      super.i(var1);
      this.n(var1);
   }

   public void e() {
      super.e();
      this.o.C.a("looting");
      if(!this.o.E && this.bJ() && !this.aT && this.o.O().b("mobGriefing")) {
         List var1 = this.o.a(xk.class, this.C.b(1.0D, 0.0D, 1.0D));
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            xk var3 = (xk)var2.next();
            if(!var3.K && var3.f() != null) {
               add var4 = var3.f();
               int var5 = b(var4);
               if(var5 > -1) {
                  boolean var6 = true;
                  add var7 = this.q(var5);
                  if(var7 != null) {
                     if(var5 == 0) {
                        if(var4.b() instanceof aeh && !(var7.b() instanceof aeh)) {
                           var6 = true;
                        } else if(var4.b() instanceof aeh && var7.b() instanceof aeh) {
                           aeh var8 = (aeh)var4.b();
                           aeh var9 = (aeh)var7.b();
                           if(var8.i() == var9.i()) {
                              var6 = var4.k() > var7.k() || var4.p() && !var7.p();
                           } else {
                              var6 = var8.i() > var9.i();
                           }
                        } else {
                           var6 = false;
                        }
                     } else if(var4.b() instanceof abb && !(var7.b() instanceof abb)) {
                        var6 = true;
                     } else if(var4.b() instanceof abb && var7.b() instanceof abb) {
                        abb var10 = (abb)var4.b();
                        abb var12 = (abb)var7.b();
                        if(var10.c == var12.c) {
                           var6 = var4.k() > var7.k() || var4.p() && !var7.p();
                        } else {
                           var6 = var10.c > var12.c;
                        }
                     } else {
                        var6 = false;
                     }
                  }

                  if(var6) {
                     if(var7 != null && this.Z.nextFloat() - 0.1F < this.e[var5]) {
                        this.a(var7, 0.0F);
                     }

                     if(var4.b() == ade.i && var3.j() != null) {
                        yz var11 = this.o.a(var3.j());
                        if(var11 != null) {
                           var11.a((ph)pc.x);
                        }
                     }

                     this.c(var5, var4);
                     this.e[var5] = 2.0F;
                     this.bt = true;
                     this.a(var3, 1);
                     var3.B();
                  }
               }
            }
         }
      }

      this.o.C.b();
   }

   protected boolean bk() {
      return false;
   }

   protected boolean v() {
      return true;
   }

   protected void w() {
      if(this.bt) {
         this.aU = 0;
      } else {
         yz var1 = this.o.a(this, -1.0D);
         if(var1 != null) {
            double var2 = var1.s - this.s;
            double var4 = var1.t - this.t;
            double var6 = var1.u - this.u;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            if(this.v() && var8 > 16384.0D) {
               this.B();
            }

            if(this.aU > 600 && this.Z.nextInt(800) == 0 && var8 > 1024.0D && this.v()) {
               this.B();
            } else if(var8 < 1024.0D) {
               this.aU = 0;
            }
         }

      }
   }

   protected void bn() {
      ++this.aU;
      this.o.C.a("checkDespawn");
      this.w();
      this.o.C.b();
      this.o.C.a("sensing");
      this.bq.a();
      this.o.C.b();
      this.o.C.a("targetSelector");
      this.d.a();
      this.o.C.b();
      this.o.C.a("goalSelector");
      this.c.a();
      this.o.C.b();
      this.o.C.a("navigation");
      this.bo.f();
      this.o.C.b();
      this.o.C.a("mob tick");
      this.bp();
      this.o.C.b();
      this.o.C.a("controls");
      this.o.C.a("move");
      this.i.c();
      this.o.C.c("look");
      this.h.a();
      this.o.C.c("jump");
      this.bm.b();
      this.o.C.b();
      this.o.C.b();
   }

   protected void bq() {
      super.bq();
      this.bd = 0.0F;
      this.be = 0.0F;
      this.w();
      float var1 = 8.0F;
      if(this.Z.nextFloat() < 0.02F) {
         yz var2 = this.o.a(this, (double)var1);
         if(var2 != null) {
            this.bu = var2;
            this.g = 10 + this.Z.nextInt(20);
         } else {
            this.bf = (this.Z.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if(this.bu != null) {
         this.a(this.bu, 10.0F, (float)this.x());
         if(this.g-- <= 0 || this.bu.K || this.bu.f((sa)this) > (double)(var1 * var1)) {
            this.bu = null;
         }
      } else {
         if(this.Z.nextFloat() < 0.05F) {
            this.bf = (this.Z.nextFloat() - 0.5F) * 20.0F;
         }

         this.y += this.bf;
         this.z = this.f;
      }

      boolean var4 = this.M();
      boolean var3 = this.P();
      if(var4 || var3) {
         this.bc = this.Z.nextFloat() < 0.8F;
      }

   }

   public int x() {
      return 40;
   }

   public void a(sa var1, float var2, float var3) {
      double var4 = var1.s - this.s;
      double var8 = var1.u - this.u;
      double var6;
      if(var1 instanceof sv) {
         sv var10 = (sv)var1;
         var6 = var10.t + (double)var10.g() - (this.t + (double)this.g());
      } else {
         var6 = (var1.C.b + var1.C.e) / 2.0D - (this.t + (double)this.g());
      }

      double var14 = (double)qh.a(var4 * var4 + var8 * var8);
      float var12 = (float)(Math.atan2(var8, var4) * 180.0D / 3.1415927410125732D) - 90.0F;
      float var13 = (float)(-(Math.atan2(var6, var14) * 180.0D / 3.1415927410125732D));
      this.z = this.b(this.z, var13, var3);
      this.y = this.b(this.y, var12, var2);
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

   public boolean by() {
      return this.o.b(this.C) && this.o.a((sa)this, this.C).isEmpty() && !this.o.d(this.C);
   }

   public int bB() {
      return 4;
   }

   public int ax() {
      if(this.o() == null) {
         return 3;
      } else {
         int var1 = (int)(this.aS() - this.aY() * 0.33F);
         var1 -= (3 - this.o.r.a()) * 4;
         if(var1 < 0) {
            var1 = 0;
         }

         return var1 + 3;
      }
   }

   public add be() {
      return this.br[0];
   }

   public add q(int var1) {
      return this.br[var1];
   }

   public add r(int var1) {
      return this.br[var1 + 1];
   }

   public void c(int var1, add var2) {
      this.br[var1] = var2;
   }

   public add[] ak() {
      return this.br;
   }

   protected void a(boolean var1, int var2) {
      for(int var3 = 0; var3 < this.ak().length; ++var3) {
         add var4 = this.q(var3);
         boolean var5 = this.e[var3] > 1.0F;
         if(var4 != null && (var1 || var5) && this.Z.nextFloat() - (float)var2 * 0.01F < this.e[var3]) {
            if(!var5 && var4.g()) {
               int var6 = Math.max(var4.l() - 25, 1);
               int var7 = var4.l() - this.Z.nextInt(this.Z.nextInt(var6) + 1);
               if(var7 > var6) {
                  var7 = var6;
               }

               if(var7 < 1) {
                  var7 = 1;
               }

               var4.b(var7);
            }

            this.a(var4, 0.0F);
         }
      }

   }

   protected void bC() {
      if(this.Z.nextFloat() < 0.15F * this.o.b(this.s, this.t, this.u)) {
         int var1 = this.Z.nextInt(2);
         float var2 = this.o.r == rd.d?0.1F:0.25F;
         if(this.Z.nextFloat() < 0.095F) {
            ++var1;
         }

         if(this.Z.nextFloat() < 0.095F) {
            ++var1;
         }

         if(this.Z.nextFloat() < 0.095F) {
            ++var1;
         }

         for(int var3 = 3; var3 >= 0; --var3) {
            add var4 = this.r(var3);
            if(var3 < 3 && this.Z.nextFloat() < var2) {
               break;
            }

            if(var4 == null) {
               adb var5 = a(var3 + 1, var1);
               if(var5 != null) {
                  this.c(var3 + 1, new add(var5));
               }
            }
         }
      }

   }

   public static int b(add var0) {
      if(var0.b() != adb.a(ajn.aK) && var0.b() != ade.bL) {
         if(var0.b() instanceof abb) {
            switch(((abb)var0.b()).b) {
            case 0:
               return 4;
            case 1:
               return 3;
            case 2:
               return 2;
            case 3:
               return 1;
            }
         }

         return 0;
      } else {
         return 4;
      }
   }

   public static adb a(int var0, int var1) {
      switch(var0) {
      case 4:
         if(var1 == 0) {
            return ade.Q;
         } else if(var1 == 1) {
            return ade.ag;
         } else if(var1 == 2) {
            return ade.U;
         } else if(var1 == 3) {
            return ade.Y;
         } else if(var1 == 4) {
            return ade.ac;
         }
      case 3:
         if(var1 == 0) {
            return ade.R;
         } else if(var1 == 1) {
            return ade.ah;
         } else if(var1 == 2) {
            return ade.V;
         } else if(var1 == 3) {
            return ade.Z;
         } else if(var1 == 4) {
            return ade.ad;
         }
      case 2:
         if(var1 == 0) {
            return ade.S;
         } else if(var1 == 1) {
            return ade.ai;
         } else if(var1 == 2) {
            return ade.W;
         } else if(var1 == 3) {
            return ade.aa;
         } else if(var1 == 4) {
            return ade.ae;
         }
      case 1:
         if(var1 == 0) {
            return ade.T;
         } else if(var1 == 1) {
            return ade.aj;
         } else if(var1 == 2) {
            return ade.X;
         } else if(var1 == 3) {
            return ade.ab;
         } else if(var1 == 4) {
            return ade.af;
         }
      default:
         return null;
      }
   }

   protected void bD() {
      float var1 = this.o.b(this.s, this.t, this.u);
      if(this.be() != null && this.Z.nextFloat() < 0.25F * var1) {
         afv.a(this.Z, this.be(), (int)(5.0F + var1 * (float)this.Z.nextInt(18)));
      }

      for(int var2 = 0; var2 < 4; ++var2) {
         add var3 = this.r(var2);
         if(var3 != null && this.Z.nextFloat() < 0.5F * var1) {
            afv.a(this.Z, var3, (int)(5.0F + var1 * (float)this.Z.nextInt(18)));
         }
      }

   }

   public sy a(sy var1) {
      this.a(yj.b).a(new tj("Random spawn bonus", this.Z.nextGaussian() * 0.05D, 1));
      return var1;
   }

   public boolean bE() {
      return false;
   }

   public String b_() {
      return this.bH()?this.bG():super.b_();
   }

   public void bF() {
      this.bt = true;
   }

   public void a(String var1) {
      this.af.b(10, var1);
   }

   public String bG() {
      return this.af.e(10);
   }

   public boolean bH() {
      return this.af.e(10).length() > 0;
   }

   public void g(boolean var1) {
      this.af.b(11, Byte.valueOf((byte)(var1?1:0)));
   }

   public boolean bI() {
      return this.af.a(11) == 1;
   }

   public void a(int var1, float var2) {
      this.e[var1] = var2;
   }

   public boolean bJ() {
      return this.bs;
   }

   public void h(boolean var1) {
      this.bs = var1;
   }

   public boolean bK() {
      return this.bt;
   }

   public final boolean c(yz var1) {
      if(this.bN() && this.bO() == var1) {
         this.a(true, !var1.bE.d);
         return true;
      } else {
         add var2 = var1.bm.h();
         if(var2 != null && var2.b() == ade.ca && this.bM()) {
            if(!(this instanceof tg) || !((tg)this).bZ()) {
               this.b(var1, true);
               --var2.b;
               return true;
            }

            if(((tg)this).e(var1)) {
               this.b(var1, true);
               --var2.b;
               return true;
            }
         }

         return this.a(var1)?true:super.c(var1);
      }
   }

   protected boolean a(yz var1) {
      return false;
   }

   protected void bL() {
      if(this.bx != null) {
         this.bP();
      }

      if(this.bv) {
         if(this.bw == null || this.bw.K) {
            this.a(true, true);
         }
      }
   }

   public void a(boolean var1, boolean var2) {
      if(this.bv) {
         this.bv = false;
         this.bw = null;
         if(!this.o.E && var2) {
            this.a(ade.ca, 1);
         }

         if(!this.o.E && var1 && this.o instanceof mt) {
            ((mt)this.o).r().a((sa)this, (ft)(new hx(1, this, (sa)null)));
         }
      }

   }

   public boolean bM() {
      return !this.bN() && !(this instanceof yb);
   }

   public boolean bN() {
      return this.bv;
   }

   public sa bO() {
      return this.bw;
   }

   public void b(sa var1, boolean var2) {
      this.bv = true;
      this.bw = var1;
      if(!this.o.E && var2 && this.o instanceof mt) {
         ((mt)this.o).r().a((sa)this, (ft)(new hx(1, this, this.bw)));
      }

   }

   private void bP() {
      if(this.bv && this.bx != null) {
         if(this.bx.b("UUIDMost", 4) && this.bx.b("UUIDLeast", 4)) {
            UUID var5 = new UUID(this.bx.g("UUIDMost"), this.bx.g("UUIDLeast"));
            List var6 = this.o.a(sv.class, this.C.b(10.0D, 10.0D, 10.0D));
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               sv var8 = (sv)var7.next();
               if(var8.aB().equals(var5)) {
                  this.bw = var8;
                  break;
               }
            }
         } else if(this.bx.b("X", 99) && this.bx.b("Y", 99) && this.bx.b("Z", 99)) {
            int var1 = this.bx.f("X");
            int var2 = this.bx.f("Y");
            int var3 = this.bx.f("Z");
            su var4 = su.b(this.o, var1, var2, var3);
            if(var4 == null) {
               var4 = su.a(this.o, var1, var2, var3);
            }

            this.bw = var4;
         } else {
            this.a(false, true);
         }
      }

      this.bx = null;
   }
}
