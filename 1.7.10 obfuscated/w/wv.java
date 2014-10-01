
public class wv extends tg {

   private float bq;
   private float br;
   private boolean bs;
   private boolean bt;
   private float bu;
   private float bv;


   public wv(ahb var1) {
      super(var1);
      this.a(0.6F, 0.8F);
      this.m().a(true);
      this.c.a(1, new uf(this));
      this.c.a(2, this.bp);
      this.c.a(3, new um(this, 0.4F));
      this.c.a(4, new uq(this, 1.0D, true));
      this.c.a(5, new ug(this, 1.0D, 10.0F, 2.0F));
      this.c.a(6, new ua(this, 1.0D));
      this.c.a(7, new vc(this, 1.0D));
      this.c.a(8, new ty(this, 8.0F));
      this.c.a(9, new un(this, yz.class, 8.0F));
      this.c.a(9, new vb(this));
      this.d.a(1, new vs(this));
      this.d.a(2, new vt(this));
      this.d.a(3, new vn(this, true));
      this.d.a(4, new vr(this, wp.class, 200, false));
      this.j(false);
   }

   protected void aD() {
      super.aD();
      this.a(yj.d).a(0.30000001192092896D);
      if(this.bZ()) {
         this.a(yj.a).a(20.0D);
      } else {
         this.a(yj.a).a(8.0D);
      }

   }

   public boolean bk() {
      return true;
   }

   public void d(sv var1) {
      super.d(var1);
      if(var1 == null) {
         this.l(false);
      } else if(!this.bZ()) {
         this.l(true);
      }

   }

   protected void bp() {
      this.af.b(18, Float.valueOf(this.aS()));
   }

   protected void c() {
      super.c();
      this.af.a(18, new Float(this.aS()));
      this.af.a(19, new Byte((byte)0));
      this.af.a(20, new Byte((byte)aka.b(1)));
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.wolf.step", 0.15F, 1.0F);
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Angry", this.ci());
      var1.a("CollarColor", (byte)this.cj());
   }

   public void a(dh var1) {
      super.a(var1);
      this.l(var1.n("Angry"));
      if(var1.b("CollarColor", 99)) {
         this.s(var1.d("CollarColor"));
      }

   }

   protected String t() {
      return this.ci()?"mob.wolf.growl":(this.Z.nextInt(3) == 0?(this.bZ() && this.af.d(18) < 10.0F?"mob.wolf.whine":"mob.wolf.panting"):"mob.wolf.bark");
   }

   protected String aT() {
      return "mob.wolf.hurt";
   }

   protected String aU() {
      return "mob.wolf.death";
   }

   protected float bf() {
      return 0.4F;
   }

   protected adb u() {
      return adb.d(-1);
   }

   public void e() {
      super.e();
      if(!this.o.E && this.bs && !this.bt && !this.bS() && this.D) {
         this.bt = true;
         this.bu = 0.0F;
         this.bv = 0.0F;
         this.o.a(this, (byte)8);
      }

   }

