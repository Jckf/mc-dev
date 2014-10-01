import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.UUID;

public final class dv {

   public static GameProfile a(dh var0) {
      String var1 = null;
      String var2 = null;
      if(var0.b("Name", 8)) {
         var1 = var0.j("Name");
      }

      if(var0.b("Id", 8)) {
         var2 = var0.j("Id");
      }

      if(qn.b(var1) && qn.b(var2)) {
         return null;
      } else {
         UUID var3;
         try {
            var3 = UUID.fromString(var2);
         } catch (Throwable var12) {
            var3 = null;
         }

         GameProfile var4 = new GameProfile(var3, var1);
         if(var0.b("Properties", 10)) {
            dh var5 = var0.m("Properties");
            Iterator var6 = var5.c().iterator();

            while(var6.hasNext()) {
               String var7 = (String)var6.next();
               dq var8 = var5.c(var7, 10);

               for(int var9 = 0; var9 < var8.c(); ++var9) {
                  dh var10 = var8.b(var9);
                  String var11 = var10.j("Value");
                  if(var10.b("Signature", 8)) {
                     var4.getProperties().put(var7, new Property(var7, var11, var10.j("Signature")));
                  } else {
                     var4.getProperties().put(var7, new Property(var7, var11));
                  }
               }
            }
         }

         return var4;
      }
   }

   public static void a(dh var0, GameProfile var1) {
      if(!qn.b(var1.getName())) {
         var0.a("Name", var1.getName());
      }

      if(var1.getId() != null) {
         var0.a("Id", var1.getId().toString());
      }

      if(!var1.getProperties().isEmpty()) {
         dh var2 = new dh();
         Iterator var3 = var1.getProperties().keySet().iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            dq var5 = new dq();

            dh var8;
            for(Iterator var6 = var1.getProperties().get(var4).iterator(); var6.hasNext(); var5.a((dy)var8)) {
               Property var7 = (Property)var6.next();
               var8 = new dh();
               var8.a("Value", var7.getValue());
               if(var7.hasSignature()) {
                  var8.a("Signature", var7.getSignature());
               }
            }

            var2.a(var4, (dy)var5);
         }

         var0.a("Properties", (dy)var2);
      }

   }
}
