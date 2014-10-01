import java.util.Calendar;

public class yl extends yg implements yi {

   private vd bp = new vd(this, 1.0D, 20, 60, 15.0F);
   private uq bq = new uq(this, yz.class, 1.2D, false);


   public yl(ahb var1) {
      super(var1);
      this.c.a(1, new uf(this));
      this.c.a(2, new vf(this));
      this.c.a(3, new ue(this, 1.0D));
      this.c.a(5, new vc(this, 1.0D));
      this.c.a(6, new un(this, yz.class, 8.0F));
      this.c.a(6, new vb(this));
      this.d.a(1, new vn(this, false));
      this.d.a(2, new vo(this, yz.class, 0, true));
      if(var1 != null && !var1.E) {
         this.bZ();
      }

   }

   protected void aD() {
      super.aD();
      this.a(yj.d).a(0.25D);
   }

   protected void c() {
      super.c();
      this.af.a(13, new Byte((byte)0));
   }

   public boolean bk() {
      return true;
   }

   protected String t() {
      return "mob.skeleton.say";
   }

   protected String aT() {
      return "mob.skeleton.hurt";
   }

   protected String aU() {
      return "mob.skeleton.death";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.skeleton.step", 0.15F, 1.0F);
   }

   public boolean n(sa var1) {
      if(super.n(var1)) {
         if(this.cb() == 1 && var1 instanceof sv) {
            ((sv)var1).c(new rw(rv.v.H, 200));
         }

         return true;
      } else {
         return false;
      }
   }

   public sz bd() {
      return sz.b;
   }

   public void e() {
      if(this.o.w() && !this.o.E) {
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

      if(this.o.E && this.cb() == 1) {
         this.a(0.72F, 2.34F);
      }

      super.e();
   }

   public void ab() {
      super.ab();
      if(this.m instanceof td) {
         td var1 = (td)this.m;
         this.aM = var1.aM;
      }

   }

   public void a(ro var1) {
      super.a(var1);
      if(var1.i() instanceof zc && var1.j() instanceof yz) {
         yz var2 = (yz)var1.j();
         double var3 = var2.s - this.s;
         double var5 = var2.u - this.u;
         if(var3 * var3 + var5 * var5 >= 2500.0D) {
            var2.a((ph)pc.v);
         }
      }

   }

   protected adb u() {
      return ade.g;
   }

   protected void b(boolean var1, int var2) {
      int var3;
      int var4;
      if(this.cb() == 1) {
         var3 = this.Z.nextInt(3 + var2) - 1;

         for(var4 = 0; var4 < var3; ++var4) {
            this.a(ade.h, 1);
         }
      } else {
         var3 = this.Z.nextInt(3 + var2);

         for(var4 = 0; var4 < var3; ++var4) {
            this.a(ade.g, 1);
         }
      }

      var3 = this.Z.nextInt(3 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.a(ade.aS, 1);
      }

   }

   protected void n(int var1) {
      if(this.cb() == 1) {
         this.a(new add(ade.bL, 1, 1), 0.0F);
      }

   }

   protected void bC() {
      super.bC();
      this.c(0, new add(ade.f));
   }

   public sy a(sy var1) {
      var1 = super.a(var1);
      if(this.o.t instanceof aqp && this.aI().nextInt(5) > 0) {
         this.c.a(4, this.bq);
         this.a(1);
         this.c(0, new add(ade.q));
         this.a(yj.e).a(4.0D);
      } else {
         this.c.a(4, this.bp);
         this.bC();
         this.bD();
      }

      this.h(this.Z.nextFloat() < 0.55F * this.o.b(this.s, this.t, this.u));
      if(this.q(4) == null) {
         Calendar var2 = this.o.V();
         if(var2.get(2) + 1 == 10 && var2.get(5) == 31 && this.Z.nextFloat() < 0.25F) {
            this.c(4, new add(this.Z.nextFloat() < 0.1F?ajn.aP:ajn.aK));
            this.e[4] = 0.0F;
         }
      }

      return var1;
   }

   public void bZ() {
      this.c.a((ui)this.bq);
      this.c.a((ui)this.bp);
      add var1 = this.be();
      if(var1 != null && var1.b() == ade.f) {
         this.c.a(4, this.bp);
      } else {
         this.c.a(4, this.bq);
      }

   }

   public void a(sv var1, float var2) {
      zc var3 = new zc(this.o, this, var1, 1.6F, (float)(14 - this.o.r.a() * 4));
      int var4 = afv.a(aft.v.B, this.be());
      int var5 = afv.a(aft.w.B, this.be());
      var3.b((double)(var2 * 2.0F) + this.Z.nextGaussian() * 0.25D + (double)((float)this.o.r.a() * 0.11F));
      if(var4 > 0) {
         var3.b(var3.e() + (double)var4 * 0.5D + 0.5D);
      }

      if(var5 > 0) {
         var3.a(var5);
      }

      if(afv.a(aft.x.B, this.be()) > 0 || this.cb() == 1) {
         var3.e(100);
      }

      this.a("random.bow", 1.0F, 1.0F / (this.aI().nextFloat() * 0.4F + 0.8F));
      this.o.d((sa)var3);
   }

   public int cb() {
      return this.af.a(13);
   }

   public void a(int var1) {
      this.af.b(13, Byte.valueOf((byte)var1));
      this.ae = var1 == 1;
      if(var1 == 1) {
         this.a(0.72F, 2.34F);
      } else {
         this.a(0.6F, 1.8F);
      }

   }

   public void a(dh var1) {
      super.a(var1);
      if(var1.b("SkeletonType", 99)) {
         byte var2 = var1.d("SkeletonType");
         this.a(var2);
      }

      this.bZ();
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("SkeletonType", (byte)this.cb());
   }

   public void c(int var1, add var2) {
      super.c(var1, var2);
      if(!this.o.E && var1 == 0) {
         this.bZ();
      }

   }

   public double ad() {
      return super.ad() - 0.5D;
   }
}
