import java.util.List;
import java.util.Random;

public class ath extends ats {

   private int b;


   public ath() {}

   public ath(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
      this.b = var2.nextInt();
   }

   public static ath a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return a(var7) && avk.a(var0, var7) == null?new ath(var6, var1, var7, var5):null;
   }

   protected void b(dh var1) {
      super.b(var1);
      this.b = var1.f("Seed");
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Seed", this.b);
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      Random var4 = new Random((long)this.b);

      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 3; var6 <= 4; ++var6) {
            var7 = var4.nextInt(8);
            this.a(var1, var3, var5, var6, 0, var5, var6, var7, ajn.bj, ajn.bj, false);
         }
      }

      var5 = var4.nextInt(8);
      this.a(var1, var3, 0, 5, 0, 0, 5, var5, ajn.bj, ajn.bj, false);
      var5 = var4.nextInt(8);
      this.a(var1, var3, 4, 5, 0, 4, 5, var5, ajn.bj, ajn.bj, false);

      for(var5 = 0; var5 <= 4; ++var5) {
         var6 = var4.nextInt(5);
         this.a(var1, var3, var5, 2, 0, var5, 2, var6, ajn.bj, ajn.bj, false);
      }

      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 0; var6 <= 1; ++var6) {
            var7 = var4.nextInt(3);
            this.a(var1, var3, var5, var6, 0, var5, var6, var7, ajn.bj, ajn.bj, false);
         }
      }

      return true;
   }
}
