import java.util.List;
import java.util.Random;

public class auv extends avc {

   private static final qx[] b = new qx[]{new qx(ade.j, 0, 1, 5, 10), new qx(ade.k, 0, 1, 3, 5), new qx(ade.ax, 0, 4, 9, 5), new qx(ade.h, 0, 3, 8, 10), new qx(ade.P, 0, 1, 3, 15), new qx(ade.e, 0, 1, 3, 15), new qx(ade.b, 0, 1, 1, 1)};
   protected int a;


   public auv() {}

   public auv(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
      this.a = var2.nextInt(5);
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Type", this.a);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = var1.f("Type");
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((auz)var1, var2, var3, 4, 1);
      this.b((auz)var1, var2, var3, 1, 4);
      this.c((auz)var1, var2, var3, 1, 4);
   }

   public static auv a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return a(var7) && avk.a(var0, var7) == null?new auv(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 10, 6, 10, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 4, 1, 0);
         this.a(var1, var3, 4, 1, 10, 6, 3, 10, ajn.a, ajn.a, false);
         this.a(var1, var3, 0, 1, 4, 0, 3, 6, ajn.a, ajn.a, false);
         this.a(var1, var3, 10, 1, 4, 10, 3, 6, ajn.a, ajn.a, false);
         int var4;
         switch(this.a) {
         case 0:
            this.a(var1, ajn.aV, 0, 5, 1, 5, var3);
            this.a(var1, ajn.aV, 0, 5, 2, 5, var3);
            this.a(var1, ajn.aV, 0, 5, 3, 5, var3);
            this.a(var1, ajn.aa, 0, 4, 3, 5, var3);
            this.a(var1, ajn.aa, 0, 6, 3, 5, var3);
            this.a(var1, ajn.aa, 0, 5, 3, 4, var3);
            this.a(var1, ajn.aa, 0, 5, 3, 6, var3);
            this.a(var1, ajn.U, 0, 4, 1, 4, var3);
            this.a(var1, ajn.U, 0, 4, 1, 5, var3);
            this.a(var1, ajn.U, 0, 4, 1, 6, var3);
            this.a(var1, ajn.U, 0, 6, 1, 4, var3);
            this.a(var1, ajn.U, 0, 6, 1, 5, var3);
            this.a(var1, ajn.U, 0, 6, 1, 6, var3);
            this.a(var1, ajn.U, 0, 5, 1, 4, var3);
            this.a(var1, ajn.U, 0, 5, 1, 6, var3);
            break;
         case 1:
            for(var4 = 0; var4 < 5; ++var4) {
               this.a(var1, ajn.aV, 0, 3, 1, 3 + var4, var3);
               this.a(var1, ajn.aV, 0, 7, 1, 3 + var4, var3);
               this.a(var1, ajn.aV, 0, 3 + var4, 1, 3, var3);
               this.a(var1, ajn.aV, 0, 3 + var4, 1, 7, var3);
            }

            this.a(var1, ajn.aV, 0, 5, 1, 5, var3);
            this.a(var1, ajn.aV, 0, 5, 2, 5, var3);
            this.a(var1, ajn.aV, 0, 5, 3, 5, var3);
            this.a(var1, ajn.i, 0, 5, 4, 5, var3);
            break;
         case 2:
            for(var4 = 1; var4 <= 9; ++var4) {
               this.a(var1, ajn.e, 0, 1, 3, var4, var3);
               this.a(var1, ajn.e, 0, 9, 3, var4, var3);
            }

            for(var4 = 1; var4 <= 9; ++var4) {
               this.a(var1, ajn.e, 0, var4, 3, 1, var3);
               this.a(var1, ajn.e, 0, var4, 3, 9, var3);
            }

            this.a(var1, ajn.e, 0, 5, 1, 4, var3);
            this.a(var1, ajn.e, 0, 5, 1, 6, var3);
            this.a(var1, ajn.e, 0, 5, 3, 4, var3);
            this.a(var1, ajn.e, 0, 5, 3, 6, var3);
            this.a(var1, ajn.e, 0, 4, 1, 5, var3);
            this.a(var1, ajn.e, 0, 6, 1, 5, var3);
            this.a(var1, ajn.e, 0, 4, 3, 5, var3);
            this.a(var1, ajn.e, 0, 6, 3, 5, var3);

            for(var4 = 1; var4 <= 3; ++var4) {
               this.a(var1, ajn.e, 0, 4, var4, 4, var3);
               this.a(var1, ajn.e, 0, 6, var4, 4, var3);
               this.a(var1, ajn.e, 0, 4, var4, 6, var3);
               this.a(var1, ajn.e, 0, 6, var4, 6, var3);
            }

            this.a(var1, ajn.aa, 0, 5, 3, 5, var3);

            for(var4 = 2; var4 <= 8; ++var4) {
               this.a(var1, ajn.f, 0, 2, 3, var4, var3);
               this.a(var1, ajn.f, 0, 3, 3, var4, var3);
               if(var4 <= 3 || var4 >= 7) {
                  this.a(var1, ajn.f, 0, 4, 3, var4, var3);
                  this.a(var1, ajn.f, 0, 5, 3, var4, var3);
                  this.a(var1, ajn.f, 0, 6, 3, var4, var3);
               }

               this.a(var1, ajn.f, 0, 7, 3, var4, var3);
               this.a(var1, ajn.f, 0, 8, 3, var4, var3);
            }

            this.a(var1, ajn.ap, this.a(ajn.ap, 4), 9, 1, 3, var3);
            this.a(var1, ajn.ap, this.a(ajn.ap, 4), 9, 2, 3, var3);
            this.a(var1, ajn.ap, this.a(ajn.ap, 4), 9, 3, 3, var3);
            this.a(var1, var3, var2, 3, 4, 8, qx.a(b, new qx[]{ade.bR.b(var2)}), 1 + var2.nextInt(4));
         }

         return true;
      }
   }

}
