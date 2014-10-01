import com.mojang.authlib.GameProfile;
import java.util.Date;

class nv {

   private final GameProfile b;
   private final Date c;
   // $FF: synthetic field
   final ns a;


   private nv(ns var1, GameProfile var2, Date var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public GameProfile a() {
      return this.b;
   }

   public Date b() {
      return this.c;
   }

   // $FF: synthetic method
   nv(ns var1, GameProfile var2, Date var3, nt var4) {
      this(var1, var2, var3);
   }

   // $FF: synthetic method
   static Date a(nv var0) {
      return var0.c;
   }
}
