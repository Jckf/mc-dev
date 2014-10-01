import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class agq {

   public int b = 20;
   private String a = "Pig";
   private List e;
   private agr f;
   public double c;
   public double d;
   private int g = 200;
   private int h = 800;
   private int i = 4;
   private sa j;
   private int k = 6;
   private int l = 16;
   private int m = 4;


   public String e() {
      if(this.i() == null) {
         if(this.a.equals("Minecart")) {
            this.a = "MinecartRideable";
         }

         return this.a;
      } else {
         return this.i().c;
      }
   }

   public void a(String var1) {
      this.a = var1;
   }

   public boolean f() {
      return this.a().a((double)this.b() + 0.5D, (double)this.c() + 0.5D, (double)this.d() + 0.5D, (double)this.l) != null;
   }

   public void g() {
      if(this.f()) {
         double var5;
         if(this.a().E) {
            double var1 = (double)((float)this.b() + this.a().s.nextFloat());
            double var3 = (double)((float)this.c() + this.a().s.nextFloat());
            var5 = (double)((float)this.d() + this.a().s.nextFloat());
            this.a().a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
            this.a().a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);
            if(this.b > 0) {
               --this.b;
            }

            this.d = this.c;
            this.c = (this.c + (double)(1000.0F / ((float)this.b + 200.0F))) % 360.0D;
         } else {
            if(this.b == -1) {
               this.j();
            }

            if(this.b > 0) {
               --this.b;
               return;
            }

            boolean var12 = false;

            for(int var2 = 0; var2 < this.i; ++var2) {
               sa var13 = sg.a(this.e(), this.a());
               if(var13 == null) {
                  return;
               }

               int var4 = this.a().a(var13.getClass(), azt.a((double)this.b(), (double)this.c(), (double)this.d(), (double)(this.b() + 1), (double)(this.c() + 1), (double)(this.d() + 1)).b((double)(this.m * 2), 4.0D, (double)(this.m * 2))).size();
               if(var4 >= this.k) {
                  this.j();
                  return;
               }

               var5 = (double)this.b() + (this.a().s.nextDouble() - this.a().s.nextDouble()) * (double)this.m;
               double var7 = (double)(this.c() + this.a().s.nextInt(3) - 1);
               double var9 = (double)this.d() + (this.a().s.nextDouble() - this.a().s.nextDouble()) * (double)this.m;
               sw var11 = var13 instanceof sw?(sw)var13:null;
               var13.b(var5, var7, var9, this.a().s.nextFloat() * 360.0F, 0.0F);
               if(var11 == null || var11.by()) {
                  this.a(var13);
                  this.a().c(2004, this.b(), this.c(), this.d(), 0);
                  if(var11 != null) {
                     var11.s();
                  }

                  var12 = true;
               }
            }

            if(var12) {
               this.j();
            }
         }

      }
   }

   public sa a(sa var1) {
      if(this.i() != null) {
         dh var2 = new dh();
         var1.d(var2);
         Iterator var3 = this.i().b.c().iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            dy var5 = this.i().b.a(var4);
            var2.a(var4, var5.b());
         }

         var1.f(var2);
         if(var1.o != null) {
            var1.o.d(var1);
         }

         dh var11;
         for(sa var10 = var1; var2.b("Riding", 10); var2 = var11) {
            var11 = var2.m("Riding");
            sa var12 = sg.a(var11.j("id"), var1.o);
            if(var12 != null) {
               dh var6 = new dh();
               var12.d(var6);
               Iterator var7 = var11.c().iterator();

               while(var7.hasNext()) {
                  String var8 = (String)var7.next();
                  dy var9 = var11.a(var8);
                  var6.a(var8, var9.b());
               }

               var12.f(var6);
               var12.b(var10.s, var10.t, var10.u, var10.y, var10.z);
               if(var1.o != null) {
                  var1.o.d(var12);
               }

               var10.a(var12);
            }

            var10 = var12;
         }
      } else if(var1 instanceof sv && var1.o != null) {
         ((sw)var1).a((sy)null);
         this.a().d(var1);
      }

      return var1;
   }

   private void j() {
      if(this.h <= this.g) {
         this.b = this.g;
      } else {
         int var10003 = this.h - this.g;
         this.b = this.g + this.a().s.nextInt(var10003);
      }

      if(this.e != null && this.e.size() > 0) {
         this.a((agr)qv.a(this.a().s, (Collection)this.e));
      }

      this.a(1);
   }

   public void a(dh var1) {
      this.a = var1.j("EntityId");
      this.b = var1.e("Delay");
      if(var1.b("SpawnPotentials", 9)) {
         this.e = new ArrayList();
         dq var2 = var1.c("SpawnPotentials", 10);

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            this.e.add(new agr(this, var2.b(var3)));
         }
      } else {
         this.e = null;
      }

      if(var1.b("SpawnData", 10)) {
         this.a(new agr(this, var1.m("SpawnData"), this.a));
      } else {
         this.a((agr)null);
      }

      if(var1.b("MinSpawnDelay", 99)) {
         this.g = var1.e("MinSpawnDelay");
         this.h = var1.e("MaxSpawnDelay");
         this.i = var1.e("SpawnCount");
      }

      if(var1.b("MaxNearbyEntities", 99)) {
         this.k = var1.e("MaxNearbyEntities");
         this.l = var1.e("RequiredPlayerRange");
      }

      if(var1.b("SpawnRange", 99)) {
         this.m = var1.e("SpawnRange");
      }

      if(this.a() != null && this.a().E) {
         this.j = null;
      }

   }

   public void b(dh var1) {
      var1.a("EntityId", this.e());
      var1.a("Delay", (short)this.b);
      var1.a("MinSpawnDelay", (short)this.g);
      var1.a("MaxSpawnDelay", (short)this.h);
      var1.a("SpawnCount", (short)this.i);
      var1.a("MaxNearbyEntities", (short)this.k);
      var1.a("RequiredPlayerRange", (short)this.l);
      var1.a("SpawnRange", (short)this.m);
      if(this.i() != null) {
         var1.a("SpawnData", this.i().b.b());
      }

      if(this.i() != null || this.e != null && this.e.size() > 0) {
         dq var2 = new dq();
         if(this.e != null && this.e.size() > 0) {
            Iterator var3 = this.e.iterator();

            while(var3.hasNext()) {
               agr var4 = (agr)var3.next();
               var2.a((dy)var4.a());
            }
         } else {
            var2.a((dy)this.i().a());
         }

         var1.a("SpawnPotentials", (dy)var2);
      }

   }

   public boolean b(int var1) {
      if(var1 == 1 && this.a().E) {
         this.b = this.g;
         return true;
      } else {
         return false;
      }
   }

   public agr i() {
      return this.f;
   }

   public void a(agr var1) {
      this.f = var1;
   }

   public abstract void a(int var1);

   public abstract ahb a();

   public abstract int b();

   public abstract int c();

   public abstract int d();
}
