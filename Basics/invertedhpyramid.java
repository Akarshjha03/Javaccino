//this code prints the inverted half pyramid

public class invertedhpyramid {
    public static void main(String args[]){
        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
