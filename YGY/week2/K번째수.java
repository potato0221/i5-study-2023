class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        for(int i = 0; i < commands.length; i++){
            int[] temp = new int[commands[i][1]-(commands[i][0]-1)]; // 아직 잘 이해안되는부분
            for(int j= 0; j < temp.length; j++){
                temp[j] = array[j+(commands[i][0]-1)];
            }
            Arrays.sort(temp);
            answer[i] = temp[command[i][2]-1];
 
        }
        return answer;
    }
}
