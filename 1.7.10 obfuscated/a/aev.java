
public class aev {

   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b;


   public aev() {
      this.b = new Object[][]{{ade.aA, ajn.ab, ade.j, ade.i, ade.k}, {ade.Q, ade.U, ade.Y, ade.ac, ade.ag}, {ade.R, ade.V, ade.Z, ade.ad, ade.ah}, {ade.S, ade.W, ade.aa, ade.ae, ade.ai}, {ade.T, ade.X, ade.ab, ade.af, ade.aj}};
   }

   public void a(afe var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            adb var5 = (adb)this.b[var4 + 1][var2];
            var1.a(new add(var5), new Object[]{this.a[var4], Character.valueOf('X'), var3});
         }
      }

   }
}
