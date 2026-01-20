class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }
    public List<Integer> solve(String expression){
        List<Integer> result = new ArrayList<>();
        for(int h = 0; h < expression.length(); h++){
            char ch = expression.charAt(h);
            if(ch == '-' || ch == '+' || ch == '*'){
                List<Integer> left_result = solve(expression.substring(0, h));
                List<Integer> right_result = solve(expression.substring(h+1, expression.length()));
                for(int i : left_result){
                    for(int j : right_result){
                        if(ch == '+') result.add(i + j);
                        else if(ch == '*') result.add(i * j);
                        else if(ch == '-') result.add(i - j);
                    }
                }
            }
        }
        if(result.isEmpty()){
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}