
public enum adc {

   a("WOOD", 0, 0, 59, 2.0F, 0.0F, 15),
   b("STONE", 1, 1, 131, 4.0F, 1.0F, 5),
   c("IRON", 2, 2, 250, 6.0F, 2.0F, 14),
   d("EMERALD", 3, 3, 1561, 8.0F, 3.0F, 10),
   e("GOLD", 4, 0, 32, 12.0F, 0.0F, 22);
   private final int f;
   private final int g;
   private final float h;
   private final float i;
   private final int j;
   // $FF: synthetic field
   private static final adc[] k = new adc[]{a, b, c, d, e};


   private adc(String var1, int var2, int var3, int var4, float var5, float var6, int var7) {
      this.f = var3;
      this.g = var4;
      this.h = var5;
      this.i = var6;
      this.j = var7;
   }

   public int a() {
      return this.g;
   }

   public float b() {
      return this.h;
   }

   public float c() {
      return this.i;
   }

   public int d() {
      return this.f;
   }

   public int e() {
      return this.j;
   }

   public adb f() {
      return this == a?adb.a(ajn.f):(this == b?adb.a(ajn.e):(this == e?ade.k:(this == c?ade.j:(this == d?ade.i:null))));
   }

}
