import org.apache.commons.lang3.ArrayUtils;

public class gi extends ft {

   private String[] a;


   public gi() {}

   public gi(String[] var1) {
      this.a = var1;
   }

   public void a(et var1) {
      this.a = new String[var1.a()];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = var1.c(32767);
      }

   }

   public void b(et var1) {
      var1.b(this.a.length);
      String[] var2 = this.a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         var1.a(var5);
      }

   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("candidates=\'%s\'", new Object[]{ArrayUtils.toString(this.a)});
   }
}
