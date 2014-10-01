
public class st extends ss {

   private float e = 1.0F;


   public st(ahb var1) {
      super(var1);
   }

   public st(ahb var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      this.a(var5);
   }

   protected void c() {
      this.z().a(2, 5);
      this.z().a(3, Byte.valueOf((byte)0));
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if(this.j() != null) {
         if(!this.o.E) {
            this.b(var1.j(), false);
            this.a((add)null);
         }

         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   public int f() {
      return 9;
   }

   public int i() {
      return 9;
   }

   public void b(sa var1) {
      this.b(var1, true);
   }

   public void b(sa var1, boolean var2) {
      add var3 = this.j();
      if(var1 instanceof yz) {
         yz var4 = (yz)var1;
         if(var4.bE.d) {
            this.b(var3);
            return;
         }
      }

      if(var2) {
         this.a(new add(ade.bD), 0.0F);
      }

      if(var3 != null && this.Z.nextFloat() < this.e) {
         var3 = var3.m();
         this.b(var3);
         this.a(var3, 0.0F);
      }

   }

   private void b(add var1) {
      if(var1 != null) {
         if(var1.b() == ade.aY) {
            ayi var2 = ((adh)var1.b()).a(var1, this.o);
            var2.g.remove("frame-" + this.y());
         }

         var1.a((st)null);
      }
   }

   public add j() {
      return this.z().f(2);
   }

   public void a(add var1) {
      if(var1 != null) {
         var1 = var1.m();
         var1.b = 1;
         var1.a(this);
      }

      this.z().b(2, var1);
      this.z().h(2);
   }

   public int k() {
      return this.z().a(3);
   }

   public void c(int var1) {
      this.z().b(3, Byte.valueOf((byte)(var1 % 4)));
   }

   public void b(dh var1) {
      if(this.j() != null) {
         var1.a("Item", (dy)this.j().b(new dh()));
         var1.a("ItemRotation", (byte)this.k());
         var1.a("ItemDropChance", this.e);
      }

      super.b(var1);
   }

   public void a(dh var1) {
      dh var2 = var1.m("Item");
      if(var2 != null && !var2.d()) {
         this.a(add.a(var2));
         this.c(var1.d("ItemRotation"));
         if(var1.b("ItemDropChance", 99)) {
            this.e = var1.h("ItemDropChance");
         }
      }

      super.a(var1);
   }

   public boolean c(yz var1) {
      if(this.j() == null) {
         add var2 = var1.be();
         if(var2 != null && !this.o.E) {
            this.a(var2);
            if(!var1.bE.d && --var2.b <= 0) {
               var1.bm.a(var1.bm.c, (add)null);
            }
         }
      } else if(!this.o.E) {
         this.c(this.k() + 1);
      }

      return true;
   }
}
