import java.util.Random;

public class aiw extends ahu {

   private static final asf aC = new asf();
   private static final asn aD = new asn(false);
   private static final asa aE = new asa(false, false);
   private static final asa aF = new asa(false, true);
   private static final arf aG = new arf(ajn.Y, 0);
   private int aH;


   public aiw(int var1, int var2) {
      super(var1);
      this.aH = var2;
      this.at.add(new ahx(wv.class, 8, 4, 4));
      this.ar.x = 10;
      if(var2 != 1 && var2 != 2) {
         this.ar.z = 1;
         this.ar.B = 1;
      } else {
         this.ar.z = 7;
         this.ar.A = 1;
         this.ar.B = 3;
      }

   }

   public arc a(Random var1) {
      return (arc)((this.aH == 1 || this.aH == 2) && var1.nextInt(3) == 0?(this.aH != 2 && var1.nextInt(13) != 0?aE:aF):(var1.nextInt(3) == 0?aC:aD));
   }

   public arn b(Random var1) {
      return var1.nextInt(5) > 0?new asp(ajn.H, 2):new asp(ajn.H, 1);
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      int var5;
      int var6;
      int var7;
      int var8;
      if(this.aH == 1 || this.aH == 2) {
         var5 = var2.nextInt(3);

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = var3 + var2.nextInt(16) + 8;
            var8 = var4 + var2.nextInt(16) + 8;
            int var9 = var1.f(var7, var8);
            aG.a(var1, var2, var7, var9, var8);
         }
      }

      ae.a(3);

      for(var5 = 0; var5 < 7; ++var5) {
         var6 = var3 + var2.nextInt(16) + 8;
         var7 = var4 + var2.nextInt(16) + 8;
         var8 = var2.nextInt(var1.f(var6, var7) + 32);
         ae.a(var1, var2, var6, var8, var7);
      }

      super.a(var1, var2, var3, var4);
   }

   public void a(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      if(this.aH == 1 || this.aH == 2) {
         this.ai = ajn.c;
         this.aj = 0;
         this.ak = ajn.d;
         if(var7 > 1.75D) {
            this.ai = ajn.d;
            this.aj = 1;
         } else if(var7 > -0.95D) {
            this.ai = ajn.d;
            this.aj = 2;
         }
      }

      this.b(var1, var2, var3, var4, var5, var6, var7);
   }

   protected ahu k() {
      return this.ay == ahu.U.ay?(new aiw(this.ay + 128, 2)).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25F, 0.8F).a(new ahv(this.am, this.an)):super.k();
   }

}
