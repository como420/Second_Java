package mission;

public class Calculator {
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator (AddOperation addOperation,
                      SubstractOperation substractOperation,
                      MultiplyOperation multiplyOperation,
                      DivideOperation divideOperation
                      ) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate(String operator, int firstNumber, int secondNumber) {
        double answer = 0;

        if (operator.equals("+")) {
            answer = addOperation.operate(firstNumber, secondNumber); // 더하기 조건 값
        } else if (operator.equals("-")) {
            answer = substractOperation.operate(firstNumber, secondNumber); // 빼기 조건 값
        } else if (operator.equals("*")) {
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            answer = divideOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("%")) {
            answer = firstNumber % secondNumber;
        }
        return answer;
    }
}
