import java.util.concurrent.Callable;

class f implements Callable {

   // $FF: synthetic field
   final b a;


   f(b var1) {
      this.a = var1;
   }

   public String a() {
      return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
