import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import net.minecraft.server.MinecraftServer;

final class od implements ProfileLookupCallback {

   // $FF: synthetic field
   final MinecraftServer a;
   // $FF: synthetic field
   final or b;


   od(MinecraftServer var1, or var2) {
      this.a = var1;
      this.b = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.a.ax().a(var1);
      this.b.a((ol)(new os(var1)));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      nz.a().warn("Could not lookup user whitelist entry for " + var1.getName(), (Throwable)var2);
      if(!(var2 instanceof ProfileNotFoundException)) {
         throw new oh("Could not request user " + var1.getName() + " from backend systems", var2, (oa)null);
      }
   }
}
