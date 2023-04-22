public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------- Kotak Bank ------------");

        Accounts subhranshu = new Accounts("Subhranshu", "082sds879sqx", 10000, 'M', "A");
        subhranshu.setPassword("alliswell");
        subhranshu.checkLoan();
        subhranshu.getLoan(5000);
        subhranshu.payLoan(7000);
        print(subhranshu.checkLoan());
        System.out.println(subhranshu.getBalance("082sds879sqx", "alliswell"));
    }

    public static void print(String res) {
        System.out.println(res);
    }
}
