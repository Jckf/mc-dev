import java.util.Random;

public class akx extends aji {

   public static boolean M;


   public akx() {
      super(awt.p);
      this.a(abt.b);
   }

   public akx(awt var1) {
      super(var1);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      var1.a(var2, var3, var4, this, this.a(var1));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      var1.a(var2, var3, var4, this, this.a(var1));
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         this.m(var1, var2, var3, var4);
      }

   }

   private void m(ahb var1, int var2, int var3, int var4) {
      if(e(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var8 = 32;
         if(!M && var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
            if(!var1.E) {
               xj var9 = new xj(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this, var1.e(var2, var3, var4));
               this.a(var9);
               var1.d((sa)var9);
            }
         } else {
            var1.f(var2, var3, var4);

            while(e(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if(var3 > 0) {
               var1.b(var2, var3, var4, (aji)this);
            }
         }
      }

   }

   protected void a(xj var1) {}

   public int a(ahb var1) {
      return 2;
   }

   public static boolean e(ahb var0, int var1, int var2, int var3) {
      aji var4 = var0.a(var1, var2, var3);
      if(var4.J == awt.a) {
         return true;
      } else if(var4 == ajn.ab) {
         return true;
      } else {
         awt var5 = var4.J;
         return var5 == awt.h?true:var5 == awt.i;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5) {}
}
