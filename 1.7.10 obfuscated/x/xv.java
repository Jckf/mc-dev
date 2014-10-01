
public class xv extends xl {

   private int a = -1;


   public xv(ahb var1) {
      super(var1);
   }

   public xv(ahb var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public int m() {
      return 3;
   }

   public aji o() {
      return ajn.W;
   }

   public void h() {
      super.h();
      if(this.a > 0) {
         --this.a;
         this.o.a("smoke", this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D);
      } else if(this.a == 0) {
         this.c(this.v * this.v + this.x * this.x);
      }

      if(this.E) {
         double var1 = this.v * this.v + this.x * this.x;
         if(var1 >= 0.009999999776482582D) {
            this.c(var1);
         }
      }

   }

   public void a(ro var1) {
      super.a(var1);
      double var2 = this.v * this.v + this.x * this.x;
      if(!var1.c()) {
         this.a(new add(ajn.W, 1), 0.0F);
      }

      if(var1.o() || var1.c() || var2 >= 0.009999999776482582D) {
         this.c(var2);
      }

   }

   protected void c(double var1) {
      if(!this.o.E) {
         double var3 = Math.sqrt(var1);
         if(var3 > 5.0D) {
            var3 = 5.0D;
         }

         this.o.a(this, this.s, this.t, this.u, (float)(4.0D + this.Z.nextDouble() * 1.5D * var3), true);
         this.B();
      }

   }

   protected void b(float var1) {
      if(var1 >= 3.0F) {
         float var2 = var1 / 10.0F;
         this.c((double)(var2 * var2));
      }

      super.b(var1);
   }

   public void a(int var1, int var2, int var3, boolean var4) {
      if(var4 && this.a < 0) {
         this.e();
      }

   }

   public void e() {
      this.a = 80;
      if(!this.o.E) {
         this.o.a(this, (byte)10);
         this.o.a((sa)this, "game.tnt.primed", 1.0F, 1.0F);
      }

   }

   public boolean v() {
      return this.a > -1;
   }

   public float a(agw var1, ahb var2, int var3, int var4, int var5, aji var6) {
      return this.v() && (aje.a(var6) || aje.b_(var2, var3, var4 + 1, var5))?0.0F:super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean a(agw var1, ahb var2, int var3, int var4, int var5, aji var6, float var7) {
      return this.v() && (aje.a(var6) || aje.b_(var2, var3, var4 + 1, var5))?false:super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   protected void a(dh var1) {
      super.a(var1);
      if(var1.b("TNTFuse", 99)) {
         this.a = var1.f("TNTFuse");
      }

   }

   protected void b(dh var1) {
      super.b(var1);
      var1.a("TNTFuse", this.a);
   }
}
