package edabit;

public class wordcount {
    public static void main(String[] args) {
        System.out.println(countWords("John is from Germany but she born in England"));

    }
        public static int countWords (String s){

            String arr[] = s.split(" ");
            return arr.length;
        }
    }