import java.util.Random;

public class auc extends aue {

   private boolean e;
   private boolean i;
   private boolean j;
   private boolean k;
   private static final qx[] l = new qx[]{new qx(ade.i, 0, 1, 3, 3), new qx(ade.j, 0, 1, 5, 10), new qx(ade.k, 0, 2, 7, 15), new qx(ade.bC, 0, 1, 3, 2), new qx(ade.aS, 0, 4, 6, 20), new qx(ade.bh, 0, 3, 7, 16), new qx(ade.av, 0, 1, 1, 3), new qx(ade.bX, 0, 1, 1, 1), new qx(ade.bY, 0, 1, 1, 1), new qx(ade.bZ, 0, 1, 1, 1)};
   private static final qx[] m = new qx[]{new qx(ade.g, 0, 2, 7, 30)};
   private static aud n = new aud((aua)null);


   public auc() {}

   public auc(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 12, 10, 15);
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("placedMainChest", this.e);
      var1.a("placedHiddenChest", this.i);
      var1.a("placedTrap1", this.j);
      var1.a("placedTrap2", this.k);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.e = var1.n("placedMainChest");
      this.i = var1.n("placedHiddenChest");
      this.j = var1.n("placedTrap1");
      this.k = var1.n("placedTrap2");
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(!this.a(var1, var3, 0)) {
         return false;
      } else {
         int var4 = this.a(ajn.ar, 3);
         int var5 = this.a(ajn.ar, 2);
         int var6 = this.a(ajn.ar, 0);
         int var7 = this.a(ajn.ar, 1);
         this.a(var1, var3, 0, -4, 0, this.a - 1, 0, this.c - 1, false, var2, n);
         this.a(var1, var3, 2, 1, 2, 9, 2, 2, false, var2, n);
         this.a(var1, var3, 2, 1, 12, 9, 2, 12, false, var2, n);
         this.a(var1, var3, 2, 1, 3, 2, 2, 11, false, var2, n);
         this.a(var1, var3, 9, 1, 3, 9, 2, 11, false, var2, n);
         this.a(var1, var3, 1, 3, 1, 10, 6, 1, false, var2, n);
         this.a(var1, var3, 1, 3, 13, 10, 6, 13, false, var2, n);
         this.a(var1, var3, 1, 3, 2, 1, 6, 12, false, var2, n);
         this.a(var1, var3, 10, 3, 2, 10, 6, 12, false, var2, n);
         this.a(var1, var3, 2, 3, 2, 9, 3, 12, false, var2, n);
         this.a(var1, var3, 2, 6, 2, 9, 6, 12, false, var2, n);
         this.a(var1, var3, 3, 7, 3, 8, 7, 11, false, var2, n);
         this.a(var1, var3, 4, 8, 4, 7, 8, 10, false, var2, n);
         this.a(var1, var3, 3, 1, 3, 8, 2, 11);
         this.a(var1, var3, 4, 3, 6, 7, 3, 9);
         this.a(var1, var3, 2, 4, 2, 9, 5, 12);
         this.a(var1, var3, 4, 6, 5, 7, 6, 9);
         this.a(var1, var3, 5, 7, 6, 6, 7, 8);
         this.a(var1, var3, 5, 1, 2, 6, 2, 2);
         this.a(var1, var3, 5, 2, 12, 6, 2, 12);
         this.a(var1, var3, 5, 5, 1, 6, 5, 1);
         this.a(var1, var3, 5, 5, 13, 6, 5, 13);
         this.a(var1, ajn.a, 0, 1, 5, 5, var3);
         this.a(var1, ajn.a, 0, 10, 5, 5, var3);
         this.a(var1, ajn.a, 0, 1, 5, 9, var3);
         this.a(var1, ajn.a, 0, 10, 5, 9, var3);

         int var8;
         for(var8 = 0; var8 <= 14; var8 += 14) {
            this.a(var1, var3, 2, 4, var8, 2, 5, var8, false, var2, n);
            this.a(var1, var3, 4, 4, var8, 4, 5, var8, false, var2, n);
            this.a(var1, var3, 7, 4, var8, 7, 5, var8, false, var2, n);
            this.a(var1, var3, 9, 4, var8, 9, 5, var8, false, var2, n);
         }

         this.a(var1, var3, 5, 6, 0, 6, 6, 0, false, var2, n);

         for(var8 = 0; var8 <= 11; var8 += 11) {
            for(int var9 = 2; var9 <= 12; var9 += 2) {
               this.a(var1, var3, var8, 4, var9, var8, 5, var9, false, var2, n);
            }

            this.a(var1, var3, var8, 6, 5, var8, 6, 5, false, var2, n);
            this.a(var1, var3, var8, 6, 9, var8, 6, 9, false, var2, n);
         }

         this.a(var1, var3, 2, 7, 2, 2, 9, 2, false, var2, n);
         this.a(var1, var3, 9, 7, 2, 9, 9, 2, false, var2, n);
         this.a(var1, var3, 2, 7, 12, 2, 9, 12, false, var2, n);
         this.a(var1, var3, 9, 7, 12, 9, 9, 12, false, var2, n);
         this.a(var1, var3, 4, 9, 4, 4, 9, 4, false, var2, n);
         this.a(var1, var3, 7, 9, 4, 7, 9, 4, false, var2, n);
         this.a(var1, var3, 4, 9, 10, 4, 9, 10, false, var2, n);
         this.a(var1, var3, 7, 9, 10, 7, 9, 10, false, var2, n);
         this.a(var1, var3, 5, 9, 7, 6, 9, 7, false, var2, n);
         this.a(var1, ajn.ar, var4, 5, 9, 6, var3);
         this.a(var1, ajn.ar, var4, 6, 9, 6, var3);
         this.a(var1, ajn.ar, var5, 5, 9, 8, var3);
         this.a(var1, ajn.ar, var5, 6, 9, 8, var3);
         this.a(var1, ajn.ar, var4, 4, 0, 0, var3);
         this.a(var1, ajn.ar, var4, 5, 0, 0, var3);
         this.a(var1, ajn.ar, var4, 6, 0, 0, var3);
         this.a(var1, ajn.ar, var4, 7, 0, 0, var3);
         this.a(var1, ajn.ar, var4, 4, 1, 8, var3);
         this.a(var1, ajn.ar, var4, 4, 2, 9, var3);
         this.a(var1, ajn.ar, var4, 4, 3, 10, var3);
         this.a(var1, ajn.ar, var4, 7, 1, 8, var3);
         this.a(var1, ajn.ar, var4, 7, 2, 9, var3);
         this.a(var1, ajn.ar, var4, 7, 3, 10, var3);
         this.a(var1, var3, 4, 1, 9, 4, 1, 9, false, var2, n);
         this.a(var1, var3, 7, 1, 9, 7, 1, 9, false, var2, n);
         this.a(var1, var3, 4, 1, 10, 7, 2, 10, false, var2, n);
         this.a(var1, var3, 5, 4, 5, 6, 4, 5, false, var2, n);
         this.a(var1, ajn.ar, var6, 4, 4, 5, var3);
         this.a(var1, ajn.ar, var7, 7, 4, 5, var3);

         for(var8 = 0; var8 < 4; ++var8) {
            this.a(var1, ajn.ar, var5, 5, 0 - var8, 6 + var8, var3);
            this.a(var1, ajn.ar, var5, 6, 0 - var8, 6 + var8, var3);
            this.a(var1, var3, 5, 0 - var8, 7 + var8, 6, 0 - var8, 9 + var8);
         }

         this.a(var1, var3, 1, -3, 12, 10, -1, 13);
         this.a(var1, var3, 1, -3, 1, 3, -1, 13);
         this.a(var1, var3, 1, -3, 1, 9, -1, 5);

         for(var8 = 1; var8 <= 13; var8 += 2) {
            this.a(var1, var3, 1, -3, var8, 1, -2, var8, false, var2, n);
         }

         for(var8 = 2; var8 <= 12; var8 += 2) {
            this.a(var1, var3, 1, -1, var8, 3, -1, var8, false, var2, n);
         }

         this.a(var1, var3, 2, -2, 1, 5, -2, 1, false, var2, n);
         this.a(var1, var3, 7, -2, 1, 9, -2, 1, false, var2, n);
         this.a(var1, var3, 6, -3, 1, 6, -3, 1, false, var2, n);
         this.a(var1, var3, 6, -1, 1, 6, -1, 1, false, var2, n);
         this.a(var1, ajn.bC, this.a(ajn.bC, 3) | 4, 1, -3, 8, var3);
         this.a(var1, ajn.bC, this.a(ajn.bC, 1) | 4, 4, -3, 8, var3);
         this.a(var1, ajn.bD, 4, 2, -3, 8, var3);
         this.a(var1, ajn.bD, 4, 3, -3, 8, var3);
         this.a(var1, ajn.af, 0, 5, -3, 7, var3);
         this.a(var1, ajn.af, 0, 5, -3, 6, var3);
         this.a(var1, ajn.af, 0, 5, -3, 5, var3);
         this.a(var1, ajn.af, 0, 5, -3, 4, var3);
         this.a(var1, ajn.af, 0, 5, -3, 3, var3);
         this.a(var1, ajn.af, 0, 5, -3, 2, var3);
         this.a(var1, ajn.af, 0, 5, -3, 1, var3);
         this.a(var1, ajn.af, 0, 4, -3, 1, var3);
         this.a(var1, ajn.Y, 0, 3, -3, 1, var3);
         if(!this.j) {
            this.j = this.a(var1, var3, var2, 3, -2, 1, 2, m, 2);
         }

         this.a(var1, ajn.bd, 15, 3, -2, 2, var3);
         this.a(var1, ajn.bC, this.a(ajn.bC, 2) | 4, 7, -3, 1, var3);
         this.a(var1, ajn.bC, this.a(ajn.bC, 0) | 4, 7, -3, 5, var3);
         this.a(var1, ajn.bD, 4, 7, -3, 2, var3);
         this.a(var1, ajn.bD, 4, 7, -3, 3, var3);
         this.a(var1, ajn.bD, 4, 7, -3, 4, var3);
         this.a(var1, ajn.af, 0, 8, -3, 6, var3);
         this.a(var1, ajn.af, 0, 9, -3, 6, var3);
         this.a(var1, ajn.af, 0, 9, -3, 5, var3);
         this.a(var1, ajn.Y, 0, 9, -3, 4, var3);
         this.a(var1, ajn.af, 0, 9, -2, 4, var3);
         if(!this.k) {
            this.k = this.a(var1, var3, var2, 9, -2, 3, 4, m, 2);
         }

         this.a(var1, ajn.bd, 15, 8, -1, 3, var3);
         this.a(var1, ajn.bd, 15, 8, -2, 3, var3);
         if(!this.e) {
            this.e = this.a(var1, var3, var2, 8, -3, 3, qx.a(l, new qx[]{ade.bR.b(var2)}), 2 + var2.nextInt(5));
         }

         this.a(var1, ajn.Y, 0, 9, -3, 2, var3);
         this.a(var1, ajn.Y, 0, 8, -3, 1, var3);
         this.a(var1, ajn.Y, 0, 4, -3, 5, var3);
         this.a(var1, ajn.Y, 0, 5, -2, 5, var3);
         this.a(var1, ajn.Y, 0, 5, -1, 5, var3);
         this.a(var1, ajn.Y, 0, 6, -3, 5, var3);
         this.a(var1, ajn.Y, 0, 7, -2, 5, var3);
         this.a(var1, ajn.Y, 0, 7, -1, 5, var3);
         this.a(var1, ajn.Y, 0, 8, -3, 5, var3);
         this.a(var1, var3, 9, -1, 1, 9, -1, 5, false, var2, n);
         this.a(var1, var3, 8, -3, 8, 10, -1, 10);
         this.a(var1, ajn.aV, 3, 8, -2, 11, var3);
         this.a(var1, ajn.aV, 3, 9, -2, 11, var3);
         this.a(var1, ajn.aV, 3, 10, -2, 11, var3);
         this.a(var1, ajn.at, alv.b(this.a(ajn.at, 2)), 8, -2, 12, var3);
         this.a(var1, ajn.at, alv.b(this.a(ajn.at, 2)), 9, -2, 12, var3);
         this.a(var1, ajn.at, alv.b(this.a(ajn.at, 2)), 10, -2, 12, var3);
         this.a(var1, var3, 8, -3, 8, 8, -3, 10, false, var2, n);
         this.a(var1, var3, 10, -3, 8, 10, -3, 10, false, var2, n);
         this.a(var1, ajn.Y, 0, 10, -2, 9, var3);
         this.a(var1, ajn.af, 0, 8, -2, 9, var3);
         this.a(var1, ajn.af, 0, 8, -2, 10, var3);
         this.a(var1, ajn.af, 0, 10, -1, 9, var3);
         this.a(var1, ajn.F, 1, 9, -2, 8, var3);
         this.a(var1, ajn.F, this.a(ajn.F, 4), 10, -2, 8, var3);
         this.a(var1, ajn.F, this.a(ajn.F, 4), 10, -1, 8, var3);
         this.a(var1, ajn.aR, this.a(ajn.aR, 2), 10, -2, 10, var3);
         if(!this.i) {
            this.i = this.a(var1, var3, var2, 9, -3, 10, qx.a(l, new qx[]{ade.bR.b(var2)}), 2 + var2.nextInt(5));
         }

         return true;
      }
   }

}
