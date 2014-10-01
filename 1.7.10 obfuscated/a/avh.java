import java.util.concurrent.Callable;

class avh implements Callable {

   // $FF: synthetic field
   final ave a;


   avh(ave var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
