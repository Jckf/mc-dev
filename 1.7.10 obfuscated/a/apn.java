import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class apn extends aor {

   private int a;
   private int i;
   private GameProfile j = null;


   public void b(dh var1) {
      super.b(var1);
      var1.a("SkullType", (byte)(this.a & 255));
      var1.a("Rot", (byte)(this.i & 255));
      if(this.j != null) {
         dh var2 = new dh();
         dv.a(var2, this.j);
         var1.a("Owner", (dy)var2);
      }

   }

   public void a(dh var1) {
      super.a(var1);
      this.a = var1.d("SkullType");
      this.i = var1.d("Rot");
      if(this.a == 3) {
         if(var1.b("Owner", 10)) {
            this.j = dv.a(var1.m("Owner"));
         } else if(var1.b("ExtraType", 8) && !qn.b(var1.j("ExtraType"))) {
            this.j = new GameProfile((UUID)null, var1.j("ExtraType"));
            this.d();
         }
      }

   }

   public GameProfile a() {
      return this.j;
   }

   public ft m() {
      dh var1 = new dh();
      this.b(var1);
      return new gf(this.c, this.d, this.e, 4, var1);
   }

   public void a(int var1) {
      this.a = var1;
      this.j = null;
   }

   public void a(GameProfile var1) {
      this.a = 3;
      this.j = var1;
      this.d();
   }

   private void d() {
      if(this.j != null && !qn.b(this.j.getName())) {
         if(!this.j.isComplete() || !this.j.getProperties().containsKey("textures")) {
            GameProfile var1 = MinecraftServer.I().ax().a(this.j.getName());
            if(var1 != null) {
               Property var2 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Object)null);
               if(var2 == null) {
                  var1 = MinecraftServer.I().av().fillProfileProperties(var1, true);
               }

               this.j = var1;
               this.e();
            }
         }
      }
   }

   public int b() {
      return this.a;
   }

   public void b(int var1) {
      this.i = var1;
   }
}
