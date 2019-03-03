import java.util.Scanner;
class KbcGame{
	public static void main(String[] args) {
		int x=0;
		int score=0,count=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome to Kbc ! Kaun Banega Crorepati\n");
		System.out.print("Total  Level 1 2 3 \nand for quit the game enter quit command\n");
		String[] level1={"1.Which animal is known as the ‘Ship of the Desert?", "2.What is a baby frog called?", "3.What do you call the Person who brings the letter to your home from post office?"};
		String[] l1answers={"Camel","Tadpole","Postman"};
		String[]  a1={"1","4","4"};
		String[] l1options={"1.Camel\n2.Cow\n3.Giraffe\n4.Elephant","1.Smallbaby\n2.cutebaby\n3.sweetbaby\n4.Tadpole","1.Uncle\n2.Postmaster\n3.Tauji\n4.Postman"};
		String[] level2={"1.India’s first-ever national police museum will establish in which city?","2.Which country will host the 45th G7 summit 2019?","3.Choose the word which is least like the others word in a group?"};
		String[] l2answers={"Delhi","France","Swan"};
		String[] a2 = {"2","3","2"};
		String[] l2options={"1.Chennai\n2.Delhi\n3.Kolkata\n4.Nagpur","1.Italy\n2.Germany\n3.France\n4.Canada","1.Parrot\n2.Swan\n3.Vulture\n4.Eagle"};
		String[] level3={"1.Carbon dioxide is called a greenhouse gas because?\n","2.Which among the following nontoxic gases helps in formation of enzymes which ripen fruit?","3.Which one among the following is strong smelling agent added to LPG cylinder to help in the detection of gas leakage?"};
		String[] l3answers={"It absorbs infrared radiation","Ethane","Thioethanolamine"};
		String[]  a3 = {"3","2","2"};
		String[] l3options={"1.Its concentration remain always higher than other gases\n2.it is used in photosynthesis\n 3.It absorbs infrared radiation\n4.it emits visible radiation","1.Acetylene\n2.Ethane\n3.Methane\n4.Carbon Dioxide","1.Ethanol\n2.Thioethanolamine\n3.Methane\n4.Chloroform"};
		System.out.println("You are on level1\nYou will get 1000 rupees for 1 right answer, 2000 for second right answer and so on\n");			
		for(int i=1;i<4;i++){
			count=0;
			System.out.println(level1[x]);
			System.out.println(l1options[x]);
			System.out.print("Enter Your Answer:");
			String user =obj.next();
			if(user.equals(l1answers[x])||user.equals(a1[x])){
				score=score+i*1000;
				System.out.println("Perfect answer\nPresent money in your wallet is "+score+"\n");					
				count++;
				x++;
			}
			if(user.equals("quit")||user.equals("Quit")){
				System.out.println("You quit the Game successfully");
				System.out.println("Your win:"+score+" money"+"\n");								
				break;
			}
			if(count==0){
				System.out.println("You enter the wrong answer:\n Correct answer is "+l1answers[i]);
				System.out.println("Your win:"+score+" money"+"\n");				
				break;

			}
		}x=0;
		if(count==1){
			System.out.println("You crossed the level1 successfully\n Now you are on Level2\n");
			for(int i=4;i<7;i++){
				count=0;
				System.out.println(level2[x]);
				System.out.println(l2options[x]);
				System.out.print("Enter your Answer");
				String user=obj.next();
				if(user.equals(l2answers[x])||user.equals(a2[x])){
					score=score+i*1000;
					System.out.println("Perfect answer\nPresent money in your wallet is "+score+"\n");					
					count++;
					x++;
				}if(user.equals("quit")||user.equals("Quit")){
				System.out.println("You quit the Game successfully");
				System.out.println("Your win:"+score+" money"+"\n");								
				break;
			}
			if(count==0){
				System.out.println("You enter the wrong answer:\n Correct answer is "+l2answers[i]);
				System.out.println("Your win:"+score+" money"+"\n");								
				break;
				}
			}
		}
		x=0;
		if(count==1){
			System.out.println("You Crossed the level2\nNow you are in level3\n");
			for(int i=7;i<10;i++){
				count=0;
				System.out.println(level3[x]);
				System.out.println(l3options[x]);
				String user=obj.next();
				if(user.equals(l3answers[x])||user.equals(a3[x])){
					score=score+i*1000;
					count++;
					x++;
					System.out.println("Perfect answer\nPresent money in your wallet is "+score+"\n");					
				}if(user.equals("quit")||user.equals("Quit")){
				System.out.println("You quit the Game successfully");
				System.out.println("Your win:"+score+" money"+"\n");								
				break;
			}
			if(count==0){
				System.out.println("You enter the wrong answer:\n Correct answer is "+l2answers[i]);
				System.out.println("Your win:"+score+" money"+"\n");								
				break;
				}
			}
		}System.out.println("You win "+score+" money");
	}
}