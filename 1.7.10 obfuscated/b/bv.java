import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bv extends y {

   public String c() {
      return "tp";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.tp.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 1) {
         throw new ci("commands.tp.usage", new Object[0]);
      } else {
         mw var3;
         if(var2.length != 2 && var2.length != 4) {
            var3 = b(var1);
         } else {
            var3 = d(var1, var2[0]);
            if(var3 == null) {
               throw new cg();
            }
         }

         if(var2.length != 3 && var2.length != 4) {
            if(var2.length == 1 || var2.length == 2) {
               mw var11 = d(var1, var2[var2.length - 1]);
               if(var11 == null) {
                  throw new cg();
               }

               if(var11.o != var3.o) {
                  a(var1, this, "commands.tp.notSameDimension", new Object[0]);
                  return;
               }

               var3.a((sa)null);
               var3.a.a(var11.s, var11.t, var11.u, var11.y, var11.z);
               a(var1, this, "commands.tp.success", new Object[]{var3.b_(), var11.b_()});
            }
         } else if(var3.o != null) {
            int var4 = var2.length - 3;
            double var5 = a(var1, var3.s, var2[var4++]);
            double var7 = a(var1, var3.t, var2[var4++], 0, 0);
            double var9 = a(var1, var3.u, var2[var4++]);
            var3.a((sa)null);
            var3.a(var5, var7, var9);
            a(var1, this, "commands.tp.success.coordinates", new Object[]{var3.b_(), Double.valueOf(var5), Double.valueOf(var7), Double.valueOf(var9)});
         }

      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length != 1 && var2.length != 2?null:a(var2, MinecraftServer.I().E());
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
