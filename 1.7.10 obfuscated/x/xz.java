
public class xz extends yg {

   private int bp;
   private int bq;
   private int br = 30;
   private int bs = 3;


   public xz(ahb var1) {
      super(var1);
      this.c.a(1, new uf(this));
      this.c.a(2, new vi(this));
      this.c.a(3, new tw(this, wn.class, 6.0F, 1.0D, 1.2D));
      this.c.a(4, new uq(this, 1.0D, false));
      this.c.a(5, new vc(this, 0.8D));
      this.c.a(6, new un(this, yz.class, 8.0F));
      this.c.a(6, new vb(this));
      this.d.a(1, new vo(this, yz.class, 0, true));
      this.d.a(2, new vn(this, false));
   }

   protected void aD() {
      super.aD();
      this.a(yj.d).a(0.25D);
   }

   public boolean bk() {
      return true;
   }

   public int ax() {
      return this.o() == null?3:3 + (int)(this.aS() - 1.0F);
   }

   protected void b(float var1) {
      super.b(var1);
      this.bq = (int)((float)this.bq + var1 * 1.5F);
      if(this.bq > this.br - 5) {
         this.bq = this.br - 5;
      }

   }

   protected void c() {
      super.c();
      this.af.a(16, Byte.valueOf((byte)-1));
      this.af.a(17, Byte.valueOf((byte)0));
      this.af.a(18, Byte.valueOf((byte)0));
   }

   public void b(dh var1) {
      super.b(var1);
      if(this.af.a(17) == 1) {
         var1.a("powered", true);
      }

      var1.a("Fuse", (short)this.br);
      var1.a("ExplosionRadius", (byte)this.bs);
      var1.a("ignited", this.cc());
   }

   public void a(dh var1) {
      super.a(var1);
      this.af.b(17, Byte.valueOf((byte)(var1.n("powered")?1:0)));
      if(var1.b("Fuse", 99)) {
         this.br = var1.e("Fuse");
      }

      if(var1.b("ExplosionRadius", 99)) {
         this.bs = var1.d("ExplosionRadius");
      }

      if(var1.n("ignited")) {
         this.cd();
      }

   }

   public void h() {
      if(this.Z()) {
         this.bp = this.bq;
         if(this.cc()) {
            this.a(1);
         }

         int var1 = this.cb();
         if(var1 > 0 && this.bq == 0) {
            this.a("creeper.primed", 1.0F, 0.5F);
         }

         this.bq += var1;
         if(this.bq < 0) {
            this.bq = 0;
         }

         if(this.bq >= this.br) {
            this.bq = this.br;
            this.ce();
         }
      }

      super.h();
   }

   protected String aT() {
      return "mob.creeper.say";
   }

   protected String aU() {
      return "mob.creeper.death";
   }

   public void a(ro var1) {
      super.a(var1);
      if(var1.j() instanceof yl) {
         int var2 = adb.b(ade.cd);
         int var3 = adb.b(ade.co);
         int var4 = var2 + this.Z.nextInt(var3 - var2 + 1);
         this.a(adb.d(var4), 1);
      }

   }

   public boolean n(sa var1) {
      return true;
   }

   public boolean bZ() {
      return this.af.a(17) == 1;
   }

   protected adb u() {
      return ade.H;
   }

   public int cb() {
      return this.af.a(16);
   }

   public void a(int var1) {
      this.af.b(16, Byte.valueOf((byte)var1));
   }

   public void a(xh var1) {
      super.a(var1);
      this.af.b(17, Byte.valueOf((byte)1));
   }

   protected boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && var2.b() == ade.d) {
         this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.ignite", 1.0F, this.Z.nextFloat() * 0.4F + 0.8F);
         var1.ba();
         if(!this.o.E) {
            this.cd();
            var2.a(1, (sv)var1);
            return true;
         }
      }

      return super.a(var1);
   }

   private void ce() {
      if(!this.o.E) {
         boolean var1 = this.o.O().b("mobGriefing");
         if(this.bZ()) {
            this.o.a(this, this.s, this.t, this.u, (float)(this.bs * 2), var1);
         } else {
            this.o.a(this, this.s, this.t, this.u, (float)this.bs, var1);
         }

         this.B();
      }

   }

   public boolean cc() {
      return this.af.a(18) != 0;
   }

   public void cd() {
      this.af.b(18, Byte.valueOf((byte)1));
   }
}
