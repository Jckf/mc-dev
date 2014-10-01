import java.util.Random;

public class ait extends ain {

   public ait(int var1, ahu var2) {
      super(var1, var2);
      this.ar.x = 2;
      this.ar.y = 2;
      this.ar.z = 5;
   }

   public void a(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      this.ai = ajn.c;
      this.aj = 0;
      this.ak = ajn.d;
      if(var7 > 1.75D) {
         this.ai = ajn.b;
         this.ak = ajn.b;
      } else if(var7 > -0.5D) {
         this.ai = ajn.d;
         this.aj = 1;
      }

      this.b(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      this.ar.a(var1, var2, this, var3, var4);
   }
}
