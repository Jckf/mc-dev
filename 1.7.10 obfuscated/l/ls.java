import com.mojang.authlib.GameProfile;
import java.io.IOException;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ls extends oi {

   private static final Logger g = LogManager.getLogger();


   public ls(lt var1) {
      super(var1);
      this.a(var1.a("view-distance", 10));
      this.f = var1.a("max-players", 20);
      this.a(var1.a("white-list", false));
      if(!var1.N()) {
         this.h().a(true);
         this.i().a(true);
      }

      this.y();
      this.w();
      this.x();
      this.v();
      this.z();
      this.B();
      this.A();
      if(!this.k().c().exists()) {
         this.C();
      }

   }

   public void a(boolean var1) {
      super.a(var1);
      this.b().a("white-list", (Object)Boolean.valueOf(var1));
      this.b().a();
   }

   public void a(GameProfile var1) {
      super.a(var1);
      this.A();
   }

   public void b(GameProfile var1) {
      super.b(var1);
      this.A();
   }

   public void c(GameProfile var1) {
      super.c(var1);
      this.C();
   }

   public void d(GameProfile var1) {
      super.d(var1);
      this.C();
   }

   public void a() {
      this.B();
   }

   private void v() {
      try {
         this.i().f();
      } catch (IOException var2) {
         g.warn("Failed to save ip banlist: ", (Throwable)var2);
      }

   }

   private void w() {
      try {
         this.h().f();
      } catch (IOException var2) {
         g.warn("Failed to save user banlist: ", (Throwable)var2);
      }

   }

   private void x() {
      try {
         this.i().g();
      } catch (IOException var2) {
         g.warn("Failed to load ip banlist: ", (Throwable)var2);
      }

   }

   private void y() {
      try {
         this.h().g();
      } catch (IOException var2) {
         g.warn("Failed to load user banlist: ", (Throwable)var2);
      }

   }

   private void z() {
      try {
         this.m().g();
      } catch (Exception var2) {
         g.warn("Failed to load operators list: ", (Throwable)var2);
      }

   }

   private void A() {
      try {
         this.m().f();
      } catch (Exception var2) {
         g.warn("Failed to save operators list: ", (Throwable)var2);
      }

   }

   private void B() {
      try {
         this.k().g();
      } catch (Exception var2) {
         g.warn("Failed to load white-list: ", (Throwable)var2);
      }

   }

   private void C() {
      try {
         this.k().f();
      } catch (Exception var2) {
         g.warn("Failed to save white-list: ", (Throwable)var2);
      }

   }

   public boolean e(GameProfile var1) {
      return !this.r() || this.g(var1) || this.k().a(var1);
   }

   public lt b() {
      return (lt)super.c();
   }

   // $FF: synthetic method
   public MinecraftServer c() {
      return this.b();
   }

}
