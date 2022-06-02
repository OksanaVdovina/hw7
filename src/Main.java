public class Main {
    public static void main(String[] args) {

    // Задание 1

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

    // Задание 2

        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

    // Задание 3 (2 варианта решения, как решить без replace - не придумала)

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

        fullName = "Иванов Семён Семёнович";
        System.out.print("Данные ФИО сотрудника — ");
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("ё")) {
                words[i] = words[i].replace("ё", "е");
            }
            if (i == words.length - 1) {
                System.out.print(words[i]);
            } else {
                System.out.print(words[i] + " ");
            }
        }

    }
}