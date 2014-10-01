import java.io.DataInput;
import java.io.DataOutput;

public class dk extends dz {

   private double b;


   dk() {}

   public dk(double var1) {
      this.b = var1;
   }

   void a(DataOutput var1) {
      var1.writeDouble(this.b);
   }

   void a(DataInput var1, int var2, ds var3) {
      var3.a(64L);
      this.b = var1.readDouble();
   }

   public byte a() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.b + "d";
   }

   public dy b() {
      return new dk(this.b);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         dk var2 = (dk)var1;
         return this.b == var2.b;
      } else {
         return false;
      }
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.b);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }

   public long c() {
      return (long)Math.floor(this.b);
   }

   public int d() {
      return qh.c(this.b);
   }

   public short e() {
      return (short)(qh.c(this.b) & '\uffff');
   }

   public byte f() {
      return (byte)(qh.c(this.b) & 255);
   }

   public double g() {
      return this.b;
   }

   public float h() {
      return (float)this.b;
   }
}
