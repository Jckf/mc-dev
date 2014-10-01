import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class fp implements JsonDeserializer, JsonSerializer {

   public fn a(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if(var1.isJsonObject()) {
         fn var4 = new fn();
         JsonObject var5 = var1.getAsJsonObject();
         if(var5 == null) {
            return null;
         } else {
            if(var5.has("bold")) {
               fn.a(var4, Boolean.valueOf(var5.get("bold").getAsBoolean()));
            }

            if(var5.has("italic")) {
               fn.b(var4, Boolean.valueOf(var5.get("italic").getAsBoolean()));
            }

            if(var5.has("underlined")) {
               fn.c(var4, Boolean.valueOf(var5.get("underlined").getAsBoolean()));
            }

            if(var5.has("strikethrough")) {
               fn.d(var4, Boolean.valueOf(var5.get("strikethrough").getAsBoolean()));
            }

            if(var5.has("obfuscated")) {
               fn.e(var4, Boolean.valueOf(var5.get("obfuscated").getAsBoolean()));
            }

            if(var5.has("color")) {
               fn.a(var4, (a)var3.deserialize(var5.get("color"), a.class));
            }

            JsonObject var6;
            JsonPrimitive var7;
            if(var5.has("clickEvent")) {
               var6 = var5.getAsJsonObject("clickEvent");
               if(var6 != null) {
                  var7 = var6.getAsJsonPrimitive("action");
                  fi var8 = var7 == null?null:fi.a(var7.getAsString());
                  JsonPrimitive var9 = var6.getAsJsonPrimitive("value");
                  String var10 = var9 == null?null:var9.getAsString();
                  if(var8 != null && var10 != null && var8.a()) {
                     fn.a(var4, new fh(var8, var10));
                  }
               }
            }

            if(var5.has("hoverEvent")) {
               var6 = var5.getAsJsonObject("hoverEvent");
               if(var6 != null) {
                  var7 = var6.getAsJsonPrimitive("action");
                  fm var11 = var7 == null?null:fm.a(var7.getAsString());
                  fj var12 = (fj)var3.deserialize(var6.get("value"), fj.class);
                  if(var11 != null && var12 != null && var11.a()) {
                     fn.a(var4, new fl(var11, var12));
                  }
               }
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public JsonElement a(fn var1, Type var2, JsonSerializationContext var3) {
      if(var1.g()) {
         return null;
      } else {
         JsonObject var4 = new JsonObject();
         if(fn.b(var1) != null) {
            var4.addProperty("bold", fn.b(var1));
         }

         if(fn.c(var1) != null) {
            var4.addProperty("italic", fn.c(var1));
         }

         if(fn.d(var1) != null) {
            var4.addProperty("underlined", fn.d(var1));
         }

         if(fn.e(var1) != null) {
            var4.addProperty("strikethrough", fn.e(var1));
         }

         if(fn.f(var1) != null) {
            var4.addProperty("obfuscated", fn.f(var1));
         }

         if(fn.g(var1) != null) {
            var4.add("color", var3.serialize(fn.g(var1)));
         }

         JsonObject var5;
         if(fn.h(var1) != null) {
            var5 = new JsonObject();
            var5.addProperty("action", fn.h(var1).a().b());
            var5.addProperty("value", fn.h(var1).b());
            var4.add("clickEvent", var5);
         }

         if(fn.i(var1) != null) {
            var5 = new JsonObject();
            var5.addProperty("action", fn.i(var1).a().b());
            var5.add("value", var3.serialize(fn.i(var1).b()));
            var4.add("hoverEvent", var5);
         }

         return var4;
      }
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.a((fn)var1, var2, var3);
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.a(var1, var2, var3);
   }
}
