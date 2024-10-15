import java.util.Scanner;

class Main {
    String userinput = getUserInput();
    public static void main(String[] args){
        Main app = new Main();
        while (app.userinput != "n"){
            // preform action
        }
        // show llist and stats
    }
    

    String getUserInput(){
        System.out.println("a:insert b:remove c:display");
        Scanner action = new Scanner(System.in);

        String x = action.nextLine();
        return x;
    }
    
}