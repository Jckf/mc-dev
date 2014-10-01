import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map.Entry;

public class fk implements JsonDeserializer, JsonSerializer {

   private static final Gson a;


   public fj a(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if(var1.isJsonPrimitive()) {
         return new fq(var1.getAsString());
      } else if(!var1.isJsonObject()) {
         if(var1.isJsonArray()) {
            JsonArray var11 = var1.getAsJsonArray();
            fj var12 = null;
            Iterator var14 = var11.iterator();

            while(var14.hasNext()) {
               JsonElement var16 = (JsonElement)var14.next();
               fj var17 = this.a(var16, (Type)var16.getClass(), var3);
               if(var12 == null) {
                  var12 = var17;
               } else {
                  var12.a(var17);
               }
            }

            return var12;
         } else {
            throw new JsonParseException("Don\'t know how to turn " + var1.toString() + " into a Component");
         }
      } else {
         JsonObject var4 = var1.getAsJsonObject();
         Object var5;
         if(var4.has("text")) {
            var5 = new fq(var4.get("text").getAsString());
         } else {
            if(!var4.has("translate")) {
               throw new JsonParseException("Don\'t know how to turn " + var1.toString() + " into a Component");
            }

            String var6 = var4.get("translate").getAsString();
            if(var4.has("with")) {
               JsonArray var7 = var4.getAsJsonArray("with");
               Object[] var8 = new Object[var7.size()];

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  var8[var9] = this.a(var7.get(var9), var2, var3);
                  if(var8[var9] instanceof fq) {
                     fq var10 = (fq)var8[var9];
                     if(var10.b().g() && var10.a().isEmpty()) {
                        var8[var9] = var10.g();
                     }
                  }
               }

               var5 = new fr(var6, var8);
            } else {
               var5 = new fr(var6, new Object[0]);
            }
         }

         if(var4.has("extra")) {
            JsonArray var13 = var4.getAsJsonArray("extra");
            if(var13.size() <= 0) {
               throw new JsonParseException("Unexpected empty array of components");
            }

            for(int var15 = 0; var15 < var13.size(); ++var15) {
               ((fj)var5).a(this.a(var13.get(var15), var2, var3));
            }
         }

         ((fj)var5).a((fn)var3.deserialize(var1, fn.class));
         return (fj)var5;
      }
   }

   private void a(fn var1, JsonObject var2, JsonSerializationContext var3) {
      JsonElement var4 = var3.serialize(var1);
      if(var4.isJsonObject()) {
         JsonObject var5 = (JsonObject)var4;
         Iterator var6 = var5.entrySet().iterator();

         while(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            var2.add((String)var7.getKey(), (JsonElement)var7.getValue());
         }
      }

   }

   public JsonElement a(fj var1, Type var2, JsonSerializationContext var3) {
      if(var1 instanceof fq && var1.b().g() && var1.a().isEmpty()) {
         return new JsonPrimitive(((fq)var1).g());
      } else {
         JsonObject var4 = new JsonObject();
         if(!var1.b().g()) {
            this.a(var1.b(), var4, var3);
         }

         if(!var1.a().isEmpty()) {
            JsonArray var5 = new JsonArray();
            Iterator var6 = var1.a().iterator();

            while(var6.hasNext()) {
               fj var7 = (fj)var6.next();
               var5.add(this.a(var7, (Type)var7.getClass(), var3));
            }

            var4.add("extra", var5);
         }

         if(var1 instanceof fq) {
            var4.addProperty("text", ((fq)var1).g());
         } else {
            if(!(var1 instanceof fr)) {
               throw new IllegalArgumentException("Don\'t know how to serialize " + var1 + " as a Component");
            }

            fr var11 = (fr)var1;
            var4.addProperty("translate", var11.i());
            if(var11.j() != null && var11.j().length > 0) {
               JsonArray var12 = new JsonArray();
               Object[] var13 = var11.j();
               int var8 = var13.length;

               for(int var9 = 0; var9 < var8; ++var9) {
                  Object var10 = var13[var9];
                  if(var10 instanceof fj) {
                     var12.add(this.a((fj)var10, (Type)var10.getClass(), var3));
                  } else {
                     var12.add(new JsonPrimitive(String.valueOf(var10)));
                  }
               }

               var4.add("with", var12);
            }
         }

         return var4;
      }
   }

   public static String a(fj var0) {
      return a.toJson((Object)var0);
   }

   public static fj a(String var0) {
      return (fj)a.fromJson(var0, fj.class);
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.a((fj)var1, var2, var3);
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.a(var1, var2, var3);
   }

   static {
      GsonBuilder var0 = new GsonBuilder();
      var0.registerTypeHierarchyAdapter(fj.class, new fk());
      var0.registerTypeHierarchyAdapter(fn.class, new fp());
      var0.registerTypeAdapterFactory(new qf());
      a = var0.create();
   }
}
