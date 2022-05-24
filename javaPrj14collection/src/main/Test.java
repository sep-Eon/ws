package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
	
	Person p1 = new Person("박상언", 27, 'm');
	Person p2 = new Person("박상언", 27, 'm');
	Person p3 = new Person("박상언", 27, 'm');
	
	String s1 = "aaa";
	String s2 = "bbb";
	String s3 = "ccc";
	
	public void testList() {
		
		
		//객체 총 6개
		
		//ArrayList
//		ArrayList al = new ArrayList();
//		al.add(p1);
//		al.add(p2);
//		al.add(p3);
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		
//		System.out.println(al.get(0));
//		System.out.println(al.get(2));
//		System.out.println(al.get(5));
		
		//LinkedList
		LinkedList list = new LinkedList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
	}
	
	
	//set
	public void testSet() {
		//HashSet
		//생성
		HashSet hs = new HashSet();
		
		//넣기
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		//꺼내기
		System.out.println(hs);
	}
	
	//Map
	public void testMap() {
		//생성
		HashMap map = new HashMap();
		
		//넣기
		map.put("first",p1);
		map.put("second",p2);
		map.put("third",p3);
		
		//꺼내기
		System.out.println(map.get("first"));
		
		
	}
	
	
	//stack 후입선출
	
	public void testStack() {
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		Object x1 = s.pop(); //return타입 : Object
		Object x2 = s.pop();
		Object x3 = s.pop();
		
		System.out.println(x1); //30
		System.out.println(x2); //20
		System.out.println(x3); //10
		
	}
	
	//Queue 선입선출
	
	public void testQueue() {
		Queue q = new LinkedList(); //혹은 new Queue
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		
		Object x0 = q.peek();
		System.out.println(x0);
		
		q.remove();
		
		Object x1 = q.poll();
		Object x2 = q.poll();
		Object x3 = q.poll();
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		
		
	}

}
