import com.google.common.collect.Lists;
import java.util.List;

public class abd {

   xn a;
   List b = Lists.newArrayList();
   List c = Lists.newArrayList();


   public abd(xn var1) {
      this.a = var1;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(wv var1) {
      if(this.b.contains(var1)) {
         return true;
      } else if(this.c.contains(var1)) {
         return false;
      } else {
         this.a.o.B.a("canSee");
         boolean var2 = this.a.t(var1);
         this.a.o.B.b();
         if(var2) {
            this.b.add(var1);
         } else {
            this.c.add(var1);
         }

         return var2;
      }
   }
}
