import java.lang.reflect.Method;

public class BeanUtils {
    public static void assign(Object to, Object from){
        Method[] methods = to.getClass().getDeclaredMethods();
        Class<?> fromClass = from.getClass();
        for (Method method : methods){
            if(method.getName().startsWith("set")){
                String getName = "get" + method.getName().substring(3);
                try {
                    Method methodFrom = fromClass.getDeclaredMethod(getName);
                    method.invoke(to, methodFrom.invoke(from));
                } catch(Exception ignore){}
            }
        }
    }
}
