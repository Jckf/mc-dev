import java.util.concurrent.Callable;

class d implements Callable {

   // $FF: synthetic field
   final b a;


   d(b var1) {
      this.a = var1;
   }

   public String a() {
      return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
