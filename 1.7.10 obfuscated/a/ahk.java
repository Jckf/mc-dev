
public enum ahk {

   a("NOT_SET", 0, -1, ""),
   b("SURVIVAL", 1, 0, "survival"),
   c("CREATIVE", 2, 1, "creative"),
   d("ADVENTURE", 3, 2, "adventure");
   int e;
   String f;
   // $FF: synthetic field
   private static final ahk[] g = new ahk[]{a, b, c, d};


   private ahk(String var1, int var2, int var3, String var4) {
      this.e = var3;
      this.f = var4;
   }

   public int a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }

   public void a(yw var1) {
      if(this == c) {
         var1.c = true;
         var1.d = true;
         var1.a = true;
      } else {
         var1.c = false;
         var1.d = false;
         var1.a = false;
         var1.b = false;
      }

      var1.e = !this.c();
   }

   public boolean c() {
      return this == d;
   }

   public boolean d() {
      return this == c;
   }

   public static ahk a(int var0) {
      ahk[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         ahk var4 = var1[var3];
         if(var4.e == var0) {
            return var4;
         }
      }

      return b;
   }

}
