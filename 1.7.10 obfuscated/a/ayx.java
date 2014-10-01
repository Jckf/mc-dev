import java.util.concurrent.Callable;

class ayx implements Callable {

   // $FF: synthetic field
   final ays a;


   ayx(ays var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("%d game time, %d day time", new Object[]{Long.valueOf(ays.g(this.a)), Long.valueOf(ays.h(this.a))});
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
