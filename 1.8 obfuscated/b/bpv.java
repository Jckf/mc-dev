
public class bpv {

   private final bpt[] a;
   private int b;
   private int c;


   public bpv(bpt[] var1) {
      this.a = var1;
      this.c = var1.length;
   }

   public void a() {
      ++this.b;
   }

   public boolean b() {
      return this.b >= this.c;
   }

   public bpt c() {
      return this.c > 0?this.a[this.c - 1]:null;
   }

   public bpt a(int var1) {
      return this.a[var1];
   }

   public int d() {
      return this.c;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public int e() {
      return this.b;
   }

   public void c(int var1) {
      this.b = var1;
   }

   public brw a(wv var1, int var2) {
      double var3 = (double)this.a[var2].a + (double)((int)(var1.J + 1.0F)) * 0.5D;
      double var5 = (double)this.a[var2].b;
      double var7 = (double)this.a[var2].c + (double)((int)(var1.J + 1.0F)) * 0.5D;
      return new brw(var3, var5, var7);
   }

   public brw a(wv var1) {
      return this.a(var1, this.b);
   }

   public boolean a(bpv var1) {
      if(var1 == null) {
         return false;
      } else if(var1.a.length != this.a.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if(this.a[var2].a != var1.a[var2].a || this.a[var2].b != var1.a[var2].b || this.a[var2].c != var1.a[var2].c) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean b(brw var1) {
      bpt var2 = this.c();
      return var2 == null?false:var2.a == (int)var1.a && var2.c == (int)var1.c;
   }
}
