import java.util.ArrayList;
import java.util.List;

public class vw {

   sw a;
   List b = new ArrayList();
   List c = new ArrayList();


   public vw(sw var1) {
      this.a = var1;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(sa var1) {
      if(this.b.contains(var1)) {
         return true;
      } else if(this.c.contains(var1)) {
         return false;
      } else {
         this.a.o.C.a("canSee");
         boolean var2 = this.a.p(var1);
         this.a.o.C.b();
         if(var2) {
            this.b.add(var1);
         } else {
            this.c.add(var1);
         }

         return var2;
      }
   }
}
