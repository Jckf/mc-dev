import java.util.concurrent.Callable;

final class q implements Callable {

   // $FF: synthetic field
   final dt a;


   q(dt var1) {
      this.a = var1;
   }

   public String a() {
      return j.a(this.a);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
