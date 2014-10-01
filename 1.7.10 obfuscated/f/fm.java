import com.google.common.collect.Maps;
import java.util.Map;

public enum fm {

   a("SHOW_TEXT", 0, "show_text", true),
   b("SHOW_ACHIEVEMENT", 1, "show_achievement", true),
   c("SHOW_ITEM", 2, "show_item", true);
   private static final Map d = Maps.newHashMap();
   private final boolean e;
   private final String f;
   // $FF: synthetic field
   private static final fm[] g = new fm[]{a, b, c};


   private fm(String var1, int var2, String var3, boolean var4) {
      this.f = var3;
      this.e = var4;
   }

   public boolean a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }

   public static fm a(String var0) {
      return (fm)d.get(var0);
   }

   static {
      fm[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         fm var3 = var0[var2];
         d.put(var3.b(), var3);
      }

   }
}
