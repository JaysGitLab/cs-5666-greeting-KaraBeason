public class Hello {

      private String name;
      
      public void setName(String name){
          this.name = name.substring(0,1).toUpperCase() + name.substring(1);
      }

      public String getName(){
          if (this.name == null){
              return "Kara";
          }
          else return this.name;
      }

      private String compName;
      
      public void setCompName(String cName){
          this.compName = cName;
      }

      public String getCompName(){
          if (this.compName == null){
              return "Optimus Prime";
          }
          else return this.compName;
      }

      private void PrintHello(){
          System.out.println("Hello, " + this.getName() + "!");
          System.out.println("My name is " + this.getCompName() + ".");
          System.out.println("How are you doing today?");
      }

       public static void main(String[] args) {

          Hello helloWorld = new Hello();

          if (args.length == 1) {
             helloWorld.setName(args[0].toString());
           }
          else if (args.length ==2){
              helloWorld.setName(args[0].toString());
              helloWorld.setCompName(args[1].toString());
          }
                   
          helloWorld.PrintHello();
       }
}
