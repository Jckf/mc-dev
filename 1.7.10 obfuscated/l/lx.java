import java.util.concurrent.Callable;

class lx implements Callable {

   // $FF: synthetic field
   final lt a;


   lx(lt var1) {
      this.a = var1;
   }

   public String a() {
      return "Dedicated Server (map_server.txt)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
