package MergeToSortedList;

public class Solution {

  public static void main(String[] args) {
  }


  /*
  You are given the heads of two sorted linked lists list1 and list2.
  Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
  Return the head of the merged linked list.

  Hmm..
  End list -> next = null

  1 -> 2 -> 4
  1 -> 3 -> 4
  result: 1 -> 1 -> 2 -> 3 -> 4 -> 4

  phan biet: [] -> listNode = null
              [0] -> listNode != null , listNode.next = null

  if list1 == null
  return list2
  if list2 = null
  return list1

  co 2 bien giu chck a ,b . A nam o head list 1, B nam o head list 2
  while (a != null and b != null)
  {
        if (a.value < b .value)
          result = a.value
          a = a.next
         else if (a.value = b.value)
          result = a.value
          result -> next = b.value
          a = a.next
          b = b.next
         else
          result = b.value
          b = b.next
}
if a != null
 result.next = a
if b != null
  result.next = b

  return result
1,1
 -> 1,1
2,3
 -> 1,1,2
4,3
 -> 1,1,2,3
4,4
 -> 1,1,2,3,4,4
  }
   */
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;
    ListNode resultHead = new ListNode();
    ListNode resultCur = resultHead;
    
    ListNode a = new ListNode(list1.val, list1.next);
    ListNode b = new ListNode(list2.val, list2.next);
    
    while (a != null && b != null) {
      if (a.val < b.val) {
        resultCur.next = new ListNode(a.val, a.next);
        resultCur = resultCur.next;
        a = a.next;
      } else if (a.val == b.val) {
        resultCur.next = new ListNode(a.val, a.next);
        resultCur = resultCur.next;
        resultCur.next = new ListNode(b.val, b.next);
        resultCur = resultCur.next;
        a = a.next;
        b = b.next;
      } else {
        resultCur.next = new ListNode(b.val, b.next);
        resultCur = resultCur.next;
        b = b.next;
      }
    }
    if (a != null)
      resultCur.next = a;
    if (b != null)
      resultCur.next = b;
    return resultHead.next;
  }


}
