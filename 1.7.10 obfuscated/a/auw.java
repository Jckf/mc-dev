import java.util.Random;

class auw extends avl {

   private auw() {}

   public void a(Random var1, int var2, int var3, int var4, boolean var5) {
      if(var5) {
         this.a = ajn.aV;
         float var6 = var1.nextFloat();
         if(var6 < 0.2F) {
            this.b = 2;
         } else if(var6 < 0.5F) {
            this.b = 1;
         } else if(var6 < 0.55F) {
            this.a = ajn.aU;
            this.b = 2;
         } else {
            this.b = 0;
         }
      } else {
         this.a = ajn.a;
         this.b = 0;
      }

   }

   // $FF: synthetic method
   auw(auj var1) {
      this();
   }
}
