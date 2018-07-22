package sys4u.com._2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
		//--- 주임_진급자_대상_유형_1)_중복 문자열 갯수 출력
		printDuplicatedChars( );
        
		//--- 주임_진급자_대상_유형_2)_회문 체크 (거꾸로 뒤집어도 원래 문자열과 동일한지 체크)
		System.out.println(isPalindrome("다시합시다") + "/" + isPalindrome("가나다라마"));
		
        //--- 주임_진급자_대상_유형_3)_중복 문자열 제거
        printDuplicatedCharsDel();
        
        //--- 주임_진급자_대상_유형_4)_두 개의 문자열의 구성요소가 동일한지 확인하는 메소드
        System.out.println(isIdenticalElements("aabeddew","wedab") + "/" + isIdenticalElements("acb","ca"));
        
        
        //--- 주임_진급자_대상_유형_6) _댓글을 10개 이상 작성한 사람의 목록을 출력하는 SQL 
        /*
         select m.name, c.comment_cnt from
		(
		  select created_by
		       , count(1) as comment_cnt
		  from "comment"
		  group by created_by
		  having count(1) >= 10
		) c
		, customer m
		where c.created_by=m.login_id;
          */
        
        //--- 주임_진급자_대상_유형_8)_PRIMARY KEY 와 UNIQUE KEY 에 대해 설명하고 차이점을 기술하라
        /* primary key(기본키)는 값이 중복되면 안되고 NULL값을 허용하지 않습니다. 테이블에 하나만 설정 가능합니다.
		unique key(고유키)는 값이 중복되면 안되고 NULL값을 허용합니다.*/
        
        //--- 주임_진급자_대상_유형_10) 숫자를 총 10 자리의 문자로 변환하려 한다. 남는 자릿수는 0 으로 채우려 할 때, 어떤 함수를 이용하면 되는가?
        /*
         LPAD
         ex) lpad(145,10,0)
         */
        
        //--- 주임_진급자_대상_유형_12) 쿼리 작성 및 COUNT와 EXISTS 차이
        /*
        select count(1) From cu_customer
		where login_id='sys4u';

		select 1 from dual
		where exists(select 1 from cu_customer where login_id='sys4u');
		
		count는 group 함수 이기 때문에 where절에 올 수 없다. exists 는 조건 함수이기 때문에 where 절에만 쓸 수 있고 sub query를 파라미터로 받는다.
         */
        
        //--- 대리_진급자_대상_유형_2) java.util.ArrayList 클래스와 java.util.LinkedList 클래스 중, 엘리먼트의 추가와 삭제가 빈번히 일어나는 경우 어떤 List가 유리한가
        /*
         결론 : 엘리먼트의 추가와 삭제가 빈번히 일어나는 경우는 LinkedList를 사용하는 것이 좋다.
        * ArrayList 와 LinkedList 의 차이
        1. ArrayList   
		방법)데이터의 추가/삭제를 위해서는 임시배열을 생성해 데이터를 복사하는 방법을 사용하고 있다. 		
		단) 대량의 자료를 추가/삭제하는 경우에는 내부적으로 처리량이 늘어나면서 성능저하를 일으킬 수 있다.
		장) 각 데이터는 인덱스를 가지고 있기 때문에, 한번에 참조가 가능해 데이터의 검색에는 유리하다. 
		2. LinkedList
		방법)데이터를 저장하는 각 노드가 이전 노드와 다음 노드의 상태만 알고있다. 
		단) 검색시에 ArrayList에 비해 불리하다 / 메모리를 많이 잡는다 . (데이터와 포인터도 가지고 있어야 하기 때문이다.)
		장) 데이터의 추가/삭제 시에 불필요한 나머지 데이터의 복사가 이루어지지 않아 데이터의 추가/삭제 시에 유리하다.
		출처: http://dordong.tistory.com/5 [Dongdor]
         */
        
        //--- 대리_진급자_대상_유형_4) 이진 탐색 트리를 이용하여 이진 트리 내에 특정 int 값이 존재하는지 확인하는 public boolean exists(BinaryTree tree, int value) 메소드를 작성하라.
        // 같은 폴더 내에 BinaryTree 및 BinaryTreeNode 코드 추가해놓았으므로 코드 내용 볼 것 (delete 와 success 함수는 생략함)
        BinaryTree bt = new BinaryTree();
        bt.insert(15);
        bt.insert(23);
        bt.insert(7);
        bt.insert(5);
        bt.insert(9);
        bt.insert(17);
        bt.insert(25);
        System.out.println(exists(bt, 8));
        System.out.println(exists(bt, 9));
        
        //--- 대리_진급자_대상_유형_6) 스프링 웹 MVC를 이용하여 웹 어플리케이션을 개발할 때, "특별한 이유가 없으면" Controller / Service / DAO 에서 exception을 catche 하지 않을 것을 권장한다. 이와 관련하여 다음 세 가지에 대해 설명하라.
        /*
        a. Exception 을 catch 하지 말 것을 권장하는 이유는 무엇인가? 
         대부분의 Controller, Service, DAO에서의 Exception 처리는 동일하며 여러 곳에 copy & paste 할 경유 코드 유지 관리 부담과 예외 계층 구조간의 결합을 증가시킨다.  
        b. Exception 을 catch 하지 않아도 어플리케이션이 정상적으로 동작하는 이유는 무엇인가?
          특정 유형의 예외를 HTTP 응답 코드로 변환하는 전역 예외 처리기가 존재하기 때문. 
        c. Exception 을 catch 해야 하는 "특별한 이유"는 무엇인가?
        SQLException 같은 경우는 해당 에러만 보고서는 어떻게 에러가 났는지 파악하기 어렵다 따라서 dao 단에 try catch 문을 넣어 DAOException을 throw 하면 해당 에러의 root cause를 파악하기 쉽다.
          이와 같이 에러의 root cause를 파악하고자 할 때 catch를 걸 수 있다. 
        */
        
        //--- 대리_진급자_대상_유형_8) 데이터베이스 트랜잭션은 정의상 ACID 해야 한다. ACID 각각에 대해 설명하라.
        /* 원자성(Atomicity)은 트랜잭션과 관련된 작업들이 부분적으로 실행되다가 중단되지 않는 것을 보장하는 능력이다. 예를 들어, 자금 이체는 성공할 수도 실패할 수도 있지만 보내는 쪽에서 돈을 빼 오는 작업만 성공하고 받는 쪽에 돈을 넣는 작업을 실패해서는 안된다. 원자성은 이와 같이 중간 단계까지 실행되고 실패하는 일이 없도록 하는 것이다.
        일관성(Consistency)은 트랜잭션이 실행을 성공적으로 완료하면 언제나 일관성 있는 데이터베이스 상태로 유지하는 것을 의미한다. 무결성 제약이 모든 계좌는 잔고가 있어야 한다면 이를 위반하는 트랜잭션은 중단된다.
        고립성(Isolation)은 트랜잭션을 수행 시 다른 트랜잭션의 연산 작업이 끼어들지 못하도록 보장하는 것을 의미한다. 이것은 트랜잭션 밖에 있는 어떤 연산도 중간 단계의 데이터를 볼 수 없음을 의미한다. 은행 관리자는 이체 작업을 하는 도중에 쿼리를 실행하더라도 특정 계좌간 이체하는 양 쪽을 볼 수 없다. 공식적으로 고립성은 트랜잭션 실행내역은 연속적이어야 함을 의미한다. 성능관련 이유로 인해 이 특성은 가장 유연성 있는 제약 조건이다. 자세한 내용은 관련 문서를 참조해야 한다.
        지속성(Durability)은 성공적으로 수행된 트랜잭션은 영원히 반영되어야 함을 의미한다. 시스템 문제, DB 일관성 체크 등을 하더라도 유지되어야 함을 의미한다. 전형적으로 모든 트랜잭션은 로그로 남고 시스템 장애 발생 전 상태로 되돌릴 수 있다. 트랜잭션은 로그에 모든 것이 저장된 후에만 commit 상태로 간주될 수 있다.
        */
        
        //--- 대리_진급자_대상_유형_10) 스프링 프레임워크의 Transaction Manager와 Thread는 어떤 관계에 있는지 서술하라.
        // Transaction Management는 하나의 트렌젝션에 대해서 Transaction Context를 가지게 하고, 이 트렌젝션을 사용하는 Thread들간의 연관관계를 정의한다. 고로, 여러 Thread가 하나의 Transaction으로 묶이는것과 같은 Global Transaction(분산 트렌젝션)이 가능해지는 것이다.
        
        //--- 대리_진급자_대상_유형_12) ST 메뉴 테이블의 전체 계층 정보를 출력하는 쿼리를 작성하라.
        /*
         select menu_id, menu_name, parent_menu_id, level 
		from st_menu s 
		start with s.menu_id='ROOT_01'
		connect by prior s.menu_id=s.parent_menu_id;
         */
        
        //--- 대리_진급자_대상_유형_14) 2018 년도 주문실적을 월별로 출력하는 SQL을 작성하라. 단 주문일자 컬럼은 YYYYMMDD 의 VARCHAR2 형식이라고 가정한다.
        /*
        select 
		 nvl(sum(case when substr(주문일자,5,2)='01' then 금액 end),0) as "01월"
		 ,nvl(sum(case when substr(주문일자,5,2)='02' then 금액 end),0) as "02월"
		 ,nvl(sum(case when substr(주문일자,5,2)='03' then 금액 end),0) as "03월"
		 ,nvl(sum(case when substr(주문일자,5,2)='04' then 금액 end),0) as "04월"
		 ,nvl(sum(case when substr(주문일자,5,2)='05' then 금액 end),0) as "05월"
		 ,nvl(sum(case when substr(주문일자,5,2)='06' then 금액 end),0) as "06월"
		 ,nvl(sum(case when substr(주문일자,5,2)='07' then 금액 end),0) as "07월"
		 ,nvl(sum(case when substr(주문일자,5,2)='08' then 금액 end),0) as "08월"
		 ,nvl(sum(case when substr(주문일자,5,2)='09' then 금액 end),0) as "09월"
		 ,nvl(sum(case when substr(주문일자,5,2)='10' then 금액 end),0) as "10월"
		 ,nvl(sum(case when substr(주문일자,5,2)='11' then 금액 end),0) as "11월"
		 ,nvl(sum(case when substr(주문일자,5,2)='12' then 금액 end),0) as "12월"
		from ord_order;
         */
    }
    
    //--- 주임_진급자_대상_유형_1)_중복 문자열 갯수 출력
    //--- null 들어왔을때 exception 처리 필요
    private static void printDuplicatedChars ( ) throws IllegalArgumentException {
    	
    	String line = "가나다라가나가다마바";
    	Map<String, Object> returnMap = new HashMap<String, Object>();
    	
    	try {
    		
    		String lineArr[] = line.split("");
        	List<String> resultList = Arrays.asList(lineArr);
        	
        	for ( String i : resultList ) {
        		int cnt = 0;
        		
        		if ( line.contains(i) ) {
        			cnt++;

        			if ( returnMap.containsKey(i) ) {
        				cnt = (int) returnMap.get(i) + 1;
        			}
        			returnMap.put(i, cnt);
        		}
        	}
        	
        	//--- 결과
        	System.out.println("## "+ returnMap.toString());
        	
//        	for ( int i=0; i < resultList.size(); i++ ) {
//        		System.out.println( i + " = "+ returnMap.get(i) );
//        	}
        	
        	
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println( e.getStackTrace() );
		}
    	
    	
    }
    
    //--- 주임_진급자_대상_유형_2) 하나의 문자열이 회문인지 확인하는 메소드
    private static boolean isPalindrome(String value) {
    	String reversed = new StringBuffer(value).reverse().toString();
    	return reversed.equals(value);
    }
    
    //--- 주임_진급자_대상_유형_3)_중복 문자열 제거
    //--- null 들어왔을때 exception 처리 필요
    private static void printDuplicatedCharsDel ( ) throws IllegalArgumentException {
    	
    	String line = "가나다가나라가나마";
    	List<String> resultList = new ArrayList<String>();
    	
    	try {
			
    		String lineArr[] = line.split("");
    		List<String> lineList = Arrays.asList(lineArr);
    		
    		lineList.stream()
    					.filter( i -> lineList.contains( i ) )
    					.filter( i -> !resultList.contains(i) )
    					.forEach( i -> resultList.add(i) );
    		
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println( e.getStackTrace() );
		}

    	//--- 결과
    	resultList.forEach( i -> System.out.print( i ));
    }

    //--- 주임_진급자_대상_유형_4) 두 개의 문자열의 구성요소가 동일한지 확인하는 메소드
    private static boolean isIdenticalElements(String a, String b) {
    	String aStream =  Arrays.asList(a.split("")).stream().distinct().sorted().collect(Collectors.joining());
    	String bStream = Arrays.asList(b.split("")).stream().distinct().sorted().collect(Collectors.joining());
    	return aStream.equals(bStream);
    }
    
    //대리_진급자_대상_유형_4) 이진 탐색 트리를 이용하여 이진 트리 내에 특정 int 값이 존재하는지 확인하는 public boolean exists(BinaryTree tree, int value) 메소드를 작성하라.
    public static boolean exists(BinaryTree tree, int value) {
    	return tree.find(value);
    }
}
