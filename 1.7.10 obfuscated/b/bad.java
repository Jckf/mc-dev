import java.util.Collection;
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bad extends ayl {

   private static final Logger a = LogManager.getLogger();
   private bac b;
   private dh c;


   public bad() {
      this("scoreboard");
   }

   public bad(String var1) {
      super(var1);
   }

   public void a(bac var1) {
      this.b = var1;
      if(this.c != null) {
         this.a(this.c);
      }

   }

   public void a(dh var1) {
      if(this.b == null) {
         this.c = var1;
      } else {
         this.b(var1.c("Objectives", 10));
         this.c(var1.c("PlayerScores", 10));
         if(var1.b("DisplaySlots", 10)) {
            this.c(var1.m("DisplaySlots"));
         }

         if(var1.b("Teams", 9)) {
            this.a(var1.c("Teams", 10));
         }

      }
   }

   protected void a(dq var1) {
      for(int var2 = 0; var2 < var1.c(); ++var2) {
         dh var3 = var1.b(var2);
         azy var4 = this.b.f(var3.j("Name"));
         var4.a(var3.j("DisplayName"));
         var4.b(var3.j("Prefix"));
         var4.c(var3.j("Suffix"));
         if(var3.b("AllowFriendlyFire", 99)) {
            var4.a(var3.n("AllowFriendlyFire"));
         }

         if(var3.b("SeeFriendlyInvisibles", 99)) {
            var4.b(var3.n("SeeFriendlyInvisibles"));
         }

         this.a(var4, var3.c("Players", 8));
      }

   }

   protected void a(azy var1, dq var2) {
      for(int var3 = 0; var3 < var2.c(); ++var3) {
         this.b.a(var2.f(var3), var1.b());
      }

   }

   protected void c(dh var1) {
      for(int var2 = 0; var2 < 3; ++var2) {
         if(var1.b("slot_" + var2, 8)) {
            String var3 = var1.j("slot_" + var2);
            azx var4 = this.b.b(var3);
            this.b.a(var2, var4);
         }
      }

   }

   protected void b(dq var1) {
      for(int var2 = 0; var2 < var1.c(); ++var2) {
         dh var3 = var1.b(var2);
         bah var4 = (bah)bah.a.get(var3.j("CriteriaName"));
         azx var5 = this.b.a(var3.j("Name"), var4);
         var5.a(var3.j("DisplayName"));
      }

   }

   protected void c(dq var1) {
      for(int var2 = 0; var2 < var1.c(); ++var2) {
         dh var3 = var1.b(var2);
         azx var4 = this.b.b(var3.j("Objective"));
         azz var5 = this.b.a(var3.j("Name"), var4);
         var5.c(var3.f("Score"));
      }

   }

   public void b(dh var1) {
      if(this.b == null) {
         a.warn("Tried to save scoreboard without having a scoreboard...");
      } else {
         var1.a("Objectives", (dy)this.b());
         var1.a("PlayerScores", (dy)this.e());
         var1.a("Teams", (dy)this.a());
         this.d(var1);
      }
   }

   protected dq a() {
      dq var1 = new dq();
      Collection var2 = this.b.g();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         azy var4 = (azy)var3.next();
         dh var5 = new dh();
         var5.a("Name", var4.b());
         var5.a("DisplayName", var4.c());
         var5.a("Prefix", var4.e());
         var5.a("Suffix", var4.f());
         var5.a("AllowFriendlyFire", var4.g());
         var5.a("SeeFriendlyInvisibles", var4.h());
         dq var6 = new dq();
         Iterator var7 = var4.d().iterator();

         while(var7.hasNext()) {
            String var8 = (String)var7.next();
            var6.a((dy)(new dx(var8)));
         }

         var5.a("Players", (dy)var6);
         var1.a((dy)var5);
      }

      return var1;
   }

   protected void d(dh var1) {
      dh var2 = new dh();
      boolean var3 = false;

      for(int var4 = 0; var4 < 3; ++var4) {
         azx var5 = this.b.a(var4);
         if(var5 != null) {
            var2.a("slot_" + var4, var5.b());
            var3 = true;
         }
      }

      if(var3) {
         var1.a("DisplaySlots", (dy)var2);
      }

   }

   protected dq b() {
      dq var1 = new dq();
      Collection var2 = this.b.c();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         azx var4 = (azx)var3.next();
         dh var5 = new dh();
         var5.a("Name", var4.b());
         var5.a("CriteriaName", var4.c().a());
         var5.a("DisplayName", var4.d());
         var1.a((dy)var5);
      }

      return var1;
   }

   protected dq e() {
      dq var1 = new dq();
      Collection var2 = this.b.e();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         azz var4 = (azz)var3.next();
         dh var5 = new dh();
         var5.a("Name", var4.e());
         var5.a("Objective", var4.d().b());
         var5.a("Score", var4.c());
         var1.a((dy)var5);
      }

      return var1;
   }

}
