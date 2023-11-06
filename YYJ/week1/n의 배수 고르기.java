class Solution {
    public int[] solution(int n, int[] numlist) {
        int idx1=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                idx1++;
            }
        }

        int[] answer = new int[idx1];
        int idx2=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[idx2]=numlist[i];
                idx2++;
            }
        }

        return answer;
    }
}
