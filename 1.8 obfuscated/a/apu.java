
public class apu extends apf {

   private static final String[] E = new String[]{"all", "fire", "fall", "explosion", "projectile"};
   private static final int[] F = new int[]{1, 10, 5, 5, 3};
   private static final int[] G = new int[]{11, 8, 6, 8, 6};
   private static final int[] H = new int[]{20, 12, 10, 12, 15};
   public final int a;


   public apu(int var1, oa var2, int var3, int var4) {
      super(var1, var2, var3, apg.b);
      this.a = var4;
      if(var4 == 2) {
         this.C = apg.c;
      }

   }

   public int a(int var1) {
      return F[this.a] + (var1 - 1) * G[this.a];
   }

   public int b(int var1) {
      return this.a(var1) + H[this.a];
   }

   public int b() {
      return 4;
   }

   public int a(int var1, wh var2) {
      if(var2.g()) {
         return 0;
      } else {
         float var3 = (float)(6 + var1 * var1) / 3.0F;
         return this.a == 0?uv.d(var3 * 0.75F):(this.a == 1 && var2.o()?uv.d(var3 * 1.25F):(this.a == 2 && var2 == wh.i?uv.d(var3 * 2.5F):(this.a == 3 && var2.c()?uv.d(var3 * 1.5F):(this.a == 4 && var2.a()?uv.d(var3 * 1.5F):0))));
      }
   }

   public String a() {
      return "enchantment.protect." + E[this.a];
   }

   public boolean a(apf var1) {
      if(var1 instanceof apu) {
         apu var2 = (apu)var1;
         return var2.a == this.a?false:this.a == 2 || var2.a == 2;
      } else {
         return super.a(var1);
      }
   }

   public static int a(wv var0, int var1) {
      int var2 = aph.a(apf.d.B, var0.at());
      if(var2 > 0) {
         var1 -= uv.d((float)var1 * (float)var2 * 0.15F);
      }

      return var1;
   }

   public static double a(wv var0, double var1) {
      int var3 = aph.a(apf.f.B, var0.at());
      if(var3 > 0) {
         var1 -= (double)uv.c(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }

}
