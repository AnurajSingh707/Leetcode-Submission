class Solution {
    public int minimumCardPickup(int[] cards) {
   Map<Integer, Integer> map = new HashMap<>();
  int ans = Integer.MAX_VALUE;
  for(int r =0; r<cards.length;r++){
    if (map.containsKey(cards[r])) {

                int l = map.get(cards[r]);

                ans = Math.min(ans, r - l + 1);
            }

            map.put(cards[r], r);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}