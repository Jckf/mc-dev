import java.util.List;
import java.util.Random;

public class auu extends aup {

   public void a(avk var1, List var2, Random var3) {
      if(this.g != 2 && this.g != 3) {
         this.b((auz)var1, var2, var3, 1, 1);
      } else {
         this.c((auz)var1, var2, var3, 1, 1);
      }

   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 1, 1, 0);
         if(this.g != 2 && this.g != 3) {
            this.a(var1, var3, 0, 1, 1, 0, 3, 3, ajn.a, ajn.a, false);
         } else {
            this.a(var1, var3, 4, 1, 1, 4, 3, 3, ajn.a, ajn.a, false);
         }

         return true;
      }
   }
}
