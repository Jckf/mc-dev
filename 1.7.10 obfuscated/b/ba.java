import com.google.gson.JsonParseException;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class ba extends y {

   public String c() {
      return "tellraw";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.tellraw.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 2) {
         throw new ci("commands.tellraw.usage", new Object[0]);
      } else {
         mw var3 = d(var1, var2[0]);
         String var4 = b(var1, var2, 1);

         try {
            fj var5 = fk.a(var4);
            var3.a(var5);
         } catch (JsonParseException var7) {
            Throwable var6 = ExceptionUtils.getRootCause(var7);
            throw new cf("commands.tellraw.jsonException", new Object[]{var6 == null?"":var6.getMessage()});
         }
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, MinecraftServer.I().E()):null;
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
