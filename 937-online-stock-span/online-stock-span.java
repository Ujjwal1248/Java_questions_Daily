class StockSpanner {

    static class Pair{
        int price, index;
        Pair(int price, int index){
            this.price = price;
            this.index = index;
        }
    }
    Stack<Pair> st = new Stack<>();
    int ind = -1;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        ind++;
        while(!st.isEmpty() && st.peek().price <= price){
            st.pop();
        }
        int ans = ind - (st.isEmpty() ? -1 : st.peek().index);
        st.push(new Pair(price,ind));

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */