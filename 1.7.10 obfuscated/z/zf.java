
public class zf extends sa {

   private int a;
   private int b;


   public zf(ahb var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   protected void c() {
      this.af.a(8, 5);
   }

   public zf(ahb var1, double var2, double var4, double var6, add var8) {
      super(var1);
      this.a = 0;
      this.a(0.25F, 0.25F);
      this.b(var2, var4, var6);
      this.L = 0.0F;
      int var9 = 1;
      if(var8 != null && var8.p()) {
         this.af.b(8, var8);
         dh var10 = var8.q();
         dh var11 = var10.m("Fireworks");
         if(var11 != null) {
            var9 += var11.d("Flight");
         }
      }

      this.v = this.Z.nextGaussian() * 0.001D;
      this.x = this.Z.nextGaussian() * 0.001D;
      this.w = 0.05D;
      this.b = 10 * var9 + this.Z.nextInt(6) + this.Z.nextInt(7);
   }

   public void h() {
      this.S = this.s;
      this.T = this.t;
      this.U = this.u;
      super.h();
      this.v *= 1.15D;
      this.x *= 1.15D;
      this.w += 0.04D;
      this.d(this.v, this.w, this.x);
      float var1 = qh.a(this.v * this.v + this.x * this.x);
      this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);

      for(this.z = (float)(Math.atan2(this.w, (double)var1) * 180.0D / 3.1415927410125732D); this.z - this.B < -180.0F; this.B -= 360.0F) {
         ;
      }

      while(this.z - this.B >= 180.0F) {
         this.B += 360.0F;
      }

      while(this.y - this.A < -180.0F) {
         this.A -= 360.0F;
      }

      while(this.y - this.A >= 180.0F) {
         this.A += 360.0F;
      }

      this.z = this.B + (this.z - this.B) * 0.2F;
      this.y = this.A + (this.y - this.A) * 0.2F;
      if(this.a == 0) {
         this.o.a((sa)this, "fireworks.launch", 3.0F, 1.0F);
      }

      ++this.a;
      if(this.o.E && this.a % 2 < 2) {
         this.o.a("fireworksSpark", this.s, this.t - 0.3D, this.u, this.Z.nextGaussian() * 0.05D, -this.w * 0.5D, this.Z.nextGaussian() * 0.05D);
      }

      if(!this.o.E && this.a > this.b) {
         this.o.a(this, (byte)17);
         this.B();
      }

   }

   public void b(dh var1) {
      var1.a("Life", this.a);
      var1.a("LifeTime", this.b);
      add var2 = this.af.f(8);
      if(var2 != null) {
         dh var3 = new dh();
         var2.b(var3);
         var1.a("FireworksItem", (dy)var3);
      }

   }

   public void a(dh var1) {
      this.a = var1.f("Life");
      this.b = var1.f("LifeTime");
      dh var2 = var1.m("FireworksItem");
      if(var2 != null) {
         add var3 = add.a(var2);
         if(var3 != null) {
            this.af.b(8, var3);
         }
      }

   }

   public float d(float var1) {
      return super.d(var1);
   }

   public boolean av() {
      return false;
   }
}
