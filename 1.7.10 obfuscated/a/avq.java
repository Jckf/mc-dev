import java.util.List;
import java.util.Random;

public class avq extends awd {

   public avq() {}

   public avq(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
   }

   public static avq a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 9, 9, 6, var6);
      return a(var8) && avk.a(var1, var8) == null?new avq(var0, var7, var2, var8, var6):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 9 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 5, 4, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 0, 0, 8, 0, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 5, 0, 8, 5, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 6, 1, 8, 6, 4, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 7, 2, 8, 7, 3, ajn.e, ajn.e, false);
      int var4 = this.a(ajn.ad, 3);
      int var5 = this.a(ajn.ad, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, ajn.ad, var4, var7, 6 + var6, var6, var3);
            this.a(var1, ajn.ad, var5, var7, 6 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, var3, 0, 1, 0, 0, 1, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 1, 5, 8, 1, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 8, 1, 0, 8, 1, 4, ajn.e, ajn.e, false);
      this.a(var1, var3, 2, 1, 0, 7, 1, 0, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 2, 0, 0, 4, 0, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 2, 5, 0, 4, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 8, 2, 5, 8, 4, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 8, 2, 0, 8, 4, 0, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 2, 1, 0, 4, 4, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 2, 5, 7, 4, 5, ajn.f, ajn.f, false);
      this.a(var1, var3, 8, 2, 1, 8, 4, 4, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 2, 0, 7, 4, 0, ajn.f, ajn.f, false);
      this.a(var1, ajn.aZ, 0, 4, 2, 0, var3);
      this.a(var1, ajn.aZ, 0, 5, 2, 0, var3);
      this.a(var1, ajn.aZ, 0, 6, 2, 0, var3);
      this.a(var1, ajn.aZ, 0, 4, 3, 0, var3);
      this.a(var1, ajn.aZ, 0, 5, 3, 0, var3);
      this.a(var1, ajn.aZ, 0, 6, 3, 0, var3);
      this.a(var1, ajn.aZ, 0, 0, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 0, 2, 3, var3);
      this.a(var1, ajn.aZ, 0, 0, 3, 2, var3);
      this.a(var1, ajn.aZ, 0, 0, 3, 3, var3);
      this.a(var1, ajn.aZ, 0, 8, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 8, 2, 3, var3);
      this.a(var1, ajn.aZ, 0, 8, 3, 2, var3);
      this.a(var1, ajn.aZ, 0, 8, 3, 3, var3);
      this.a(var1, ajn.aZ, 0, 2, 2, 5, var3);
      this.a(var1, ajn.aZ, 0, 3, 2, 5, var3);
      this.a(var1, ajn.aZ, 0, 5, 2, 5, var3);
      this.a(var1, ajn.aZ, 0, 6, 2, 5, var3);
      this.a(var1, var3, 1, 4, 1, 7, 4, 1, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 4, 4, 7, 4, 4, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 3, 4, 7, 3, 4, ajn.X, ajn.X, false);
      this.a(var1, ajn.f, 0, 7, 1, 4, var3);
      this.a(var1, ajn.ad, this.a(ajn.ad, 0), 7, 1, 3, var3);
      var6 = this.a(ajn.ad, 3);
      this.a(var1, ajn.ad, var6, 6, 1, 4, var3);
      this.a(var1, ajn.ad, var6, 5, 1, 4, var3);
      this.a(var1, ajn.ad, var6, 4, 1, 4, var3);
      this.a(var1, ajn.ad, var6, 3, 1, 4, var3);
      this.a(var1, ajn.aJ, 0, 6, 1, 3, var3);
      this.a(var1, ajn.aw, 0, 6, 2, 3, var3);
      this.a(var1, ajn.aJ, 0, 4, 1, 3, var3);
      this.a(var1, ajn.aw, 0, 4, 2, 3, var3);
      this.a(var1, ajn.ai, 0, 7, 1, 1, var3);
      this.a(var1, ajn.a, 0, 1, 1, 0, var3);
      this.a(var1, ajn.a, 0, 1, 2, 0, var3);
      this.a(var1, var3, var2, 1, 1, 0, this.a(ajn.ao, 1));
      if(this.a(var1, 1, 0, -1, var3).o() == awt.a && this.a(var1, 1, -1, -1, var3).o() != awt.a) {
         this.a(var1, ajn.ar, this.a(ajn.ar, 3), 1, 0, -1, var3);
      }

      for(var7 = 0; var7 < 6; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.b(var1, var8, 9, var7, var3);
            this.b(var1, ajn.e, 0, var8, -1, var7, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int b(int var1) {
      return 1;
   }
}
