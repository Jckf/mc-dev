import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;

public class te {

   private final sa a;
   private boolean b = true;
   private static final HashMap c = new HashMap();
   private final Map d = new HashMap();
   private boolean e;
   private ReadWriteLock f = new ReentrantReadWriteLock();


   public te(sa var1) {
      this.a = var1;
   }

   public void a(int var1, Object var2) {
      Integer var3 = (Integer)c.get(var2.getClass());
      if(var3 == null) {
         throw new IllegalArgumentException("Unknown data type: " + var2.getClass());
      } else if(var1 > 31) {
         throw new IllegalArgumentException("Data value id is too big with " + var1 + "! (Max is " + 31 + ")");
      } else if(this.d.containsKey(Integer.valueOf(var1))) {
         throw new IllegalArgumentException("Duplicate id value for " + var1 + "!");
      } else {
         tf var4 = new tf(var3.intValue(), var1, var2);
         this.f.writeLock().lock();
         this.d.put(Integer.valueOf(var1), var4);
         this.f.writeLock().unlock();
         this.b = false;
      }
   }

   public void a(int var1, int var2) {
      tf var3 = new tf(var2, var1, (Object)null);
      this.f.writeLock().lock();
      this.d.put(Integer.valueOf(var1), var3);
      this.f.writeLock().unlock();
      this.b = false;
   }

   public byte a(int var1) {
      return ((Byte)this.i(var1).b()).byteValue();
   }

   public short b(int var1) {
      return ((Short)this.i(var1).b()).shortValue();
   }

   public int c(int var1) {
      return ((Integer)this.i(var1).b()).intValue();
   }

   public float d(int var1) {
      return ((Float)this.i(var1).b()).floatValue();
   }

   public String e(int var1) {
      return (String)this.i(var1).b();
   }

   public add f(int var1) {
      return (add)this.i(var1).b();
   }

   private tf i(int var1) {
      this.f.readLock().lock();

      tf var2;
      try {
         var2 = (tf)this.d.get(Integer.valueOf(var1));
      } catch (Throwable var6) {
         b var4 = b.a(var6, "Getting synched entity data");
         k var5 = var4.a("Synched entity data");
         var5.a("Data ID", (Object)Integer.valueOf(var1));
         throw new s(var4);
      }

      this.f.readLock().unlock();
      return var2;
   }

   public void b(int var1, Object var2) {
      tf var3 = this.i(var1);
      if(ObjectUtils.notEqual(var2, var3.b())) {
         var3.a(var2);
         this.a.i(var1);
         var3.a(true);
         this.e = true;
      }

   }

   public void h(int var1) {
      tf.a(this.i(var1), true);
      this.e = true;
   }

   public boolean a() {
      return this.e;
   }

   public static void a(List var0, et var1) {
      if(var0 != null) {
         Iterator var2 = var0.iterator();

         while(var2.hasNext()) {
            tf var3 = (tf)var2.next();
            a(var1, var3);
         }
      }

      var1.writeByte(127);
   }

   public List b() {
      ArrayList var1 = null;
      if(this.e) {
         this.f.readLock().lock();
         Iterator var2 = this.d.values().iterator();

         while(var2.hasNext()) {
            tf var3 = (tf)var2.next();
            if(var3.d()) {
               var3.a(false);
               if(var1 == null) {
                  var1 = new ArrayList();
               }

               var1.add(var3);
            }
         }

         this.f.readLock().unlock();
      }

      this.e = false;
      return var1;
   }

   public void a(et var1) {
      this.f.readLock().lock();
      Iterator var2 = this.d.values().iterator();

      while(var2.hasNext()) {
         tf var3 = (tf)var2.next();
         a(var1, var3);
      }

      this.f.readLock().unlock();
      var1.writeByte(127);
   }

   public List c() {
      ArrayList var1 = null;
      this.f.readLock().lock();

      tf var3;
      for(Iterator var2 = this.d.values().iterator(); var2.hasNext(); var1.add(var3)) {
         var3 = (tf)var2.next();
         if(var1 == null) {
            var1 = new ArrayList();
         }
      }

      this.f.readLock().unlock();
      return var1;
   }

   private static void a(et var0, tf var1) {
      int var2 = (var1.c() << 5 | var1.a() & 31) & 255;
      var0.writeByte(var2);
      switch(var1.c()) {
      case 0:
         var0.writeByte(((Byte)var1.b()).byteValue());
         break;
      case 1:
         var0.writeShort(((Short)var1.b()).shortValue());
         break;
      case 2:
         var0.writeInt(((Integer)var1.b()).intValue());
         break;
      case 3:
         var0.writeFloat(((Float)var1.b()).floatValue());
         break;
      case 4:
         var0.a((String)var1.b());
         break;
      case 5:
         add var4 = (add)var1.b();
         var0.a(var4);
         break;
      case 6:
         r var3 = (r)var1.b();
         var0.writeInt(var3.a);
         var0.writeInt(var3.b);
         var0.writeInt(var3.c);
      }

   }

   public static List b(et var0) {
      ArrayList var1 = null;

      for(byte var2 = var0.readByte(); var2 != 127; var2 = var0.readByte()) {
         if(var1 == null) {
            var1 = new ArrayList();
         }

         int var3 = (var2 & 224) >> 5;
         int var4 = var2 & 31;
         tf var5 = null;
         switch(var3) {
         case 0:
            var5 = new tf(var3, var4, Byte.valueOf(var0.readByte()));
            break;
         case 1:
            var5 = new tf(var3, var4, Short.valueOf(var0.readShort()));
            break;
         case 2:
            var5 = new tf(var3, var4, Integer.valueOf(var0.readInt()));
            break;
         case 3:
            var5 = new tf(var3, var4, Float.valueOf(var0.readFloat()));
            break;
         case 4:
            var5 = new tf(var3, var4, var0.c(32767));
            break;
         case 5:
            var5 = new tf(var3, var4, var0.c());
            break;
         case 6:
            int var6 = var0.readInt();
            int var7 = var0.readInt();
            int var8 = var0.readInt();
            var5 = new tf(var3, var4, new r(var6, var7, var8));
         }

         var1.add(var5);
      }

      return var1;
   }

   public boolean d() {
      return this.b;
   }

   public void e() {
      this.e = false;
   }

   static {
      c.put(Byte.class, Integer.valueOf(0));
      c.put(Short.class, Integer.valueOf(1));
      c.put(Integer.class, Integer.valueOf(2));
      c.put(Float.class, Integer.valueOf(3));
      c.put(String.class, Integer.valueOf(4));
      c.put(add.class, Integer.valueOf(5));
      c.put(r.class, Integer.valueOf(6));
   }
}
