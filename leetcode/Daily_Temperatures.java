class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] arr = new int[size];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < size; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                int prevIndex = st.pop();
                arr[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }
        return arr;
    }
}