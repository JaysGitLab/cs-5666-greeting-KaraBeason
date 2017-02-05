public class Hello {

       private void PrintHello(String name){
           
           name = name.substring(0,1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
           System.out.print("Hello, " + name + "!");
     
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
