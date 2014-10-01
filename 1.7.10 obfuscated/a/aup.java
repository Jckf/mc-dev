import java.util.List;
import java.util.Random;

public class aup extends avc {

   public aup() {}

   public aup(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      if(this.g != 2 && this.g != 3) {
         this.c((auz)var1, var2, var3, 1, 1);
      } else {
         this.b((auz)var1, var2, var3, 1, 1);
      }

   }

   public static aup a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return a(var7) && avk.a(var0, var7) == null?new aup(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 1, 1, 0);
         if(this.g != 2 && this.g != 3) {
            this.a(var1, var3, 4, 1, 1, 4, 3, 3, ajn.a, ajn.a, false);
         } else {
            this.a(var1, var3, 0, 1, 1, 0, 3, 3, ajn.a, ajn.a, false);
         }

         return true;
      }
   }
}
