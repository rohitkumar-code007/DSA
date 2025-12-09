import java.util.Scanner;
class small{
    public static void main(String[] args){
        char[] letter={'c','e','h','p'};
        Scanner ch = new Scanner(System.in);
        char tar = ch.next().charAt(0);
        
        System.out.println(smallest(letter,tar));

        


    }
    static char smallest(char[] letter,char tar){
        int s=0;
        int e = letter.length - 1;
        while(s<=e){
            int mid =s+(e-s)/2;
            
             if (letter[mid]<=tar) {
                s=mid+1;
                
            }
            else {
                e =mid-1;
            }
             

        }
        return letter[s % letter.length];
    }
 }