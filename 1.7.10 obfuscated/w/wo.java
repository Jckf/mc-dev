
public class wo extends wf {

   private final ub bp;


   public wo(ahb var1) {
      super(var1);
      this.a(0.9F, 0.9F);
      this.m().a(true);
      this.c.a(0, new uf(this));
      this.c.a(1, new uz(this, 1.25D));
      this.c.a(2, this.bp = new ub(this, 0.3F));
      this.c.a(3, new ua(this, 1.0D));
      this.c.a(4, new vk(this, 1.2D, ade.bM, false));
      this.c.a(4, new vk(this, 1.2D, ade.bF, false));
      this.c.a(5, new uh(this, 1.1D));
      this.c.a(6, new vc(this, 1.0D));
      this.c.a(7, new un(this, yz.class, 6.0F));
      this.c.a(8, new vb(this));
   }

   public boolean bk() {
      return true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(10.0D);
      this.a(yj.d).a(0.25D);
   }

   protected void bn() {
      super.bn();
   }

   public boolean bE() {
      add var1 = ((yz)this.l).be();
      return var1 != null && var1.b() == ade.bM;
   }

   protected void c() {
      super.c();
      this.af.a(16, Byte.valueOf((byte)0));
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Saddle", this.bZ());
   }

   public void a(dh var1) {
      super.a(var1);
      this.i(var1.n("Saddle"));
   }

   protected String t() {
      return "mob.pig.say";
   }

   protected String aT() {
      return "mob.pig.say";
   }

   protected String aU() {
      return "mob.pig.death";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.pig.step", 0.15F, 1.0F);
   }

   public boolean a(yz var1) {
      if(super.a(var1)) {
         return true;
      } else if(this.bZ() && !this.o.E && (this.l == null || this.l == var1)) {
         var1.a((sa)this);
         return true;
      } else {
         return false;
      }
   }

   protected adb u() {
      return this.al()?ade.am:ade.al;
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(3) + 1 + this.Z.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         if(this.al()) {
            this.a(ade.am, 1);
         } else {
            this.a(ade.al, 1);
         }
      }

      if(this.bZ()) {
         this.a(ade.av, 1);
      }

   }

   public boolean bZ() {
      return (this.af.a(16) & 1) != 0;
   }

   public void i(boolean var1) {
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)1));
      } else {
         this.af.b(16, Byte.valueOf((byte)0));
      }

   }

   public void a(xh var1) {
      if(!this.o.E) {
         yh var2 = new yh(this.o);
         var2.c(0, new add(ade.B));
         var2.b(this.s, this.t, this.u, this.y, this.z);
         this.o.d((sa)var2);
         this.B();
      }
   }

   protected void b(float var1) {
      super.b(var1);
      if(var1 > 5.0F && this.l instanceof yz) {
         ((yz)this.l).a((ph)pc.u);
      }

   }

   public wo b(rx var1) {
      return new wo(this.o);
   }

   public boolean c(add var1) {
      return var1 != null && var1.b() == ade.bF;
   }

   public ub ca() {
      return this.bp;
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.b(var1);
   }
}
