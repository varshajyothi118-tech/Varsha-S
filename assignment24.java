import java.util.*;

public class Main {

    public static int countAnagramGroups(String[] arr) {
        Set<String> groups = new HashSet<>();

        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            groups.add(new String(chars));
        }

        return groups.size();
    }

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(countAnagramGroups(arr));
    }
}
