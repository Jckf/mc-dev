import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.server.MinecraftServer;

public class nl implements jq {

   private final MinecraftServer a;
   private final ej b;


   public nl(MinecraftServer var1, ej var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(jp var1) {
      switch(nm.a[var1.c().ordinal()]) {
      case 1:
         this.b.a(eo.d);
         fq var2;
         if(var1.d() > 5) {
            var2 = new fq("Outdated server! I\'m still on 1.7.10");
            this.b.a((ft)(new ju(var2)), new GenericFutureListener[0]);
            this.b.a((fj)var2);
         } else if(var1.d() < 5) {
            var2 = new fq("Outdated client! Please use 1.7.10");
            this.b.a((ft)(new ju(var2)), new GenericFutureListener[0]);
            this.b.a((fj)var2);
         } else {
            this.b.a((fb)(new nn(this.a, this.b)));
         }
         break;
      case 2:
         this.b.a(eo.c);
         this.b.a((fb)(new nq(this.a, this.b)));
         break;
      default:
         throw new UnsupportedOperationException("Invalid intention " + var1.c());
      }

   }

   public void a(fj var1) {}

   public void a(eo var1, eo var2) {
      if(var2 != eo.d && var2 != eo.c) {
         throw new UnsupportedOperationException("Invalid state " + var2);
      }
   }

   public void a() {}
}
