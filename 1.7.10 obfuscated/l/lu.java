
class lu extends Thread {

   // $FF: synthetic field
   final lt a;


   lu(lt var1, String var2) {
      super(var2);
      this.a = var1;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(true) {
         try {
            while(true) {
               Thread.sleep(2147483647L);
            }
         } catch (InterruptedException var2) {
            ;
         }
      }
   }
}
