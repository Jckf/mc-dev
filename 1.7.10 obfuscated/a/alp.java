import java.util.Random;

public class alp extends alk {

   public alp() {
      super("ice", awt.w, false);
      this.K = 0.98F;
      this.a(true);
      this.a(abt.b);
   }

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      var2.a(pp.C[aji.b((aji)this)], 1);
      var2.a(0.025F);
      if(this.E() && afv.e(var2)) {
         add var9 = this.j(var6);
         if(var9 != null) {
            this.a(var1, var3, var4, var5, var9);
         }
      } else {
         if(var1.t.f) {
            var1.f(var3, var4, var5);
            return;
         }

         int var7 = afv.f(var2);
         this.b(var1, var3, var4, var5, var6, var7);
         awt var8 = var1.a(var3, var4 - 1, var5).o();
         if(var8.c() || var8.d()) {
            var1.b(var3, var4, var5, (aji)ajn.i);
         }
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(var1.b(ahn.b, var2, var3, var4) > 11 - this.k()) {
         if(var1.t.f) {
            var1.f(var2, var3, var4);
            return;
         }

         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.b(var2, var3, var4, ajn.j);
      }

   }

   public int h() {
      return 0;
   }
}
