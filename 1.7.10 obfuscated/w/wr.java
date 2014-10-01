
public class wr extends wl implements yi {

   public wr(ahb var1) {
      super(var1);
      this.a(0.4F, 1.8F);
      this.m().a(true);
      this.c.a(1, new vd(this, 1.25D, 20, 10.0F));
      this.c.a(2, new vc(this, 1.0D));
      this.c.a(3, new un(this, yz.class, 6.0F));
      this.c.a(4, new vb(this));
      this.d.a(1, new vo(this, sw.class, 0, true, false, yb.a));
   }

   public boolean bk() {
      return true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(4.0D);
      this.a(yj.d).a(0.20000000298023224D);
   }

   public void e() {
      super.e();
      int var1 = qh.c(this.s);
      int var2 = qh.c(this.t);
      int var3 = qh.c(this.u);
      if(this.L()) {
         this.a(ro.e, 1.0F);
      }

      if(this.o.a(var1, var3).a(var1, var2, var3) > 1.0F) {
         this.a(ro.b, 1.0F);
      }

      for(int var4 = 0; var4 < 4; ++var4) {
         var1 = qh.c(this.s + (double)((float)(var4 % 2 * 2 - 1) * 0.25F));
         var2 = qh.c(this.t);
         var3 = qh.c(this.u + (double)((float)(var4 / 2 % 2 * 2 - 1) * 0.25F));
         if(this.o.a(var1, var2, var3).o() == awt.a && this.o.a(var1, var3).a(var1, var2, var3) < 0.8F && ajn.aC.c(this.o, var1, var2, var3)) {
            this.o.b(var1, var2, var3, ajn.aC);
         }
      }

   }

   protected adb u() {
      return ade.ay;
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(16);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.a(ade.ay, 1);
      }

   }

   public void a(sv var1, float var2) {
      zj var3 = new zj(this.o, this);
      double var4 = var1.s - this.s;
      double var6 = var1.t + (double)var1.g() - 1.100000023841858D - var3.t;
      double var8 = var1.u - this.u;
      float var10 = qh.a(var4 * var4 + var8 * var8) * 0.2F;
      var3.c(var4, var6 + (double)var10, var8, 1.6F, 12.0F);
      this.a("random.bow", 1.0F, 1.0F / (this.aI().nextFloat() * 0.4F + 0.8F));
      this.o.d((sa)var3);
   }
}
