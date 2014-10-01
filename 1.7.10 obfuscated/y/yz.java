import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public abstract class yz extends sv implements ac {

   public yx bm = new yx(this);
   private aav a = new aav();
   public zs bn;
   public zs bo;
   protected zr bp = new zr();
   protected int bq;
   public float br;
   public float bs;
   public int bt;
   public double bu;
   public double bv;
   public double bw;
   public double bx;
   public double by;
   public double bz;
   protected boolean bA;
   public r bB;
   private int b;
   public float bC;
   public float bD;
   private r c;
   private boolean d;
   private r e;
   public yw bE = new yw();
   public int bF;
   public int bG;
   public float bH;
   private add f;
   private int g;
   protected float bI = 0.1F;
   protected float bJ = 0.02F;
   private int h;
   private final GameProfile i;
   public xe bK;


   public yz(ahb var1, GameProfile var2) {
      super(var1);
      this.ar = a(var2);
      this.i = var2;
      this.bn = new aap(this.bm, !var1.E, this);
      this.bo = this.bn;
      this.L = 1.62F;
      r var3 = var1.K();
      this.b((double)var3.a + 0.5D, (double)(var3.b + 1), (double)var3.c + 0.5D, 0.0F, 0.0F);
      this.aZ = 180.0F;
      this.ab = 20;
   }

   protected void aD() {
      super.aD();
      this.bc().b(yj.e).a(1.0D);
   }

   protected void c() {
      super.c();
      this.af.a(16, Byte.valueOf((byte)0));
      this.af.a(17, Float.valueOf(0.0F));
      this.af.a(18, Integer.valueOf(0));
   }

   public boolean by() {
      return this.f != null;
   }

   public void bA() {
      if(this.f != null) {
         this.f.b(this.o, this, this.g);
      }

      this.bB();
   }

   public void bB() {
      this.f = null;
      this.g = 0;
      if(!this.o.E) {
         this.e(false);
      }

   }

   public boolean bC() {
      return this.by() && this.f.b().d(this.f) == aei.d;
   }

   public void h() {
      if(this.f != null) {
         add var1 = this.bm.h();
         if(var1 == this.f) {
            if(this.g <= 25 && this.g % 4 == 0) {
               this.c(var1, 5);
            }

            if(--this.g == 0 && !this.o.E) {
               this.p();
            }
         } else {
            this.bB();
         }
      }

      if(this.bt > 0) {
         --this.bt;
      }

      if(this.bm()) {
         ++this.b;
         if(this.b > 100) {
            this.b = 100;
         }

         if(!this.o.E) {
            if(!this.j()) {
               this.a(true, true, false);
            } else if(this.o.w()) {
               this.a(false, true, true);
            }
         }
      } else if(this.b > 0) {
         ++this.b;
         if(this.b >= 110) {
            this.b = 0;
         }
      }

      super.h();
      if(!this.o.E && this.bo != null && !this.bo.a(this)) {
         this.k();
         this.bo = this.bn;
      }

      if(this.al() && this.bE.a) {
         this.F();
      }

      this.bu = this.bx;
      this.bv = this.by;
      this.bw = this.bz;
      double var9 = this.s - this.bx;
      double var3 = this.t - this.by;
      double var5 = this.u - this.bz;
      double var7 = 10.0D;
      if(var9 > var7) {
         this.bu = this.bx = this.s;
      }

      if(var5 > var7) {
         this.bw = this.bz = this.u;
      }

      if(var3 > var7) {
         this.bv = this.by = this.t;
      }

      if(var9 < -var7) {
         this.bu = this.bx = this.s;
      }

      if(var5 < -var7) {
         this.bw = this.bz = this.u;
      }

      if(var3 < -var7) {
         this.bv = this.by = this.t;
      }

      this.bx += var9 * 0.25D;
      this.bz += var5 * 0.25D;
      this.by += var3 * 0.25D;
      if(this.m == null) {
         this.e = null;
      }

      if(!this.o.E) {
         this.bp.a(this);
         this.a(pp.g, 1);
      }

   }

   public int D() {
      return this.bE.a?0:80;
   }

   protected String H() {
      return "game.player.swim";
   }

   protected String O() {
      return "game.player.swim.splash";
   }

   public int ai() {
      return 10;
   }

   public void a(String var1, float var2, float var3) {
      this.o.a(this, var1, var2, var3);
   }

   protected void c(add var1, int var2) {
      if(var1.o() == aei.c) {
         this.a("random.drink", 0.5F, this.o.s.nextFloat() * 0.1F + 0.9F);
      }

      if(var1.o() == aei.b) {
         for(int var3 = 0; var3 < var2; ++var3) {
            azw var4 = azw.a(((double)this.Z.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            var4.a(-this.z * 3.1415927F / 180.0F);
            var4.b(-this.y * 3.1415927F / 180.0F);
            azw var5 = azw.a(((double)this.Z.nextFloat() - 0.5D) * 0.3D, (double)(-this.Z.nextFloat()) * 0.6D - 0.3D, 0.6D);
            var5.a(-this.z * 3.1415927F / 180.0F);
            var5.b(-this.y * 3.1415927F / 180.0F);
            var5 = var5.c(this.s, this.t + (double)this.g(), this.u);
            String var6 = "iconcrack_" + adb.b(var1.b());
            if(var1.h()) {
               var6 = var6 + "_" + var1.k();
            }

            this.o.a(var6, var5.a, var5.b, var5.c, var4.a, var4.b + 0.05D, var4.c);
         }

         this.a("random.eat", 0.5F + 0.5F * (float)this.Z.nextInt(2), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
      }

   }

   protected void p() {
      if(this.f != null) {
         this.c(this.f, 16);
         int var1 = this.f.b;
         add var2 = this.f.b(this.o, this);
         if(var2 != this.f || var2 != null && var2.b != var1) {
            this.bm.a[this.bm.c] = var2;
            if(var2.b == 0) {
               this.bm.a[this.bm.c] = null;
            }
         }

         this.bB();
      }

   }

   protected boolean bh() {
      return this.aS() <= 0.0F || this.bm();
   }

   protected void k() {
      this.bo = this.bn;
   }

   public void a(sa var1) {
      if(this.m != null && var1 == null) {
         if(!this.o.E) {
            this.m(this.m);
         }

         if(this.m != null) {
            this.m.l = null;
         }

         this.m = null;
      } else {
         super.a(var1);
      }
   }

   public void ab() {
      if(!this.o.E && this.an()) {
         this.a((sa)null);
         this.b(false);
      } else {
         double var1 = this.s;
         double var3 = this.t;
         double var5 = this.u;
         float var7 = this.y;
         float var8 = this.z;
         super.ab();
         this.br = this.bs;
         this.bs = 0.0F;
         this.l(this.s - var1, this.t - var3, this.u - var5);
         if(this.m instanceof wo) {
            this.z = var8;
            this.y = var7;
            this.aM = ((wo)this.m).aM;
         }

      }
   }

   protected void bq() {
      super.bq();
      this.bb();
   }

   public void e() {
      if(this.bq > 0) {
         --this.bq;
      }

      if(this.o.r == rd.a && this.aS() < this.aY() && this.o.O().b("naturalRegeneration") && this.aa % 20 * 12 == 0) {
         this.f(1.0F);
      }

      this.bm.k();
      this.br = this.bs;
      super.e();
      ti var1 = this.a(yj.d);
      if(!this.o.E) {
         var1.a((double)this.bE.b());
      }

      this.aQ = this.bJ;
      if(this.ao()) {
         this.aQ = (float)((double)this.aQ + (double)this.bJ * 0.3D);
      }

      this.i((float)var1.e());
      float var2 = qh.a(this.v * this.v + this.x * this.x);
      float var3 = (float)Math.atan(-this.w * 0.20000000298023224D) * 15.0F;
      if(var2 > 0.1F) {
         var2 = 0.1F;
      }

      if(!this.D || this.aS() <= 0.0F) {
         var2 = 0.0F;
      }

      if(this.D || this.aS() <= 0.0F) {
         var3 = 0.0F;
      }

      this.bs += (var2 - this.bs) * 0.4F;
      this.aJ += (var3 - this.aJ) * 0.8F;
      if(this.aS() > 0.0F) {
         azt var4 = null;
         if(this.m != null && !this.m.K) {
            var4 = this.C.a(this.m.C).b(1.0D, 0.0D, 1.0D);
         } else {
            var4 = this.C.b(1.0D, 0.5D, 1.0D);
         }

         List var5 = this.o.b((sa)this, var4);
         if(var5 != null) {
            for(int var6 = 0; var6 < var5.size(); ++var6) {
               sa var7 = (sa)var5.get(var6);
               if(!var7.K) {
                  this.d(var7);
               }
            }
         }
      }

   }

   private void d(sa var1) {
      var1.b_(this);
   }

   public int bD() {
      return this.af.c(18);
   }

   public void c(int var1) {
      this.af.b(18, Integer.valueOf(var1));
   }

   public void s(int var1) {
      int var2 = this.bD();
      this.af.b(18, Integer.valueOf(var2 + var1));
   }

   public void a(ro var1) {
      super.a(var1);
      this.a(0.2F, 0.2F);
      this.b(this.s, this.t, this.u);
      this.w = 0.10000000149011612D;
      if(this.b_().equals("Notch")) {
         this.a(new add(ade.e, 1), true, false);
      }

      if(!this.o.O().b("keepInventory")) {
         this.bm.m();
      }

      if(var1 != null) {
         this.v = (double)(-qh.b((this.az + this.y) * 3.1415927F / 180.0F) * 0.1F);
         this.x = (double)(-qh.a((this.az + this.y) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.v = this.x = 0.0D;
      }

      this.L = 0.1F;
      this.a(pp.v, 1);
   }

   protected String aT() {
      return "game.player.hurt";
   }

   protected String aU() {
      return "game.player.die";
   }

   public void b(sa var1, int var2) {
      this.s(var2);
      Collection var3 = this.bU().a(bah.e);
      if(var1 instanceof yz) {
         this.a(pp.y, 1);
         var3.addAll(this.bU().a(bah.d));
      } else {
         this.a(pp.w, 1);
      }

      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         azx var5 = (azx)var4.next();
         azz var6 = this.bU().a(this.b_(), var5);
         var6.a();
      }

   }

   public xk a(boolean var1) {
      return this.a(this.bm.a(this.bm.c, var1 && this.bm.h() != null?this.bm.h().b:1), false, true);
   }

   public xk a(add var1, boolean var2) {
      return this.a(var1, false, false);
   }

   public xk a(add var1, boolean var2, boolean var3) {
      if(var1 == null) {
         return null;
      } else if(var1.b == 0) {
         return null;
      } else {
         xk var4 = new xk(this.o, this.s, this.t - 0.30000001192092896D + (double)this.g(), this.u, var1);
         var4.b = 40;
         if(var3) {
            var4.b(this.b_());
         }

         float var5 = 0.1F;
         float var6;
         if(var2) {
            var6 = this.Z.nextFloat() * 0.5F;
            float var7 = this.Z.nextFloat() * 3.1415927F * 2.0F;
            var4.v = (double)(-qh.a(var7) * var6);
            var4.x = (double)(qh.b(var7) * var6);
            var4.w = 0.20000000298023224D;
         } else {
            var5 = 0.3F;
            var4.v = (double)(-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * var5);
            var4.x = (double)(qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * var5);
            var4.w = (double)(-qh.a(this.z / 180.0F * 3.1415927F) * var5 + 0.1F);
            var5 = 0.02F;
            var6 = this.Z.nextFloat() * 3.1415927F * 2.0F;
            var5 *= this.Z.nextFloat();
            var4.v += Math.cos((double)var6) * (double)var5;
            var4.w += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.1F);
            var4.x += Math.sin((double)var6) * (double)var5;
         }

         this.a(var4);
         this.a(pp.s, 1);
         return var4;
      }
   }

   protected void a(xk var1) {
      this.o.d((sa)var1);
   }

   public float a(aji var1, boolean var2) {
      float var3 = this.bm.a(var1);
      if(var3 > 1.0F) {
         int var4 = afv.c(this);
         add var5 = this.bm.h();
         if(var4 > 0 && var5 != null) {
            float var6 = (float)(var4 * var4 + 1);
            if(!var5.b(var1) && var3 <= 1.0F) {
               var3 += var6 * 0.08F;
            } else {
               var3 += var6;
            }
         }
      }

      if(this.a(rv.e)) {
         var3 *= 1.0F + (float)(this.b(rv.e).c() + 1) * 0.2F;
      }

      if(this.a(rv.f)) {
         var3 *= 1.0F - (float)(this.b(rv.f).c() + 1) * 0.2F;
      }

      if(this.a(awt.h) && !afv.j(this)) {
         var3 /= 5.0F;
      }

      if(!this.D) {
         var3 /= 5.0F;
      }

      return var3;
   }

   public boolean a(aji var1) {
      return this.bm.b(var1);
   }

   public void a(dh var1) {
      super.a(var1);
      this.ar = a(this.i);
      dq var2 = var1.c("Inventory", 10);
      this.bm.b(var2);
      this.bm.c = var1.f("SelectedItemSlot");
      this.bA = var1.n("Sleeping");
      this.b = var1.e("SleepTimer");
      this.bH = var1.h("XpP");
      this.bF = var1.f("XpLevel");
      this.bG = var1.f("XpTotal");
      this.c(var1.f("Score"));
      if(this.bA) {
         this.bB = new r(qh.c(this.s), qh.c(this.t), qh.c(this.u));
         this.a(true, true, false);
      }

      if(var1.b("SpawnX", 99) && var1.b("SpawnY", 99) && var1.b("SpawnZ", 99)) {
         this.c = new r(var1.f("SpawnX"), var1.f("SpawnY"), var1.f("SpawnZ"));
         this.d = var1.n("SpawnForced");
      }

      this.bp.a(var1);
      this.bE.b(var1);
      if(var1.b("EnderItems", 9)) {
         dq var3 = var1.c("EnderItems", 10);
         this.a.a(var3);
      }

   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Inventory", (dy)this.bm.a(new dq()));
      var1.a("SelectedItemSlot", this.bm.c);
      var1.a("Sleeping", this.bA);
      var1.a("SleepTimer", (short)this.b);
      var1.a("XpP", this.bH);
      var1.a("XpLevel", this.bF);
      var1.a("XpTotal", this.bG);
      var1.a("Score", this.bD());
      if(this.c != null) {
         var1.a("SpawnX", this.c.a);
         var1.a("SpawnY", this.c.b);
         var1.a("SpawnZ", this.c.c);
         var1.a("SpawnForced", this.d);
      }

      this.bp.b(var1);
      this.bE.a(var1);
      var1.a("EnderItems", (dy)this.a.h());
   }

   public void a(rb var1) {}

   public void a(api var1) {}

   public void a(xr var1) {}

   public void a(wi var1, rb var2) {}

   public void a(int var1, int var2, int var3, String var4) {}

   public void c(int var1, int var2, int var3) {}

   public void b(int var1, int var2, int var3) {}

   public float g() {
      return 0.12F;
   }

   protected void e_() {
      this.L = 1.62F;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if(this.bE.a && !var1.g()) {
         return false;
      } else {
         this.aU = 0;
         if(this.aS() <= 0.0F) {
            return false;
         } else {
            if(this.bm() && !this.o.E) {
               this.a(true, true, false);
            }

            if(var1.r()) {
               if(this.o.r == rd.a) {
                  var2 = 0.0F;
               }

               if(this.o.r == rd.b) {
                  var2 = var2 / 2.0F + 1.0F;
               }

               if(this.o.r == rd.d) {
                  var2 = var2 * 3.0F / 2.0F;
               }
            }

            if(var2 == 0.0F) {
               return false;
            } else {
               sa var3 = var1.j();
               if(var3 instanceof zc && ((zc)var3).c != null) {
                  var3 = ((zc)var3).c;
               }

               this.a(pp.u, Math.round(var2 * 10.0F));
               return super.a(var1, var2);
            }
         }
      }
   }

   public boolean a(yz var1) {
      bae var2 = this.bt();
      bae var3 = var1.bt();
      return var2 == null?true:(!var2.a(var3)?true:var2.g());
   }

   protected void h(float var1) {
      this.bm.a(var1);
   }

   public int aV() {
      return this.bm.l();
   }

   public float bE() {
      int var1 = 0;
      add[] var2 = this.bm.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         add var5 = var2[var4];
         if(var5 != null) {
            ++var1;
         }
      }

      return (float)var1 / (float)this.bm.b.length;
   }

   protected void d(ro var1, float var2) {
      if(!this.aw()) {
         if(!var1.e() && this.bC() && var2 > 0.0F) {
            var2 = (1.0F + var2) * 0.5F;
         }

         var2 = this.b(var1, var2);
         var2 = this.c(var1, var2);
         float var3 = var2;
         var2 = Math.max(var2 - this.bs(), 0.0F);
         this.m(this.bs() - (var3 - var2));
         if(var2 != 0.0F) {
            this.a(var1.f());
            float var4 = this.aS();
            this.g(this.aS() - var2);
            this.aW().a(var1, var4, var2);
         }
      }
   }

   public void a(apg var1) {}

   public void a(apb var1) {}

   public void a(aor var1) {}

   public void a(agp var1) {}

   public void a(aov var1) {}

   public void a(aoq var1) {}

   public void a(agm var1, String var2) {}

   public void b(add var1) {}

   public boolean q(sa var1) {
      add var2 = this.bF();
      add var3 = var2 != null?var2.m():null;
      if(!var1.c(this)) {
         if(var2 != null && var1 instanceof sv) {
            if(this.bE.d) {
               var2 = var3;
            }

            if(var2.a(this, (sv)var1)) {
               if(var2.b <= 0 && !this.bE.d) {
                  this.bG();
               }

               return true;
            }
         }

         return false;
      } else {
         if(var2 != null && var2 == this.bF()) {
            if(var2.b <= 0 && !this.bE.d) {
               this.bG();
            } else if(var2.b < var3.b && this.bE.d) {
               var2.b = var3.b;
            }
         }

         return true;
      }
   }

   public add bF() {
      return this.bm.h();
   }

   public void bG() {
      this.bm.a(this.bm.c, (add)null);
   }

   public double ad() {
      return (double)(this.L - 0.5F);
   }

   public void r(sa var1) {
      if(var1.av()) {
         if(!var1.j(this)) {
            float var2 = (float)this.a(yj.e).e();
            int var3 = 0;
            float var4 = 0.0F;
            if(var1 instanceof sv) {
               var4 = afv.a((sv)this, (sv)var1);
               var3 += afv.b(this, (sv)var1);
            }

            if(this.ao()) {
               ++var3;
            }

            if(var2 > 0.0F || var4 > 0.0F) {
               boolean var5 = this.R > 0.0F && !this.D && !this.h_() && !this.M() && !this.a(rv.q) && this.m == null && var1 instanceof sv;
               if(var5 && var2 > 0.0F) {
                  var2 *= 1.5F;
               }

               var2 += var4;
               boolean var6 = false;
               int var7 = afv.a((sv)this);
               if(var1 instanceof sv && var7 > 0 && !var1.al()) {
                  var6 = true;
                  var1.e(1);
               }

               boolean var8 = var1.a(ro.a(this), var2);
               if(var8) {
                  if(var3 > 0) {
                     var1.g((double)(-qh.a(this.y * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(qh.b(this.y * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
                     this.v *= 0.6D;
                     this.x *= 0.6D;
                     this.c(false);
                  }

                  if(var5) {
                     this.b(var1);
                  }

                  if(var4 > 0.0F) {
                     this.c(var1);
                  }

                  if(var2 >= 18.0F) {
                     this.a((ph)pc.F);
                  }

                  this.l(var1);
                  if(var1 instanceof sv) {
                     afv.a((sv)var1, (sa)this);
                  }

                  afv.b(this, var1);
                  add var9 = this.bF();
                  Object var10 = var1;
                  if(var1 instanceof wy) {
                     wx var11 = ((wy)var1).a;
                     if(var11 != null && var11 instanceof sv) {
                        var10 = (sv)var11;
                     }
                  }

                  if(var9 != null && var10 instanceof sv) {
                     var9.a((sv)var10, this);
                     if(var9.b <= 0) {
                        this.bG();
                     }
                  }

                  if(var1 instanceof sv) {
                     this.a(pp.t, Math.round(var2 * 10.0F));
                     if(var7 > 0) {
                        var1.e(var7 * 4);
                     }
                  }

                  this.a(0.3F);
               } else if(var6) {
                  var1.F();
               }
            }

         }
      }
   }

   public void b(sa var1) {}

   public void c(sa var1) {}

   public void B() {
      super.B();
      this.bn.b(this);
      if(this.bo != null) {
         this.bo.b(this);
      }

   }

   public boolean aa() {
      return !this.bA && super.aa();
   }

   public GameProfile bJ() {
      return this.i;
   }

   public za a(int var1, int var2, int var3) {
      if(!this.o.E) {
         if(this.bm() || !this.Z()) {
            return za.e;
         }

         if(!this.o.t.d()) {
            return za.b;
         }

         if(this.o.w()) {
            return za.c;
         }

         if(Math.abs(this.s - (double)var1) > 3.0D || Math.abs(this.t - (double)var2) > 2.0D || Math.abs(this.u - (double)var3) > 3.0D) {
            return za.d;
         }

         double var4 = 8.0D;
         double var6 = 5.0D;
         List var8 = this.o.a(yg.class, azt.a((double)var1 - var4, (double)var2 - var6, (double)var3 - var4, (double)var1 + var4, (double)var2 + var6, (double)var3 + var4));
         if(!var8.isEmpty()) {
            return za.f;
         }
      }

      if(this.am()) {
         this.a((sa)null);
      }

      this.a(0.2F, 0.2F);
      this.L = 0.2F;
      if(this.o.d(var1, var2, var3)) {
         int var9 = this.o.e(var1, var2, var3);
         int var5 = ajh.l(var9);
         float var10 = 0.5F;
         float var7 = 0.5F;
         switch(var5) {
         case 0:
            var7 = 0.9F;
            break;
         case 1:
            var10 = 0.1F;
            break;
         case 2:
            var7 = 0.1F;
            break;
         case 3:
            var10 = 0.9F;
         }

         this.w(var5);
         this.b((double)((float)var1 + var10), (double)((float)var2 + 0.9375F), (double)((float)var3 + var7));
      } else {
         this.b((double)((float)var1 + 0.5F), (double)((float)var2 + 0.9375F), (double)((float)var3 + 0.5F));
      }

      this.bA = true;
      this.b = 0;
      this.bB = new r(var1, var2, var3);
      this.v = this.x = this.w = 0.0D;
      if(!this.o.E) {
         this.o.c();
      }

      return za.a;
   }

   private void w(int var1) {
      this.bC = 0.0F;
      this.bD = 0.0F;
      switch(var1) {
      case 0:
         this.bD = -1.8F;
         break;
      case 1:
         this.bC = 1.8F;
         break;
      case 2:
         this.bD = 1.8F;
         break;
      case 3:
         this.bC = -1.8F;
      }

   }

   public void a(boolean var1, boolean var2, boolean var3) {
      this.a(0.6F, 1.8F);
      this.e_();
      r var4 = this.bB;
      r var5 = this.bB;
      if(var4 != null && this.o.a(var4.a, var4.b, var4.c) == ajn.C) {
         ajh.a(this.o, var4.a, var4.b, var4.c, false);
         var5 = ajh.a(this.o, var4.a, var4.b, var4.c, 0);
         if(var5 == null) {
            var5 = new r(var4.a, var4.b + 1, var4.c);
         }

         this.b((double)((float)var5.a + 0.5F), (double)((float)var5.b + this.L + 0.1F), (double)((float)var5.c + 0.5F));
      }

      this.bA = false;
      if(!this.o.E && var2) {
         this.o.c();
      }

      if(var1) {
         this.b = 0;
      } else {
         this.b = 100;
      }

      if(var3) {
         this.a(this.bB, false);
      }

   }

   private boolean j() {
      return this.o.a(this.bB.a, this.bB.b, this.bB.c) == ajn.C;
   }

   public static r a(ahb var0, r var1, boolean var2) {
      apu var3 = var0.L();
      var3.c(var1.a - 3 >> 4, var1.c - 3 >> 4);
      var3.c(var1.a + 3 >> 4, var1.c - 3 >> 4);
      var3.c(var1.a - 3 >> 4, var1.c + 3 >> 4);
      var3.c(var1.a + 3 >> 4, var1.c + 3 >> 4);
      if(var0.a(var1.a, var1.b, var1.c) == ajn.C) {
         r var8 = ajh.a(var0, var1.a, var1.b, var1.c, 0);
         return var8;
      } else {
         awt var4 = var0.a(var1.a, var1.b, var1.c).o();
         awt var5 = var0.a(var1.a, var1.b + 1, var1.c).o();
         boolean var6 = !var4.a() && !var4.d();
         boolean var7 = !var5.a() && !var5.d();
         return var2 && var6 && var7?var1:null;
      }
   }

   public boolean bm() {
      return this.bA;
   }

   public boolean bL() {
      return this.bA && this.b >= 100;
   }

   protected void b(int var1, boolean var2) {
      byte var3 = this.af.a(16);
      if(var2) {
         this.af.b(16, Byte.valueOf((byte)(var3 | 1 << var1)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var3 & ~(1 << var1))));
      }

   }

   public void b(fj var1) {}

   public r bN() {
      return this.c;
   }

   public boolean bO() {
      return this.d;
   }

   public void a(r var1, boolean var2) {
      if(var1 != null) {
         this.c = new r(var1);
         this.d = var2;
      } else {
         this.c = null;
         this.d = false;
      }

   }

   public void a(ph var1) {
      this.a(var1, 1);
   }

   public void a(ph var1, int var2) {}

   public void bj() {
      super.bj();
      this.a(pp.r, 1);
      if(this.ao()) {
         this.a(0.8F);
      } else {
         this.a(0.2F);
      }

   }

   public void e(float var1, float var2) {
      double var3 = this.s;
      double var5 = this.t;
      double var7 = this.u;
      if(this.bE.b && this.m == null) {
         double var9 = this.w;
         float var11 = this.aQ;
         this.aQ = this.bE.a();
         super.e(var1, var2);
         this.w = var9 * 0.6D;
         this.aQ = var11;
      } else {
         super.e(var1, var2);
      }

      this.k(this.s - var3, this.t - var5, this.u - var7);
   }

   public float bl() {
      return (float)this.a(yj.d).e();
   }

   public void k(double var1, double var3, double var5) {
      if(this.m == null) {
         int var7;
         if(this.a(awt.h)) {
            var7 = Math.round(qh.a(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.a(pp.m, var7);
               this.a(0.015F * (float)var7 * 0.01F);
            }
         } else if(this.M()) {
            var7 = Math.round(qh.a(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.a(pp.i, var7);
               this.a(0.015F * (float)var7 * 0.01F);
            }
         } else if(this.h_()) {
            if(var3 > 0.0D) {
               this.a(pp.k, (int)Math.round(var3 * 100.0D));
            }
         } else if(this.D) {
            var7 = Math.round(qh.a(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.a(pp.h, var7);
               if(this.ao()) {
                  this.a(0.099999994F * (float)var7 * 0.01F);
               } else {
                  this.a(0.01F * (float)var7 * 0.01F);
               }
            }
         } else {
            var7 = Math.round(qh.a(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 25) {
               this.a(pp.l, var7);
            }
         }

      }
   }

   private void l(double var1, double var3, double var5) {
      if(this.m != null) {
         int var7 = Math.round(qh.a(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if(var7 > 0) {
            if(this.m instanceof xl) {
               this.a(pp.n, var7);
               if(this.e == null) {
                  this.e = new r(qh.c(this.s), qh.c(this.t), qh.c(this.u));
               } else if((double)this.e.e(qh.c(this.s), qh.c(this.t), qh.c(this.u)) >= 1000000.0D) {
                  this.a((ph)pc.q, 1);
               }
            } else if(this.m instanceof xi) {
               this.a(pp.o, var7);
            } else if(this.m instanceof wo) {
               this.a(pp.p, var7);
            } else if(this.m instanceof wi) {
               this.a(pp.q, var7);
            }
         }
      }

   }

   protected void b(float var1) {
      if(!this.bE.c) {
         if(var1 >= 2.0F) {
            this.a(pp.j, (int)Math.round((double)var1 * 100.0D));
         }

         super.b(var1);
      }
   }

   protected String o(int var1) {
      return var1 > 4?"game.player.hurt.fall.big":"game.player.hurt.fall.small";
   }

   public void a(sv var1) {
      if(var1 instanceof yb) {
         this.a((ph)pc.s);
      }

      int var2 = sg.a(var1);
      sh var3 = (sh)sg.a.get(Integer.valueOf(var2));
      if(var3 != null) {
         this.a(var3.d, 1);
      }

   }

   public void as() {
      if(!this.bE.b) {
         super.as();
      }

   }

   public add r(int var1) {
      return this.bm.d(var1);
   }

   public void v(int var1) {
      this.s(var1);
      int var2 = Integer.MAX_VALUE - this.bG;
      if(var1 > var2) {
         var1 = var2;
      }

      this.bH += (float)var1 / (float)this.bP();

      for(this.bG += var1; this.bH >= 1.0F; this.bH /= (float)this.bP()) {
         this.bH = (this.bH - 1.0F) * (float)this.bP();
         this.a(1);
      }

   }

   public void a(int var1) {
      this.bF += var1;
      if(this.bF < 0) {
         this.bF = 0;
         this.bH = 0.0F;
         this.bG = 0;
      }

      if(var1 > 0 && this.bF % 5 == 0 && (float)this.h < (float)this.aa - 100.0F) {
         float var2 = this.bF > 30?1.0F:(float)this.bF / 30.0F;
         this.o.a((sa)this, "random.levelup", var2 * 0.75F, 1.0F);
         this.h = this.aa;
      }

   }

   public int bP() {
      return this.bF >= 30?62 + (this.bF - 30) * 7:(this.bF >= 15?17 + (this.bF - 15) * 3:17);
   }

   public void a(float var1) {
      if(!this.bE.a) {
         if(!this.o.E) {
            this.bp.a(var1);
         }

      }
   }

   public zr bQ() {
      return this.bp;
   }

   public boolean g(boolean var1) {
      return (var1 || this.bp.c()) && !this.bE.a;
   }

   public boolean bR() {
      return this.aS() > 0.0F && this.aS() < this.aY();
   }

   public void a(add var1, int var2) {
      if(var1 != this.f) {
         this.f = var1;
         this.g = var2;
         if(!this.o.E) {
            this.e(true);
         }

      }
   }

   public boolean d(int var1, int var2, int var3) {
      if(this.bE.e) {
         return true;
      } else {
         aji var4 = this.o.a(var1, var2, var3);
         if(var4.o() != awt.a) {
            if(var4.o().q()) {
               return true;
            }

            if(this.bF() != null) {
               add var5 = this.bF();
               if(var5.b(var4) || var5.a(var4) > 1.0F) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, add var5) {
      return this.bE.e?true:(var5 != null?var5.z():false);
   }

   protected int e(yz var1) {
      if(this.o.O().b("keepInventory")) {
         return 0;
      } else {
         int var2 = this.bF * 7;
         return var2 > 100?100:var2;
      }
   }

   protected boolean aH() {
      return true;
   }

   public void a(yz var1, boolean var2) {
      if(var2) {
         this.bm.b(var1.bm);
         this.g(var1.aS());
         this.bp = var1.bp;
         this.bF = var1.bF;
         this.bG = var1.bG;
         this.bH = var1.bH;
         this.c(var1.bD());
         this.aq = var1.aq;
      } else if(this.o.O().b("keepInventory")) {
         this.bm.b(var1.bm);
         this.bF = var1.bF;
         this.bG = var1.bG;
         this.bH = var1.bH;
         this.c(var1.bD());
      }

      this.a = var1.a;
   }

   protected boolean g_() {
      return !this.bE.b;
   }

   public void q() {}

   public void a(ahk var1) {}

   public String b_() {
      return this.i.getName();
   }

   public ahb d() {
      return this.o;
   }

   public aav bS() {
      return this.a;
   }

   public add q(int var1) {
      return var1 == 0?this.bm.h():this.bm.b[var1 - 1];
   }

   public add be() {
      return this.bm.h();
   }

   public void c(int var1, add var2) {
      this.bm.b[var1] = var2;
   }

   public add[] ak() {
      return this.bm.b;
   }

   public boolean aC() {
      return !this.bE.b;
   }

   public bac bU() {
      return this.o.W();
   }

   public bae bt() {
      return this.bU().i(this.b_());
   }

   public fj c_() {
      fq var1 = new fq(azy.a(this.bt(), this.b_()));
      var1.b().a(new fh(fi.e, "/msg " + this.b_() + " "));
      return var1;
   }

   public void m(float var1) {
      if(var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.z().b(17, Float.valueOf(var1));
   }

   public float bs() {
      return this.z().d(17);
   }

   public static UUID a(GameProfile var0) {
      UUID var1 = var0.getId();
      if(var1 == null) {
         var1 = UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0.getName()).getBytes(Charsets.UTF_8));
      }

      return var1;
   }
}
