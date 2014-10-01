import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

class rj extends TimerTask {

   // $FF: synthetic field
   final ri a;


   rj(ri var1) {
      this.a = var1;
   }

   public void run() {
      if(ri.a(this.a).W()) {
         HashMap var1;
         synchronized(ri.b(this.a)) {
            var1 = new HashMap(ri.c(this.a));
            if(ri.d(this.a) == 0) {
               var1.putAll(ri.e(this.a));
            }

            var1.put("snooper_count", Integer.valueOf(ri.f(this.a)));
            var1.put("snooper_token", ri.g(this.a));
         }

         pv.a(ri.h(this.a), (Map)var1, true);
      }
   }
}
