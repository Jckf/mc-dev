import java.util.Random;

public class akc extends akj implements akw {

   public akc(boolean var1) {
      super(var1);
      this.A = true;
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.bS;
   }

   protected int b(int var1) {
      return 2;
   }

   protected akj e() {
      return ajn.bV;
   }

   protected akj i() {
      return ajn.bU;
   }

   public int b() {
      return 37;
   }

   protected boolean c(int var1) {
      return this.a || (var1 & 8) != 0;
   }

   protected int f(ahl var1, int var2, int var3, int var4, int var5) {
      return this.e(var1, var2, var3, var4).a();
   }

   private int j(ahb var1, int var2, int var3, int var4, int var5) {
      return !this.d(var5)?this.h(var1, var2, var3, var4, var5):Math.max(this.h(var1, var2, var3, var4, var5) - this.h(var1, var2, var3, var4, var5), 0);
   }

   public boolean d(int var1) {
      return (var1 & 4) == 4;
   }

   protected boolean a(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = this.h(var1, var2, var3, var4, var5);
      if(var6 >= 15) {
         return true;
      } else if(var6 == 0) {
         return false;
      } else {
         int var7 = this.h(var1, var2, var3, var4, var5);
         return var7 == 0?true:var6 >= var7;
      }
   }

   protected int h(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = super.h(var1, var2, var3, var4, var5);
      int var7 = l(var5);
      int var8 = var2 + p.a[var7];
      int var9 = var4 + p.b[var7];
      aji var10 = var1.a(var8, var3, var9);
      if(var10.M()) {
         var6 = var10.g(var1, var8, var3, var9, p.f[var7]);
      } else if(var6 < 15 && var10.r()) {
         var8 += p.a[var7];
         var9 += p.b[var7];
         var10 = var1.a(var8, var3, var9);
         if(var10.M()) {
            var6 = var10.g(var1, var8, var3, var9, p.f[var7]);
         }
      }

      return var6;
   }

   public aoz e(ahl var1, int var2, int var3, int var4) {
      return (aoz)var1.o(var2, var3, var4);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.e(var2, var3, var4);
      boolean var11 = this.a | (var10 & 8) != 0;
      boolean var12 = !this.d(var10);
      int var13 = var12?4:0;
      var13 |= var11?8:0;
      var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, var12?0.55F:0.5F);
      var1.a(var2, var3, var4, var13 | var10 & 3, 2);
      this.c(var1, var2, var3, var4, var1.s);
      return true;
   }

   protected void b(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.a(var2, var3, var4, (aji)this)) {
         int var6 = var1.e(var2, var3, var4);
         int var7 = this.j(var1, var2, var3, var4, var6);
         int var8 = this.e(var1, var2, var3, var4).a();
         if(var7 != var8 || this.c(var6) != this.a(var1, var2, var3, var4, var6)) {
            if(this.i(var1, var2, var3, var4, var6)) {
               var1.a(var2, var3, var4, this, this.b(0), -1);
            } else {
               var1.a(var2, var3, var4, this, this.b(0), 0);
            }
         }
      }

   }

   private void c(ahb var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      int var7 = this.j(var1, var2, var3, var4, var6);
      int var8 = this.e(var1, var2, var3, var4).a();
      this.e(var1, var2, var3, var4).a(var7);
      if(var8 != var7 || !this.d(var6)) {
         boolean var9 = this.a(var1, var2, var3, var4, var6);
         boolean var10 = this.a || (var6 & 8) != 0;
         if(var10 && !var9) {
            var1.a(var2, var3, var4, var6 & -9, 2);
         } else if(!var10 && var9) {
            var1.a(var2, var3, var4, var6 | 8, 2);
         }

         this.e(var1, var2, var3, var4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(this.a) {
         int var6 = var1.e(var2, var3, var4);
         var1.d(var2, var3, var4, this.i(), var6 | 8, 4);
      }

      this.c(var1, var2, var3, var4, var5);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.a(var1, 0));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      var1.p(var2, var3, var4);
      this.e(var1, var2, var3, var4);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      aor var7 = var1.o(var2, var3, var4);
      return var7 != null?var7.c(var5, var6):false;
   }

   public aor a(ahb var1, int var2) {
      return new aoz();
   }
}
