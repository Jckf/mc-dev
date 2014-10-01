import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.server.MinecraftServer;

public abstract class agp implements ac {

   private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
   private int b;
   private boolean c = true;
   private fj d = null;
   private String e = "";
   private String f = "@";


   public int g() {
      return this.b;
   }

   public fj h() {
      return this.d;
   }

   public void a(dh var1) {
      var1.a("Command", this.e);
      var1.a("SuccessCount", this.b);
      var1.a("CustomName", this.f);
      if(this.d != null) {
         var1.a("LastOutput", fk.a(this.d));
      }

      var1.a("TrackOutput", this.c);
   }

   public void b(dh var1) {
      this.e = var1.j("Command");
      this.b = var1.f("SuccessCount");
      if(var1.b("CustomName", 8)) {
         this.f = var1.j("CustomName");
      }

      if(var1.b("LastOutput", 8)) {
         this.d = fk.a(var1.j("LastOutput"));
      }

      if(var1.b("TrackOutput", 1)) {
         this.c = var1.n("TrackOutput");
      }

   }

   public boolean a(int var1, String var2) {
      return var1 <= 2;
   }

   public void a(String var1) {
      this.e = var1;
   }

   public String i() {
      return this.e;
   }

   public void a(ahb var1) {
      if(var1.E) {
         this.b = 0;
      }

      MinecraftServer var2 = MinecraftServer.I();
      if(var2 != null && var2.ad()) {
         ab var3 = var2.J();
         this.b = var3.a(this, this.e);
      } else {
         this.b = 0;
      }

   }

   public String b_() {
      return this.f;
   }

   public fj c_() {
      return new fq(this.b_());
   }

   public void b(String var1) {
      this.f = var1;
   }

   public void a(fj var1) {
      if(this.c && this.d() != null && !this.d().E) {
         this.d = (new fq("[" + a.format(new Date()) + "] ")).a(var1);
         this.e();
      }

   }

   public abstract void e();

   public void b(fj var1) {
      this.d = var1;
   }

}
