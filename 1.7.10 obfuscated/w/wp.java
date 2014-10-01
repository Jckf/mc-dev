import java.util.Random;

public class wp extends wf {

   private final aae bq = new aae(new wq(this), 2, 1);
   public static final float[][] bp = new float[][]{{1.0F, 1.0F, 1.0F}, {0.85F, 0.5F, 0.2F}, {0.7F, 0.3F, 0.85F}, {0.4F, 0.6F, 0.85F}, {0.9F, 0.9F, 0.2F}, {0.5F, 0.8F, 0.1F}, {0.95F, 0.5F, 0.65F}, {0.3F, 0.3F, 0.3F}, {0.6F, 0.6F, 0.6F}, {0.3F, 0.5F, 0.6F}, {0.5F, 0.25F, 0.7F}, {0.2F, 0.3F, 0.7F}, {0.4F, 0.3F, 0.2F}, {0.4F, 0.5F, 0.2F}, {0.6F, 0.2F, 0.2F}, {0.1F, 0.1F, 0.1F}};
   private int br;
   private ud bs = new ud(this);


   public wp(ahb var1) {
      super(var1);
      this.a(0.9F, 1.3F);
      this.m().a(true);
      this.c.a(0, new uf(this));
      this.c.a(1, new uz(this, 1.25D));
      this.c.a(2, new ua(this, 1.0D));
      this.c.a(3, new vk(this, 1.1D, ade.O, false));
      this.c.a(4, new uh(this, 1.1D));
      this.c.a(5, this.bs);
      this.c.a(6, new vc(this, 1.0D));
      this.c.a(7, new un(this, yz.class, 6.0F));
      this.c.a(8, new vb(this));
      this.bq.a(0, new add(ade.aR, 1, 0));
      this.bq.a(1, new add(ade.aR, 1, 0));
   }

   protected boolean bk() {
      return true;
   }

   protected void bn() {
      this.br = this.bs.f();
      super.bn();
   }

   public void e() {
      if(this.o.E) {
         this.br = Math.max(0, this.br - 1);
      }

      super.e();
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(8.0D);
      this.a(yj.d).a(0.23000000417232513D);
   }

   protected void c() {
      super.c();
      this.af.a(16, new Byte((byte)0));
   }

   protected void b(boolean var1, int var2) {
      if(!this.ca()) {
         this.a(new add(adb.a(ajn.L), 1, this.bZ()), 0.0F);
      }

   }

   protected adb u() {
      return adb.a(ajn.L);
   }

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && var2.b() == ade.aZ && !this.ca() && !this.f()) {
         if(!this.o.E) {
            this.i(true);
            int var3 = 1 + this.Z.nextInt(3);

            for(int var4 = 0; var4 < var3; ++var4) {
               xk var5 = this.a(new add(adb.a(ajn.L), 1, this.bZ()), 1.0F);
               var5.w += (double)(this.Z.nextFloat() * 0.05F);
               var5.v += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.1F);
               var5.x += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.1F);
            }
         }

         var2.a(1, (sv)var1);
         this.a("mob.sheep.shear", 1.0F, 1.0F);
      }

      return super.a(var1);
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Sheared", this.ca());
      var1.a("Color", (byte)this.bZ());
   }

   public void a(dh var1) {
      super.a(var1);
      this.i(var1.n("Sheared"));
      this.s(var1.d("Color"));
   }

   protected String t() {
      return "mob.sheep.say";
   }

   protected String aT() {
      return "mob.sheep.say";
   }

   protected String aU() {
      return "mob.sheep.say";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.sheep.step", 0.15F, 1.0F);
   }

   public int bZ() {
      return this.af.a(16) & 15;
   }

   public void s(int var1) {
      byte var2 = this.af.a(16);
      this.af.b(16, Byte.valueOf((byte)(var2 & 240 | var1 & 15)));
   }

   public boolean ca() {
      return (this.af.a(16) & 16) != 0;
   }

   public void i(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(var2 | 16)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var2 & -17)));
      }

   }

   public static int a(Random var0) {
      int var1 = var0.nextInt(100);
      return var1 < 5?15:(var1 < 10?7:(var1 < 15?8:(var1 < 18?12:(var0.nextInt(500) == 0?6:0))));
   }

   public wp b(rx var1) {
      wp var2 = (wp)var1;
      wp var3 = new wp(this.o);
      int var4 = this.a(this, var2);
      var3.s(15 - var4);
      return var3;
   }

   public void p() {
      this.i(false);
      if(this.f()) {
         this.a(60);
      }

   }

   public sy a(sy var1) {
      var1 = super.a(var1);
      this.s(a(this.o.s));
      return var1;
   }

   private int a(wf var1, wf var2) {
      int var3 = this.b(var1);
      int var4 = this.b(var2);
      this.bq.a(0).b(var3);
      this.bq.a(1).b(var4);
      add var5 = afe.a().a(this.bq, ((wp)var1).o);
      int var6;
      if(var5 != null && var5.b() == ade.aR) {
         var6 = var5.k();
      } else {
         var6 = this.o.s.nextBoolean()?var3:var4;
      }

      return var6;
   }

   private int b(wf var1) {
      return 15 - ((wp)var1).bZ();
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.b(var1);
   }

}
