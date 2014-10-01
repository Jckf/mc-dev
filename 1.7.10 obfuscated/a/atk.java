import java.util.List;
import java.util.Random;

public class atk extends ats {

   public atk() {}

   public atk(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      byte var4 = 1;
      if(this.g == 1 || this.g == 2) {
         var4 = 5;
      }

      this.b((atw)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
      this.c((atw)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
   }

   public static atk a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -3, 0, 0, 9, 7, 9, var5);
      return a(var7) && avk.a(var0, var7) == null?new atk(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, 0, 0, 8, 1, 8, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 0, 8, 5, 8, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 6, 0, 8, 6, 5, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 0, 2, 5, 0, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 6, 2, 0, 8, 5, 0, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 3, 0, 1, 4, 0, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 7, 3, 0, 7, 4, 0, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 2, 4, 8, 2, 8, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 1, 4, 2, 2, 4, ajn.a, ajn.a, false);
      this.a(var1, var3, 6, 1, 4, 7, 2, 4, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 3, 8, 8, 3, 8, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 3, 6, 0, 3, 7, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 8, 3, 6, 8, 3, 7, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 0, 3, 4, 0, 5, 5, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 8, 3, 4, 8, 5, 5, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 3, 5, 2, 5, 5, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 6, 3, 5, 7, 5, 5, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 1, 4, 5, 1, 5, 5, ajn.bk, ajn.bk, false);
      this.a(var1, var3, 7, 4, 5, 7, 5, 5, ajn.bk, ajn.bk, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 8; ++var5) {
            this.b(var1, ajn.bj, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
