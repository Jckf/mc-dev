
public class aav extends rh {

   private ape a;


   public aav() {
      super("container.enderchest", false, 27);
   }

   public void a(ape var1) {
      this.a = var1;
   }

   public void a(dq var1) {
      int var2;
      for(var2 = 0; var2 < this.a(); ++var2) {
         this.a(var2, (add)null);
      }

      for(var2 = 0; var2 < var1.c(); ++var2) {
         dh var3 = var1.b(var2);
         int var4 = var3.d("Slot") & 255;
         if(var4 >= 0 && var4 < this.a()) {
            this.a(var4, add.a(var3));
         }
      }

   }

   public dq h() {
      dq var1 = new dq();

      for(int var2 = 0; var2 < this.a(); ++var2) {
         add var3 = this.a(var2);
         if(var3 != null) {
            dh var4 = new dh();
            var4.a("Slot", (byte)var2);
            var3.b(var4);
            var1.a((dy)var4);
         }
      }

      return var1;
   }

   public boolean a(yz var1) {
      return this.a != null && !this.a.a(var1)?false:super.a(var1);
   }

   public void f() {
      if(this.a != null) {
         this.a.a();
      }

      super.f();
   }

   public void l_() {
      if(this.a != null) {
         this.a.b();
      }

      super.l_();
      this.a = null;
   }
}
