import java.util.List;

public abstract class zk extends sa implements zh {

   private int c = -1;
   private int d = -1;
   private int e = -1;
   private aji f;
   protected boolean a;
   public int b;
   private sv g;
   private String h;
   private int i;
   private int at;


   public zk(ahb var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   protected void c() {}

   public zk(ahb var1, sv var2) {
      super(var1);
      this.g = var2;
      this.a(0.25F, 0.25F);
      this.b(var2.s, var2.t + (double)var2.g(), var2.u, var2.y, var2.z);
      this.s -= (double)(qh.b(this.y / 180.0F * 3.1415927F) * 0.16F);
      this.t -= 0.10000000149011612D;
      this.u -= (double)(qh.a(this.y / 180.0F * 3.1415927F) * 0.16F);
      this.b(this.s, this.t, this.u);
      this.L = 0.0F;
      float var3 = 0.4F;
      this.v = (double)(-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * var3);
      this.x = (double)(qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * var3);
      this.w = (double)(-qh.a((this.z + this.f()) / 180.0F * 3.1415927F) * var3);
      this.c(this.v, this.w, this.x, this.e(), 1.0F);
   }

   public zk(ahb var1, double var2, double var4, double var6) {
      super(var1);
      this.i = 0;
      this.a(0.25F, 0.25F);
      this.b(var2, var4, var6);
      this.L = 0.0F;
   }

   protected float e() {
      return 1.5F;
   }

   protected float f() {
      return 0.0F;
   }

   public void c(double var1, double var3, double var5, float var7, float var8) {
      float var9 = qh.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.Z.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.Z.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.Z.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.v = var1;
      this.w = var3;
      this.x = var5;
      float var10 = qh.a(var1 * var1 + var5 * var5);
      this.A = this.y = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.B = this.z = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.i = 0;
   }

   public void h() {
      this.S = this.s;
      this.T = this.t;
      this.U = this.u;
      super.h();
      if(this.b > 0) {
         --this.b;
      }

      if(this.a) {
         if(this.o.a(this.c, this.d, this.e) == this.f) {
            ++this.i;
            if(this.i == 1200) {
               this.B();
            }

            return;
         }

         this.a = false;
         this.v *= (double)(this.Z.nextFloat() * 0.2F);
         this.w *= (double)(this.Z.nextFloat() * 0.2F);
         this.x *= (double)(this.Z.nextFloat() * 0.2F);
         this.i = 0;
         this.at = 0;
      } else {
         ++this.at;
      }

      azw var1 = azw.a(this.s, this.t, this.u);
      azw var2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
      azu var3 = this.o.a(var1, var2);
      var1 = azw.a(this.s, this.t, this.u);
      var2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
      if(var3 != null) {
         var2 = azw.a(var3.f.a, var3.f.b, var3.f.c);
      }

      if(!this.o.E) {
         sa var4 = null;
         List var5 = this.o.b((sa)this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;
         sv var8 = this.j();

         for(int var9 = 0; var9 < var5.size(); ++var9) {
            sa var10 = (sa)var5.get(var9);
            if(var10.R() && (var10 != var8 || this.at >= 5)) {
               float var11 = 0.3F;
               azt var12 = var10.C.b((double)var11, (double)var11, (double)var11);
               azu var13 = var12.a(var1, var2);
               if(var13 != null) {
                  double var14 = var1.d(var13.f);
                  if(var14 < var6 || var6 == 0.0D) {
                     var4 = var10;
                     var6 = var14;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new azu(var4);
         }
      }

      if(var3 != null) {
         if(var3.a == azv.b && this.o.a(var3.b, var3.c, var3.d) == ajn.aO) {
            this.ah();
         } else {
            this.a(var3);
         }
      }

      this.s += this.v;
      this.t += this.w;
      this.u += this.x;
      float var16 = qh.a(this.v * this.v + this.x * this.x);
      this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);

      for(this.z = (float)(Math.atan2(this.w, (double)var16) * 180.0D / 3.1415927410125732D); this.z - this.B < -180.0F; this.B -= 360.0F) {
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
      float var17 = 0.99F;
      float var18 = this.i();
      if(this.M()) {
         for(int var7 = 0; var7 < 4; ++var7) {
            float var19 = 0.25F;
            this.o.a("bubble", this.s - this.v * (double)var19, this.t - this.w * (double)var19, this.u - this.x * (double)var19, this.v, this.w, this.x);
         }

         var17 = 0.8F;
      }

      this.v *= (double)var17;
      this.w *= (double)var17;
      this.x *= (double)var17;
      this.w -= (double)var18;
      this.b(this.s, this.t, this.u);
   }

   protected float i() {
      return 0.03F;
   }

   protected abstract void a(azu var1);

   public void b(dh var1) {
      var1.a("xTile", (short)this.c);
      var1.a("yTile", (short)this.d);
      var1.a("zTile", (short)this.e);
      var1.a("inTile", (byte)aji.b(this.f));
      var1.a("shake", (byte)this.b);
      var1.a("inGround", (byte)(this.a?1:0));
      if((this.h == null || this.h.length() == 0) && this.g != null && this.g instanceof yz) {
         this.h = this.g.b_();
      }

      var1.a("ownerName", this.h == null?"":this.h);
   }

   public void a(dh var1) {
      this.c = var1.e("xTile");
      this.d = var1.e("yTile");
      this.e = var1.e("zTile");
      this.f = aji.e(var1.d("inTile") & 255);
      this.b = var1.d("shake") & 255;
      this.a = var1.d("inGround") == 1;
      this.h = var1.j("ownerName");
      if(this.h != null && this.h.length() == 0) {
         this.h = null;
      }

   }

   public sv j() {
      if(this.g == null && this.h != null && this.h.length() > 0) {
         this.g = this.o.a(this.h);
      }

      return this.g;
   }
}
