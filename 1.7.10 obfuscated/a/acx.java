
public class acx extends adb {

   public final int a;
   private final int b;
   private final float c;
   private final boolean d;
   private boolean m;
   private int n;
   private int o;
   private int p;
   private float q;


   public acx(int var1, float var2, boolean var3) {
      this.a = 32;
      this.b = var1;
      this.d = var3;
      this.c = var2;
      this.a(abt.h);
   }

   public acx(int var1, boolean var2) {
      this(var1, 0.6F, var2);
   }

   public add b(add var1, ahb var2, yz var3) {
      --var1.b;
      var3.bQ().a(this, var1);
      var2.a((sa)var3, "random.burp", 0.5F, var2.s.nextFloat() * 0.1F + 0.9F);
      this.c(var1, var2, var3);
      return var1;
   }

   protected void c(add var1, ahb var2, yz var3) {
      if(!var2.E && this.n > 0 && var2.s.nextFloat() < this.q) {
         var3.c(new rw(this.n, this.o * 20, this.p));
      }

   }

   public int d_(add var1) {
      return 32;
   }

   public aei d(add var1) {
      return aei.b;
   }

   public add a(add var1, ahb var2, yz var3) {
      if(var3.g(this.m)) {
         var3.a(var1, this.d_(var1));
      }

      return var1;
   }

   public int g(add var1) {
      return this.b;
   }

   public float h(add var1) {
      return this.c;
   }

   public boolean i() {
      return this.d;
   }

   public acx a(int var1, int var2, int var3, float var4) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var4;
      return this;
   }

   public acx j() {
      this.m = true;
      return this;
   }
}
