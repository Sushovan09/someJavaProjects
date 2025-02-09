public class CorrectNameAndAge {
    public static void main(String[] args) {
        String s = "My name is Alok Kumar Gupta and My age is 45 years";
        s = s.replaceAll("Alok","Ashok");
        s=s.replaceAll("45","35");
        System.out.println(s);
    }
}
