
public class aop extends aji {

   protected aop() {
      super(awt.r);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
      this.a(true);
      this.a(abt.c);
      this.b(0);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      byte var5 = 0;
      float var6 = 0.0625F;
      return azt.a((double)var2 + this.B, (double)var3 + this.C, (double)var4 + this.D, (double)var2 + this.E, (double)((float)var3 + (float)var5 * var6), (double)var4 + this.G);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public void g() {
      this.b(0);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.b(var1.e(var2, var3, var4));
   }

   protected void b(int var1) {
      byte var2 = 0;
      float var3 = (float)(1 * (1 + var2)) / 16.0F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4) && this.j(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      this.e(var1, var2, var3, var4);
   }

   private boolean e(ahb var1, int var2, int var3, int var4) {
      if(!this.j(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return !var1.c(var2, var3 - 1, var4);
   }

   public int a(int var1) {
      return var1;
   }
}
