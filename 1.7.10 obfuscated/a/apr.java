import java.util.Random;

public class apr extends ajc {

   public apr() {
      super(awt.H);
      this.c(-1.0F);
   }

   public aor a(ahb var1, int var2) {
      return null;
   }

   public void b(ahb var1, int var2, int var3, int var4) {}

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      aor var7 = var1.o(var2, var3, var4);
      if(var7 instanceof aps) {
         ((aps)var7).f();
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int b() {
      return -1;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(!var1.E && var1.o(var2, var3, var4) == null) {
         var1.f(var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.E) {
         aps var8 = this.e(var1, var2, var3, var4);
         if(var8 != null) {
            var8.a().b(var1, var2, var3, var4, var8.p(), 0);
         }
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         var1.o(var2, var3, var4);
      }

   }

   public static aor a(aji var0, int var1, int var2, boolean var3, boolean var4) {
      return new aps(var0, var1, var2, var3, var4);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      aps var5 = this.e(var1, var2, var3, var4);
      if(var5 == null) {
         return null;
      } else {
         float var6 = var5.a(0.0F);
         if(var5.b()) {
            var6 = 1.0F - var6;
         }

         return this.a(var1, var2, var3, var4, var5.a(), var6, var5.c());
      }
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      aps var5 = this.e(var1, var2, var3, var4);
      if(var5 != null) {
         aji var6 = var5.a();
         if(var6 == this || var6.o() == awt.a) {
            return;
         }

         var6.a(var1, var2, var3, var4);
         float var7 = var5.a(0.0F);
         if(var5.b()) {
            var7 = 1.0F - var7;
         }

         int var8 = var5.c();
         this.B = var6.x() - (double)((float)q.b[var8] * var7);
         this.C = var6.z() - (double)((float)q.c[var8] * var7);
         this.D = var6.B() - (double)((float)q.d[var8] * var7);
         this.E = var6.y() - (double)((float)q.b[var8] * var7);
         this.F = var6.A() - (double)((float)q.c[var8] * var7);
         this.G = var6.C() - (double)((float)q.d[var8] * var7);
      }

   }

   public azt a(ahb var1, int var2, int var3, int var4, aji var5, float var6, int var7) {
      if(var5 != this && var5.o() != awt.a) {
         azt var8 = var5.a(var1, var2, var3, var4);
         if(var8 == null) {
            return null;
         } else {
            if(q.b[var7] < 0) {
               var8.a -= (double)((float)q.b[var7] * var6);
            } else {
               var8.d -= (double)((float)q.b[var7] * var6);
            }

            if(q.c[var7] < 0) {
               var8.b -= (double)((float)q.c[var7] * var6);
            } else {
               var8.e -= (double)((float)q.c[var7] * var6);
            }

            if(q.d[var7] < 0) {
               var8.c -= (double)((float)q.d[var7] * var6);
            } else {
               var8.f -= (double)((float)q.d[var7] * var6);
            }

            return var8;
         }
      } else {
         return null;
      }
   }

   private aps e(ahl var1, int var2, int var3, int var4) {
      aor var5 = var1.o(var2, var3, var4);
      return var5 instanceof aps?(aps)var5:null;
   }
}
