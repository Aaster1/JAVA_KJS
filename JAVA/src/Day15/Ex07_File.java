package Day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 디렉토리 생성 - 입력 :디렉토리 경로
 * 
//디렉토리 파일 목록 - 입력 : 디렉토리 경로
//디렉토리 조회 - 입력 : 파일 경로
//파일 삭제 - 입력 : 파일 경로 - 파일 이름 지정 삭제
//폴더 삭제 - 입력 : 디렉토리 경로 - 하위 경로 일괄 삭제
 * 위 5개 기능 구현
*/





public class Ex07_File {
	static Scanner sc = new Scanner(System.in);
	
	/**
		메뉴 출력 메소드
	*/
	public static void menu() {
		System.out.println("############ 파일 관리 ############");
		System.out.println("1. 디렉토리 생성");
		System.out.println("2. 디렉토리 파일목록");
		System.out.println("3. 파일정보 조회");
		System.out.println("4. 파일 삭제");
		System.out.println("5. 폴더 삭제");
		System.out.println("0. 종료");
		System.out.println("############ 번호 : ");
	}

	/**
		폴더를 생성하는 메소드
		@param filePath
	*/
	public static void makeDirectory(String filePath) {
		File file = new File(filePath);		//<-파일 객체 생성
//		폴더 생성 메소드
//		mkdir()		:	생성할 경로의 『상위 경로까지의 기존 디렉토리』가 존재해야한다.
//					경로 뒤에 \폴더명 기입
//		mkdirs()	:	생성할 경로의 상위 경로까지 『모조리 생성』해준다.
		if(file.mkdir()) System.out.println("디렉토리 생성 성공!!!");
		else System.err.println("디렉토리 생성 실패!!!");
		System.out.println("경로 : " + filePath);
}
	
/**
	디렉토리 파일목록 반환하는 메소드
	@param filePath
	@return
*/	
	public static File[] listDirectory(String filePath) {
		System.out.println(filePath);
		System.out.println("=================================================================================");
		File file = new File(filePath);
		File[] fileList = file.listFiles();
		
		for (File file2 : fileList) {
			long update = file2.lastModified();		//<--파일 메소드ㅡ 마지막 수정일자의 반환타입은 long입니다~
			Date date = new Date(update);			//<--그걸 데이트 타입으로 변환 가능한 모양이에요~
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //<--데이트타입은 sdf로 포맷이 가능했었죠~?
			String updateDate = sdf.format(date);
			
			System.out.println(file2.getName()+"\t");		//<--파일명 of File자료형.메소드
			System.out.println(file2.length()/1024 + "KB"+"\t");		//<-파일크기 of File 자료형.메소드
			System.out.println(updateDate+"\t");			
			//↑↑↑수정일자 of File 자료형을 lastModified()메소드를 통해 Date 자료형으로 변환후 SimpleDateFormat으로 포맷한 형태
			System.out.println();
		}
		System.out.println("=================================================================================");
		return fileList;
		
	}
	/**
		파일 정보를 조회하는 메소드
		@param filePath
	*/
	public static void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.print("파일 종류 : ");
		if(file.isDirectory()) System.out.println("디렉토리");
		if(file.isFile()) System.out.println("일반파일");
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);
		
		System.out.println(file.getName()+"\t");
		System.out.println(file.length()/1024 + "KB"+"\t");
		System.out.println(updateDate+"\t");
	}
	/**
		파일 삭제 메소드
		@param filePath
	*/
	public static void deleteFile(String filePath) {
		
		File file = new File(filePath);
		
		
		if(file.exists()) {			//<-- 파일이 존재여부 확인
//			delete()
//			- 파일 삭제 성공 --> treu
//			- 파일 삭제 실패 --> false
//			********* 하위 경로에 파일이 존재하면 삭제가 되지 않는다 *******
			if(file.delete()) {
				System.out.println("파일 삭제 성공!!!");
			}
			else {
				System.out.println("파일 삭제 실패!!!");	//<--해당 경로의 하위 경로에 다른 파일이 있을 경우
			}
		}else {
			System.err.println("파일이 존재하지 않습니다!!!");
		}
		
	}
	
	

	public static void deleteDirectory(String filePath) {
		File file = new File(filePath);
		File[] subFiles = file.listFiles(); 		//<--하위 파일목록 반환
		
//		하위 경로에 파일이 없으면
		if(subFiles!=null) {
//			하위 경로의 파일들을 삭제
			for(File subFile : subFiles) {
				deleteDirectory(subFile.getPath());
				
			}
		}
		if(file.delete()) {
			System.out.println("폴더 삭제 성공!!!");
		} else {
			System.out.println("폴더 삭제 실패!!!");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int menuNo;
		
		do {
			menu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
		if(menuNo==0)break;
		
		System.out.print("파일 경로 : ");
		String filePath = sc.nextLine();
		
		switch (menuNo) {
		case 1:
//			디렉토리 생성 - 입력 :디렉토리 경로
			makeDirectory(filePath);
			break;
		case 2:
//			디렉토리 파일 목록 - 입력 : 디렉토리 경로
			listDirectory(filePath);
			break;
		case 3:
//			디렉토리 조회 - 입력 : 파일 경로
			fileInfo(filePath);
			break;
		case 4:
//			파일 삭제 - 입력 : 파일 경로 - 파일 이름 지정 삭제
			deleteFile(filePath);
			break;
		case 5:
//			폴더 삭제 - 입력 : 디렉토리 경로 - 하위 경로 일괄 삭제
			deleteDirectory(filePath);
			break;

		default:
			break;
		}
		}while(true);
	}
	
}
