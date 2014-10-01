import java.util.Random;

public class aiv extends ahu {

   protected aiv(int var1) {
      super(var1);
      this.ar.x = 2;
      this.ar.y = 1;
      this.ar.A = 1;
      this.ar.B = 8;
      this.ar.C = 10;
      this.ar.G = 1;
      this.ar.w = 4;
      this.ar.F = 0;
      this.ar.E = 0;
      this.ar.z = 5;
      this.aq = 14745518;
      this.as.add(new ahx(ym.class, 1, 1, 1));
   }

   public arc a(Random var1) {
      return this.aB;
   }

   public String a(Random var1, int var2, int var3, int var4) {
      return alc.a[1];
   }

   public void a(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      double var9 = ad.a((double)var5 * 0.25D, (double)var6 * 0.25D);
      if(var9 > 0.0D) {
         int var11 = var5 & 15;
         int var12 = var6 & 15;
         int var13 = var3.length / 256;

         for(int var14 = 255; var14 >= 0; --var14) {
            int var15 = (var12 * 16 + var11) * var13 + var14;
            if(var3[var15] == null || var3[var15].o() != awt.a) {
               if(var14 == 62 && var3[var15] != ajn.j) {
                  var3[var15] = ajn.j;
                  if(var9 < 0.12D) {
                     var3[var15 + 1] = ajn.bi;
                  }
               }
               break;
            }
         }
      }

      this.b(var1, var2, var3, var4, var5, var6, var7);
   }
}
