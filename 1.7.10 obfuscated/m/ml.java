
public class ml extends mx {

   private boolean c;
   private boolean d;
   private int e;
   private int f;


   public ml(ahb var1) {
      super(var1);
   }

   public void a() {
      super.a();
      ++this.f;
      long var1 = this.a.I();
      long var3 = var1 / 24000L + 1L;
      if(!this.c && this.f > 20) {
         this.c = true;
         this.b.a.a((ft)(new gv(5, 0.0F)));
      }

      this.d = var1 > 120500L;
      if(this.d) {
         ++this.e;
      }

      if(var1 % 24000L == 500L) {
         if(var3 <= 6L) {
            this.b.a((fj)(new fr("demo.day." + var3, new Object[0])));
         }
      } else if(var3 == 1L) {
         if(var1 == 100L) {
            this.b.a.a((ft)(new gv(5, 101.0F)));
         } else if(var1 == 175L) {
            this.b.a.a((ft)(new gv(5, 102.0F)));
         } else if(var1 == 250L) {
            this.b.a.a((ft)(new gv(5, 103.0F)));
         }
      } else if(var3 == 5L && var1 % 24000L == 22000L) {
         this.b.a((fj)(new fr("demo.day.warning", new Object[0])));
      }

   }

   private void e() {
      if(this.e > 100) {
         this.b.a((fj)(new fr("demo.reminder", new Object[0])));
         this.e = 0;
      }

   }

   public void a(int var1, int var2, int var3, int var4) {
      if(this.d) {
         this.e();
      } else {
         super.a(var1, var2, var3, var4);
      }
   }

   public void a(int var1, int var2, int var3) {
      if(!this.d) {
         super.a(var1, var2, var3);
      }
   }

   public boolean b(int var1, int var2, int var3) {
      return this.d?false:super.b(var1, var2, var3);
   }

   public boolean a(yz var1, ahb var2, add var3) {
      if(this.d) {
         this.e();
         return false;
      } else {
         return super.a(var1, var2, var3);
      }
   }

   public boolean a(yz var1, ahb var2, add var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(this.d) {
         this.e();
         return false;
      } else {
         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
   }
}
