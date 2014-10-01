import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class yv extends rx implements agm, yu {

   private int bq;
   private boolean br;
   private boolean bs;
   vz bp;
   private yz bt;
   private ago bu;
   private int bv;
   private boolean bw;
   private int bx;
   private String by;
   private boolean bz;
   private float bA;
   private static final Map bB = new HashMap();
   private static final Map bC = new HashMap();


   public yv(ahb var1) {
      this(var1, 0);
   }

   public yv(ahb var1, int var2) {
      super(var1);
      this.s(var2);
      this.a(0.6F, 1.8F);
      this.m().b(true);
      this.m().a(true);
      this.c.a(0, new uf(this));
      this.c.a(1, new tw(this, yq.class, 8.0F, 0.6D, 0.6D));
      this.c.a(1, new vl(this));
      this.c.a(1, new uo(this));
      this.c.a(2, new ur(this));
      this.c.a(3, new ve(this));
      this.c.a(4, new uy(this, true));
      this.c.a(5, new ut(this, 0.6D));
      this.c.a(6, new up(this));
      this.c.a(7, new vj(this));
      this.c.a(8, new va(this, 0.32D));
      this.c.a(9, new ul(this, yz.class, 3.0F, 1.0F));
      this.c.a(9, new ul(this, yv.class, 5.0F, 0.02F));
      this.c.a(9, new vc(this, 0.6D));
      this.c.a(10, new un(this, sw.class, 8.0F));
   }

   protected void aD() {
      super.aD();
      this.a(yj.d).a(0.5D);
   }

   public boolean bk() {
      return true;
   }

   protected void bp() {
      if(--this.bq <= 0) {
         this.o.A.a(qh.c(this.s), qh.c(this.t), qh.c(this.u));
         this.bq = 70 + this.Z.nextInt(50);
         this.bp = this.o.A.a(qh.c(this.s), qh.c(this.t), qh.c(this.u), 32);
         if(this.bp == null) {
            this.bX();
         } else {
            r var1 = this.bp.a();
            this.a(var1.a, var1.b, var1.c, (int)((float)this.bp.b() * 0.6F));
            if(this.bz) {
               this.bz = false;
               this.bp.b(5);
            }
         }
      }

      if(!this.cc() && this.bv > 0) {
         --this.bv;
         if(this.bv <= 0) {
            if(this.bw) {
               if(this.bu.size() > 1) {
                  Iterator var3 = this.bu.iterator();

                  while(var3.hasNext()) {
                     agn var2 = (agn)var3.next();
                     if(var2.g()) {
                        var2.a(this.Z.nextInt(6) + this.Z.nextInt(6) + 2);
                     }
                  }
               }

               this.t(1);
               this.bw = false;
               if(this.bp != null && this.by != null) {
                  this.o.a(this, (byte)14);
                  this.bp.a(this.by, 1);
               }
            }

            this.c(new rw(rv.l.H, 200, 0));
         }
      }

      super.bp();
   }

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      boolean var3 = var2 != null && var2.b() == ade.bx;
      if(!var3 && this.Z() && !this.cc() && !this.f()) {
         if(!this.o.E) {
            this.a_(var1);
            var1.a((agm)this, this.bG());
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   protected void c() {
      super.c();
      this.af.a(16, Integer.valueOf(0));
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Profession", this.bZ());
      var1.a("Riches", this.bx);
      if(this.bu != null) {
         var1.a("Offers", (dy)this.bu.a());
      }

   }

   public void a(dh var1) {
      super.a(var1);
      this.s(var1.f("Profession"));
      this.bx = var1.f("Riches");
      if(var1.b("Offers", 10)) {
         dh var2 = var1.m("Offers");
         this.bu = new ago(var2);
      }

   }

   protected boolean v() {
      return false;
   }

   protected String t() {
      return this.cc()?"mob.villager.haggle":"mob.villager.idle";
   }

   protected String aT() {
      return "mob.villager.hit";
   }

   protected String aU() {
      return "mob.villager.death";
   }

   public void s(int var1) {
      this.af.b(16, Integer.valueOf(var1));
   }

   public int bZ() {
      return this.af.c(16);
   }

   public boolean ca() {
      return this.br;
   }

   public void i(boolean var1) {
      this.br = var1;
   }

   public void j(boolean var1) {
      this.bs = var1;
   }

   public boolean cb() {
      return this.bs;
   }

   public void b(sv var1) {
      super.b(var1);
      if(this.bp != null && var1 != null) {
         this.bp.a(var1);
         if(var1 instanceof yz) {
            byte var2 = -1;
            if(this.f()) {
               var2 = -3;
            }

            this.bp.a(var1.b_(), var2);
            if(this.Z()) {
               this.o.a(this, (byte)13);
            }
         }
      }

   }

   public void a(ro var1) {
      if(this.bp != null) {
         sa var2 = var1.j();
         if(var2 != null) {
            if(var2 instanceof yz) {
               this.bp.a(var2.b_(), -2);
            } else if(var2 instanceof yb) {
               this.bp.h();
            }
         } else if(var2 == null) {
            yz var3 = this.o.a(this, 16.0D);
            if(var3 != null) {
               this.bp.h();
            }
         }
      }

      super.a(var1);
   }

   public void a_(yz var1) {
      this.bt = var1;
   }

   public yz b() {
      return this.bt;
   }

   public boolean cc() {
      return this.bt != null;
   }

   public void a(agn var1) {
      var1.f();
      this.a_ = -this.q();
      this.a("mob.villager.yes", this.bf(), this.bg());
      if(var1.a((agn)this.bu.get(this.bu.size() - 1))) {
         this.bv = 40;
         this.bw = true;
         if(this.bt != null) {
            this.by = this.bt.b_();
         } else {
            this.by = null;
         }
      }

      if(var1.a().b() == ade.bC) {
         this.bx += var1.a().b;
      }

   }

   public void a_(add var1) {
      if(!this.o.E && this.a_ > -this.q() + 20) {
         this.a_ = -this.q();
         if(var1 != null) {
            this.a("mob.villager.yes", this.bf(), this.bg());
         } else {
            this.a("mob.villager.no", this.bf(), this.bg());
         }
      }

   }

   public ago b(yz var1) {
      if(this.bu == null) {
         this.t(1);
      }

      return this.bu;
   }

   private float p(float var1) {
      float var2 = var1 + this.bA;
      return var2 > 0.9F?0.9F - (var2 - 0.9F):var2;
   }

   private void t(int var1) {
      if(this.bu != null) {
         this.bA = qh.c((float)this.bu.size()) * 0.2F;
      } else {
         this.bA = 0.0F;
      }

      ago var2;
      var2 = new ago();
      int var6;
      label50:
      switch(this.bZ()) {
      case 0:
         a(var2, ade.O, this.Z, this.p(0.9F));
         a(var2, adb.a(ajn.L), this.Z, this.p(0.5F));
         a(var2, ade.bf, this.Z, this.p(0.5F));
         a(var2, ade.aQ, this.Z, this.p(0.4F));
         b(var2, ade.P, this.Z, this.p(0.9F));
         b(var2, ade.ba, this.Z, this.p(0.3F));
         b(var2, ade.e, this.Z, this.p(0.3F));
         b(var2, ade.aX, this.Z, this.p(0.3F));
         b(var2, ade.aZ, this.Z, this.p(0.3F));
         b(var2, ade.d, this.Z, this.p(0.3F));
         b(var2, ade.bg, this.Z, this.p(0.3F));
         b(var2, ade.g, this.Z, this.p(0.5F));
         if(this.Z.nextFloat() < this.p(0.5F)) {
            var2.add(new agn(new add(ajn.n, 10), new add(ade.bC), new add(ade.ak, 4 + this.Z.nextInt(2), 0)));
         }
         break;
      case 1:
         a(var2, ade.aF, this.Z, this.p(0.8F));
         a(var2, ade.aG, this.Z, this.p(0.8F));
         a(var2, ade.bB, this.Z, this.p(0.3F));
         b(var2, adb.a(ajn.X), this.Z, this.p(0.8F));
         b(var2, adb.a(ajn.w), this.Z, this.p(0.2F));
         b(var2, ade.aL, this.Z, this.p(0.2F));
         b(var2, ade.aN, this.Z, this.p(0.2F));
         if(this.Z.nextFloat() < this.p(0.07F)) {
            aft var8 = aft.c[this.Z.nextInt(aft.c.length)];
            int var10 = qh.a(this.Z, var8.d(), var8.b());
            add var11 = ade.bR.a(new agc(var8, var10));
            var6 = 2 + this.Z.nextInt(5 + var10 * 10) + 3 * var10;
            var2.add(new agn(new add(ade.aG), new add(ade.bC, var6), var11));
         }
         break;
      case 2:
         b(var2, ade.bv, this.Z, this.p(0.3F));
         b(var2, ade.by, this.Z, this.p(0.2F));
         b(var2, ade.ax, this.Z, this.p(0.4F));
         b(var2, adb.a(ajn.aN), this.Z, this.p(0.3F));
         adb[] var3 = new adb[]{ade.l, ade.u, ade.Z, ade.ad, ade.c, ade.x, ade.b, ade.w};
         adb[] var4 = var3;
         int var5 = var3.length;
         var6 = 0;

         while(true) {
            if(var6 >= var5) {
               break label50;
            }

            adb var7 = var4[var6];
            if(this.Z.nextFloat() < this.p(0.05F)) {
               var2.add(new agn(new add(var7, 1, 0), new add(ade.bC, 2 + this.Z.nextInt(3), 0), afv.a(this.Z, new add(var7, 1, 0), 5 + this.Z.nextInt(15))));
            }

            ++var6;
         }
      case 3:
         a(var2, ade.h, this.Z, this.p(0.7F));
         a(var2, ade.j, this.Z, this.p(0.5F));
         a(var2, ade.k, this.Z, this.p(0.5F));
         a(var2, ade.i, this.Z, this.p(0.5F));
         b(var2, ade.l, this.Z, this.p(0.5F));
         b(var2, ade.u, this.Z, this.p(0.5F));
         b(var2, ade.c, this.Z, this.p(0.3F));
         b(var2, ade.x, this.Z, this.p(0.3F));
         b(var2, ade.b, this.Z, this.p(0.5F));
         b(var2, ade.w, this.Z, this.p(0.5F));
         b(var2, ade.a, this.Z, this.p(0.2F));
         b(var2, ade.v, this.Z, this.p(0.2F));
         b(var2, ade.K, this.Z, this.p(0.2F));
         b(var2, ade.L, this.Z, this.p(0.2F));
         b(var2, ade.ab, this.Z, this.p(0.2F));
         b(var2, ade.af, this.Z, this.p(0.2F));
         b(var2, ade.Y, this.Z, this.p(0.2F));
         b(var2, ade.ac, this.Z, this.p(0.2F));
         b(var2, ade.Z, this.Z, this.p(0.2F));
         b(var2, ade.ad, this.Z, this.p(0.2F));
         b(var2, ade.aa, this.Z, this.p(0.2F));
         b(var2, ade.ae, this.Z, this.p(0.2F));
         b(var2, ade.X, this.Z, this.p(0.1F));
         b(var2, ade.U, this.Z, this.p(0.1F));
         b(var2, ade.V, this.Z, this.p(0.1F));
         b(var2, ade.W, this.Z, this.p(0.1F));
         break;
      case 4:
         a(var2, ade.h, this.Z, this.p(0.7F));
         a(var2, ade.al, this.Z, this.p(0.5F));
         a(var2, ade.bd, this.Z, this.p(0.5F));
         b(var2, ade.av, this.Z, this.p(0.1F));
         b(var2, ade.R, this.Z, this.p(0.3F));
         b(var2, ade.T, this.Z, this.p(0.3F));
         b(var2, ade.Q, this.Z, this.p(0.3F));
         b(var2, ade.S, this.Z, this.p(0.3F));
         b(var2, ade.am, this.Z, this.p(0.3F));
         b(var2, ade.be, this.Z, this.p(0.3F));
      }

      if(var2.isEmpty()) {
         a(var2, ade.k, this.Z, 1.0F);
      }

      Collections.shuffle(var2);
      if(this.bu == null) {
         this.bu = new ago();
      }

      for(int var9 = 0; var9 < var1 && var9 < var2.size(); ++var9) {
         this.bu.a((agn)var2.get(var9));
      }

   }

   private static void a(ago var0, adb var1, Random var2, float var3) {
      if(var2.nextFloat() < var3) {
         var0.add(new agn(a(var1, var2), ade.bC));
      }

   }

   private static add a(adb var0, Random var1) {
      return new add(var0, b(var0, var1), 0);
   }

   private static int b(adb var0, Random var1) {
      qu var2 = (qu)bB.get(var0);
      return var2 == null?1:(((Integer)var2.a()).intValue() >= ((Integer)var2.b()).intValue()?((Integer)var2.a()).intValue():((Integer)var2.a()).intValue() + var1.nextInt(((Integer)var2.b()).intValue() - ((Integer)var2.a()).intValue()));
   }

   private static void b(ago var0, adb var1, Random var2, float var3) {
      if(var2.nextFloat() < var3) {
         int var4 = c(var1, var2);
         add var5;
         add var6;
         if(var4 < 0) {
            var5 = new add(ade.bC, 1, 0);
            var6 = new add(var1, -var4, 0);
         } else {
            var5 = new add(ade.bC, var4, 0);
            var6 = new add(var1, 1, 0);
         }

         var0.add(new agn(var5, var6));
      }

   }

   private static int c(adb var0, Random var1) {
      qu var2 = (qu)bC.get(var0);
      return var2 == null?1:(((Integer)var2.a()).intValue() >= ((Integer)var2.b()).intValue()?((Integer)var2.a()).intValue():((Integer)var2.a()).intValue() + var1.nextInt(((Integer)var2.b()).intValue() - ((Integer)var2.a()).intValue()));
   }

   public sy a(sy var1) {
      var1 = super.a(var1);
      this.s(this.o.s.nextInt(5));
      return var1;
   }

   public void cd() {
      this.bz = true;
   }

   public yv b(rx var1) {
      yv var2 = new yv(this.o);
      var2.a((sy)null);
      return var2;
   }

   public boolean bM() {
      return false;
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.b(var1);
   }

   static {
      bB.put(ade.h, new qu(Integer.valueOf(16), Integer.valueOf(24)));
      bB.put(ade.j, new qu(Integer.valueOf(8), Integer.valueOf(10)));
      bB.put(ade.k, new qu(Integer.valueOf(8), Integer.valueOf(10)));
      bB.put(ade.i, new qu(Integer.valueOf(4), Integer.valueOf(6)));
      bB.put(ade.aF, new qu(Integer.valueOf(24), Integer.valueOf(36)));
      bB.put(ade.aG, new qu(Integer.valueOf(11), Integer.valueOf(13)));
      bB.put(ade.bB, new qu(Integer.valueOf(1), Integer.valueOf(1)));
      bB.put(ade.bi, new qu(Integer.valueOf(3), Integer.valueOf(4)));
      bB.put(ade.bv, new qu(Integer.valueOf(2), Integer.valueOf(3)));
      bB.put(ade.al, new qu(Integer.valueOf(14), Integer.valueOf(18)));
      bB.put(ade.bd, new qu(Integer.valueOf(14), Integer.valueOf(18)));
      bB.put(ade.bf, new qu(Integer.valueOf(14), Integer.valueOf(18)));
      bB.put(ade.aQ, new qu(Integer.valueOf(9), Integer.valueOf(13)));
      bB.put(ade.N, new qu(Integer.valueOf(34), Integer.valueOf(48)));
      bB.put(ade.bc, new qu(Integer.valueOf(30), Integer.valueOf(38)));
      bB.put(ade.bb, new qu(Integer.valueOf(30), Integer.valueOf(38)));
      bB.put(ade.O, new qu(Integer.valueOf(18), Integer.valueOf(22)));
      bB.put(adb.a(ajn.L), new qu(Integer.valueOf(14), Integer.valueOf(22)));
      bB.put(ade.bh, new qu(Integer.valueOf(36), Integer.valueOf(64)));
      bC.put(ade.d, new qu(Integer.valueOf(3), Integer.valueOf(4)));
      bC.put(ade.aZ, new qu(Integer.valueOf(3), Integer.valueOf(4)));
      bC.put(ade.l, new qu(Integer.valueOf(7), Integer.valueOf(11)));
      bC.put(ade.u, new qu(Integer.valueOf(12), Integer.valueOf(14)));
      bC.put(ade.c, new qu(Integer.valueOf(6), Integer.valueOf(8)));
      bC.put(ade.x, new qu(Integer.valueOf(9), Integer.valueOf(12)));
      bC.put(ade.b, new qu(Integer.valueOf(7), Integer.valueOf(9)));
      bC.put(ade.w, new qu(Integer.valueOf(10), Integer.valueOf(12)));
      bC.put(ade.a, new qu(Integer.valueOf(4), Integer.valueOf(6)));
      bC.put(ade.v, new qu(Integer.valueOf(7), Integer.valueOf(8)));
      bC.put(ade.K, new qu(Integer.valueOf(4), Integer.valueOf(6)));
      bC.put(ade.L, new qu(Integer.valueOf(7), Integer.valueOf(8)));
      bC.put(ade.ab, new qu(Integer.valueOf(4), Integer.valueOf(6)));
      bC.put(ade.af, new qu(Integer.valueOf(7), Integer.valueOf(8)));
      bC.put(ade.Y, new qu(Integer.valueOf(4), Integer.valueOf(6)));
      bC.put(ade.ac, new qu(Integer.valueOf(7), Integer.valueOf(8)));
      bC.put(ade.Z, new qu(Integer.valueOf(10), Integer.valueOf(14)));
      bC.put(ade.ad, new qu(Integer.valueOf(16), Integer.valueOf(19)));
      bC.put(ade.aa, new qu(Integer.valueOf(8), Integer.valueOf(10)));
      bC.put(ade.ae, new qu(Integer.valueOf(11), Integer.valueOf(14)));
      bC.put(ade.X, new qu(Integer.valueOf(5), Integer.valueOf(7)));
      bC.put(ade.U, new qu(Integer.valueOf(5), Integer.valueOf(7)));
      bC.put(ade.V, new qu(Integer.valueOf(11), Integer.valueOf(15)));
      bC.put(ade.W, new qu(Integer.valueOf(9), Integer.valueOf(11)));
      bC.put(ade.P, new qu(Integer.valueOf(-4), Integer.valueOf(-2)));
      bC.put(ade.ba, new qu(Integer.valueOf(-8), Integer.valueOf(-4)));
      bC.put(ade.e, new qu(Integer.valueOf(-8), Integer.valueOf(-4)));
      bC.put(ade.aX, new qu(Integer.valueOf(-10), Integer.valueOf(-7)));
      bC.put(adb.a(ajn.w), new qu(Integer.valueOf(-5), Integer.valueOf(-3)));
      bC.put(adb.a(ajn.X), new qu(Integer.valueOf(3), Integer.valueOf(4)));
      bC.put(ade.R, new qu(Integer.valueOf(4), Integer.valueOf(5)));
      bC.put(ade.T, new qu(Integer.valueOf(2), Integer.valueOf(4)));
      bC.put(ade.Q, new qu(Integer.valueOf(2), Integer.valueOf(4)));
      bC.put(ade.S, new qu(Integer.valueOf(2), Integer.valueOf(4)));
      bC.put(ade.av, new qu(Integer.valueOf(6), Integer.valueOf(8)));
      bC.put(ade.by, new qu(Integer.valueOf(-4), Integer.valueOf(-1)));
      bC.put(ade.ax, new qu(Integer.valueOf(-4), Integer.valueOf(-1)));
      bC.put(ade.aL, new qu(Integer.valueOf(10), Integer.valueOf(12)));
      bC.put(ade.aN, new qu(Integer.valueOf(10), Integer.valueOf(12)));
      bC.put(adb.a(ajn.aN), new qu(Integer.valueOf(-3), Integer.valueOf(-1)));
      bC.put(ade.am, new qu(Integer.valueOf(-7), Integer.valueOf(-5)));
      bC.put(ade.be, new qu(Integer.valueOf(-7), Integer.valueOf(-5)));
      bC.put(ade.bg, new qu(Integer.valueOf(-8), Integer.valueOf(-6)));
      bC.put(ade.bv, new qu(Integer.valueOf(7), Integer.valueOf(11)));
      bC.put(ade.g, new qu(Integer.valueOf(-12), Integer.valueOf(-8)));
   }
}
