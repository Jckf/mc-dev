import java.util.Comparator;
import java.util.List;

public class azz {

   public static final Comparator a = new baa();
   private final bac b;
   private final azx c;
   private final String d;
   private int e;


   public azz(bac var1, azx var2, String var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public void a(int var1) {
      if(this.c.c().b()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.c(this.c() + var1);
      }
   }

   public void b(int var1) {
      if(this.c.c().b()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.c(this.c() - var1);
      }
   }

   public void a() {
      if(this.c.c().b()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.a(1);
      }
   }

   public int c() {
      return this.e;
   }

   public void c(int var1) {
      int var2 = this.e;
      this.e = var1;
      if(var2 != var1) {
         this.f().a(this);
      }

   }

   public azx d() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public bac f() {
      return this.b;
   }

   public void a(List var1) {
      this.c(this.c.c().a(var1));
   }

}
