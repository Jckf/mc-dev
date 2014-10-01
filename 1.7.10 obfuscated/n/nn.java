import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.GenericFutureListener;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nn implements jv {

   private static final AtomicInteger b = new AtomicInteger(0);
   private static final Logger c = LogManager.getLogger();
   private static final Random d = new Random();
   private final byte[] e = new byte[4];
   private final MinecraftServer f;
   public final ej a;
   private np g;
   private int h;
   private GameProfile i;
   private String j;
   private SecretKey k;


   public nn(MinecraftServer var1, ej var2) {
      this.g = np.a;
      this.j = "";
      this.f = var1;
      this.a = var2;
      d.nextBytes(this.e);
   }

   public void a() {
      if(this.g == np.d) {
         this.c();
      }

      if(this.h++ == 600) {
         this.a("Took too long to log in");
      }

   }

   public void a(String var1) {
      try {
         c.info("Disconnecting " + this.d() + ": " + var1);
         fq var2 = new fq(var1);
         this.a.a((ft)(new ju(var2)), new GenericFutureListener[0]);
         this.a.a((fj)var2);
      } catch (Exception var3) {
         c.error("Error whilst disconnecting player", (Throwable)var3);
      }

   }

   public void c() {
      if(!this.i.isComplete()) {
         this.i = this.a(this.i);
      }

      String var1 = this.f.ah().a(this.a.b(), this.i);
      if(var1 != null) {
         this.a(var1);
      } else {
         this.g = np.e;
         this.a.a((ft)(new js(this.i)), new GenericFutureListener[0]);
         this.f.ah().a(this.a, this.f.ah().f(this.i));
      }

   }

   public void a(fj var1) {
      c.info(this.d() + " lost connection: " + var1.c());
   }

   public String d() {
      return this.i != null?this.i.toString() + " (" + this.a.b().toString() + ")":String.valueOf(this.a.b());
   }

   public void a(eo var1, eo var2) {
      Validate.validState(this.g == np.e || this.g == np.a, "Unexpected change in protocol", new Object[0]);
      Validate.validState(var2 == eo.b || var2 == eo.d, "Unexpected protocol " + var2, new Object[0]);
   }

   public void a(jw var1) {
      Validate.validState(this.g == np.a, "Unexpected hello packet", new Object[0]);
      this.i = var1.c();
      if(this.f.Y() && !this.a.c()) {
         this.g = np.b;
         this.a.a((ft)(new jt(this.j, this.f.K().getPublic(), this.e)), new GenericFutureListener[0]);
      } else {
         this.g = np.d;
      }

   }

   public void a(jx var1) {
      Validate.validState(this.g == np.b, "Unexpected key packet", new Object[0]);
      PrivateKey var2 = this.f.K().getPrivate();
      if(!Arrays.equals(this.e, var1.b(var2))) {
         throw new IllegalStateException("Invalid nonce!");
      } else {
         this.k = var1.a(var2);
         this.g = np.c;
         this.a.a(this.k);
         (new no(this, "User Authenticator #" + b.incrementAndGet())).start();
      }
   }

   protected GameProfile a(GameProfile var1) {
      UUID var2 = UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1.getName()).getBytes(Charsets.UTF_8));
      return new GameProfile(var2, var1.getName());
   }

   // $FF: synthetic method
   static GameProfile a(nn var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static String b(nn var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static MinecraftServer c(nn var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static SecretKey d(nn var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static GameProfile a(nn var0, GameProfile var1) {
      return var0.i = var1;
   }

   // $FF: synthetic method
   static Logger e() {
      return c;
   }

   // $FF: synthetic method
   static np a(nn var0, np var1) {
      return var0.g = var1;
   }

}
