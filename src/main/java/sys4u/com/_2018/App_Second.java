package sys4u.com._2018;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 * 대리_진급자_대상
 *
 */
public class App_Second 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //--- 대리_진급자_대상_유형_1)
        //print_Subjective_Question_1();
        
        //--- 대리_진급자_대상_유형_2)
        //print_Subjective_Question_2();
        
        //--- 대리_진급자_대상_유형_3)
        //print_Subjective_Question_3();
        print_Subjective_Question_3_1();
        
        //--- 대리_진급자_대상_유형_4)
        //print_Subjective_Question_4();
        
        //--- 대리_진급자_대상_유형_5)
        //print_Subjective_Question_5();
        
        //--- 대리_진급자_대상_유형_6)
        //print_Subjective_Question_6();
        
        //--- 대리_진급자_대상_유형_7) 
        //print_Subjective_Question_7();
        
        //--- 대리_진급자_대상_유형_8)
        //print_Subjective_Question_8();
        
        //--- 대리_진급자_대상_유형_9)
        //print_Subjective_Question_9();
        
        //--- 대리_진급자_대상_유형_10)
        //print_Subjective_Question_10();
        
        //--- 대리_진급자_대상_유형_11)
        //print_Subjective_Question_11();
        
        //--- 대리_진급자_대상_유형_12)
        //print_Subjective_Question_12();
        
        //--- 대리_진급자_대상_유형_13)
        //print_Subjective_Question_13();
        
        //--- 대리_진급자_대상_유형_14)
        //print_Subjective_Question_14();
        
        //--- 대리_진급자_대상_유형_15)
        //print_Subjective_Question_15();
    }
    
    
    
    
    
    
    
    
    //--- Vector/ArrayList/LinkedList의 차이 (Java5 이후로 Vector를 사용하지 말아야하는 이유)
    public static void print_Subjective_Question_1() {
    	
    	/*
    		<Vector/ArrayList/LinkedList의 차이>
    		Vector :
				- 동기화를 보장해주어 공유자원이나 복수의 사용자가 존재할 때 좀 더 안전하게 프로그램을 작성할 수 있다
				- but, 하나의 스레드가 하나의 자원을 이용하는 경우에는 오히려 성능의 저하가 발생한다
				- 공간이 모자랄때 모자란공간x2 만큼의 공간을 확보하기 때문에 메모리를 많이 잡아먹는다는 단점이 있다
				※ 동기화 처리가 내부적으로 일어남으로 다른객체들 보다 무거움
				
			ArrayList :
				- 인덱스를 가지고 있어서 검색에 용이하다
				- 삽입/삭제를 하려면 중간이 이빨 나간 곳을 전부 한칸씩 땡기거나 뒤로 밀어야하기 때문에 삽입/삭제가 빈번한
				데이터인 경우에는 부적합하다
				- Vector와 달리 동기화를 보장해주지 못하고, 공간이 모자랄 때는 모자란 만큼만 공간을 확보한다
				※ 내부적인 인덱스가 있기 때문에 검색이 빠르다, 데이터 추가/삭제시 성능이 떨어진다
				
			LinkedList : 
				- 노드(데이터와 다음 노드로 연결시킬 주소지)들이 줄줄이 연결된 녀석이다
				- 맨 마지막에 있는 녀석을 검색해야한다면 처음부터 끝까지 노드를 타고 줄줄이 이동해야해서 검색에는 적합X
				- 삽입/삭제를 할때는 중간에 해당 노드의 주소지만 바꿔주면 되므로 삽입/삭제가 빈번한 데이터에 적합
				※ 추가/삭제시 유용하다, 검색시 처음자료부터 순차적으로 찾아야해서 성능이 떨어진다
				
			<JAVA5 이후로 java.util.Vector를 사용하지 말아야하는 이유>
			
				Vector와 이후에 등장하는 List객체의 다른점은 "동기화(synchronize)"처리에 있습니다.
	
				자바에서는 synchronized 라는 키워드를 만들어 두었습니다.
				이 키워드를 사용하면 공통된 자원에 접근하는것은 [반드시 한번에 하나] 라는 조건이 붙게 됩니다.
				
				한 스레드(thread)가 공유자원에 작업을 마치기 전까지 다른 스레드(thread)가 공유자원에 접근할 수 없도록 약속한 것입니다.
				이런 과정은 "동기화"라고 합니다.
				
				
				동기화가 문제시 되는 경우는 어디까지나 "공유자원"과 "복수사용자"가 존재할 때 성립하는 것입니다.
				한개의 자원을 하나의 스레드가 사용하는 경우에도 동기화를 고려해서 처리를 하게  되면, 오히려 성능의 저하를 가져오게 되는 문제가 발생합니다.
				
				Vector의 경우는 "무조건 동기화"이기 때문에 단일 스레드 처리시에서는 ArrayList나 LinkedList보다 성능이 떨어집니다.
				
				후에 혹시 동기화처리가 필요한 경우는 Vector를 이용하기 보다는 Collection을 이용하는것이 성능상 바람직하겠습니다.
    	*/
    	
    }
    
    //--- ArrayList와 LinkedList 중 요소의 수정이 빈번히 일어나는경우 어떤 List가 유리한지 명시 & 이유
    public static void print_Subjective_Question_2() {
    	/*
	    	메모리를 효율적으로 사용할 수 있는 LinkedList.
	
	    	배열의 정의는 같은 타입으로 자료형이 연속된 주소에 표현된 것이라 할 수 있다.
	    	배열의 장점은 각각의 원소에 대해 index값을 이용하여 O(1)에 접근 할 수 있는 등 여러 장점이 있지만 자료의 이동 그리고 크기변화가 어렵다는 단점이 있다.
	
	    	LinkedList를 이용하면 크기변화가 어렵다는 단점을 극복할 수 있다.
	
	
	    	LinkedList를 이용하면 메모리에 List에 자료가 무작위로 나열되어있지만 l포인터(pointer)가 다음에 나타날 자료를 가르키고 있으므로 멀리 떨어져있지만 한줄로 연결된다.
	    	따라서 데이터구조들은 변수 뿐만 아니라 다음을 가리키는 포인터까지 갖고 있어야 한다.
	
	
	    	<연결리스트의 최소단위, Node>
	    	기본적으로 node는 데이터와 다음 노드를 가리키는 포인터로 구성되어있다.
	
	
	    	단순연결리스트(Single LinkedList)는 노드에 다음 노드의 포인터정보만 가지고있다.
	    	(1,2,3,4,5,6,7 의 노드가 있고, 5번 노드에 접근하고 싶은데 6번노드까지 넘어가버리면 5번 노드에는 접근할 수가 없다. 6번노드는 7번노드 접근 정보만 가지고있기때문에)
	
	    	이중연결리스트(Double LinkedList)는 노드에 Prev포인터를 추가해서 이전노드를 가리킨다.
	    	원형연결리스트 혹은 순환연결리스트(Circular LinkedList) 는 마지막 노드가 첫번째 노드를 가리킨다.
    	*/
    }
    
    //--- 대리_진급자_대상_유형_3)_병합정렬
    public static void print_Subjective_Question_3() {
    	System.out.println("# print_Subjective_Question_3 debug");
    	
    	List<Integer> intArr = new ArrayList<Integer>();
    	intArr.add(69);
    	intArr.add(10);
    	intArr.add(30);
    	intArr.add(2);
    	intArr.add(8);
    	intArr.add(31);
    	intArr.add(22);
    	//MergeSort.mergeSort( intArr, 0 , intArr.size()-1 );
    	
    	int [] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
    	MergeSort.mergeSortTest( arr, 0 , arr.length-1 );
    	System.out.print("# mergeSort result arr = ");
    	
    	MergeSort.printArr(arr);
    }
    
    //--- 병합정렬 다른방법
    public static void print_Subjective_Question_3_1() {
    	System.out.println("# print_Subjective_Question_3_1 debug");
    	
    	int [] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
    	MergeSort.mergeSort(arr);
    	System.out.print("# mergeSort result arr = ");
    	
    	MergeSort.printArr(arr);
    }
    
    //--- 이진 탐색 트리를 이용하여 이진 트리 내에 특정 int 값이 존재하는지 확인하는 public boolean exists(BinaryTree tree, int value) 메소드를 작성하라.
    public static void print_Subjective_Question_4() {
    	 // 같은 폴더 내에 BinaryTree 및 BinaryTreeNode 코드 추가해놓았으므로 코드 내용 볼 것 (delete 와 success 함수는 생략함)
        BinaryTree bt = new BinaryTree();
        bt.insert(15);
        bt.insert(23);
        bt.insert(7);
        bt.insert(5);
        bt.insert(9);
        bt.insert(17);
        bt.insert(25);
        
        //System.out.println(exists(bt, 8));
        //System.out.println(exists(bt, 9));
        
        
        //--- by chjeong
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertBinaryTree(30);
        binaryTree.insertBinaryTree(23);
        binaryTree.insertBinaryTree(5);
        System.out.println( "# binaryTree result(30) : " + binaryTree.findBinaryTree(30));
        System.out.println( "# binaryTree result(40) : " + binaryTree.findBinaryTree(40));
    }
    
    //--- 이진 탐색 트리를 이용하여 이진 트리 내에 특정 int 값이 존재하는지 확인하는 public boolean exists(BinaryTree tree, int value) 메소드를 작성하라.
    public static boolean exists(BinaryTree tree, int value) {
    	return tree.find(value);
    }

    //--- Exception StackTrace분석
    public static void print_Subjective_Question_5 () {
    	/*
    		DAO에서 SQL 문 호출로 데이터를 조회할 때, Query 상에 명시된 students 컬럼을 찾을 수가 없어서
    	*/
    }

    //--- 스프링 웹 MVC를 이용하여 웹 어플리케이션을 개발할 때, "특별한 이유가 없으면" Controller / Service / DAO 에서 exception을 catche 하지 않을 것을 권장한다. 
    //--- 이와 관련하여 다음 세 가지에 대해 설명하라.
    public static void print_Subjective_Question_6 () {
    	/*
	        a. Exception 을 catch 하지 말 것을 권장하는 이유는 무엇인가? 
	         대부분의 Controller, Service, DAO에서의 Exception 처리는 동일하며 여러 곳에 copy & paste 할 경유 코드 유지 관리 부담과 예외 계층 구조간의 결합을 증가시킨다.  
	        b. Exception 을 catch 하지 않아도 어플리케이션이 정상적으로 동작하는 이유는 무엇인가?
	          특정 유형의 예외를 HTTP 응답 코드로 변환하는 전역 예외 처리기가 존재하기 때문. 
	        c. Exception 을 catch 해야 하는 "특별한 이유"는 무엇인가?
	        SQLException 같은 경우는 해당 에러만 보고서는 어떻게 에러가 났는지 파악하기 어렵다 따라서 dao 단에 try catch 문을 넣어 DAOException을 throw 하면 해당 에러의 root cause를 파악하기 쉽다.
	          이와 같이 에러의 root cause를 파악하고자 할 때 catch를 걸 수 있다. 
    	*/
    }
    
    //--- printStackTrace출력 안되는 이유
    public static void print_Subjective_Question_7 () {
    	/*
    		1) 이유 :
	    		printStackTrace는 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력한다
				스택추적을 표시하면 잠재적인 보안 위험이 발생할 수 있다
			2) catch한 Exception을 어떻게 처리해야 하는가?
				적절한 방법으로 예외를 처리하면 StackTrace에 대해 더이상 신경쓰지 않아도 된다(좀 더 detail한 Exception)
    	*/
    }
    
    //--- 데이터베이스 트랜잭션은 정의상 ACID 해야 한다. 
    //--- ACID 각각에 대해 설명하라.
	public static void print_Subjective_Question_8 () {
		/* 
	    	
	    	원자성(Atomicity)은 트랜잭션과 관련된 작업들이 부분적으로 실행되다가 중단되지 않는 것을 보장하는 능력이다. 
	    	예를 들어, 자금 이체는 성공할 수도 실패할 수도 있지만 보내는 쪽에서 돈을 빼 오는 작업만 성공하고 받는 쪽에 돈을 넣는 작업을 실패해서는 안된다. 
	    	원자성은 이와 같이 중간 단계까지 실행되고 실패하는 일이 없도록 하는 것이다.
	    	
		    일관성(Consistency)은 트랜잭션이 실행을 성공적으로 완료하면 언제나 일관성 있는 데이터베이스 상태로 유지하는 것을 의미한다. 
		    무결성 제약이 모든 계좌는 잔고가 있어야 한다면 이를 위반하는 트랜잭션은 중단된다.
		    
		    고립성(Isolation)은 트랜잭션을 수행 시 다른 트랜잭션의 연산 작업이 끼어들지 못하도록 보장하는 것을 의미한다. 
		    이것은 트랜잭션 밖에 있는 어떤 연산도 중간 단계의 데이터를 볼 수 없음을 의미한다. 
		    은행 관리자는 이체 작업을 하는 도중에 쿼리를 실행하더라도 특정 계좌간 이체하는 양 쪽을 볼 수 없다. 
		    공식적으로 고립성은 트랜잭션 실행내역은 연속적이어야 함을 의미한다. 성능관련 이유로 인해 이 특성은 가장 유연성 있는 제약 조건이다. 자세한 내용은 관련 문서를 참조해야 한다.
		    
		    지속성(Durability)은 성공적으로 수행된 트랜잭션은 영원히 반영되어야 함을 의미한다. 
		    시스템 문제, DB 일관성 체크 등을 하더라도 유지되어야 함을 의미한다. 전형적으로 모든 트랜잭션은 로그로 남고 시스템 장애 발생 전 상태로 되돌릴 수 있다. 
		    트랜잭션은 로그에 모든 것이 저장된 후에만 commit 상태로 간주될 수 있다.
		    
		 */
	}
    
	//--- 특정 비즈니스 로직에 대해 데이터베이스 트랜잭션 관리를 해야할 때 다음 정보들에 대해서 설명
	public static void print_Subjective_Question_9 () {
		/*
			Propagation :
				- 전파옵션
				- 현재 Transaction에서 다른 Transaction으로 이동할 때, 트랜잭션을 어떻게 처리할지 정하는 옵션
			
			Isolation : 
				- 격리수준
				- 트랜잭션의 일관성이 없는 데이터를 허용하도록 하는 수준을 말한다
			
			Timeout :
				- 제한시간
				- 트랜잭션의 제한시간을 설정합니다. DB가 해당기능을 지원해야 하며 기본값으로는 -1인 제한시간 없음이 설정
			
			Read-Only :
				- 읽기전용
				- 해당 메서드는 오로지 읽기에만 사용됩니다
				- INSERT나 UPDATE, DELETE문은 허용되지 않습니다
				- 만약 쓰기나 삭제가 실행될 경우 에러를 발생시킵니다		
		*/
	}
    
	//--- 스프링 프레임워크의 Transaction Manager와 Thread는 어떤 관계에 있는지 서술하라.
	public static void print_Subjective_Question_10 () {
		/*
			Transaction Management는 하나의 트렌젝션에 대해서 Transaction Context를 가지게 하고, 이 트렌젝션을 사용하는 Thread들간의 연관관계를 정의한다. 
			고로, 여러 Thread가 하나의 Transaction으로 묶이는것과 같은 Global Transaction(분산 트렌젝션)이 가능해지는 것이다.
		 */
	}
	
	//--- ORACLE의 SEQUENCE에 대해 설명하라, CURRVAL과 NEXTVAL의 차이에 대해 설명, CURRVAL을 얻기 위한 제한 조건을 설명하라 
	public static void print_Subjective_Question_11 () {
		/*
			SEQUENCE 란 :
				- 오라클에서는 행을 구분하기 위해서 기본 키를 두고 있습니다.
				- 테이블내의 유일한 숫자를 자동으로 생성하는 자동 번호 발생기 이므로 시퀀스를 기본 키로 사용하게 되면 
				사용자의 부담을 줄일 수 있다
			
			CURRVAL과 NEXTVAL :
				- 시퀀스의 현재 값을 알아내기 위해 CURRVAL을 사용하고, 다음값을 알아내기 위해 NEXTVAL을 사용합니다
			
			CURRVAL을 얻기위한 제한조건 :
				- CURRVAL에 새로운 값을 할당하기 위해서는 NEXTVAL로 새로운 값을 생성해야 합니다
		*/
	}

	//--- ST 메뉴 테이블의 전체 계층 정보를 출력하는 쿼리를 작성하라.
	public static void print_Subjective_Question_12 () {
		/*
			select menu_id, menu_name, parent_menu_id, level 
			from st_menu s 
			start with s.menu_id='ROOT_01'
			connect by prior s.menu_id=s.parent_menu_id;
			
			----------------------------------------------------------------
			prior
			connect by prior 자식컬럼 = 부모컬럼 ==> 부모에서 자식으로 tree구성
		 */
	}
  
	//--- SUM OVER 분석함수를 사용한 쿼리작성 
	public static void print_Subjective_Question_13 () {
		/*
			SUM (누적할 컬럼명) OVER(PARTITION BY (그룹화할 컬럼명) ORDER BY 정렬값)
		*/
	}
	
	//--- 2018 년도 주문실적을 월별로 출력하는 SQL을 작성하라. 단 주문일자 컬럼은 YYYYMMDD 의 VARCHAR2 형식이라고 가정한다.
	public static void print_Subjective_Question_14 () {
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
			
			----------------------------------------------------------------
			NVL( SUM( CASE WHEN ~ THEN ~ END ), 0 )
		 */
	}
	
	//--- RANK 함수를 사용한 쿼리작성 
	public static void print_Subjective_Question_15 () {
		/*
			SELECT 주문액 ,RANK() OVER (ORDER BY 주문액 DESC) AS 순위
			FROM ORD_ORDER
			WHERE 주문일자 LIKE '201801%' AND ROWNUM < =10
			
			
			----------------------------------------------------------------
			-- Total
			select * from FILE$;
			
			-- ROW_NUMBER()
			SELECT blocks , ROW_NUMBER() OVER( ORDER BY blocks DESC) as RANK 
			from FILE$;
			-- 1/2/3/4/5
			
			-- RANK()
			SELECT blocks , RANK() OVER( ORDER BY blocks DESC) as RANK
			from FILE$;
			-- 1/2/3/3/5
			
			-- DENSE_RANK()
			SELECT blocks , DENSE_RANK() OVER( ORDER BY blocks DESC) as RANK
			from FILE$;
			-- 1/2/3/3/4
		*/
	}
}
