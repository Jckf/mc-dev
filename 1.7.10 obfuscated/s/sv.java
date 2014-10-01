import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class sv extends sa {

   private static final UUID b = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
   private static final tj c = (new tj(b, "Sprinting speed boost", 0.30000001192092896D, 2)).a(false);
   private tl d;
   private final rn e = new rn(this);
   private final HashMap f = new HashMap();
   private final add[] g = new add[5];
   public boolean at;
   public int au;
   public int av;
   public float aw;
   public int ax;
   public int ay;
   public float az;
   public int aA;
   public int aB;
   public float aC;
   public float aD;
   public float aE;
   public float aF;
   public float aG;
   public int aH = 20;
   public float aI;
   public float aJ;
   public float aK;
   public float aL;
   public float aM;
   public float aN;
   public float aO;
   public float aP;
   public float aQ = 0.02F;
   protected yz aR;
   protected int aS;
   protected boolean aT;
   protected int aU;
   protected float aV;
   protected float aW;
   protected float aX;
   protected float aY;
   protected float aZ;
   protected int ba;
   protected float bb;
   protected boolean bc;
   public float bd;
   public float be;
   protected float bf;
   protected int bg;
   protected double bh;
   protected double bi;
   protected double bj;
   protected double bk;
   protected double bl;
   private boolean h = true;
   private sv i;
   private int bm;
   private sv bn;
   private int bo;
   private float bp;
   private int bq;
   private float br;


   public sv(ahb var1) {
      super(var1);
      this.aD();
      this.g(this.aY());
      this.k = true;
      this.aL = (float)(Math.random() + 1.0D) * 0.01F;
      this.b(this.s, this.t, this.u);
      this.aK = (float)Math.random() * 12398.0F;
      this.y = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.aO = this.y;
      this.W = 0.5F;
   }

   protected void c() {
      this.af.a(7, Integer.valueOf(0));
      this.af.a(8, Byte.valueOf((byte)0));
      this.af.a(9, Byte.valueOf((byte)0));
      this.af.a(6, Float.valueOf(1.0F));
   }

   protected void aD() {
      this.bc().b(yj.a);
      this.bc().b(yj.c);
      this.bc().b(yj.d);
      if(!this.bk()) {
         this.a(yj.d).a(0.10000000149011612D);
      }

   }

   protected void a(double var1, boolean var3) {
      if(!this.M()) {
         this.N();
      }

      if(var3 && this.R > 0.0F) {
         int var4 = qh.c(this.s);
         int var5 = qh.c(this.t - 0.20000000298023224D - (double)this.L);
         int var6 = qh.c(this.u);
         aji var7 = this.o.a(var4, var5, var6);
         if(var7.o() == awt.a) {
            int var8 = this.o.a(var4, var5 - 1, var6).b();
            if(var8 == 11 || var8 == 32 || var8 == 21) {
               var7 = this.o.a(var4, var5 - 1, var6);
            }
         } else if(!this.o.E && this.R > 3.0F) {
            this.o.c(2006, var4, var5, var6, qh.f(this.R - 3.0F));
         }

         var7.a(this.o, var4, var5, var6, this, this.R);
      }

      super.a(var1, var3);
   }

   public boolean aE() {
      return false;
   }

   public void C() {
      this.aC = this.aD;
      super.C();
      this.o.C.a("livingEntityBaseTick");
      if(this.Z() && this.aa()) {
         this.a(ro.d, 1.0F);
      }

      if(this.K() || this.o.E) {
         this.F();
      }

      boolean var1 = this instanceof yz && ((yz)this).bE.a;
      if(this.Z() && this.a(awt.h)) {
         if(!this.aE() && !this.k(rv.o.H) && !var1) {
            this.h(this.j(this.ar()));
            if(this.ar() == -20) {
               this.h(0);

               for(int var2 = 0; var2 < 8; ++var2) {
                  float var3 = this.Z.nextFloat() - this.Z.nextFloat();
                  float var4 = this.Z.nextFloat() - this.Z.nextFloat();
                  float var5 = this.Z.nextFloat() - this.Z.nextFloat();
                  this.o.a("bubble", this.s + (double)var3, this.t + (double)var4, this.u + (double)var5, this.v, this.w, this.x);
               }

               this.a(ro.e, 2.0F);
            }
         }

         if(!this.o.E && this.am() && this.m instanceof sv) {
            this.a((sa)null);
         }
      } else {
         this.h(300);
      }

      if(this.Z() && this.L()) {
         this.F();
      }

      this.aI = this.aJ;
      if(this.aB > 0) {
         --this.aB;
      }

      if(this.ax > 0) {
         --this.ax;
      }

      if(this.ad > 0 && !(this instanceof mw)) {
         --this.ad;
      }

      if(this.aS() <= 0.0F) {
         this.aF();
      }

      if(this.aS > 0) {
         --this.aS;
      } else {
         this.aR = null;
      }

      if(this.bn != null && !this.bn.Z()) {
         this.bn = null;
      }

      if(this.i != null) {
         if(!this.i.Z()) {
            this.b((sv)null);
         } else if(this.aa - this.bm > 100) {
            this.b((sv)null);
         }
      }

      this.aO();
      this.aY = this.aX;
      this.aN = this.aM;
      this.aP = this.aO;
      this.A = this.y;
      this.B = this.z;
      this.o.C.b();
   }

   public boolean f() {
      return false;
   }

   protected void aF() {
      ++this.aA;
      if(this.aA == 20) {
         int var1;
         if(!this.o.E && (this.aS > 0 || this.aH()) && this.aG() && this.o.O().b("doMobLoot")) {
            var1 = this.e(this.aR);

            while(var1 > 0) {
               int var2 = sq.a(var1);
               var1 -= var2;
               this.o.d((sa)(new sq(this.o, this.s, this.t, this.u, var2)));
            }
         }

         this.B();

         for(var1 = 0; var1 < 20; ++var1) {
            double var8 = this.Z.nextGaussian() * 0.02D;
            double var4 = this.Z.nextGaussian() * 0.02D;
            double var6 = this.Z.nextGaussian() * 0.02D;
            this.o.a("explode", this.s + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, var8, var4, var6);
         }
      }

   }

   protected boolean aG() {
      return !this.f();
   }

   protected int j(int var1) {
      int var2 = afv.b(this);
      return var2 > 0 && this.Z.nextInt(var2 + 1) > 0?var1:var1 - 1;
   }

   protected int e(yz var1) {
      return 0;
   }

   protected boolean aH() {
      return false;
   }

   public Random aI() {
      return this.Z;
   }

   public sv aJ() {
      return this.i;
   }

   public int aK() {
      return this.bm;
   }

   public void b(sv var1) {
      this.i = var1;
      this.bm = this.aa;
   }

   public sv aL() {
      return this.bn;
   }

   public int aM() {
      return this.bo;
   }

   public void l(sa var1) {
      if(var1 instanceof sv) {
         this.bn = (sv)var1;
      } else {
         this.bn = null;
      }

      this.bo = this.aa;
   }

   public int aN() {
      return this.aU;
   }

   public void b(dh var1) {
      var1.a("HealF", this.aS());
      var1.a("Health", (short)((int)Math.ceil((double)this.aS())));
      var1.a("HurtTime", (short)this.ax);
      var1.a("DeathTime", (short)this.aA);
      var1.a("AttackTime", (short)this.aB);
      var1.a("AbsorptionAmount", this.bs());
      add[] var2 = this.ak();
      int var3 = var2.length;

      int var4;
      add var5;
      for(var4 = 0; var4 < var3; ++var4) {
         var5 = var2[var4];
         if(var5 != null) {
            this.d.a(var5.D());
         }
      }

      var1.a("Attributes", (dy)yj.a(this.bc()));
      var2 = this.ak();
      var3 = var2.length;

      for(var4 = 0; var4 < var3; ++var4) {
         var5 = var2[var4];
         if(var5 != null) {
            this.d.b(var5.D());
         }
      }

      if(!this.f.isEmpty()) {
         dq var6 = new dq();
         Iterator var7 = this.f.values().iterator();

         while(var7.hasNext()) {
            rw var8 = (rw)var7.next();
            var6.a((dy)var8.a(new dh()));
         }

         var1.a("ActiveEffects", (dy)var6);
      }

   }

   public void a(dh var1) {
      this.m(var1.h("AbsorptionAmount"));
      if(var1.b("Attributes", 9) && this.o != null && !this.o.E) {
         yj.a(this.bc(), var1.c("Attributes", 10));
      }

      if(var1.b("ActiveEffects", 9)) {
         dq var2 = var1.c("ActiveEffects", 10);

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            dh var4 = var2.b(var3);
            rw var5 = rw.b(var4);
            if(var5 != null) {
               this.f.put(Integer.valueOf(var5.a()), var5);
            }
         }
      }

      if(var1.b("HealF", 99)) {
         this.g(var1.h("HealF"));
      } else {
         dy var6 = var1.a("Health");
         if(var6 == null) {
            this.g(this.aY());
         } else if(var6.a() == 5) {
            this.g(((dm)var6).h());
         } else if(var6.a() == 2) {
            this.g((float)((dw)var6).e());
         }
      }

      this.ax = var1.e("HurtTime");
      this.aA = var1.e("DeathTime");
      this.aB = var1.e("AttackTime");
   }

   protected void aO() {
      Iterator var1 = this.f.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         rw var3 = (rw)this.f.get(var2);
         if(!var3.a(this)) {
            if(!this.o.E) {
               var1.remove();
               this.b(var3);
            }
         } else if(var3.b() % 600 == 0) {
            this.a(var3, false);
         }
      }

      int var11;
      if(this.h) {
         if(!this.o.E) {
            if(this.f.isEmpty()) {
               this.af.b(8, Byte.valueOf((byte)0));
               this.af.b(7, Integer.valueOf(0));
               this.d(false);
            } else {
               var11 = aen.a(this.f.values());
               this.af.b(8, Byte.valueOf((byte)(aen.b(this.f.values())?1:0)));
               this.af.b(7, Integer.valueOf(var11));
               this.d(this.k(rv.p.H));
            }
         }

         this.h = false;
      }

      var11 = this.af.c(7);
      boolean var12 = this.af.a(8) > 0;
      if(var11 > 0) {
         boolean var4 = false;
         if(!this.ap()) {
            var4 = this.Z.nextBoolean();
         } else {
            var4 = this.Z.nextInt(15) == 0;
         }

         if(var12) {
            var4 &= this.Z.nextInt(5) == 0;
         }

         if(var4 && var11 > 0) {
            double var5 = (double)(var11 >> 16 & 255) / 255.0D;
            double var7 = (double)(var11 >> 8 & 255) / 255.0D;
            double var9 = (double)(var11 >> 0 & 255) / 255.0D;
            this.o.a(var12?"mobSpellAmbient":"mobSpell", this.s + (this.Z.nextDouble() - 0.5D) * (double)this.M, this.t + this.Z.nextDouble() * (double)this.N - (double)this.L, this.u + (this.Z.nextDouble() - 0.5D) * (double)this.M, var5, var7, var9);
         }
      }

   }

   public void aP() {
      Iterator var1 = this.f.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         rw var3 = (rw)this.f.get(var2);
         if(!this.o.E) {
            var1.remove();
            this.b(var3);
         }
      }

   }

   public Collection aQ() {
      return this.f.values();
   }

   public boolean k(int var1) {
      return this.f.containsKey(Integer.valueOf(var1));
   }

   public boolean a(rv var1) {
      return this.f.containsKey(Integer.valueOf(var1.H));
   }

   public rw b(rv var1) {
      return (rw)this.f.get(Integer.valueOf(var1.H));
   }

   public void c(rw var1) {
      if(this.d(var1)) {
         if(this.f.containsKey(Integer.valueOf(var1.a()))) {
            ((rw)this.f.get(Integer.valueOf(var1.a()))).a(var1);
            this.a((rw)this.f.get(Integer.valueOf(var1.a())), true);
         } else {
            this.f.put(Integer.valueOf(var1.a()), var1);
            this.a(var1);
         }

      }
   }

   public boolean d(rw var1) {
      if(this.bd() == sz.b) {
         int var2 = var1.a();
         if(var2 == rv.l.H || var2 == rv.u.H) {
            return false;
         }
      }

      return true;
   }

   public boolean aR() {
      return this.bd() == sz.b;
   }

   public void m(int var1) {
      rw var2 = (rw)this.f.remove(Integer.valueOf(var1));
      if(var2 != null) {
         this.b(var2);
      }

   }

   protected void a(rw var1) {
      this.h = true;
      if(!this.o.E) {
         rv.a[var1.a()].b(this, this.bc(), var1.c());
      }

   }

   protected void a(rw var1, boolean var2) {
      this.h = true;
      if(var2 && !this.o.E) {
         rv.a[var1.a()].a(this, this.bc(), var1.c());
         rv.a[var1.a()].b(this, this.bc(), var1.c());
      }

   }

   protected void b(rw var1) {
      this.h = true;
      if(!this.o.E) {
         rv.a[var1.a()].a(this, this.bc(), var1.c());
      }

   }

   public void f(float var1) {
      float var2 = this.aS();
      if(var2 > 0.0F) {
         this.g(var2 + var1);
      }

   }

   public final float aS() {
      return this.af.d(6);
   }

   public void g(float var1) {
      this.af.b(6, Float.valueOf(qh.a(var1, 0.0F, this.aY())));
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if(this.o.E) {
         return false;
      } else {
         this.aU = 0;
         if(this.aS() <= 0.0F) {
            return false;
         } else if(var1.o() && this.a(rv.n)) {
            return false;
         } else {
            if((var1 == ro.m || var1 == ro.n) && this.q(4) != null) {
               this.q(4).a((int)(var2 * 4.0F + this.Z.nextFloat() * var2 * 2.0F), this);
               var2 *= 0.75F;
            }

            this.aF = 1.5F;
            boolean var3 = true;
            if((float)this.ad > (float)this.aH / 2.0F) {
               if(var2 <= this.bb) {
                  return false;
               }

               this.d(var1, var2 - this.bb);
               this.bb = var2;
               var3 = false;
            } else {
               this.bb = var2;
               this.aw = this.aS();
               this.ad = this.aH;
               this.d(var1, var2);
               this.ax = this.ay = 10;
            }

            this.az = 0.0F;
            sa var4 = var1.j();
            if(var4 != null) {
               if(var4 instanceof sv) {
                  this.b((sv)var4);
               }

               if(var4 instanceof yz) {
                  this.aS = 100;
                  this.aR = (yz)var4;
               } else if(var4 instanceof wv) {
                  wv var5 = (wv)var4;
                  if(var5.bZ()) {
                     this.aS = 100;
                     this.aR = null;
                  }
               }
            }

            if(var3) {
               this.o.a(this, (byte)2);
               if(var1 != ro.e) {
                  this.Q();
               }

               if(var4 != null) {
                  double var9 = var4.s - this.s;

                  double var7;
                  for(var7 = var4.u - this.u; var9 * var9 + var7 * var7 < 1.0E-4D; var7 = (Math.random() - Math.random()) * 0.01D) {
                     var9 = (Math.random() - Math.random()) * 0.01D;
                  }

                  this.az = (float)(Math.atan2(var7, var9) * 180.0D / 3.1415927410125732D) - this.y;
                  this.a(var4, var2, var9, var7);
               } else {
                  this.az = (float)((int)(Math.random() * 2.0D) * 180);
               }
            }

            String var10;
            if(this.aS() <= 0.0F) {
               var10 = this.aU();
               if(var3 && var10 != null) {
                  this.a(var10, this.bf(), this.bg());
               }

               this.a(var1);
            } else {
               var10 = this.aT();
               if(var3 && var10 != null) {
                  this.a(var10, this.bf(), this.bg());
               }
            }

            return true;
         }
      }
   }

   public void a(add var1) {
      this.a("random.break", 0.8F, 0.8F + this.o.s.nextFloat() * 0.4F);

      for(int var2 = 0; var2 < 5; ++var2) {
         azw var3 = azw.a(((double)this.Z.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
         var3.a(-this.z * 3.1415927F / 180.0F);
         var3.b(-this.y * 3.1415927F / 180.0F);
         azw var4 = azw.a(((double)this.Z.nextFloat() - 0.5D) * 0.3D, (double)(-this.Z.nextFloat()) * 0.6D - 0.3D, 0.6D);
         var4.a(-this.z * 3.1415927F / 180.0F);
         var4.b(-this.y * 3.1415927F / 180.0F);
         var4 = var4.c(this.s, this.t + (double)this.g(), this.u);
         this.o.a("iconcrack_" + adb.b(var1.b()), var4.a, var4.b, var4.c, var3.a, var3.b + 0.05D, var3.c);
      }

   }

   public void a(ro var1) {
      sa var2 = var1.j();
      sv var3 = this.aX();
      if(this.ba >= 0 && var3 != null) {
         var3.b(this, this.ba);
      }

      if(var2 != null) {
         var2.a(this);
      }

      this.aT = true;
      this.aW().g();
      if(!this.o.E) {
         int var4 = 0;
         if(var2 instanceof yz) {
            var4 = afv.i((sv)var2);
         }

         if(this.aG() && this.o.O().b("doMobLoot")) {
            this.b(this.aS > 0, var4);
            this.a(this.aS > 0, var4);
            if(this.aS > 0) {
               int var5 = this.Z.nextInt(200) - var4;
               if(var5 < 5) {
                  this.n(var5 <= 0?1:0);
               }
            }
         }
      }

      this.o.a(this, (byte)3);
   }

   protected void a(boolean var1, int var2) {}

   public void a(sa var1, float var2, double var3, double var5) {
      if(this.Z.nextDouble() >= this.a(yj.c).e()) {
         this.al = true;
         float var7 = qh.a(var3 * var3 + var5 * var5);
         float var8 = 0.4F;
         this.v /= 2.0D;
         this.w /= 2.0D;
         this.x /= 2.0D;
         this.v -= var3 / (double)var7 * (double)var8;
         this.w += (double)var8;
         this.x -= var5 / (double)var7 * (double)var8;
         if(this.w > 0.4000000059604645D) {
            this.w = 0.4000000059604645D;
         }

      }
   }

   protected String aT() {
      return "game.neutral.hurt";
   }

   protected String aU() {
      return "game.neutral.die";
   }

   protected void n(int var1) {}

   protected void b(boolean var1, int var2) {}

   public boolean h_() {
      int var1 = qh.c(this.s);
      int var2 = qh.c(this.C.b);
      int var3 = qh.c(this.u);
      aji var4 = this.o.a(var1, var2, var3);
      return var4 == ajn.ap || var4 == ajn.bd;
   }

   public boolean Z() {
      return !this.K && this.aS() > 0.0F;
   }

   protected void b(float var1) {
      super.b(var1);
      rw var2 = this.b(rv.j);
      float var3 = var2 != null?(float)(var2.c() + 1):0.0F;
      int var4 = qh.f(var1 - 3.0F - var3);
      if(var4 > 0) {
         this.a(this.o(var4), 1.0F, 1.0F);
         this.a(ro.h, (float)var4);
         int var5 = qh.c(this.s);
         int var6 = qh.c(this.t - 0.20000000298023224D - (double)this.L);
         int var7 = qh.c(this.u);
         aji var8 = this.o.a(var5, var6, var7);
         if(var8.o() != awt.a) {
            ajm var9 = var8.H;
            this.a(var9.e(), var9.c() * 0.5F, var9.d() * 0.75F);
         }
      }

   }

   protected String o(int var1) {
      return var1 > 4?"game.neutral.hurt.fall.big":"game.neutral.hurt.fall.small";
   }

   public int aV() {
      int var1 = 0;
      add[] var2 = this.ak();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         add var5 = var2[var4];
         if(var5 != null && var5.b() instanceof abb) {
            int var6 = ((abb)var5.b()).c;
            var1 += var6;
         }
      }

      return var1;
   }

   protected void h(float var1) {}

   protected float b(ro var1, float var2) {
      if(!var1.e()) {
         int var3 = 25 - this.aV();
         float var4 = var2 * (float)var3;
         this.h(var2);
         var2 = var4 / 25.0F;
      }

      return var2;
   }

   protected float c(ro var1, float var2) {
      if(var1.h()) {
         return var2;
      } else {
         if(this instanceof yq) {
            var2 = var2;
         }

         int var3;
         int var4;
         float var5;
         if(this.a(rv.m) && var1 != ro.i) {
            var3 = (this.b(rv.m).c() + 1) * 5;
            var4 = 25 - var3;
            var5 = var2 * (float)var4;
            var2 = var5 / 25.0F;
         }

         if(var2 <= 0.0F) {
            return 0.0F;
         } else {
            var3 = afv.a(this.ak(), var1);
            if(var3 > 20) {
               var3 = 20;
            }

            if(var3 > 0 && var3 <= 20) {
               var4 = 25 - var3;
               var5 = var2 * (float)var4;
               var2 = var5 / 25.0F;
            }

            return var2;
         }
      }
   }

   protected void d(ro var1, float var2) {
      if(!this.aw()) {
         var2 = this.b(var1, var2);
         var2 = this.c(var1, var2);
         float var3 = var2;
         var2 = Math.max(var2 - this.bs(), 0.0F);
         this.m(this.bs() - (var3 - var2));
         if(var2 != 0.0F) {
            float var4 = this.aS();
            this.g(var4 - var2);
            this.aW().a(var1, var4, var2);
            this.m(this.bs() - var2);
         }
      }
   }

   public rn aW() {
      return this.e;
   }

   public sv aX() {
      return (sv)(this.e.c() != null?this.e.c():(this.aR != null?this.aR:(this.i != null?this.i:null)));
   }

   public final float aY() {
      return (float)this.a(yj.a).e();
   }

   public final int aZ() {
      return this.af.a(9);
   }

   public final void p(int var1) {
      this.af.b(9, Byte.valueOf((byte)var1));
   }

   private int j() {
      return this.a(rv.e)?6 - (1 + this.b(rv.e).c()) * 1:(this.a(rv.f)?6 + (1 + this.b(rv.f).c()) * 2:6);
   }

   public void ba() {
      if(!this.at || this.au >= this.j() / 2 || this.au < 0) {
         this.au = -1;
         this.at = true;
         if(this.o instanceof mt) {
            ((mt)this.o).r().a((sa)this, (ft)(new gc(this, 0)));
         }
      }

   }

   protected void G() {
      this.a(ro.i, 4.0F);
   }

   protected void bb() {
      int var1 = this.j();
      if(this.at) {
         ++this.au;
         if(this.au >= var1) {
            this.au = 0;
            this.at = false;
         }
      } else {
         this.au = 0;
      }

      this.aD = (float)this.au / (float)var1;
   }

   public ti a(th var1) {
      return this.bc().a(var1);
   }

   public tl bc() {
      if(this.d == null) {
         this.d = new tq();
      }

      return this.d;
   }

   public sz bd() {
      return sz.a;
   }

   public abstract add be();

   public abstract add q(int var1);

   public abstract void c(int var1, add var2);

   public void c(boolean var1) {
      super.c(var1);
      ti var2 = this.a(yj.d);
      if(var2.a(b) != null) {
         var2.b(c);
      }

      if(var1) {
         var2.a(c);
      }

   }

   public abstract add[] ak();

   protected float bf() {
      return 1.0F;
   }

   protected float bg() {
      return this.f()?(this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.5F:(this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F;
   }

   protected boolean bh() {
      return this.aS() <= 0.0F;
   }

   public void a(double var1, double var3, double var5) {
      this.b(var1, var3, var5, this.y, this.z);
   }

   public void m(sa var1) {
      double var3 = var1.s;
      double var5 = var1.C.b + (double)var1.N;
      double var7 = var1.u;
      byte var9 = 1;

      for(int var10 = -var9; var10 <= var9; ++var10) {
         for(int var11 = -var9; var11 < var9; ++var11) {
            if(var10 != 0 || var11 != 0) {
               int var12 = (int)(this.s + (double)var10);
               int var13 = (int)(this.u + (double)var11);
               azt var2 = this.C.c((double)var10, 1.0D, (double)var11);
               if(this.o.a(var2).isEmpty()) {
                  if(ahb.a((ahl)this.o, var12, (int)this.t, var13)) {
                     this.a(this.s + (double)var10, this.t + 1.0D, this.u + (double)var11);
                     return;
                  }

                  if(ahb.a((ahl)this.o, var12, (int)this.t - 1, var13) || this.o.a(var12, (int)this.t - 1, var13).o() == awt.h) {
                     var3 = this.s + (double)var10;
                     var5 = this.t + 1.0D;
                     var7 = this.u + (double)var11;
                  }
               }
            }
         }
      }

      this.a(var3, var5, var7);
   }

   protected void bj() {
      this.w = 0.41999998688697815D;
      if(this.a(rv.j)) {
         this.w += (double)((float)(this.b(rv.j).c() + 1) * 0.1F);
      }

      if(this.ao()) {
         float var1 = this.y * 0.017453292F;
         this.v -= (double)(qh.a(var1) * 0.2F);
         this.x += (double)(qh.b(var1) * 0.2F);
      }

      this.al = true;
   }

   public void e(float var1, float var2) {
      double var8;
      if(this.M() && (!(this instanceof yz) || !((yz)this).bE.b)) {
         var8 = this.t;
         this.a(var1, var2, this.bk()?0.04F:0.02F);
         this.d(this.v, this.w, this.x);
         this.v *= 0.800000011920929D;
         this.w *= 0.800000011920929D;
         this.x *= 0.800000011920929D;
         this.w -= 0.02D;
         if(this.E && this.c(this.v, this.w + 0.6000000238418579D - this.t + var8, this.x)) {
            this.w = 0.30000001192092896D;
         }
      } else if(this.P() && (!(this instanceof yz) || !((yz)this).bE.b)) {
         var8 = this.t;
         this.a(var1, var2, 0.02F);
         this.d(this.v, this.w, this.x);
         this.v *= 0.5D;
         this.w *= 0.5D;
         this.x *= 0.5D;
         this.w -= 0.02D;
         if(this.E && this.c(this.v, this.w + 0.6000000238418579D - this.t + var8, this.x)) {
            this.w = 0.30000001192092896D;
         }
      } else {
         float var3 = 0.91F;
         if(this.D) {
            var3 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
         }

         float var4 = 0.16277136F / (var3 * var3 * var3);
         float var5;
         if(this.D) {
            var5 = this.bl() * var4;
         } else {
            var5 = this.aQ;
         }

         this.a(var1, var2, var5);
         var3 = 0.91F;
         if(this.D) {
            var3 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
         }

         if(this.h_()) {
            float var6 = 0.15F;
            if(this.v < (double)(-var6)) {
               this.v = (double)(-var6);
            }

            if(this.v > (double)var6) {
               this.v = (double)var6;
            }

            if(this.x < (double)(-var6)) {
               this.x = (double)(-var6);
            }

            if(this.x > (double)var6) {
               this.x = (double)var6;
            }

            this.R = 0.0F;
            if(this.w < -0.15D) {
               this.w = -0.15D;
            }

            boolean var7 = this.an() && this instanceof yz;
            if(var7 && this.w < 0.0D) {
               this.w = 0.0D;
            }
         }

         this.d(this.v, this.w, this.x);
         if(this.E && this.h_()) {
            this.w = 0.2D;
         }

         if(this.o.E && (!this.o.d((int)this.s, 0, (int)this.u) || !this.o.d((int)this.s, (int)this.u).d)) {
            if(this.t > 0.0D) {
               this.w = -0.1D;
            } else {
               this.w = 0.0D;
            }
         } else {
            this.w -= 0.08D;
         }

         this.w *= 0.9800000190734863D;
         this.v *= (double)var3;
         this.x *= (double)var3;
      }

      this.aE = this.aF;
      var8 = this.s - this.p;
      double var9 = this.u - this.r;
      float var10 = qh.a(var8 * var8 + var9 * var9) * 4.0F;
      if(var10 > 1.0F) {
         var10 = 1.0F;
      }

      this.aF += (var10 - this.aF) * 0.4F;
      this.aG += this.aF;
   }

   protected boolean bk() {
      return false;
   }

   public float bl() {
      return this.bk()?this.bp:0.1F;
   }

   public void i(float var1) {
      this.bp = var1;
   }

   public boolean n(sa var1) {
      this.l(var1);
      return false;
   }

   public boolean bm() {
      return false;
   }

   public void h() {
      super.h();
      if(!this.o.E) {
         int var1 = this.aZ();
         if(var1 > 0) {
            if(this.av <= 0) {
               this.av = 20 * (30 - var1);
            }

            --this.av;
            if(this.av <= 0) {
               this.p(var1 - 1);
            }
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            add var3 = this.g[var2];
            add var4 = this.q(var2);
            if(!add.b(var4, var3)) {
               ((mt)this.o).r().a((sa)this, (ft)(new hz(this.y(), var2, var4)));
               if(var3 != null) {
                  this.d.a(var3.D());
               }

               if(var4 != null) {
                  this.d.b(var4.D());
               }

               this.g[var2] = var4 == null?null:var4.m();
            }
         }

         if(this.aa % 20 == 0) {
            this.aW().g();
         }
      }

      this.e();
      double var9 = this.s - this.p;
      double var10 = this.u - this.r;
      float var5 = (float)(var9 * var9 + var10 * var10);
      float var6 = this.aM;
      float var7 = 0.0F;
      this.aV = this.aW;
      float var8 = 0.0F;
      if(var5 > 0.0025000002F) {
         var8 = 1.0F;
         var7 = (float)Math.sqrt((double)var5) * 3.0F;
         var6 = (float)Math.atan2(var10, var9) * 180.0F / 3.1415927F - 90.0F;
      }

      if(this.aD > 0.0F) {
         var6 = this.y;
      }

      if(!this.D) {
         var8 = 0.0F;
      }

      this.aW += (var8 - this.aW) * 0.3F;
      this.o.C.a("headTurn");
      var7 = this.f(var6, var7);
      this.o.C.b();
      this.o.C.a("rangeChecks");

      while(this.y - this.A < -180.0F) {
         this.A -= 360.0F;
      }

      while(this.y - this.A >= 180.0F) {
         this.A += 360.0F;
      }

      while(this.aM - this.aN < -180.0F) {
         this.aN -= 360.0F;
      }

      while(this.aM - this.aN >= 180.0F) {
         this.aN += 360.0F;
      }

      while(this.z - this.B < -180.0F) {
         this.B -= 360.0F;
      }

      while(this.z - this.B >= 180.0F) {
         this.B += 360.0F;
      }

      while(this.aO - this.aP < -180.0F) {
         this.aP -= 360.0F;
      }

      while(this.aO - this.aP >= 180.0F) {
         this.aP += 360.0F;
      }

      this.o.C.b();
      this.aX += var7;
   }

   protected float f(float var1, float var2) {
      float var3 = qh.g(var1 - this.aM);
      this.aM += var3 * 0.3F;
      float var4 = qh.g(this.y - this.aM);
      boolean var5 = var4 < -90.0F || var4 >= 90.0F;
      if(var4 < -75.0F) {
         var4 = -75.0F;
      }

      if(var4 >= 75.0F) {
         var4 = 75.0F;
      }

      this.aM = this.y - var4;
      if(var4 * var4 > 2500.0F) {
         this.aM += var4 * 0.2F;
      }

      if(var5) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public void e() {
      if(this.bq > 0) {
         --this.bq;
      }

      if(this.bg > 0) {
         double var1 = this.s + (this.bh - this.s) / (double)this.bg;
         double var3 = this.t + (this.bi - this.t) / (double)this.bg;
         double var5 = this.u + (this.bj - this.u) / (double)this.bg;
         double var7 = qh.g(this.bk - (double)this.y);
         this.y = (float)((double)this.y + var7 / (double)this.bg);
         this.z = (float)((double)this.z + (this.bl - (double)this.z) / (double)this.bg);
         --this.bg;
         this.b(var1, var3, var5);
         this.b(this.y, this.z);
      } else if(!this.br()) {
         this.v *= 0.98D;
         this.w *= 0.98D;
         this.x *= 0.98D;
      }

      if(Math.abs(this.v) < 0.005D) {
         this.v = 0.0D;
      }

      if(Math.abs(this.w) < 0.005D) {
         this.w = 0.0D;
      }

      if(Math.abs(this.x) < 0.005D) {
         this.x = 0.0D;
      }

      this.o.C.a("ai");
      if(this.bh()) {
         this.bc = false;
         this.bd = 0.0F;
         this.be = 0.0F;
         this.bf = 0.0F;
      } else if(this.br()) {
         if(this.bk()) {
            this.o.C.a("newAi");
            this.bn();
            this.o.C.b();
         } else {
            this.o.C.a("oldAi");
            this.bq();
            this.o.C.b();
            this.aO = this.y;
         }
      }

      this.o.C.b();
      this.o.C.a("jump");
      if(this.bc) {
         if(!this.M() && !this.P()) {
            if(this.D && this.bq == 0) {
               this.bj();
               this.bq = 10;
            }
         } else {
            this.w += 0.03999999910593033D;
         }
      } else {
         this.bq = 0;
      }

      this.o.C.b();
      this.o.C.a("travel");
      this.bd *= 0.98F;
      this.be *= 0.98F;
      this.bf *= 0.9F;
      this.e(this.bd, this.be);
      this.o.C.b();
      this.o.C.a("push");
      if(!this.o.E) {
         this.bo();
      }

      this.o.C.b();
   }

   protected void bn() {}

   protected void bo() {
      List var1 = this.o.b((sa)this, this.C.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      if(var1 != null && !var1.isEmpty()) {
         for(int var2 = 0; var2 < var1.size(); ++var2) {
            sa var3 = (sa)var1.get(var2);
            if(var3.S()) {
               this.o(var3);
            }
         }
      }

   }

   protected void o(sa var1) {
      var1.g(this);
   }

   public void ab() {
      super.ab();
      this.aV = this.aW;
      this.aW = 0.0F;
      this.R = 0.0F;
   }

   protected void bp() {}

   protected void bq() {
      ++this.aU;
   }

   public void f(boolean var1) {
      this.bc = var1;
   }

   public void a(sa var1, int var2) {
      if(!var1.K && !this.o.E) {
         mn var3 = ((mt)this.o).r();
         if(var1 instanceof xk) {
            var3.a(var1, (ft)(new ij(var1.y(), this.y())));
         }

         if(var1 instanceof zc) {
            var3.a(var1, (ft)(new ij(var1.y(), this.y())));
         }

         if(var1 instanceof sq) {
            var3.a(var1, (ft)(new ij(var1.y(), this.y())));
         }
      }

   }

   public boolean p(sa var1) {
      return this.o.a(azw.a(this.s, this.t + (double)this.g(), this.u), azw.a(var1.s, var1.t + (double)var1.g(), var1.u)) == null;
   }

   public azw ag() {
      return this.j(1.0F);
   }

   public azw j(float var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      if(var1 == 1.0F) {
         var2 = qh.b(-this.y * 0.017453292F - 3.1415927F);
         var3 = qh.a(-this.y * 0.017453292F - 3.1415927F);
         var4 = -qh.b(-this.z * 0.017453292F);
         var5 = qh.a(-this.z * 0.017453292F);
         return azw.a((double)(var3 * var4), (double)var5, (double)(var2 * var4));
      } else {
         var2 = this.B + (this.z - this.B) * var1;
         var3 = this.A + (this.y - this.A) * var1;
         var4 = qh.b(-var3 * 0.017453292F - 3.1415927F);
         var5 = qh.a(-var3 * 0.017453292F - 3.1415927F);
         float var6 = -qh.b(-var2 * 0.017453292F);
         float var7 = qh.a(-var2 * 0.017453292F);
         return azw.a((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public boolean br() {
      return !this.o.E;
   }

   public boolean R() {
      return !this.K;
   }

   public boolean S() {
      return !this.K;
   }

   public float g() {
      return this.N * 0.85F;
   }

   protected void Q() {
      this.H = this.Z.nextDouble() >= this.a(yj.c).e();
   }

   public float au() {
      return this.aO;
   }

   public float bs() {
      return this.br;
   }

   public void m(float var1) {
      if(var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.br = var1;
   }

   public bae bt() {
      return null;
   }

   public boolean c(sv var1) {
      return this.a(var1.bt());
   }

   public boolean a(bae var1) {
      return this.bt() != null?this.bt().a(var1):false;
   }

   public void bu() {}

   public void bv() {}

}
