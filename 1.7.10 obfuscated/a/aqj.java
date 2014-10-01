import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class aqj {

   private static final Map a = new HashMap();


   public static synchronized aqh a(File var0, int var1, int var2) {
      File var3 = new File(var0, "region");
      File var4 = new File(var3, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      aqh var5 = (aqh)a.get(var4);
      if(var5 != null) {
         return var5;
      } else {
         if(!var3.exists()) {
            var3.mkdirs();
         }

         if(a.size() >= 256) {
            a();
         }

         aqh var6 = new aqh(var4);
         a.put(var4, var6);
         return var6;
      }
   }

   public static synchronized void a() {
      Iterator var0 = a.values().iterator();

      while(var0.hasNext()) {
         aqh var1 = (aqh)var0.next();

         try {
            if(var1 != null) {
               var1.c();
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      a.clear();
   }

   public static DataInputStream c(File var0, int var1, int var2) {
      aqh var3 = a(var0, var1, var2);
      return var3.a(var1 & 31, var2 & 31);
   }

   public static DataOutputStream d(File var0, int var1, int var2) {
      aqh var3 = a(var0, var1, var2);
      return var3.b(var1 & 31, var2 & 31);
   }

}
