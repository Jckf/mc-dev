import java.util.Random;

public class aip extends ahu {

   protected boolean aC;


   protected aip(int var1) {
      super(var1);
      this.a(0.8F, 0.4F);
      this.a(e);
      this.at.add(new ahx(wi.class, 5, 2, 6));
      this.ar.x = -999;
      this.ar.y = 4;
      this.ar.z = 10;
   }

   public String a(Random var1, int var2, int var3, int var4) {
      double var5 = ad.a((double)var2 / 200.0D, (double)var4 / 200.0D);
      int var7;
      if(var5 < -0.8D) {
         var7 = var1.nextInt(4);
         return alc.a[4 + var7];
      } else if(var1.nextInt(3) > 0) {
         var7 = var1.nextInt(3);
         return var7 == 0?alc.a[0]:(var7 == 1?alc.a[3]:alc.a[8]);
      } else {
         return alc.b[0];
      }
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      double var5 = ad.a((double)(var3 + 8) / 200.0D, (double)(var4 + 8) / 200.0D);
      int var7;
      int var8;
      int var9;
      int var10;
      if(var5 < -0.8D) {
         this.ar.y = 15;
         this.ar.z = 5;
      } else {
         this.ar.y = 4;
         this.ar.z = 10;
         ae.a(2);

         for(var7 = 0; var7 < 7; ++var7) {
            var8 = var3 + var2.nextInt(16) + 8;
            var9 = var4 + var2.nextInt(16) + 8;
            var10 = var2.nextInt(var1.f(var8, var9) + 32);
            ae.a(var1, var2, var8, var10, var9);
         }
      }

      if(this.aC) {
         ae.a(0);

         for(var7 = 0; var7 < 10; ++var7) {
            var8 = var3 + var2.nextInt(16) + 8;
            var9 = var4 + var2.nextInt(16) + 8;
            var10 = var2.nextInt(var1.f(var8, var9) + 32);
            ae.a(var1, var2, var8, var10, var9);
         }
      }

      super.a(var1, var2, var3, var4);
   }

   protected ahu k() {
      aip var1 = new aip(this.ay + 128);
      var1.a("Sunflower Plains");
      var1.aC = true;
      var1.b(9286496);
      var1.ah = 14273354;
      return var1;
   }
}
