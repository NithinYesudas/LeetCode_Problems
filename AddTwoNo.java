 class ListNode {
    int val;
    ListNode next;

    ListNode() {
        this.next = null;
        
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(),temp1 = l1,temp2 = l2,temp3 = l3;
        int carry=0;

        while(temp1 != null || temp2 != null){
            
            
            if(temp1 == null){
                temp3.val = (temp2.val+carry)%10;
                if(temp2.val+carry >9)
                carry = 1;
                else carry =0;
                temp2 = temp2.next;
            }
            else if(temp2 == null){
                temp3.val = (temp1.val+carry)%10;
                if(temp1.val+carry >9)
                carry = 1;
                else carry =0;
                temp1 = temp1.next;
            }
           else if(temp1 != null && temp2 != null){
                temp3.val = (temp1.val + temp2.val + carry)%10 ;
                if((temp1.val + temp2.val + carry) >= 10)
                {carry = 1;}
                else
                {carry = 0;}
                temp1 = temp1.next;
                temp2 = temp2.next;
               

            }
             if(temp1!=null || temp2!=null || carry!=0)
                {temp3.next = new ListNode();

                temp3 = temp3.next;}
            
            

        }
        if(carry != 0)
        temp3.val = 1;
       
        return l3;



    }

    public static void main(String[] args) {
        AddTwoNo obj = new AddTwoNo();
        ListNode l1 = new ListNode(),l2 = new ListNode();
        l2.val = 2;
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(9);
        l1.val = 5;
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(9);
        ListNode l3 = obj.addTwoNumbers(l2, l1);
       while(l3!=null){
        System.out.println(l3.val);
        l3 = l3.next;
       }
        

    }
}