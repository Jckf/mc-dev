import java.util.Random;

public class aic extends ahu {

   public aic(int var1) {
      super(var1);
      this.at.clear();
      this.ai = ajn.m;
      this.ak = ajn.m;
      this.ar.x = -999;
      this.ar.A = 2;
      this.ar.C = 50;
      this.ar.D = 10;
      this.at.clear();
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if(var2.nextInt(1000) == 0) {
         int var5 = var3 + var2.nextInt(16) + 8;
         int var6 = var4 + var2.nextInt(16) + 8;
         arl var7 = new arl();
         var7.a(var1, var2, var5, var1.f(var5, var6) + 1, var6);
      }

   }
}
