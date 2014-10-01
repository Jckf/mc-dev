
public class hf extends ft {

   protected int a;
   protected byte b;
   protected byte c;
   protected byte d;
   protected byte e;
   protected byte f;
   protected boolean g;


   public hf() {}

   public hf(int var1) {
      this.a = var1;
   }

   public void a(et var1) {
      this.a = var1.readInt();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d", new Object[]{Integer.valueOf(this.a)});
   }

   public String toString() {
      return "Entity_" + super.toString();
   }
}
