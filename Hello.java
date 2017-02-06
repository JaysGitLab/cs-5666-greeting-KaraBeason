public class Hello {

      private String name;
      public String getName(){
          return this.name;
      }

      private String compName;
      public String getCompName(){
          if (this.compName == null){
              return "Computer name not set.";
          }
          else return this.compName;
      }

       private void PrintHello(String name){
           
           name = name.substring(0,1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
           System.out.print("Hello, " + name + "!");
     
      }

       public static void main(String[] args) {

          Hello helloWorld = new Hello();

          if (args.length == 0) {
             helloWorld.name = "Kara";
           }
          if (args.length == 1) {
             helloWorld.name = args[0].toString();
           }
          else if (args.length ==3){
              helloWorld.name = args[2].toString();
              helloWorld.compName = args[1].toString();
          }
          
          helloWorld.name = helloWorld.name.substring(0,1).toUpperCase() + helloWorld.name.substring(1);
          helloWorld.PrintHello();
       }
}
