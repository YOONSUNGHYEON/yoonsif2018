public class MyDoublyLinkedList {
	private class Node{
		int data;
		Node rlink;
		Node llink;

		Node(int data){
			this.data = data;
		}
	}
	private Node head=null;

	public void addFirst(int data)
	{
		Node t = new Node(data);
		if(head==null)
		{
			head = new Node(data);
		}
		else
		{
			t.rlink = head;
			head.llink = t;
			this.head = t;
		}

	}
	public void addLast(int data) {
		// TODO Auto-generated method stub
		Node t = new Node(data);
		Node d = head;
		if(head==null) {
			head = t;
		}
		else {
			while(d.rlink!=null)
			{
				d=d.rlink;
			}
			d.rlink = t;
			t.llink = d;
		}

	}
	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			System.out.print("( ");
			Node temp = head;
			while(temp.rlink!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.rlink;
			}
			System.out.print(temp.data+" ");
			System.out.print(")");
			System.out.print("( ");
			while(temp.llink!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.llink;
			}
			System.out.print(temp.data+" ");
			System.out.println(")");
		}
	}
	public Boolean remove(int element) {
		// TODO Auto-generated method stub
		Node t = this.head;
		while(t.data != element)
		{
			if(t.rlink == null)
				return false;
			t=t.rlink;
		}
		if(t.llink == null)
		{
			if(t.rlink == null)
				head = null;
			else {
				t.rlink.llink = null;
				head = t.rlink;
			}
		}
		else if(t.rlink == null)
			t.llink.rlink = null;
		else
		{
			t.rlink.llink = t.llink;
			t.llink.rlink = t.rlink;
		}
		return true;
	}

	public int removeFirst() {
		// TODO Auto-generated method stub
		int data = head.data;
		head = head.rlink;
		head.llink = null;
		return data;
	}

	public int removeLast() {
		// TODO Auto-generated method stub
		Node t = head;
		int data=t.data;
		if(t.rlink == null)
			head=null;
		else {
			while(t.rlink.rlink!=null)
				t = t.rlink;
			data = t.rlink.data;
			t.rlink = null;
		}
		return data;
	}

	public int size() {
		// TODO Auto-generated method stub
		Node t = head;
		int size = 0;
		while(t!=null)
		{
			size++;
			t=t.rlink;
		}
		return size;
	}
	@Override
	public String toString() {
		String str = "list=";
		Node t = head;
		while(t!=null)
		{
			str = str.concat(Integer.toString(t.data)+" ");
			t=t.rlink;
		}
		return str;
	}


}
