class Solution {
    public int[][] flipAndInvertImage(int[][] img) {
        for(int[] row : img){
            for(int i=0; i<(img[0].length + 1)/2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[img[0].length - i - 1] ^ 1;
                row[img[0].length - i - 1] = temp;
            }
        }
        return img;
    }
}