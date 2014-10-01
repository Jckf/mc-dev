import java.util.List;
import java.util.Random;

public class awf extends awd {

   public awf() {}

   public awf(awa var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.g = var3.nextInt(4);
      switch(this.g) {
      case 0:
      case 2:
         this.f = new asv(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
         break;
      default:
         this.f = new asv(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
      }

   }

   public void a(avk var1, List var2, Random var3) {
      avp.b((awa)var1, var2, var3, this.f.a - 1, this.f.e - 4, this.f.c + 1, 1, this.d());
      avp.b((awa)var1, var2, var3, this.f.d + 1, this.f.e - 4, this.f.c + 1, 3, this.d());
      avp.b((awa)var1, var2, var3, this.f.a + 1, this.f.e - 4, this.f.c - 1, 2, this.d());
      avp.b((awa)var1, var2, var3, this.f.a + 1, this.f.e - 4, this.f.f + 1, 0, this.d());
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 3, 0);
      }

      this.a(var1, var3, 1, 0, 1, 4, 12, 4, ajn.e, ajn.i, false);
      this.a(var1, ajn.a, 0, 2, 12, 2, var3);
      this.a(var1, ajn.a, 0, 3, 12, 2, var3);
      this.a(var1, ajn.a, 0, 2, 12, 3, var3);
      this.a(var1, ajn.a, 0, 3, 12, 3, var3);
      this.a(var1, ajn.aJ, 0, 1, 13, 1, var3);
      this.a(var1, ajn.aJ, 0, 1, 14, 1, var3);
      this.a(var1, ajn.aJ, 0, 4, 13, 1, var3);
      this.a(var1, ajn.aJ, 0, 4, 14, 1, var3);
      this.a(var1, ajn.aJ, 0, 1, 13, 4, var3);
      this.a(var1, ajn.aJ, 0, 1, 14, 4, var3);
      this.a(var1, ajn.aJ, 0, 4, 13, 4, var3);
      this.a(var1, ajn.aJ, 0, 4, 14, 4, var3);
      this.a(var1, var3, 1, 15, 1, 4, 15, 4, ajn.e, ajn.e, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 5; ++var5) {
            if(var5 == 0 || var5 == 5 || var4 == 0 || var4 == 5) {
               this.a(var1, ajn.n, 0, var5, 11, var4, var3);
               this.b(var1, var5, 12, var4, var3);
            }
         }
      }

      return true;
   }
}
