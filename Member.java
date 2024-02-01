package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {	
	Scanner sc = new Scanner(System.in);
	private String member_id;
	private String member_pw;
	private String name;
	private String phone_number;
	private String address;
	private String age;
	private boolean bAvailable;
	
	private ArrayList<Member> member_idList = new ArrayList<Member>();
	private ArrayList<Member> member_pwList = new ArrayList<Member>();
	
	public Member() {
		
	}
	
	public String getmember_id() {
		return member_id;		
	}
	
	public void setmember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public String getmember_pw() {
		return member_pw;		
	}
	
	public void setmember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getphone_number() {
		return phone_number;
	}
	
	public void setphone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getage() {
		return age;
	}
	
	public void setage(String age) {
		this.age = age;
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
        System.out.println("**[환영합니다]**");
        System.out.println("1.회원가입");
        System.out.println("2.로그인");
        System.out.println("0.종료");
        System.out.println("**************");
        String userInput = sc.nextLine();
 
        switch (userInput) {
        case ("1"):
            join(); 
            break;
 
        case ("2"):
            login(); 
            break;
       
        case ("0"):
            System.out.println("프로그램 종료");
            sc.close();
            System.exit(0);
        default:
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            break;
        }
 
    } // end while
    }
	
    //회원가입
    public void join() throws InterruptedException {
        while (true) {
            Member member = new Member();
            while (true) {
                int cnt=0;                
                System.out.println("**********");
                System.out.println("[회원가입]");
                System.out.println("아이디 : ");
                String temp = sc.nextLine();                
                for (int i = 0; i < member_idList.size(); i++) {
                    if (temp.equals(member_idList.get(i).getmember_id())) {
                        cnt++;
                        System.out.println("이미 존재하는 아이디입니다. 다시 입력하세요.");
                        break;
                    } // end if
                } // end for
                if(cnt==0) {
                    member.setmember_id(temp);
                    break;
                 }
            }// end while
            while (true) {
            int cnt2=0;    
            System.out.println("비밀번호 : ");
                String temp2 = sc.nextLine();
                for (int i2 = 0; i2 < member_pwList.size(); i2++) {
                    if (temp2.equals(member_pwList.get(i2).getmember_pw())) {
                        cnt2++;                       
                    }
                }
                if(cnt2==0) {
                	member.setmember_pw(temp2);
                	break;
                }
                }
                System.out.println("이름 : ");                
                member.setname(sc.nextLine());
                System.out.println("전화번호 : ");
                member.setphone_number(sc.nextLine());
                System.out.println("주소 : ");
                member.setaddress(sc.nextLine()); 
                System.out.println("나이 : ");
                member.setage(sc.nextLine());
                member.setbAvailable(true);
                Thread.sleep(1000);
                
                //가입완료
                System.out.println("아이디 : " + member.getmember_id());
                
                System.out.println("입력하신 아이디가 맞습니까? 예(Y) 아니오(N)");
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    member_idList.add(member);
                    member_pwList.add(member);
                    System.out.println("*****************");
                    System.out.println("[가입이 완료되었습니다]");
                    System.out.println("*****************");
                    break;
        }else if (confirm.equalsIgnoreCase("n")) {
            System.out.println("아이디를 새로 입력하세요.");
        } else {
            System.out.println("잘못 누르셨습니다. 초기 메뉴로 이동합니다");
            break; // 초기메뉴로 이동
        } // if-else end
        } // end while
         
    }     // end main
    
	//로그인
    public void login() throws InterruptedException {
        while (true) {
            System.out.println("아이디 : ");
            String temp = sc.nextLine();
            int cnt = 0;
            for (int i = 0; i < member_idList.size(); i++) {
            	if(temp.equals(member_idList.get(i).getmember_id())) {             		
            		cnt++;
            		break;      
            	}
            }//end for
            if(cnt==0) {
            	System.out.println("아이디가 존재하지 않습니다. 다시 입력하세요.");
             }else {
            	 while (true) {
            System.out.println("비밀번호 : ");
            String temp2 = sc.nextLine();
            int cnt2 = 0;
            for (int i2 = 0; i2 < member_pwList.size(); i2++) {
            	if(temp2.equals(member_pwList.get(i2).getmember_pw())) {             		
            		System.out.println("*************************");
            		System.out.println(member_idList.get(i2).getmember_id() + "님이 로그인하셨습니다.");
            		System.out.println("*************************");
            		cnt2++;
            		break;  
            	}
            }
           if(cnt2==0) {
        	   System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
           }else {
        	  
//로그인완료화면        	
        	   while (true) {   
        	    System.out.println("*************************");
            	System.out.println("[로그인 되셨습니다]");
            	System.out.println("1.회원 정보 수정");
            	System.out.println("2.대여반납히스토리");
            	System.out.println("*************************");
            	String userInput2 = sc.nextLine();
            	
            	switch (userInput2) {
                case ("1"):
                    update(); 
                    break;
         
                case ("2"):
                    //history(); 
                    break;
                               
               default :
            	   System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            	   break;
            	}
           }
            	 }
             }
        }
        }
    }



//회원정보 수정
public void update() throws InterruptedException {
    while (true) {
        System.out.println("[회원 정보 수정]");
        System.out.println("아이디 : ");
        String temp = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < member_idList.size(); i++) {
            if (temp.equals(member_idList.get(i).getmember_id())) {
            	cnt++;
            	
            }
            	if(cnt==0) {
                	System.out.println("아이디가 존재하지 않습니다. 다시 입력하세요.");
                 }else {
            	while (true) {
            		System.out.println("비밀번호 : ");
            	    String temp2 = sc.nextLine();
                int cnt2 = 0;
                for (int i2 = 0; i2 < member_pwList.size(); i2++) {
                    if (temp2.equals(member_pwList.get(i2).getmember_pw())) {
                    	cnt2++;
                    	if(cnt2==0) {
                        	System.out.println("비밀번호가 존재하지 않습니다. 다시 입력하세요.");
                    	}else {
                    		
                System.out.println("이름 : ");
                member_idList.get(i).setname(sc.nextLine());
                System.out.println("전화번호 : ");
                member_idList.get(i).setphone_number(sc.nextLine());
                System.out.println("주소 : ");
                member_idList.get(i).setaddress(sc.nextLine());
                System.out.println("나이 : ");
                member_idList.get(i).setage(sc.nextLine());
                cnt++;
                System.out.println("*****************");                
                System.out.println("[수정이 완료되었습니다]");
                System.out.println("*****************");
               
                
                login();//
            
            }
        } 
        
        }
    }
            
        }
    }
}
}
}
