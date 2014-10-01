import java.util.List;
import java.util.Random;

public class avb extends avc {

   public avb() {}

   public avb(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((auz)var1, var2, var3, 1, 1);
   }

   public static avb a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return a(var7) && avk.a(var0, var7) == null?new avb(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 1, 7, 0);
         this.a(var1, var2, var3, avd.a, 1, 1, 7);
         int var4 = this.a(ajn.ar, 2);

         for(int var5 = 0; var5 < 6; ++var5) {
            this.a(var1, ajn.ar, var4, 1, 6 - var5, 1 + var5, var3);
            this.a(var1, ajn.ar, var4, 2, 6 - var5, 1 + var5, var3);
            this.a(var1, ajn.ar, var4, 3, 6 - var5, 1 + var5, var3);
            if(var5 < 5) {
               this.a(var1, ajn.aV, 0, 1, 5 - var5, 1 + var5, var3);
               this.a(var1, ajn.aV, 0, 2, 5 - var5, 1 + var5, var3);
               this.a(var1, ajn.aV, 0, 3, 5 - var5, 1 + var5, var3);
            }
         }

         return true;
      }
   }
}
