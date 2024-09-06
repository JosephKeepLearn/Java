public class TowerOfHanoi {
    // 递归解决汉诺塔问题的主函数
    public static void solveHanoi(int n, char source, char auxiliary, char target) {
        // 基本情况：如果只有一个盘子，直接移动到目标柱子
        if (n == 1) {
            move(source, target);
        } else {
            // 步骤1：将 n-1 个盘子从源柱子移动到辅助柱子
            solveHanoi(n - 1, source, target, auxiliary);
            // 步骤2：将第 n 个盘子移动到目标柱子
            move(source, target);
            // 步骤3：将 n-1 个盘子从辅助柱子移动到目标柱子
            solveHanoi(n - 1, auxiliary, source, target);
        }
        ;
    }

    // 执行盘子移动操作的函数
    public static void move(char source, char target) {
        System.out.println(source + "->" + target);
    }

    public static void main(String[] args) {
        int n = 3;
        solveHanoi(n, 'A', 'B', 'C');
    }
}
