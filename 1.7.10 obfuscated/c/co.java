
public class co extends da {

   private final Object a;


   public co(Object var1) {
      this.a = var1;
   }

   public Object a(Object var1) {
      Object var2 = super.a(var1);
      return var2 == null?this.a:var2;
   }
}
