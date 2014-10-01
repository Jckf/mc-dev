import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

final class ob implements ProfileLookupCallback {

   // $FF: synthetic field
   final MinecraftServer a;
   // $FF: synthetic field
   final Map b;
   // $FF: synthetic field
   final op c;


   ob(MinecraftServer var1, Map var2, op var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.a.ax().a(var1);
      String[] var2 = (String[])this.b.get(var1.getName().toLowerCase(Locale.ROOT));
      if(var2 == null) {
         nz.a().warn("Could not convert user banlist entry for " + var1.getName());
         throw new oh("Profile not in the conversionlist", (oa)null);
      } else {
         Date var3 = var2.length > 1?nz.a(var2[1], (Date)null):null;
         String var4 = var2.length > 2?var2[2]:null;
         Date var5 = var2.length > 3?nz.a(var2[3], (Date)null):null;
         String var6 = var2.length > 4?var2[4]:null;
         this.c.a((ol)(new oq(var1, var3, var4, var5, var6)));
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      nz.a().warn("Could not lookup user banlist entry for " + var1.getName(), (Throwable)var2);
      if(!(var2 instanceof ProfileNotFoundException)) {
         throw new oh("Could not request user " + var1.getName() + " from backend systems", var2, (oa)null);
      }
   }
}
