
public class adg extends abh {

   private final alt b;


   public adg(alt var1) {
      super(var1);
      this.b = var1;
      this.f(0);
      this.a(true);
   }

   public int a(int var1) {
      return var1 | 4;
   }

   public String a(add var1) {
      int var2 = var1.k();
      if(var2 < 0 || var2 >= this.b.e().length) {
         var2 = 0;
      }

      return super.a() + "." + this.b.e()[var2];
   }
}
