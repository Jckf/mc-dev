import java.util.List;
import java.util.Random;

public class avy extends awd {

   public avy() {}

   public avy(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
   }

   public static avy a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 5, 12, 9, var6);
      return a(var8) && avk.a(var1, var8) == null?new avy(var0, var7, var2, var8, var6):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 12 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 7, ajn.a, ajn.a, false);
      this.a(var1, var3, 1, 5, 1, 3, 9, 3, ajn.a, ajn.a, false);
      this.a(var1, var3, 1, 0, 0, 3, 0, 8, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 1, 0, 3, 10, 0, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 1, 1, 0, 10, 3, ajn.e, ajn.e, false);
      this.a(var1, var3, 4, 1, 1, 4, 10, 3, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 0, 4, 0, 4, 7, ajn.e, ajn.e, false);
      this.a(var1, var3, 4, 0, 4, 4, 4, 7, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 1, 8, 3, 4, 8, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 5, 4, 3, 10, 4, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 5, 5, 3, 5, 7, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 9, 0, 4, 9, 4, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, ajn.e, ajn.e, false);
      this.a(var1, ajn.e, 0, 0, 11, 2, var3);
      this.a(var1, ajn.e, 0, 4, 11, 2, var3);
      this.a(var1, ajn.e, 0, 2, 11, 0, var3);
      this.a(var1, ajn.e, 0, 2, 11, 4, var3);
      this.a(var1, ajn.e, 0, 1, 1, 6, var3);
      this.a(var1, ajn.e, 0, 1, 1, 7, var3);
      this.a(var1, ajn.e, 0, 2, 1, 7, var3);
      this.a(var1, ajn.e, 0, 3, 1, 6, var3);
      this.a(var1, ajn.e, 0, 3, 1, 7, var3);
      this.a(var1, ajn.ar, this.a(ajn.ar, 3), 1, 1, 5, var3);
      this.a(var1, ajn.ar, this.a(ajn.ar, 3), 2, 1, 6, var3);
      this.a(var1, ajn.ar, this.a(ajn.ar, 3), 3, 1, 5, var3);
      this.a(var1, ajn.ar, this.a(ajn.ar, 1), 1, 2, 7, var3);
      this.a(var1, ajn.ar, this.a(ajn.ar, 0), 3, 2, 7, var3);
      this.a(var1, ajn.aZ, 0, 0, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 0, 3, 2, var3);
      this.a(var1, ajn.aZ, 0, 4, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 4, 3, 2, var3);
      this.a(var1, ajn.aZ, 0, 0, 6, 2, var3);
      this.a(var1, ajn.aZ, 0, 0, 7, 2, var3);
      this.a(var1, ajn.aZ, 0, 4, 6, 2, var3);
      this.a(var1, ajn.aZ, 0, 4, 7, 2, var3);
      this.a(var1, ajn.aZ, 0, 2, 6, 0, var3);
      this.a(var1, ajn.aZ, 0, 2, 7, 0, var3);
      this.a(var1, ajn.aZ, 0, 2, 6, 4, var3);
      this.a(var1, ajn.aZ, 0, 2, 7, 4, var3);
      this.a(var1, ajn.aZ, 0, 0, 3, 6, var3);
      this.a(var1, ajn.aZ, 0, 4, 3, 6, var3);
      this.a(var1, ajn.aZ, 0, 2, 3, 8, var3);
      this.a(var1, ajn.aa, 0, 2, 4, 7, var3);
      this.a(var1, ajn.aa, 0, 1, 4, 6, var3);
      this.a(var1, ajn.aa, 0, 3, 4, 6, var3);
      this.a(var1, ajn.aa, 0, 2, 4, 5, var3);
      int var4 = this.a(ajn.ap, 4);

      int var5;
      for(var5 = 1; var5 <= 9; ++var5) {
         this.a(var1, ajn.ap, var4, 3, var5, 3, var3);
      }

      this.a(var1, ajn.a, 0, 2, 1, 0, var3);
      this.a(var1, ajn.a, 0, 2, 2, 0, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.a(ajn.ao, 1));
      if(this.a(var1, 2, 0, -1, var3).o() == awt.a && this.a(var1, 2, -1, -1, var3).o() != awt.a) {
         this.a(var1, ajn.ar, this.a(ajn.ar, 3), 2, 0, -1, var3);
      }

      for(var5 = 0; var5 < 9; ++var5) {
         for(int var6 = 0; var6 < 5; ++var6) {
            this.b(var1, var6, 12, var5, var3);
            this.b(var1, ajn.e, 0, var6, -1, var5, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int b(int var1) {
      return 2;
   }
}
