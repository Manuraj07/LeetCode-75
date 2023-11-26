class Solution {
    public void moveZeroes(int[] arr) {
        int nz = 0;// non zero elements
        int z = 0; // zero elements
        int n = arr.length;
        if (n == 0 || n == 1) return;
        while (nz < n) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz += 1;
                z += 1;
            } else {
                nz += 1;
            }
        }
    }
}
