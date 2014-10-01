
public class gv extends ft {

   public static final String[] a = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
   private int b;
   private float c;


   public gv() {}

   public gv(int var1, float var2) {
      this.b = var1;
      this.c = var2;
   }

   public void a(et var1) {
      this.b = var1.readUnsignedByte();
      this.c = var1.readFloat();
   }

   public void b(et var1) {
      var1.writeByte(this.b);
      var1.writeFloat(this.c);
   }

   public void a(fv var1) {
      var1.a(this);
   }

}
