
public abstract class uc extends ui {

   protected sw a;
   protected int b;
   protected int c;
   protected int d;
   protected akn e;
   boolean f;
   float g;
   float h;


   public uc(sw var1) {
      this.a = var1;
   }

   public boolean a() {
      if(!this.a.E) {
         return false;
      } else {
         vv var1 = this.a.m();
         ayf var2 = var1.e();
         if(var2 != null && !var2.b() && var1.c()) {
            for(int var3 = 0; var3 < Math.min(var2.e() + 2, var2.d()); ++var3) {
               aye var4 = var2.a(var3);
               this.b = var4.a;
               this.c = var4.b + 1;
               this.d = var4.c;
               if(this.a.e((double)this.b, this.a.t, (double)this.d) <= 2.25D) {
                  this.e = this.a(this.b, this.c, this.d);
                  if(this.e != null) {
                     return true;
                  }
               }
            }

            this.b = qh.c(this.a.s);
            this.c = qh.c(this.a.t + 1.0D);
            this.d = qh.c(this.a.u);
            this.e = this.a(this.b, this.c, this.d);
            return this.e != null;
         } else {
            return false;
         }
      }
   }

   public boolean b() {
      return !this.f;
   }

   public void c() {
      this.f = false;
      this.g = (float)((double)((float)this.b + 0.5F) - this.a.s);
      this.h = (float)((double)((float)this.d + 0.5F) - this.a.u);
   }

   public void e() {
      float var1 = (float)((double)((float)this.b + 0.5F) - this.a.s);
      float var2 = (float)((double)((float)this.d + 0.5F) - this.a.u);
      float var3 = this.g * var1 + this.h * var2;
      if(var3 < 0.0F) {
         this.f = true;
      }

   }

   private akn a(int var1, int var2, int var3) {
      aji var4 = this.a.o.a(var1, var2, var3);
      return var4 != ajn.ao?null:(akn)var4;
   }
}
