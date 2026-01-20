class Solution {
    public int counter= 0;
    public int numTilePossibilities(String tiles) {
        int n = tiles.length();
        boolean[] visited = new boolean[n];
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        helper(arr, visited);
        return counter-1;
    }
    public void helper(char[] tiles, boolean[] visited){
        counter++;
        for(int i = 0; i < tiles.length; i++){
            if(visited[i]) continue;
            if(i>0 && !visited[i-1] && tiles[i] == tiles[i-1]){
                continue;
            }
            visited[i] = true;
            helper(tiles, visited);
            visited[i] = false;
        }
    }
}