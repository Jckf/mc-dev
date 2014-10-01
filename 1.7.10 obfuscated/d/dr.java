import java.io.DataInput;
import java.io.DataOutput;

public class dr extends dz {

   private long b;


   dr() {}

   public dr(long var1) {
      this.b = var1;
   }

   void a(DataOutput var1) {
      var1.writeLong(this.b);
   }

   void a(DataInput var1, int var2, ds var3) {
      var3.a(64L);
      this.b = var1.readLong();
   }

   public byte a() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.b + "L";
   }

   public dy b() {
      return new dr(this.b);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         dr var2 = (dr)var1;
         return this.b == var2.b;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
   }

   public long c() {
      return this.b;
   }

   public int d() {
      return (int)(this.b & -1L);
   }

   public short e() {
      return (short)((int)(this.b & 65535L));
   }

   public byte f() {
      return (byte)((int)(this.b & 255L));
   }

   public double g() {
      return (double)this.b;
   }

   public float h() {
      return (float)this.b;
   }
}
