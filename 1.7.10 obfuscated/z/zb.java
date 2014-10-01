
public enum zb {

   a("FULL", 0, 0, "options.chat.visibility.full"),
   b("SYSTEM", 1, 1, "options.chat.visibility.system"),
   c("HIDDEN", 2, 2, "options.chat.visibility.hidden");
   private static final zb[] d = new zb[values().length];
   private final int e;
   private final String f;
   // $FF: synthetic field
   private static final zb[] g = new zb[]{a, b, c};


   private zb(String var1, int var2, int var3, String var4) {
      this.e = var3;
      this.f = var4;
   }

   public int a() {
      return this.e;
   }

   public static zb a(int var0) {
      return d[var0 % d.length];
   }

   static {
      zb[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         zb var3 = var0[var2];
         d[var3.e] = var3;
      }

   }
}
