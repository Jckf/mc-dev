
public class ra implements rb {

   private String a;
   private rb b;
   private rb c;


   public ra(String var1, rb var2, rb var3) {
      this.a = var1;
      if(var2 == null) {
         var2 = var3;
      }

      if(var3 == null) {
         var3 = var2;
      }

      this.b = var2;
      this.c = var3;
   }

   public int a() {
      return this.b.a() + this.c.a();
   }

   public boolean a(rb var1) {
      return this.b == var1 || this.c == var1;
   }

   public String b() {
      return this.b.k_()?this.b.b():(this.c.k_()?this.c.b():this.a);
   }

   public boolean k_() {
      return this.b.k_() || this.c.k_();
   }

   public add a(int var1) {
      return var1 >= this.b.a()?this.c.a(var1 - this.b.a()):this.b.a(var1);
   }

   public add a(int var1, int var2) {
      return var1 >= this.b.a()?this.c.a(var1 - this.b.a(), var2):this.b.a(var1, var2);
   }

   public add a_(int var1) {
      return var1 >= this.b.a()?this.c.a_(var1 - this.b.a()):this.b.a_(var1);
   }

   public void a(int var1, add var2) {
      if(var1 >= this.b.a()) {
         this.c.a(var1 - this.b.a(), var2);
      } else {
         this.b.a(var1, var2);
      }

   }

   public int d() {
      return this.b.d();
   }

   public void e() {
      this.b.e();
      this.c.e();
   }

   public boolean a(yz var1) {
      return this.b.a(var1) && this.c.a(var1);
   }

   public void f() {
      this.b.f();
      this.c.f();
   }

   public void l_() {
      this.b.l_();
      this.c.l_();
   }

   public boolean b(int var1, add var2) {
      return true;
   }
}
