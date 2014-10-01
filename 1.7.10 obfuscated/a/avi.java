import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class avi {

   private static final Logger a = LogManager.getLogger();
   private static Map b = new HashMap();
   private static Map c = new HashMap();
   private static Map d = new HashMap();
   private static Map e = new HashMap();


   private static void b(Class var0, String var1) {
      b.put(var1, var0);
      c.put(var0, var1);
   }

   static void a(Class var0, String var1) {
      d.put(var1, var0);
      e.put(var0, var1);
   }

   public static String a(avm var0) {
      return (String)c.get(var0.getClass());
   }

   public static String a(avk var0) {
      return (String)e.get(var0.getClass());
   }

   public static avm a(dh var0, ahb var1) {
      avm var2 = null;

      try {
         Class var3 = (Class)b.get(var0.j("id"));
         if(var3 != null) {
            var2 = (avm)var3.newInstance();
         }
      } catch (Exception var4) {
         a.warn("Failed Start with id " + var0.j("id"));
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.a(var1, var0);
      } else {
         a.warn("Skipping Structure with id " + var0.j("id"));
      }

      return var2;
   }

   public static avk b(dh var0, ahb var1) {
      avk var2 = null;

      try {
         Class var3 = (Class)d.get(var0.j("id"));
         if(var3 != null) {
            var2 = (avk)var3.newInstance();
         }
      } catch (Exception var4) {
         a.warn("Failed Piece with id " + var0.j("id"));
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.a(var1, var0);
      } else {
         a.warn("Skipping Piece with id " + var0.j("id"));
      }

      return var2;
   }

   static {
      b(atc.class, "Mineshaft");
      b(avo.class, "Village");
      b(ate.class, "Fortress");
      b(auh.class, "Stronghold");
      b(aty.class, "Temple");
      asx.a();
      avp.a();
      atf.a();
      aui.a();
      atz.a();
   }
}
