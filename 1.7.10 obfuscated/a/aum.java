import java.util.List;
import java.util.Random;

public class aum extends avc {

   private static final qx[] a = new qx[]{new qx(ade.bi, 0, 1, 1, 10), new qx(ade.i, 0, 1, 3, 3), new qx(ade.j, 0, 1, 5, 10), new qx(ade.k, 0, 1, 3, 5), new qx(ade.ax, 0, 4, 9, 5), new qx(ade.P, 0, 1, 3, 15), new qx(ade.e, 0, 1, 3, 15), new qx(ade.b, 0, 1, 1, 5), new qx(ade.l, 0, 1, 1, 5), new qx(ade.Z, 0, 1, 1, 5), new qx(ade.Y, 0, 1, 1, 5), new qx(ade.aa, 0, 1, 1, 5), new qx(ade.ab, 0, 1, 1, 5), new qx(ade.ao, 0, 1, 1, 1), new qx(ade.av, 0, 1, 1, 1), new qx(ade.bX, 0, 1, 1, 1), new qx(ade.bY, 0, 1, 1, 1), new qx(ade.bZ, 0, 1, 1, 1)};
   private boolean b;


   public aum() {}

   public aum(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Chest", this.b);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.b = var1.n("Chest");
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((auz)var1, var2, var3, 1, 1);
   }

   public static aum a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && avk.a(var0, var7) == null?new aum(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 1, 1, 0);
         this.a(var1, var2, var3, avd.a, 1, 1, 6);
         this.a(var1, var3, 3, 1, 2, 3, 1, 4, ajn.aV, ajn.aV, false);
         this.a(var1, ajn.U, 5, 3, 1, 1, var3);
         this.a(var1, ajn.U, 5, 3, 1, 5, var3);
         this.a(var1, ajn.U, 5, 3, 2, 2, var3);
         this.a(var1, ajn.U, 5, 3, 2, 4, var3);

         int var4;
         for(var4 = 2; var4 <= 4; ++var4) {
            this.a(var1, ajn.U, 5, 2, 1, var4, var3);
         }

         if(!this.b) {
            var4 = this.a(2);
            int var5 = this.a(3, 3);
            int var6 = this.b(3, 3);
            if(var3.b(var5, var4, var6)) {
               this.b = true;
               this.a(var1, var3, var2, 3, 2, 3, qx.a(a, new qx[]{ade.bR.b(var2)}), 2 + var2.nextInt(2));
            }
         }

         return true;
      }
   }

}
