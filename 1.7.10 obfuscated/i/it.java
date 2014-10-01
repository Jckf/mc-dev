
public enum it {

   a("PERFORM_RESPAWN", 0, 0),
   b("REQUEST_STATS", 1, 1),
   c("OPEN_INVENTORY_ACHIEVEMENT", 2, 2);
   private final int d;
   private static final it[] e = new it[values().length];
   // $FF: synthetic field
   private static final it[] f = new it[]{a, b, c};


   private it(String var1, int var2, int var3) {
      this.d = var3;
   }

   // $FF: synthetic method
   static it[] a() {
      return e;
   }

   // $FF: synthetic method
   static int a(it var0) {
      return var0.d;
   }

   static {
      it[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         it var3 = var0[var2];
         e[var3.d] = var3;
      }

   }
}
