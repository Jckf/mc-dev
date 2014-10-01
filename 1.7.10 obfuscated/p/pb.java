
public class pb extends ph {

   public final int a;
   public final int b;
   public final pb c;
   private final String k;
   public final add d;
   private boolean m;


   public pb(String var1, String var2, int var3, int var4, adb var5, pb var6) {
      this(var1, var2, var3, var4, new add(var5), var6);
   }

   public pb(String var1, String var2, int var3, int var4, aji var5, pb var6) {
      this(var1, var2, var3, var4, new add(var5), var6);
   }

   public pb(String var1, String var2, int var3, int var4, add var5, pb var6) {
      super(var1, new fr("achievement." + var2, new Object[0]));
      this.d = var5;
      this.k = "achievement." + var2 + ".desc";
      this.a = var3;
      this.b = var4;
      if(var3 < pc.a) {
         a = var3;
      }

      if(var4 < pc.b) {
         b = var4;
      }

      if(var3 > pc.c) {
         pc.c = var3;
      }

      if(var4 > pc.d) {
         pc.d = var4;
      }

      this.c = var6;
   }

   public pb a() {
      this.f = true;
      return this;
   }

   public pb b() {
      this.m = true;
      return this;
   }

   public pb c() {
      super.h();
      pc.e.add(this);
      return this;
   }

   public boolean d() {
      return true;
   }

   public fj e() {
      fj var1 = super.e();
      var1.b().a(this.g()?a.f:a.k);
      return var1;
   }

   public pb a(Class var1) {
      return (pb)super.b(var1);
   }

   public boolean g() {
      return this.m;
   }

   // $FF: synthetic method
   public ph b(Class var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public ph h() {
      return this.c();
   }

   // $FF: synthetic method
   public ph i() {
      return this.a();
   }
}
