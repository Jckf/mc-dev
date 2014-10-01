import java.util.List;
import java.util.Random;

public class atg extends ats {

   public atg() {}

   public atg(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   protected atg(Random var1, int var2, int var3) {
      super(0);
      this.g = var1.nextInt(4);
      switch(this.g) {
      case 0:
      case 2:
         this.f = new asv(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
         break;
      default:
         this.f = new asv(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      }

   }

   public void a(avk var1, List var2, Random var3) {
      this.a((atw)var1, var2, var3, 8, 3, false);
      this.b((atw)var1, var2, var3, 3, 8, false);
      this.c((atw)var1, var2, var3, 3, 8, false);
   }

   public static atg a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -8, -3, 0, 19, 10, 19, var5);
      return a(var7) && avk.a(var0, var7) == null?new atg(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 7, 3, 0, 11, 4, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 3, 7, 18, 4, 11, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 8, 5, 0, 10, 7, 18, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 5, 8, 18, 7, 10, ajn.a, ajn.a, false);
      this.a(var1, var3, 7, 5, 0, 7, 5, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 7, 5, 11, 7, 5, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 11, 5, 0, 11, 5, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 11, 5, 11, 11, 5, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 5, 7, 7, 5, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 11, 5, 7, 18, 5, 7, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 5, 11, 7, 5, 11, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 11, 5, 11, 18, 5, 11, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 7, 2, 0, 11, 2, 5, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 7, 2, 13, 11, 2, 18, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 7, 0, 0, 11, 1, 3, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 7, 0, 15, 11, 1, 18, ajn.bj, ajn.bj, false);

      int var4;
      int var5;
      for(var4 = 7; var4 <= 11; ++var4) {
         for(var5 = 0; var5 <= 2; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
            this.b(var1, ajn.bj, 0, var4, -1, 18 - var5, var3);
         }
      }

      this.a(var1, var3, 0, 2, 7, 5, 2, 11, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 13, 2, 7, 18, 2, 11, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 0, 0, 7, 3, 1, 11, ajn.bj, ajn.bj, false);
      this.a(var1, var3, 15, 0, 7, 18, 1, 11, ajn.bj, ajn.bj, false);

      for(var4 = 0; var4 <= 2; ++var4) {
         for(var5 = 7; var5 <= 11; ++var5) {
            this.b(var1, ajn.bj, 0, var4, -1, var5, var3);
            this.b(var1, ajn.bj, 0, 18 - var4, -1, var5, var3);
         }
      }

      return true;
   }
}
