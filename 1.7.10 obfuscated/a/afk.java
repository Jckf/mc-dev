
public class afk {

   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b;


   public afk() {
      this.b = new Object[][]{{ajn.f, ajn.e, ade.j, ade.i, ade.k}, {ade.o, ade.s, ade.b, ade.w, ade.D}, {ade.n, ade.r, ade.a, ade.v, ade.C}, {ade.p, ade.t, ade.c, ade.x, ade.E}, {ade.I, ade.J, ade.K, ade.L, ade.M}};
   }

   public void a(afe var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            adb var5 = (adb)this.b[var4 + 1][var2];
            var1.a(new add(var5), new Object[]{this.a[var4], Character.valueOf('#'), ade.y, Character.valueOf('X'), var3});
         }
      }

      var1.a(new add(ade.aZ), new Object[]{" #", "# ", Character.valueOf('#'), ade.j});
   }
}
