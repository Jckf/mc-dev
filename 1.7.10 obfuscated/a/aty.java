import java.util.Random;

public class aty extends avm {

   public aty() {}

   public aty(ahb var1, Random var2, int var3, int var4) {
      super(var3, var4);
      ahu var5 = var1.a(var3 * 16 + 8, var4 * 16 + 8);
      if(var5 != ahu.J && var5 != ahu.K) {
         if(var5 == ahu.u) {
            auf var7 = new auf(var2, var3 * 16, var4 * 16);
            this.a.add(var7);
         } else {
            aub var8 = new aub(var2, var3 * 16, var4 * 16);
            this.a.add(var8);
         }
      } else {
         auc var6 = new auc(var2, var3 * 16, var4 * 16);
         this.a.add(var6);
      }

      this.c();
   }
}
