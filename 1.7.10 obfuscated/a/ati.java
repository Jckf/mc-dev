import java.util.List;
import java.util.Random;

public class ati extends ats {

   public ati() {}

   public ati(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((atw)var1, var2, var3, 1, 3, false);
   }

   public static ati a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return a(var7) && avk.a(var0, var7) == null?new ati(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, 3, 0, 4, 4, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 5, 0, 3, 7, 18, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 5, 0, 0, 5, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 4, 5, 0, 4, 5, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 0, 4, 2, 5, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 13, 4, 2, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 0, 0, 4, 1, 3, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 0, 15, 4, 1, 18, ajn.bj, ajn.bj, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 2; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
            this.b(var1, ajn.bj, 0, var4, -1, 18 - var5, var3);
         }
      }

      this.a(var1, var3, 0, 1, 1, 0, 4, 1, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 3, 4, 0, 4, 4, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 3, 14, 0, 4, 14, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 1, 17, 0, 4, 17, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 4, 1, 1, 4, 4, 1, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 4, 3, 4, 4, 4, 4, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 4, 3, 14, 4, 4, 14, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 4, 1, 17, 4, 4, 17, ajn.bk, ajn.bk, false);
      return true;
   }
}
