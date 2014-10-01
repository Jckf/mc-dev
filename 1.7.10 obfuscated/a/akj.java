import java.util.Random;

public abstract class akj extends akk {

   protected final boolean a;


   protected akj(boolean var1) {
      super(awt.q);
      this.a = var1;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean d() {
      return false;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return !ahb.a((ahl)var1, var2, var3 - 1, var4)?false:super.c(var1, var2, var3, var4);
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return !ahb.a((ahl)var1, var2, var3 - 1, var4)?false:super.j(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      if(!this.g(var1, var2, var3, var4, var6)) {
         boolean var7 = this.a(var1, var2, var3, var4, var6);
         if(this.a && !var7) {
            var1.d(var2, var3, var4, this.i(), var6, 2);
         } else if(!this.a) {
            var1.d(var2, var3, var4, this.e(), var6, 2);
            if(!var7) {
               var1.a(var2, var3, var4, this.e(), this.k(var6), -1);
            }
         }
      }

   }

   public int b() {
      return 36;
   }

   protected boolean c(int var1) {
      return this.a;
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      return this.b(var1, var2, var3, var4, var5);
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if(!this.c(var6)) {
         return 0;
      } else {
         int var7 = l(var6);
         return var7 == 0 && var5 == 3?this.f(var1, var2, var3, var4, var6):(var7 == 1 && var5 == 4?this.f(var1, var2, var3, var4, var6):(var7 == 2 && var5 == 2?this.f(var1, var2, var3, var4, var6):(var7 == 3 && var5 == 5?this.f(var1, var2, var3, var4, var6):0)));
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!this.j(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.f(var2, var3, var4);
         var1.d(var2 + 1, var3, var4, this);
         var1.d(var2 - 1, var3, var4, this);
         var1.d(var2, var3, var4 + 1, this);
         var1.d(var2, var3, var4 - 1, this);
         var1.d(var2, var3 - 1, var4, this);
         var1.d(var2, var3 + 1, var4, this);
      } else {
         this.b(var1, var2, var3, var4, var5);
      }
   }

   protected void b(ahb var1, int var2, int var3, int var4, aji var5) {
      int var6 = var1.e(var2, var3, var4);
      if(!this.g(var1, var2, var3, var4, var6)) {
         boolean var7 = this.a(var1, var2, var3, var4, var6);
         if((this.a && !var7 || !this.a && var7) && !var1.a(var2, var3, var4, (aji)this)) {
            byte var8 = -1;
            if(this.i(var1, var2, var3, var4, var6)) {
               var8 = -3;
            } else if(this.a) {
               var8 = -2;
            }

            var1.a(var2, var3, var4, this, this.b(var6), var8);
         }
      }

   }

   public boolean g(ahl var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   protected boolean a(ahb var1, int var2, int var3, int var4, int var5) {
      return this.h(var1, var2, var3, var4, var5) > 0;
   }

   protected int h(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = l(var5);
      int var7 = var2 + p.a[var6];
      int var8 = var4 + p.b[var6];
      int var9 = var1.g(var7, var3, var8, p.d[var6]);
      return var9 >= 15?var9:Math.max(var9, var1.a(var7, var3, var8) == ajn.af?var1.e(var7, var3, var8):0);
   }

   protected int h(ahl var1, int var2, int var3, int var4, int var5) {
      int var6 = l(var5);
      switch(var6) {
      case 0:
      case 2:
         return Math.max(this.i(var1, var2 - 1, var3, var4, 4), this.i(var1, var2 + 1, var3, var4, 5));
      case 1:
      case 3:
         return Math.max(this.i(var1, var2, var3, var4 + 1, 3), this.i(var1, var2, var3, var4 - 1, 2));
      default:
         return 0;
      }
   }

   protected int i(ahl var1, int var2, int var3, int var4, int var5) {
      aji var6 = var1.a(var2, var3, var4);
      return this.a(var6)?(var6 == ajn.af?var1.e(var2, var3, var4):var1.e(var2, var3, var4, var5)):0;
   }

   public boolean f() {
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = ((qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.a(var2, var3, var4, var7, 3);
      boolean var8 = this.a(var1, var2, var3, var4, var7);
      if(var8) {
         var1.a(var2, var3, var4, this, 1);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      this.e(var1, var2, var3, var4);
   }

   protected void e(ahb var1, int var2, int var3, int var4) {
      int var5 = l(var1.e(var2, var3, var4));
      if(var5 == 1) {
         var1.e(var2 + 1, var3, var4, this);
         var1.b(var2 + 1, var3, var4, this, 4);
      }

      if(var5 == 3) {
         var1.e(var2 - 1, var3, var4, this);
         var1.b(var2 - 1, var3, var4, this, 5);
      }

      if(var5 == 2) {
         var1.e(var2, var3, var4 + 1, this);
         var1.b(var2, var3, var4 + 1, this, 2);
      }

      if(var5 == 0) {
         var1.e(var2, var3, var4 - 1, this);
         var1.b(var2, var3, var4 - 1, this, 3);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4, int var5) {
      if(this.a) {
         var1.d(var2 + 1, var3, var4, this);
         var1.d(var2 - 1, var3, var4, this);
         var1.d(var2, var3, var4 + 1, this);
         var1.d(var2, var3, var4 - 1, this);
         var1.d(var2, var3 - 1, var4, this);
         var1.d(var2, var3 + 1, var4, this);
      }

      super.b(var1, var2, var3, var4, var5);
   }

   public boolean c() {
      return false;
   }

   protected boolean a(aji var1) {
      return var1.f();
   }

   protected int f(ahl var1, int var2, int var3, int var4, int var5) {
      return 15;
   }

   public static boolean d(aji var0) {
      return ajn.aR.e(var0) || ajn.bU.e(var0);
   }

   public boolean e(aji var1) {
      return var1 == this.e() || var1 == this.i();
   }

   public boolean i(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = l(var5);
      if(d(var1.a(var2 - p.a[var6], var3, var4 - p.b[var6]))) {
         int var7 = var1.e(var2 - p.a[var6], var3, var4 - p.b[var6]);
         int var8 = l(var7);
         return var8 != var6;
      } else {
         return false;
      }
   }

   protected int k(int var1) {
      return this.b(var1);
   }

   protected abstract int b(int var1);

   protected abstract akj e();

   protected abstract akj i();

   public boolean c(aji var1) {
      return this.e(var1);
   }
}
