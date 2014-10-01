import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum a {

   a("BLACK", 0, '0'),
   b("DARK_BLUE", 1, '1'),
   c("DARK_GREEN", 2, '2'),
   d("DARK_AQUA", 3, '3'),
   e("DARK_RED", 4, '4'),
   f("DARK_PURPLE", 5, '5'),
   g("GOLD", 6, '6'),
   h("GRAY", 7, '7'),
   i("DARK_GRAY", 8, '8'),
   j("BLUE", 9, '9'),
   k("GREEN", 10, 'a'),
   l("AQUA", 11, 'b'),
   m("RED", 12, 'c'),
   n("LIGHT_PURPLE", 13, 'd'),
   o("YELLOW", 14, 'e'),
   p("WHITE", 15, 'f'),
   q("OBFUSCATED", 16, 'k', true),
   r("BOLD", 17, 'l', true),
   s("STRIKETHROUGH", 18, 'm', true),
   t("UNDERLINE", 19, 'n', true),
   u("ITALIC", 20, 'o', true),
   v("RESET", 21, 'r');
   private static final Map w = new HashMap();
   private static final Map x = new HashMap();
   private static final Pattern y = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FK-OR]");
   private final char z;
   private final boolean A;
   private final String B;
   // $FF: synthetic field
   private static final a[] C = new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v};


   private a(String var1, int var2, char var3) {
      this(var1, var2, var3, false);
   }

   private a(String var1, int var2, char var3, boolean var4) {
      this.z = var3;
      this.A = var4;
      this.B = "§" + var3;
   }

   public char a() {
      return this.z;
   }

   public boolean b() {
      return this.A;
   }

   public boolean c() {
      return !this.A && this != v;
   }

   public String d() {
      return this.name().toLowerCase();
   }

   public String toString() {
      return this.B;
   }

   public static a b(String var0) {
      return var0 == null?null:(a)x.get(var0.toLowerCase());
   }

   public static Collection a(boolean var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      a[] var3 = values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         a var6 = var3[var5];
         if((!var6.c() || var0) && (!var6.b() || var1)) {
            var2.add(var6.d());
         }
      }

      return var2;
   }

   static {
      a[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         a var3 = var0[var2];
         w.put(Character.valueOf(var3.a()), var3);
         x.put(var3.d(), var3);
      }

   }
}
