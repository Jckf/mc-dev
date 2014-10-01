import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dh extends dy {

   private static final Logger b = LogManager.getLogger();
   private Map c = new HashMap();


   void a(DataOutput var1) {
      Iterator var2 = this.c.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         dy var4 = (dy)this.c.get(var3);
         a(var3, var4, var1);
      }

      var1.writeByte(0);
   }

   void a(DataInput var1, int var2, ds var3) {
      if(var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         this.c.clear();

         byte var4;
         while((var4 = a(var1, var3)) != 0) {
            String var5 = b(var1, var3);
            var3.a((long)(16 * var5.length()));
            dy var6 = a(var4, var5, var1, var2 + 1, var3);
            this.c.put(var5, var6);
         }

      }
   }

   public Set c() {
      return this.c.keySet();
   }

   public byte a() {
      return (byte)10;
   }

   public void a(String var1, dy var2) {
      this.c.put(var1, var2);
   }

   public void a(String var1, byte var2) {
      this.c.put(var1, new dg(var2));
   }

   public void a(String var1, short var2) {
      this.c.put(var1, new dw(var2));
   }

   public void a(String var1, int var2) {
      this.c.put(var1, new dp(var2));
   }

   public void a(String var1, long var2) {
      this.c.put(var1, new dr(var2));
   }

   public void a(String var1, float var2) {
      this.c.put(var1, new dm(var2));
   }

   public void a(String var1, double var2) {
      this.c.put(var1, new dk(var2));
   }

   public void a(String var1, String var2) {
      this.c.put(var1, new dx(var2));
   }

   public void a(String var1, byte[] var2) {
      this.c.put(var1, new df(var2));
   }

   public void a(String var1, int[] var2) {
      this.c.put(var1, new dn(var2));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2?1:0));
   }

   public dy a(String var1) {
      return (dy)this.c.get(var1);
   }

   public byte b(String var1) {
      dy var2 = (dy)this.c.get(var1);
      return var2 != null?var2.a():0;
   }

   public boolean c(String var1) {
      return this.c.containsKey(var1);
   }

   public boolean b(String var1, int var2) {
      byte var3 = this.b(var1);
      return var3 == var2?true:(var2 != 99?false:var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4 || var3 == 5 || var3 == 6);
   }

   public byte d(String var1) {
      try {
         return !this.c.containsKey(var1)?0:((dz)this.c.get(var1)).f();
      } catch (ClassCastException var3) {
         return (byte)0;
      }
   }

   public short e(String var1) {
      try {
         return !this.c.containsKey(var1)?0:((dz)this.c.get(var1)).e();
      } catch (ClassCastException var3) {
         return (short)0;
      }
   }

   public int f(String var1) {
      try {
         return !this.c.containsKey(var1)?0:((dz)this.c.get(var1)).d();
      } catch (ClassCastException var3) {
         return 0;
      }
   }

   public long g(String var1) {
      try {
         return !this.c.containsKey(var1)?0L:((dz)this.c.get(var1)).c();
      } catch (ClassCastException var3) {
         return 0L;
      }
   }

   public float h(String var1) {
      try {
         return !this.c.containsKey(var1)?0.0F:((dz)this.c.get(var1)).h();
      } catch (ClassCastException var3) {
         return 0.0F;
      }
   }

   public double i(String var1) {
      try {
         return !this.c.containsKey(var1)?0.0D:((dz)this.c.get(var1)).g();
      } catch (ClassCastException var3) {
         return 0.0D;
      }
   }

   public String j(String var1) {
      try {
         return !this.c.containsKey(var1)?"":((dy)this.c.get(var1)).a_();
      } catch (ClassCastException var3) {
         return "";
      }
   }

   public byte[] k(String var1) {
      try {
         return !this.c.containsKey(var1)?new byte[0]:((df)this.c.get(var1)).c();
      } catch (ClassCastException var3) {
         throw new s(this.a(var1, 7, var3));
      }
   }

   public int[] l(String var1) {
      try {
         return !this.c.containsKey(var1)?new int[0]:((dn)this.c.get(var1)).c();
      } catch (ClassCastException var3) {
         throw new s(this.a(var1, 11, var3));
      }
   }

   public dh m(String var1) {
      try {
         return !this.c.containsKey(var1)?new dh():(dh)this.c.get(var1);
      } catch (ClassCastException var3) {
         throw new s(this.a(var1, 10, var3));
      }
   }

   public dq c(String var1, int var2) {
      try {
         if(this.b(var1) != 9) {
            return new dq();
         } else {
            dq var3 = (dq)this.c.get(var1);
            return var3.c() > 0 && var3.d() != var2?new dq():var3;
         }
      } catch (ClassCastException var4) {
         throw new s(this.a(var1, 9, var4));
      }
   }

   public boolean n(String var1) {
      return this.d(var1) != 0;
   }

   public void o(String var1) {
      this.c.remove(var1);
   }

   public String toString() {
      String var1 = "{";

      String var3;
      for(Iterator var2 = this.c.keySet().iterator(); var2.hasNext(); var1 = var1 + var3 + ':' + this.c.get(var3) + ',') {
         var3 = (String)var2.next();
      }

      return var1 + "}";
   }

   public boolean d() {
      return this.c.isEmpty();
   }

   private b a(String var1, int var2, ClassCastException var3) {
      b var4 = b.a(var3, "Reading NBT data");
      k var5 = var4.a("Corrupt NBT tag", 1);
      var5.a("Tag type found", (Callable)(new di(this, var1)));
      var5.a("Tag type expected", (Callable)(new dj(this, var2)));
      var5.a("Tag name", (Object)var1);
      return var4;
   }

   public dy b() {
      dh var1 = new dh();
      Iterator var2 = this.c.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.a(var3, ((dy)this.c.get(var3)).b());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         dh var2 = (dh)var1;
         return this.c.entrySet().equals(var2.c.entrySet());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.c.hashCode();
   }

   private static void a(String var0, dy var1, DataOutput var2) {
      var2.writeByte(var1.a());
      if(var1.a() != 0) {
         var2.writeUTF(var0);
         var1.a(var2);
      }
   }

   private static byte a(DataInput var0, ds var1) {
      return var0.readByte();
   }

   private static String b(DataInput var0, ds var1) {
      return var0.readUTF();
   }

   static dy a(byte var0, String var1, DataInput var2, int var3, ds var4) {
      dy var5 = dy.a(var0);

      try {
         var5.a(var2, var3, var4);
         return var5;
      } catch (IOException var9) {
         b var7 = b.a(var9, "Loading NBT data");
         k var8 = var7.a("NBT Tag");
         var8.a("Tag name", (Object)var1);
         var8.a("Tag type", (Object)Byte.valueOf(var0));
         throw new s(var7);
      }
   }

   // $FF: synthetic method
   static Map a(dh var0) {
      return var0.c;
   }

}
