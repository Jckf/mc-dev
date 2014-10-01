import java.util.Iterator;

public class fq extends fe {

   private final String b;


   public fq(String var1) {
      this.b = var1;
   }

   public String g() {
      return this.b;
   }

   public String e() {
      return this.b;
   }

   public fq h() {
      fq var1 = new fq(this.b);
      var1.a(this.b().l());
      Iterator var2 = this.a().iterator();

      while(var2.hasNext()) {
         fj var3 = (fj)var2.next();
         var1.a(var3.f());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof fq)) {
         return false;
      } else {
         fq var2 = (fq)var1;
         return this.b.equals(var2.g()) && super.equals(var1);
      }
   }

   public String toString() {
      return "TextComponent{text=\'" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
   }

   // $FF: synthetic method
   public fj f() {
      return this.h();
   }
}
