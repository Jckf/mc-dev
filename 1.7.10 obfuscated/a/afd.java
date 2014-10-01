
public class afd {

   private Object[][] a;


   public afd() {
      this.a = new Object[][]{{ajn.R, new add(ade.k, 9)}, {ajn.S, new add(ade.j, 9)}, {ajn.ah, new add(ade.i, 9)}, {ajn.bE, new add(ade.bC, 9)}, {ajn.y, new add(ade.aR, 9, 4)}, {ajn.bX, new add(ade.ax, 9)}, {ajn.ci, new add(ade.h, 9, 0)}, {ajn.cf, new add(ade.O, 9)}};
   }

   public void a(afe var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         aji var3 = (aji)this.a[var2][0];
         add var4 = (add)this.a[var2][1];
         var1.a(new add(var3), new Object[]{"###", "###", "###", Character.valueOf('#'), var4});
         var1.a(var4, new Object[]{"#", Character.valueOf('#'), var3});
      }

      var1.a(new add(ade.k), new Object[]{"###", "###", "###", Character.valueOf('#'), ade.bl});
      var1.a(new add(ade.bl, 9), new Object[]{"#", Character.valueOf('#'), ade.k});
   }
}
