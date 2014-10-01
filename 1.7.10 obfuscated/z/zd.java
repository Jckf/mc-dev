
public class zd extends sa {

   private double a;
   private double b;
   private double c;
   private int d;
   private boolean e;


   public zd(ahb var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   protected void c() {}

   public zd(ahb var1, double var2, double var4, double var6) {
      super(var1);
      this.d = 0;
      this.a(0.25F, 0.25F);
      this.b(var2, var4, var6);
      this.L = 0.0F;
   }

   public void a(double var1, int var3, double var4) {
      double var6 = var1 - this.s;
      double var8 = var4 - this.u;
      float var10 = qh.a(var6 * var6 + var8 * var8);
      if(var10 > 12.0F) {
         this.a = this.s + var6 / (double)var10 * 12.0D;
         this.c = this.u + var8 / (double)var10 * 12.0D;
         this.b = this.t + 8.0D;
      } else {
         this.a = var1;
         this.b = (double)var3;
         this.c = var4;
      }

      this.d = 0;
      this.e = this.Z.nextInt(5) > 0;
   }

   public void h() {
      this.S = this.s;
      this.T = this.t;
      this.U = this.u;
      super.h();
      this.s += this.v;
      this.t += this.w;
      this.u += this.x;
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
      if(!this.o.E) {
         double var2 = this.a - this.s;
         double var4 = this.c - this.u;
         float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
         float var7 = (float)Math.atan2(var4, var2);
         double var8 = (double)var1 + (double)(var6 - var1) * 0.0025D;
         if(var6 < 1.0F) {
            var8 *= 0.8D;
            this.w *= 0.8D;
         }

         this.v = Math.cos((double)var7) * var8;
         this.x = Math.sin((double)var7) * var8;
         if(this.t < this.b) {
            this.w += (1.0D - this.w) * 0.014999999664723873D;
         } else {
            this.w += (-1.0D - this.w) * 0.014999999664723873D;
         }
      }

      float var10 = 0.25F;
      if(this.M()) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.o.a("bubble", this.s - this.v * (double)var10, this.t - this.w * (double)var10, this.u - this.x * (double)var10, this.v, this.w, this.x);
         }
      } else {
         this.o.a("portal", this.s - this.v * (double)var10 + this.Z.nextDouble() * 0.6D - 0.3D, this.t - this.w * (double)var10 - 0.5D, this.u - this.x * (double)var10 + this.Z.nextDouble() * 0.6D - 0.3D, this.v, this.w, this.x);
      }

      if(!this.o.E) {
         this.b(this.s, this.t, this.u);
         ++this.d;
         if(this.d > 80 && !this.o.E) {
            this.B();
            if(this.e) {
               this.o.d((sa)(new xk(this.o, this.s, this.t, this.u, new add(ade.bv))));
            } else {
               this.o.c(2003, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), 0);
            }
         }
      }

   }

   public void b(dh var1) {}

   public void a(dh var1) {}

   public float d(float var1) {
      return 1.0F;
   }

   public boolean av() {
      return false;
   }
}
