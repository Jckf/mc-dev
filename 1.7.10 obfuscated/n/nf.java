import java.util.concurrent.Callable;

class nf implements Callable {

   // $FF: synthetic field
   final ej a;
   // $FF: synthetic field
   final nc b;


   nf(nc var1, ej var2) {
      this.b = var1;
      this.a = var2;
   }

   public String a() {
      return this.a.toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
