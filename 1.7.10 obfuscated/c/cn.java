
public class cn extends cw {

   private final String d;
   private Object e;


   public cn(String var1) {
      this.d = var1;
   }

   public void a(int var1, String var2, Object var3) {
      if(this.d.equals(var2)) {
         this.e = var3;
      }

      super.a(var1, var2, var3);
   }

   public Object a(String var1) {
      Object var2 = super.a(var1);
      return var2 == null?this.e:var2;
   }

   public Object a(int var1) {
      Object var2 = super.a(var1);
      return var2 == null?this.e:var2;
   }
}
