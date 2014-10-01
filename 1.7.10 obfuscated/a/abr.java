
public class abr extends abh {

   private final aji b;
   private String[] c;


   public abr(aji var1, boolean var2) {
      super(var1);
      this.b = var1;
      if(var2) {
         this.f(0);
         this.a(true);
      }

   }

   public int a(int var1) {
      return var1;
   }

   public abr a(String[] var1) {
      this.c = var1;
      return this;
   }

   public String a(add var1) {
      if(this.c == null) {
         return super.a(var1);
      } else {
         int var2 = var1.k();
         return var2 >= 0 && var2 < this.c.length?super.a(var1) + "." + this.c[var2]:super.a(var1);
      }
   }
}
