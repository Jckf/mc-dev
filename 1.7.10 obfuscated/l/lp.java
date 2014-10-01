import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class lp extends bac {

   private final MinecraftServer a;
   private final Set b = new HashSet();
   private bad c;


   public lp(MinecraftServer var1) {
      this.a = var1;
   }

   public void a(azz var1) {
      super.a(var1);
      if(this.b.contains(var1.d())) {
         this.a.ah().a((ft)(new ie(var1, 0)));
      }

      this.b();
   }

   public void a(String var1) {
      super.a(var1);
      this.a.ah().a((ft)(new ie(var1)));
      this.b();
   }

   public void a(int var1, azx var2) {
      azx var3 = this.a(var1);
      super.a(var1, var2);
      if(var3 != var2 && var3 != null) {
         if(this.h(var3) > 0) {
            this.a.ah().a((ft)(new hv(var1, var2)));
         } else {
            this.g(var3);
         }
      }

      if(var2 != null) {
         if(this.b.contains(var2)) {
            this.a.ah().a((ft)(new hv(var1, var2)));
         } else {
            this.e(var2);
         }
      }

      this.b();
   }

   public boolean a(String var1, String var2) {
      if(super.a(var1, var2)) {
         azy var3 = this.e(var2);
         this.a.ah().a((ft)(new id(var3, Arrays.asList(new String[]{var1}), 3)));
         this.b();
         return true;
      } else {
         return false;
      }
   }

   public void a(String var1, azy var2) {
      super.a(var1, var2);
      this.a.ah().a((ft)(new id(var2, Arrays.asList(new String[]{var1}), 4)));
      this.b();
   }

   public void a(azx var1) {
      super.a(var1);
      this.b();
   }

   public void b(azx var1) {
      super.b(var1);
      if(this.b.contains(var1)) {
         this.a.ah().a((ft)(new ic(var1, 2)));
      }

      this.b();
   }

   public void c(azx var1) {
      super.c(var1);
      if(this.b.contains(var1)) {
         this.g(var1);
      }

      this.b();
   }

   public void a(azy var1) {
      super.a(var1);
      this.a.ah().a((ft)(new id(var1, 0)));
      this.b();
   }

   public void b(azy var1) {
      super.b(var1);
      this.a.ah().a((ft)(new id(var1, 2)));
      this.b();
   }

   public void c(azy var1) {
      super.c(var1);
      this.a.ah().a((ft)(new id(var1, 1)));
      this.b();
   }

   public void a(bad var1) {
      this.c = var1;
   }

   protected void b() {
      if(this.c != null) {
         this.c.c();
      }

   }

   public List d(azx var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new ic(var1, 0));

      for(int var3 = 0; var3 < 3; ++var3) {
         if(this.a(var3) == var1) {
            var2.add(new hv(var3, var1));
         }
      }

      Iterator var5 = this.i(var1).iterator();

      while(var5.hasNext()) {
         azz var4 = (azz)var5.next();
         var2.add(new ie(var4, 0));
      }

      return var2;
   }

   public void e(azx var1) {
      List var2 = this.d(var1);
      Iterator var3 = this.a.ah().e.iterator();

      while(var3.hasNext()) {
         mw var4 = (mw)var3.next();
         Iterator var5 = var2.iterator();

         while(var5.hasNext()) {
            ft var6 = (ft)var5.next();
            var4.a.a(var6);
         }
      }

      this.b.add(var1);
   }

   public List f(azx var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new ic(var1, 1));

      for(int var3 = 0; var3 < 3; ++var3) {
         if(this.a(var3) == var1) {
            var2.add(new hv(var3, var1));
         }
      }

      return var2;
   }

   public void g(azx var1) {
      List var2 = this.f(var1);
      Iterator var3 = this.a.ah().e.iterator();

      while(var3.hasNext()) {
         mw var4 = (mw)var3.next();
         Iterator var5 = var2.iterator();

         while(var5.hasNext()) {
            ft var6 = (ft)var5.next();
            var4.a.a(var6);
         }
      }

      this.b.remove(var1);
   }

   public int h(azx var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 3; ++var3) {
         if(this.a(var3) == var1) {
            ++var2;
         }
      }

      return var2;
   }
}
