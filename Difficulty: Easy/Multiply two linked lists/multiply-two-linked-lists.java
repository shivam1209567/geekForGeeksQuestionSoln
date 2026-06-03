/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        int num1 = 0;
        long num3 = num1;
        int num2 = 0;
        long num4 = num2;
        long mod = 1000000007;
        while(first != null){
            num3 = (num3*10+first.data )%mod;
            first = first.next;
        }
        while(second != null){
            num4 = (num4*10+second.data)%mod;
            second = second.next;
        }
        long ans = (num3*num4)%mod;
        return ans;
    }
}