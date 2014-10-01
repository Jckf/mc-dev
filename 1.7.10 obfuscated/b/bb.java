
public class bb extends y {

   public String c() {
      return "netstat";
   }

   public int a() {
      return 0;
   }

   public String c(ac var1) {
      return "commands.players.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var1 instanceof yz) {
         var1.a(new fq("Command is not available for players"));
      } else {
         if(var2.length > 0 && var2[0].length() > 1) {
            if("hottest-read".equals(var2[0])) {
               var1.a(new fq(ej.h.e().toString()));
            } else if("hottest-write".equals(var2[0])) {
               var1.a(new fq(ej.h.g().toString()));
            } else if("most-read".equals(var2[0])) {
               var1.a(new fq(ej.h.f().toString()));
            } else if("most-write".equals(var2[0])) {
               var1.a(new fq(ej.h.h().toString()));
            } else {
               ew var4;
               int var7;
               if("packet-read".equals(var2[0])) {
                  if(var2.length > 1 && var2[1].length() > 0) {
                     try {
                        var7 = Integer.parseInt(var2[1].trim());
                        var4 = ej.h.a(var7);
                        this.a(var1, var7, var4);
                     } catch (Exception var6) {
                        var1.a(new fq("Packet " + var2[1] + " not found!"));
                     }
                  } else {
                     var1.a(new fq("Packet id is missing"));
                  }
               } else if("packet-write".equals(var2[0])) {
                  if(var2.length > 1 && var2[1].length() > 0) {
                     try {
                        var7 = Integer.parseInt(var2[1].trim());
                        var4 = ej.h.b(var7);
                        this.a(var1, var7, var4);
                     } catch (Exception var5) {
                        var1.a(new fq("Packet " + var2[1] + " not found!"));
                     }
                  } else {
                     var1.a(new fq("Packet id is missing"));
                  }
               } else if("read-count".equals(var2[0])) {
                  var1.a(new fq("total-read-count" + String.valueOf(ej.h.c())));
               } else if("write-count".equals(var2[0])) {
                  var1.a(new fq("total-write-count" + String.valueOf(ej.h.d())));
               } else {
                  var1.a(new fq("Unrecognized: " + var2[0]));
               }
            }
         } else {
            String var3 = "reads: " + ej.h.a();
            var3 = var3 + ", writes: " + ej.h.b();
            var1.a(new fq(var3));
         }

      }
   }

   private void a(ac var1, int var2, ew var3) {
      if(var3 != null) {
         var1.a(new fq(var3.toString()));
      } else {
         var1.a(new fq("Packet " + var2 + " not found!"));
      }

   }
}
