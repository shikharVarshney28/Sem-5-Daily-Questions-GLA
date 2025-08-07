// Last updated: 8/7/2025, 2:47:46 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int answer[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) answer[i][j]=-1;
        }
        int topRow=0,bottomRow=m-1,leftCol=0,rightCol=n-1;
        while(head!=null)
        {
            // Filling top Column
            for(int i=leftCol;i<=rightCol;i++){
                if(head==null) break;
                answer[topRow][i]=head.val;
                head=head.next;
            }
            topRow++;
            //Last col
            for(int i=topRow;i<=bottomRow;i++){
                if(head==null) break;
                answer[i][rightCol]=head.val;
                head=head.next;
            }
            rightCol--;
            //BottomRow fill
            for(int i=rightCol;i>=leftCol;i--){
                if(head==null) break;
                answer[bottomRow][i]=head.val;
                head=head.next;
            }
            bottomRow--;
            //leftCol
            for(int i=bottomRow;i>=topRow;i--){
                if(head==null) break;
                answer[i][leftCol]=head.val;
                head=head.next;
            }
            leftCol++;
            // if(head==null) break;
            // head=head.next;
        }
        return answer;
    }
}