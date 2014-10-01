
public class xw extends sa {

   public int a;
   private sv b;


   public xw(ahb var1) {
      super(var1);
      this.k = true;
      this.a(0.98F, 0.98F);
      this.L = this.N / 2.0F;
   }

   public xw(ahb var1, double var2, double var4, double var6, sv var8) {
      this(var1);
      this.b(var2, var4, var6);
      float var9 = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.v = (double)(-((float)Math.sin((double)var9)) * 0.02F);
      this.w = 0.20000000298023224D;
      this.x = (double)(-((float)Math.cos((double)var9)) * 0.02F);
      this.a = 80;
      this.p = var2;
      this.q = var4;
      this.r = var6;
      this.b = var8;
   }

   protected void c() {}

   protected boolean g_() {
      return false;
   }

   public boolean R() {
      return !this.K;
   }

   public void h() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.w -= 0.03999999910593033D;
      this.d(this.v, this.w, this.x);
      this.v *= 0.9800000190734863D;
      this.w *= 0.9800000190734863D;
      this.x *= 0.9800000190734863D;
      if(this.D) {
         this.v *= 0.699999988079071D;
         this.x *= 0.699999988079071D;
         this.w *= -0.5D;
      }

      if(this.a-- <= 0) {
         this.B();
         if(!this.o.E) {
            this.f();
         }
      } else {
         this.o.a("smoke", this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D);
      }

   }

   private void f() {
      float var1 = 4.0F;
      this.o.a(this, this.s, this.t, this.u, var1, true);
   }

   protected void b(dh var1) {
      var1.a("Fuse", (byte)this.a);
   }

   protected void a(dh var1) {
      this.a = var1.d("Fuse");
   }

   public sv e() {
      return this.b;
   }
}
