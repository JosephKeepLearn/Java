public class FrogJump {
    public static void main(String[] args) {
        int n = 5; // 例如台阶数为5
        System.out.println("到达第 " + n + " 阶的方案数是：" + numWays(n));
    }

    public static int numWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return numWays(n - 1) + numWays(n - 2);

    }
}
