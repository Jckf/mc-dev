
public class ym extends sw implements yb {

   public float h;
   public float i;
   public float bm;
   private int bn;


   public ym(ahb var1) {
      super(var1);
      int var2 = 1 << this.Z.nextInt(3);
      this.L = 0.0F;
      this.bn = this.Z.nextInt(20) + 10;
      this.a(var2);
   }

   protected void c() {
      super.c();
      this.af.a(16, new Byte((byte)1));
   }

   protected void a(int var1) {
      this.af.b(16, new Byte((byte)var1));
      this.a(0.6F * (float)var1, 0.6F * (float)var1);
      this.b(this.s, this.t, this.u);
      this.a(yj.a).a((double)(var1 * var1));
      this.g(this.aY());
      this.b = var1;
   }

   public int bX() {
      return this.af.a(16);
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Size", this.bX() - 1);
   }

   public void a(dh var1) {
      super.a(var1);
      int var2 = var1.f("Size");
      if(var2 < 0) {
         var2 = 0;
      }

      this.a(var2 + 1);
   }

   protected String bP() {
      return "slime";
   }

   protected String bV() {
      return "mob.slime." + (this.bX() > 1?"big":"small");
   }

   public void h() {
      if(!this.o.E && this.o.r == rd.a && this.bX() > 0) {
         this.K = true;
      }

      this.i += (this.h - this.i) * 0.5F;
      this.bm = this.i;
      boolean var1 = this.D;
      super.h();
      int var2;
      if(this.D && !var1) {
         var2 = this.bX();

         for(int var3 = 0; var3 < var2 * 8; ++var3) {
            float var4 = this.Z.nextFloat() * 3.1415927F * 2.0F;
            float var5 = this.Z.nextFloat() * 0.5F + 0.5F;
            float var6 = qh.a(var4) * (float)var2 * 0.5F * var5;
            float var7 = qh.b(var4) * (float)var2 * 0.5F * var5;
            this.o.a(this.bP(), this.s + (double)var6, this.C.b, this.u + (double)var7, 0.0D, 0.0D, 0.0D);
         }

         if(this.bW()) {
            this.a(this.bV(), this.bf(), ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.h = -0.5F;
      } else if(!this.D && var1) {
         this.h = 1.0F;
      }

      this.bS();
      if(this.o.E) {
         var2 = this.bX();
         this.a(0.6F * (float)var2, 0.6F * (float)var2);
      }

   }

   protected void bq() {
      this.w();
      yz var1 = this.o.b(this, 16.0D);
      if(var1 != null) {
         this.a(var1, 10.0F, 20.0F);
      }

      if(this.D && this.bn-- <= 0) {
         this.bn = this.bR();
         if(var1 != null) {
            this.bn /= 3;
         }

         this.bc = true;
         if(this.bY()) {
            this.a(this.bV(), this.bf(), ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.bd = 1.0F - this.Z.nextFloat() * 2.0F;
         this.be = (float)(1 * this.bX());
      } else {
         this.bc = false;
         if(this.D) {
            this.bd = this.be = 0.0F;
         }
      }

   }

   protected void bS() {
      this.h *= 0.6F;
   }

   protected int bR() {
      return this.Z.nextInt(20) + 10;
   }

   protected ym bQ() {
      return new ym(this.o);
   }

   public void B() {
      int var1 = this.bX();
      if(!this.o.E && var1 > 1 && this.aS() <= 0.0F) {
         int var2 = 2 + this.Z.nextInt(3);

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = ((float)(var3 % 2) - 0.5F) * (float)var1 / 4.0F;
            float var5 = ((float)(var3 / 2) - 0.5F) * (float)var1 / 4.0F;
            ym var6 = this.bQ();
            var6.a(var1 / 2);
            var6.b(this.s + (double)var4, this.t + 0.5D, this.u + (double)var5, this.Z.nextFloat() * 360.0F, 0.0F);
            this.o.d((sa)var6);
         }
      }

      super.B();
   }

   public void b_(yz var1) {
      if(this.bT()) {
         int var2 = this.bX();
         if(this.p(var1) && this.f(var1) < 0.6D * (double)var2 * 0.6D * (double)var2 && var1.a(ro.a((sv)this), (float)this.bU())) {
            this.a("mob.attack", 1.0F, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
         }
      }

   }

   protected boolean bT() {
      return this.bX() > 1;
   }

   protected int bU() {
      return this.bX();
   }

   protected String aT() {
      return "mob.slime." + (this.bX() > 1?"big":"small");
   }

   protected String aU() {
      return "mob.slime." + (this.bX() > 1?"big":"small");
   }

   protected adb u() {
      return this.bX() == 1?ade.aH:adb.d(0);
   }

   public boolean by() {
      apx var1 = this.o.d(qh.c(this.s), qh.c(this.u));
      if(this.o.N().u() == ahm.c && this.Z.nextInt(4) != 1) {
         return false;
      } else {
         if(this.bX() == 1 || this.o.r != rd.a) {
            ahu var2 = this.o.a(qh.c(this.s), qh.c(this.u));
            if(var2 == ahu.u && this.t > 50.0D && this.t < 70.0D && this.Z.nextFloat() < 0.5F && this.Z.nextFloat() < this.o.y() && this.o.k(qh.c(this.s), qh.c(this.t), qh.c(this.u)) <= this.Z.nextInt(8)) {
               return super.by();
            }

            if(this.Z.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.t < 40.0D) {
               return super.by();
            }
         }

         return false;
      }
   }

   protected float bf() {
      return 0.4F * (float)this.bX();
   }

   public int x() {
      return 0;
   }

   protected boolean bY() {
      return this.bX() > 0;
   }

   protected boolean bW() {
      return this.bX() > 2;
   }
}
