
public class ahm {

   public static final ahm[] a = new ahm[16];
   public static final ahm b = (new ahm(0, "default", 1)).i();
   public static final ahm c = new ahm(1, "flat");
   public static final ahm d = new ahm(2, "largeBiomes");
   public static final ahm e = (new ahm(3, "amplified")).j();
   public static final ahm f = (new ahm(8, "default_1_1", 0)).a(false);
   private final int g;
   private final String h;
   private final int i;
   private boolean j;
   private boolean k;
   private boolean l;


   private ahm(int var1, String var2) {
      this(var1, var2, 0);
   }

   private ahm(int var1, String var2, int var3) {
      this.h = var2;
      this.i = var3;
      this.j = true;
      this.g = var1;
      a[var1] = this;
   }

   public String a() {
      return this.h;
   }

   public int d() {
      return this.i;
   }

   public ahm a(int var1) {
      return this == b && var1 == 0?f:this;
   }

   private ahm a(boolean var1) {
      this.j = var1;
      return this;
   }

   private ahm i() {
      this.k = true;
      return this;
   }

   public boolean f() {
      return this.k;
   }

   public static ahm a(String var0) {
      for(int var1 = 0; var1 < a.length; ++var1) {
         if(a[var1] != null && a[var1].h.equalsIgnoreCase(var0)) {
            return a[var1];
         }
      }

      return null;
   }

   public int g() {
      return this.g;
   }

   private ahm j() {
      this.l = true;
      return this;
   }

}
