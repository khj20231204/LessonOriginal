package p2024_07_18;

import java.util.ArrayList;
import java.util.List;

public class Collections02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List 인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		List li = new List();
		
		List li = new ArrayList();		  // 업캐스팅(자동 형변환)
		ArrayList list = new ArrayList();	
		
		// boolean add(Object e)
		list.add("하나");		// 업캐스팅: Object e = new String("하나")
		list.add(2);        // 업캐스팅 + 자동박싱: Object e=new Integer(2)
		list.add(2);		// 업캐스팅 + 자동박싱
		list.add(3.14);		// 업캐스팅 + 자동박싱
		list.add('넷');		// 업캐스팅 + 자동박싱
		list.add("five");	// 업캐스팅
		list.add(6);		// 업캐스팅 + 자동박싱
		list.add(true);		// 업캐스팅 + 자동박싱
		
		System.out.println(list);		
	}

}




