import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class df extends dy {

   private byte[] b;


   df() {}

   public df(byte[] var1) {
      this.b = var1;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.b.length);
      var1.write(this.b);
   }

   void a(DataInput var1, int var2, ds var3) {
      int var4 = var1.readInt();
      var3.a((long)(8 * var4));
      this.b = new byte[var4];
      var1.readFully(this.b);
   }

   public byte a() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.b.length + " bytes]";
   }

   public dy b() {
      byte[] var1 = new byte[this.b.length];
      System.arraycopy(this.b, 0, var1, 0, this.b.length);
      return new df(var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1)?Arrays.equals(this.b, ((df)var1).b):false;
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.b);
   }

   public byte[] c() {
      return this.b;
   }
}
