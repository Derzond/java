package arrayList;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();

        test.put("1");
        test.put("2");
        test.put("3");
        test.put("4");
        test.put("5");

        test.clear();

        for (int i = 0; i < test.size(); i++)
            System.out.println(test.get(i));

        System.out.println(test.contains("1"));
    }
}
