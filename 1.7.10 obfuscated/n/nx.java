import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class nx extends om {

   public nx(File var1) {
      super(var1);
   }

   protected ol a(JsonObject var1) {
      return new ny(var1);
   }

   public boolean a(SocketAddress var1) {
      String var2 = this.c(var1);
      return this.d(var2);
   }

   public ny b(SocketAddress var1) {
      String var2 = this.c(var1);
      return (ny)this.b(var2);
   }

   private String c(SocketAddress var1) {
      String var2 = var1.toString();
      if(var2.contains("/")) {
         var2 = var2.substring(var2.indexOf(47) + 1);
      }

      if(var2.contains(":")) {
         var2 = var2.substring(0, var2.indexOf(58));
      }

      return var2;
   }
}
