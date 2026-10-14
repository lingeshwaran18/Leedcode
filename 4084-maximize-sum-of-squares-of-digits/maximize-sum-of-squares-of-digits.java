class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum < 0 || sum > 9L * num) {
            return "";
        }
        StringBuilder sb = new StringBuilder();  
        for (int i = 0; i < num; i++) {
            int take = Math.min(9, sum);
            while (take >= 0 && sum - take > 9L * (num - 1 - i)) {
                take--;
            }
            if (take < 0) {
                return "";
            }
            sb.append(take);
            sum -= take;
        }
        return sum == 0 ? sb.toString() : "";
    }
}