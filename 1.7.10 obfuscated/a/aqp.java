
public class aqp extends aqo {

   public void b() {
      this.e = new aie(ahu.w, 0.0F);
      this.f = true;
      this.g = true;
      this.i = -1;
   }

   protected void a() {
      float var1 = 0.1F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.h[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   public apu c() {
      return new aqv(this.b, this.b.H());
   }

   public boolean d() {
      return false;
   }

   public boolean a(int var1, int var2) {
      return false;
   }

   public float a(long var1, float var3) {
      return 0.5F;
   }

   public boolean e() {
      return false;
   }

   public String l() {
      return "Nether";
   }
}
