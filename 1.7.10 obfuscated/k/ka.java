import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ka extends ft {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(kf.class, new kg()).registerTypeAdapter(kc.class, new kd()).registerTypeAdapter(kb.class, new ke()).registerTypeHierarchyAdapter(fj.class, new fk()).registerTypeHierarchyAdapter(fn.class, new fp()).registerTypeAdapterFactory(new qf()).create();
   private kb b;


   public ka() {}

   public ka(kb var1) {
      this.b = var1;
   }

   public void a(et var1) {
      this.b = (kb)a.fromJson(var1.c(32767), kb.class);
   }

   public void b(et var1) {
      var1.a(a.toJson((Object)this.b));
   }

   public void a(jy var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
