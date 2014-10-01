import java.util.List;
import java.util.Random;

public class atl extends ats {

   public atl() {}

   public atl(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((atw)var1, var2, var3, 5, 3, true);
   }

   public static atl a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      return a(var7) && avk.a(var0, var7) == null?new atl(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, 3, 0, 12, 4, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 5, 0, 12, 13, 12, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 5, 0, 1, 12, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 11, 5, 0, 12, 12, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 2, 5, 11, 4, 12, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 8, 5, 11, 10, 12, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 5, 9, 11, 7, 12, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 2, 5, 0, 4, 12, 1, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 8, 5, 0, 10, 12, 1, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 5, 9, 0, 7, 12, 1, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 2, 11, 2, 10, 12, 10, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 5, 8, 0, 7, 8, 0, ajn.bk, ajn.bk, false);

      int var4;
      for(var4 = 1; var4 <= 11; var4 += 2) {
         this.a(var1, var3, var4, 10, 0, var4, 11, 0, ajn.bk, ajn.bk, false);
         this.a(var1, var3, var4, 10, 12, var4, 11, 12, ajn.bk, ajn.bk, false);
         this.a(var1, var3, 0, 10, var4, 0, 11, var4, ajn.bk, ajn.bk, false);
         this.a(var1, var3, 12, 10, var4, 12, 11, var4, ajn.bk, ajn.bk, false);
         this.a(var1, ajn.bj, 0, var4, 13, 0, var3);
         this.a(var1, ajn.bj, 0, var4, 13, 12, var3);
         this.a(var1, ajn.bj, 0, 0, 13, var4, var3);
         this.a(var1, ajn.bj, 0, 12, 13, var4, var3);
         this.a(var1, ajn.bk, 0, var4 + 1, 13, 0, var3);
         this.a(var1, ajn.bk, 0, var4 + 1, 13, 12, var3);
         this.a(var1, ajn.bk, 0, 0, 13, var4 + 1, var3);
         this.a(var1, ajn.bk, 0, 12, 13, var4 + 1, var3);
      }

      this.a(var1, ajn.bk, 0, 0, 13, 0, var3);
      this.a(var1, ajn.bk, 0, 0, 13, 12, var3);
      this.a(var1, ajn.bk, 0, 0, 13, 0, var3);
      this.a(var1, ajn.bk, 0, 12, 13, 0, var3);

      for(var4 = 3; var4 <= 9; var4 += 2) {
         this.a(var1, var3, 1, 7, var4, 1, 8, var4, ajn.bk, ajn.bk, false);
         this.a(var1, var3, 11, 7, var4, 11, 8, var4, ajn.bk, ajn.bk, false);
      }

      this.a(var1, var3, 4, 2, 0, 8, 2, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 2, 4, 12, 2, 8, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 4, 0, 0, 8, 1, 3, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 4, 0, 9, 8, 1, 12, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 0, 4, 3, 1, 8, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 9, 0, 4, 12, 1, 8, ajn.bj, ajn.bj, false);

      int var5;
      for(var4 = 4; var4 <= 8; ++var4) {
         for(var5 = 0; var5 <= 2; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
            this.b(var1, ajn.bj, 0, var4, -1, 12 - var5, var3);
         }
      }

      for(var4 = 0; var4 <= 2; ++var4) {
         for(var5 = 4; var5 <= 8; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
            this.b(var1, ajn.bj, 0, 12 - var4, -1, var5, var3);
         }
      }

      this.a(var1, var3, 5, 5, 5, 7, 5, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 6, 1, 6, 6, 4, 6, ajn.a, ajn.a, false);
      this.a(var1, ajn.bj, 0, 6, 0, 6, var3);
      this.a(var1, ajn.k, 0, 6, 5, 6, var3);
      var4 = this.a(6, 6);
      var5 = this.a(5);
      int var6 = this.b(6, 6);
      if(var3.b(var4, var5, var6)) {
         var1.d = true;
         ajn.k.a(var1, var4, var5, var6, var2);
         var1.d = false;
      }

      return true;
   }
}
