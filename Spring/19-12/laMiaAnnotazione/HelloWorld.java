import java.lang.reflect.Method;

public class HelloWorld
{
    @MyAnnotation(value = "Ciao, mondo!")
    public void sayHello()
    {
        System.out.println("Questo metodo è annotato con  @MyAnnotation");
    }

    public static void main(String[] args) throws Exception
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

        Method method = HelloWorld.class.getMethod("sayHello");
        
        if(method.isAnnotationPresent(MyAnnotation.class))
        {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.err.println("Valore dell'annotazione: " + annotation.value());
        }
        else 
        {
            System.err.println("L'annotazione @MyAnnotation non è presente sul metodo sayHello.");
        }
    }
}