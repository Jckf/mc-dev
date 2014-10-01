import java.util.List;
import java.util.Random;

public class atu extends ats {

   public atu() {}

   public atu(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((atw)var1, var2, var3, 2, 0, false);
      this.b((atw)var1, var2, var3, 0, 2, false);
      this.c((atw)var1, var2, var3, 0, 2, false);
   }

   public static atu a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -2, 0, 0, 7, 9, 7, var5);
      return a(var7) && avk.a(var0, var7) == null?new atu(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, 0, 0, 6, 1, 6, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 0, 6, 7, 6, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 2, 0, 1, 6, 0, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 6, 1, 6, 6, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 5, 2, 0, 6, 6, 0, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 5, 2, 6, 6, 6, 6, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 0, 0, 6, 1, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 5, 0, 6, 6, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 6, 2, 0, 6, 6, 1, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 6, 2, 5, 6, 6, 6, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 2, 6, 0, 4, 6, 0, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 2, 5, 0, 4, 5, 0, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 2, 6, 6, 4, 6, 6, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 2, 5, 6, 4, 5, 6, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 6, 2, 0, 6, 4, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 5, 2, 0, 5, 4, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 6, 6, 2, 6, 6, 4, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 6, 5, 2, 6, 5, 4, ajn.bk, ajn.bk, false);

      for(int var4 = 0; var4 <= 6; ++var4) {
         for(int var5 = 0; var5 <= 6; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
