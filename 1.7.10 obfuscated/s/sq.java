
public class sq extends sa {

   public int a;
   public int b;
   public int c;
   private int d = 5;
   private int e;
   private yz f;
   private int g;


   public sq(ahb var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.a(0.5F, 0.5F);
      this.L = this.N / 2.0F;
      this.b(var2, var4, var6);
      this.y = (float)(Math.random() * 360.0D);
      this.v = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.w = (double)((float)(Math.random() * 0.2D) * 2.0F);
      this.x = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.e = var8;
   }

   protected boolean g_() {
      return false;
   }

   public sq(ahb var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.L = this.N / 2.0F;
   }

   protected void c() {}

   public void h() {
      super.h();
      if(this.c > 0) {
         --this.c;
      }

      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.w -= 0.029999999329447746D;
      if(this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o() == awt.i) {
         this.w = 0.20000000298023224D;
         this.v = (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
         this.x = (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
         this.a("random.fizz", 0.4F, 2.0F + this.Z.nextFloat() * 0.4F);
      }

      this.j(this.s, (this.C.b + this.C.e) / 2.0D, this.u);
      double var1 = 8.0D;
      if(this.g < this.a - 20 + this.y() % 100) {
         if(this.f == null || this.f.f(this) > var1 * var1) {
            this.f = this.o.a(this, var1);
         }

         this.g = this.a;
      }

      if(this.f != null) {
         double var3 = (this.f.s - this.s) / var1;
         double var5 = (this.f.t + (double)this.f.g() - this.t) / var1;
         double var7 = (this.f.u - this.u) / var1;
         double var9 = Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 1.0D - var9;
         if(var11 > 0.0D) {
            var11 *= var11;
            this.v += var3 / var9 * var11 * 0.1D;
            this.w += var5 / var9 * var11 * 0.1D;
            this.x += var7 / var9 * var11 * 0.1D;
         }
      }

      this.d(this.v, this.w, this.x);
      float var13 = 0.98F;
      if(this.D) {
         var13 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.98F;
      }

      this.v *= (double)var13;
      this.w *= 0.9800000190734863D;
      this.x *= (double)var13;
      if(this.D) {
         this.w *= -0.8999999761581421D;
      }

      ++this.a;
      ++this.b;
      if(this.b >= 6000) {
         this.B();
      }

   }

   public boolean N() {
      return this.o.a(this.C, awt.h, (sa)this);
   }

   protected void f(int var1) {
      this.a(ro.a, (float)var1);
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         this.Q();
         this.d = (int)((float)this.d - var2);
         if(this.d <= 0) {
            this.B();
         }

         return false;
      }
   }

   public void b(dh var1) {
      var1.a("Health", (short)((byte)this.d));
      var1.a("Age", (short)this.b);
      var1.a("Value", (short)this.e);
   }

   public void a(dh var1) {
      this.d = var1.e("Health") & 255;
      this.b = var1.e("Age");
      this.e = var1.e("Value");
   }

   public void b_(yz var1) {
      if(!this.o.E) {
         if(this.c == 0 && var1.bt == 0) {
            var1.bt = 2;
            this.o.a((sa)var1, "random.orb", 0.1F, 0.5F * ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7F + 1.8F));
            var1.a((sa)this, 1);
            var1.v(this.e);
            this.B();
         }

      }
   }

   public int e() {
      return this.e;
   }

   public static int a(int var0) {
      return var0 >= 2477?2477:(var0 >= 1237?1237:(var0 >= 617?617:(var0 >= 307?307:(var0 >= 149?149:(var0 >= 73?73:(var0 >= 37?37:(var0 >= 17?17:(var0 >= 7?7:(var0 >= 3?3:1)))))))));
   }

   public boolean av() {
      return false;
   }
}
