import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

final class sa implements ParameterizedType {

   public Type[] getActualTypeArguments() {
      return new Type[]{sb.class};
   }

   public Type getRawType() {
      return List.class;
   }

   public Type getOwnerType() {
      return null;
   }
}
