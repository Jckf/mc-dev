import java.util.Random;

public class aij extends ahu {

   private boolean aC;
   private arw aD = new arw();
   private arv aE = new arv(4);


   public aij(int var1, boolean var2) {
      super(var1);
      this.aC = var2;
      if(var2) {
         this.ai = ajn.aE;
      }

      this.at.clear();
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      if(this.aC) {
         int var5;
         int var6;
         int var7;
         for(var5 = 0; var5 < 3; ++var5) {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = var4 + var2.nextInt(16) + 8;
            this.aD.a(var1, var2, var6, var1.f(var6, var7), var7);
         }

         for(var5 = 0; var5 < 2; ++var5) {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = var4 + var2.nextInt(16) + 8;
            this.aE.a(var1, var2, var6, var1.f(var6, var7), var7);
         }
      }

      super.a(var1, var2, var3, var4);
   }

   public arc a(Random var1) {
      return new asn(false);
   }

   protected ahu k() {
      ahu var1 = (new aij(this.ay + 128, true)).a(13828095, true).a(this.af + " Spikes").c().a(0.0F, 0.5F).a(new ahv(this.am + 0.1F, this.an + 0.1F));
      var1.am = this.am + 0.3F;
      var1.an = this.an + 0.4F;
      return var1;
   }
}
