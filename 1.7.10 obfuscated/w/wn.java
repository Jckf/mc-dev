
public class wn extends tg {

   private vk bq;


   public wn(ahb var1) {
      super(var1);
      this.a(0.6F, 0.8F);
      this.m().a(true);
      this.c.a(1, new uf(this));
      this.c.a(2, this.bp);
      this.c.a(3, this.bq = new vk(this, 0.6D, ade.aP, true));
      this.c.a(4, new tw(this, yz.class, 16.0F, 0.8D, 1.33D));
      this.c.a(5, new ug(this, 1.0D, 10.0F, 5.0F));
      this.c.a(6, new uw(this, 1.33D));
      this.c.a(7, new um(this, 0.3F));
      this.c.a(8, new uv(this));
      this.c.a(9, new ua(this, 0.8D));
      this.c.a(10, new vc(this, 0.8D));
      this.c.a(11, new un(this, yz.class, 10.0F));
      this.d.a(1, new vr(this, wg.class, 750, false));
   }

   protected void c() {
      super.c();
      this.af.a(18, Byte.valueOf((byte)0));
   }

   public void bp() {
      if(this.k().a()) {
         double var1 = this.k().b();
         if(var1 == 0.6D) {
            this.b(true);
            this.c(false);
         } else if(var1 == 1.33D) {
            this.b(false);
            this.c(true);
         } else {
            this.b(false);
            this.c(false);
         }
      } else {
         this.b(false);
         this.c(false);
      }

   }

   protected boolean v() {
      return !this.bZ() && this.aa > 2400;
   }

   public boolean bk() {
      return true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(10.0D);
      this.a(yj.d).a(0.30000001192092896D);
   }

   protected void b(float var1) {}

   public void b(dh var1) {
      super.b(var1);
      var1.a("CatType", this.cg());
   }

   public void a(dh var1) {
      super.a(var1);
      this.s(var1.f("CatType"));
   }

   protected String t() {
      return this.bZ()?(this.ce()?"mob.cat.purr":(this.Z.nextInt(4) == 0?"mob.cat.purreow":"mob.cat.meow")):"";
   }

   protected String aT() {
      return "mob.cat.hitt";
   }

   protected String aU() {
      return "mob.cat.hitt";
   }

   protected float bf() {
      return 0.4F;
   }

   protected adb u() {
      return ade.aA;
   }

   public boolean n(sa var1) {
      return var1.a(ro.a((sv)this), 3.0F);
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         this.bp.a(false);
         return super.a(var1, var2);
      }
   }

   protected void b(boolean var1, int var2) {}

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(this.bZ()) {
         if(this.e(var1) && !this.o.E && !this.c(var2)) {
            this.bp.a(!this.ca());
         }
      } else if(this.bq.f() && var2 != null && var2.b() == ade.aP && var1.f(this) < 9.0D) {
         if(!var1.bE.d) {
            --var2.b;
         }

         if(var2.b <= 0) {
            var1.bm.a(var1.bm.c, (add)null);
         }

         if(!this.o.E) {
            if(this.Z.nextInt(3) == 0) {
               this.j(true);
               this.s(1 + this.o.s.nextInt(3));
               this.b(var1.aB().toString());
               this.i(true);
               this.bp.a(true);
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

   public wn b(rx var1) {
      wn var2 = new wn(this.o);
      if(this.bZ()) {
         var2.b(this.b());
         var2.j(true);
         var2.s(this.cg());
      }

      return var2;
   }

   public boolean c(add var1) {
      return var1 != null && var1.b() == ade.aP;
   }

   public boolean a(wf var1) {
      if(var1 == this) {
         return false;
      } else if(!this.bZ()) {
         return false;
      } else if(!(var1 instanceof wn)) {
         return false;
      } else {
         wn var2 = (wn)var1;
         return !var2.bZ()?false:this.ce() && var2.ce();
      }
   }

   public int cg() {
      return this.af.a(18);
   }

   public void s(int var1) {
      this.af.b(18, Byte.valueOf((byte)var1));
   }

   public boolean by() {
      if(this.o.s.nextInt(3) == 0) {
         return false;
      } else {
         if(this.o.b(this.C) && this.o.a((sa)this, this.C).isEmpty() && !this.o.d(this.C)) {
            int var1 = qh.c(this.s);
            int var2 = qh.c(this.C.b);
            int var3 = qh.c(this.u);
            if(var2 < 63) {
               return false;
            }

            aji var4 = this.o.a(var1, var2 - 1, var3);
            if(var4 == ajn.c || var4.o() == awt.j) {
               return true;
            }
         }

         return false;
      }
   }

   public String b_() {
      return this.bH()?this.bG():(this.bZ()?dd.a("entity.Cat.name"):super.b_());
   }

   public sy a(sy var1) {
      var1 = super.a(var1);
      if(this.o.s.nextInt(7) == 0) {
         for(int var2 = 0; var2 < 2; ++var2) {
            wn var3 = new wn(this.o);
            var3.b(this.s, this.t, this.u, this.y, 0.0F);
            var3.c(-24000);
            this.o.d((sa)var3);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.b(var1);
   }
}
