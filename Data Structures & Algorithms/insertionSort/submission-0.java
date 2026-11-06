// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<Pair> pairs_copied = new ArrayList(pairs);
        List<List<Pair>> states = new ArrayList();
        for (int i = 0; i < pairs_copied.size(); i++){
            Pair ii = pairs_copied.get(i);

            for (int j = i - 1; j >= 0; j--){
                Pair ij = pairs_copied.get(j);
                if (ii.key >= ij.key){
                    break;
                }
                pairs_copied.set(j + 1, ij);
                pairs_copied.set(j, ii);

            }   
            states.add(new ArrayList(pairs_copied));
        }
        return states;
    }
}
