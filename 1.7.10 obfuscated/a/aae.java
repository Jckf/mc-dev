
public class aae implements rb {

   private add[] a;
   private int b;
   private zs c;


   public aae(zs var1, int var2, int var3) {
      int var4 = var2 * var3;
      this.a = new add[var4];
      this.c = var1;
      this.b = var2;
   }

   public int a() {
      return this.a.length;
   }

   public add a(int var1) {
      return var1 >= this.a()?null:this.a[var1];
   }

   public add b(int var1, int var2) {
      if(var1 >= 0 && var1 < this.b) {
         int var3 = var1 + var2 * this.b;
         return this.a(var3);
      } else {
         return null;
      }
   }

   public String b() {
      return "container.crafting";
   }

   public boolean k_() {
      return false;
   }

   public add a_(int var1) {
      if(this.a[var1] != null) {
         add var2 = this.a[var1];
         this.a[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public add a(int var1, int var2) {
      if(this.a[var1] != null) {
         add var3;
         if(this.a[var1].b <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.c.a((rb)this);
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].b == 0) {
               this.a[var1] = null;
            }

            this.c.a((rb)this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      this.a[var1] = var2;
      this.c.a((rb)this);
   }

   public int d() {
      return 64;
   }

   public void e() {}

   public boolean a(yz var1) {
      return true;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return true;
   }
}
