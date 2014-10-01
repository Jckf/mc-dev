
public class wh extends wf {

   public wh(ahb var1) {
      super(var1);
      this.a(0.9F, 1.3F);
      this.m().a(true);
      this.c.a(0, new uf(this));
      this.c.a(1, new uz(this, 2.0D));
      this.c.a(2, new ua(this, 1.0D));
      this.c.a(3, new vk(this, 1.25D, ade.O, false));
      this.c.a(4, new uh(this, 1.25D));
      this.c.a(5, new vc(this, 1.0D));
      this.c.a(6, new un(this, yz.class, 6.0F));
      this.c.a(7, new vb(this));
   }

   public boolean bk() {
      return true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(10.0D);
      this.a(yj.d).a(0.20000000298023224D);
   }

   protected String t() {
      return "mob.cow.say";
   }

   protected String aT() {
      return "mob.cow.hurt";
   }

   protected String aU() {
      return "mob.cow.hurt";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.cow.step", 0.15F, 1.0F);
   }

   protected float bf() {
      return 0.4F;
   }

   protected adb u() {
      return ade.aA;
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(3) + this.Z.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.a(ade.aA, 1);
      }

      var3 = this.Z.nextInt(3) + 1 + this.Z.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         if(this.al()) {
            this.a(ade.be, 1);
         } else {
            this.a(ade.bd, 1);
         }
      }

   }

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && var2.b() == ade.ar && !var1.bE.d) {
         if(var2.b-- == 1) {
            var1.bm.a(var1.bm.c, new add(ade.aB));
         } else if(!var1.bm.a(new add(ade.aB))) {
            var1.a(new add(ade.aB, 1, 0), false);
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   public wh b(rx var1) {
      return new wh(this.o);
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.b(var1);
   }
}
