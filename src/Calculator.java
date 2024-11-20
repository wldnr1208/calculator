import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("분모가 0일 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산 기호입니다.");
        }

        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
