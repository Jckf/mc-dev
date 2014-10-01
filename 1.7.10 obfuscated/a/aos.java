import java.util.concurrent.Callable;

class aos implements Callable {

   // $FF: synthetic field
   final aor a;


   aos(aor var1) {
      this.a = var1;
   }

   public String a() {
      return (String)aor.v().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
