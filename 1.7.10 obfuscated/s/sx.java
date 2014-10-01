
public enum sx {

   a("monster", 0, yb.class, 70, awt.a, false, false),
   b("creature", 1, wf.class, 10, awt.a, true, true),
   c("ambient", 2, wd.class, 15, awt.a, true, false),
   d("waterCreature", 3, wu.class, 5, awt.h, true, false);
   private final Class e;
   private final int f;
   private final awt g;
   private final boolean h;
   private final boolean i;
   // $FF: synthetic field
   private static final sx[] j = new sx[]{a, b, c, d};


   private sx(String var1, int var2, Class var3, int var4, awt var5, boolean var6, boolean var7) {
      this.e = var3;
      this.f = var4;
      this.g = var5;
      this.h = var6;
      this.i = var7;
   }

   public Class a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public awt c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

}
