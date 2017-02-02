public class Hello {

       private void PrintHello(String name){
           if (name != null){
               System.out.print("Hello, " + name + "!");
           }
           else {
               System.out.print("Hello, Kara!");
           }
       }
       public static void main(String[] args) {
          
           String name;
          
           if (args.length == 0)
           {
               name = "Kara";
           }
           else {
               name = args[0].toString();
           }

            Hello helloWorld = new Hello();
            
            helloWorld.PrintHello(name);
       }
}
