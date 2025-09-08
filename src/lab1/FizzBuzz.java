package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        //java代码结尾要加；

        while(i <= 100) {

        //for (int i = 1; i < 100; i++) {
            /**
             * 条件语句在for后面的括号里，括号内条件依次判断？
             * The conditional statement is placed within the parentheses after
             * the "for" keyword. The conditions within the parentheses are
             * evaluated one by one.
             */

            // Find out which numbers divide i.
            i = DoFizzBuzz(i);
        }
    }

    private static int DoFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        //boolean 可能是这种比较必须添加的？

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            //if和for一样条件语句放在括号里，经过测试，and在java中无法使用

            System.out.println("Fizz Buzz");
            //System.out.暂时不知道是什么前缀，可能类似一个库，使用功能前要调用库的功能

        } else if (divisibleBy3) {
            //每段功能结尾要使用{}

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}
