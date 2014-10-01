
public class ahv {

   public float a;
   public float b;


   public ahv(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public ahv a() {
      return new ahv(this.a * 0.8F, this.b * 0.6F);
   }
}
