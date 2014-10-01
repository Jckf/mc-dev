
public class yd extends sr implements yb {

   public int h;
   public double i;
   public double bm;
   public double bn;
   private sa bq;
   private int br;
   public int bo;
   public int bp;
   private int bs = 1;


   public yd(ahb var1) {
      super(var1);
      this.a(4.0F, 4.0F);
      this.ae = true;
      this.b = 5;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if("fireball".equals(var1.p()) && var1.j() instanceof yz) {
         super.a(var1, 1000.0F);
         ((yz)var1.j()).a((ph)pc.z);
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   protected void c() {
      super.c();
      this.af.a(16, Byte.valueOf((byte)0));
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(10.0D);
   }

   protected void bq() {
      if(!this.o.E && this.o.r == rd.a) {
         this.B();
      }

      this.w();
      this.bo = this.bp;
      double var1 = this.i - this.s;
      double var3 = this.bm - this.t;
      double var5 = this.bn - this.u;
      double var7 = var1 * var1 + var3 * var3 + var5 * var5;
      if(var7 < 1.0D || var7 > 3600.0D) {
         this.i = this.s + (double)((this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.bm = this.t + (double)((this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.bn = this.u + (double)((this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
      }

      if(this.h-- <= 0) {
         this.h += this.Z.nextInt(5) + 2;
         var7 = (double)qh.a(var7);
         if(this.a(this.i, this.bm, this.bn, var7)) {
            this.v += var1 / var7 * 0.1D;
            this.w += var3 / var7 * 0.1D;
            this.x += var5 / var7 * 0.1D;
         } else {
            this.i = this.s;
            this.bm = this.t;
            this.bn = this.u;
         }
      }

      if(this.bq != null && this.bq.K) {
         this.bq = null;
      }

      if(this.bq == null || this.br-- <= 0) {
         this.bq = this.o.b(this, 100.0D);
         if(this.bq != null) {
            this.br = 20;
         }
      }

      double var9 = 64.0D;
      if(this.bq != null && this.bq.f((sa)this) < var9 * var9) {
         double var11 = this.bq.s - this.s;
         double var13 = this.bq.C.b + (double)(this.bq.N / 2.0F) - (this.t + (double)(this.N / 2.0F));
         double var15 = this.bq.u - this.u;
         this.aM = this.y = -((float)Math.atan2(var11, var15)) * 180.0F / 3.1415927F;
         if(this.p(this.bq)) {
            if(this.bp == 10) {
               this.o.a((yz)null, 1007, (int)this.s, (int)this.t, (int)this.u, 0);
            }

            ++this.bp;
            if(this.bp == 20) {
               this.o.a((yz)null, 1008, (int)this.s, (int)this.t, (int)this.u, 0);
               zg var17 = new zg(this.o, this, var11, var13, var15);
               var17.e = this.bs;
               double var18 = 4.0D;
               azw var20 = this.j(1.0F);
               var17.s = this.s + var20.a * var18;
               var17.t = this.t + (double)(this.N / 2.0F) + 0.5D;
               var17.u = this.u + var20.c * var18;
               this.o.d((sa)var17);
               this.bp = -40;
            }
         } else if(this.bp > 0) {
            --this.bp;
         }
      } else {
         this.aM = this.y = -((float)Math.atan2(this.v, this.x)) * 180.0F / 3.1415927F;
         if(this.bp > 0) {
            --this.bp;
         }
      }

      if(!this.o.E) {
         byte var21 = this.af.a(16);
         byte var12 = (byte)(this.bp > 10?1:0);
         if(var21 != var12) {
            this.af.b(16, Byte.valueOf(var12));
         }
      }

   }

   private boolean a(double var1, double var3, double var5, double var7) {
      double var9 = (this.i - this.s) / var7;
      double var11 = (this.bm - this.t) / var7;
      double var13 = (this.bn - this.u) / var7;
      azt var15 = this.C.b();

      for(int var16 = 1; (double)var16 < var7; ++var16) {
         var15.d(var9, var11, var13);
         if(!this.o.a((sa)this, var15).isEmpty()) {
            return false;
         }
      }

      return true;
   }

   protected String t() {
      return "mob.ghast.moan";
   }

   protected String aT() {
      return "mob.ghast.scream";
   }

   protected String aU() {
      return "mob.ghast.death";
   }

   protected adb u() {
      return ade.H;
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(2) + this.Z.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.a(ade.bk, 1);
      }

      var3 = this.Z.nextInt(3) + this.Z.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.a(ade.H, 1);
      }

   }

   protected float bf() {
      return 10.0F;
   }

   public boolean by() {
      return this.Z.nextInt(20) == 0 && super.by() && this.o.r != rd.a;
   }

   public int bB() {
      return 1;
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("ExplosionPower", this.bs);
   }

   public void a(dh var1) {
      super.a(var1);
      if(var1.b("ExplosionPower", 99)) {
         this.bs = var1.f("ExplosionPower");
      }

   }
}
