import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bc extends y {

   public String c() {
      return "op";
   }

   public int a() {
      return 3;
   }

   public String c(ac var1) {
      return "commands.op.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length == 1 && var2[0].length() > 0) {
         MinecraftServer var3 = MinecraftServer.I();
         GameProfile var4 = var3.ax().a(var2[0]);
         if(var4 == null) {
            throw new cd("commands.op.failed", new Object[]{var2[0]});
         } else {
            var3.ah().a(var4);
            a(var1, this, "commands.op.success", new Object[]{var2[0]});
         }
      } else {
         throw new ci("commands.op.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      if(var2.length == 1) {
         String var3 = var2[var2.length - 1];
         ArrayList var4 = new ArrayList();
         GameProfile[] var5 = MinecraftServer.I().F();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            GameProfile var8 = var5[var7];
            if(!MinecraftServer.I().ah().g(var8) && a(var3, var8.getName())) {
               var4.add(var8.getName());
            }
         }

         return var4;
      } else {
         return null;
      }
   }
}
