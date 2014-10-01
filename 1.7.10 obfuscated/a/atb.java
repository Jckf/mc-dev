import java.util.List;
import java.util.Random;

public class atb extends avk {

   public atb() {}

   public atb(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   protected void a(dh var1) {}

   protected void b(dh var1) {}

   public static asv a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      asv var6 = new asv(var2, var3 - 5, var4, var2, var3 + 2, var4);
      switch(var5) {
      case 0:
         var6.d = var2 + 2;
         var6.f = var4 + 8;
         break;
      case 1:
         var6.a = var2 - 8;
         var6.f = var4 + 2;
         break;
      case 2:
         var6.d = var2 + 2;
         var6.c = var4 - 8;
         break;
      case 3:
         var6.d = var2 + 8;
         var6.f = var4 + 2;
      }

      return avk.a(var0, var6) != null?null:var6;
   }

   public void a(avk var1, List var2, Random var3) {
      int var4 = this.d();
      switch(this.g) {
      case 0:
         asx.a(var1, var2, var3, this.f.a, this.f.b, this.f.f + 1, 0, var4);
         break;
      case 1:
         asx.a(var1, var2, var3, this.f.a - 1, this.f.b, this.f.c, 1, var4);
         break;
      case 2:
         asx.a(var1, var2, var3, this.f.a, this.f.b, this.f.c - 1, 2, var4);
         break;
      case 3:
         asx.a(var1, var2, var3, this.f.d + 1, this.f.b, this.f.c, 3, var4);
      }

   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 5, 0, 2, 7, 1, ajn.a, ajn.a, false);
         this.a(var1, var3, 0, 0, 7, 2, 2, 8, ajn.a, ajn.a, false);

         for(int var4 = 0; var4 < 5; ++var4) {
            this.a(var1, var3, 0, 5 - var4 - (var4 < 4?1:0), 2 + var4, 2, 7 - var4, 2 + var4, ajn.a, ajn.a, false);
         }

         return true;
      }
   }
}
