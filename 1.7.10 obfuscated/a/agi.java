
public class agi extends aft {

   private static final String[] E = new String[]{"all", "fire", "fall", "explosion", "projectile"};
   private static final int[] F = new int[]{1, 10, 5, 5, 3};
   private static final int[] G = new int[]{11, 8, 6, 8, 6};
   private static final int[] H = new int[]{20, 12, 10, 12, 15};
   public final int a;


   public agi(int var1, int var2, int var3) {
      super(var1, var2, afu.b);
      this.a = var3;
      if(var3 == 2) {
         this.C = afu.c;
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

   public int a(int var1, ro var2) {
      if(var2.g()) {
         return 0;
      } else {
         float var3 = (float)(6 + var1 * var1) / 3.0F;
         return this.a == 0?qh.d(var3 * 0.75F):(this.a == 1 && var2.o()?qh.d(var3 * 1.25F):(this.a == 2 && var2 == ro.h?qh.d(var3 * 2.5F):(this.a == 3 && var2.c()?qh.d(var3 * 1.5F):(this.a == 4 && var2.a()?qh.d(var3 * 1.5F):0))));
      }
   }

   public String a() {
      return "enchantment.protect." + E[this.a];
   }

   public boolean a(aft var1) {
      if(var1 instanceof agi) {
         agi var2 = (agi)var1;
         return var2.a == this.a?false:this.a == 2 || var2.a == 2;
      } else {
         return super.a(var1);
      }
   }

   public static int a(sa var0, int var1) {
      int var2 = afv.a(aft.e.B, var0.ak());
      if(var2 > 0) {
         var1 -= qh.d((float)var1 * (float)var2 * 0.15F);
      }

      return var1;
   }

   public static double a(sa var0, double var1) {
      int var3 = afv.a(aft.g.B, var0.ak());
      if(var3 > 0) {
         var1 -= (double)qh.c(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }

}
