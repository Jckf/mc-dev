import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

public class or extends om {

   public or(File var1) {
      super(var1);
   }

   protected ol a(JsonObject var1) {
      return new os(var1);
   }

   public boolean a(GameProfile var1) {
      return this.d(var1);
   }

   public String[] a() {
      String[] var1 = new String[this.e().size()];
      int var2 = 0;

      os var4;
      for(Iterator var3 = this.e().values().iterator(); var3.hasNext(); var1[var2++] = ((GameProfile)var4.f()).getName()) {
         var4 = (os)var3.next();
      }

      return var1;
   }

   protected String b(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile a(String var1) {
      Iterator var2 = this.e().values().iterator();

      os var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (os)var2.next();
      } while(!var1.equalsIgnoreCase(((GameProfile)var3.f()).getName()));

      return (GameProfile)var3.f();
   }

   // $FF: synthetic method
   protected String a(Object var1) {
      return this.b((GameProfile)var1);
   }
}
