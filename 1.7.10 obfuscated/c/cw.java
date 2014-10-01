import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

public class cw extends da implements cs {

   protected final ct a = new ct();
   protected final Map b;


   public cw() {
      this.b = ((BiMap)this.c).inverse();
   }

   public void a(int var1, String var2, Object var3) {
      this.a.a(var3, var1);
      this.a(c(var2), var3);
   }

   protected Map a() {
      return HashBiMap.create();
   }

   public Object a(String var1) {
      return super.a(c(var1));
   }

   public String c(Object var1) {
      return (String)this.b.get(var1);
   }

   public boolean b(String var1) {
      return super.d(c(var1));
   }

   public int b(Object var1) {
      return this.a.b(var1);
   }

   public Object a(int var1) {
      return this.a.a(var1);
   }

   public Iterator iterator() {
      return this.a.iterator();
   }

   public boolean b(int var1) {
      return this.a.b(var1);
   }

   private static String c(String var0) {
      return var0.indexOf(58) == -1?"minecraft:" + var0:var0;
   }

   // $FF: synthetic method
   public boolean d(Object var1) {
      return this.b((String)var1);
   }
}
