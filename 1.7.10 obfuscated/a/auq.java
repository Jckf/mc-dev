import java.util.List;
import java.util.Random;

public class auq extends avc {

   private static final qx[] a = new qx[]{new qx(ade.aG, 0, 1, 3, 20), new qx(ade.aF, 0, 2, 7, 20), new qx(ade.bJ, 0, 1, 1, 1), new qx(ade.aL, 0, 1, 1, 1)};
   private boolean b;


   public auq() {}

   public auq(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
      this.b = var3.c() > 6;
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Tall", this.b);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.b = var1.n("Tall");
   }

   public static auq a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if(!a(var7) || avk.a(var0, var7) != null) {
         var7 = asv.a(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if(!a(var7) || avk.a(var0, var7) != null) {
            return null;
         }
      }

      return new auq(var6, var1, var7, var5);
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         byte var4 = 11;
         if(!this.b) {
            var4 = 6;
         }

         this.a(var1, var3, 0, 0, 0, 13, var4 - 1, 14, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 4, 1, 0);
         this.a(var1, var3, var2, 0.07F, 2, 1, 1, 11, 4, 13, ajn.G, ajn.G, false);
         boolean var5 = true;
         boolean var6 = true;

         int var7;
         for(var7 = 1; var7 <= 13; ++var7) {
            if((var7 - 1) % 4 == 0) {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, ajn.f, ajn.f, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, ajn.f, ajn.f, false);
               this.a(var1, ajn.aa, 0, 2, 3, var7, var3);
               this.a(var1, ajn.aa, 0, 11, 3, var7, var3);
               if(this.b) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, ajn.f, ajn.f, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, ajn.f, ajn.f, false);
               }
            } else {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, ajn.X, ajn.X, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, ajn.X, ajn.X, false);
               if(this.b) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, ajn.X, ajn.X, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, ajn.X, ajn.X, false);
               }
            }
         }

         for(var7 = 3; var7 < 12; var7 += 2) {
            this.a(var1, var3, 3, 1, var7, 4, 3, var7, ajn.X, ajn.X, false);
            this.a(var1, var3, 6, 1, var7, 7, 3, var7, ajn.X, ajn.X, false);
            this.a(var1, var3, 9, 1, var7, 10, 3, var7, ajn.X, ajn.X, false);
         }

         if(this.b) {
            this.a(var1, var3, 1, 5, 1, 3, 5, 13, ajn.f, ajn.f, false);
            this.a(var1, var3, 10, 5, 1, 12, 5, 13, ajn.f, ajn.f, false);
            this.a(var1, var3, 4, 5, 1, 9, 5, 2, ajn.f, ajn.f, false);
            this.a(var1, var3, 4, 5, 12, 9, 5, 13, ajn.f, ajn.f, false);
            this.a(var1, ajn.f, 0, 9, 5, 11, var3);
            this.a(var1, ajn.f, 0, 8, 5, 11, var3);
            this.a(var1, ajn.f, 0, 9, 5, 10, var3);
            this.a(var1, var3, 3, 6, 2, 3, 6, 12, ajn.aJ, ajn.aJ, false);
            this.a(var1, var3, 10, 6, 2, 10, 6, 10, ajn.aJ, ajn.aJ, false);
            this.a(var1, var3, 4, 6, 2, 9, 6, 2, ajn.aJ, ajn.aJ, false);
            this.a(var1, var3, 4, 6, 12, 8, 6, 12, ajn.aJ, ajn.aJ, false);
            this.a(var1, ajn.aJ, 0, 9, 6, 11, var3);
            this.a(var1, ajn.aJ, 0, 8, 6, 11, var3);
            this.a(var1, ajn.aJ, 0, 9, 6, 10, var3);
            var7 = this.a(ajn.ap, 3);
            this.a(var1, ajn.ap, var7, 10, 1, 13, var3);
            this.a(var1, ajn.ap, var7, 10, 2, 13, var3);
            this.a(var1, ajn.ap, var7, 10, 3, 13, var3);
            this.a(var1, ajn.ap, var7, 10, 4, 13, var3);
            this.a(var1, ajn.ap, var7, 10, 5, 13, var3);
            this.a(var1, ajn.ap, var7, 10, 6, 13, var3);
            this.a(var1, ajn.ap, var7, 10, 7, 13, var3);
            byte var8 = 7;
            byte var9 = 7;
            this.a(var1, ajn.aJ, 0, var8 - 1, 9, var9, var3);
            this.a(var1, ajn.aJ, 0, var8, 9, var9, var3);
            this.a(var1, ajn.aJ, 0, var8 - 1, 8, var9, var3);
            this.a(var1, ajn.aJ, 0, var8, 8, var9, var3);
            this.a(var1, ajn.aJ, 0, var8 - 1, 7, var9, var3);
            this.a(var1, ajn.aJ, 0, var8, 7, var9, var3);
            this.a(var1, ajn.aJ, 0, var8 - 2, 7, var9, var3);
            this.a(var1, ajn.aJ, 0, var8 + 1, 7, var9, var3);
            this.a(var1, ajn.aJ, 0, var8 - 1, 7, var9 - 1, var3);
            this.a(var1, ajn.aJ, 0, var8 - 1, 7, var9 + 1, var3);
            this.a(var1, ajn.aJ, 0, var8, 7, var9 - 1, var3);
            this.a(var1, ajn.aJ, 0, var8, 7, var9 + 1, var3);
            this.a(var1, ajn.aa, 0, var8 - 2, 8, var9, var3);
            this.a(var1, ajn.aa, 0, var8 + 1, 8, var9, var3);
            this.a(var1, ajn.aa, 0, var8 - 1, 8, var9 - 1, var3);
            this.a(var1, ajn.aa, 0, var8 - 1, 8, var9 + 1, var3);
            this.a(var1, ajn.aa, 0, var8, 8, var9 - 1, var3);
            this.a(var1, ajn.aa, 0, var8, 8, var9 + 1, var3);
         }

         this.a(var1, var3, var2, 3, 3, 5, qx.a(a, new qx[]{ade.bR.a(var2, 1, 5, 2)}), 1 + var2.nextInt(4));
         if(this.b) {
            this.a(var1, ajn.a, 0, 12, 9, 1, var3);
            this.a(var1, var3, var2, 12, 8, 1, qx.a(a, new qx[]{ade.bR.a(var2, 1, 5, 2)}), 1 + var2.nextInt(4));
         }

         return true;
      }
   }

}
