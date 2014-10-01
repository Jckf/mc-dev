import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

public class bl extends z implements x {

   public bl() {
      this.a(new bz());
      this.a(new ar());
      this.a(new aq());
      this.a(new al());
      this.a(new aw());
      this.a(new ca());
      this.a(new cb());
      this.a(new ap());
      this.a(new bv());
      this.a(new at());
      this.a(new am());
      this.a(new ao());
      this.a(new an());
      this.a(new bq());
      this.a(new au());
      this.a(new ak());
      this.a(new az());
      this.a(new ah());
      this.a(new bp());
      this.a(new bn());
      this.a(new as());
      this.a(new ai());
      this.a(new by());
      this.a(new br());
      this.a(new bf());
      this.a(new bk());
      this.a(new ae());
      this.a(new bu());
      this.a(new bm());
      this.a(new bx());
      this.a(new ba());
      if(MinecraftServer.I().X()) {
         this.a(new bc());
         this.a(new aj());
         this.a(new bt());
         this.a(new bh());
         this.a(new bi());
         this.a(new bj());
         this.a(new af());
         this.a(new bd());
         this.a(new ag());
         this.a(new ax());
         this.a(new be());
         this.a(new av());
         this.a(new ay());
         this.a(new cc());
         this.a(new bo());
         this.a(new bb());
      } else {
         this.a(new bg());
      }

      y.a((x)this);
   }

   public void a(ac var1, aa var2, int var3, String var4, Object ... var5) {
      boolean var6 = true;
      if(var1 instanceof agp && !MinecraftServer.I().c[0].O().b("commandBlockOutput")) {
         var6 = false;
      }

      fr var7 = new fr("chat.type.admin", new Object[]{var1.b_(), new fr(var4, var5)});
      var7.b().a(a.h);
      var7.b().b(Boolean.valueOf(true));
      if(var6) {
         Iterator var8 = MinecraftServer.I().ah().e.iterator();

         while(var8.hasNext()) {
            yz var9 = (yz)var8.next();
            if(var9 != var1 && MinecraftServer.I().ah().g(var9.bJ()) && var2.a(var9) && (!(var1 instanceof ov) || MinecraftServer.I().m())) {
               var9.a((fj)var7);
            }
         }
      }

      if(var1 != MinecraftServer.I()) {
         MinecraftServer.I().a((fj)var7);
      }

      if((var3 & 1) != 1) {
         var1.a(new fr(var4, var5));
      }

   }
}
