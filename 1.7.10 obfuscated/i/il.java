import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class il extends ft {

   private int a;
   private final List b = new ArrayList();


   public il() {}

   public il(int var1, Collection var2) {
      this.a = var1;
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         ti var4 = (ti)var3.next();
         this.b.add(new im(this, var4.a().a(), var4.b(), var4.c()));
      }

   }

   public void a(et var1) {
      this.a = var1.readInt();
      int var2 = var1.readInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1.c(64);
         double var5 = var1.readDouble();
         ArrayList var7 = new ArrayList();
         short var8 = var1.readShort();

         for(int var9 = 0; var9 < var8; ++var9) {
            UUID var10 = new UUID(var1.readLong(), var1.readLong());
            var7.add(new tj(var10, "Unknown synced attribute modifier", var1.readDouble(), var1.readByte()));
         }

         this.b.add(new im(this, var4, var5, var7));
      }

   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         im var3 = (im)var2.next();
         var1.a(var3.a());
         var1.writeDouble(var3.b());
         var1.writeShort(var3.c().size());
         Iterator var4 = var3.c().iterator();

         while(var4.hasNext()) {
            tj var5 = (tj)var4.next();
            var1.writeLong(var5.a().getMostSignificantBits());
            var1.writeLong(var5.a().getLeastSignificantBits());
            var1.writeDouble(var5.d());
            var1.writeByte(var5.c());
         }
      }

   }

   public void a(fv var1) {
      var1.a(this);
   }
}
