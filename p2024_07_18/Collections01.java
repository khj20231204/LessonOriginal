package p2024_07_18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set은 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없다.
		// Set s = new Set();			// 에러발생
		
		Set set = new HashSet();		// 업캐스팅
		//HashSet set = new HashSet();
		
		System.out.println("요소의 갯수:"+ set.size());  // 0
		
		// boolean add(Object e)
		set.add("하나");
		set.add(2);
		set.add(3.14);
		set.add('넷');
		set.add("five");
		set.add(true);
		set.add(6);		
		set.add(6);			// 중복 데이터를 저장할 수 없다.
		
		System.out.println("요소의 갯수:"+ set.size());  // 7
		
		// 입력한 순서대로 출력되지 않는다.
		System.out.println(set);
		
		// Iterator(반복자) : 하나, 2, 3.14, 넷, five, true, 6
		Iterator elements = set.iterator();
		while(elements.hasNext()) { // 가져올 데이터가 있으면 true리턴
			System.out.print(elements.next()+"\t");
		}	
		
	}

}
