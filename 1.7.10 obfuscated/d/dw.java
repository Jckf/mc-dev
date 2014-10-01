import java.io.DataInput;
import java.io.DataOutput;

public class dw extends dz {

   private short b;


   public dw() {}

   public dw(short var1) {
      this.b = var1;
   }

   void a(DataOutput var1) {
      var1.writeShort(this.b);
   }

   void a(DataInput var1, int var2, ds var3) {
      var3.a(16L);
      this.b = var1.readShort();
   }

   public byte a() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.b + "s";
   }

   public dy b() {
      return new dw(this.b);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         dw var2 = (dw)var1;
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
      return this.b;
   }

   public byte f() {
      return (byte)(this.b & 255);
   }

   public double g() {
      return (double)this.b;
   }

   public float h() {
      return (float)this.b;
   }
}
