import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class ke implements JsonDeserializer, JsonSerializer {

   public kb a(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = pu.l(var1, "status");
      kb var5 = new kb();
      if(var4.has("description")) {
         var5.a((fj)var3.deserialize(var4.get("description"), fj.class));
      }

      if(var4.has("players")) {
         var5.a((kc)var3.deserialize(var4.get("players"), kc.class));
      }

      if(var4.has("version")) {
         var5.a((kf)var3.deserialize(var4.get("version"), kf.class));
      }

      if(var4.has("favicon")) {
         var5.a(pu.h(var4, "favicon"));
      }

      return var5;
   }

   public JsonElement a(kb var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      if(var1.a() != null) {
         var4.add("description", var3.serialize(var1.a()));
      }

      if(var1.b() != null) {
         var4.add("players", var3.serialize(var1.b()));
      }

      if(var1.c() != null) {
         var4.add("version", var3.serialize(var1.c()));
      }

      if(var1.d() != null) {
         var4.addProperty("favicon", var1.d());
      }

      return var4;
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.a((kb)var1, var2, var3);
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.a(var1, var2, var3);
   }
}
