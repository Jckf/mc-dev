import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class rn {

   private final List a = new ArrayList();
   private final sv b;
   private int c;
   private int d;
   private int e;
   private boolean f;
   private boolean g;
   private String h;


   public rn(sv var1) {
      this.b = var1;
   }

   public void a() {
      this.j();
      if(this.b.h_()) {
         aji var1 = this.b.o.a(qh.c(this.b.s), qh.c(this.b.C.b), qh.c(this.b.u));
         if(var1 == ajn.ap) {
            this.h = "ladder";
         } else if(var1 == ajn.bd) {
            this.h = "vines";
         }
      } else if(this.b.M()) {
         this.h = "water";
      }

   }

   public void a(ro var1, float var2, float var3) {
      this.g();
      this.a();
      rm var4 = new rm(var1, this.b.aa, var2, var3, this.h, this.b.R);
      this.a.add(var4);
      this.c = this.b.aa;
      this.g = true;
      if(var4.f() && !this.f && this.b.Z()) {
         this.f = true;
         this.d = this.b.aa;
         this.e = this.d;
         this.b.bu();
      }

   }

   public fj b() {
      if(this.a.size() == 0) {
         return new fr("death.attack.generic", new Object[]{this.b.c_()});
      } else {
         rm var1 = this.i();
         rm var2 = (rm)this.a.get(this.a.size() - 1);
         fj var4 = var2.h();
         sa var5 = var2.a().j();
         Object var3;
         if(var1 != null && var2.a() == ro.h) {
            fj var6 = var1.h();
            if(var1.a() != ro.h && var1.a() != ro.i) {
               if(var6 != null && (var4 == null || !var6.equals(var4))) {
                  sa var9 = var1.a().j();
                  add var8 = var9 instanceof sv?((sv)var9).be():null;
                  if(var8 != null && var8.u()) {
                     var3 = new fr("death.fell.assist.item", new Object[]{this.b.c_(), var6, var8.E()});
                  } else {
                     var3 = new fr("death.fell.assist", new Object[]{this.b.c_(), var6});
                  }
               } else if(var4 != null) {
                  add var7 = var5 instanceof sv?((sv)var5).be():null;
                  if(var7 != null && var7.u()) {
                     var3 = new fr("death.fell.finish.item", new Object[]{this.b.c_(), var4, var7.E()});
                  } else {
                     var3 = new fr("death.fell.finish", new Object[]{this.b.c_(), var4});
                  }
               } else {
                  var3 = new fr("death.fell.killer", new Object[]{this.b.c_()});
               }
            } else {
               var3 = new fr("death.fell.accident." + this.a(var1), new Object[]{this.b.c_()});
            }
         } else {
            var3 = var2.a().b(this.b);
         }

         return (fj)var3;
      }
   }

   public sv c() {
      sv var1 = null;
      yz var2 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;
      Iterator var5 = this.a.iterator();

      while(var5.hasNext()) {
         rm var6 = (rm)var5.next();
         if(var6.a().j() instanceof yz && (var2 == null || var6.c() > var4)) {
            var4 = var6.c();
            var2 = (yz)var6.a().j();
         }

         if(var6.a().j() instanceof sv && (var1 == null || var6.c() > var3)) {
            var3 = var6.c();
            var1 = (sv)var6.a().j();
         }
      }

      if(var2 != null && var4 >= var3 / 3.0F) {
         return var2;
      } else {
         return var1;
      }
   }

   private rm i() {
      rm var1 = null;
      rm var2 = null;
      byte var3 = 0;
      float var4 = 0.0F;

      for(int var5 = 0; var5 < this.a.size(); ++var5) {
         rm var6 = (rm)this.a.get(var5);
         rm var7 = var5 > 0?(rm)this.a.get(var5 - 1):null;
         if((var6.a() == ro.h || var6.a() == ro.i) && var6.i() > 0.0F && (var1 == null || var6.i() > var4)) {
            if(var5 > 0) {
               var1 = var7;
            } else {
               var1 = var6;
            }

            var4 = var6.i();
         }

         if(var6.g() != null && (var2 == null || var6.c() > (float)var3)) {
            var2 = var6;
         }
      }

      if(var4 > 5.0F && var1 != null) {
         return var1;
      } else if(var3 > 5 && var2 != null) {
         return var2;
      } else {
         return null;
      }
   }

   private String a(rm var1) {
      return var1.g() == null?"generic":var1.g();
   }

   private void j() {
      this.h = null;
   }

   public void g() {
      int var1 = this.f?300:100;
      if(this.g && (!this.b.Z() || this.b.aa - this.c > var1)) {
         boolean var2 = this.f;
         this.g = false;
         this.f = false;
         this.e = this.b.aa;
         if(var2) {
            this.b.bv();
         }

         this.a.clear();
      }

   }
}
