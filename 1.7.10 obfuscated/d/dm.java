import java.io.DataInput;
import java.io.DataOutput;

public class dm extends dz {

   private float b;


   dm() {}

   public dm(float var1) {
      this.b = var1;
   }

   void a(DataOutput var1) {
      var1.writeFloat(this.b);
   }

   void a(DataInput var1, int var2, ds var3) {
      var3.a(32L);
      this.b = var1.readFloat();
   }

   public byte a() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.b + "f";
   }

   public dy b() {
      return new dm(this.b);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         dm var2 = (dm)var1;
         return this.b == var2.b;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Float.floatToIntBits(this.b);
   }

   public long c() {
      return (long)this.b;
   }

   public int d() {
      return qh.d(this.b);
   }

   public short e() {
      return (short)(qh.d(this.b) & '\uffff');
   }

   public byte f() {
      return (byte)(qh.d(this.b) & 255);
   }

   public double g() {
      return (double)this.b;
   }

   public float h() {
      return this.b;
   }
}
