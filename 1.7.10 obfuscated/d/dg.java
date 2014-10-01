import java.io.DataInput;
import java.io.DataOutput;

public class dg extends dz {

   private byte b;


   dg() {}

   public dg(byte var1) {
      this.b = var1;
   }

   void a(DataOutput var1) {
      var1.writeByte(this.b);
   }

   void a(DataInput var1, int var2, ds var3) {
      var3.a(8L);
      this.b = var1.readByte();
   }

   public byte a() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.b + "b";
   }

   public dy b() {
      return new dg(this.b);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         dg var2 = (dg)var1;
         return this.b == var2.b;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.b;
   }

   public long c() {
      return (long)this.b;
   }

   public int d() {
      return this.b;
   }

   public short e() {
      return (short)this.b;
   }

   public byte f() {
      return this.b;
   }

   public double g() {
      return (double)this.b;
   }

   public float h() {
      return (float)this.b;
   }
}
