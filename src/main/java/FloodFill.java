/**
 * leetcode.com/problems/flood-fill
 */

class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int length = image.length;
        if (length == 0) {
            return image;
        }
        int width = image[0].length;

        dfs(image, sr, sc, color, image[sr][sc], length, width);

        return image;
    }

    private void dfs(int[][] image, int i, int j, int color, int target, int length, int width) {
        if (i < 0 || j < 0 || i >= length || j >= width) {
            return;
        }

        if (image [i][j] == color) {
            return;
        }

        if (image[i][j] == target) {
            image[i][j] = color;
            dfs(image, i + 1, j, color, target, length, width);
            dfs(image, i, j + 1, color, target, length, width);
            dfs(image, i - 1, j, color, target, length, width);
            dfs(image, i, j - 1, color, target, length, width);
        }
    }
}
