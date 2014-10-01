import java.util.List;
import java.util.Random;

public class ato extends ats {

   public ato() {}

   public ato(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((atw)var1, var2, var3, 1, 0, true);
   }

   public static ato a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return a(var7) && avk.a(var0, var7) == null?new ato(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, 0, 0, 4, 1, 4, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 0, 4, 5, 4, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 2, 0, 0, 5, 4, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 4, 2, 0, 4, 5, 4, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 3, 1, 0, 4, 1, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 3, 3, 0, 4, 3, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 4, 3, 1, 4, 4, 1, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 4, 3, 3, 4, 4, 3, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 6, 0, 4, 6, 4, ajn.bj, ajn.bj, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 4; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
