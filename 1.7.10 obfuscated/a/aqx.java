import java.util.Random;

public class aqx {

   protected int a = 8;
   protected Random b = new Random();
   protected ahb c;


   public void a(apu var1, ahb var2, int var3, int var4, aji[] var5) {
      int var6 = this.a;
      this.c = var2;
      this.b.setSeed(var2.H());
      long var7 = this.b.nextLong();
      long var9 = this.b.nextLong();

      for(int var11 = var3 - var6; var11 <= var3 + var6; ++var11) {
         for(int var12 = var4 - var6; var12 <= var4 + var6; ++var12) {
            long var13 = (long)var11 * var7;
            long var15 = (long)var12 * var9;
            this.b.setSeed(var13 ^ var15 ^ var2.H());
            this.a(var2, var11, var12, var3, var4, var5);
         }
      }

   }

   protected void a(ahb var1, int var2, int var3, int var4, int var5, aji[] var6) {}
}
