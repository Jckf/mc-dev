import java.util.List;
import java.util.Random;

public class atj extends ats {

   public atj() {}

   public atj(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((atw)var1, var2, var3, 1, 0, true);
   }

   public static atj a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -7, 0, 5, 14, 10, var5);
      return a(var7) && avk.a(var0, var7) == null?new atj(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      int var4 = this.a(ajn.bl, 2);

      for(int var5 = 0; var5 <= 9; ++var5) {
         int var6 = Math.max(1, 7 - var5);
         int var7 = Math.min(Math.max(var6 + 5, 14 - var5), 13);
         int var8 = var5;
         this.a(var1, var3, 0, 0, var5, 4, var6, var5, ajn.bj, ajn.bj, false);
         this.a(var1, var3, 1, var6 + 1, var5, 3, var7 - 1, var5, ajn.a, ajn.a, false);
         if(var5 <= 6) {
            this.a(var1, ajn.bl, var4, 1, var6 + 1, var5, var3);
            this.a(var1, ajn.bl, var4, 2, var6 + 1, var5, var3);
            this.a(var1, ajn.bl, var4, 3, var6 + 1, var5, var3);
         }

         this.a(var1, var3, 0, var7, var5, 4, var7, var5, ajn.bj, ajn.bj, false);
         this.a(var1, var3, 0, var6 + 1, var5, 0, var7 - 1, var5, ajn.bj, ajn.bj, false);
         this.a(var1, var3, 4, var6 + 1, var5, 4, var7 - 1, var5, ajn.bj, ajn.bj, false);
         if((var5 & 1) == 0) {
            this.a(var1, var3, 0, var6 + 2, var5, 0, var6 + 3, var5, ajn.bk, ajn.bk, false);
            this.a(var1, var3, 4, var6 + 2, var5, 4, var6 + 3, var5, ajn.bk, ajn.bk, false);
         }

         for(int var9 = 0; var9 <= 4; ++var9) {
            this.b(var1, ajn.bj, 0, var9, -1, var8, var3);
         }
      }

      return true;
   }
}
