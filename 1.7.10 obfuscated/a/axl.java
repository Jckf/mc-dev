import java.util.ArrayList;
import java.util.List;

public class axl {

   private static int a = 256;
   private static List b = new ArrayList();
   private static List c = new ArrayList();
   private static List d = new ArrayList();
   private static List e = new ArrayList();


   public static synchronized int[] a(int var0) {
      int[] var1;
      if(var0 <= 256) {
         if(b.isEmpty()) {
            var1 = new int[256];
            c.add(var1);
            return var1;
         } else {
            var1 = (int[])b.remove(b.size() - 1);
            c.add(var1);
            return var1;
         }
      } else if(var0 > a) {
         a = var0;
         d.clear();
         e.clear();
         var1 = new int[a];
         e.add(var1);
         return var1;
      } else if(d.isEmpty()) {
         var1 = new int[a];
         e.add(var1);
         return var1;
      } else {
         var1 = (int[])d.remove(d.size() - 1);
         e.add(var1);
         return var1;
      }
   }

   public static synchronized void a() {
      if(!d.isEmpty()) {
         d.remove(d.size() - 1);
      }

      if(!b.isEmpty()) {
         b.remove(b.size() - 1);
      }

      d.addAll(e);
      b.addAll(c);
      e.clear();
      c.clear();
   }

   public static synchronized String b() {
      return "cache: " + d.size() + ", tcache: " + b.size() + ", allocated: " + e.size() + ", tallocated: " + c.size();
   }

}
