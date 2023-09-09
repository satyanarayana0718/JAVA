import java.io.*;
public class CmdLineArgsUpd{
    public static void main(String args[]){
        if(args.length!=2){
            System.out.println("invalid number of arguments\n you need pass two integers");
        }
        else{
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=x+y;
        System.out.println("sum of "+x+" and "
        +y+ " is " +z);
        }
    }
}