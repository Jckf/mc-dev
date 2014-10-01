import java.util.Random;

public class ann extends aji {

   protected ann() {
      super(awt.y);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(true);
      this.a(abt.c);
      this.b(0);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) & 7;
      float var6 = 0.125F;
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
      int var2 = var1 & 7;
      float var3 = (float)(2 * (1 + var2)) / 16.0F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3 - 1, var4);
      return var5 != ajn.aD && var5 != ajn.cj?(var5.o() == awt.j?true:(var5 == this && (var1.e(var2, var3 - 1, var4) & 7) == 7?true:var5.c() && var5.J.c())):false;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      this.m(var1, var2, var3, var4);
   }

   private boolean m(ahb var1, int var2, int var3, int var4) {
      if(!this.c(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      int var7 = var6 & 7;
      this.a(var1, var3, var4, var5, new add(ade.ay, var7 + 1, 0));
      var1.f(var3, var4, var5);
      var2.a(pp.C[aji.b((aji)this)], 1);
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.ay;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(var1.b(ahn.b, var2, var3, var4) > 11) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
      }

   }
}
