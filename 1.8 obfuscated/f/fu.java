import java.io.DataInput;
import java.io.DataOutput;

public class fu extends ge {

   private int b;


   fu() {}

   public fu(int var1) {
      this.b = var1;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.b);
   }

   void a(DataInput var1, int var2, fx var3) {
      var3.a(32L);
      this.b = var1.readInt();
   }

   public byte a() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.b;
   }

   public gd b() {
      return new fu(this.b);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         fu var2 = (fu)var1;
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
      return (short)(this.b & '\uffff');
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
