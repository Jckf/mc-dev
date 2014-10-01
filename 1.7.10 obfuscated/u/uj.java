import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class uj {

   private static final Logger a = LogManager.getLogger();
   private List b = new ArrayList();
   private List c = new ArrayList();
   private final qi d;
   private int e;
   private int f = 3;


   public uj(qi var1) {
      this.d = var1;
   }

   public void a(int var1, ui var2) {
      this.b.add(new uk(this, var1, var2));
   }

   public void a(ui var1) {
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         uk var3 = (uk)var2.next();
         ui var4 = var3.a;
         if(var4 == var1) {
            if(this.c.contains(var3)) {
               var4.d();
               this.c.remove(var3);
            }

            var2.remove();
         }
      }

   }

   public void a() {
      ArrayList var1 = new ArrayList();
      Iterator var2;
      uk var3;
      if(this.e++ % this.f == 0) {
         var2 = this.b.iterator();

         while(var2.hasNext()) {
            var3 = (uk)var2.next();
            boolean var4 = this.c.contains(var3);
            if(var4) {
               if(this.b(var3) && this.a(var3)) {
                  continue;
               }

               var3.a.d();
               this.c.remove(var3);
            }

            if(this.b(var3) && var3.a.a()) {
               var1.add(var3);
               this.c.add(var3);
            }
         }
      } else {
         var2 = this.c.iterator();

         while(var2.hasNext()) {
            var3 = (uk)var2.next();
            if(!var3.a.b()) {
               var3.a.d();
               var2.remove();
            }
         }
      }

      this.d.a("goalStart");
      var2 = var1.iterator();

      while(var2.hasNext()) {
         var3 = (uk)var2.next();
         this.d.a(var3.a.getClass().getSimpleName());
         var3.a.c();
         this.d.b();
      }

      this.d.b();
      this.d.a("goalTick");
      var2 = this.c.iterator();

      while(var2.hasNext()) {
         var3 = (uk)var2.next();
         var3.a.e();
      }

      this.d.b();
   }

   private boolean a(uk var1) {
      this.d.a("canContinue");
      boolean var2 = var1.a.b();
      this.d.b();
      return var2;
   }

   private boolean b(uk var1) {
      this.d.a("canUse");
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         uk var3 = (uk)var2.next();
         if(var3 != var1) {
            if(var1.b >= var3.b) {
               if(this.c.contains(var3) && !this.a(var1, var3)) {
                  this.d.b();
                  return false;
               }
            } else if(this.c.contains(var3) && !var3.a.i()) {
               this.d.b();
               return false;
            }
         }
      }

      this.d.b();
      return true;
   }

   private boolean a(uk var1, uk var2) {
      return (var1.a.j() & var2.a.j()) == 0;
   }

}
