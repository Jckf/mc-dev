import java.util.List;

public class xr extends xp implements aph {

   private boolean a = true;
   private int b = -1;


   public xr(ahb var1) {
      super(var1);
   }

   public xr(ahb var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public int m() {
      return 5;
   }

   public aji o() {
      return ajn.bZ;
   }

   public int s() {
      return 1;
   }

   public int a() {
      return 5;
   }

   public boolean c(yz var1) {
      if(!this.o.E) {
         var1.a(this);
      }

      return true;
   }

   public void a(int var1, int var2, int var3, boolean var4) {
      boolean var5 = !var4;
      if(var5 != this.v()) {
         this.f(var5);
      }

   }

   public boolean v() {
      return this.a;
   }

   public void f(boolean var1) {
      this.a = var1;
   }

   public ahb w() {
      return this.o;
   }

   public double x() {
      return this.s;
   }

   public double aD() {
      return this.t;
   }

   public double aE() {
      return this.u;
   }

   public void h() {
      super.h();
      if(!this.o.E && this.Z() && this.v()) {
         --this.b;
         if(!this.aG()) {
            this.n(0);
            if(this.aF()) {
               this.n(4);
               this.e();
            }
         }
      }

   }

   public boolean aF() {
      if(api.a((aph)this)) {
         return true;
      } else {
         List var1 = this.o.a(xk.class, this.C.b(0.25D, 0.0D, 0.25D), sj.a);
         if(var1.size() > 0) {
            api.a((rb)this, (xk)var1.get(0));
         }

         return false;
      }
   }

   public void a(ro var1) {
      super.a(var1);
      this.a(adb.a((aji)ajn.bZ), 1, 0.0F);
   }

   protected void b(dh var1) {
      super.b(var1);
      var1.a("TransferCooldown", this.b);
   }

   protected void a(dh var1) {
      super.a(var1);
      this.b = var1.f("TransferCooldown");
   }

   public void n(int var1) {
      this.b = var1;
   }

   public boolean aG() {
      return this.b > 0;
   }
}
