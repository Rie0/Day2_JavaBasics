//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex1
        double weight=70;
        double height=1.75;
        System.out.println("BMI = "+weight/(height*height));

        //Ex2
        double obtainedMarks=85;
        double totalMarks=100;
        System.out.println("percentage = "+((obtainedMarks*100)/totalMarks)+"%");

        //Ex3
        double amountUSD = 100;
        double exchangeRate = 0.85;
        System.out.println("Amount in EUR = "+amountUSD*exchangeRate);

        //Ex4
        String message="Hello, World!";
        StringBuilder str = new StringBuilder(message);
        StringBuilder messageRev = str.reverse();
        System.out.println("Length of string: "+message.length()+
                " And reversed message: "+messageRev);
        //Ex5
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(sentence.substring(10,20));
        //Ex6 sol1
        System.out.println(sentence.contains("jumps"));
        //Ex6 sol2(literal output).
        String keyword = "jumps";
        if(sentence.contains(keyword)) System.out.println("Keyword \"jumps\" is present in the sentence.");
        //Ex7
        System.out.println(sentence.replace("fox","cat"));
        //Ex8
        String string1="Hello";
        String string2="hello";
        System.out.println(string1.equalsIgnoreCase(string2));
    }
}