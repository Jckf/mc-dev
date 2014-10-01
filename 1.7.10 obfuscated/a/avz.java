import java.util.List;
import java.util.Random;

public class avz extends awd {

   private static final qx[] a = new qx[]{new qx(ade.i, 0, 1, 3, 3), new qx(ade.j, 0, 1, 5, 10), new qx(ade.k, 0, 1, 3, 5), new qx(ade.P, 0, 1, 3, 15), new qx(ade.e, 0, 1, 3, 15), new qx(ade.b, 0, 1, 1, 5), new qx(ade.l, 0, 1, 1, 5), new qx(ade.Z, 0, 1, 1, 5), new qx(ade.Y, 0, 1, 1, 5), new qx(ade.aa, 0, 1, 1, 5), new qx(ade.ab, 0, 1, 1, 5), new qx(adb.a(ajn.Z), 0, 3, 7, 5), new qx(adb.a(ajn.g), 0, 3, 7, 5), new qx(ade.av, 0, 1, 1, 3), new qx(ade.bX, 0, 1, 1, 1), new qx(ade.bY, 0, 1, 1, 1), new qx(ade.bZ, 0, 1, 1, 1)};
   private boolean b;


   public avz() {}

   public avz(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
   }

   public static avz a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 10, 6, 7, var6);
      return a(var8) && avk.a(var1, var8) == null?new avz(var0, var7, var2, var8, var6):null;
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Chest", this.b);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.b = var1.n("Chest");
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 9, 4, 6, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 0, 0, 9, 0, 6, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 4, 0, 9, 4, 6, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 5, 0, 9, 5, 6, ajn.U, ajn.U, false);
      this.a(var1, var3, 1, 5, 1, 8, 5, 5, ajn.a, ajn.a, false);
      this.a(var1, var3, 1, 1, 0, 2, 3, 0, ajn.f, ajn.f, false);
      this.a(var1, var3, 0, 1, 0, 0, 4, 0, ajn.r, ajn.r, false);
      this.a(var1, var3, 3, 1, 0, 3, 4, 0, ajn.r, ajn.r, false);
      this.a(var1, var3, 0, 1, 6, 0, 4, 6, ajn.r, ajn.r, false);
      this.a(var1, ajn.f, 0, 3, 3, 1, var3);
      this.a(var1, var3, 3, 1, 2, 3, 3, 2, ajn.f, ajn.f, false);
      this.a(var1, var3, 4, 1, 3, 5, 3, 3, ajn.f, ajn.f, false);
      this.a(var1, var3, 0, 1, 1, 0, 3, 5, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 1, 6, 5, 3, 6, ajn.f, ajn.f, false);
      this.a(var1, var3, 5, 1, 0, 5, 3, 0, ajn.aJ, ajn.aJ, false);
      this.a(var1, var3, 9, 1, 0, 9, 3, 0, ajn.aJ, ajn.aJ, false);
      this.a(var1, var3, 6, 1, 4, 9, 4, 6, ajn.e, ajn.e, false);
      this.a(var1, ajn.k, 0, 7, 1, 5, var3);
      this.a(var1, ajn.k, 0, 8, 1, 5, var3);
      this.a(var1, ajn.aY, 0, 9, 2, 5, var3);
      this.a(var1, ajn.aY, 0, 9, 2, 4, var3);
      this.a(var1, var3, 7, 2, 4, 8, 2, 5, ajn.a, ajn.a, false);
      this.a(var1, ajn.e, 0, 6, 1, 3, var3);
      this.a(var1, ajn.al, 0, 6, 2, 3, var3);
      this.a(var1, ajn.al, 0, 6, 3, 3, var3);
      this.a(var1, ajn.T, 0, 8, 1, 1, var3);
      this.a(var1, ajn.aZ, 0, 0, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 0, 2, 4, var3);
      this.a(var1, ajn.aZ, 0, 2, 2, 6, var3);
      this.a(var1, ajn.aZ, 0, 4, 2, 6, var3);
      this.a(var1, ajn.aJ, 0, 2, 1, 4, var3);
      this.a(var1, ajn.aw, 0, 2, 2, 4, var3);
      this.a(var1, ajn.f, 0, 1, 1, 5, var3);
      this.a(var1, ajn.ad, this.a(ajn.ad, 3), 2, 1, 5, var3);
      this.a(var1, ajn.ad, this.a(ajn.ad, 1), 1, 1, 4, var3);
      int var4;
      int var5;
      if(!this.b) {
         var4 = this.a(1);
         var5 = this.a(5, 5);
         int var6 = this.b(5, 5);
         if(var3.b(var5, var4, var6)) {
            this.b = true;
            this.a(var1, var3, var2, 5, 1, 5, a, 3 + var2.nextInt(6));
         }
      }

      for(var4 = 6; var4 <= 8; ++var4) {
         if(this.a(var1, var4, 0, -1, var3).o() == awt.a && this.a(var1, var4, -1, -1, var3).o() != awt.a) {
            this.a(var1, ajn.ar, this.a(ajn.ar, 3), var4, 0, -1, var3);
         }
      }

      for(var4 = 0; var4 < 7; ++var4) {
         for(var5 = 0; var5 < 10; ++var5) {
            this.b(var1, var5, 6, var4, var3);
            this.b(var1, ajn.e, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 7, 1, 1, 1);
      return true;
   }

   protected int b(int var1) {
      return 3;
   }

}
