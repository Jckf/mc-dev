import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ao extends y {

   public String c() {
      return "enchant";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.enchant.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 2) {
         throw new ci("commands.enchant.usage", new Object[0]);
      } else {
         mw var3 = d(var1, var2[0]);
         int var4 = a(var1, var2[1], 0, aft.b.length - 1);
         int var5 = 1;
         add var6 = var3.bF();
         if(var6 == null) {
            throw new cd("commands.enchant.noItem", new Object[0]);
         } else {
            aft var7 = aft.b[var4];
            if(var7 == null) {
               throw new ce("commands.enchant.notFound", new Object[]{Integer.valueOf(var4)});
            } else if(!var7.a(var6)) {
               throw new cd("commands.enchant.cantEnchant", new Object[0]);
            } else {
               if(var2.length >= 3) {
                  var5 = a(var1, var2[2], var7.d(), var7.b());
               }

               if(var6.p()) {
                  dq var8 = var6.r();
                  if(var8 != null) {
                     for(int var9 = 0; var9 < var8.c(); ++var9) {
                        short var10 = var8.b(var9).e("id");
                        if(aft.b[var10] != null) {
                           aft var11 = aft.b[var10];
                           if(!var11.a(var7)) {
                              throw new cd("commands.enchant.cantCombine", new Object[]{var7.c(var5), var11.c(var8.b(var9).e("lvl"))});
                           }
                        }
                     }
                  }
               }

               var6.a(var7, var5);
               a(var1, this, "commands.enchant.success", new Object[0]);
            }
         }
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, this.d()):null;
   }

   protected String[] d() {
      return MinecraftServer.I().E();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
