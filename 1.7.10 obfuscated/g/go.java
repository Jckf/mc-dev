import java.util.List;

public class go extends ft {

   private int a;
   private add[] b;


   public go() {}

   public go(int var1, List var2) {
      this.a = var1;
      this.b = new add[var2.size()];

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         add var4 = (add)var2.get(var3);
         this.b[var3] = var4 == null?null:var4.m();
      }

   }

   public void a(et var1) {
      this.a = var1.readUnsignedByte();
      short var2 = var1.readShort();
      this.b = new add[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.b[var3] = var1.c();
      }

   }

   public void b(et var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b.length);
      add[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         add var5 = var2[var4];
         var1.a(var5);
      }

   }

   public void a(fv var1) {
      var1.a(this);
   }
}
