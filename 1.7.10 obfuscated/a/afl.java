
public class afl {

   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b;


   public afl() {
      this.b = new Object[][]{{ajn.f, ajn.e, ade.j, ade.i, ade.k}, {ade.m, ade.q, ade.l, ade.u, ade.B}};
   }

   public void a(afe var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            adb var5 = (adb)this.b[var4 + 1][var2];
            var1.a(new add(var5), new Object[]{this.a[var4], Character.valueOf('#'), ade.y, Character.valueOf('X'), var3});
         }
      }

      var1.a(new add(ade.f, 1), new Object[]{" #X", "# X", " #X", Character.valueOf('X'), ade.F, Character.valueOf('#'), ade.y});
      var1.a(new add(ade.g, 4), new Object[]{"X", "#", "Y", Character.valueOf('Y'), ade.G, Character.valueOf('X'), ade.ak, Character.valueOf('#'), ade.y});
   }
}
