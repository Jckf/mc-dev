import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;
import java.util.UUID;

class no extends Thread {

   // $FF: synthetic field
   final nn a;


   no(nn var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      GameProfile var1 = nn.a(this.a);

      try {
         String var2 = (new BigInteger(pt.a(nn.b(this.a), nn.c(this.a).K().getPublic(), nn.d(this.a)))).toString(16);
         nn.a(this.a, nn.c(this.a).av().hasJoinedServer(new GameProfile((UUID)null, var1.getName()), var2));
         if(nn.a(this.a) != null) {
            nn.e().info("UUID of player " + nn.a(this.a).getName() + " is " + nn.a(this.a).getId());
            nn.a(this.a, np.d);
         } else if(nn.c(this.a).N()) {
            nn.e().warn("Failed to verify username but will let them in anyway!");
            nn.a(this.a, this.a.a(var1));
            nn.a(this.a, np.d);
         } else {
            this.a.a("Failed to verify username!");
            nn.e().error("Username \'" + nn.a(this.a).getName() + "\' tried to join with an invalid session");
         }
      } catch (AuthenticationUnavailableException var3) {
         if(nn.c(this.a).N()) {
            nn.e().warn("Authentication servers are down but will let them in anyway!");
            nn.a(this.a, this.a.a(var1));
            nn.a(this.a, np.d);
         } else {
            this.a.a("Authentication servers are down. Please try again later, sorry!");
            nn.e().error("Couldn\'t verify username because servers are unavailable");
         }
      }

   }
}
