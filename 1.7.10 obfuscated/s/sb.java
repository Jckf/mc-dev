import java.util.concurrent.Callable;

class sb implements Callable {

   // $FF: synthetic field
   final sa a;


   sb(sa var1) {
      this.a = var1;
   }

   public String a() {
      return sg.b(this.a) + " (" + this.a.getClass().getCanonicalName() + ")";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
