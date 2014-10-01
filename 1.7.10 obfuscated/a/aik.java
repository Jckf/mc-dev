import java.util.Random;

public class aik extends ahu {

   private boolean aC;


   public aik(int var1, boolean var2) {
      super(var1);
      this.aC = var2;
      if(var2) {
         this.ar.x = 2;
      } else {
         this.ar.x = 50;
      }

      this.ar.z = 25;
      this.ar.y = 4;
      if(!var2) {
         this.as.add(new ahx(wn.class, 2, 1, 1));
      }

      this.at.add(new ahx(wg.class, 10, 4, 4));
   }

   public arc a(Random var1) {
      return (arc)(var1.nextInt(10) == 0?this.aA:(var1.nextInt(2) == 0?new arp(3, 0):(!this.aC && var1.nextInt(3) == 0?new arz(false, 10, 20, 3, 3):new asq(false, 4 + var1.nextInt(7), 3, 3, true))));
   }

   public arn b(Random var1) {
      return var1.nextInt(4) == 0?new asp(ajn.H, 2):new asp(ajn.H, 1);
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      int var5 = var3 + var2.nextInt(16) + 8;
      int var6 = var4 + var2.nextInt(16) + 8;
      int var7 = var2.nextInt(var1.f(var5, var6) * 2);
      (new asc()).a(var1, var2, var5, var7, var6);
      asr var10 = new asr();

      for(var6 = 0; var6 < 50; ++var6) {
         var7 = var3 + var2.nextInt(16) + 8;
         short var8 = 128;
         int var9 = var4 + var2.nextInt(16) + 8;
         var10.a(var1, var2, var7, var8, var9);
      }

   }
}
