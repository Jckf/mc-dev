import java.util.concurrent.atomic.AtomicReference;

class ex {

   private AtomicReference[] a = new AtomicReference[100];


   public ex() {
      for(int var1 = 0; var1 < 100; ++var1) {
         this.a[var1] = new AtomicReference(new ey(0L, 0, 0.0D, (ev)null));
      }

   }

   public void a(int var1, long var2) {
      try {
         if(var1 < 0 || var1 >= 100) {
            return;
         }

         ey var4;
         ey var5;
         do {
            var4 = (ey)this.a[var1].get();
            var5 = var4.a(var2);
         } while(!this.a[var1].compareAndSet(var4, var5));
      } catch (Exception var6) {
         if(eu.i().isDebugEnabled()) {
            eu.i().debug(eu.j(), "NetStat failed with packetId: " + var1, (Throwable)var6);
         }
      }

   }

   public long a() {
      long var1 = 0L;

      for(int var3 = 0; var3 < 100; ++var3) {
         var1 += ((ey)this.a[var3].get()).a();
      }

      return var1;
   }

   public long b() {
      long var1 = 0L;

      for(int var3 = 0; var3 < 100; ++var3) {
         var1 += (long)((ey)this.a[var3].get()).b();
      }

      return var1;
   }

   public ew c() {
      int var1 = -1;
      ey var2 = new ey(-1L, -1, 0.0D, (ev)null);

      for(int var3 = 0; var3 < 100; ++var3) {
         ey var4 = (ey)this.a[var3].get();
         if(ey.a(var4) > ey.a(var2)) {
            var1 = var3;
            var2 = var4;
         }
      }

      return new ew(var1, var2);
   }

   public ew d() {
      int var1 = -1;
      ey var2 = new ey(-1L, -1, 0.0D, (ev)null);

      for(int var3 = 0; var3 < 100; ++var3) {
         ey var4 = (ey)this.a[var3].get();
         if(ey.b(var4) > ey.b(var2)) {
            var1 = var3;
            var2 = var4;
         }
      }

      return new ew(var1, var2);
   }

   public ew a(int var1) {
      return var1 >= 0 && var1 < 100?new ew(var1, (ey)this.a[var1].get()):null;
   }
}
