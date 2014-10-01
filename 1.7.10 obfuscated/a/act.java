
public class act extends acx {

   private final boolean b;


   public act(boolean var1) {
      super(0, 0.0F, false);
      this.b = var1;
   }

   public int g(add var1) {
      acu var2 = acu.a(var1);
      return this.b && var2.i()?var2.e():var2.c();
   }

   public float h(add var1) {
      acu var2 = acu.a(var1);
      return this.b && var2.i()?var2.f():var2.d();
   }

   public String i(add var1) {
      return acu.a(var1) == acu.d?aen.m:null;
   }

   protected void c(add var1, ahb var2, yz var3) {
      acu var4 = acu.a(var1);
      if(var4 == acu.d) {
         var3.c(new rw(rv.u.H, 1200, 3));
         var3.c(new rw(rv.s.H, 300, 2));
         var3.c(new rw(rv.k.H, 300, 1));
      }

      super.c(var1, var2, var3);
   }

   public String a(add var1) {
      acu var2 = acu.a(var1);
      return this.a() + "." + var2.b() + "." + (this.b && var2.i()?"cooked":"raw");
   }
}
