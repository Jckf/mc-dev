import net.minecraft.server.MinecraftServer;

public class ov implements ac {

   public static final ov a = new ov();
   private StringBuffer b = new StringBuffer();


   public void e() {
      this.b.setLength(0);
   }

   public String f() {
      return this.b.toString();
   }

   public String b_() {
      return "Rcon";
   }

   public fj c_() {
      return new fq(this.b_());
   }

   public void a(fj var1) {
      this.b.append(var1.c());
   }

   public boolean a(int var1, String var2) {
      return true;
   }

   public r f_() {
      return new r(0, 0, 0);
   }

   public ahb d() {
      return MinecraftServer.I().d();
   }

}
