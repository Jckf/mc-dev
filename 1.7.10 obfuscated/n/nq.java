import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.server.MinecraftServer;

public class nq implements kh {

   private final MinecraftServer a;
   private final ej b;


   public nq(MinecraftServer var1, ej var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(fj var1) {}

   public void a(eo var1, eo var2) {
      if(var2 != eo.c) {
         throw new UnsupportedOperationException("Unexpected change in protocol to " + var2);
      }
   }

   public void a() {}

   public void a(kj var1) {
      this.b.a((ft)(new ka(this.a.ay())), new GenericFutureListener[0]);
   }

   public void a(ki var1) {
      this.b.a((ft)(new jz(var1.c())), new GenericFutureListener[0]);
   }
}
