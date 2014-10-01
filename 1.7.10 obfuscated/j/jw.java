import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class jw extends ft {

   private GameProfile a;


   public jw() {}

   public jw(GameProfile var1) {
      this.a = var1;
   }

   public void a(et var1) {
      this.a = new GameProfile((UUID)null, var1.c(16));
   }

   public void b(et var1) {
      var1.a(this.a.getName());
   }

   public void a(jv var1) {
      var1.a(this);
   }

   public GameProfile c() {
      return this.a;
   }
}
