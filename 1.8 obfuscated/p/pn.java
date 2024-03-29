import com.mojang.authlib.GameProfile;
import java.io.IOException;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pn extends sn {

   private static final Logger h = LogManager.getLogger();


   public pn(po var1) {
      super(var1);
      this.a(var1.a("view-distance", 10));
      this.g = var1.a("max-players", 20);
      this.a(var1.a("white-list", false));
      if(!var1.S()) {
         this.i().a(true);
         this.j().a(true);
      }

      this.z();
      this.x();
      this.y();
      this.w();
      this.A();
      this.C();
      this.B();
      if(!this.l().c().exists()) {
         this.D();
      }

   }

   public void a(boolean var1) {
      super.a(var1);
      this.b().a("white-list", (Object)Boolean.valueOf(var1));
      this.b().a();
   }

   public void a(GameProfile var1) {
      super.a(var1);
      this.B();
   }

   public void b(GameProfile var1) {
      super.b(var1);
      this.B();
   }

   public void c(GameProfile var1) {
      super.c(var1);
      this.D();
   }

   public void d(GameProfile var1) {
      super.d(var1);
      this.D();
   }

   public void a() {
      this.C();
   }

   private void w() {
      try {
         this.j().f();
      } catch (IOException var2) {
         h.warn("Failed to save ip banlist: ", (Throwable)var2);
      }

   }

   private void x() {
      try {
         this.i().f();
      } catch (IOException var2) {
         h.warn("Failed to save user banlist: ", (Throwable)var2);
      }

   }

   private void y() {
      try {
         this.j().g();
      } catch (IOException var2) {
         h.warn("Failed to load ip banlist: ", (Throwable)var2);
      }

   }

   private void z() {
      try {
         this.i().g();
      } catch (IOException var2) {
         h.warn("Failed to load user banlist: ", (Throwable)var2);
      }

   }

   private void A() {
      try {
         this.n().g();
      } catch (Exception var2) {
         h.warn("Failed to load operators list: ", (Throwable)var2);
      }

   }

   private void B() {
      try {
         this.n().f();
      } catch (Exception var2) {
         h.warn("Failed to save operators list: ", (Throwable)var2);
      }

   }

   private void C() {
      try {
         this.l().g();
      } catch (Exception var2) {
         h.warn("Failed to load white-list: ", (Throwable)var2);
      }

   }

   private void D() {
      try {
         this.l().f();
      } catch (Exception var2) {
         h.warn("Failed to save white-list: ", (Throwable)var2);
      }

   }

   public boolean e(GameProfile var1) {
      return !this.s() || this.g(var1) || this.l().a(var1);
   }

   public po b() {
      return (po)super.c();
   }

   // $FF: synthetic method
   public MinecraftServer c() {
      return this.b();
   }

}
