
public class wg extends wf {

   public float bp;
   public float bq;
   public float br;
   public float bs;
   public float bt = 1.0F;
   public int bu;
   public boolean bv;


   public wg(ahb var1) {
      super(var1);
      this.a(0.3F, 0.7F);
      this.bu = this.Z.nextInt(6000) + 6000;
      this.c.a(0, new uf(this));
      this.c.a(1, new uz(this, 1.4D));
      this.c.a(2, new ua(this, 1.0D));
      this.c.a(3, new vk(this, 1.0D, ade.N, false));
      this.c.a(4, new uh(this, 1.1D));
      this.c.a(5, new vc(this, 1.0D));
      this.c.a(6, new un(this, yz.class, 6.0F));
      this.c.a(7, new vb(this));
   }

   public boolean bk() {
      return true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(4.0D);
      this.a(yj.d).a(0.25D);
   }

   public void e() {
      super.e();
      this.bs = this.bp;
      this.br = this.bq;
      this.bq = (float)((double)this.bq + (double)(this.D?-1:4) * 0.3D);
      if(this.bq < 0.0F) {
         this.bq = 0.0F;
      }

      if(this.bq > 1.0F) {
         this.bq = 1.0F;
      }

      if(!this.D && this.bt < 1.0F) {
         this.bt = 1.0F;
      }

      this.bt = (float)((double)this.bt * 0.9D);
      if(!this.D && this.w < 0.0D) {
         this.w *= 0.6D;
      }

      this.bp += this.bt * 2.0F;
      if(!this.o.E && !this.f() && !this.bZ() && --this.bu <= 0) {
         this.a("mob.chicken.plop", 1.0F, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
         this.a(ade.aK, 1);
         this.bu = this.Z.nextInt(6000) + 6000;
      }

   }

   protected void b(float var1) {}

   protected String t() {
      return "mob.chicken.say";
   }

   protected String aT() {
      return "mob.chicken.hurt";
   }

   protected String aU() {
      return "mob.chicken.hurt";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.chicken.step", 0.15F, 1.0F);
   }

   protected adb u() {
      return ade.G;
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(3) + this.Z.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.a(ade.G, 1);
      }

      if(this.al()) {
         this.a(ade.bg, 1);
      } else {
         this.a(ade.bf, 1);
      }

   }

   public wg b(rx var1) {
      return new wg(this.o);
   }

   public boolean c(add var1) {
      return var1 != null && var1.b() instanceof adw;
   }

   public void a(dh var1) {
      super.a(var1);
      this.bv = var1.n("IsChickenJockey");
   }

   protected int e(yz var1) {
      return this.bZ()?10:super.e(var1);
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("IsChickenJockey", this.bv);
   }

   protected boolean v() {
      return this.bZ() && this.l == null;
   }

   public void ac() {
      super.ac();
      float var1 = qh.a(this.aM * 3.1415927F / 180.0F);
      float var2 = qh.b(this.aM * 3.1415927F / 180.0F);
      float var3 = 0.1F;
      float var4 = 0.0F;
      this.l.b(this.s + (double)(var3 * var1), this.t + (double)(this.N * 0.5F) + this.l.ad() + (double)var4, this.u - (double)(var3 * var2));
      if(this.l instanceof sv) {
         ((sv)this.l).aM = this.aM;
      }

   }

   public boolean bZ() {
      return this.bv;
   }

   public void i(boolean var1) {
      this.bv = var1;
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.b(var1);
   }
}
