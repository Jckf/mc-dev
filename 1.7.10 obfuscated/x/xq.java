
public class xq extends xl {

   private int c;
   public double a;
   public double b;


   public xq(ahb var1) {
      super(var1);
   }

   public xq(ahb var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public int m() {
      return 2;
   }

   protected void c() {
      super.c();
      this.af.a(16, new Byte((byte)0));
   }

   public void h() {
      super.h();
      if(this.c > 0) {
         --this.c;
      }

      if(this.c <= 0) {
         this.a = this.b = 0.0D;
      }

      this.f(this.c > 0);
      if(this.e() && this.Z.nextInt(4) == 0) {
         this.o.a("largesmoke", this.s, this.t + 0.8D, this.u, 0.0D, 0.0D, 0.0D);
      }

   }

   public void a(ro var1) {
      super.a(var1);
      if(!var1.c()) {
         this.a(new add(ajn.al, 1), 0.0F);
      }

   }

   protected void a(int var1, int var2, int var3, double var4, double var6, aji var8, int var9) {
      super.a(var1, var2, var3, var4, var6, var8, var9);
      double var10 = this.a * this.a + this.b * this.b;
      if(var10 > 1.0E-4D && this.v * this.v + this.x * this.x > 0.001D) {
         var10 = (double)qh.a(var10);
         this.a /= var10;
         this.b /= var10;
         if(this.a * this.v + this.b * this.x < 0.0D) {
            this.a = 0.0D;
            this.b = 0.0D;
         } else {
            this.a = this.v;
            this.b = this.x;
         }
      }

   }

   protected void i() {
      double var1 = this.a * this.a + this.b * this.b;
      if(var1 > 1.0E-4D) {
         var1 = (double)qh.a(var1);
         this.a /= var1;
         this.b /= var1;
         double var3 = 0.05D;
         this.v *= 0.800000011920929D;
         this.w *= 0.0D;
         this.x *= 0.800000011920929D;
         this.v += this.a * var3;
         this.x += this.b * var3;
      } else {
         this.v *= 0.9800000190734863D;
         this.w *= 0.0D;
         this.x *= 0.9800000190734863D;
      }

      super.i();
   }

   public boolean c(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && var2.b() == ade.h) {
         if(!var1.bE.d && --var2.b == 0) {
            var1.bm.a(var1.bm.c, (add)null);
         }

         this.c += 3600;
      }

      this.a = this.s - var1.s;
      this.b = this.u - var1.u;
      return true;
   }

   protected void b(dh var1) {
      super.b(var1);
      var1.a("PushX", this.a);
      var1.a("PushZ", this.b);
      var1.a("Fuel", (short)this.c);
   }

   protected void a(dh var1) {
      super.a(var1);
      this.a = var1.i("PushX");
      this.b = var1.i("PushZ");
      this.c = var1.e("Fuel");
   }

   protected boolean e() {
      return (this.af.a(16) & 1) != 0;
   }

   protected void f(boolean var1) {
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(this.af.a(16) | 1)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(this.af.a(16) & -2)));
      }

   }

   public aji o() {
      return ajn.am;
   }

   public int q() {
      return 2;
   }
}
