
public class u extends RuntimeException {

   private final b a;


   public u(b var1) {
      this.a = var1;
   }

   public b a() {
      return this.a;
   }

   public Throwable getCause() {
      return this.a.b();
   }

   public String getMessage() {
      return this.a.a();
   }
}
