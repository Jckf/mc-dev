import java.util.Random;

public class ais extends ahu {

   private static final ask aC = new ask(false);


   protected ais(int var1) {
      super(var1);
      this.at.add(new ahx(wi.class, 1, 2, 6));
      this.ar.x = 1;
      this.ar.y = 4;
      this.ar.z = 20;
   }

   public arc a(Random var1) {
      return (arc)(var1.nextInt(5) > 0?aC:this.az);
   }

   protected ahu k() {
      ait var1 = new ait(this.ay + 128, this);
      var1.ao = (this.ao + 1.0F) * 0.5F;
      var1.am = this.am * 0.5F + 0.3F;
      var1.an = this.an * 0.5F + 1.2F;
      return var1;
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      ae.a(2);

      for(int var5 = 0; var5 < 7; ++var5) {
         int var6 = var3 + var2.nextInt(16) + 8;
         int var7 = var4 + var2.nextInt(16) + 8;
         int var8 = var2.nextInt(var1.f(var6, var7) + 32);
         ae.a(var1, var2, var6, var8, var7);
      }

      super.a(var1, var2, var3, var4);
   }

}
