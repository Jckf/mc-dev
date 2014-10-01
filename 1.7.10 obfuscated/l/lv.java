import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class lv extends Thread {

   // $FF: synthetic field
   final lt a;


   lv(lt var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));

      String var2;
      try {
         while(!this.a.ag() && this.a.q() && (var2 = var1.readLine()) != null) {
            this.a.a(var2, (ac)this.a);
         }
      } catch (IOException var4) {
         lt.aF().error("Exception handling console input", (Throwable)var4);
      }

   }
}
