package org.example.exercicios.Teste06;

public class SumDigits {

    public static int closingSum(int number) {
        String numStr = Integer.toString(number);
        int sum = 0;
        int left = 0;
        int right = numStr.length() - 1;

        StringBuilder explanation = new StringBuilder();

        while (left < right) {

            int num = Integer.parseInt("" + numStr.charAt(left) + numStr.charAt(right));
            sum += num;


            explanation.append("# The first and last digits are ").append(numStr.charAt(left))
                    .append(" and ").append(numStr.charAt(right)).append(".\n");
            explanation.append("# ").append(numStr.charAt(left)).append(" and ").append(numStr.charAt(right))
                    .append(" form ").append(num).append(".\n");

            left++;
            right--;
        }


        if (left == right) {
            int centerDigit = numStr.charAt(left) - '0';
            sum += centerDigit;
            explanation.append("# The digit is ").append(centerDigit).append(".\n");
        }

        explanation.append("# ").append(sum);


        System.out.println(explanation.toString());

        return sum;
    }


}
