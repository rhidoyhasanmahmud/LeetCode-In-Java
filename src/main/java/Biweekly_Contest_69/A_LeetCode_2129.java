package Biweekly_Contest_69;

public class A_LeetCode_2129 {
    public static void main(String[] args) {
        String name = "First leTTeR of EACH Word";
        System.out.println(capitalizeTitle(name));
    }

    public static String capitalizeTitle(String title) {
        String[] splitTitle = title.split(" ");
        StringBuilder outputTitle = new StringBuilder();
        for (int index = 0; index < splitTitle.length; index++) {
            String singleTitle = splitTitle[index];
            String name;
            if (singleTitle.length() < 3) {
                name = singleTitle.toLowerCase();
            } else {
                name = singleTitle.substring(0, 1).toUpperCase() + singleTitle.substring(1).toLowerCase();
            }
            outputTitle.append(index == splitTitle.length - 1 ? name : (name + " "));
        }

        return outputTitle.toString();
    }
}
