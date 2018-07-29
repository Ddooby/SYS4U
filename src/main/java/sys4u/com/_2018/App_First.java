package sys4u.com._2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello world!
 * 주임_진급자_대상
 *
 */
public class App_First 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
		//--- 주임_진급자_대상_유형_1)_중복 문자열 갯수 출력
		printDuplicatedChars();
        
		//--- 주임_진급자_대상_유형_2)_회문 체크 (거꾸로 뒤집어도 원래 문자열과 동일한지 체크)
		System.out.println(isPalindrome("다시합시다") + "/" + isPalindrome("가나다라마"));
		
        //--- 주임_진급자_대상_유형_3)_중복 문자열 제거
        printDuplicatedCharsDel();
        
        //--- 주임_진급자_대상_유형_4)_두 개의 문자열의 구성요소가 동일한지 확인하는 메소드
        System.out.println(isIdenticalElements("aabeddew","wedab") + "/" + isIdenticalElements("acb","ca"));
        
        //---- 주임_진급자_대상_유형_5)_SQL문작성
        printSQL_Query_1();
        
        //--- 주임_진급자_대상_유형_6)_댓글을 10개 이상 작성한 사람의 목록을 출력하는 SQL
        printSQL_Query_2();
       
        //--- 주임_진급자_대상_유형_7)_Oracle_CHAR/ VARCHAR2의 차이점
        printSQL_Query_3();
        
        //--- 주임_진급자_대상_유형_8)_PRIMARY KEY 와 UNIQUE KEY 에 대해 설명하고 차이점을 기술하라
        printSQL_Subjective_Question_2();
        
        //--- 주임_진급자_대상_유형_9)_숫자를 총 10자리의 문자로 변환하려한다.
        doZeroFill_function(145);
        
        //--- 주임_진급자_대상_유형_10) 숫자를 총 10 자리의 문자로 변환하려 한다. 남는 자릿수는 0 으로 채우려 할 때, 어떤 함수를 이용하면 되는가?
        printSQL_Subjective_Question_3();
        
        //--- 주임_진급자_대상_유형_12) 쿼리 작성 및 COUNT와 EXISTS 차이
        printSQL_Subjective_Question_4();
        
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
    
    //---- 주임_진급자_대상_유형_5)_SQL문작성
	private static void printSQL_Query_1() {
	    	
    	String sql = "";    	
    	sql += "SELECT \n";
    	sql += "		Board.uid,\n";
    	sql += "		Board.title,\n";
    	sql += "		Board.contents,\n";
    	sql += "		Board.created_by,\n";
    	sql += "		Board.created_date,\n";
    	sql += "		Comment.uid,\n";
    	sql += "		Comment.comment,\n";
    	sql += "		Comment.creadted_by,\n";
    	sql += "		Comment.created_date,\n";
    	sql += "FROM \n";
    	sql += "		Board b\n";
    	sql += "		OUTER JOIN Comment c ON ( b.uid = c.board_uid )\n";
    	sql += "WHERE \n";
    	sql += "		b.uid = 1\n";    	

		System.out.println(sql);
	}
	
	//--- 주임_진급자_대상_유형_6) _댓글을 10개 이상 작성한 사람의 목록을 출력하는 SQL
	private static void printSQL_Query_2() {
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
	}
	
	//--- 주임_진급자_대상_유형_7)_Oracle
	private static void printSQL_Query_3() {
		
		/*
		 	<CHAR/ VARCHAR2의 차이점>
			문자형 데이터의 경우 CHAR와 VARCHAR2를 가장 많이 사용하는데, 가장 큰 차이점은
			CHAR(5)와 VARCHAR2(5)에 동일하게 'aa'라는 데이터(정보)를 입력했다고 할 때, CHAR(5)는 고정길이이므로 입력된 값(데이터)와
			상관없이 5스페이스(space, byte)를 차지한다. 그에 비해서 VARCHAR2(5)는 가변이므로 입력된 값만큼 2스페이스만 차지하게 된다.
			그만큼 용량에 대한 부분을 고려할 때, VARCHAR2가 유리한 점이 많다.
			
			그렇다면 모두 VARCHAR2를 사용하지 않는 이유는 무엇일까?
			무조건 VARCHAR2를 사용시 가변이기 때문에 내부에서 추가적인 Logic이 발생되어 속도 저하를 일으킬 수 있다.
			특히, 고정값을 사용하는 키나 인덱스 컬럼등은 고정크기를 갖는 CHAR로 사용하는 것이 좋다고 한다.
			
			CHAR : 
				- 고정 길이 문자열 저장
				- 사용자가 고정길이보다 짧은 문장을 저장하면 나머지 공간은 Space로 채움
				- 1~255까지의 문장을 저장하면
				- 사용자가 후행공백을 포함하여 고정길이 보다 큰 값을 입력하면 고정 길이에 맞게 값에서 공백이 잘림
				- 값이 너무 크면 ORACLE ERROR가 발생
				- 공백채움비교(blank-padded comparison semantics)를 사용자가
			
			VARCHAR2 :
				- 가변길이 문자열을 저장하면
				- 1~2000 Byte 저장가능함
				- 최대 50자의 VARCHAR2 타입의 변수에 10자를 저장한다면 실제 저장공간도 10자만을 저장
				
			
			※ char(n)에 저장된 데이터와 varchar2(n)에 저장된 데이터가 일치하더라도 char에는 공백이 채워져 있는 문자열이기 때문에 같은지 비교할 때는 실패할 수도 있다.
			
			
			<DATE 타입을 VARCHAR2 타입으로 변환하기 위해 TO_CHAR 함수를 이용하는 방법>
			TO_CHAR(DATE필드, 'yyyymmdd')
			ex) TO_CHAR( REG_DATE, 'yyyymmdd' )
			
			
			<TO_CHAR 함수나 TO_DATE 함수를 이용할 때 DATE_FORMAT을 입력하지 않은 경우 처리되는 방식>
			작업중..
			
		*/
	}
	
	//--- 주임_진급자_대상_유형_8)_PRIMARY KEY 와 UNIQUE KEY 에 대해 설명하고 차이점을 기술하라
	private static void printSQL_Subjective_Question_2() {
		/* 
			primary key(기본키)는 값이 중복되면 안되고 NULL값을 허용하지 않습니다. 테이블에 하나만 설정 가능합니다.
			unique key(고유키)는 값이 중복되면 안되고 NULL값을 허용합니다.
		*/
	}

	//--- 주임_진급자_대상_유형_9)_숫자를 총 10자리의 문자로 변환하려한다.
	public static void doZeroFill_function (int value) {
		String formatValue = String.format( "%010d", value );
		System.out.println("## formatValue::::"+ formatValue);
	}
	
	//--- 주임_진급자_대상_유형_10) 숫자를 총 10 자리의 문자로 변환하려 한다. 남는 자릿수는 0 으로 채우려 할 때, 어떤 함수를 이용하면 되는가?
	private static void printSQL_Subjective_Question_3() {
		 /*
		    LPAD
		    ex) lpad(145,10,0)
	    */
	}
	
	//--- 주임_진급자_대상_유형_12) 쿼리 작성 및 COUNT와 EXISTS 차이
	private static void printSQL_Subjective_Question_4() {
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
	}
    
}
