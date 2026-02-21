class max_element {
    public static void main(String[] args) {
        int[] arr = {5};

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } 
            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + secondMax);
    }
}
