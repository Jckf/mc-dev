import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class yq extends yg {

   protected static final th bp = (new to("zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D)).a("Spawn Reinforcements Chance");
   private static final UUID bq = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final tj br = new tj(bq, "Baby speed boost", 0.5D, 1);
   private final tz bs = new tz(this);
   private int bt;
   private boolean bu = false;
   private float bv = -1.0F;
   private float bw;


   public yq(ahb var1) {
      super(var1);
      this.m().b(true);
      this.c.a(0, new uf(this));
      this.c.a(2, new uq(this, yz.class, 1.0D, false));
      this.c.a(4, new uq(this, yv.class, 1.0D, true));
      this.c.a(5, new ut(this, 1.0D));
      this.c.a(6, new us(this, 1.0D, false));
      this.c.a(7, new vc(this, 1.0D));
      this.c.a(8, new un(this, yz.class, 8.0F));
      this.c.a(8, new vb(this));
      this.d.a(1, new vn(this, true));
      this.d.a(2, new vo(this, yz.class, 0, true));
      this.d.a(2, new vo(this, yv.class, 0, false));
      this.a(0.6F, 1.8F);
   }

   protected void aD() {
      super.aD();
      this.a(yj.b).a(40.0D);
      this.a(yj.d).a(0.23000000417232513D);
      this.a(yj.e).a(3.0D);
      this.bc().b(bp).a(this.Z.nextDouble() * 0.10000000149011612D);
   }

   protected void c() {
      super.c();
      this.z().a(12, Byte.valueOf((byte)0));
      this.z().a(13, Byte.valueOf((byte)0));
      this.z().a(14, Byte.valueOf((byte)0));
   }

   public int aV() {
      int var1 = super.aV() + 2;
      if(var1 > 20) {
         var1 = 20;
      }

      return var1;
   }

   protected boolean bk() {
      return true;
   }

   public boolean bZ() {
      return this.bu;
   }

   public void a(boolean var1) {
      if(this.bu != var1) {
         this.bu = var1;
         if(var1) {
            this.c.a(1, this.bs);
         } else {
            this.c.a((ui)this.bs);
         }
      }

   }

   public boolean f() {
      return this.z().a(12) == 1;
   }

   protected int e(yz var1) {
      if(this.f()) {
         this.b = (int)((float)this.b * 2.5F);
      }

      return super.e(var1);
   }

   public void i(boolean var1) {
      this.z().b(12, Byte.valueOf((byte)(var1?1:0)));
      if(this.o != null && !this.o.E) {
         ti var2 = this.a(yj.d);
         var2.b(br);
         if(var1) {
            var2.a(br);
         }
      }

      this.k(var1);
   }

   public boolean cb() {
      return this.z().a(13) == 1;
   }

   public void j(boolean var1) {
      this.z().b(13, Byte.valueOf((byte)(var1?1:0)));
   }

   public void e() {
      if(this.o.w() && !this.o.E && !this.f()) {
         float var1 = this.d(1.0F);
         if(var1 > 0.5F && this.Z.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && this.o.i(qh.c(this.s), qh.c(this.t), qh.c(this.u))) {
            boolean var2 = true;
            add var3 = this.q(4);
            if(var3 != null) {
               if(var3.g()) {
                  var3.b(var3.j() + this.Z.nextInt(2));
                  if(var3.j() >= var3.l()) {
                     this.a(var3);
                     this.c(4, (add)null);
                  }
               }

               var2 = false;
            }

            if(var2) {
               this.e(8);
            }
         }
      }

      if(this.am() && this.o() != null && this.m instanceof wg) {
         ((sw)this.m).m().a(this.m().e(), 1.5D);
      }

      super.e();
   }

   public boolean a(ro var1, float var2) {
      if(!super.a(var1, var2)) {
         return false;
      } else {
         sv var3 = this.o();
         if(var3 == null && this.bT() instanceof sv) {
            var3 = (sv)this.bT();
         }

         if(var3 == null && var1.j() instanceof sv) {
            var3 = (sv)var1.j();
         }

         if(var3 != null && this.o.r == rd.d && (double)this.Z.nextFloat() < this.a(bp).e()) {
            int var4 = qh.c(this.s);
            int var5 = qh.c(this.t);
            int var6 = qh.c(this.u);
            yq var7 = new yq(this.o);

            for(int var8 = 0; var8 < 50; ++var8) {
               int var9 = var4 + qh.a(this.Z, 7, 40) * qh.a(this.Z, -1, 1);
               int var10 = var5 + qh.a(this.Z, 7, 40) * qh.a(this.Z, -1, 1);
               int var11 = var6 + qh.a(this.Z, 7, 40) * qh.a(this.Z, -1, 1);
               if(ahb.a((ahl)this.o, var9, var10 - 1, var11) && this.o.k(var9, var10, var11) < 10) {
                  var7.b((double)var9, (double)var10, (double)var11);
                  if(this.o.b(var7.C) && this.o.a((sa)var7, var7.C).isEmpty() && !this.o.d(var7.C)) {
                     this.o.d((sa)var7);
                     var7.d(var3);
                     var7.a((sy)null);
                     this.a(bp).a(new tj("Zombie reinforcement caller charge", -0.05000000074505806D, 0));
                     var7.a(bp).a(new tj("Zombie reinforcement callee charge", -0.05000000074505806D, 0));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   public void h() {
      if(!this.o.E && this.cc()) {
         int var1 = this.ce();
         this.bt -= var1;
         if(this.bt <= 0) {
            this.cd();
         }
      }

      super.h();
   }

   public boolean n(sa var1) {
      boolean var2 = super.n(var1);
      if(var2) {
         int var3 = this.o.r.a();
         if(this.be() == null && this.al() && this.Z.nextFloat() < (float)var3 * 0.3F) {
            var1.e(2 * var3);
         }
      }

      return var2;
   }

   protected String t() {
      return "mob.zombie.say";
   }

   protected String aT() {
      return "mob.zombie.hurt";
   }

   protected String aU() {
      return "mob.zombie.death";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.zombie.step", 0.15F, 1.0F);
   }

   protected adb u() {
      return ade.bh;
   }

   public sz bd() {
      return sz.b;
   }

   protected void n(int var1) {
      switch(this.Z.nextInt(3)) {
      case 0:
         this.a(ade.j, 1);
         break;
      case 1:
         this.a(ade.bF, 1);
         break;
      case 2:
         this.a(ade.bG, 1);
      }

   }

   protected void bC() {
      super.bC();
      if(this.Z.nextFloat() < (this.o.r == rd.d?0.05F:0.01F)) {
         int var1 = this.Z.nextInt(3);
         if(var1 == 0) {
            this.c(0, new add(ade.l));
         } else {
            this.c(0, new add(ade.a));
         }
      }

   }

   public void b(dh var1) {
      super.b(var1);
      if(this.f()) {
         var1.a("IsBaby", true);
      }

      if(this.cb()) {
         var1.a("IsVillager", true);
      }

      var1.a("ConversionTime", this.cc()?this.bt:-1);
      var1.a("CanBreakDoors", this.bZ());
   }

   public void a(dh var1) {
      super.a(var1);
      if(var1.n("IsBaby")) {
         this.i(true);
      }

      if(var1.n("IsVillager")) {
         this.j(true);
      }

      if(var1.b("ConversionTime", 99) && var1.f("ConversionTime") > -1) {
         this.a(var1.f("ConversionTime"));
      }

      this.a(var1.n("CanBreakDoors"));
   }

   public void a(sv var1) {
      super.a(var1);
      if((this.o.r == rd.c || this.o.r == rd.d) && var1 instanceof yv) {
         if(this.o.r != rd.d && this.Z.nextBoolean()) {
            return;
         }

         yq var2 = new yq(this.o);
         var2.k(var1);
         this.o.e((sa)var1);
         var2.a((sy)null);
         var2.j(true);
         if(var1.f()) {
            var2.i(true);
         }

         this.o.d((sa)var2);
         this.o.a((yz)null, 1016, (int)this.s, (int)this.t, (int)this.u, 0);
      }

   }

   public sy a(sy var1) {
      Object var6 = super.a(var1);
      float var2 = this.o.b(this.s, this.t, this.u);
      this.h(this.Z.nextFloat() < 0.55F * var2);
      if(var6 == null) {
         var6 = new ys(this, this.o.s.nextFloat() < 0.05F, this.o.s.nextFloat() < 0.05F, (yr)null);
      }

      if(var6 instanceof ys) {
         ys var3 = (ys)var6;
         if(var3.b) {
            this.j(true);
         }

         if(var3.a) {
            this.i(true);
            if((double)this.o.s.nextFloat() < 0.05D) {
               List var4 = this.o.a(wg.class, this.C.b(5.0D, 3.0D, 5.0D), sj.b);
               if(!var4.isEmpty()) {
                  wg var5 = (wg)var4.get(0);
                  var5.i(true);
                  this.a((sa)var5);
               }
            } else if((double)this.o.s.nextFloat() < 0.05D) {
               wg var9 = new wg(this.o);
               var9.b(this.s, this.t, this.u, this.y, 0.0F);
               var9.a((sy)null);
               var9.i(true);
               this.o.d((sa)var9);
               this.a((sa)var9);
            }
         }
      }

      this.a(this.Z.nextFloat() < var2 * 0.1F);
      this.bC();
      this.bD();
      if(this.q(4) == null) {
         Calendar var7 = this.o.V();
         if(var7.get(2) + 1 == 10 && var7.get(5) == 31 && this.Z.nextFloat() < 0.25F) {
            this.c(4, new add(this.Z.nextFloat() < 0.1F?ajn.aP:ajn.aK));
            this.e[4] = 0.0F;
         }
      }

      this.a(yj.c).a(new tj("Random spawn bonus", this.Z.nextDouble() * 0.05000000074505806D, 0));
      double var8 = this.Z.nextDouble() * 1.5D * (double)this.o.b(this.s, this.t, this.u);
      if(var8 > 1.0D) {
         this.a(yj.b).a(new tj("Random zombie-spawn bonus", var8, 2));
      }

      if(this.Z.nextFloat() < var2 * 0.05F) {
         this.a(bp).a(new tj("Leader zombie bonus", this.Z.nextDouble() * 0.25D + 0.5D, 0));
         this.a(yj.a).a(new tj("Leader zombie bonus", this.Z.nextDouble() * 3.0D + 1.0D, 2));
         this.a(true);
      }

      return (sy)var6;
   }

   public boolean a(yz var1) {
      add var2 = var1.bF();
      if(var2 != null && var2.b() == ade.ao && var2.k() == 0 && this.cb() && this.a(rv.t)) {
         if(!var1.bE.d) {
            --var2.b;
         }

         if(var2.b <= 0) {
            var1.bm.a(var1.bm.c, (add)null);
         }

         if(!this.o.E) {
            this.a(this.Z.nextInt(2401) + 3600);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(int var1) {
      this.bt = var1;
      this.z().b(14, Byte.valueOf((byte)1));
      this.m(rv.t.H);
      this.c(new rw(rv.g.H, var1, Math.min(this.o.r.a() - 1, 0)));
      this.o.a(this, (byte)16);
   }

   protected boolean v() {
      return !this.cc();
   }

   public boolean cc() {
      return this.z().a(14) == 1;
   }

   protected void cd() {
      yv var1 = new yv(this.o);
      var1.k(this);
      var1.a((sy)null);
      var1.cd();
      if(this.f()) {
         var1.c(-24000);
      }

      this.o.e((sa)this);
      this.o.d((sa)var1);
      var1.c(new rw(rv.k.H, 200, 0));
      this.o.a((yz)null, 1017, (int)this.s, (int)this.t, (int)this.u, 0);
   }

   protected int ce() {
      int var1 = 1;
      if(this.Z.nextFloat() < 0.01F) {
         int var2 = 0;

         for(int var3 = (int)this.s - 4; var3 < (int)this.s + 4 && var2 < 14; ++var3) {
            for(int var4 = (int)this.t - 4; var4 < (int)this.t + 4 && var2 < 14; ++var4) {
               for(int var5 = (int)this.u - 4; var5 < (int)this.u + 4 && var2 < 14; ++var5) {
                  aji var6 = this.o.a(var3, var4, var5);
                  if(var6 == ajn.aY || var6 == ajn.C) {
                     if(this.Z.nextFloat() < 0.3F) {
                        ++var1;
                     }

                     ++var2;
                  }
               }
            }
         }
      }

      return var1;
   }

   public void k(boolean var1) {
      this.a(var1?0.5F:1.0F);
   }

   protected final void a(float var1, float var2) {
      boolean var3 = this.bv > 0.0F && this.bw > 0.0F;
      this.bv = var1;
      this.bw = var2;
      if(!var3) {
         this.a(1.0F);
      }

   }

   protected final void a(float var1) {
      super.a(this.bv * var1, this.bw * var1);
   }

}
