import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class lz extends WindowAdapter {

   // $FF: synthetic field
   final lt a;


   lz(lt var1) {
      this.a = var1;
   }

   public void windowClosing(WindowEvent var1) {
      this.a.r();

      while(!this.a.ag()) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      System.exit(0);
   }
}
