class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int num1:a) set.add(num1);
        for (int num2:b) set.add(num2);
        ArrayList<Integer> last= new ArrayList<>(set);
        Collections.sort(last);

        return last;
    }
}