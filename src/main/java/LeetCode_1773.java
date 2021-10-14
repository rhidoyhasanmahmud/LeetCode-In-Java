import java.util.ArrayList;
import java.util.List;

public class LeetCode_1773 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        List<String> innerItems = new ArrayList<>();
        innerItems.add("phone");
        innerItems.add("blue");
        innerItems.add("pixel");
        items.add(innerItems);

        List<String> innerItems1 = new ArrayList<>();
        innerItems1.add("computer");
        innerItems1.add("silver");
        innerItems1.add("phone");
        items.add(innerItems1);

        List<String> innerItems2 = new ArrayList<>();
        innerItems2.add("phone");
        innerItems2.add("gold");
        innerItems2.add("iphone");
        items.add(innerItems2);
        System.out.println(countMatches(items, "type", "phone"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> it : items) {
            switch (ruleKey) {
                case "type":
                    if (it.get(0).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "color":
                    if (it.get(1).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "name":
                    if (it.get(2).equals(ruleValue)) {
                        count++;
                    }
                    break;
            }
        }
        return count;
    }
}
