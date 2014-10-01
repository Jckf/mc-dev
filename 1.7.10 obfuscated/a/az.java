import java.util.Arrays;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class az extends y {

   public List b() {
      return Arrays.asList(new String[]{"w", "msg"});
   }

   public String c() {
      return "tell";
   }

   public int a() {
      return 0;
   }

   public String c(ac var1) {
      return "commands.message.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 2) {
         throw new ci("commands.message.usage", new Object[0]);
      } else {
         mw var3 = d(var1, var2[0]);
         if(var3 == null) {
            throw new cg();
         } else if(var3 == var1) {
            throw new cg("commands.message.sameTarget", new Object[0]);
         } else {
            fj var4 = a(var1, var2, 1, !(var1 instanceof yz));
            fr var5 = new fr("commands.message.display.incoming", new Object[]{var1.c_(), var4.f()});
            fr var6 = new fr("commands.message.display.outgoing", new Object[]{var3.c_(), var4.f()});
            var5.b().a(a.h).b(Boolean.valueOf(true));
            var6.b().a(a.h).b(Boolean.valueOf(true));
            var3.a((fj)var5);
            var1.a(var6);
         }
      }
   }

   public List a(ac var1, String[] var2) {
      return a(var2, MinecraftServer.I().E());
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
