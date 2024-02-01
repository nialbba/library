package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Owner {
	Scanner sc = new Scanner(System.in);
	private String loan;
	private String member;
	private String book;
	
	private String bmember_id;
    private String bTitle;
    private String bAuthor;
    private String bPublisher;
    private String bYear;
    private boolean bAvailable;
    private ArrayList<Owner> bookList = new ArrayList<Owner>();
    private ArrayList<Owner> bmember_idList = new ArrayList<Owner>();
 
    public Owner() {
 
    }
 
    public String getbmember_id() {
        return bmember_id;
    }
 
    public void setbmember_id(String bmember_id) {
        this.bmember_id = bmember_id;
    }
    
    public String getbTitle() {
        return bTitle;
    }
 
    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }
 
    public String getbAuthor() {
        return bAuthor;
    }
 
    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }
 
    public String getbPublisher() {
        return bPublisher;
    }
 
    public void setbPublisher(String bPublisher) {
        this.bPublisher = bPublisher;
    }
    
    public String getbYear() {
        return bYear;
    }
 
    public void setbYear(String bYear) {
        this.bYear = bYear;
    }
 
    public boolean isbAvailable() {
        return bAvailable;
    }
 
    public void setbAvailable(boolean bAvailable) {
        this.bAvailable = bAvailable;
    }
	
	
	
	
	//메인화면
	 public void showMain() throws InterruptedException {
		 while (true) {
			 System.out.println("*****************");			
			 System.out.println("1.대여관리");
			 System.out.println("2.회원관리");
			 System.out.println("3.책관리");
			 System.out.println("*****************");
			 String userInput = sc.nextLine();
			 
			 switch (userInput) {
		        
			 case ("1"):
		         loan(); 
		         break;
		 
		     case ("2"):
		         member(); 
		         break;
		       
		     case ("3"):
		    	 book();
		     	 break;
			 
		     default:
		         System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		         break;
		        }
			 			
		 }
	 }

//대여관리
public void loan() throws InterruptedException {
	while (true) {
		
		 System.out.println("*****************");
		 System.out.println("[대여관리]");
		 System.out.println("1.책리스트");
		 System.out.println("2.대여등록");
		 System.out.println("3.반납등록");
		 System.out.println("4.메뉴");
		 System.out.println("*****************");
		 String userInput = sc.nextLine();
		 
		 switch (userInput) {
	        
		 case ("1"):
	         booklist(); 
	         break;
	 
	     case ("2"):
	         loanregistration(); 
	         break;
	       
	     case ("3"):
	    	 bookregistration();
	     	 break;
		 
	     case ("4"):
	    	 System.out.println("초기 메뉴 이동 : [b] \t 프로그램 종료 : [0]");
	         String temp = sc.nextLine();
	         if (temp.equalsIgnoreCase("b")) {
	             showMain();
	         } else if (temp.equals("0")) {
	             System.out.println("프로그램을 종료합니다.");
	             Thread.sleep(1000);
	             System.exit(0);
	         }
	         
	         
		 }
	}
}
	//책리스트
	public void booklist() throws InterruptedException {
        while (true) {
            System.out.println("보유 도서량:  " + bookList.size());
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("********************");
                System.out.println("책 제목 : " + bookList.get(i).getbTitle());                
                System.out.println("작가 : " + bookList.get(i).getbAuthor());
                System.out.println("출판사 : " + bookList.get(i).getbPublisher());
                System.out.println("출판년도 : " + bookList.get(i).getbYear());
                System.out.println("대여가능 : " + bookList.get(i).isbAvailable());
                System.out.println("********************"); 
            } // end for
            System.out.println("초기 메뉴 이동 : [b] \t 프로그램 종료 : [0]");
            String temp = sc.nextLine();
            if (temp.equalsIgnoreCase("b")) {
                showMain();
            } else if (temp.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                Thread.sleep(1000);
                System.exit(0);
            } else {
                System.out.println("잘못 누르셨습니다. 초기화면으로 이동합니다.");
                Thread.sleep(1000);
                break; 
            }
            } 
        } 
    	
	
	//대여등록
	
	public void loanregistration() {
        while (true) {
        	System.out.println("*****************");
            System.out.println("[대여등록]");
            System.out.println("회원아이디 : ");
            String temp1 = sc.nextLine();
            System.out.println("책 제목 : ");
            String temp2 = sc.nextLine();
                    System.out.println("*****************");
            		System.out.println("[등록이 완료되었습니다]");
            		System.out.println("*****************");
                    break;
        }
	}


