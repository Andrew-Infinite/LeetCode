class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer=new ListNode();
        ListNode temp=answer;
        boolean isFinished=false;
        boolean isL1finish=false;
        boolean isL2finish=false;
        int overflow=0;
        int num;
        while(!isFinished){
            //System.out.println(l1.val+" "+l2.val+" "+overflow + l2.next);
            num = l1.val+l2.val+overflow;
            if(num>9){
                num=num-10;
                overflow=1;
            }else{
                overflow=0;
            }
            temp.val=num;
            
            
            if(l1.next!=null){
                l1=l1.next;
            }else{
                if(isL1finish==false){//&&l1.next==null
                    l1.val=0;
                    isL1finish=true;
                }
            }
            
            if(l2.next!=null){
                l2=l2.next;
            }else{
                if(isL2finish==false){//&&l1.next==null
                    l2.val=0;
                    isL2finish=true;
                }
            }
            
            if(isL1finish&&isL2finish){
                isFinished=true;
                if(overflow==1){
                    temp.next=new ListNode(1);
                }
            }else{
                temp.next=new ListNode();
                temp=temp.next;
            }
        }
        return answer;
    }
}