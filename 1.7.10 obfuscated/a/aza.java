import java.util.concurrent.Callable;

class aza implements Callable {

   // $FF: synthetic field
   final ays a;


   aza(ays var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[]{Integer.valueOf(ays.k(this.a)), Boolean.valueOf(ays.l(this.a)), Integer.valueOf(ays.m(this.a)), Boolean.valueOf(ays.n(this.a))});
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
