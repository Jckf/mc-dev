
public class ir extends ft {

   private String a;


   public ir() {}

   public ir(String var1) {
      if(var1.length() > 100) {
         var1 = var1.substring(0, 100);
      }

      this.a = var1;
   }

   public void a(et var1) {
      this.a = var1.c(100);
   }

   public void b(et var1) {
      var1.a(this.a);
   }

   public void a(io var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public String c() {
      return this.a;
   }
}
