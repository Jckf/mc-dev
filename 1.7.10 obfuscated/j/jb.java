
public enum jb {

   a("INTERACT", 0, 0),
   b("ATTACK", 1, 1);
   private static final jb[] c = new jb[values().length];
   private final int d;
   // $FF: synthetic field
   private static final jb[] e = new jb[]{a, b};


   private jb(String var1, int var2, int var3) {
      this.d = var3;
   }

   // $FF: synthetic method
   static jb[] a() {
      return c;
   }

   // $FF: synthetic method
   static int a(jb var0) {
      return var0.d;
   }

   static {
      jb[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         jb var3 = var0[var2];
         c[var3.d] = var3;
      }

   }
}
