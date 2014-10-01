
public class adl extends abh {

   protected final aji b;
   protected final String[] c;


   public adl(aji var1, aji var2, String[] var3) {
      super(var1);
      this.b = var2;
      this.c = var3;
      this.f(0);
      this.a(true);
   }

   public int a(int var1) {
      return var1;
   }

   public String a(add var1) {
      int var2 = var1.k();
      if(var2 < 0 || var2 >= this.c.length) {
         var2 = 0;
      }

      return super.a() + "." + this.c[var2];
   }
}
