import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;

final class of implements ProfileLookupCallback {

   // $FF: synthetic field
   final lt a;
   // $FF: synthetic field
   final File b;
   // $FF: synthetic field
   final File c;
   // $FF: synthetic field
   final File d;
   // $FF: synthetic field
   final String[] e;


   of(lt var1, File var2, File var3, File var4, String[] var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.a.ax().a(var1);
      UUID var2 = var1.getId();
      if(var2 == null) {
         throw new oh("Missing UUID for user profile " + var1.getName(), (oa)null);
      } else {
         this.a(this.b, this.a(var1), var2.toString());
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      nz.a().warn("Could not lookup user uuid for " + var1.getName(), (Throwable)var2);
      if(var2 instanceof ProfileNotFoundException) {
         String var3 = this.a(var1);
         this.a(this.c, var3, var3);
      } else {
         throw new oh("Could not request user " + var1.getName() + " from backend systems", var2, (oa)null);
      }
   }

   private void a(File var1, String var2, String var3) {
      File var4 = new File(this.d, var2 + ".dat");
      File var5 = new File(var1, var3 + ".dat");
      nz.a(var1);
      if(!var4.renameTo(var5)) {
         throw new oh("Could not convert file for " + var2, (oa)null);
      }
   }

   private String a(GameProfile var1) {
      String var2 = null;

      for(int var3 = 0; var3 < this.e.length; ++var3) {
         if(this.e[var3] != null && this.e[var3].equalsIgnoreCase(var1.getName())) {
            var2 = this.e[var3];
            break;
         }
      }

      if(var2 == null) {
         throw new oh("Could not find the filename for " + var1.getName() + " anymore", (oa)null);
      } else {
         return var2;
      }
   }
}
