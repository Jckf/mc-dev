
public class agn {

   private add a;
   private add b;
   private add c;
   private int d;
   private int e;


   public agn(dh var1) {
      this.a(var1);
   }

   public agn(add var1, add var2, add var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = 7;
   }

   public agn(add var1, add var2) {
      this(var1, (add)null, var2);
   }

   public agn(add var1, adb var2) {
      this(var1, new add(var2));
   }

   public add a() {
      return this.a;
   }

   public add b() {
      return this.b;
   }

   public boolean c() {
      return this.b != null;
   }

   public add d() {
      return this.c;
   }

   public boolean a(agn var1) {
      return this.a.b() == var1.a.b() && this.c.b() == var1.c.b()?this.b == null && var1.b == null || this.b != null && var1.b != null && this.b.b() == var1.b.b():false;
   }

   public boolean b(agn var1) {
      return this.a(var1) && (this.a.b < var1.a.b || this.b != null && this.b.b < var1.b.b);
   }

   public void f() {
      ++this.d;
   }

   public void a(int var1) {
      this.e += var1;
   }

   public boolean g() {
      return this.d >= this.e;
   }

   public void a(dh var1) {
      dh var2 = var1.m("buy");
      this.a = add.a(var2);
      dh var3 = var1.m("sell");
      this.c = add.a(var3);
      if(var1.b("buyB", 10)) {
         this.b = add.a(var1.m("buyB"));
      }

      if(var1.b("uses", 99)) {
         this.d = var1.f("uses");
      }

      if(var1.b("maxUses", 99)) {
         this.e = var1.f("maxUses");
      } else {
         this.e = 7;
      }

   }

   public dh i() {
      dh var1 = new dh();
      var1.a("buy", (dy)this.a.b(new dh()));
      var1.a("sell", (dy)this.c.b(new dh()));
      if(this.b != null) {
         var1.a("buyB", (dy)this.b.b(new dh()));
      }

      var1.a("uses", this.d);
      var1.a("maxUses", this.e);
      return var1;
   }
}
