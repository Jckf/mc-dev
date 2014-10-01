import java.util.concurrent.Callable;

class c implements Callable {

   // $FF: synthetic field
   final b a;


   c(b var1) {
      this.a = var1;
   }

   public String a() {
      return "1.7.10";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
