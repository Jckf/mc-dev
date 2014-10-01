
public class xn extends xl {

   private final agp a = new xo(this);
   private int b = 0;


   public xn(ahb var1) {
      super(var1);
   }

   public xn(ahb var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void c() {
      super.c();
      this.z().a(23, "");
      this.z().a(24, "");
   }

   protected void a(dh var1) {
      super.a(var1);
      this.a.b(var1);
      this.z().b(23, this.e().i());
      this.z().b(24, fk.a(this.e().h()));
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a.a(var1);
   }

   public int m() {
      return 6;
   }

   public aji o() {
      return ajn.bI;
   }

   public agp e() {
      return this.a;
   }

   public void a(int var1, int var2, int var3, boolean var4) {
      if(var4 && this.aa - this.b >= 4) {
         this.e().a(this.o);
         this.b = this.aa;
      }

   }

   public boolean c(yz var1) {
      if(this.o.E) {
         var1.a(this.e());
      }

      return super.c(var1);
   }

   public void i(int var1) {
      super.i(var1);
      if(var1 == 24) {
         try {
            this.a.b(fk.a(this.z().e(24)));
         } catch (Throwable var3) {
            ;
         }
      } else if(var1 == 23) {
         this.a.a(this.z().e(23));
      }

   }
}
