//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    try {
        String result = calc(input);
        System.out.println(result);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
public static String calc (String input) throws Exception {
    input = input.trim();
    String[] parts = input.split(" ");
    if (parts.length != 3) {
        throw new Exception("throws Exception");
    }

    int a, b;
    String operator;
    try {
        a = Integer.parseInt(parts[0]);
        operator = parts[1];
        b = Integer.parseInt(parts[2]);
    } catch (Exception e) {
        throw new Exception("throws Exception");
    }

    // Проверка диапозона переменных
    if (a < 1 || a > 10 || b < 1 || b > 10) {
        throw new Exception("throws Exception");
    }

    // Выбор оператора
    int result = switch (operator) {
        case "+" -> a + b;
        case "-" -> a - b;
        case "*" -> a * b;
        case "/" -> a / b;
        default -> throw new Exception("throws Exception");
    };
    return String.valueOf(result);
}
