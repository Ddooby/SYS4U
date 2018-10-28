package sys4u.com._2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
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
        
		//--- 주임_진급자_대상_유형_1)
		//print_Subjective_Question_1();
        
		//--- 주임_진급자_대상_유형_2)
		//print_Subjective_Question_2();
		
        //--- 주임_진급자_대상_유형_3)
		//print_Subjective_Question_3();
        
        //--- 주임_진급자_대상_유형_4)
		//print_Subjective_Question_4();
        
        //---- 주임_진급자_대상_유형_5)
		//print_Subjective_Question_5();
        
        //--- 주임_진급자_대상_유형_6)
		//print_Subjective_Question_6();
       
        //--- 주임_진급자_대상_유형_7)
		//print_Subjective_Question_7();
        
        //--- 주임_진급자_대상_유형_8)
		//print_Subjective_Question_8();
        
        //--- 주임_진급자_대상_유형_9)
		//print_Subjective_Question_9();
        
        //--- 주임_진급자_대상_유형_10) 숫자를 총 10 자리의 문자로 변환하려 한다. 남는 자릿수는 0 으로 채우려 할 때, 어떤 함수를 이용하면 되는가?
		//print_Subjective_Question_10();
        
        //--- 주임_진급자_대상_유형_12)
        //print_Subjective_Question_12();
        
    }
    
    
    
    
    
    //--- 중복 문자열 갯수 출력
    //--- null 들어왔을때 exception 처리 필요
    private static void print_Subjective_Question_1 ( ) {
    	
    	Map<String, Object> returnMap = new HashMap<String, Object>();
    	Map<String, Object> resultMap = new HashMap<String, Object>();

    	//--- 문자입력을 인자로 Scanner 생성
    	Scanner scan = new Scanner( System.in );
		//--- 문자입력
    	String line = scan.nextLine();
		if (line.length()==0)
			throw new IllegalArgumentException("입력데이터가 없습니다.");
		
		System.out.println("입력메세지 : " + line );
		
		String lineArr[] = line.split("");
    	List<String> resultList = Arrays.asList(lineArr);
    	for ( String i : resultList ) {
    		int cnt = 0;
    		
    		if ( line.contains(i) ) {
    			cnt++;
    			if ( returnMap.containsKey(i) ) {
    				cnt = (int) returnMap.get(i) + 1;
    				resultMap.put(i, cnt);
    			}
    			returnMap.put(i, cnt);
    		}
    	}
    	
    	//--- 결과
    	System.out.println("## "+ resultMap.toString());
    }
    
    
    //--- 회문 체크 (거꾸로 뒤집어도 원래 문자열과 동일한지 체크)
    //--- 하나의 문자열이 회문인지 확인하는 메소드
    private static void print_Subjective_Question_2 () {
    	System.out.println(isPalindrome("다시합시다") + "/" + isPalindrome("가나다라마"));
    }
    
    private static boolean isPalindrome(String value) {
    	String reversed = new StringBuffer(value).reverse().toString();
    	return reversed.equals(value);
    }
    
    
    //--- 중복 문자열 제거
    //--- null 들어왔을때 exception 처리 필요
    private static void print_Subjective_Question_3 () throws IllegalArgumentException {
    	
    	String line = "가나다가나라가나마";
    	List<String> resultList = new ArrayList<String>();
    	
    	try {
			
    		String lineArr[] = line.split("");
    		List<String> lineList = Arrays.asList(lineArr);
    		
    		lineList.stream()
    					//.filter( i -> lineList.contains( i ) )
    					.filter( i -> !resultList.contains(i) )
    					.forEach( i -> resultList.add(i) );
    		
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println( e.getStackTrace() );
		}

    	//--- 결과
    	//resultList.forEach( i -> System.out.print( i ));
    	System.out.println(resultList.toString());
    }
    
    //--- 두 개의 문자열의 구성요소가 동일한지 확인하는 메소드
    private static void print_Subjective_Question_4 () {
    	//System.out.println(isIdenticalElements("aabeddew","wedab") + "/" + isIdenticalElements("acb","ca"));

    	System.out.println("# 첫번째 문자열을 입력하세요 : ");
    	@SuppressWarnings("resource")
		Scanner scan1 = new Scanner(System.in);
    	String inputText1 = scan1.nextLine().trim();
    	
    	System.out.println("# 두번째 문자열을 입력하세요 : ");
    	@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(System.in);
    	String inputText2 = scan2.nextLine().trim();
    	
    	if ( inputText1.length() == 0 || inputText2.length() == 0 ) {
    		throw new IllegalArgumentException("입력데이터가 없습니다.");
    	}
    	
    	System.out.println("# 결과 : " + isIdenticalElements( inputText1.trim(), inputText2.trim() ));
    	
    	//--- distinct()
    	//--- 중복제거 : abccde -> abcde
    	
    	//--- sorted()
    	//--- 정렬메서드 : edbca -> abcde
    	
    	//--- collect()
    	//--- 스트림을 다른 형식으로 변환한다.
    	//--- collect연산으로 파이프라인을 처리해서 결과를 반환한다.
    	
    	//--- Collectors.joining()
    	//--- 자바에서 뭔가를 출력할 때, 구분자를 함께 출력하는 format 지정 
    	//--- ex ) Collectors.joining(",")
    	
    	
//    	String inputText1 = "abccde";
//    	List<String> text1List = Arrays.asList(inputText1.split(""));
//    	String streamTxt1 = text1List.stream().distinct().sorted().collect(Collectors.joining());
//    	String streamTxt11 = text1List.stream().distinct().collect(Collectors.joining());
//    	System.out.println("# streamTxt1 = "+ streamTxt1);
//    	System.out.println("# streamTxt11 = "+ streamTxt11);
//
//    	String inputText2 = "edbca";
//    	List<String> text2List = Arrays.asList(inputText2.split(""));
//    	String streamTxt2 = text2List.stream().distinct().sorted().collect(Collectors.joining());
//    	String streamTxt22 = text2List.stream().distinct().collect(Collectors.joining());
//    	System.out.println("# streamTxt2 = "+ streamTxt2);
//    	System.out.println("# streamTxt22 = "+ streamTxt22);
//    	
//    	System.out.println("## "+ streamTxt1.equals(streamTxt2));
//    	System.out.println("## "+ streamTxt11.equals(streamTxt22));
    }

    private static boolean isIdenticalElements(String a, String b) {
    	String aStream =  Arrays.asList(a.split("")).stream().distinct().sorted().collect(Collectors.joining());
    	String bStream = Arrays.asList(b.split("")).stream().distinct().sorted().collect(Collectors.joining());
    	return aStream.equals(bStream);
    }
    
    //--- SQL문작성
	private static void print_Subjective_Question_5() {
	    /*	
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
		*/
	}
	
	//--- 댓글을 10개 이상 작성한 사람의 목록을 출력하는 SQL
	private static void print_Subjective_Question_6() {
		 /*
	        select m.name, c.comment_cnt 
	        from
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
	
	//--- Oracle_CHAR/ VARCHAR2의 차이점
	private static void print_Subjective_Question_7() {
		
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
			
			TO_CHAR : DATE, NUMBER형을 문자타입으로 변환하는 함수입니다.
			- FORMAT이 없는 경우 파라미터를 문자로 취급하고 출력
			
			TO_DATE : TO_DATE 함수는 CHAR, VARCHAR2형을 DATE 타입으로 변환합니다.
			- FORMAT이 없는 경우 기본형식으로 출력(YY/MM/DD)
			
		*/
	}
	
	//--- PRIMARY KEY 와 UNIQUE KEY 에 대해 설명하고 차이점을 기술하라
	private static void print_Subjective_Question_8() {
		/* 
			primary key(기본키)는 값이 중복되면 안되고 NULL값을 허용하지 않습니다. 테이블에 하나만 설정 가능합니다.
			unique key(고유키)는 값이 중복되면 안되고 NULL값을 허용합니다.
			
			--------------------------------------------------------------------------------------------
			하나의 테이블 내에는 적어도 Primary Key 또는 Unique Index 하나는 있어야 한다.
		*/
	}

	
	//--- 숫자를 총 10자리의 문자로 변환하려한다.
	private static void print_Subjective_Question_9() {
		doZeroFill_function(145);
	}
	
	public static void doZeroFill_function (int value) {
		String formatValue = String.format( "%010d", value );
		System.out.println("## formatValue::::"+ formatValue);
	}
	
	//--- 주임_진급자_대상_유형_10) 숫자를 총 10 자리의 문자로 변환하려 한다. 남는 자릿수는 0 으로 채우려 할 때, 어떤 함수를 이용하면 되는가?
	private static void print_Subjective_Question_10() {
		 /*
		    LPAD
		    ex) lpad(145,10,0)
	    */
	}
	
	//--- 쿼리 작성 및 COUNT와 EXISTS 차이
	private static void print_Subjective_Question_12() {
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
        
        	
        	--------------------------------------------------------------------------------------------
        	COUNT는 모든 레코드 중 관련된 것을 필터링한 후 COUNT함수를 수행하지만, EXISTS는 필터링 시 하나라도 레코드가 있음을 인지했을때 반환한다.
        	테이블의 전체 레코드 수가 작을 때는 구별이 안되지만, 많을 때는 EXISTS가 효과적이다.
        
         */
	}
    
}