   public void h() {
      super.h();
      this.br = this.bq;
      if(this.ck()) {
         this.bq += (1.0F - this.bq) * 0.4F;
      } else {
         this.bq += (0.0F - this.bq) * 0.4F;
      }

      if(this.ck()) {
         this.g = 10;
      }

      if(this.L()) {
         this.bs = true;
         this.bt = false;
         this.bu = 0.0F;
         this.bv = 0.0F;
      } else if((this.bs || this.bt) && this.bt) {
         if(this.bu == 0.0F) {
            this.a("mob.wolf.shake", this.bf(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
         }

         this.bv = this.bu;
         this.bu += 0.05F;
         if(this.bv >= 2.0F) {
            this.bs = false;
            this.bt = false;
            this.bv = 0.0F;
            this.bu = 0.0F;
         }

         if(this.bu > 0.4F) {
            float var1 = (float)this.C.b;
            int var2 = (int)(qh.a((this.bu - 0.4F) * 3.1415927F) * 7.0F);

            for(int var3 = 0; var3 < var2; ++var3) {
               float var4 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
               float var5 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
               this.o.a("splash", this.s + (double)var4, (double)(var1 + 0.8F), this.u + (double)var5, this.v, this.w, this.x);
            }
         }
      }

   }

   public float g() {
      return this.N * 0.8F;
   }

   public int x() {
      return this.ca()?20:super.x();
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         sa var3 = var1.j();
         this.bp.a(false);
         if(var3 != null && !(var3 instanceof yz) && !(var3 instanceof zc)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.a(var1, var2);
      }
   }

   public boolean n(sa var1) {
      int var2 = this.bZ()?4:2;
      return var1.a(ro.a((sv)this), (float)var2);
   }

   public void j(boolean var1) {
      super.j(var1);
      if(var1) {
         this.a(yj.a).a(20.0D);
      } else {
         this.a(yj.a).a(8.0D);
      }

   }

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(this.bZ()) {
         if(var2 != null) {
            if(var2.b() instanceof acx) {
               acx var3 = (acx)var2.b();
               if(var3.i() && this.af.d(18) < 20.0F) {
                  if(!var1.bE.d) {
                     --var2.b;
                  }

                  this.f((float)var3.g(var2));
                  if(var2.b <= 0) {
                     var1.bm.a(var1.bm.c, (add)null);
                  }

                  return true;
               }
            } else if(var2.b() == ade.aR) {
               int var4 = aka.b(var2.k());
               if(var4 != this.cj()) {
                  this.s(var4);
                  if(!var1.bE.d && --var2.b <= 0) {
                     var1.bm.a(var1.bm.c, (add)null);
                  }

                  return true;
               }
            }
         }

         if(this.e(var1) && !this.o.E && !this.c(var2)) {
            this.bp.a(!this.ca());
            this.bc = false;
            this.a((ayf)null);
            this.b((sa)null);
            this.d((sv)null);
         }
      } else if(var2 != null && var2.b() == ade.aS && !this.ci()) {
         if(!var1.bE.d) {
            --var2.b;
         }

         if(var2.b <= 0) {
            var1.bm.a(var1.bm.c, (add)null);
         }

         if(!this.o.E) {
            if(this.Z.nextInt(3) == 0) {
               this.j(true);
               this.a((ayf)null);
               this.d((sv)null);
               this.bp.a(true);
               this.g(20.0F);
               this.b(var1.aB().toString());
               this.i(true);
               this.o.a(this, (byte)7);
            } else {
               this.i(false);
               this.o.a(this, (byte)6);
            }
         }

         return true;
      }

      return super.a(var1);
   }

   public boolean c(add var1) {
      return var1 == null?false:(!(var1.b() instanceof acx)?false:((acx)var1.b()).i());
   }

   public int bB() {
      return 8;
   }

   public boolean ci() {
      return (this.af.a(16) & 2) != 0;
   }

   public void l(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(var2 | 2)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var2 & -3)));
      }

   }

   public int cj() {
      return this.af.a(20) & 15;
   }

   public void s(int var1) {
      this.af.b(20, Byte.valueOf((byte)(var1 & 15)));
   }

   public wv b(rx var1) {
      wv var2 = new wv(this.o);
      String var3 = this.b();
      if(var3 != null && var3.trim().length() > 0) {
         var2.b(var3);
         var2.j(true);
      }

      return var2;
   }

   public void m(boolean var1) {
      if(var1) {
         this.af.b(19, Byte.valueOf((byte)1));
      } else {
         this.af.b(19, Byte.valueOf((byte)0));
      }

   }

   public boolean a(wf var1) {
      if(var1 == this) {
         return false;
      } else if(!this.bZ()) {
         return false;
      } else if(!(var1 instanceof wv)) {
         return false;
      } else {
         wv var2 = (wv)var1;
         return !var2.bZ()?false:(var2.ca()?false:this.ce() && var2.ce());
      }
   }

   public boolean ck() {
      return this.af.a(19) == 1;
   }

   protected boolean v() {
      return !this.bZ() && this.aa > 2400;
   }

   public boolean a(sv var1, sv var2) {
      if(!(var1 instanceof xz) && !(var1 instanceof yd)) {
         if(var1 instanceof wv) {
            wv var3 = (wv)var1;
            if(var3.bZ() && var3.cb() == var2) {
               return false;
            }
         }

         return var1 instanceof yz && var2 instanceof yz && !((yz)var2).a((yz)var1)?false:!(var1 instanceof wi) || !((wi)var1).cc();
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.b(var1);
   }
}
