import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ahy {

   private final aib a;
   private long b;
   private qd c = new qd();
   private List d = new ArrayList();


   public ahy(aib var1) {
      this.a = var1;
   }

   public ahz a(int var1, int var2) {
      var1 >>= 4;
      var2 >>= 4;
      long var3 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      ahz var5 = (ahz)this.c.a(var3);
      if(var5 == null) {
         var5 = new ahz(this, var1, var2);
         this.c.a(var3, var5);
         this.d.add(var5);
      }

      var5.e = MinecraftServer.ar();
      return var5;
   }

   public ahu b(int var1, int var2) {
      return this.a(var1, var2).a(var1, var2);
   }

   public void a() {
      long var1 = MinecraftServer.ar();
      long var3 = var1 - this.b;
      if(var3 > 7500L || var3 < 0L) {
         this.b = var1;

         for(int var5 = 0; var5 < this.d.size(); ++var5) {
            ahz var6 = (ahz)this.d.get(var5);
            long var7 = var1 - var6.e;
            if(var7 > 30000L || var7 < 0L) {
               this.d.remove(var5--);
               long var9 = (long)var6.c & 4294967295L | ((long)var6.d & 4294967295L) << 32;
               this.c.d(var9);
            }
         }
      }

   }

   public ahu[] d(int var1, int var2) {
      return this.a(var1, var2).b;
   }

   // $FF: synthetic method
   static aib a(ahy var0) {
      return var0.a;
   }
}
