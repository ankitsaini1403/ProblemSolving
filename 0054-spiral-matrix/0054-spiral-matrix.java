class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;

        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

           
            for (int i = startCol; i <= endCol; i++) {
                ans.add(matrix[startRow][i]);
            }
            startRow++;

           
            for (int j = startRow; j <= endRow; j++) {
                ans.add(matrix[j][endCol]);
            }
            endCol--;

            if (startRow <= endRow) {
                for (int k = endCol; k >= startCol; k--) {
                    ans.add(matrix[endRow][k]);
                }
                endRow--;
            }

           
            if (startCol <= endCol) {
                for (int l = endRow; l >= startRow; l--) {
                    ans.add(matrix[l][startCol]);
                }
                startCol++;
            }
        }

        return ans;
    }
}