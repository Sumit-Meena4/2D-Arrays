
public class StBuilders{
    public static void main(String [] arg){
        String str = "hey, how are you?";
        System.out.println(toUppercase(str));
    }

    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}