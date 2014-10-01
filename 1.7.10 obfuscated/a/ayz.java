import java.util.concurrent.Callable;

class ayz implements Callable {

   // $FF: synthetic field
   final ays a;


   ayz(ays var1) {
      this.a = var1;
   }

   public String a() {
      String var1 = "Unknown?";

      try {
         switch(ays.j(this.a)) {
         case 19132:
            var1 = "McRegion";
            break;
         case 19133:
            var1 = "Anvil";
         }
      } catch (Throwable var3) {
         ;
      }

      return String.format("0x%05X - %s", new Object[]{Integer.valueOf(ays.j(this.a)), var1});
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
