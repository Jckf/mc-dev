
public class s extends RuntimeException {

   private final b a;


   public s(b var1) {
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
