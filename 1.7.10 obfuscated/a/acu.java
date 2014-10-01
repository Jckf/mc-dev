import com.google.common.collect.Maps;
import java.util.Map;

public enum acu {

   a("COD", 0, 0, "cod", 2, 0.1F, 5, 0.6F),
   b("SALMON", 1, 1, "salmon", 2, 0.1F, 6, 0.8F),
   c("CLOWNFISH", 2, 2, "clownfish", 1, 0.1F),
   d("PUFFERFISH", 3, 3, "pufferfish", 1, 0.1F);
   private static final Map e = Maps.newHashMap();
   private final int f;
   private final String g;
   private final int j;
   private final float k;
   private final int l;
   private final float m;
   private boolean n = false;
   // $FF: synthetic field
   private static final acu[] o = new acu[]{a, b, c, d};


   private acu(String var1, int var2, int var3, String var4, int var5, float var6, int var7, float var8) {
      this.f = var3;
      this.g = var4;
      this.j = var5;
      this.k = var6;
      this.l = var7;
      this.m = var8;
      this.n = true;
   }

   private acu(String var1, int var2, int var3, String var4, int var5, float var6) {
      this.f = var3;
      this.g = var4;
      this.j = var5;
      this.k = var6;
      this.l = 0;
      this.m = 0.0F;
      this.n = false;
   }

   public int a() {
      return this.f;
   }

   public String b() {
      return this.g;
   }

   public int c() {
      return this.j;
   }

   public float d() {
      return this.k;
   }

   public int e() {
      return this.l;
   }

   public float f() {
      return this.m;
   }

   public boolean i() {
      return this.n;
   }

   public static acu a(int var0) {
      acu var1 = (acu)e.get(Integer.valueOf(var0));
      return var1 == null?a:var1;
   }

   public static acu a(add var0) {
      return var0.b() instanceof act?a(var0.k()):a;
   }

   static {
      acu[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         acu var3 = var0[var2];
         e.put(Integer.valueOf(var3.a()), var3);
      }

   }
}
