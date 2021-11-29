public class Main {
    public static void main(String[] args) {
        String s = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] s1 = (s.replaceAll("\\D+", " ").trim().split("\\s"));
        int sum = 0;
        for (String a : s1) {
            if (!a.isEmpty()) {
                int b = Integer.parseInt(a);
                sum += b;
            }
        }
        System.out.println(sum + " рублей");
    }
}
