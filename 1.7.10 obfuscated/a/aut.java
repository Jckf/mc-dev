import java.util.List;
import java.util.Random;

public class aut extends avc {

   public aut() {}

   public aut(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((auz)var1, var2, var3, 1, 1);
   }

   public static aut a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
      return a(var7) && avk.a(var0, var7) == null?new aut(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 8, 4, 10, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 1, 1, 0);
         this.a(var1, var3, 1, 1, 10, 3, 3, 10, ajn.a, ajn.a, false);
         this.a(var1, var3, 4, 1, 1, 4, 3, 1, false, var2, aui.c());
         this.a(var1, var3, 4, 1, 3, 4, 3, 3, false, var2, aui.c());
         this.a(var1, var3, 4, 1, 7, 4, 3, 7, false, var2, aui.c());
         this.a(var1, var3, 4, 1, 9, 4, 3, 9, false, var2, aui.c());
         this.a(var1, var3, 4, 1, 4, 4, 3, 6, ajn.aY, ajn.aY, false);
         this.a(var1, var3, 5, 1, 5, 7, 3, 5, ajn.aY, ajn.aY, false);
         this.a(var1, ajn.aY, 0, 4, 3, 2, var3);
         this.a(var1, ajn.aY, 0, 4, 3, 8, var3);
         this.a(var1, ajn.av, this.a(ajn.av, 3), 4, 1, 2, var3);
         this.a(var1, ajn.av, this.a(ajn.av, 3) + 8, 4, 2, 2, var3);
         this.a(var1, ajn.av, this.a(ajn.av, 3), 4, 1, 8, var3);
         this.a(var1, ajn.av, this.a(ajn.av, 3) + 8, 4, 2, 8, var3);
         return true;
      }
   }
}
