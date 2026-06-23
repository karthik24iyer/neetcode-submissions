class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        List<Set<Character>> rowSet = new ArrayList<>();
        List<Set<Character>> colSet = new ArrayList<>();
        List<Set<Character>> gridSet = new ArrayList<>();

        // Initialize the lists with empty HashSets
        for (int i = 0; i < 9; i++) {
            rowSet.add(new HashSet<>());
            colSet.add(new HashSet<>());
            gridSet.add(new HashSet<>());
        }

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j]!='.' && (rowSet.get(i).contains(board[i][j]) 
                    || colSet.get(j).contains(board[i][j])
                    || gridSet.get((i/3)*3+(j/3)).contains(board[i][j]))) {
                    //System.out.println("i="+i+", j="+j+", board="+board[i][j]);
                    return false;
                }
                rowSet.get(i).add(board[i][j]);
                colSet.get(j).add(board[i][j]);
                gridSet.get((i/3)+j/3).add(board[i][j]);
            }
        }
        return true;
    }
}
