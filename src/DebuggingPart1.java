public class DebuggingPart1 {
    public static void findAbc(String input){
        int index = input.indexOf("abc");
        while (true){
            if (index == -1 || index >= input.length() - 3){
                break;
            }
            String found = input.substring(index+1, index+4);
            System.out.println("found " +found);
            index = input.indexOf("abc",index+3);

            System.out.println("index " + index);
//code
            System.out.println("index after updating " + index);
        }
    }

    public void test(){
        //findAbc("abcd");
        findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
    }
    public static void main(String[] args) {
       findAbc("abcabcabcabca");
       // findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");

    }
}
