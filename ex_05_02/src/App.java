public class App {
    public static void main(String[] args) throws Exception {// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = { 500, 100, 50, 10 };
        int money = 2680;
        System.out.println("money=" + money);
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
            money %= coinUnit[i];

            // System.out.println("500원="+2680/coinUnit[0]);
            // System.out.println("100원="+180/coinUnit[1]);
            // System.out.println("50원="+80/coinUnit[2]);
            // System.out.println("10원="+30/coinUnit[3]);
    } // main
}
}

// money = 2608
// 500원: 5
// 100원: 1
// 50원: 1
// 10원: 3