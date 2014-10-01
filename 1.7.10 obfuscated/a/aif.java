import java.util.Random;

public class aif extends ahu {

   private int aF;
   protected static final are aC = new are(false, true);
   protected static final are aD = new are(false, false);
   protected static final asi aE = new asi(false);


   public aif(int var1, int var2) {
      super(var1);
      this.aF = var2;
      this.ar.x = 10;
      this.ar.z = 2;
      if(this.aF == 1) {
         this.ar.x = 6;
         this.ar.y = 100;
         this.ar.z = 1;
      }

      this.a(5159473);
      this.a(0.7F, 0.8F);
      if(this.aF == 2) {
         this.ah = 353825;
         this.ag = 3175492;
         this.a(0.6F, 0.6F);
      }

      if(this.aF == 0) {
         this.at.add(new ahx(wv.class, 5, 4, 4));
      }

      if(this.aF == 3) {
         this.ar.x = -999;
      }

   }

   protected ahu a(int var1, boolean var2) {
      if(this.aF == 2) {
         this.ah = 353825;
         this.ag = var1;
         if(var2) {
            this.ah = (this.ah & 16711422) >> 1;
         }

         return this;
      } else {
         return super.a(var1, var2);
      }
   }

   public arc a(Random var1) {
      return (arc)(this.aF == 3 && var1.nextInt(3) > 0?aE:(this.aF != 2 && var1.nextInt(5) != 0?this.az:aD));
   }

   public String a(Random var1, int var2, int var3, int var4) {
      if(this.aF == 1) {
         double var5 = qh.a((1.0D + ad.a((double)var2 / 48.0D, (double)var4 / 48.0D)) / 2.0D, 0.0D, 0.9999D);
         int var7 = (int)(var5 * (double)alc.a.length);
         if(var7 == 1) {
            var7 = 0;
         }

         return alc.a[var7];
      } else {
         return super.a(var1, var2, var3, var4);
      }
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if(this.aF == 3) {
         for(var5 = 0; var5 < 4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               var7 = var3 + var5 * 4 + 1 + 8 + var2.nextInt(3);
               var8 = var4 + var6 * 4 + 1 + 8 + var2.nextInt(3);
               var9 = var1.f(var7, var8);
               if(var2.nextInt(20) == 0) {
                  aru var10 = new aru();
                  var10.a(var1, var2, var7, var9, var8);
               } else {
                  arc var12 = this.a(var2);
                  var12.a(1.0D, 1.0D, 1.0D);
                  if(var12.a(var1, var2, var7, var9, var8)) {
                     var12.b(var1, var2, var7, var9, var8);
                  }
               }
            }
         }
      }

      var5 = var2.nextInt(5) - 3;
      if(this.aF == 1) {
         var5 += 2;
      }

      var6 = 0;

      while(var6 < var5) {
         var7 = var2.nextInt(3);
         if(var7 == 0) {
            ae.a(1);
         } else if(var7 == 1) {
            ae.a(4);
         } else if(var7 == 2) {
            ae.a(5);
         }

         var8 = 0;

         while(true) {
            if(var8 < 5) {
               var9 = var3 + var2.nextInt(16) + 8;
               int var13 = var4 + var2.nextInt(16) + 8;
               int var11 = var2.nextInt(var1.f(var9, var13) + 32);
               if(!ae.a(var1, var2, var9, var11, var13)) {
                  ++var8;
                  continue;
               }
            }

            ++var6;
            break;
         }
      }

      super.a(var1, var2, var3, var4);
   }

   protected ahu k() {
      if(this.ay == ahu.s.ay) {
         aif var1 = new aif(this.ay + 128, 1);
         var1.a(new ahv(this.am, this.an + 0.2F));
         var1.a("Flower Forest");
         var1.a(6976549, true);
         var1.a(8233509);
         return var1;
      } else {
         return (ahu)(this.ay != ahu.P.ay && this.ay != ahu.Q.ay?new aih(this, this.ay + 128, this):new aig(this, this.ay + 128, this));
      }
   }

}
