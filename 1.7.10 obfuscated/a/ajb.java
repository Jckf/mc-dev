
public class ajb extends akx {

   public static final String[] a = new String[]{"intact", "slightlyDamaged", "veryDamaged"};
   private static final String[] N = new String[]{"anvil_top_damaged_0", "anvil_top_damaged_1", "anvil_top_damaged_2"};


   protected ajb() {
      super(awt.g);
      this.g(0);
      this.a(abt.c);
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3;
      int var8 = var1.e(var2, var3, var4) >> 2;
      ++var7;
      var7 %= 4;
      if(var7 == 0) {
         var1.a(var2, var3, var4, 2 | var8 << 2, 2);
      }

      if(var7 == 1) {
         var1.a(var2, var3, var4, 3 | var8 << 2, 2);
      }

      if(var7 == 2) {
         var1.a(var2, var3, var4, 0 | var8 << 2, 2);
      }

      if(var7 == 3) {
         var1.a(var2, var3, var4, 1 | var8 << 2, 2);
      }

   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         var5.c(var2, var3, var4);
         return true;
      }
   }

   public int b() {
      return 35;
   }

   public int a(int var1) {
      return var1 >> 2;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) & 3;
      if(var5 != 3 && var5 != 1) {
         this.a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
      }

   }

   protected void a(xj var1) {
      var1.a(true);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5) {
      var1.c(1022, var2, var3, var4, 0);
   }

}
