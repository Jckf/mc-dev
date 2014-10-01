import java.io.DataInput;
import java.io.DataOutput;

public class dx extends dy {

   private String b;


   public dx() {
      this.b = "";
   }

   public dx(String var1) {
      this.b = var1;
      if(var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void a(DataOutput var1) {
      var1.writeUTF(this.b);
   }

   void a(DataInput var1, int var2, ds var3) {
      this.b = var1.readUTF();
      var3.a((long)(16 * this.b.length()));
   }

   public byte a() {
      return (byte)8;
   }

   public String toString() {
      return "\"" + this.b + "\"";
   }

   public dy b() {
      return new dx(this.b);
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         dx var2 = (dx)var1;
         return this.b == null && var2.b == null || this.b != null && this.b.equals(var2.b);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.b.hashCode();
   }

   public String a_() {
      return this.b;
   }
}
