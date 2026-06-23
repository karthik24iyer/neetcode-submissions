class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character> rowSet = new HashSet<>();
        List<Set<Character>> colSet = new ArrayList<>();
        List<Set<Character>> gridSet = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            colSet.add(new HashSet<>());
            gridSet.add(new HashSet<>());
        }

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j]!='.' && !(rowSet.add(board[i][j]) 
                    && colSet.get(j).add(board[i][j])
                    && gridSet.get((i/3)*3+(j/3)).add(board[i][j]))) {                    
                    return false;
                }
                //rowSet.add(board[i][j]);
                //colSet.get(j).add(board[i][j]);
                //gridSet.get((i/3)+j/3).add(board[i][j]);
            }
            rowSet = new HashSet<>();
        }
        return true;
    }
}
