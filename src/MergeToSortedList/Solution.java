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
    
    
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        resultCur.next = list1;
        resultCur = resultCur.next;
        list1 = list1.next;
      } else {
        resultCur.next = list2;
        resultCur = resultCur.next;
        list2 = list2.next;
      }
    }
    if (list1 != null)
      resultCur.next = list1;
    if (list2 != null)
      resultCur.next = list2;
    return resultHead.next;
  }


}
