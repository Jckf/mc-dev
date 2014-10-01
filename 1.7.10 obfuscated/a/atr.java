import java.util.List;
import java.util.Random;

public class atr extends ats {

   private boolean b;


   public atr() {}

   public atr(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   protected void b(dh var1) {
      super.b(var1);
      this.b = var1.n("Mob");
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Mob", this.b);
   }

   public static atr a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -2, 0, 0, 7, 8, 9, var5);
      return a(var7) && avk.a(var0, var7) == null?new atr(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, 2, 0, 6, 7, 7, ajn.a, ajn.a, false);
      this.a(var1, var3, 1, 0, 0, 5, 1, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 2, 1, 5, 2, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 3, 2, 5, 3, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 4, 3, 5, 4, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 2, 0, 1, 4, 2, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 5, 2, 0, 5, 4, 2, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 5, 2, 1, 5, 3, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 5, 5, 2, 5, 5, 3, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 5, 3, 0, 5, 8, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 6, 5, 3, 6, 5, 8, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 5, 8, 5, 5, 8, ajn.bj, ajn.bj, false);
      this.a(var1, ajn.bk, 0, 1, 6, 3, var3);
      this.a(var1, ajn.bk, 0, 5, 6, 3, var3);
      this.a(var1, var3, 0, 6, 3, 0, 6, 8, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 6, 6, 3, 6, 6, 8, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 1, 6, 8, 5, 7, 8, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 2, 8, 8, 4, 8, 8, ajn.bk, ajn.bk, false);
      int var4;
      int var5;
      if(!this.b) {
         var4 = this.a(5);
         var5 = this.a(3, 5);
         int var6 = this.b(3, 5);
         if(var3.b(var5, var4, var6)) {
            this.b = true;
            var1.d(var5, var4, var6, ajn.ac, 0, 2);
            apj var7 = (apj)var1.o(var5, var4, var6);
            if(var7 != null) {
               var7.a().a("Blaze");
            }
         }
      }

      for(var4 = 0; var4 <= 6; ++var4) {
         for(var5 = 0; var5 <= 6; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
