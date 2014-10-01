import java.util.concurrent.Callable;

class azb implements Callable {

   // $FF: synthetic field
   final ays a;


   azb(ays var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[]{ays.o(this.a).b(), Integer.valueOf(ays.o(this.a).a()), Boolean.valueOf(ays.p(this.a)), Boolean.valueOf(ays.q(this.a))});
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
