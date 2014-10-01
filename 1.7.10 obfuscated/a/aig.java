import java.util.Random;

class aig extends ain {

   // $FF: synthetic field
   final aif aC;


   aig(aif var1, int var2, ahu var3) {
      super(var2, var3);
      this.aC = var1;
   }

   public arc a(Random var1) {
      return var1.nextBoolean()?aif.aC:aif.aD;
   }
}
