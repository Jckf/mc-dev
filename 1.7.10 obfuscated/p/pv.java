import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pv {

   private static final AtomicInteger a = new AtomicInteger(0);
   private static final Logger b = LogManager.getLogger();


   public static String a(Map var0) {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = var0.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(var1.length() > 0) {
            var1.append('&');
         }

         try {
            var1.append(URLEncoder.encode((String)var3.getKey(), "UTF-8"));
         } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
         }

         if(var3.getValue() != null) {
            var1.append('=');

            try {
               var1.append(URLEncoder.encode(var3.getValue().toString(), "UTF-8"));
            } catch (UnsupportedEncodingException var5) {
               var5.printStackTrace();
            }
         }
      }

      return var1.toString();
   }

   public static String a(URL var0, Map var1, boolean var2) {
      return a(var0, a(var1), var2);
   }

   private static String a(URL var0, String var1, boolean var2) {
      try {
         Proxy var3 = MinecraftServer.I() == null?null:MinecraftServer.I().aq();
         if(var3 == null) {
            var3 = Proxy.NO_PROXY;
         }

         HttpURLConnection var4 = (HttpURLConnection)var0.openConnection(var3);
         var4.setRequestMethod("POST");
         var4.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         var4.setRequestProperty("Content-Length", "" + var1.getBytes().length);
         var4.setRequestProperty("Content-Language", "en-US");
         var4.setUseCaches(false);
         var4.setDoInput(true);
         var4.setDoOutput(true);
         DataOutputStream var5 = new DataOutputStream(var4.getOutputStream());
         var5.writeBytes(var1);
         var5.flush();
         var5.close();
         BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
         StringBuffer var8 = new StringBuffer();

         String var7;
         while((var7 = var6.readLine()) != null) {
            var8.append(var7);
            var8.append('\r');
         }

         var6.close();
         return var8.toString();
      } catch (Exception var9) {
         if(!var2) {
            b.error("Could not post to " + var0, (Throwable)var9);
         }

         return "";
      }
   }

}
