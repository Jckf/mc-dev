import java.util.concurrent.Callable;

class ayt implements Callable {

   // $FF: synthetic field
   final ays a;


   ayt(ays var1) {
      this.a = var1;
   }

   public String a() {
      return String.valueOf(this.a.b());
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
