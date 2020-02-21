package code.onlycode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbers {

	public static void main(String[] args) {

		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

		ListNode list1 = new ListNode(2);
		ListNode list1next = new ListNode(4);
		ListNode list1nextnext = new ListNode(3);
		list1.next = list1next;
		list1.next.next = list1nextnext;

		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);
		addTwoNumbers.addTwoNumbers(list1, list2);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		List<Integer> l1values = new ArrayList<>();
		List<Integer> l2values = new ArrayList<>();
		while (l1 != null) {
			l1values.add(l1.val);
			l1 = l1.next;
		}

		while (l2 != null) {
			l2values.add(l2.val);
			l2 = l2.next;
		}
		Collections.reverse(l1values);
		Collections.reverse(l2values);

		Integer result = Integer.parseInt(l1values.toString().replaceAll("\\D", ""));
		Integer result2 = Integer.parseInt(l2values.toString().replaceAll("\\D", ""));

		Integer finalResult = result + result2;

		StringBuffer str = new StringBuffer();
		str.append(finalResult);
		String string = str.reverse().toString();
		ListNode returnNode = null;
		for (char strchar : string.toCharArray()) {
			if (returnNode == null) {
				returnNode = new ListNode(Integer.parseInt(Character.toString(strchar)));
			} else {
				if (returnNode.next == null) {
					returnNode.next = new ListNode(Integer.parseInt(Character.toString(strchar)));
				} else {
					returnNode.next.next = new ListNode(Integer.parseInt(Character.toString(strchar)));
				}
			}
		}

		return returnNode;
	}

}

class ListNode {

	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}
