
public class wt extends wl {

   private int bq;
   vz bp;
   private int br;
   private int bs;


   public wt(ahb var1) {
      super(var1);
      this.a(1.4F, 2.9F);
      this.m().a(true);
      this.c.a(1, new uq(this, 1.0D, true));
      this.c.a(2, new uu(this, 0.9D, 32.0F));
      this.c.a(3, new us(this, 0.6D, true));
      this.c.a(4, new ut(this, 1.0D));
      this.c.a(5, new ux(this));
      this.c.a(6, new vc(this, 0.6D));
      this.c.a(7, new un(this, yz.class, 6.0F));
      this.c.a(8, new vb(this));
      this.d.a(1, new vm(this));
      this.d.a(2, new vn(this, false));
      this.d.a(3, new vo(this, sw.class, 0, false, true, yb.a));
   }

   protected void c() {
      super.c();
      this.af.a(16, Byte.valueOf((byte)0));
   }

   public boolean bk() {
      return true;
   }

   protected void bp() {
      if(--this.bq <= 0) {
         this.bq = 70 + this.Z.nextInt(50);
         this.bp = this.o.A.a(qh.c(this.s), qh.c(this.t), qh.c(this.u), 32);
         if(this.bp == null) {
            this.bX();
         } else {
            r var1 = this.bp.a();
            this.a(var1.a, var1.b, var1.c, (int)((float)this.bp.b() * 0.6F));
         }
      }

      super.bp();
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(100.0D);
      this.a(yj.d).a(0.25D);
   }

   protected int j(int var1) {
      return var1;
   }

   protected void o(sa var1) {
      if(var1 instanceof yb && this.aI().nextInt(20) == 0) {
         this.d((sv)var1);
      }

      super.o(var1);
   }

   public void e() {
      super.e();
      if(this.br > 0) {
         --this.br;
      }

      if(this.bs > 0) {
         --this.bs;
      }

      if(this.v * this.v + this.x * this.x > 2.500000277905201E-7D && this.Z.nextInt(5) == 0) {
         int var1 = qh.c(this.s);
         int var2 = qh.c(this.t - 0.20000000298023224D - (double)this.L);
         int var3 = qh.c(this.u);
         aji var4 = this.o.a(var1, var2, var3);
         if(var4.o() != awt.a) {
            this.o.a("blockcrack_" + aji.b(var4) + "_" + this.o.e(var1, var2, var3), this.s + ((double)this.Z.nextFloat() - 0.5D) * (double)this.M, this.C.b + 0.1D, this.u + ((double)this.Z.nextFloat() - 0.5D) * (double)this.M, 4.0D * ((double)this.Z.nextFloat() - 0.5D), 0.5D, ((double)this.Z.nextFloat() - 0.5D) * 4.0D);
         }
      }

   }

   public boolean a(Class var1) {
      return this.cc() && yz.class.isAssignableFrom(var1)?false:super.a(var1);
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("PlayerCreated", this.cc());
   }

   public void a(dh var1) {
      super.a(var1);
      this.i(var1.n("PlayerCreated"));
   }

   public boolean n(sa var1) {
      this.br = 10;
      this.o.a(this, (byte)4);
      boolean var2 = var1.a(ro.a((sv)this), (float)(7 + this.Z.nextInt(15)));
      if(var2) {
         var1.w += 0.4000000059604645D;
      }

      this.a("mob.irongolem.throw", 1.0F, 1.0F);
      return var2;
   }

   public vz bZ() {
      return this.bp;
   }

   public void a(boolean var1) {
      this.bs = var1?400:0;
      this.o.a(this, (byte)11);
   }

   protected String aT() {
      return "mob.irongolem.hit";
   }

   protected String aU() {
      return "mob.irongolem.death";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.irongolem.walk", 1.0F, 1.0F);
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(3);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.a(adb.a((aji)ajn.O), 1, 0.0F);
      }

      var4 = 3 + this.Z.nextInt(3);

      for(int var5 = 0; var5 < var4; ++var5) {
         this.a(ade.j, 1);
      }

   }

   public int cb() {
      return this.bs;
   }

   public boolean cc() {
      return (this.af.a(16) & 1) != 0;
   }

   public void i(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public void a(ro var1) {
      if(!this.cc() && this.aR != null && this.bp != null) {
         this.bp.a(this.aR.b_(), -5);
      }

      super.a(var1);
   }
}
