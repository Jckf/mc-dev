
public enum cr {

   a("DOWN", 0, 0, 1, 0, -1, 0),
   b("UP", 1, 1, 0, 0, 1, 0),
   c("NORTH", 2, 2, 3, 0, 0, -1),
   d("SOUTH", 3, 3, 2, 0, 0, 1),
   e("EAST", 4, 4, 5, -1, 0, 0),
   f("WEST", 5, 5, 4, 1, 0, 0);
   private final int g;
   private final int h;
   private final int i;
   private final int j;
   private final int k;
   private static final cr[] l = new cr[6];
   // $FF: synthetic field
   private static final cr[] m = new cr[]{a, b, c, d, e, f};


   private cr(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.g = var3;
      this.h = var4;
      this.i = var5;
      this.j = var6;
      this.k = var7;
   }

   public int c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public int e() {
      return this.k;
   }

   public static cr a(int var0) {
      return l[var0 % l.length];
   }

   static {
      cr[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         cr var3 = var0[var2];
         l[var3.g] = var3;
      }

   }
}
