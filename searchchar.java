public class searchchar{
    public static void main(String[] args) {
        
        String s= "babayaga";
char k = 'a';
System.out.print(pos(s,k));
//System.out.println((s.toCharArray()));


    }
    static int  pos(String s,char k){
        if(s.length()==0){
            return -1;

        }
        for(int i=0;i<=s.length();i++){
            if(s.charAt(i) ==k){
                return i+1;

            }
        }
        return -1;

    }}