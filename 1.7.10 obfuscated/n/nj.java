import java.util.concurrent.Callable;

class nj implements Callable {

   // $FF: synthetic field
   final ft a;
   // $FF: synthetic field
   final nh b;


   nj(nh var1, ft var2) {
      this.b = var1;
      this.a = var2;
   }

   public String a() {
      return this.a.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
