
public abstract class aqo {

   public static final float[] a = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public ahb b;
   public ahm c;
   public String d;
   public aib e;
   public boolean f;
   public boolean g;
   public float[] h = new float[16];
   public int i;
   private float[] j = new float[4];


   public final void a(ahb var1) {
      this.b = var1;
      this.c = var1.N().u();
      this.d = var1.N().y();
      this.b();
      this.a();
   }

   protected void a() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.h[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   protected void b() {
      if(this.b.N().u() == ahm.c) {
         ass var1 = ass.a(this.b.N().y());
         this.e = new aie(ahu.d(var1.a()), 0.5F);
      } else {
         this.e = new aib(this.b);
      }

   }

   public apu c() {
      return (apu)(this.c == ahm.c?new aqu(this.b, this.b.H(), this.b.N().s(), this.d):new aqz(this.b, this.b.H(), this.b.N().s()));
   }

   public boolean a(int var1, int var2) {
      return this.b.b(var1, var2) == ajn.c;
   }

   public float a(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if(var5 < 0.0F) {
         ++var5;
      }

      if(var5 > 1.0F) {
         --var5;
      }

      float var6 = var5;
      var5 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 = var6 + (var5 - var6) / 3.0F;
      return var5;
   }

   public int a(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public boolean d() {
      return true;
   }

   public boolean e() {
      return true;
   }

   public static aqo a(int var0) {
      return (aqo)(var0 == -1?new aqp():(var0 == 0?new aqq():(var0 == 1?new aqr():null)));
   }

   public r h() {
      return null;
   }

   public int i() {
      return this.c == ahm.c?4:64;
   }

   public abstract String l();

}
