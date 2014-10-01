import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ax extends y {

   public String c() {
      return "banlist";
   }

   public int a() {
      return 3;
   }

   public boolean a(ac var1) {
      return (MinecraftServer.I().ah().i().b() || MinecraftServer.I().ah().h().b()) && super.a(var1);
   }

   public String c(ac var1) {
      return "commands.banlist.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 1 && var2[0].equalsIgnoreCase("ips")) {
         var1.a(new fr("commands.banlist.ips", new Object[]{Integer.valueOf(MinecraftServer.I().ah().i().a().length)}));
         var1.a(new fq(a(MinecraftServer.I().ah().i().a())));
      } else {
         var1.a(new fr("commands.banlist.players", new Object[]{Integer.valueOf(MinecraftServer.I().ah().h().a().length)}));
         var1.a(new fq(a(MinecraftServer.I().ah().h().a())));
      }

   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, new String[]{"players", "ips"}):null;
   }
}
