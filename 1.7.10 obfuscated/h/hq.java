
public class hq extends ft {

   private int[] a;


   public hq() {}

   public hq(int ... var1) {
      this.a = var1;
   }

   public void a(et var1) {
      this.a = new int[var1.readByte()];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = var1.readInt();
      }

   }

   public void b(et var1) {
      var1.writeByte(this.a.length);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeInt(this.a[var2]);
      }

   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(var2 > 0) {
            var1.append(", ");
         }

         var1.append(this.a[var2]);
      }

      return String.format("entities=%d[%s]", new Object[]{Integer.valueOf(this.a.length), var1});
   }
}
