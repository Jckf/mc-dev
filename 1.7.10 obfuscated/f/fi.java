import com.google.common.collect.Maps;
import java.util.Map;

public enum fi {

   a("OPEN_URL", 0, "open_url", true),
   b("OPEN_FILE", 1, "open_file", false),
   c("RUN_COMMAND", 2, "run_command", true),
   d("TWITCH_USER_INFO", 3, "twitch_user_info", false),
   e("SUGGEST_COMMAND", 4, "suggest_command", true);
   private static final Map f = Maps.newHashMap();
   private final boolean g;
   private final String h;
   // $FF: synthetic field
   private static final fi[] i = new fi[]{a, b, c, d, e};


   private fi(String var1, int var2, String var3, boolean var4) {
      this.h = var3;
      this.g = var4;
   }

   public boolean a() {
      return this.g;
   }

   public String b() {
      return this.h;
   }

   public static fi a(String var0) {
      return (fi)f.get(var0);
   }

   static {
      fi[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         fi var3 = var0[var2];
         f.put(var3.b(), var3);
      }

   }
}
