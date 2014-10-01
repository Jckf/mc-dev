import java.util.Random;

public class auf extends aue {

   private boolean e;


   public auf() {}

   public auf(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 7, 5, 9);
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Witch", this.e);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.e = var1.n("Witch");
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(!this.a(var1, var3, 0)) {
         return false;
      } else {
         this.a(var1, var3, 1, 1, 1, 5, 1, 7, ajn.f, 1, ajn.f, 1, false);
         this.a(var1, var3, 1, 4, 2, 5, 4, 7, ajn.f, 1, ajn.f, 1, false);
         this.a(var1, var3, 2, 1, 0, 4, 1, 0, ajn.f, 1, ajn.f, 1, false);
         this.a(var1, var3, 2, 2, 2, 3, 3, 2, ajn.f, 1, ajn.f, 1, false);
         this.a(var1, var3, 1, 2, 3, 1, 3, 6, ajn.f, 1, ajn.f, 1, false);
         this.a(var1, var3, 5, 2, 3, 5, 3, 6, ajn.f, 1, ajn.f, 1, false);
         this.a(var1, var3, 2, 2, 7, 4, 3, 7, ajn.f, 1, ajn.f, 1, false);
         this.a(var1, var3, 1, 0, 2, 1, 3, 2, ajn.r, ajn.r, false);
         this.a(var1, var3, 5, 0, 2, 5, 3, 2, ajn.r, ajn.r, false);
         this.a(var1, var3, 1, 0, 7, 1, 3, 7, ajn.r, ajn.r, false);
         this.a(var1, var3, 5, 0, 7, 5, 3, 7, ajn.r, ajn.r, false);
         this.a(var1, ajn.aJ, 0, 2, 3, 2, var3);
         this.a(var1, ajn.aJ, 0, 3, 3, 7, var3);
         this.a(var1, ajn.a, 0, 1, 3, 4, var3);
         this.a(var1, ajn.a, 0, 5, 3, 4, var3);
         this.a(var1, ajn.a, 0, 5, 3, 5, var3);
         this.a(var1, ajn.bL, 7, 1, 3, 5, var3);
         this.a(var1, ajn.ai, 0, 3, 2, 6, var3);
         this.a(var1, ajn.bp, 0, 4, 2, 6, var3);
         this.a(var1, ajn.aJ, 0, 1, 2, 1, var3);
         this.a(var1, ajn.aJ, 0, 5, 2, 1, var3);
         int var4 = this.a(ajn.ad, 3);
         int var5 = this.a(ajn.ad, 1);
         int var6 = this.a(ajn.ad, 0);
         int var7 = this.a(ajn.ad, 2);
         this.a(var1, var3, 0, 4, 1, 6, 4, 1, ajn.bF, var4, ajn.bF, var4, false);
         this.a(var1, var3, 0, 4, 2, 0, 4, 7, ajn.bF, var6, ajn.bF, var6, false);
         this.a(var1, var3, 6, 4, 2, 6, 4, 7, ajn.bF, var5, ajn.bF, var5, false);
         this.a(var1, var3, 0, 4, 8, 6, 4, 8, ajn.bF, var7, ajn.bF, var7, false);

         int var8;
         int var9;
         for(var8 = 2; var8 <= 7; var8 += 5) {
            for(var9 = 1; var9 <= 5; var9 += 4) {
               this.b(var1, ajn.r, 0, var9, -1, var8, var3);
            }
         }

         if(!this.e) {
            var8 = this.a(2, 5);
            var9 = this.a(2);
            int var10 = this.b(2, 5);
            if(var3.b(var8, var9, var10)) {
               this.e = true;
               yp var11 = new yp(var1);
               var11.b((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
               var11.a((sy)null);
               var1.d((sa)var11);
            }
         }

         return true;
      }
   }
}
