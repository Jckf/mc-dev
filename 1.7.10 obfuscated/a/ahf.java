import java.util.concurrent.Callable;

class ahf implements Callable {

   // $FF: synthetic field
   final ahb a;


   ahf(ahb var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.v.f();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
