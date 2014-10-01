import java.util.ArrayList;
import java.util.List;

public class rh implements rb {

   private String a;
   private int b;
   private add[] c;
   private List d;
   private boolean e;


   public rh(String var1, boolean var2, int var3) {
      this.a = var1;
      this.e = var2;
      this.b = var3;
      this.c = new add[var3];
   }

   public void a(rc var1) {
      if(this.d == null) {
         this.d = new ArrayList();
      }

      this.d.add(var1);
   }

   public void b(rc var1) {
      this.d.remove(var1);
   }

   public add a(int var1) {
      return var1 >= 0 && var1 < this.c.length?this.c[var1]:null;
   }

   public add a(int var1, int var2) {
      if(this.c[var1] != null) {
         add var3;
         if(this.c[var1].b <= var2) {
            var3 = this.c[var1];
            this.c[var1] = null;
            this.e();
            return var3;
         } else {
            var3 = this.c[var1].a(var2);
            if(this.c[var1].b == 0) {
               this.c[var1] = null;
            }

            this.e();
            return var3;
         }
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      if(this.c[var1] != null) {
         add var2 = this.c[var1];
         this.c[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      this.c[var1] = var2;
      if(var2 != null && var2.b > this.d()) {
         var2.b = this.d();
      }

      this.e();
   }

   public int a() {
      return this.b;
   }

   public String b() {
      return this.a;
   }

   public boolean k_() {
      return this.e;
   }

   public void a(String var1) {
      this.e = true;
      this.a = var1;
   }

   public int d() {
      return 64;
   }

   public void e() {
      if(this.d != null) {
         for(int var1 = 0; var1 < this.d.size(); ++var1) {
            ((rc)this.d.get(var1)).a(this);
         }
      }

   }

   public boolean a(yz var1) {
      return true;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return true;
   }
}
