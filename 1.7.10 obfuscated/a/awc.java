import java.util.List;
import java.util.Random;

public class awc extends awd {

   public awc() {}

   public awc(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
   }

   public static awc a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 9, 7, 12, var6);
      return a(var8) && avk.a(var1, var8) == null?new awc(var0, var7, var2, var8, var6):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 7 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 4, 4, ajn.a, ajn.a, false);
      this.a(var1, var3, 2, 1, 6, 8, 4, 10, ajn.a, ajn.a, false);
      this.a(var1, var3, 2, 0, 5, 8, 0, 10, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, ajn.f, ajn.f, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 10, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 0, 0, 7, 2, 0, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 0, 5, 2, 1, 5, ajn.e, ajn.e, false);
      this.a(var1, var3, 2, 0, 6, 2, 3, 10, ajn.e, ajn.e, false);
      this.a(var1, var3, 3, 0, 10, 7, 3, 10, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 2, 5, 2, 3, 5, ajn.f, ajn.f, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, ajn.f, ajn.f, false);
      this.a(var1, var3, 0, 4, 4, 3, 4, 4, ajn.f, ajn.f, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, ajn.f, ajn.f, false);
      this.a(var1, ajn.f, 0, 0, 4, 2, var3);
      this.a(var1, ajn.f, 0, 0, 4, 3, var3);
      this.a(var1, ajn.f, 0, 8, 4, 2, var3);
      this.a(var1, ajn.f, 0, 8, 4, 3, var3);
      this.a(var1, ajn.f, 0, 8, 4, 4, var3);
      int var4 = this.a(ajn.ad, 3);
      int var5 = this.a(ajn.ad, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, ajn.ad, var4, var7, 4 + var6, var6, var3);
            if((var6 > -1 || var7 <= 1) && (var6 > 0 || var7 <= 3) && (var6 > 1 || var7 <= 4 || var7 >= 6)) {
               this.a(var1, ajn.ad, var5, var7, 4 + var6, 5 - var6, var3);
            }
         }
      }

      this.a(var1, var3, 3, 4, 5, 3, 4, 10, ajn.f, ajn.f, false);
      this.a(var1, var3, 7, 4, 2, 7, 4, 10, ajn.f, ajn.f, false);
      this.a(var1, var3, 4, 5, 4, 4, 5, 10, ajn.f, ajn.f, false);
      this.a(var1, var3, 6, 5, 4, 6, 5, 10, ajn.f, ajn.f, false);
      this.a(var1, var3, 5, 6, 3, 5, 6, 10, ajn.f, ajn.f, false);
      var6 = this.a(ajn.ad, 0);

      int var8;
      for(var7 = 4; var7 >= 1; --var7) {
         this.a(var1, ajn.f, 0, var7, 2 + var7, 7 - var7, var3);

         for(var8 = 8 - var7; var8 <= 10; ++var8) {
            this.a(var1, ajn.ad, var6, var7, 2 + var7, var8, var3);
         }
      }

      var7 = this.a(ajn.ad, 1);
      this.a(var1, ajn.f, 0, 6, 6, 3, var3);
      this.a(var1, ajn.f, 0, 7, 5, 4, var3);
      this.a(var1, ajn.ad, var7, 6, 6, 4, var3);

      int var9;
      for(var8 = 6; var8 <= 8; ++var8) {
         for(var9 = 5; var9 <= 10; ++var9) {
            this.a(var1, ajn.ad, var7, var8, 12 - var8, var9, var3);
         }
      }

      this.a(var1, ajn.r, 0, 0, 2, 1, var3);
      this.a(var1, ajn.r, 0, 0, 2, 4, var3);
      this.a(var1, ajn.aZ, 0, 0, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 0, 2, 3, var3);
      this.a(var1, ajn.r, 0, 4, 2, 0, var3);
      this.a(var1, ajn.aZ, 0, 5, 2, 0, var3);
      this.a(var1, ajn.r, 0, 6, 2, 0, var3);
      this.a(var1, ajn.r, 0, 8, 2, 1, var3);
      this.a(var1, ajn.aZ, 0, 8, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 8, 2, 3, var3);
      this.a(var1, ajn.r, 0, 8, 2, 4, var3);
      this.a(var1, ajn.f, 0, 8, 2, 5, var3);
      this.a(var1, ajn.r, 0, 8, 2, 6, var3);
      this.a(var1, ajn.aZ, 0, 8, 2, 7, var3);
      this.a(var1, ajn.aZ, 0, 8, 2, 8, var3);
      this.a(var1, ajn.r, 0, 8, 2, 9, var3);
      this.a(var1, ajn.r, 0, 2, 2, 6, var3);
      this.a(var1, ajn.aZ, 0, 2, 2, 7, var3);
      this.a(var1, ajn.aZ, 0, 2, 2, 8, var3);
      this.a(var1, ajn.r, 0, 2, 2, 9, var3);
      this.a(var1, ajn.r, 0, 4, 4, 10, var3);
      this.a(var1, ajn.aZ, 0, 5, 4, 10, var3);
      this.a(var1, ajn.r, 0, 6, 4, 10, var3);
      this.a(var1, ajn.f, 0, 5, 5, 10, var3);
      this.a(var1, ajn.a, 0, 2, 1, 0, var3);
      this.a(var1, ajn.a, 0, 2, 2, 0, var3);
      this.a(var1, ajn.aa, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.a(ajn.ao, 1));
      this.a(var1, var3, 1, 0, -1, 3, 2, -1, ajn.a, ajn.a, false);
      if(this.a(var1, 2, 0, -1, var3).o() == awt.a && this.a(var1, 2, -1, -1, var3).o() != awt.a) {
         this.a(var1, ajn.ar, this.a(ajn.ar, 3), 2, 0, -1, var3);
      }

      for(var8 = 0; var8 < 5; ++var8) {
         for(var9 = 0; var9 < 9; ++var9) {
            this.b(var1, var9, 7, var8, var3);
            this.b(var1, ajn.e, 0, var9, -1, var8, var3);
         }
      }

      for(var8 = 5; var8 < 11; ++var8) {
         for(var9 = 2; var9 < 9; ++var9) {
            this.b(var1, var9, 7, var8, var3);
            this.b(var1, ajn.e, 0, var9, -1, var8, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }
}
