import java.util.Random;

public class aid extends ahu {

   private arn aC;
   private asn aD;
   private int aE;
   private int aF;
   private int aG;
   private int aH;


   protected aid(int var1, boolean var2) {
      super(var1);
      this.aC = new ase(ajn.aU, 8);
      this.aD = new asn(false);
      this.aE = 0;
      this.aF = 1;
      this.aG = 2;
      this.aH = this.aE;
      if(var2) {
         this.ar.x = 3;
         this.aH = this.aF;
      }

   }

   public arc a(Random var1) {
      return (arc)(var1.nextInt(3) > 0?this.aD:super.a(var1));
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      int var5 = 3 + var2.nextInt(6);

      int var6;
      int var7;
      int var8;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var3 + var2.nextInt(16);
         var8 = var2.nextInt(28) + 4;
         int var9 = var4 + var2.nextInt(16);
         if(var1.a(var7, var8, var9) == ajn.b) {
            var1.d(var7, var8, var9, ajn.bA, 0, 2);
         }
      }

      for(var5 = 0; var5 < 7; ++var5) {
         var6 = var3 + var2.nextInt(16);
         var7 = var2.nextInt(64);
         var8 = var4 + var2.nextInt(16);
         this.aC.a(var1, var2, var6, var7, var8);
      }

   }

   public void a(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      this.ai = ajn.c;
      this.aj = 0;
      this.ak = ajn.d;
      if((var7 < -1.0D || var7 > 2.0D) && this.aH == this.aG) {
         this.ai = ajn.n;
         this.ak = ajn.n;
      } else if(var7 > 1.0D && this.aH != this.aF) {
         this.ai = ajn.b;
         this.ak = ajn.b;
      }

      this.b(var1, var2, var3, var4, var5, var6, var7);
   }

   private aid b(ahu var1) {
      this.aH = this.aG;
      this.a(var1.ag, true);
      this.a(var1.af + " M");
      this.a(new ahv(var1.am, var1.an));
      this.a(var1.ao, var1.ap);
      return this;
   }

   protected ahu k() {
      return (new aid(this.ay + 128, false)).b(this);
   }
}
