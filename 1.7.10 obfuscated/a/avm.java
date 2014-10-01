import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class avm {

   protected LinkedList a = new LinkedList();
   protected asv b;
   private int c;
   private int d;


   public avm() {}

   public avm(int var1, int var2) {
      this.c = var1;
      this.d = var2;
   }

   public asv a() {
      return this.b;
   }

   public LinkedList b() {
      return this.a;
   }

   public void a(ahb var1, Random var2, asv var3) {
      Iterator var4 = this.a.iterator();

      while(var4.hasNext()) {
         avk var5 = (avk)var4.next();
         if(var5.c().a(var3) && !var5.a(var1, var2, var3)) {
            var4.remove();
         }
      }

   }

   protected void c() {
      this.b = asv.a();
      Iterator var1 = this.a.iterator();

      while(var1.hasNext()) {
         avk var2 = (avk)var1.next();
         this.b.b(var2.c());
      }

   }

   public dh a(int var1, int var2) {
      dh var3 = new dh();
      var3.a("id", avi.a(this));
      var3.a("ChunkX", var1);
      var3.a("ChunkZ", var2);
      var3.a("BB", (dy)this.b.h());
      dq var4 = new dq();
      Iterator var5 = this.a.iterator();

      while(var5.hasNext()) {
         avk var6 = (avk)var5.next();
         var4.a((dy)var6.b());
      }

      var3.a("Children", (dy)var4);
      this.a(var3);
      return var3;
   }

   public void a(dh var1) {}

   public void a(ahb var1, dh var2) {
      this.c = var2.f("ChunkX");
      this.d = var2.f("ChunkZ");
      if(var2.c("BB")) {
         this.b = new asv(var2.l("BB"));
      }

      dq var3 = var2.c("Children", 10);

      for(int var4 = 0; var4 < var3.c(); ++var4) {
         this.a.add(avi.b(var3.b(var4), var1));
      }

      this.b(var2);
   }

   public void b(dh var1) {}

   protected void a(ahb var1, Random var2, int var3) {
      int var4 = 63 - var3;
      int var5 = this.b.c() + 1;
      if(var5 < var4) {
         var5 += var2.nextInt(var4 - var5);
      }

      int var6 = var5 - this.b.e;
      this.b.a(0, var6, 0);
      Iterator var7 = this.a.iterator();

      while(var7.hasNext()) {
         avk var8 = (avk)var7.next();
         var8.c().a(0, var6, 0);
      }

   }

   protected void a(ahb var1, Random var2, int var3, int var4) {
      int var5 = var4 - var3 + 1 - this.b.c();
      boolean var6 = true;
      int var10;
      if(var5 > 1) {
         var10 = var3 + var2.nextInt(var5);
      } else {
         var10 = var3;
      }

      int var7 = var10 - this.b.b;
      this.b.a(0, var7, 0);
      Iterator var8 = this.a.iterator();

      while(var8.hasNext()) {
         avk var9 = (avk)var8.next();
         var9.c().a(0, var7, 0);
      }

   }

   public boolean d() {
      return true;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
