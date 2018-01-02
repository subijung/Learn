public class Exception1 {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            throw new Exception();
        }
        else {
            System.out.println("집가고싶다.");
        }
    }
}
