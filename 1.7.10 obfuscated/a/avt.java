import java.util.List;
import java.util.Random;

public class avt extends awd {

   public avt() {}

   public avt(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
   }

   public static asv a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var3, var4, var5, 0, 0, 0, 3, 4, 2, var6);
      return avk.a(var1, var7) != null?null:var7;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 2, 3, 1, ajn.a, ajn.a, false);
      this.a(var1, ajn.aJ, 0, 1, 0, 0, var3);
      this.a(var1, ajn.aJ, 0, 1, 1, 0, var3);
      this.a(var1, ajn.aJ, 0, 1, 2, 0, var3);
      this.a(var1, ajn.L, 15, 1, 3, 0, var3);
      this.a(var1, ajn.aa, 0, 0, 3, 0, var3);
      this.a(var1, ajn.aa, 0, 1, 3, 1, var3);
      this.a(var1, ajn.aa, 0, 2, 3, 0, var3);
      this.a(var1, ajn.aa, 0, 1, 3, -1, var3);
      return true;
   }
}
