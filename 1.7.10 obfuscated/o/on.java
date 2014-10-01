import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

final class on implements ParameterizedType {

   public Type[] getActualTypeArguments() {
      return new Type[]{ol.class};
   }

   public Type getRawType() {
      return List.class;
   }

   public Type getOwnerType() {
      return null;
   }
}
