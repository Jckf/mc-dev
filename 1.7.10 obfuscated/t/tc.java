
public enum tc {

   a("Kebab", 0, "Kebab", 16, 16, 0, 0),
   b("Aztec", 1, "Aztec", 16, 16, 16, 0),
   c("Alban", 2, "Alban", 16, 16, 32, 0),
   d("Aztec2", 3, "Aztec2", 16, 16, 48, 0),
   e("Bomb", 4, "Bomb", 16, 16, 64, 0),
   f("Plant", 5, "Plant", 16, 16, 80, 0),
   g("Wasteland", 6, "Wasteland", 16, 16, 96, 0),
   h("Pool", 7, "Pool", 32, 16, 0, 32),
   i("Courbet", 8, "Courbet", 32, 16, 32, 32),
   j("Sea", 9, "Sea", 32, 16, 64, 32),
   k("Sunset", 10, "Sunset", 32, 16, 96, 32),
   l("Creebet", 11, "Creebet", 32, 16, 128, 32),
   m("Wanderer", 12, "Wanderer", 16, 32, 0, 64),
   n("Graham", 13, "Graham", 16, 32, 16, 64),
   o("Match", 14, "Match", 32, 32, 0, 128),
   p("Bust", 15, "Bust", 32, 32, 32, 128),
   q("Stage", 16, "Stage", 32, 32, 64, 128),
   r("Void", 17, "Void", 32, 32, 96, 128),
   s("SkullAndRoses", 18, "SkullAndRoses", 32, 32, 128, 128),
   t("Wither", 19, "Wither", 32, 32, 160, 128),
   u("Fighters", 20, "Fighters", 64, 32, 0, 96),
   v("Pointer", 21, "Pointer", 64, 64, 0, 192),
   w("Pigscene", 22, "Pigscene", 64, 64, 64, 192),
   x("BurningSkull", 23, "BurningSkull", 64, 64, 128, 192),
   y("Skeleton", 24, "Skeleton", 64, 48, 192, 64),
   z("DonkeyKong", 25, "DonkeyKong", 64, 48, 192, 112);
   public static final int A = "SkullAndRoses".length();
   public final String B;
   public final int C;
   public final int D;
   public final int E;
   public final int F;
   // $FF: synthetic field
   private static final tc[] G = new tc[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};


   private tc(String var1, int var2, String var3, int var4, int var5, int var6, int var7) {
      this.B = var3;
      this.C = var4;
      this.D = var5;
      this.E = var6;
      this.F = var7;
   }

}
