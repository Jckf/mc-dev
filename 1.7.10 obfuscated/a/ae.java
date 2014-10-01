import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ae extends y {

   public String c() {
      return "achievement";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.achievement.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 2) {
         ph var3 = pp.a(var2[1]);
         if(var3 == null && !var2[1].equals("*")) {
            throw new cd("commands.achievement.unknownAchievement", new Object[]{var2[1]});
         }

         mw var4;
         if(var2.length >= 3) {
            var4 = d(var1, var2[2]);
         } else {
            var4 = b(var1);
         }

         if(var2[0].equalsIgnoreCase("give")) {
            if(var3 == null) {
               Iterator var5 = pc.e.iterator();

               while(var5.hasNext()) {
                  pb var6 = (pb)var5.next();
                  var4.a((ph)var6);
               }

               a(var1, this, "commands.achievement.give.success.all", new Object[]{var4.b_()});
            } else {
               if(var3 instanceof pb) {
                  pb var9 = (pb)var3;

                  ArrayList var10;
                  for(var10 = Lists.newArrayList(); var9.c != null && !var4.w().a(var9.c); var9 = var9.c) {
                     var10.add(var9.c);
                  }

                  Iterator var7 = Lists.reverse(var10).iterator();

                  while(var7.hasNext()) {
                     pb var8 = (pb)var7.next();
                     var4.a((ph)var8);
                  }
               }

               var4.a(var3);
               a(var1, this, "commands.achievement.give.success.one", new Object[]{var4.b_(), var3.j()});
            }

            return;
         }
      }

      throw new ci("commands.achievement.usage", new Object[0]);
   }

   public List a(ac var1, String[] var2) {
      if(var2.length == 1) {
         return a(var2, new String[]{"give"});
      } else if(var2.length != 2) {
         return var2.length == 3?a(var2, MinecraftServer.I().E()):null;
      } else {
         ArrayList var3 = Lists.newArrayList();
         Iterator var4 = pp.b.iterator();

         while(var4.hasNext()) {
            ph var5 = (ph)var4.next();
            var3.add(var5.e);
         }

         return a(var2, var3);
      }
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 2;
   }
}
