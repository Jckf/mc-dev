import java.util.Iterator;
import java.util.List;

public class wi extends wf implements rc {

   private static final sj bu = new wj();
   private static final th bv = (new to("horse.jumpStrength", 0.7D, 0.0D, 2.0D)).a("Jump Strength").a(true);
   private static final String[] bw = new String[]{null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png"};
   private static final String[] bx = new String[]{"", "meo", "goo", "dio"};
   private static final int[] by = new int[]{0, 5, 7, 11};
   private static final String[] bz = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
   private static final String[] bA = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
   private static final String[] bB = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
   private static final String[] bC = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
   private int bD;
   private int bE;
   private int bF;
   public int bp;
   public int bq;
   protected boolean br;
   private zt bG;
   private boolean bH;
   protected int bs;
   protected float bt;
   private boolean bI;
   private float bJ;
   private float bK;
   private float bL;
   private float bM;
   private float bN;
   private float bO;
   private int bP;
   private String bQ;
   private String[] bR = new String[3];


   public wi(ahb var1) {
      super(var1);
      this.a(1.4F, 1.6F);
      this.ae = false;
      this.l(false);
      this.m().a(true);
      this.c.a(0, new uf(this));
      this.c.a(1, new uz(this, 1.2D));
      this.c.a(1, new vg(this, 1.2D));
      this.c.a(2, new ua(this, 1.0D));
      this.c.a(4, new uh(this, 1.0D));
      this.c.a(6, new vc(this, 0.7D));
      this.c.a(7, new un(this, yz.class, 6.0F));
      this.c.a(8, new vb(this));
      this.cN();
   }

   protected void c() {
      super.c();
      this.af.a(16, Integer.valueOf(0));
      this.af.a(19, Byte.valueOf((byte)0));
      this.af.a(20, Integer.valueOf(0));
      this.af.a(21, String.valueOf(""));
      this.af.a(22, Integer.valueOf(0));
   }

   public void s(int var1) {
      this.af.b(19, Byte.valueOf((byte)var1));
      this.cP();
   }

   public int bZ() {
      return this.af.a(19);
   }

   public void t(int var1) {
      this.af.b(20, Integer.valueOf(var1));
      this.cP();
   }

   public int ca() {
      return this.af.c(20);
   }

   public String b_() {
      if(this.bH()) {
         return this.bG();
      } else {
         int var1 = this.bZ();
         switch(var1) {
         case 0:
         default:
            return dd.a("entity.horse.name");
         case 1:
            return dd.a("entity.donkey.name");
         case 2:
            return dd.a("entity.mule.name");
         case 3:
            return dd.a("entity.zombiehorse.name");
         case 4:
            return dd.a("entity.skeletonhorse.name");
         }
      }
   }

   private boolean x(int var1) {
      return (this.af.c(16) & var1) != 0;
   }

   private void b(int var1, boolean var2) {
      int var3 = this.af.c(16);
      if(var2) {
         this.af.b(16, Integer.valueOf(var3 | var1));
      } else {
         this.af.b(16, Integer.valueOf(var3 & ~var1));
      }

   }

   public boolean cb() {
      return !this.f();
   }

   public boolean cc() {
      return this.x(2);
   }

   public boolean cg() {
      return this.cb();
   }

   public String ch() {
      return this.af.e(21);
   }

   public void b(String var1) {
      this.af.b(21, var1);
   }

   public float ci() {
      int var1 = this.d();
      return var1 >= 0?1.0F:0.5F + (float)(-24000 - var1) / -24000.0F * 0.5F;
   }

   public void a(boolean var1) {
      if(var1) {
         this.a(this.ci());
      } else {
         this.a(1.0F);
      }

   }

   public boolean cj() {
      return this.br;
   }

   public void i(boolean var1) {
      this.b(2, var1);
   }

   public void j(boolean var1) {
      this.br = var1;
   }

   public boolean bM() {
      return !this.cE() && super.bM();
   }

   protected void o(float var1) {
      if(var1 > 6.0F && this.cm()) {
         this.o(false);
      }

   }

   public boolean ck() {
      return this.x(8);
   }

   public int cl() {
      return this.af.c(22);
   }

   private int e(add var1) {
      if(var1 == null) {
         return 0;
      } else {
         adb var2 = var1.b();
         return var2 == ade.bX?1:(var2 == ade.bY?2:(var2 == ade.bZ?3:0));
      }
   }

   public boolean cm() {
      return this.x(32);
   }

   public boolean cn() {
      return this.x(64);
   }

   public boolean co() {
      return this.x(16);
   }

   public boolean cp() {
      return this.bH;
   }

   public void d(add var1) {
      this.af.b(22, Integer.valueOf(this.e(var1)));
      this.cP();
   }

   public void k(boolean var1) {
      this.b(16, var1);
   }

   public void l(boolean var1) {
      this.b(8, var1);
   }

   public void m(boolean var1) {
      this.bH = var1;
   }

   public void n(boolean var1) {
      this.b(4, var1);
   }

   public int cq() {
      return this.bs;
   }

   public void u(int var1) {
      this.bs = var1;
   }

   public int v(int var1) {
      int var2 = qh.a(this.cq() + var1, 0, this.cw());
      this.u(var2);
      return var2;
   }

   public boolean a(ro var1, float var2) {
      sa var3 = var1.j();
      return this.l != null && this.l.equals(var3)?false:super.a(var1, var2);
   }

   public int aV() {
      return by[this.cl()];
   }

   public boolean S() {
      return this.l == null;
   }

   public boolean cr() {
      int var1 = qh.c(this.s);
      int var2 = qh.c(this.u);
      this.o.a(var1, var2);
      return true;
   }

   public void cs() {
      if(!this.o.E && this.ck()) {
         this.a(adb.a((aji)ajn.ae), 1);
         this.l(false);
      }
   }

   private void cL() {
      this.cS();
      this.o.a((sa)this, "eating", 1.0F, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
   }

   protected void b(float var1) {
      if(var1 > 1.0F) {
         this.a("mob.horse.land", 0.4F, 1.0F);
      }

      int var2 = qh.f(var1 * 0.5F - 3.0F);
      if(var2 > 0) {
         this.a(ro.h, (float)var2);
         if(this.l != null) {
            this.l.a(ro.h, (float)var2);
         }

         aji var3 = this.o.a(qh.c(this.s), qh.c(this.t - 0.2D - (double)this.A), qh.c(this.u));
         if(var3.o() != awt.a) {
            ajm var4 = var3.H;
            this.o.a((sa)this, var4.e(), var4.c() * 0.5F, var4.d() * 0.75F);
         }

      }
   }

   private int cM() {
      int var1 = this.bZ();
      return this.ck() && (var1 == 1 || var1 == 2)?17:2;
   }

   private void cN() {
      zt var1 = this.bG;
      this.bG = new zt("HorseChest", this.cM());
      this.bG.a(this.b_());
      if(var1 != null) {
         var1.b(this);
         int var2 = Math.min(var1.a(), this.bG.a());

         for(int var3 = 0; var3 < var2; ++var3) {
            add var4 = var1.a(var3);
            if(var4 != null) {
               this.bG.a(var3, var4.m());
            }
         }

         var1 = null;
      }

      this.bG.a(this);
      this.cO();
   }

   private void cO() {
      if(!this.o.E) {
         this.n(this.bG.a(0) != null);
         if(this.cB()) {
            this.d(this.bG.a(1));
         }
      }

   }

   public void a(rh var1) {
      int var2 = this.cl();
      boolean var3 = this.cu();
      this.cO();
      if(this.aa > 20) {
         if(var2 == 0 && var2 != this.cl()) {
            this.a("mob.horse.armor", 0.5F, 1.0F);
         } else if(var2 != this.cl()) {
            this.a("mob.horse.armor", 0.5F, 1.0F);
         }

         if(!var3 && this.cu()) {
            this.a("mob.horse.leather", 0.5F, 1.0F);
         }
      }

   }

   public boolean by() {
      this.cr();
      return super.by();
   }

   protected wi a(sa var1, double var2) {
      double var4 = Double.MAX_VALUE;
      sa var6 = null;
      List var7 = this.o.a(var1, var1.C.a(var2, var2, var2), bu);
      Iterator var8 = var7.iterator();

      while(var8.hasNext()) {
         sa var9 = (sa)var8.next();
         double var10 = var9.e(var1.s, var1.t, var1.u);
         if(var10 < var4) {
            var6 = var9;
            var4 = var10;
         }
      }

      return (wi)var6;
   }

   public double ct() {
      return this.a(bv).e();
   }

   protected String aU() {
      this.cS();
      int var1 = this.bZ();
      return var1 == 3?"mob.horse.zombie.death":(var1 == 4?"mob.horse.skeleton.death":(var1 != 1 && var1 != 2?"mob.horse.death":"mob.horse.donkey.death"));
   }

   protected adb u() {
      boolean var1 = this.Z.nextInt(4) == 0;
      int var2 = this.bZ();
      return var2 == 4?ade.aS:(var2 == 3?(var1?adb.d(0):ade.bh):ade.aA);
   }

   protected String aT() {
      this.cS();
      if(this.Z.nextInt(3) == 0) {
         this.cU();
      }

      int var1 = this.bZ();
      return var1 == 3?"mob.horse.zombie.hit":(var1 == 4?"mob.horse.skeleton.hit":(var1 != 1 && var1 != 2?"mob.horse.hit":"mob.horse.donkey.hit"));
   }

   public boolean cu() {
      return this.x(4);
   }

   protected String t() {
      this.cS();
      if(this.Z.nextInt(10) == 0 && !this.bh()) {
         this.cU();
      }

      int var1 = this.bZ();
      return var1 == 3?"mob.horse.zombie.idle":(var1 == 4?"mob.horse.skeleton.idle":(var1 != 1 && var1 != 2?"mob.horse.idle":"mob.horse.donkey.idle"));
   }

   protected String cv() {
      this.cS();
      this.cU();
      int var1 = this.bZ();
      return var1 != 3 && var1 != 4?(var1 != 1 && var1 != 2?"mob.horse.angry":"mob.horse.donkey.angry"):null;
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      ajm var5 = var4.H;
      if(this.o.a(var1, var2 + 1, var3) == ajn.aC) {
         var5 = ajn.aC.H;
      }

      if(!var4.o().d()) {
         int var6 = this.bZ();
         if(this.l != null && var6 != 1 && var6 != 2) {
            ++this.bP;
            if(this.bP > 5 && this.bP % 3 == 0) {
               this.a("mob.horse.gallop", var5.c() * 0.15F, var5.d());
               if(var6 == 0 && this.Z.nextInt(10) == 0) {
                  this.a("mob.horse.breathe", var5.c() * 0.6F, var5.d());
               }
            } else if(this.bP <= 5) {
               this.a("mob.horse.wood", var5.c() * 0.15F, var5.d());
            }
         } else if(var5 == aji.f) {
            this.a("mob.horse.wood", var5.c() * 0.15F, var5.d());
         } else {
            this.a("mob.horse.soft", var5.c() * 0.15F, var5.d());
         }
      }

   }

   protected void aD() {
      super.aD();
      this.bc().b(bv);
      this.a(yj.a).a(53.0D);
      this.a(yj.d).a(0.22499999403953552D);
   }

   public int bB() {
      return 6;
   }

   public int cw() {
      return 100;
   }

   protected float bf() {
      return 0.8F;
   }

   public int q() {
      return 400;
   }

   private void cP() {
      this.bQ = null;
   }

   public void g(yz var1) {
      if(!this.o.E && (this.l == null || this.l == var1) && this.cc()) {
         this.bG.a(this.b_());
         var1.a(this, (rb)this.bG);
      }

   }

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && var2.b() == ade.bx) {
         return super.a(var1);
      } else if(!this.cc() && this.cE()) {
         return false;
      } else if(this.cc() && this.cb() && var1.an()) {
         this.g(var1);
         return true;
      } else if(this.cg() && this.l != null) {
         return super.a(var1);
      } else {
         if(var2 != null) {
            boolean var3 = false;
            if(this.cB()) {
               byte var4 = -1;
               if(var2.b() == ade.bX) {
                  var4 = 1;
               } else if(var2.b() == ade.bY) {
                  var4 = 2;
               } else if(var2.b() == ade.bZ) {
                  var4 = 3;
               }

               if(var4 >= 0) {
                  if(!this.cc()) {
                     this.cJ();
                     return true;
                  }

                  this.g(var1);
                  return true;
               }
            }

            if(!var3 && !this.cE()) {
               float var7 = 0.0F;
               short var5 = 0;
               byte var6 = 0;
               if(var2.b() == ade.O) {
                  var7 = 2.0F;
                  var5 = 60;
                  var6 = 3;
               } else if(var2.b() == ade.aT) {
                  var7 = 1.0F;
                  var5 = 30;
                  var6 = 3;
               } else if(var2.b() == ade.P) {
                  var7 = 7.0F;
                  var5 = 180;
                  var6 = 3;
               } else if(aji.a(var2.b()) == ajn.cf) {
                  var7 = 20.0F;
                  var5 = 180;
               } else if(var2.b() == ade.e) {
                  var7 = 3.0F;
                  var5 = 60;
                  var6 = 3;
               } else if(var2.b() == ade.bK) {
                  var7 = 4.0F;
                  var5 = 60;
                  var6 = 5;
                  if(this.cc() && this.d() == 0) {
                     var3 = true;
                     this.f(var1);
                  }
               } else if(var2.b() == ade.ao) {
                  var7 = 10.0F;
                  var5 = 240;
                  var6 = 10;
                  if(this.cc() && this.d() == 0) {
                     var3 = true;
                     this.f(var1);
                  }
               }

               if(this.aS() < this.aY() && var7 > 0.0F) {
                  this.f(var7);
                  var3 = true;
               }

               if(!this.cb() && var5 > 0) {
                  this.a(var5);
                  var3 = true;
               }

               if(var6 > 0 && (var3 || !this.cc()) && var6 < this.cw()) {
                  var3 = true;
                  this.v(var6);
               }

               if(var3) {
                  this.cL();
               }
            }

            if(!this.cc() && !var3) {
               if(var2 != null && var2.a(var1, (sv)this)) {
                  return true;
               }

               this.cJ();
               return true;
            }

            if(!var3 && this.cC() && !this.ck() && var2.b() == adb.a((aji)ajn.ae)) {
               this.l(true);
               this.a("mob.chickenplop", 1.0F, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
               var3 = true;
               this.cN();
            }

            if(!var3 && this.cg() && !this.cu() && var2.b() == ade.av) {
               this.g(var1);
               return true;
            }

            if(var3) {
               if(!var1.bE.d && --var2.b == 0) {
                  var1.bm.a(var1.bm.c, (add)null);
               }

               return true;
            }
         }

         if(this.cg() && this.l == null) {
            if(var2 != null && var2.a(var1, (sv)this)) {
               return true;
            } else {
               this.i(var1);
               return true;
            }
         } else {
            return super.a(var1);
         }
      }
   }

   private void i(yz var1) {
      var1.y = this.y;
      var1.z = this.z;
      this.o(false);
      this.p(false);
      if(!this.o.E) {
         var1.a((sa)this);
      }

   }

   public boolean cB() {
      return this.bZ() == 0;
   }

   public boolean cC() {
      int var1 = this.bZ();
      return var1 == 2 || var1 == 1;
   }

   protected boolean bh() {
      return this.l != null && this.cu()?true:this.cm() || this.cn();
   }

   public boolean cE() {
      int var1 = this.bZ();
      return var1 == 3 || var1 == 4;
   }

   public boolean cF() {
      return this.cE() || this.bZ() == 2;
   }

   public boolean c(add var1) {
      return false;
   }

   private void cR() {
      this.bp = 1;
   }

   public void a(ro var1) {
      super.a(var1);
      if(!this.o.E) {
         this.cK();
      }

   }

   public void e() {
      if(this.Z.nextInt(200) == 0) {
         this.cR();
      }

      super.e();
      if(!this.o.E) {
         if(this.Z.nextInt(900) == 0 && this.aA == 0) {
            this.f(1.0F);
         }

         if(!this.cm() && this.l == null && this.Z.nextInt(300) == 0 && this.o.a(qh.c(this.s), qh.c(this.t) - 1, qh.c(this.u)) == ajn.c) {
            this.o(true);
         }

         if(this.cm() && ++this.bD > 50) {
            this.bD = 0;
            this.o(false);
         }

         if(this.co() && !this.cb() && !this.cm()) {
            wi var1 = this.a(this, 16.0D);
            if(var1 != null && this.f(var1) > 4.0D) {
               ayf var2 = this.o.a(this, var1, 16.0F, true, false, false, true);
               this.a(var2);
            }
         }
      }

   }

   public void h() {
      super.h();
      if(this.o.E && this.af.a()) {
         this.af.e();
         this.cP();
      }

      if(this.bE > 0 && ++this.bE > 30) {
         this.bE = 0;
         this.b(128, false);
      }

      if(!this.o.E && this.bF > 0 && ++this.bF > 20) {
         this.bF = 0;
         this.p(false);
      }

      if(this.bp > 0 && ++this.bp > 8) {
         this.bp = 0;
      }

      if(this.bq > 0) {
         ++this.bq;
         if(this.bq > 300) {
            this.bq = 0;
         }
      }

      this.bK = this.bJ;
      if(this.cm()) {
         this.bJ += (1.0F - this.bJ) * 0.4F + 0.05F;
         if(this.bJ > 1.0F) {
            this.bJ = 1.0F;
         }
      } else {
         this.bJ += (0.0F - this.bJ) * 0.4F - 0.05F;
         if(this.bJ < 0.0F) {
            this.bJ = 0.0F;
         }
      }

      this.bM = this.bL;
      if(this.cn()) {
         this.bK = this.bJ = 0.0F;
         this.bL += (1.0F - this.bL) * 0.4F + 0.05F;
         if(this.bL > 1.0F) {
            this.bL = 1.0F;
         }
      } else {
         this.bI = false;
         this.bL += (0.8F * this.bL * this.bL * this.bL - this.bL) * 0.6F - 0.05F;
         if(this.bL < 0.0F) {
            this.bL = 0.0F;
         }
      }

      this.bO = this.bN;
      if(this.x(128)) {
         this.bN += (1.0F - this.bN) * 0.7F + 0.05F;
         if(this.bN > 1.0F) {
            this.bN = 1.0F;
         }
      } else {
         this.bN += (0.0F - this.bN) * 0.7F - 0.05F;
         if(this.bN < 0.0F) {
            this.bN = 0.0F;
         }
      }

   }

   private void cS() {
      if(!this.o.E) {
         this.bE = 1;
         this.b(128, true);
      }

   }

   private boolean cT() {
      return this.l == null && this.m == null && this.cc() && this.cb() && !this.cF() && this.aS() >= this.aY();
   }

   public void e(boolean var1) {
      this.b(32, var1);
   }

   public void o(boolean var1) {
      this.e(var1);
   }

   public void p(boolean var1) {
      if(var1) {
         this.o(false);
      }

      this.b(64, var1);
   }

   private void cU() {
      if(!this.o.E) {
         this.bF = 1;
         this.p(true);
      }

   }

   public void cJ() {
      this.cU();
      String var1 = this.cv();
      if(var1 != null) {
         this.a(var1, this.bf(), this.bg());
      }

   }

   public void cK() {
      this.a(this, this.bG);
      this.cs();
   }

   private void a(sa var1, zt var2) {
      if(var2 != null && !this.o.E) {
         for(int var3 = 0; var3 < var2.a(); ++var3) {
            add var4 = var2.a(var3);
            if(var4 != null) {
               this.a(var4, 0.0F);
            }
         }

      }
   }

   public boolean h(yz var1) {
      this.b(var1.aB().toString());
      this.i(true);
      return true;
   }

   public void e(float var1, float var2) {
      if(this.l != null && this.l instanceof sv && this.cu()) {
         this.A = this.y = this.l.y;
         this.z = this.l.z * 0.5F;
         this.b(this.y, this.z);
         this.aO = this.aM = this.y;
         var1 = ((sv)this.l).bd * 0.5F;
         var2 = ((sv)this.l).be;
         if(var2 <= 0.0F) {
            var2 *= 0.25F;
            this.bP = 0;
         }

         if(this.D && this.bt == 0.0F && this.cn() && !this.bI) {
            var1 = 0.0F;
            var2 = 0.0F;
         }

         if(this.bt > 0.0F && !this.cj() && this.D) {
            this.w = this.ct() * (double)this.bt;
            if(this.a(rv.j)) {
               this.w += (double)((float)(this.b(rv.j).c() + 1) * 0.1F);
            }

            this.j(true);
            this.al = true;
            if(var2 > 0.0F) {
               float var3 = qh.a(this.y * 3.1415927F / 180.0F);
               float var4 = qh.b(this.y * 3.1415927F / 180.0F);
               this.v += (double)(-0.4F * var3 * this.bt);
               this.x += (double)(0.4F * var4 * this.bt);
               this.a("mob.horse.jump", 0.4F, 1.0F);
            }

            this.bt = 0.0F;
         }

         this.W = 1.0F;
         this.aQ = this.bl() * 0.1F;
         if(!this.o.E) {
            this.i((float)this.a(yj.d).e());
            super.e(var1, var2);
         }

         if(this.D) {
            this.bt = 0.0F;
            this.j(false);
         }

         this.aE = this.aF;
         double var8 = this.s - this.p;
         double var5 = this.u - this.r;
         float var7 = qh.a(var8 * var8 + var5 * var5) * 4.0F;
         if(var7 > 1.0F) {
            var7 = 1.0F;
         }

         this.aF += (var7 - this.aF) * 0.4F;
         this.aG += this.aF;
      } else {
         this.W = 0.5F;
         this.aQ = 0.02F;
         super.e(var1, var2);
      }
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("EatingHaystack", this.cm());
      var1.a("ChestedHorse", this.ck());
      var1.a("HasReproduced", this.cp());
      var1.a("Bred", this.co());
      var1.a("Type", this.bZ());
      var1.a("Variant", this.ca());
      var1.a("Temper", this.cq());
      var1.a("Tame", this.cc());
      var1.a("OwnerUUID", this.ch());
      if(this.ck()) {
         dq var2 = new dq();

         for(int var3 = 2; var3 < this.bG.a(); ++var3) {
            add var4 = this.bG.a(var3);
            if(var4 != null) {
               dh var5 = new dh();
               var5.a("Slot", (byte)var3);
               var4.b(var5);
               var2.a((dy)var5);
            }
         }

         var1.a("Items", (dy)var2);
      }

      if(this.bG.a(1) != null) {
         var1.a("ArmorItem", (dy)this.bG.a(1).b(new dh()));
      }

      if(this.bG.a(0) != null) {
         var1.a("SaddleItem", (dy)this.bG.a(0).b(new dh()));
      }

   }

   public void a(dh var1) {
      super.a(var1);
      this.o(var1.n("EatingHaystack"));
      this.k(var1.n("Bred"));
      this.l(var1.n("ChestedHorse"));
      this.m(var1.n("HasReproduced"));
      this.s(var1.f("Type"));
      this.t(var1.f("Variant"));
      this.u(var1.f("Temper"));
      this.i(var1.n("Tame"));
      if(var1.b("OwnerUUID", 8)) {
         this.b(var1.j("OwnerUUID"));
      }

      ti var2 = this.bc().a("Speed");
      if(var2 != null) {
         this.a(yj.d).a(var2.b() * 0.25D);
      }

      if(this.ck()) {
         dq var3 = var1.c("Items", 10);
         this.cN();

         for(int var4 = 0; var4 < var3.c(); ++var4) {
            dh var5 = var3.b(var4);
            int var6 = var5.d("Slot") & 255;
            if(var6 >= 2 && var6 < this.bG.a()) {
               this.bG.a(var6, add.a(var5));
            }
         }
      }

      add var7;
      if(var1.b("ArmorItem", 10)) {
         var7 = add.a(var1.m("ArmorItem"));
         if(var7 != null && a(var7.b())) {
            this.bG.a(1, var7);
         }
      }

      if(var1.b("SaddleItem", 10)) {
         var7 = add.a(var1.m("SaddleItem"));
         if(var7 != null && var7.b() == ade.av) {
            this.bG.a(0, var7);
         }
      } else if(var1.n("Saddle")) {
         this.bG.a(0, new add(ade.av));
      }

      this.cO();
   }

   public boolean a(wf var1) {
      if(var1 == this) {
         return false;
      } else if(var1.getClass() != this.getClass()) {
         return false;
      } else {
         wi var2 = (wi)var1;
         if(this.cT() && var2.cT()) {
            int var3 = this.bZ();
            int var4 = var2.bZ();
            return var3 == var4 || var3 == 0 && var4 == 1 || var3 == 1 && var4 == 0;
         } else {
            return false;
         }
      }
   }

   public rx a(rx var1) {
      wi var2 = (wi)var1;
      wi var3 = new wi(this.o);
      int var4 = this.bZ();
      int var5 = var2.bZ();
      int var6 = 0;
      if(var4 == var5) {
         var6 = var4;
      } else if(var4 == 0 && var5 == 1 || var4 == 1 && var5 == 0) {
         var6 = 2;
      }

      if(var6 == 0) {
         int var8 = this.Z.nextInt(9);
         int var7;
         if(var8 < 4) {
            var7 = this.ca() & 255;
         } else if(var8 < 8) {
            var7 = var2.ca() & 255;
         } else {
            var7 = this.Z.nextInt(7);
         }

         int var9 = this.Z.nextInt(5);
         if(var9 < 2) {
            var7 |= this.ca() & '\uff00';
         } else if(var9 < 4) {
            var7 |= var2.ca() & '\uff00';
         } else {
            var7 |= this.Z.nextInt(5) << 8 & '\uff00';
         }

         var3.t(var7);
      }

      var3.s(var6);
      double var13 = this.a(yj.a).b() + var1.a(yj.a).b() + (double)this.cV();
      var3.a(yj.a).a(var13 / 3.0D);
      double var14 = this.a(bv).b() + var1.a(bv).b() + this.cW();
      var3.a(bv).a(var14 / 3.0D);
      double var11 = this.a(yj.d).b() + var1.a(yj.d).b() + this.cX();
      var3.a(yj.d).a(var11 / 3.0D);
      return var3;
   }

   public sy a(sy var1) {
      Object var6 = super.a(var1);
      boolean var2 = false;
      int var3 = 0;
      int var7;
      if(var6 instanceof wk) {
         var7 = ((wk)var6).a;
         var3 = ((wk)var6).b & 255 | this.Z.nextInt(5) << 8;
      } else {
         if(this.Z.nextInt(10) == 0) {
            var7 = 1;
         } else {
            int var4 = this.Z.nextInt(7);
            int var5 = this.Z.nextInt(5);
            var7 = 0;
            var3 = var4 | var5 << 8;
         }

         var6 = new wk(var7, var3);
      }

      this.s(var7);
      this.t(var3);
      if(this.Z.nextInt(5) == 0) {
         this.c(-24000);
      }

      if(var7 != 4 && var7 != 3) {
         this.a(yj.a).a((double)this.cV());
         if(var7 == 0) {
            this.a(yj.d).a(this.cX());
         } else {
            this.a(yj.d).a(0.17499999701976776D);
         }
      } else {
         this.a(yj.a).a(15.0D);
         this.a(yj.d).a(0.20000000298023224D);
      }

      if(var7 != 2 && var7 != 1) {
         this.a(bv).a(this.cW());
      } else {
         this.a(bv).a(0.5D);
      }

      this.g(this.aY());
      return (sy)var6;
   }

   protected boolean bk() {
      return true;
   }

   public void w(int var1) {
      if(this.cu()) {
         if(var1 < 0) {
            var1 = 0;
         } else {
            this.bI = true;
            this.cU();
         }

         if(var1 >= 90) {
            this.bt = 1.0F;
         } else {
            this.bt = 0.4F + 0.4F * (float)var1 / 90.0F;
         }
      }

   }

   public void ac() {
      super.ac();
      if(this.bM > 0.0F) {
         float var1 = qh.a(this.aM * 3.1415927F / 180.0F);
         float var2 = qh.b(this.aM * 3.1415927F / 180.0F);
         float var3 = 0.7F * this.bM;
         float var4 = 0.15F * this.bM;
         this.l.b(this.s + (double)(var3 * var1), this.t + this.ae() + this.l.ad() + (double)var4, this.u - (double)(var3 * var2));
         if(this.l instanceof sv) {
            ((sv)this.l).aM = this.aM;
         }
      }

   }

   private float cV() {
      return 15.0F + (float)this.Z.nextInt(8) + (float)this.Z.nextInt(9);
   }

   private double cW() {
      return 0.4000000059604645D + this.Z.nextDouble() * 0.2D + this.Z.nextDouble() * 0.2D + this.Z.nextDouble() * 0.2D;
   }

   private double cX() {
      return (0.44999998807907104D + this.Z.nextDouble() * 0.3D + this.Z.nextDouble() * 0.3D + this.Z.nextDouble() * 0.3D) * 0.25D;
   }

   public static boolean a(adb var0) {
      return var0 == ade.bX || var0 == ade.bY || var0 == ade.bZ;
   }

   public boolean h_() {
      return false;
   }

}
