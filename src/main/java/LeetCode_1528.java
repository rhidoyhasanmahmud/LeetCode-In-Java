public class LeetCode_1528 {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        int len = indices.length;
        char[] newCh = new char[len];
        char[] ch = s.toCharArray();
        for (int i = 0; i < len; i++) {
            newCh[indices[i]] = ch[i];
        }
        return new String(newCh);
    }
}
