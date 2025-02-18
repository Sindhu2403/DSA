public class Example1 {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println("fibonacci of" +num+ "is :" +fibonacci(num));
        for(int i=0;i<5;i++){
            System.out.println("fibonacci is:"+fibonacci(i));
        }
    }
}