//반납등록
public void bookregistration() {
	while (true) {
		System.out.println("*****************");
		System.out.println("[반납등록]");
		System.out.println("회원아이디 : ");
		String temp = sc.nextLine();
		System.out.println("책 제목 : ");
		String temp2 = sc.nextLine();
		System.out.println("*****************");
		System.out.println("[등록이 완료되었습니다]");
		System.out.println("*****************");
		
		break;
	}
}






//회원관리	
public void member() throws InterruptedException {
	while (true) {	
		System.out.println("*****************");
		System.out.println("[전체회원리스트]");
		System.out.println("*****************");

		System.out.println("초기 메뉴 이동 : [b] \t 프로그램 종료 : [0]");
        String temp = sc.nextLine();
        if (temp.equalsIgnoreCase("b")) {
            showMain();
        } else if (temp.equals("0")) {
            System.out.println("프로그램을 종료합니다.");
            Thread.sleep(1000);
            System.exit(0);
        } else {
            System.out.println("잘못 누르셨습니다. 초기화면으로 이동합니다.");
            Thread.sleep(1000);
            break; // 메인으로 돌아감
        }
	}
}

	
//책관리
public void book() throws InterruptedException {
	while (true) {
		System.out.println("*****************");
		System.out.println("[책관리]");
		System.out.println("1.추가");
		System.out.println("2.수정");
		System.out.println("3.삭제");
		System.out.println("4.메뉴");
		System.out.println("*****************");
		String userInput = sc.nextLine();
		 
		 switch (userInput) {
	        
		 case ("1"):
	         insert(); 
	         break;
	 
	     case ("2"):
	         update(); 
	         break;
	       
	     case ("3"):
	    	 delete();
	     	 break;
		 
	     case ("4"):
	    	 System.out.println("초기 메뉴 이동 : [b] \t 프로그램 종료 : [0]");
	         String temp = sc.nextLine();
	         if (temp.equalsIgnoreCase("b")) {
	             showMain();
	         } else if (temp.equals("0")) {
	             System.out.println("프로그램을 종료합니다.");
	             Thread.sleep(1000);
	             System.exit(0);
	         } 
	}
	}
}
		 
//추가
		 public void insert()  {
				while (true) {
					Owner book = new Owner();
				while (true) {
					int cnt = 0;
					System.out.println("*****************");
					System.out.println("[책관리 : 추가 ");
					System.out.println("책제목 : ");
					String temp = sc.nextLine();
					for (int i = 0; i<bookList.size(); i++) {
						if (temp.equals(bookList.get(i).getbTitle())) {
							cnt++;
							System.out.println("책제목 중복입니다. 다시 입력하세요.");
							break;
						}
					}
					if(cnt==0) {
						book.setbTitle(temp);
						break;
					}
				}						
					System.out.println("작가 : ");
					book.setbAuthor(sc.nextLine());
					System.out.println("출판사 : ");
					book.setbPublisher(sc.nextLine());
					System.out.println("출판년도 : ");
					book.setbYear(sc.nextLine());
					book.setbAvailable(true);
					bookList.add(book);
					System.out.println("*****************");
					System.out.println("*****************");
					System.out.println("[책이 추가되었습니다]");
					System.out.println("*****************");
					break;
				
				}

				}
//수정
	public void update()  {
		while (true) {
			System.out.println("*****************");
			System.out.println("[책관리 : 수정]");
			System.out.println("책 제목 : ");
			String temp = sc.nextLine();
			int cnt=0;
			for (int i=0; i<bookList.size(); i++) {
				if(temp.equals(bookList.get(i).getbTitle())) {
			System.out.println("작가 : ");
			bookList.get(i).setbAuthor(sc.nextLine());
			System.out.println("출판사 : ");
			bookList.get(i).setbPublisher(sc.nextLine());
			System.out.println("출판년도 : ");
			bookList.get(i).setbYear(sc.nextLine());
			cnt++;
			System.out.println("*****************");
			System.out.println("*****************");
			System.out.println("[책이 수정되었습니다]");
			System.out.println("*****************");
			break;
		}
			}
			if(cnt==0) {
				System.out.println("해당 도서가 존재하지 않습니다.");
			}else {
				break;
			}
		}
			}
				
//삭제
		public void delete()  {
				while (true) {
					System.out.println("*****************");
					System.out.println("[책관리 : 삭제");
					System.out.println("책 제목 : ");
					String temp = sc.nextLine();
					int cnt=0;
					for(int i=0; i<bookList.size(); i++) {
						if(temp.equals(bookList.get(i).getbTitle())) {
							bookList.remove(i);
							cnt++;
					System.out.println("*****************");
					System.out.println("[책이 삭제되었습니다]");
					System.out.println("*****************");
					break;
					}
					}
					if(cnt==0) {
						System.out.println("해당 책이 존재하지 않습니다.");
					}else {
						break;
					}
				}
		}
}
	
		 