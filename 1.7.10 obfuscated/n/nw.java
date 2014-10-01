import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

class nw implements JsonDeserializer, JsonSerializer {

   // $FF: synthetic field
   final ns a;


   private nw(ns var1) {
      this.a = var1;
   }

   public JsonElement a(nv var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", var1.a().getName());
      UUID var5 = var1.a().getId();
      var4.addProperty("uuid", var5 == null?"":var5.toString());
      var4.addProperty("expiresOn", ns.a.format(var1.b()));
      return var4;
   }

   public nv a(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if(var1.isJsonObject()) {
         JsonObject var4 = var1.getAsJsonObject();
         JsonElement var5 = var4.get("name");
         JsonElement var6 = var4.get("uuid");
         JsonElement var7 = var4.get("expiresOn");
         if(var5 != null && var6 != null) {
            String var8 = var6.getAsString();
            String var9 = var5.getAsString();
            Date var10 = null;
            if(var7 != null) {
               try {
                  var10 = ns.a.parse(var7.getAsString());
               } catch (ParseException var14) {
                  var10 = null;
               }
            }

            if(var9 != null && var8 != null) {
               UUID var11;
               try {
                  var11 = UUID.fromString(var8);
               } catch (Throwable var13) {
                  return null;
               }

               nv var12 = new nv(this.a, new GameProfile(var11, var9), var10, (nt)null);
               return var12;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.a((nv)var1, var2, var3);
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.a(var1, var2, var3);
   }

   // $FF: synthetic method
   nw(ns var1, nt var2) {
      this(var1);
   }
}
