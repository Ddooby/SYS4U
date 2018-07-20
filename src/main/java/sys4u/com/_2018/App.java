package sys4u.com._2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        
        //--- 주임_진급자_대상_유형_3)_중복 문자열 제거
        printDuplicatedCharsDel();

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

}
