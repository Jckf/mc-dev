import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class azr implements Runnable {

   public static final azr a = new azr();
   private List b = Collections.synchronizedList(new ArrayList());
   private volatile long c;
   private volatile long d;
   private volatile boolean e;


   private azr() {
      Thread var1 = new Thread(this, "File IO Thread");
      var1.setPriority(1);
      var1.start();
   }

   public void run() {
      this.b();
   }

   private void b() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         azs var2 = (azs)this.b.get(var1);
         boolean var3 = var2.c();
         if(!var3) {
            this.b.remove(var1--);
            ++this.d;
         }

         try {
            Thread.sleep(this.e?0L:10L);
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }
      }

      if(this.b.isEmpty()) {
         try {
            Thread.sleep(25L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
      }

   }

   public void a(azs var1) {
      if(!this.b.contains(var1)) {
         ++this.c;
         this.b.add(var1);
      }
   }

   public void a() {
      this.e = true;

      while(this.c != this.d) {
         Thread.sleep(10L);
      }

      this.e = false;
   }

}
