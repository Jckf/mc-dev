import java.util.Random;

public class apb extends aor implements rb {

   private add[] i = new add[9];
   private Random j = new Random();
   protected String a;


   public int a() {
      return 9;
   }

   public add a(int var1) {
      return this.i[var1];
   }

   public add a(int var1, int var2) {
      if(this.i[var1] != null) {
         add var3;
         if(this.i[var1].b <= var2) {
            var3 = this.i[var1];
            this.i[var1] = null;
            this.e();
            return var3;
         } else {
            var3 = this.i[var1].a(var2);
            if(this.i[var1].b == 0) {
               this.i[var1] = null;
            }

            this.e();
            return var3;
         }
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      if(this.i[var1] != null) {
         add var2 = this.i[var1];
         this.i[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public int i() {
      int var1 = -1;
      int var2 = 1;

      for(int var3 = 0; var3 < this.i.length; ++var3) {
         if(this.i[var3] != null && this.j.nextInt(var2++) == 0) {
            var1 = var3;
         }
      }

      return var1;
   }

   public void a(int var1, add var2) {
      this.i[var1] = var2;
      if(var2 != null && var2.b > this.d()) {
         var2.b = this.d();
      }

      this.e();
   }

   public int a(add var1) {
      for(int var2 = 0; var2 < this.i.length; ++var2) {
         if(this.i[var2] == null || this.i[var2].b() == null) {
            this.a(var2, var1);
            return var2;
         }
      }

      return -1;
   }

   public String b() {
      return this.k_()?this.a:"container.dispenser";
   }

   public void a(String var1) {
      this.a = var1;
   }

   public boolean k_() {
      return this.a != null;
   }

   public void a(dh var1) {
      super.a(var1);
      dq var2 = var1.c("Items", 10);
      this.i = new add[this.a()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         int var5 = var4.d("Slot") & 255;
         if(var5 >= 0 && var5 < this.i.length) {
            this.i[var5] = add.a(var4);
         }
      }

      if(var1.b("CustomName", 8)) {
         this.a = var1.j("CustomName");
      }

   }

   public void b(dh var1) {
      super.b(var1);
      dq var2 = new dq();

      for(int var3 = 0; var3 < this.i.length; ++var3) {
         if(this.i[var3] != null) {
            dh var4 = new dh();
            var4.a("Slot", (byte)var3);
            this.i[var3].b(var4);
            var2.a((dy)var4);
         }
      }

      var1.a("Items", (dy)var2);
      if(this.k_()) {
         var1.a("CustomName", this.a);
      }

   }

   public int d() {
      return 64;
   }

   public boolean a(yz var1) {
      return this.b.o(this.c, this.d, this.e) != this?false:var1.e((double)this.c + 0.5D, (double)this.d + 0.5D, (double)this.e + 0.5D) <= 64.0D;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return true;
   }
}
