import java.util.List;

public abstract class ze extends sa {

   private int e = -1;
   private int f = -1;
   private int g = -1;
   private aji h;
   private boolean i;
   public sv a;
   private int at;
   private int au;
   public double b;
   public double c;
   public double d;


   public ze(ahb var1) {
      super(var1);
      this.a(1.0F, 1.0F);
   }

   protected void c() {}

   public ze(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(1.0F, 1.0F);
      this.b(var2, var4, var6, this.y, this.z);
      this.b(var2, var4, var6);
      double var14 = (double)qh.a(var8 * var8 + var10 * var10 + var12 * var12);
      this.b = var8 / var14 * 0.1D;
      this.c = var10 / var14 * 0.1D;
      this.d = var12 / var14 * 0.1D;
   }

   public ze(ahb var1, sv var2, double var3, double var5, double var7) {
      super(var1);
      this.a = var2;
      this.a(1.0F, 1.0F);
      this.b(var2.s, var2.t, var2.u, var2.y, var2.z);
      this.b(this.s, this.t, this.u);
      this.L = 0.0F;
      this.v = this.w = this.x = 0.0D;
      var3 += this.Z.nextGaussian() * 0.4D;
      var5 += this.Z.nextGaussian() * 0.4D;
      var7 += this.Z.nextGaussian() * 0.4D;
      double var9 = (double)qh.a(var3 * var3 + var5 * var5 + var7 * var7);
      this.b = var3 / var9 * 0.1D;
      this.c = var5 / var9 * 0.1D;
      this.d = var7 / var9 * 0.1D;
   }

   public void h() {
      if(!this.o.E && (this.a != null && this.a.K || !this.o.d((int)this.s, (int)this.t, (int)this.u))) {
         this.B();
      } else {
         super.h();
         this.e(1);
         if(this.i) {
            if(this.o.a(this.e, this.f, this.g) == this.h) {
               ++this.at;
               if(this.at == 600) {
                  this.B();
               }

               return;
            }

            this.i = false;
            this.v *= (double)(this.Z.nextFloat() * 0.2F);
            this.w *= (double)(this.Z.nextFloat() * 0.2F);
            this.x *= (double)(this.Z.nextFloat() * 0.2F);
            this.at = 0;
            this.au = 0;
         } else {
            ++this.au;
         }

         azw var1 = azw.a(this.s, this.t, this.u);
         azw var2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
         azu var3 = this.o.a(var1, var2);
         var1 = azw.a(this.s, this.t, this.u);
         var2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
         if(var3 != null) {
            var2 = azw.a(var3.f.a, var3.f.b, var3.f.c);
         }

         sa var4 = null;
         List var5 = this.o.b((sa)this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            sa var9 = (sa)var5.get(var8);
            if(var9.R() && (!var9.i(this.a) || this.au >= 25)) {
               float var10 = 0.3F;
               azt var11 = var9.C.b((double)var10, (double)var10, (double)var10);
               azu var12 = var11.a(var1, var2);
               if(var12 != null) {
                  double var13 = var1.d(var12.f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new azu(var4);
         }

         if(var3 != null) {
            this.a(var3);
         }

         this.s += this.v;
         this.t += this.w;
         this.u += this.x;
         float var15 = qh.a(this.v * this.v + this.x * this.x);
         this.y = (float)(Math.atan2(this.x, this.v) * 180.0D / 3.1415927410125732D) + 90.0F;

         for(this.z = (float)(Math.atan2((double)var15, this.w) * 180.0D / 3.1415927410125732D) - 90.0F; this.z - this.B < -180.0F; this.B -= 360.0F) {
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
         float var16 = this.e();
         if(this.M()) {
            for(int var17 = 0; var17 < 4; ++var17) {
               float var18 = 0.25F;
               this.o.a("bubble", this.s - this.v * (double)var18, this.t - this.w * (double)var18, this.u - this.x * (double)var18, this.v, this.w, this.x);
            }

            var16 = 0.8F;
         }

         this.v += this.b;
         this.w += this.c;
         this.x += this.d;
         this.v *= (double)var16;
         this.w *= (double)var16;
         this.x *= (double)var16;
         this.o.a("smoke", this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D);
         this.b(this.s, this.t, this.u);
      }
   }

   protected float e() {
      return 0.95F;
   }

   protected abstract void a(azu var1);

   public void b(dh var1) {
      var1.a("xTile", (short)this.e);
      var1.a("yTile", (short)this.f);
      var1.a("zTile", (short)this.g);
      var1.a("inTile", (byte)aji.b(this.h));
      var1.a("inGround", (byte)(this.i?1:0));
      var1.a("direction", (dy)this.a(new double[]{this.v, this.w, this.x}));
   }

   public void a(dh var1) {
      this.e = var1.e("xTile");
      this.f = var1.e("yTile");
      this.g = var1.e("zTile");
      this.h = aji.e(var1.d("inTile") & 255);
      this.i = var1.d("inGround") == 1;
      if(var1.b("direction", 9)) {
         dq var2 = var1.c("direction", 6);
         this.v = var2.d(0);
         this.w = var2.d(1);
         this.x = var2.d(2);
      } else {
         this.B();
      }

   }

   public boolean R() {
      return true;
   }

   public float af() {
      return 1.0F;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         this.Q();
         if(var1.j() != null) {
            azw var3 = var1.j().ag();
            if(var3 != null) {
               this.v = var3.a;
               this.w = var3.b;
               this.x = var3.c;
               this.b = this.v * 0.1D;
               this.c = this.w * 0.1D;
               this.d = this.x * 0.1D;
            }

            if(var1.j() instanceof sv) {
               this.a = (sv)var1.j();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public float d(float var1) {
      return 1.0F;
   }
}
