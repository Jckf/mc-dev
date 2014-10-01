import java.util.Random;

public class aub extends aue {

   private boolean[] e = new boolean[4];
   private static final qx[] i = new qx[]{new qx(ade.i, 0, 1, 3, 3), new qx(ade.j, 0, 1, 5, 10), new qx(ade.k, 0, 2, 7, 15), new qx(ade.bC, 0, 1, 3, 2), new qx(ade.aS, 0, 4, 6, 20), new qx(ade.bh, 0, 3, 7, 16), new qx(ade.av, 0, 1, 1, 3), new qx(ade.bX, 0, 1, 1, 1), new qx(ade.bY, 0, 1, 1, 1), new qx(ade.bZ, 0, 1, 1, 1)};


   public aub() {}

   public aub(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 21, 15, 21);
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("hasPlacedChest0", this.e[0]);
      var1.a("hasPlacedChest1", this.e[1]);
      var1.a("hasPlacedChest2", this.e[2]);
      var1.a("hasPlacedChest3", this.e[3]);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.e[0] = var1.n("hasPlacedChest0");
      this.e[1] = var1.n("hasPlacedChest1");
      this.e[2] = var1.n("hasPlacedChest2");
      this.e[3] = var1.n("hasPlacedChest3");
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, -4, 0, this.a - 1, 0, this.c - 1, ajn.A, ajn.A, false);

      int var4;
      for(var4 = 1; var4 <= 9; ++var4) {
         this.a(var1, var3, var4, var4, var4, this.a - 1 - var4, var4, this.c - 1 - var4, ajn.A, ajn.A, false);
         this.a(var1, var3, var4 + 1, var4, var4 + 1, this.a - 2 - var4, var4, this.c - 2 - var4, ajn.a, ajn.a, false);
      }

      int var5;
      for(var4 = 0; var4 < this.a; ++var4) {
         for(var5 = 0; var5 < this.c; ++var5) {
            byte var6 = -5;
            this.b(var1, ajn.A, 0, var4, var6, var5, var3);
         }
      }

      var4 = this.a(ajn.bz, 3);
      var5 = this.a(ajn.bz, 2);
      int var13 = this.a(ajn.bz, 0);
      int var7 = this.a(ajn.bz, 1);
      byte var8 = 1;
      byte var9 = 11;
      this.a(var1, var3, 0, 0, 0, 4, 9, 4, ajn.A, ajn.a, false);
      this.a(var1, var3, 1, 10, 1, 3, 10, 3, ajn.A, ajn.A, false);
      this.a(var1, ajn.bz, var4, 2, 10, 0, var3);
      this.a(var1, ajn.bz, var5, 2, 10, 4, var3);
      this.a(var1, ajn.bz, var13, 0, 10, 2, var3);
      this.a(var1, ajn.bz, var7, 4, 10, 2, var3);
      this.a(var1, var3, this.a - 5, 0, 0, this.a - 1, 9, 4, ajn.A, ajn.a, false);
      this.a(var1, var3, this.a - 4, 10, 1, this.a - 2, 10, 3, ajn.A, ajn.A, false);
      this.a(var1, ajn.bz, var4, this.a - 3, 10, 0, var3);
      this.a(var1, ajn.bz, var5, this.a - 3, 10, 4, var3);
      this.a(var1, ajn.bz, var13, this.a - 5, 10, 2, var3);
      this.a(var1, ajn.bz, var7, this.a - 1, 10, 2, var3);
      this.a(var1, var3, 8, 0, 0, 12, 4, 4, ajn.A, ajn.a, false);
      this.a(var1, var3, 9, 1, 0, 11, 3, 4, ajn.a, ajn.a, false);
      this.a(var1, ajn.A, 2, 9, 1, 1, var3);
      this.a(var1, ajn.A, 2, 9, 2, 1, var3);
      this.a(var1, ajn.A, 2, 9, 3, 1, var3);
      this.a(var1, ajn.A, 2, 10, 3, 1, var3);
      this.a(var1, ajn.A, 2, 11, 3, 1, var3);
      this.a(var1, ajn.A, 2, 11, 2, 1, var3);
      this.a(var1, ajn.A, 2, 11, 1, 1, var3);
      this.a(var1, var3, 4, 1, 1, 8, 3, 3, ajn.A, ajn.a, false);
      this.a(var1, var3, 4, 1, 2, 8, 2, 2, ajn.a, ajn.a, false);
      this.a(var1, var3, 12, 1, 1, 16, 3, 3, ajn.A, ajn.a, false);
      this.a(var1, var3, 12, 1, 2, 16, 2, 2, ajn.a, ajn.a, false);
      this.a(var1, var3, 5, 4, 5, this.a - 6, 4, this.c - 6, ajn.A, ajn.A, false);
      this.a(var1, var3, 9, 4, 9, 11, 4, 11, ajn.a, ajn.a, false);
      this.a(var1, var3, 8, 1, 8, 8, 3, 8, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, var3, 12, 1, 8, 12, 3, 8, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, var3, 8, 1, 12, 8, 3, 12, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, var3, 12, 1, 12, 12, 3, 12, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, var3, 1, 1, 5, 4, 4, 11, ajn.A, ajn.A, false);
      this.a(var1, var3, this.a - 5, 1, 5, this.a - 2, 4, 11, ajn.A, ajn.A, false);
      this.a(var1, var3, 6, 7, 9, 6, 7, 11, ajn.A, ajn.A, false);
      this.a(var1, var3, this.a - 7, 7, 9, this.a - 7, 7, 11, ajn.A, ajn.A, false);
      this.a(var1, var3, 5, 5, 9, 5, 7, 11, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, var3, this.a - 6, 5, 9, this.a - 6, 7, 11, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, ajn.a, 0, 5, 5, 10, var3);
      this.a(var1, ajn.a, 0, 5, 6, 10, var3);
      this.a(var1, ajn.a, 0, 6, 6, 10, var3);
      this.a(var1, ajn.a, 0, this.a - 6, 5, 10, var3);
      this.a(var1, ajn.a, 0, this.a - 6, 6, 10, var3);
      this.a(var1, ajn.a, 0, this.a - 7, 6, 10, var3);
      this.a(var1, var3, 2, 4, 4, 2, 6, 4, ajn.a, ajn.a, false);
      this.a(var1, var3, this.a - 3, 4, 4, this.a - 3, 6, 4, ajn.a, ajn.a, false);
      this.a(var1, ajn.bz, var4, 2, 4, 5, var3);
      this.a(var1, ajn.bz, var4, 2, 3, 4, var3);
      this.a(var1, ajn.bz, var4, this.a - 3, 4, 5, var3);
      this.a(var1, ajn.bz, var4, this.a - 3, 3, 4, var3);
      this.a(var1, var3, 1, 1, 3, 2, 2, 3, ajn.A, ajn.A, false);
      this.a(var1, var3, this.a - 3, 1, 3, this.a - 2, 2, 3, ajn.A, ajn.A, false);
      this.a(var1, ajn.bz, 0, 1, 1, 2, var3);
      this.a(var1, ajn.bz, 0, this.a - 2, 1, 2, var3);
      this.a(var1, ajn.U, 1, 1, 2, 2, var3);
      this.a(var1, ajn.U, 1, this.a - 2, 2, 2, var3);
      this.a(var1, ajn.bz, var7, 2, 1, 2, var3);
      this.a(var1, ajn.bz, var13, this.a - 3, 1, 2, var3);
      this.a(var1, var3, 4, 3, 5, 4, 3, 18, ajn.A, ajn.A, false);
      this.a(var1, var3, this.a - 5, 3, 5, this.a - 5, 3, 17, ajn.A, ajn.A, false);
      this.a(var1, var3, 3, 1, 5, 4, 2, 16, ajn.a, ajn.a, false);
      this.a(var1, var3, this.a - 6, 1, 5, this.a - 5, 2, 16, ajn.a, ajn.a, false);

      int var10;
      for(var10 = 5; var10 <= 17; var10 += 2) {
         this.a(var1, ajn.A, 2, 4, 1, var10, var3);
         this.a(var1, ajn.A, 1, 4, 2, var10, var3);
         this.a(var1, ajn.A, 2, this.a - 5, 1, var10, var3);
         this.a(var1, ajn.A, 1, this.a - 5, 2, var10, var3);
      }

      this.a(var1, ajn.L, var8, 10, 0, 7, var3);
      this.a(var1, ajn.L, var8, 10, 0, 8, var3);
      this.a(var1, ajn.L, var8, 9, 0, 9, var3);
      this.a(var1, ajn.L, var8, 11, 0, 9, var3);
      this.a(var1, ajn.L, var8, 8, 0, 10, var3);
      this.a(var1, ajn.L, var8, 12, 0, 10, var3);
      this.a(var1, ajn.L, var8, 7, 0, 10, var3);
      this.a(var1, ajn.L, var8, 13, 0, 10, var3);
      this.a(var1, ajn.L, var8, 9, 0, 11, var3);
      this.a(var1, ajn.L, var8, 11, 0, 11, var3);
      this.a(var1, ajn.L, var8, 10, 0, 12, var3);
      this.a(var1, ajn.L, var8, 10, 0, 13, var3);
      this.a(var1, ajn.L, var9, 10, 0, 10, var3);

      for(var10 = 0; var10 <= this.a - 1; var10 += this.a - 1) {
         this.a(var1, ajn.A, 2, var10, 2, 1, var3);
         this.a(var1, ajn.L, var8, var10, 2, 2, var3);
         this.a(var1, ajn.A, 2, var10, 2, 3, var3);
         this.a(var1, ajn.A, 2, var10, 3, 1, var3);
         this.a(var1, ajn.L, var8, var10, 3, 2, var3);
         this.a(var1, ajn.A, 2, var10, 3, 3, var3);
         this.a(var1, ajn.L, var8, var10, 4, 1, var3);
         this.a(var1, ajn.A, 1, var10, 4, 2, var3);
         this.a(var1, ajn.L, var8, var10, 4, 3, var3);
         this.a(var1, ajn.A, 2, var10, 5, 1, var3);
         this.a(var1, ajn.L, var8, var10, 5, 2, var3);
         this.a(var1, ajn.A, 2, var10, 5, 3, var3);
         this.a(var1, ajn.L, var8, var10, 6, 1, var3);
         this.a(var1, ajn.A, 1, var10, 6, 2, var3);
         this.a(var1, ajn.L, var8, var10, 6, 3, var3);
         this.a(var1, ajn.L, var8, var10, 7, 1, var3);
         this.a(var1, ajn.L, var8, var10, 7, 2, var3);
         this.a(var1, ajn.L, var8, var10, 7, 3, var3);
         this.a(var1, ajn.A, 2, var10, 8, 1, var3);
         this.a(var1, ajn.A, 2, var10, 8, 2, var3);
         this.a(var1, ajn.A, 2, var10, 8, 3, var3);
      }

      for(var10 = 2; var10 <= this.a - 3; var10 += this.a - 3 - 2) {
         this.a(var1, ajn.A, 2, var10 - 1, 2, 0, var3);
         this.a(var1, ajn.L, var8, var10, 2, 0, var3);
         this.a(var1, ajn.A, 2, var10 + 1, 2, 0, var3);
         this.a(var1, ajn.A, 2, var10 - 1, 3, 0, var3);
         this.a(var1, ajn.L, var8, var10, 3, 0, var3);
         this.a(var1, ajn.A, 2, var10 + 1, 3, 0, var3);
         this.a(var1, ajn.L, var8, var10 - 1, 4, 0, var3);
         this.a(var1, ajn.A, 1, var10, 4, 0, var3);
         this.a(var1, ajn.L, var8, var10 + 1, 4, 0, var3);
         this.a(var1, ajn.A, 2, var10 - 1, 5, 0, var3);
         this.a(var1, ajn.L, var8, var10, 5, 0, var3);
         this.a(var1, ajn.A, 2, var10 + 1, 5, 0, var3);
         this.a(var1, ajn.L, var8, var10 - 1, 6, 0, var3);
         this.a(var1, ajn.A, 1, var10, 6, 0, var3);
         this.a(var1, ajn.L, var8, var10 + 1, 6, 0, var3);
         this.a(var1, ajn.L, var8, var10 - 1, 7, 0, var3);
         this.a(var1, ajn.L, var8, var10, 7, 0, var3);
         this.a(var1, ajn.L, var8, var10 + 1, 7, 0, var3);
         this.a(var1, ajn.A, 2, var10 - 1, 8, 0, var3);
         this.a(var1, ajn.A, 2, var10, 8, 0, var3);
         this.a(var1, ajn.A, 2, var10 + 1, 8, 0, var3);
      }

      this.a(var1, var3, 8, 4, 0, 12, 6, 0, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, ajn.a, 0, 8, 6, 0, var3);
      this.a(var1, ajn.a, 0, 12, 6, 0, var3);
      this.a(var1, ajn.L, var8, 9, 5, 0, var3);
      this.a(var1, ajn.A, 1, 10, 5, 0, var3);
      this.a(var1, ajn.L, var8, 11, 5, 0, var3);
      this.a(var1, var3, 8, -14, 8, 12, -11, 12, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, var3, 8, -10, 8, 12, -10, 12, ajn.A, 1, ajn.A, 1, false);
      this.a(var1, var3, 8, -9, 8, 12, -9, 12, ajn.A, 2, ajn.A, 2, false);
      this.a(var1, var3, 8, -8, 8, 12, -1, 12, ajn.A, ajn.A, false);
      this.a(var1, var3, 9, -11, 9, 11, -1, 11, ajn.a, ajn.a, false);
      this.a(var1, ajn.au, 0, 10, -11, 10, var3);
      this.a(var1, var3, 9, -13, 9, 11, -13, 11, ajn.W, ajn.a, false);
      this.a(var1, ajn.a, 0, 8, -11, 10, var3);
      this.a(var1, ajn.a, 0, 8, -10, 10, var3);
      this.a(var1, ajn.A, 1, 7, -10, 10, var3);
      this.a(var1, ajn.A, 2, 7, -11, 10, var3);
      this.a(var1, ajn.a, 0, 12, -11, 10, var3);
      this.a(var1, ajn.a, 0, 12, -10, 10, var3);
      this.a(var1, ajn.A, 1, 13, -10, 10, var3);
      this.a(var1, ajn.A, 2, 13, -11, 10, var3);
      this.a(var1, ajn.a, 0, 10, -11, 8, var3);
      this.a(var1, ajn.a, 0, 10, -10, 8, var3);
      this.a(var1, ajn.A, 1, 10, -10, 7, var3);
      this.a(var1, ajn.A, 2, 10, -11, 7, var3);
      this.a(var1, ajn.a, 0, 10, -11, 12, var3);
      this.a(var1, ajn.a, 0, 10, -10, 12, var3);
      this.a(var1, ajn.A, 1, 10, -10, 13, var3);
      this.a(var1, ajn.A, 2, 10, -11, 13, var3);

      for(var10 = 0; var10 < 4; ++var10) {
         if(!this.e[var10]) {
            int var11 = p.a[var10] * 2;
            int var12 = p.b[var10] * 2;
            this.e[var10] = this.a(var1, var3, var2, 10 + var11, -11, 10 + var12, qx.a(i, new qx[]{ade.bR.b(var2)}), 2 + var2.nextInt(5));
         }
      }

      return true;
   }

}
