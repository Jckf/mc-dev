import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.lang3.StringUtils;

public class pu {

   public static boolean d(JsonObject var0, String var1) {
      return !g(var0, var1)?false:var0.get(var1).isJsonArray();
   }

   public static boolean g(JsonObject var0, String var1) {
      return var0 == null?false:var0.get(var1) != null;
   }

   public static String a(JsonElement var0, String var1) {
      if(var0.isJsonPrimitive()) {
         return var0.getAsString();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a string, was " + d(var0));
      }
   }

   public static String h(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return a(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      }
   }

   public static int f(JsonElement var0, String var1) {
      if(var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Int, was " + d(var0));
      }
   }

   public static int m(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return f(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      }
   }

   public static JsonObject l(JsonElement var0, String var1) {
      if(var0.isJsonObject()) {
         return var0.getAsJsonObject();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonObject, was " + d(var0));
      }
   }

   public static JsonArray m(JsonElement var0, String var1) {
      if(var0.isJsonArray()) {
         return var0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray, was " + d(var0));
      }
   }

   public static JsonArray t(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return m(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      }
   }

   public static String d(JsonElement var0) {
      String var1 = StringUtils.abbreviateMiddle(String.valueOf(var0), "...", 10);
      if(var0 == null) {
         return "null (missing)";
      } else if(var0.isJsonNull()) {
         return "null (json)";
      } else if(var0.isJsonArray()) {
         return "an array (" + var1 + ")";
      } else if(var0.isJsonObject()) {
         return "an object (" + var1 + ")";
      } else {
         if(var0.isJsonPrimitive()) {
            JsonPrimitive var2 = var0.getAsJsonPrimitive();
            if(var2.isNumber()) {
               return "a number (" + var1 + ")";
            }

            if(var2.isBoolean()) {
               return "a boolean (" + var1 + ")";
            }
         }

         return var1;
      }
   }
}
