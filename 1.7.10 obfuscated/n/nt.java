import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

final class nt implements ProfileLookupCallback {

   // $FF: synthetic field
   final GameProfile[] a;


   nt(GameProfile[] var1) {
      this.a = var1;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.a[0] = var1;
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.a[0] = null;
   }
}
