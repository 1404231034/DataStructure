package chainquene;


import java.util.Scanner;

/**
 * @author lpc
 * @date 2019.10.31
 *
 *
 */
public class T {
    public static void main(String[] args){

        ChainQueue q = new ChainQueue();

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        while(x != 0){
            q.push(x);
            x = input.nextInt();
        }

        q.show();
        q.pop();
        q.pop();
        q.show();

        x = input.nextInt();
        while(x != 0){
            q.push(x);
            x = input.nextInt();
        }
        q.show();
        q.pop();
        q.show();
    }
}
