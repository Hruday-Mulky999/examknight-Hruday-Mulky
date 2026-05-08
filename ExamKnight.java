/* Dhanvin Madhu & Hruday Mulky
 * ExamKnight.java
 * 4-21-2026
 * This program will be able to teach the user ALg /Trig portions along with Biology to prepare for 1 
 * semester exam, with 2 semester exams for mathematics. The user will be playing as a character trying
 *  to escape a dungeon and must complete questions to successfully escape the bosses. There will be 
 * multiple levels with randomly generated questions, with tips/ corrections and explanations throughout. 
 * The user can choose between different characters with different powers, and buy equipment with coins  
 * when they complete levels. The user can review their stats each time and see explanations on how 
 * they went wrong. They can choose to use an account for progress to be saved or play as a guest with 
 * no data saved, but still playable.
 * Important information:
 * // signifies work by Hruday, /// signifies work by Dhanvin
 * Images used in background, and the buttons have been generated using manus ai, 
 * the override and JLayered pane been taken from Oracle Help Center (Only the method itself was 
 * taken from oracle help center, the implementation into our code was done by us.
 * Questions have been generated using gemini ai.
 * The rest of the animations and graphics were done by us.
 * The Plan: 
 * Week 1: We must complete the first part of the card layout, allowing users to accept terms
 * and conditions, Read the rules of the game, and choose whether they wish to create an
 * account sign into an existing one or play as a guest and not have any data saved. The panel 
 * for accepting the name and password should be completed as well. The images for the 
 * background of these slides should be saved for us to use alter, and we should have 
 * generated some questions to ask the user.
 * Week 2: We must complete the adding the grpahics, background images, timers and most animations
 * for the panels already completed. We must have started on the tutorial panel with the layout looking proper.
 * The account saving and logging in should work properly by this time. Plus, the characters should be designed by now
 * PseudoCode: The Plan (Updated for week 2)
 * Import graphics, color, font, dimension
 * import image
 * import file, ioexception and imageio
 * import gridlayout, borderlayout and flowlayout
 * import cardLayout
 * import jframe and jpanel
 * import jbutton, jradiobutton
 * import jbuttongroup, jtextfield
 * import jtextarea, jlabel, jslider
 * import jScrollBar and JScrollPane
 * import jmenubar, jmenu and jmenuitem
 * import JCheckBox
 * import actionlistener and actionevent
 * import changeevent and changelistener
 * import FocusListener, Focusevent
 * import Mouseevent and mouselistener
 * import adjustmentlistener and adjustmentevent
 * 
 * ExamKnight class header
 * 	main method header
 * 		create instance of class called pit
 * 		use pit to call run
 * 	run header
 * 		D&I JFrame frame and give its label "ExamKnight"
 * 		Set size to 1500 x 1000
 * 		Set close operation to exit on close"
 * 		Set location on screen as 0, 0
 * 		set resizable as false
 * 		Create instance of ExamKnightHolder pith
 * 		add pith to the frame
 * 		Set frame to be visible
 * 
 * Create Class ExamKnightHolder which extends JPanel
 * 	D&I FV CardLayout cards
 * 	constructor of ExamKnightHolder
 * 		set cards as a new cardLayout
 * 		setLayout as cards
 * 		Create instance of classes StartPage, ChooseLogInSignUp, 
 * 		TermsAndConditionPanel, RulesPanel, LoginPage and SignUpPageHolder in the 
 * 		ChooseLogInSignUp class and add them to the panel with a clear string term.
 * 	public CardLayout getCardLayout
 * 		return the cards
 * StartPage class header which extends JPanel
 * 	D&I FVs private image picture and ExamKnightHolder instance ekh
 * 	constructor of start page takes in the instance of exam knight holder called ekh
 * 		set the layout as null
 * 		D&I string pictName with the name of the image for the background
 * 		try
 * 			set picture as the image in the file with name pictName
 * 		catch an exception of io
 * 			Tell the user that the file cannot be found
 * 			print the errors in the terminal
 * 		D&I JButton start, termsConditions,and rules. Set the fnt as a bold monoscaped 
 * 		20 size font. Set bounds of the buttons in the middle of the page.
 * 		D&I instance of the buttonhandler class and add it to the 3 buttons
 * 		as an action listener.
 * 	paint component has a parameter of graphics g
 * 		calls super’s constructor(refresh graphics)
 * 		draws the image picture with top left corner as 0,0 with width of 1500, height of 
 * 		1000 and an image observer this.
 * 	class button handler implements action listener
 * 		ActionPerformed method header with parameter actionevent evt
 * 			D&I string command as the action command of the event
 * 			if command is equal to text of LoginButton
 * 				use ekh’s getcardlayout and ekh to show the chooseloginsignup
 * 				page
 * 			else if command is equal to text of termsConditionsButton
 * 				use ekh’s getcardlayout and ekh to show the Terms and conditions
 * 				page
 * 			else if command is equal to text of rulesButton
 * 				use ekh’s getcardlayout and ekh to show the rulesPanel
 * class chooseloginsignup extends jpanel and implements actionlistener
 * 	D&I FVs examknightholder ekh
 * 	String UsernameHolder
 * 	String PasswordHolder
 * 	JTextField Cusername
 * 	JTextFIeld Cpassword
 * 	JTextField passwordCheck
 * 	JTextField username
 * 	JTextField password
 * 	constructor of chooseloginsignup has a parameter of examknightholder ekhIn
 * 		set ekh as ekhIn
 * 		set layout as a border layout
 * 		D&I JLabel askSignIN to ask how the user will proceed with the account
 * 		set font as 30 plain serif
 * 		D&I JPanel askSignInHolder and add askSignIn to it
 * 		add askSignInHolder to the North of the panel
 * 		D&I JCheckBox signIn for signing in
 * 		D&I JCheckBox createAccount for creating account
 * 		D&I JCeckBox playGuest to play as a guest and understand that 
 * 		score is not saved
 * 		add this  panel as the actionlistener of signIn, createAccount and playGuest
 * 		D&I JButtongroup called checkboxGroup and add singIn, createAccount and 
 * 		playGuest to the buttonGroup so that only one can be selected
 * 		at a time
 * 		D&I JPanel checkBoxHolder with grid layout of 3 rows, 1 column.
 * 		D&I JPanel emptyWestPanel and set preferred size as 500 width and 100 
 * 		height
 * 		add the empty westpanel to west of the panel
 * 		add signIn, createAccount, playGuest to checkBoxHolder
 * 		add checkBoxHolder to center of the panel
 * 		create instance of mainpagereturnbutton sending in ekh,
 * 		add the instance to the south of the panel
 * 	actionPerformed has a parameter of actionevent evt
 * 		D&I string command as the action command of the event
 * 		if the command is for signing in, use ekh’s getCardLayout and ekh to call the
 * 		LogIn Page
 * 		else if the command is for creating an account, use ekh’s getCardLayout and ekh 
 * 		to call the SignUpPage
 * 		else if the command is for playing as a guest, (blank for now until the game part 
 * 		is ready)
 * 	header of class LoginPage extends JPanel
 * 		constructor of LoginPage
 * 			set layout as a borderlayout
 * 			D&I JLabel UPHeader, keeping text in the center of the label
 * 			D&I font font to be 50 bold serif font
 * 			set font of UPHeader as font
 * 			add UPHeader to the north of the panel)
 * 			D&I JPanel textFieldHolder and set its layout as null
 * 			set username and password as a JTtextField with their respective names,
 * 			set the bounds of each to be centered in the page
 * 			add an instance of FocusFieldHandler as the focuslistener to both  * 	 
 * 			username and password
 * 			add username and password to textFieldHolder
 * 			add textFieldHolder to the center of the borderlayout
 * 			create instance of mainPageReturn button and add it to the south of the 
 * 			panel
 * 	header of class SignUpPageHolder extends JPanel
 * 		constructor of LoginPage
 * 			set layout as a borderlayout
 * 			D&I JLabel UPHeader, keeping text in the center of the label
 * 			D&I font font to be 50 bold serif font
 * 			set font of UPHeader as font
 * 			add UPHeader to the north of the panel)
 * 			D&I JPanel textFieldHolder and set its layout as null
 * 			set Cusername, Cpassword and passwordCheck as a JTtextField
 * 			with their respective names,
 * 			set the bounds of each to be centered in the page
 * 			add an instance of FocusFieldHandler as the focuslistener to  	     
 * 			Cusername, Cpassword and passwordCheck
 * 			add username and password to textFieldHolder
 * 			add textFieldHolder to the center of the borderlayout
 * 			create instance of mainPageReturn button and add it to the south of the 
 * 			panel
 * 	class FocusFieldHandler implements FocusListener
 * 		D&I FVs Ucounter, Pcounter, CUcounter, CPcounter, CPPcounter to 1
 * 		public void focusGained has focusevent evt as a parameter
 * 			if the source of the event is username and Ucounter is less than 2
 * 				set text of username to empty and increment Ucounter
 * 			else if the source of the event is password and Pcounter is less than 2
 * 				set text of password to empty and increment Pcounter
 * 			else if the source of the event is Cusername and CUcounter is less than 2
 * 				set text of Cusername to empty and increment CUcounter
 * 			else if the source of the event is Cpassword and CPcounter is less than 2
 * 				set text of Cpassword to empty and increment CPcounter
 * 			else if the source of the event is passwordCheck and CPPcounter
 * 			is less than 2
 * 				set text of passwordCheck to empty and increment CPPcounter
 * 		public void focusLost has a parameter of focusEvent evt
 * 		public void focusLost has a parameter of focusEvent evt
 * 		     (no action needed when focus is lost OR leave blank)
 * class TutorialPage extends JPanel implements ActionListener
 * 	D&I FVs GameData data, CardLayout listOfCards, ExamKnightHolder ekh
 * 	D&I ButtonGroup group
 * 	D&I JTextArea questionArea
 * 	D&I JRadioButton array answer size 4
 * 	D&I JButtons submit, nextQuestion, nextPanel
 * 	D&I int indexLetter
 * 	constructor of TutorialPage takes in GameData d, CardLayout c, ExamKnightHolder ekhIn
 * 		set data as d
 * 		set listOfCards as c
 * 		set ekh as ekhIn
 * 		call data.grabQuestionFromFile
 * 		set background color as black
 * 		set layout as border layout
 * 		D&I font myFont as bold size 30
 * 		initialize answer array of size 4
 * 		create JPanel question and set layout border layout
 * 		create JTextArea questionArea using data.getQuestion
 * 		set font, color, wrap, and make non-editable
 * 		add questionArea to question panel (north)
 * 		create JPanel answers with grid layout 2x2
 * 		create ButtonGroup group
 * 		loop through answer array
 * 			initialize each JRadioButton with letter + answer from data
 * 			add each button to group
 * 			set font, color, background
 * 			add action listener
 * 			add to answers panel
 * 		create JPanel buttonPanel with flow layout
 * 		initialize submit button, disable initially, add action listener
 * 		initialize nextQuestion button, disable initially, add action listener
 * 		initialize nextPanel button, disable initially, add action listener
 * 		add buttons to buttonPanel
 * 		create southComponents panel
 * 		add answers and buttonPanel to southComponents
 * 		add southComponents to south of layout
 * 	class MoverLetterButton implements ActionListener
 * 		actionPerformed increments indexLetter
 * 		if indexLetter reaches limit reset to 0
 * 		repaint screen
 * 	paintComponent method
 * 		draw background image
 * 		get current question from data
 * 		display substring of question based on indexLetter (typing effect)
 * 	actionPerformed method
 * 		if any radio button selected enable submit button
 * 		if submit pressed
 * 			highlight correct answer green
 * 			if wrong answer selected highlight red
 * 			if correct increment correct count in data
 * 			disable all answer buttons
 * 			enable nextQuestion or nextPanel depending on question count
 * 		else if nextQuestion pressed
 * 			call resetQuestion
 * 			disable nextQuestion
 * 	method resetQuestion
 * 		call data.grabQuestionFromFile
 * 		update questionArea text
 * 		update all answer button texts
 * 		enable buttons and reset colors
 *
 * class GameData
 * 	D&I FVs first, last, question
 * 	D&I String array answerSet size 4
 * 	D&I int correctAnswer
 * 	D&I boolean array chosenQuestions size 30
 * 	D&I int questionCount, correctCount, lastGameCorrectCount
 * 	constructor initializes variables and calls resetAll
 * 	method resetAll
 * 		reset all variables and arrays
 * 		set questionCount and correctCount to 0
 * 	method grabQuestionFromFile
 * 		open file "computerQuestions.txt"
 * 		generate random question number not already used
 * 		mark question as used
 * 		skip lines to reach selected question
 * 		read question text
 * 		read 4 answer choices into array
 * 		read correct answer index
 * 		close file
 * 	method setName sets first and last name
 * 	method getQuestion returns formatted question with number
 * 	method getAnswer returns answer at index
 * 	method getCorrectAnswer returns correct answer index
 * 	method getQuestionCount returns number of questions used
 * 	method getCorrectCount returns last game score
 * 	method addOneToCorrectCount increments correct count
 * 	method toString
 * 		if score > 2 return congratulatory message
 * 		else return encouragement message
 * 	method getHighScores
 * 		open "highScores.txt"
 * 		read all lines and append to result string
 * 		return result
 *
 * class TermsAndConditionsPanel extends JPanel
 * 	D&I FV ExamKnightHolder ekh
 * 	constructor of TermsAndConditionPanel takes in ExamKnightHolder ekhIn
 * 		set ekh as ekhIn
 * 		set layout as a borderLayout
 * 		D&I JLabel T&Cheader
 * 		set font of T&Cheader as a plain serif of size 30
 * 		D&I JPanel T&CheaderHolder
 * 		set preferred size (dimension) of  T&Cheader as 300 width and 100 height
 * 		setLayout of T&CheaderHolder as a centered flow layout
 * 		add T&Cheader to T&CheaderHolder
 * 		add T&CheaderHolder to the north of the panel
 * 		D&I JTextArea details with the text
 * 		D&I JScrollpanel paneText as the scrollPane of details
 * 		set font of details as plain serif of size 20
 * 		set linewrap and wrapstyle word as true for details
 * 		set editable of details to false
 * 		set vertical scrollbar policy as always and horizontal to as needed
 * 		set preferred size (dimension) of pane text with width 500 and height 300
 * 		D&I JPanel textHolder with layout flowlayout centered
 * 		add paneText to textHolder
 * 		add textHolder to the center of the borderLayout
 * 		create instance of mainPageReturn button and add it to the south of the 
 * 		panel
 * 	paintComponent draws background image
 * class MainPageReturnButton extends JPanel implements ActionListener
 * 	D&I FV ExamKnightHolder ekh
 * 	D&I int typeReturn
 * 	constructor takes in ekhIn and typeReturnIn
 * 		set ekh and typeReturn
 * 		create JButton mainReturn with text depending on typeReturn
 * 		set bounds and layout
 * 		add action listener
 * 		create layered pane with button and overlay design
 * 		add pane to panel
 * 	actionPerformed
 * 		if typeReturn == 1 show Start page
 * 		else if typeReturn == 2 show LogIn/SignUp page
 * class RulesPanel extends JPanel
 * 	D&I FV ExamKnightHolder ekh
 * 	constructor of RulesPanel takes in ExamKnightHolder ekhIn
 * 		set ekh as ekhIn
 * 		set layout as a borderLayout
 * 		D&I JLabel rulesHeader
 * 		set font of rulesHeader as a plain serif of size 30
 * 		D&I JPanel rulesHeaderrHolder
 * 		set preferred size (dimension) of  rulesHeader as 100 width and 100 height
 * 		setLayout of rulesHeaderHolder as a centered flow layout
 * 		add rulesHeader to rulesHeaderHolder
 * 		add rulesHeaderHolder to the north of the panel
 * 		D&I JTextArea details with the text
 * 		D&I JScrollpanel paneText as the scrollPane of details
 * 		set font of details as plain serif of size 20
 * 		set linewrap and wrapstyle word as true for details
 * 		set editable of details to false
 * 		set vertical scrollbar policy as always and horizontal to as needed
 * 		set preferred size (dimension) of pane text with width 500 and height 300
 * 		D&I JPanel textHolder with layout flowlayout centered
 * 		add paneText to textHolder
 * 		add textHolder to the center of the borderLayout
 * 		create instance of mainPageReturn button and add it to the south of the 
 * 		panel
 * 	paintComponent draws background image
 */ 




import java.awt.Graphics; //import graphics, color, font, dimension
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Image; //import image

import java.io.File; //import file, ioexception and imageio
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.GridLayout; //import gridlayout, borderlayout and flowlayout
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;//import cardLayout

import javax.swing.JFrame;    //import jframe and jpanel
import javax.swing.JPanel;
import javax.swing.JButton; //import jbutton, jradiobutton
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonGroup;//import jbuttongroup, jtextfield
import javax.swing.JTextField;
import javax.swing.JTextArea;//import jtextarea, jlabel, jslider
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JScrollBar; //import jScrollBar and JScrollPane
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;//import jmenubar, jmenu and jmenuitem
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;//import JCheckBox
import java.awt.event.ActionListener;//import actionlistener and actionevent
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeEvent;//import changeevent and changelistener
import javax.swing.event.ChangeListener;
import java.awt.event.FocusListener;    //import FocusListener, Focusevent
import java.awt.event.FocusEvent;
import java.awt.event.MouseListener; //import Mouseevent and mouselistener
import java.awt.event.MouseEvent;
import java.awt.event.AdjustmentListener;//import adjustmentlistener and adjustmentevent
import java.awt.event.AdjustmentEvent;
import java.awt.event.KeyListener;//import adjustmentlistener and adjustmentevent
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import javax.swing.JLayeredPane;
import java.io.File;//import File
import java.util.Scanner;//Import Scanner
import java.io.FileNotFoundException;//Import FileNotFoundException
import java.io.FileWriter;//Import filewriter (to write in shoppinglist)
import java.io.PrintWriter;//import PrintWriter
import java.io.IOException;//import IOException
import java.util.Scanner;
import javax.swing.BorderFactory;

public class ExamKnight//class header ExamKnight
{	
	public ExamKnight()//constructor of ExamKnight is empty
	{
	}
	
	public static void main(String [] args)//main method
	{
		ExamKnight start = new ExamKnight();
		//create instance of ExamKnight called start
		start.run();//use start to call run
	}
	
	public void run()//run
	{
		JFrame frame = new JFrame("ExamKnight");
		//D&I JFrame frame and give its label "ExamKnight"
		frame.setSize( 1500, 1000);	//	Set size to 1500 x 1000
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		//Sets close operation to exit on close
		frame.setLocation(0,0);
		//Sets location on screen as 0, 0
		frame.setResizable(false);
		//sets resizable as false
		ExamKnightHolder gameHolder = new ExamKnightHolder(); 
		//instance of ExamKnightHolder gameHolder	
		frame.getContentPane().add( gameHolder );
		//adds gameHolder to the frame	
		frame.setVisible(true);	
		//Sets frame to be visible
	}
}
class fileHeader
{
	public void printToFile()
    {
        File file = new File("Username.txt");

                try
                {
                    if (file.length() == 0) 
                    {
                        PrintWriter sl = new PrintWriter(new FileWriter(file,true));//initialize printwriter sl while checking to see if Shopping list file exist
                        sl.print("USERNAME & PASSWORD FILE\n\n");
                        sl.close();
                    }
                }
                catch(IOException e)//error if the file cannot be written to
                {
                    System.err.println("File cannot written to");//error message
                }
                
    }
}
//this panel contains the card layout for all the different panels in our game
class ExamKnightHolder extends JPanel 
//header of class ExamKnightHolder which extends JPanel
{	
	private CardLayout cards;//FV cardLayout cards
	private GameData data;
	public ExamKnightHolder()//constructor of ExamKnightHolder
	{
		fileHeader fh = new fileHeader();
		fh.printToFile();
		data = new GameData();
		cards = new CardLayout();
		//set cards as a new cardLayout
		setLayout(cards);
		//set the layout of panel as cards
		StartPage startingPage = new StartPage(this);
		//instance of StartPage called startingPage, sends in this panel to constructor
		add(startingPage,"Start");
		//add startingPage to the panel with a text identifier
		ChooseLogInSignUp clisu = new ChooseLogInSignUp(this);
		//instance of ChooseLogInSignUp called clisu, sends in this panel to constructor
		add(clisu,"LogIn/SignUp");
		//add clisu to the panel with a text identifier
		TermsAndConditionPanel tacp = new TermsAndConditionPanel(this);
		//instance of TermsAndConditionPanel called tacp, sends in this panel to constructor
		add(tacp,"T&C");
		//add tacp to the panel with a text identifier
		RulesPanel rp = new RulesPanel(this);
		//instance of RulesPanel called rp, sends in this panel to constructor
		add(rp,"Rules");
		//add rp to the panel with a text identifier
		ChooseLogInSignUp.LoginPage lp = clisu.new LoginPage();
		///instance of LoginPage in ChooseSignUpLogIn called lp
		add(lp, "LoginPage");
		///add lp to the panel with a text identifier
		ChooseLogInSignUp.SignUpPageHolder suph = clisu.new SignUpPageHolder();
		///instance of SignUpPageHolder in ChooseLogInSignUp called startingPage
		add(suph, "SignUpPage");
		///add suph to the panel with a text identifier
		TutorialPage tp = new TutorialPage(data, cards, this);
		add(tp, "TutorialPage");
	}
	public CardLayout getCardLayout()//getCardLayout returns a card layout
	{
		return cards;//return cards
	}
}
class GraphicOverride extends JPanel
{
	private int indexButton;
	private String nameButton;
	public GraphicOverride(int indexButtonIn, String nameButtonIn)
	{
		indexButton=indexButtonIn;
		nameButton = nameButtonIn;
	}
	public GraphicOverride(String nameButtonIn)
	{
		nameButton=nameButtonIn;
	}
	@Override//override allows the super’s method to be overridden by a 
//subclass( information from oracle help center)
	protected void paintComponent(Graphics g) 
	//paint component has a parameter of graphics g(protected to allow 
//overriding-oracle)
	{
		super.paintComponent(g);//refresh graphics
		Image picture = null;//D&I image picture as null
		try {//try
			picture = ImageIO.read(new File("blank_dungeon_button.png"));//set picture as the image in the file of the image
		} 
		catch (IOException e) //catch any io exception
		{
			System.err.println("\n\n blank_dungeon_button.png can't be found.\n\n");
	//tell the user that the file cannot be found
	e.printStackTrace();//print all the errors
		}
		if(nameButton.equals("Log in")||nameButton.equals("Create Account"))
		{
			g.drawImage(picture, 0,-20, 500,200, this);
		}
		else if(nameButton.equals("Back")||nameButton.equals("Return to the main page"))
		{
			g.drawImage(picture, 0,0, 600,175, this);
		}
		else
		{
			g.drawImage(picture, 0,0, 440,200, this);
		}
		//drawImage picture with top left corner being 0,0 width of 440 and 
		//height of 200
		g.setFont(new Font("Lucida Bright",Font.BOLD, 35));
		//set font as lucida bright bold of size 35(got font from oracle)
		g.setColor(Color.GREEN);//set color as green
		if(indexButton<nameButton.length())//if indexButton is lesser than 14
		{
			if(nameButton.equals("LogIn / SignUp"))
				g.drawString(nameButton.substring(0,indexButton),100,110);//draw the substring of nameButton 
			else if(nameButton.equals("Terms/Conditions"))
				g.drawString(nameButton.substring(0,indexButton),65,110);//draw the substring of nameButton 
			else if(nameButton.equals("Rules"))
				g.drawString(nameButton.substring(0,indexButton),175,110);//draw the substring of nameButton
//from 0 to indexButton at x=100 and y baseline as 110
			else if(nameButton.equals("Log in"))
				g.drawString(nameButton.substring(0,indexButton),190,85);//draw the substring of nameButton
			else if(nameButton.equals("Create Account"))
				g.drawString(nameButton.substring(0,indexButton),120,85);//draw the substring of nameButton
			//190,85
			else if(nameButton.equals("Back"))
				g.drawString(nameButton,260,100);//draw the substring of nameButton
//at x=100 and y baseline as 110
			else if(nameButton.equals("Return to the main page"))
				g.drawString(nameButton,90,100);//draw the substring of nameButton
		}
		else//else
		{
			if(nameButton.equals("LogIn / SignUp"))
				g.drawString(nameButton,100,110);//draw the substring of nameButton 
			else if(nameButton.equals("Terms/Conditions"))
				g.drawString(nameButton,65,110);//draw the substring of nameButton 
			else if(nameButton.equals("Rules"))
				g.drawString(nameButton,175,110);//draw the substring of nameButton
//at x=100 and y baseline as 110
			else if(nameButton.equals("Log in"))
				g.drawString(nameButton,190,85);//draw the substring of nameButton
//at x=100 and y baseline as 110
			else if(nameButton.equals("Create Account"))
				g.drawString(nameButton,120,85);//draw the substring of nameButton
//at x=100 and y baseline as 110
			else if(nameButton.equals("Back"))
				g.drawString(nameButton,260,100);//draw the substring of nameButton
//at x=100 and y baseline as 110
			else if(nameButton.equals("Return to the main page"))
				g.drawString(nameButton,90,100);//draw the substring of nameButton
//at x=100 and y baseline as 110
		}
	}
	public void getIndex(int indexButtonIn)
	{
		indexButton=indexButtonIn;
	}
}

//this class is the first panel of the game where players can move into panel to read terms and conditions, rules or go to start signing in
class StartPage extends JPanel
//StartPage class header which extends JPanel
{
	//FVs private image picture and ExamKnightHolder instance ekh
	private Image picture;
	private ExamKnightHolder ekh;
	//timer timerFire 
	private Timer timerFire;
	//ints x,y,height,wdith,x2,y2,x3,y3,current,x4,y4,(these are for the fire) and 
//stateLetters(for the  and index button
	private int x,y,height,width,x2,y2,x3,y3,current,x4,y4,stateLetters,indexButton;
	private GraphicOverride overlay, overlay2, overlay3;
	//JPanels overlay, overlay2 and overlay 3 for the design of the buttons
	public StartPage(ExamKnightHolder ekhIn)
	//constructor of start page takes in the instance of exam knight holder called ekh
	{
		overlay = new GraphicOverride(indexButton,"LogIn / SignUp"); //set overlay as a new JPanel
		overlay2 = new GraphicOverride(indexButton, "Terms/Conditions"); //set overlay as a new JPanel
		overlay3 = new GraphicOverride(indexButton,"Rules"); //set overlay as a new JPanel
		Mover mover = new Mover();
		//create instance of Mover called mover
		timerFire = new Timer(1,mover);
		//set timerFIre as a timer with 1 delay in class instance of mover
		timerFire.setDelay(150);
		//set delay of the timeFire to 150 ticks
		timerFire.start();
		//start timerFire
		MoverLetters moveLetters = new MoverLetters();
		//create instance of moverLetters called moveLetters
		Timer timerLetter = new Timer(1,moveLetters);
		//create a timer timerLetter of 1 tick delay of the class
		timerLetter.start();
		//start timerLetter
		MoverLetterButton moveLetterButton = new MoverLetterButton();
		//D&I MoverLetterButton moveLetterButton
		Timer timerButton = new Timer(1,moveLetterButton);
		//create instance of Timer timerButton of 1 tick delay of class instance 
//moveLetterButton
		timerButton.start();
		//start timerButton
		ekh=ekhIn;//sey ekh as ekhIn
		setLayout(null);//set layout as null

		String pictName="exam_knight_side_vines.png";//D&I string pictName as the name of the image
		//(This image was generated Manus AI)
		try//try
		{
			picture = ImageIO.read(new File(pictName));
			//set picture as the imageio reading of a new file with the name of pictname
		}
		catch(IOException e)//catch a ioexception e
		{
			System.err.println("\n\n" +pictName+" can't be found.\n\n");
			//tell the user that the file cannot be found
			e.printStackTrace();//print all the errors
		}
		JButton account = new JButton("Log in/Sign up");//create JButton account for
// signing up
		account.setFont(new Font("Monospaced", Font.BOLD, 20));
//Set the font of account as a bold monoscaped size 20
		account.setBounds(575, 360, 375, 97);
		//set bounds of account with top left corner being 575,360 with width of 375 and 
//height of 97
		overlay.setOpaque(false);//set overlay’s background as transparent (got from oracle)
		overlay.setBounds(540, 310, 470, 215);//set bounds of overlay with top left corner 
//being 540, 310 width of 470 and height 215

		JLayeredPane pane = new JLayeredPane();//D&I JLayeredPane pane
		pane.setLayout(null);//set layout as null
		pane.setBounds(0, 0, 1500, 900);//set bounds of pane with top left corner as 0,0, 
//width of 1500, 900

		pane.add(account, JLayeredPane.DEFAULT_LAYER);//add acount as the bottom
		//layer of the JLayeredPane
		pane.add(overlay, JLayeredPane.PALETTE_LAYER);//add overlay as the top 
//layer of the JLayeredPane
		overlay2.setOpaque(false);//set background of overlay2 as transparent
		overlay2.setBounds(540, 500, 470, 215);//set bounds of overlay2 with top left 
//corner as 540 by 500 with width of 470 and height of 215
		
		JButton tc = new JButton("Terms/Conditions");//D&I JButton tc
		tc.setFont(new Font("Monospaced",Font.BOLD,20));
		//Set the font of tc as a bold monoscaped size 20
		tc.setBounds(575, 555, 375, 87);//set bounds of tc width with top left corner as 
//575 by 555, width of 375 and height of 87
		
		pane.add(tc, JLayeredPane.DEFAULT_LAYER);//add tc as the bottom layer of 
//the pane
		pane.add(overlay2, JLayeredPane.PALETTE_LAYER);
//add tc as the top layer of the panel
		overlay3.setOpaque(false);//set background of overlay3 as transparent
		overlay3.setBounds(540, 700, 470, 215);//set bounds of overlay3 with top left 
//corner as 540 by 700, width of 470 and height of 215
		
		JButton rules = new JButton("Rules");
		//D&I JButton rules 
		rules.setFont(new Font("Monospaced",Font.BOLD,20));
		//Set the font of rules as a bold monoscaped size 20
		rules.setBounds(575, 755, 375, 87);//set bounds of rules with top left corner as 
//575 by 755, with width of 375 and height of 87
		
		pane.add(rules, JLayeredPane.DEFAULT_LAYER);//add rules of the bottom of 
//the panel
		pane.add(overlay3, JLayeredPane.PALETTE_LAYER);//add overlay3 to the top 
//of the panel
		
		add(pane);//add pane to the panel
		ButtonHandler bh = new ButtonHandler();
		//create instance of ButtonHandler called bh
		account.addActionListener(bh);
		//add bh as an action listener to account
		tc.addActionListener(bh);
		//add bh as an action listener to tc
		rules.addActionListener(bh);
		//add bh as an action listener to rules
	}
	private class MoverLetters implements ActionListener//class MoverLetters implements ActionListener
	{
		private int wait;//D&I FV private int wait
		public MoverLetters()//constructor of mover letters
		{
			wait=-170;//set wait as -170
		}
		public void actionPerformed(ActionEvent evt)//action performed has a parameter 
//of action event evt
		{
			if(wait==5)//if wait is 5
			{
				stateLetters+=1;//increment stateLetters
				wait=-1;//set wait as -1
			}
			if(stateLetters==30)//if stateLetters is 30
			{
				stateLetters=0;//set stateLetters as 0
				wait=-40;//set wait as -40
			}
			wait++;//increment wait
			repaint();//refresh paint component
			requestFocusInWindow();//request focus in the window
		}
	}
	private class MoverLetterButton implements ActionListener//class MoverLetterButton implements actionlistener
	{
		public MoverLetterButton()
		{
		}
		public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of actionevent evt
		{
			indexButton+=1;//increment indexButton
			if(indexButton==40)//if indexButton is 40
				indexButton=0;//set indexButton as 0
			repaint();//refresh graphics
			overlay.getIndex(indexButton);
			overlay2.getIndex(indexButton);
			overlay3.getIndex(indexButton);
			requestFocusInWindow();//request focus in the window
		}
	}
	private class Mover implements ActionListener//mover implements actionListener
	{
		public Mover()//contructor of mover
		{
			x=155;//set x as 155
			y=325;//set y as 325
			height=26;//set height as 26
			width=16;//set width as 16
			x2=355;//set x2 as 355
			y2=250;//set y2 as 250
			x3=1250;//set x3 as 1250
			y3=800;//set y3 as 800
			x4=0;//set x4 as 0
			y4=0;//set y4 as 0
			current=-1;//set current as -1
		}
		public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of actionevent evt
		{
			x=-100;//set x1 y1 all to x4 y4 as -100;
			y=-100;
			x2=-100;
			y2=-100;
			x3=-100;
			x4=-100;
			y3=-100;
			y4=-100;
			int path1=0;//set path 1 to 4 as 0
			int path2=0;
			int path3=0;
			int path4=0;
			current++;
			path1 = (int)(Math.random()*4);//set path1 as random number from 0 to 3
			while(path2==path1)//while path2 is path1
				path2 = (int)(Math.random()*4);
//set path2 as random number from 0 to 3
			while(path3==path2||path3==path1)//while path3 is path1 or path2
				path3 = (int)(Math.random()*4);
//set path3 as random number from 0 to 3
			while(path4==path3||path4==path2||path4==path1)
			//while path4 is path1 2 or 3
				path4 = (int)(Math.random()*4);
//set path4 as random number from 0 to 3
			if(current==15)//if current is 15
				current=0;//set current as 0
			//int[] paths = new int[]{path1,path2,path3,path4}
			int[] setPath1x = new int[]{185,182,177,172,167,165,157,152,155,158,160,162};
//D&I int arrays setPath1x, setPath 1y all to setPath4x and setPath4y with 
//the right values for the path of the sparks
			int[] setPath1y = new int[]{325,318,311,302,297,286,274,263,251,249,254,262};
			int[] setPath2x = new int[]{145,142,140,138,135,132,130,133,136,139,142,140};
			int[] setPath2y = new int[]{328,319,312,306,299,289,275,264,272,280,273,278};
			int[] setPath3x = new int[]{145,148,152,157,163,168,174,181,178,174,171,168};
			int[] setPath3y = new int[]{328,319,312,306,299,289,275,264,272,280,273,278};
			int[] setPath4x = new int[]{185,191,196,202,207,213,218,224,229,234,239,232};
			int[] setPath4y = new int[]{325,318,311,302,297,286,274,263,251,249,254,262};
			if(current<12)//if current is less than 12
			{
				x=setPath1x[current];//set x as current index of setPath1x
				y=setPath1y[current];//set y as current index of setPath1y
			}
			if(current-1>=0&&current<13)//if current -1 is greater than 0 and current is less than 13
			{
				x2=setPath2x[current-1];//set x2 as current-1 index of setPath2x
				y2=setPath2y[current-1];//set y2 as current-1 index of setPath2y

			}
			if(current-2>=0&&current<14)//if current -2 is greater than 0 and current is less than 14
			{
				x3 = setPath3x[current-2];//set x3 as current-2 index of setPath3x
				y3 = setPath3y[current-2];//set y3 as current-2 index of setPath3y

			}
			if(current-3>=0&&current<15)//if current -3 is greater than 0 and current is less than 15
			{
				x4 = setPath4x[current-3];//set x4 as current-3 index of setPath4x
				y4 = setPath4y[current-3];//set y4 as current-3 index of setPath4y
			}
			height-=2;//reduce height by 2
			width-=2;//reduce width by 2
			if(current==0)//if current is 0
			{
				height=26;//set height as 26
				width=16;//set width as 16
			}
			repaint();//refresh the graphics
			requestFocusInWindow();//request focus in the window
		}
	}

	public void paintComponent(Graphics g)
	//paintcomponment has a parameter of graphics g
	{
		super.paintComponent(g);//refresh graphics
		int[] xList=new int[3];//D&I int array xList and yList with length 3
		int[] yList=new int[3];
		g.drawImage(picture,0,0,1500,1000,this);
		//draw the image picture with top left corner being 0,0
		// wdith of 1500, height of 1000
		g.setColor(new Color(223,162,28));//set color as a new color with rgb values of 
//223, 162 and 28
		g.fillOval(x+30,y-20,width+5,height+5);
		//draw in a filled in oval with top left corner as x+30 and y-20, width of width+5 
//and height of height+5
		g.fillOval(x2+30,y2-20,width+5,height+5);
		//draw in a filled in oval with top left corner as x2+30 and y2-20, width of width+5 
//and height of height+5
		g.fillOval(x3+30,y3-20,width+5,height+5);
		//draw in a filled in oval with top left corner as x3+30 and y3-20, width of width+5 
//and height of height+5
		g.fillOval(x4+30,y4-20,width+5,height+5);
		//draw in a filled in oval with top left corner as x4+30 and y4-20, width of width+5 
//and height of height+5
		g.fillOval(x+1150,y+15,width+5,height+5);
		//draw in a filled in oval with top left corner as x+1150 and y+15, width of width+5 
//and height of height+5
		g.fillOval(x2+1150,y2-+15,width+5,height+5);
		//draw in a filled in oval with top left corner as x2+1150 and y+15, width of 
//width+5 and height of height+5
		g.fillOval(x3+1150,y3+15,width+5,height+5);
		//draw in a filled in oval with top left corner as x3+1150 and y+15, width of 
//width+5 and height of height+5
		g.fillOval(x4+1150,y4+15,width+5,height+5);
		//draw in a filled in oval with top left corner as x4+1150 and y+15, width of 
//width+5 and height of height+5
		int[] letterX = new int[]{820,850,850,820};//D&I int arrays letterX and letterY 
		int[] letterY = new int[]{520,470,480,530};//for drawing polygon of letter
		g.setColor(Color.RED);//set color as red
		if(stateLetters>0&&stateLetters<15)
		//if stateLetters is greater than 0 and stateLetters is less than 15
		{
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>1&&stateLetters<15)
//if stateLetters is greater than 1 and stateLetters is less than 15
		{
			letterX = new int[]{850,850,880,880};//set values of letterX and letterY
			letterY = new int[]{470,480,530,520};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>2&&stateLetters<15)
//if stateLetters is greater than 2 and stateLetters is less than 15
		{
			letterX = new int[]{832,837,867,865};//set values of letterX and letterY
			letterY = new int[]{500,505,505,500};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>3&&stateLetters<15)
//if stateLetters is greater than 3 and stateLetters is less than 15
		{
			letterX = new int[]{900,905,905,900};//set values of letterX and letterY
			letterY = new int[]{470,470,530,530};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>4&&stateLetters<15)
//if stateLetters is greater than 4 and stateLetters is less than 15
		{
			g.fillArc(880,470,50,35,90,-180);//draw a filled in arc with top left corner 
//being 880 by 470, width of 50 height of 35 starting from 90 degrees 
//going 180 clockwise
		}
		if(stateLetters>5&&stateLetters<15)
//if stateLetters is greater than 5 and stateLetters is less than 15
		{
			letterX = new int[]{905,905,935,935};//set values of letterX and letterY
			letterY = new int[]{505,500,525,530};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>6&&stateLetters<15)
//if stateLetters is greater than 6 and stateLetters is less than 15
		{
			letterX = new int[]{945,950,950,945};//set values of letterX and letterY
			letterY = new int[]{530,530,470,470};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>7&&stateLetters<15)
//if stateLetters is greater than 7 and stateLetters is less than 15
		{
			letterX = new int[]{950,980,980,950};//set values of letterX and letterY
			letterY = new int[]{470,470,475,475};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>8&&stateLetters<15)
//if stateLetters is greater than 8 and stateLetters is less than 15
		{
			letterX = new int[]{950,970,970,950};//set values of letterX and letterY
			letterY = new int[]{500,500,505,505};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>9&&stateLetters<15)
//if stateLetters is greater than 9 and stateLetters is less than 15
		{
			letterX = new int[]{950,980,980,950};//set values of letterX and letterY
			letterY = new int[]{525,525,530,530};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>10&&stateLetters<15)
//if stateLetters is greater than 10 and stateLetters is less than 15
		{
			letterX = new int[]{820,850,880,880,850,820};
			//set values of letterX and letterY
			letterY = new int[]{650,670,650,660,680,660};
			g.fillPolygon(letterX,letterY,6);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 6 points from each
		}
		if(stateLetters>11&&stateLetters<15)
//if stateLetters is greater than 11 and stateLetters is less than 15
		{
			letterX = new int[]{845,855,855,845};//set values of letterX and letterY
			letterY = new int[]{670,670,720,720};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>12&&stateLetters<15)
//if stateLetters is greater than 12 and stateLetters is less than 15
		{
			g.fillOval(890,650,40,80);//draw a filled in oval with top left corner being 
//890 by 650, width of 40 and height of 80
		}
		if(stateLetters==14)
//if stateLetters is 14
		{
			g.fillArc(940,570,40,160,0,-180);//draw a filled in arc with top left corner 
//being 940 by 570, width of 40 height of 160 starting from 0 degrees 
//going 180 clockwise
		}
		if(stateLetters>14)
		//if(stateLetter is greater than 14
		{
			letterX = new int[]{770,775,775,770};//set values of letterX and letterY
			letterY = new int[]{660,660,720,720};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>15)
		//if(stateLetter is greater than 15
		{
			g.fillArc(750,660,50,35,90,-180);//draw a filled in arc with top left corner 
//being 750 by 660, width of 50 height of 35 starting from 90 degrees 
//going 180 clockwise
		}
		if(stateLetters>16)
		//if(stateLetter is greater than 16
		{
			letterX = new int[]{775,775,800,800};//set values of letterX and letterY
			letterY = new int[]{690,695,720,715};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>17)
		//if(stateLetter is greater than 17
		{
			letterX = new int[]{810,815,815,810};//set values of letterX and letterY
			letterY = new int[]{660,660,720,720};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>18)
		//if(stateLetter is greater than 	18
		{
			letterX = new int[]{815,845,845,815};//set values of letterX and letterY
			letterY = new int[]{660,660,665,665};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>19)
		//if(stateLetter is greater than 19
		{
			letterX = new int[]{815,835,835,815};//set values of letterX and letterY
			letterY = new int[]{687,687,692,692};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>20)
		//if(stateLetter is greater than 20
		{
			letterX = new int[]{815,845,845,815};//set values of letterX and letterY
			letterY = new int[]{715,715,720,720};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>21)
		//if(stateLetter is greater than 21
		{
			letterX = new int[]{860,860,880,880};//set values of letterX and letterY
			letterY = new int[]{710,720,670,660};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>22)
		//if(stateLetter is greater than 22
		{
			letterX = new int[]{880,880,900,900};//set values of letterX and letterY
			letterY = new int[]{660,670,720,710};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>23)
		//if(stateLetter is greater than 23
		{
			letterX = new int[]{873,868,893,888};//set values of letterX and letterY
			letterY = new int[]{685,690,690,685};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>24)
		//if(stateLetter is greater than 24
		{
			letterX = new int[]{915,915,920,920};//set values of letterX and letterY
			letterY = new int[]{660,720,720,660};
			g.fillPolygon(letterX, letterY, 4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		if(stateLetters>25)
		//if(stateLetter is greater than 25
		{
			g.fillArc(880,660,70,60,90,-180);//draw a filled in arc with top left corner 
//being 880 by 660, width of 70 height of 60 starting from 90 degrees 
//going 180 clockwise
		}
		if(stateLetters>26)
		//if(stateLetter is greater than 26
		{
			letterX = new int[]{950,980,1010,1010,980,950};
//set values of letterX and letterY
			letterY = new int[]{660,680,660,670,690,670};
			g.fillPolygon(letterX,letterY,6);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 6 points from each
		}
		if(stateLetters>27)
		//if(stateLetter is greater than 27
		{
			letterX = new int[]{975,985,985,975};//set values of letterX and letterY
			letterY = new int[]{680,680,720,720};
			g.fillPolygon(letterX,letterY,4);//draw a filled in polygon with x and y 
//coordinated in arrays letterX and letterY and 4 points from each
		}
		
	}
	class ButtonHandler implements ActionListener
	//class button handler implements action listener
	{
		public void actionPerformed(ActionEvent evt)
		//ActionPerformed method header with parameter actionevent evt
		{
			String command = evt.getActionCommand();
			//string command as the action command of the event
			if(command.equals("Log in/Sign up"))
			//if command is equal to text of account button
			{
				ekh.getCardLayout().show(ekh,"LogIn/SignUp");
				//use ekh’s getcardlayout and ekh to show the chooseloginsignup page
			}
			else if(command.equals("Terms/Conditions"))
			//else if command is equal to text of termsConditions Button
			{
				ekh.getCardLayout().show(ekh,"T&C");
				//use ekh’s getcardlayout and ekh to show the Terms and conditions page

			}
			else if(command.equals("Rules"))
			//else if command is equal to text of rules Button
			{
				ekh.getCardLayout().show(ekh,"Rules");
				//use ekh’s getcardlayout and ekh to show the rulesPanel
			}
		}
	}
}
class ChooseLogInSignUp extends JPanel implements ActionListener
///This class will let the user pick if they want to login from their old acc or create a new acc or 
///play as a guest
{
	
	private ExamKnightHolder ekh;///creating instance ekh of ExamKnightHolder
	private String UsernameHolder;///Declaring String UsernameHolder
	private String PasswordHolder;///Declaring String PasswordHolder
	private JTextField Cusername;///Declaring JTextField Cusername 
	private JTextField Cpassword;///Declaring JTextField Cpassword 
	private JTextField passwordCheck;///Declaring JTextField passwordCheck 
	private JTextField username;///Declaring JTextField username 
	private JTextField password;///Declaring JTextField password 
	private String usernameText;///Declaring string usernameText
	private String passwordText;///Declaring string passwordText
	private boolean found;///D&I boolean found, Ufound, Profound 
	private boolean Ufound;
	private boolean Pfound;
	private Scanner reader;///D&I scanner reader, int indexLetter, JLabel askSignIN
	private int indexLetter;
	private JLabel askSignIn;
	private GraphicOverride overlayLog, overlaySign;
	public ChooseLogInSignUp(ExamKnightHolder ekhIn)///constructor header with parameter of the instance ekhIn
	{
		overlayLog = new GraphicOverride(indexLetter,"Log in");
		overlaySign = new GraphicOverride(indexLetter, "Create Account");
		MoverLetterTitle letterTitle = new MoverLetterTitle();//create instance of
// MoverLetterTitle called letterTitle
		Timer moveLetterTitle = new Timer(1,letterTitle);//D&I timer moveLettertitle with 1 
//tick delay of class letterTitle
		moveLetterTitle.start();//start moveLetterTitle
		ekh=ekhIn;///setting our instance variable to be the instance ekhIn
		indexLetter=0;//set indexLetter as 0
		
		setLayout(new BorderLayout());///setting this panel to be border layout
		askSignIn = new JLabel("<html> <center>Would you like to sign in to your account, create<br> one or play as a guest</center></html>");//initializing JLabel (this is the header that shows in the ChooseLogInSignUp panel at the top
		askSignIn.setFont(new Font("Lucida Bright",Font.BOLD, 50));///setting the JLabel to the font that we created
		askSignIn.setForeground(Color.GREEN);///setting the color of the JLabel to green
		askSignIn.setPreferredSize(new Dimension(1300,200));///setting the size of the JLabel to be 1300 by 200
		
		JPanel askSignInHolder = new JPanel();///initializing JLabel askSignInHolder
		askSignInHolder.add(askSignIn);///adding askSignIn panel to askSignInHolder
		askSignInHolder.setOpaque(false);///setting the JPanel to be transparent
		askSignInHolder.setPreferredSize(new Dimension(1500,200));
//set dimension of askSignInHolder with width 1500 and height 200
		add(askSignInHolder,BorderLayout.NORTH);///adding askSignInHolder to the panel at area north
///The next 3 checkboxes show up in the center of the panel allowing the user to pick between playing as a guest, logging in, or creating an account
		
		JCheckBox signIn = new JCheckBox("I would like to sign in");///declaring JCheckBox signIn to say “I would like to sign in”
		signIn.setFont(new Font("Lucida Bright",Font.BOLD, 30));//set font of signIn
		JCheckBox createAccount = new JCheckBox("I would like to create a new account");///declaring JCheckBox createAccoutn to say “i woulds like to create a new account”
		createAccount.setFont(new Font("Lucida Bright",Font.BOLD, 30));
		//set font of createAccount
		JCheckBox playGuest = new JCheckBox("I will play as a guest. I understand that my score is not saved");///D&I JCheckBox playGuest to say “I will play as a guest. I understand that my score is not saved”
		playGuest.setFont(new Font("Lucida Bright",Font.BOLD, 30));
//set font of playGuest
		signIn.setForeground(Color.GREEN);
//set text color of signIn, createAccount and playGuest as green
		createAccount.setForeground(Color.GREEN);
		playGuest.setForeground(Color.GREEN);
		signIn.addActionListener(this);///adding action listener to signIn
		createAccount.addActionListener(this);///adding actionListener to createAccount
		playGuest.addActionListener(this);///adding action listener to playGuest
		ButtonGroup checkboxGroup = new ButtonGroup();///creating button group checkboxGroup so that only one of the radiobuttons are clicked
		checkboxGroup.add(signIn);///adding signIn to the button group
		checkboxGroup.add(createAccount);///adding createAccount to the button group
		checkboxGroup.add(playGuest);///adding playGuest to the button group
		JPanel checkboxHolder = new JPanel(new GridLayout(3, 1));///D&I panel checkboxHolder to be gridLayout with 3 rows and 1 column (for display of radiobuttons)
		JPanel emptyWestPanel = new JPanel();///d&I emptywestpanel (this is so that the radiobuttons are more centered
		emptyWestPanel.setPreferredSize (new Dimension(500, 1000));///setting its size to be 500 by 1000
		emptyWestPanel.setOpaque(false);
//set background of emptyWestPanel to transparent
		add(emptyWestPanel, BorderLayout.WEST);///adding emptywestPanel to be the west side of the panel (this is to take up space so that the checkBoxHolder panel looks more centered)
///the next 3 lines is adding the radiobuttons to the panel checkboxHolder
		checkboxHolder.add(signIn);
		///add signIn, createAccount, playGuest to checkboxHolder
		checkboxHolder.add(createAccount);
		checkboxHolder.add(playGuest);
		checkboxHolder.setOpaque(false);
		//set background of checkboxHolder to transparent
		signIn.setOpaque(false);
		//set signIn, createAccount, playGuest with transparent background
		createAccount.setOpaque(false);
		playGuest.setOpaque(false);
		add(checkboxHolder, BorderLayout.CENTER);///add checkboxHolder to the center area of the panel
	    MainPageReturnButton mprb = new MainPageReturnButton(ekh,1);/// instance of MainPageReturnButton mprb
	    mprb.setPreferredSize(new Dimension(1500,200));//set dimension of mprb with width
// of 1500 and height of 200
	    mprb.setOpaque(false);//set background of mprb as transparent
        add(mprb,BorderLayout.SOUTH);///add this “panel” to the south (this is the button we see at the bottom
	}
	private class MoverLetterTitle implements ActionListener//class MoverLetterTitle 
//implements actionlistener
	{
		private int wait;//D&I FC int wait
		public MoverLetterTitle()//constructor of MoverLEtterTitle
		{
			wait=0;//set wait as 0
		}
		public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of actionevent evt
		{
			if(indexLetter<80)//if indexLetter is less than 80
				indexLetter+=1;//increment indexLetter
			if(indexLetter==80)//if indexLetter as 80
			{
				wait++;//increment wait
			}
			if(indexLetter==80&&wait==40)//if indexLetter is 80 and wait is 40
			{
				wait=0;//set wait as 0
				indexLetter=0;//set indexLetter as 0
			}
			repaint();//refresh graphics
			overlayLog.getIndex(indexLetter);
			overlaySign.getIndex(indexLetter);
			requestFocusInWindow();//request focus in window
		}
	}
	public void actionPerformed(ActionEvent evt)///this method will determine if it should show panel to signin or login based on what radiobutton they choose
	{
		String command = evt.getActionCommand();///D&I string command that  gets the string of the radiobutton they choose
		if(command.equals("I would like to sign in"))///if they choose the sign in radiobutton
		{
			ekh.getCardLayout().show(ekh,"LoginPage");///show them the login page (login and signIn are the same thing)
		}
		else if(command.equals("I would like to create a new account"))///if they choose the SignUp radio button		
{
			ekh.getCardLayout().show(ekh, "SignUpPage");///show they SignUpPage
		}
		else if(command.equals("I will play as a guest. I understand that my score is not saved"))/// NOT YET FINISHED but this is supposed to let them instantly play 
		{
			ekh.getCardLayout().show(ekh, "TutorialPage");
		}
	}
	public void paintComponent(Graphics g)//paintComponent has a parameter of graphics g
	{
		super.paintComponent(g);//refresh graphics
		Image picture = null;//set image picture as null
		try//try
		{
			picture = ImageIO.read(new File("revised_ancient_wall.png"));
			//set picture as an image in the file
		}
		catch(IOException e)//catch a ioexception e
		{
			System.err.println("\n\n revised_ancient_wall.png can't be found.\n\n");
			//tell the user that the file cannot be found
			e.printStackTrace();//print all the errors
		}
		g.drawImage(picture,0,0,1500,1000,this);//drawImage picture with top left corner 
//being 0,0, width of 1500 and height of 1000 and this panel as actionlistener
		String askTitle = new String("<html> <center>Would you like to sign in to your account, create<br> one or play as a guest</center></html>");
		String askTitleShort = new String("Would you like to sign in to your account, create  ");
		if(indexLetter<52)
			askSignIn.setText(askTitleShort.substring(0,indexLetter));
		else
			askSignIn.setText(askTitle.substring(0,indexLetter+12));
	}

	class LoginPage extends JPanel ///This class sets up the panel if the user choose “login” radiobutton. (This is the page they will see if they picked login”. 
	{
		JLabel accNotFound = new JLabel("");
		public LoginPage()///constructor header. (creates and adds the components to the panel)
		{
			
			setLayout(new BorderLayout());///setting the layout of this panel to be border layout
			JLabel UPHeader = new JLabel("Enter Username And Password", JLabel.CENTER);///creating JLabel UPHeader (this is the one that you will see at the top of the panel) and making its text centered to the panel
			Font font = new Font("Serif", Font.BOLD, 50);//creating a font and setting the font to be bold with size 50
			UPHeader.setFont(font);///setting the JLabel UPHeader to the font we created
			UPHeader.setOpaque(false);
			UPHeader.setForeground(Color.GREEN);
			add(UPHeader, BorderLayout.NORTH);///adding UPHeader to the north(top) of the panel
			JPanel textFieldHolder = new JPanel();///d&i JPanel textFieldHolder (center panel)
			textFieldHolder.setLayout(null);///settting the layout as null
			username = new JTextField("Username");///initializing the textField username to say “username”
			username.setBounds(400, 100, 700,120);///setting size and location of username
			username.setFont(new Font("Serif", Font.BOLD, 35));
			username.addFocusListener(new FocusFieldHandler());///adding focusListener to username and having class FocusFieldHandler deal with any action related to username
			password = new JTextField("Password");///initializing password to say “password”
			password.setFont(new Font("Serif", Font.BOLD, 35));
			password.setBounds(400,250,700,120);///setting size and location of password (this one will be 150 pixels below the username JTextField
			password.addFocusListener(new FocusFieldHandler());///adding focusListener to password and having class FocusFieldHandler deal with any action related to password
			
			
			
			JButton create = new JButton("Log In");
			create.setFont(new Font("Serif", Font.BOLD, 25));
			create.addActionListener(new UserNameCheck());
			create.setBounds(525,600,400,70); 
			overlayLog.setOpaque(false);
			overlayLog.setBounds(480, 560, 470, 215);

			JLayeredPane pane = new JLayeredPane();
			pane.setLayout(null);
			pane.setBounds(0, 0, 1500, 900);

			pane.add(create, JLayeredPane.DEFAULT_LAYER);
			pane.add(overlayLog, JLayeredPane.PALETTE_LAYER);
			
			
			accNotFound.setBounds(500,510,1000,50);
			textFieldHolder.add(pane);
			textFieldHolder.add(username);///add username to the textFieldHolder panel
			textFieldHolder.add(password);///add username to the textFieldHolder panel
			textFieldHolder.add(accNotFound);
			textFieldHolder.setOpaque(false);
			add(textFieldHolder, BorderLayout.CENTER);///add textFieldHolder to the center of the panel
			MainPageReturnButton mprb = new MainPageReturnButton(ekh,2);///create instance of MainPageReturnbutton
			mprb.setPreferredSize(new Dimension(1500,200));
			mprb.setOpaque(false);
			add(mprb,BorderLayout.SOUTH);///add the panel to the south (this is the button that allows you to go back to the main page
			
		}
		public void paintComponent(Graphics g)///paint component method header
		{
			super.paintComponent(g);///refreshing the screen
			Image picture = null;///declaring image picture as null
			try///Trying image picture 
			{
				picture = ImageIO.read(new File("revised_ancient_wall.png"));
			}
			catch(IOException e)//catch a ioexception e///if the image is not found
			{
				System.err.println("\n\n can't be found.\n\n");
				//tell the user that the file cannot be found
				e.printStackTrace();//print all the errors
			}
			g.drawImage(picture,0,0,1500,1000,this);///draw the image at location 0, 0 and size 1500, 1000
			
		}
		class UserNameCheck implements ActionListener///This class contains actionPerformed to call the UserVerifcation method 
		{
			public void actionPerformed(ActionEvent evt)///action performed that calls the userVerificiation method
			{
				UserVerification();///calling the user verification method
			}
		}
		public void UserVerification()///this method determines if the user is logging in with username and password from an actual account (and determines if the user is correct with password)
		{
			Ufound = false;///setting UFound to be false. (for recalls of the method)
			Pfound = false;///setting PFound to be false. (for recalls of the method)

			String Uline = new String("");///This is the variable that will contain one line from the file (username.txt)
	
					File inFile = new File("Username.txt");//creating file object to read from Recipes.txt
				try///trying the scanner to see if username.txt can be read from
				{
					reader = new Scanner(inFile);//looking to see if Recipes can be read from 
				}
				catch(FileNotFoundException e)///if the file cannot be found/read from
				{
					System.err.println("Cannot find file");//error message
				}
				
				Uline = reader.nextLine();///reading in the next line and setting its value to ULine
				while(reader.hasNext())///loop runs until the scanner reads every line of the file
				{
					while(!(Uline.equals("")))///necesary to ensure that the line we get is a blank line (our doc formatting is: Header-> Blank line->Username->Password->Blank line….. So this will be the line before username
					{
						Uline = reader.nextLine();///reads next line (until the line is a space)
					}
				
					if(reader.hasNext())///checking to see if there is more lines in the file to be read
					{
						Uline = reader.nextLine();///take in the next line (this is the line that contains a username)
					}
					if(username.getText().equals(Uline))///checking to see if the username the user entered in the JTextField username is the same username as the one ULine contains
					{
						Ufound = true;///initialize UFound to true
					}
					if(reader.hasNext())///if there is more to read
					{
						Uline = reader.nextLine();///read in the next line (this should be the password that corresponds with the username in the previous line)
					}
					if(password.getText().equals(Uline)&&Ufound)///first off all checking if the user entered a valid username (one that is found in the file) if so, check to see if the next line (password), is what they entered in the password JTextField
					{
						Pfound = true;///initialize Pfound to true
						Font UFont = new Font("Serif", Font.BOLD, 30);//creating and setting the font to be bold with size 10
						accNotFound.setFont(UFont);///setting JLabel 
						//accNotFound.setText("Logging in");///the next 2 lines of code is a vision (not done yet) where we wait a couple seconds before showing the user the tut panel.(so we can show the user that login was successful
						//accNotFound.setForeground(Color.GREEN);
						//SHOW THEM THE GAME PANEL
						ekh.getCardLayout().show(ekh, "TutorialPage");

					}
				}
					
				if(!Ufound||!Pfound)///if the username OR password was wrong (which is why its !Boolean for both)
				{
					Font UFont = new Font("Serif", Font.BOLD, 30);//creating and setting the font to be bold with size 10
					accNotFound.setFont(UFont);///setting the font for the font we created
					accNotFound.setText("Username or Password is incorrect");
					accNotFound.setForeground(Color.RED);///color red for aesthetics
				}	
			}
		}
	
	class SignUpPageHolder extends JPanel///This class will set up the sign up panel (what the user will see if they selected to sign up
	{			
		JLabel errorLabel = new JLabel("");///d&i JLabel that will be shown in the signup page.
		public SignUpPageHolder()///constructor header
		{
			setLayout(new BorderLayout());///setting the layout to be border layout
			JButton create = new JButton("Create Account");
			create.setFont(new Font("Serif", Font.BOLD, 25));
			create.addActionListener(new CreateButtonHandler());
			JLabel UPHeader = new JLabel("Create a Username and Password", JLabel.CENTER);///creating the JLabel that will be shown at the top of this panel
			Font font = new Font("Serif", Font.BOLD, 50);//creating and setting the font to be bold with size 50
			UPHeader.setFont(font);///setting the JLabel to this font
			UPHeader.setOpaque(false);
			UPHeader.setForeground(Color.GREEN);
			add(UPHeader, BorderLayout.NORTH);///adding the JLabel to the top of the panel (north)
			JPanel textFieldHolder = new JPanel();///d&i JLabel textFieldHolder (this is the panel that will hold the textFields for creating your username and password
			textFieldHolder.setLayout(null);///setting layout of textFieldHolder to be null layout
			Cusername = new JTextField("Enter a username");///initializing Cusername to say “Enter a username” (Cusername stands for Create Username)
			Cusername.setBounds(400, 100, 700,120);///setting the size location of Cusername
			Cusername.setFont(new Font("Serif", Font.BOLD, 35));
			Cusername.addFocusListener(new FocusFieldHandler());///adding focusListener to Cusername and having it be dealt by class FocusFieldHandler
			Cpassword = new JTextField("Create a password");///initializing Cpassword to say “Create a password” (Cpassword stands for Create Password)
			Cpassword.setBounds(400,250,700,120);///setting the size and location of Cpassword (this will be 150 pixels below Cusername)
			Cpassword.setFont(new Font("Serif", Font.BOLD, 35));
			Cpassword.addFocusListener(new FocusFieldHandler());///adding focusListener to Cpassword and having it be dealt by class FocusFieldHandler
			passwordCheck = new JTextField("Enter your password again");///initialing passWordCheck (this is like 2 step verficiation to make sure you entered your password correctly)
			passwordCheck.setFont(new Font("Serif", Font.BOLD, 35));
			passwordCheck.setBounds(400,400,700,120);///setting its size and location (this will be 150 pixels below Cpassword)
			passwordCheck.addFocusListener(new FocusFieldHandler());///adding focusListener to passwordCheck and having it be dealt by class FocusFieldHandler
			
			create.setBounds(525,600,400,70);
			overlaySign.setOpaque(false);
			overlaySign.setBounds(480, 560, 470, 215);

			JLayeredPane pane = new JLayeredPane();
			pane.setLayout(null);
			pane.setBounds(0, 0, 1500, 900);

			pane.add(create, JLayeredPane.DEFAULT_LAYER);
			pane.add(overlaySign, JLayeredPane.PALETTE_LAYER);
			
			errorLabel.setBounds(500,510,1000,50);
			textFieldHolder.add(Cusername);///adding Cusername to textFieldHolder
			textFieldHolder.add(Cpassword);///adding Cpassword to textFieldHolder
			textFieldHolder.add(passwordCheck);///adding passwordCheck to textFieldHolder
			textFieldHolder.add(pane);///adding creat to textFieldHandler
			textFieldHolder.add(errorLabel);///adding errorLabel to textFieldHandler
			textFieldHolder.setOpaque(false);
			
			
			add(textFieldHolder, BorderLayout.CENTER);///adding textFieldHolder to be in the center area of the SignUp panel
			MainPageReturnButton mprb = new MainPageReturnButton(ekh,2);///Call the “panel” that is the button that allows the user to go back to the main panel
			mprb.setPreferredSize(new Dimension(1500,200));
			mprb.setOpaque(false);
			add(mprb,BorderLayout.SOUTH);///adding the “panel” to the bottom of the panel
		
			
	
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Image picture = null;
			try
			{
				picture = ImageIO.read(new File("revised_ancient_wall.png"));
			}
			catch(IOException e)//catch a ioexception e
			{
				System.err.println("\n\n can't be found.\n\n");
				//tell the user that the file cannot be found
				e.printStackTrace();//print all the errors
			}
			g.drawImage(picture,0,0,1500,1000,this);
			
		}
		class CreateButtonHandler implements ActionListener///this class contains actionPerformed header
		{
			public void actionPerformed(ActionEvent evt)///this actionPerformed method calls the verification header
			{
				verification();///this method checks to see if the passwords were entered correct and if the username they are trying to create has already been created
			}
		}
		
		public void verification()///this method checks to see if the passwords were entered correct and if the username they are trying to create has already been created
		{
			found = true;///for recalls of this method
			String line = new String("");///this is a line from Username.txt
				File inFile = new File("Username.txt");//creating file object to read from Recipes.txt
				try///seeing if Username.txt can be read from
				{
					reader = new Scanner(inFile);//looking to see if Username can be read from 
				}
				catch(FileNotFoundException e)
				{
					System.err.println("Cannot find file");//error message
				}
				while(reader.hasNext()&&found)///if found is true and if there is a any more stuff to read from the file
				{
					while(!(line.equals("")))///loop that doesn't stop until the line read is a space/blank line
					{
						line = reader.nextLine();///reading the next line (again the format of our file is blank line->username->password->blank line
					}
					if(reader.hasNext())///if there is more lines to be read
					{
						line = reader.nextLine();///read in the next line (this is a username)					
					}
					if(Cusername.getText().equals(line))///if the username the user entered  in the text field is already in the file
					{
						found = false;///found becomes false 
						Font font = new Font("Serif", Font.BOLD, 30);//creating and setting the font to be bold with size 10
						errorLabel.setFont(font);///setting the errorLabel to the font we created
						errorLabel.setText("Username already in use!! Please try another username");///error message displayed telling the user that the username has already been used
						errorLabel.setForeground(Color.RED);///red for asthethics
					}
				
				}
				
		
			if((passwordCheck.getText().equals(Cpassword.getText()))&&found)///if the username is unique and if the password the user entered in the first textbox matches the one they entered in the 2-step verification second box
			{
				usernameText=Cusername.getText();///setting the string to be the username they entered in the JTextField Cusername
				passwordText=Cpassword.getText();///setting the string to be the password  they entered in the JTextField Cpassword

				Font font = new Font("Serif", Font.BOLD, 30);//creating and setting the font to be bold with size 10
				errorLabel.setFont(font);///setting the label to the font we created
				errorLabel.setText("Account created successfully!");///giving them a message congradulatig them on creating the acount
				errorLabel.setForeground(Color.GREEN);///setting the JLabel color to be green for asthetics
				PrintWriter sl = null;	//initialize printwriter (this one writes in shoppinglist)/// we are gonna need this to write to a file (write the username and password)

				try///to see if the file exists
				{
					sl = new PrintWriter(new FileWriter("Username.txt",true));//initialize printwriter sl while checking to see if Username.txt file exist
				}
				catch(IOException e)//error if the file cannot be written to
				{
					System.err.println("File cannot written to");//error message
				}
				
				sl.append(usernameText+"\n");///appending the file with the username and adding a blank line to continue our formatting
				sl.append(passwordText+"\n\n");///writting the password and then formatting it with 2 blank lines
				sl.close();///closing the printwriter
			}	
			else///if th username they tried to create already exists
			{
				if(found)///if they username they tried to create already exists 
				{
					Font font = new Font("Serif", Font.BOLD, 30);//creating and setting the font to be bold with size 10
					errorLabel.setFont(font);///set error label to the font we just created
					errorLabel.setForeground(Color.RED);///setting the color to red for asthetics 
					errorLabel.setText("The passwords do NOT match. Please try again");///error label telling them that the passwords are not the same 
						
					repaint();
				}
			}
		}
	}
	class FocusFieldHandler implements FocusListener/// this class is mainly there so that when the user clicks ANY textFields, the textField immediately clears its text so its a better experience for the user.
	{
		public void focusGained(FocusEvent evt)///focusGained method header
		{
			if(evt.getSource() == username)///if the user clicked on the username textfield for the first time
			{
				username.setText("");///clear the username textfield
				
			}
			else if(evt.getSource() == password)///if the user clicked on the password textfield for the first time
			{
				password.setText("");///clear the password textField
				
			}
			else if(evt.getSource() == Cusername)///if the user clicked on the Cusername textfield for the first time
			{
				Cusername.setText("");///clear the Cusername textField
				
			}
			else if(evt.getSource() == Cpassword)///if the user clicked on the Cpassword textfield for the first time
			{
				Cpassword.setText("");///clear the Cpassword textField
				
			}
			else if(evt.getSource() == passwordCheck )///if the user clicked on the passwordCheck textfield for the first time
			{
				passwordCheck.setText("");///clears the passwordCheck textfield
				
			}
		}
		public void focusLost(FocusEvent evt) 
		{
			if(evt.getSource() == username && username.getText().equals(""))///if the user clicked on the username textfield for the first time
			{
				username.setText("Username");///clear the username textfield
				
			}
			else if(evt.getSource() == password && password.getText().equals(""))///if the user clicked on the password textfield for the first time
			{
				password.setText("Password");///clear the password textField
				
			}
			else if(evt.getSource() == Cusername && Cusername.getText().equals(""))///if the user clicked on the Cusername textfield for the first time
			{
				Cusername.setText("Enter a username");///clear the Cusername textField
				
			}
			else if(evt.getSource() == Cpassword && Cpassword.getText().equals(""))///if the user clicked on the Cpassword textfield for the first time
			{
				Cpassword.setText("Create a password");///clear the Cpassword textField
				
			}
			else if(evt.getSource() == passwordCheck && passwordCheck.getText().equals(""))///if the user clicked on the passwordCheck textfield for the first time
			{
				passwordCheck.setText("Enter your password again");///clears the passwordCheck textfield
				
			}
		} //focusLost method needed for compilation
	}
}
class TutorialPage extends JPanel implements ActionListener, KeyListener///this method is copy pasted code from game module files (nothign was changed except for the name)
{
	private GameData data;
	private CardLayout listOfCards;
	private ExamKnightHolder ekh;
	private ButtonGroup group;
	private JTextArea questionArea;
	private JRadioButton [] answer;
	private JButton submit, nextQuestion, nextPanel;
	private int indexLetter;
	private AnimationPanel character;
	private boolean timerStarted;
	private int bossHealthNo, playerHealthNo;
	private JLabel bossHealth, playerHealth;
	private int state;
	public TutorialPage(GameData d, CardLayout c, ExamKnightHolder ekhIn)
	{
		state=0;
		bossHealthNo=100;
		playerHealthNo=100;
		timerStarted=false;
		requestFocusInWindow();
		addKeyListener(this);
		MoverLetterButton moveLetter = new MoverLetterButton();
		Timer timeLetter = new Timer(1,moveLetter);
		timeLetter.setDelay(1);
		timeLetter.start();
		data = d;
		listOfCards = c;
		ekh = ekhIn;
		data.grabQuestionFromFile();
		setBackground(Color.BLACK);
		setLayout(new BorderLayout());
		Font myFont = new Font("Tahoma", Font.BOLD, 30);
		
		answer = new JRadioButton[4];
		
		JPanel question = new JPanel();
		question.setOpaque(false);
		question.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		question.setLayout(new BorderLayout());
		question.setPreferredSize(new Dimension(1500,100));
		
		bossHealth = new JLabel("Boss Health:"+bossHealthNo);
		bossHealth.setFont(new Font("Serif",Font.BOLD, 50));
		bossHealth.setForeground(Color.GREEN);
		bossHealth.setPreferredSize(new Dimension(350,50));
		
		playerHealth = new JLabel("Player Health:"+playerHealthNo);
		playerHealth.setFont(new Font("Serif",Font.BOLD, 50));
		playerHealth.setForeground(Color.GREEN);
		playerHealth.setPreferredSize(new Dimension(450,50));
		
		JPanel northComponents = new JPanel();
		northComponents.add(question);
		northComponents.add(bossHealth);
		northComponents.add(playerHealth);
		northComponents.setOpaque(false);
		northComponents.setPreferredSize(new Dimension(1500,200));
		add(northComponents, BorderLayout.NORTH);
		
		character = new AnimationPanel();
		character.setPreferredSize(new Dimension(1500,550));
		add(character,BorderLayout.CENTER);
		if(state==0)
			questionArea = new JTextArea("Welcome to the game");
		else if(state>10)
			questionArea = new JTextArea(data.getQuestion(), 3, 30);
		questionArea.setFont(myFont);
		questionArea.setForeground(Color.GREEN);
		questionArea.setLineWrap(true);
		questionArea.setWrapStyleWord(true);
		questionArea.setOpaque(false);
		questionArea.setEditable(false);
		

		question.add(questionArea, BorderLayout.CENTER);
		
		JPanel answers = new JPanel();
		answers.setOpaque(false);
		answers.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		answers.setLayout(new GridLayout(2, 2, 20, 20));
		
		group = new ButtonGroup();
		for(int i = 0;i<answer.length;i++)
		{
			answer[i] = new JRadioButton(""+(char)(65+i)+". " + data.getAnswer(i));
			group.add(answer[i]);
			answer[i].setOpaque(true);
			answer[i].setBackground(new Color(230, 230, 230));
			answer[i].setFont(myFont);
			answer[i].addActionListener(this);
			answers.add(answer[i]);
		}
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		//add(buttonPanel, BorderLayout.SOUTH);
		
		submit = new JButton("SUBMIT");
		submit.setFont(myFont);
		submit.addActionListener(this);
		submit.setEnabled(false);
		buttonPanel.add(submit);
		
		nextQuestion = new JButton("NEXT QUESTION");
		nextQuestion.setFont(myFont);
		nextQuestion.addActionListener(this);
		nextQuestion.setEnabled(false);
		buttonPanel.add(nextQuestion);
		
		nextPanel = new JButton("Finish Tutorial");
		nextPanel.setFont(myFont);
		nextPanel.addActionListener(this);
		nextPanel.setEnabled(false);
		buttonPanel.add(nextPanel);
		
		JPanel southComponents = new JPanel();
		southComponents.setLayout(new BorderLayout());
		southComponents.add(answers,BorderLayout.NORTH);
		southComponents.add(buttonPanel, BorderLayout.SOUTH);
		southComponents.setOpaque(false);
		southComponents.setPreferredSize(new Dimension(1500,250));
		add(southComponents, BorderLayout.SOUTH);
	}
	private class MoverLetterButton implements ActionListener
	{
		public MoverLetterButton()
		{
		}
		public void actionPerformed(ActionEvent evt)
		{
			indexLetter+=1;
			if(indexLetter==250)
				indexLetter=0;
			repaint();
			requestFocusInWindow();
		}
	}
	public void paintComponent(Graphics g)
	{
		requestFocusInWindow();
		super.paintComponent(g);
		Image backgroundFight=null;
		String pictName ="refined_medieval_green_rune_background.png";
		try//try
		{
			backgroundFight = ImageIO.read(new File(pictName));
			//set picture as the imageio reading of a new file with the name of pictname
		}
		catch(IOException e)//catch a ioexception e
		{
			System.err.println("\n\n" +pictName+" can't be found.\n\n");
			//tell the user that the file cannot be found
			e.printStackTrace();//print all the errors
		}
		g.drawImage(backgroundFight,0,100,1500,600,this);
		Image wall = null;
		pictName ="wide_brick_wall_texture.png";
		try//try
		{
			wall = ImageIO.read(new File(pictName));
			//set picture as the imageio reading of a new file with the name of pictname
		}
		catch(IOException e)//catch a ioexception e
		{
			System.err.println("\n\n" +pictName+" can't be found.\n\n");
			//tell the user that the file cannot be found
			e.printStackTrace();//print all the errors
		}
		String currentQuestion = data.getQuestion();
		if(indexLetter<=currentQuestion.length())
			questionArea.setText(currentQuestion.substring(0,indexLetter));
		else
			questionArea.setText(currentQuestion);
		g.drawImage(wall,0,0,1500,100,this);
		g.drawImage(wall,0,700,1500,300,this);
		
	}
	public void keyPressed(KeyEvent evt)
    //keyPressed has a parameter of keyevent evt
    {
		//System.out.println("Ds");
        requestFocusInWindow();//request the focus in the window
        int code = evt.getKeyCode();
        //D&I int code as the code value of key pressed
        if(!timerStarted)
        {
			System.out.println("sdfsdfgfsdf");
			timerStarted=true;
			if(code == KeyEvent.VK_RIGHT)
			//if code is the code of space
			{
				character.setMovement(true,"X+");
			}
			else if(code == KeyEvent.VK_UP)
			//else if code is code for up and clicked and color is green
			{
				//character.setMovement(true,"Y-");
			}
			else if(code == KeyEvent.VK_DOWN)
			//else if code is code for up and clicked and color is green
			{
				//character.setMovement(true,"Y+");
			}
			else if(code == KeyEvent.VK_LEFT)
			//else if code is code for up and clicked and color is green
			{
				character.setMovement(true,"X-");
			}
		}
    }
    public void keyTyped(KeyEvent evt)
    //keyTyped has a parameter of keyevent evt
    {}
    public void keyReleased(KeyEvent evt) 
    {
		System.out.println("Sds");
		timerStarted=false;
		character.setMovement(false,"");
	}
    //keyReleased has a parameter of keyevent evt
	public void actionPerformed(ActionEvent evt) 
	{
		String command = evt.getActionCommand();
		
		if(group.getSelection() != null)
		{
			submit.setEnabled(true);
		}
		
		if(command.equals("SUBMIT"))
		{	
			answer[data.getCorrectAnswer()].setBackground(Color.GREEN);
			for(int i = 0; i < answer.length; i++)
			{
				if(answer[i].isSelected())
				{
					if(i != data.getCorrectAnswer())
					{
						playerHealthNo-=10;
						playerHealth.setText("Player Health:"+playerHealthNo);
						answer[i].setBackground(Color.RED);
					}
					else
					{
						bossHealthNo-=10;
						bossHealth.setText("Boss Health:"+bossHealthNo);
						data.addOneToCorrectCount();
					}
				}
			}
			group.clearSelection();
			for(int i = 0; i < answer.length; i++)
			{
				answer[i].setEnabled(false);
			}
			submit.setEnabled(false);
			if(data.getQuestionCount() == 4)
			{
				nextPanel.setEnabled(true);
			}
			else
			{
				nextQuestion.setEnabled(true);
			}
		}
		else if(command.equals("NEXT QUESTION"))
		{
			resetQuestion();
			nextQuestion.setEnabled(false);
		}
		else
		{
		}
	}
	
	public void resetQuestion ( )
	{
//		group.clearSelection();
		data.grabQuestionFromFile();
		questionArea.setText(data.getQuestion());
		answer[0].setText("A. " + data.getAnswer(0));
		answer[1].setText("B. " + data.getAnswer(1));
		answer[2].setText("C. " + data.getAnswer(2));
		answer[3].setText("D. " + data.getAnswer(3));
		for(int i = 0; i < answer.length; i++)
		{
			answer[i].setEnabled(true);
			answer[i].setBackground(new Color(230, 230, 230));
		}
	}
}

class AnimationPanel extends JPanel 
{
	private int characterX;
	private int characterY;
	private int stateCharacter;
	private int wait;
	private Timer moveTime;
	private MoveCharacter moveCharacter;
	public AnimationPanel()
	{
		setBackground(Color.BLUE);
		characterX=100;
		characterY=400;
		wait=0;
		stateCharacter=0;
		requestFocusInWindow();
		moveCharacter = new MoveCharacter(true,"");
		moveTime = new Timer(30,moveCharacter);
	}
	public void setMovement(boolean move, String type)
	{
		moveTime.stop();
		moveCharacter = new MoveCharacter(move,type);
		moveTime = new Timer(30,moveCharacter);
		moveTime.setDelay(30);
		moveTime.start();
	}
	class MoveCharacter implements ActionListener
	{
		private boolean move;
		private String type;
		public  MoveCharacter(boolean moveIn, String typeIn)
		{
			move=moveIn;
			type=typeIn;
		}
		public void actionPerformed(ActionEvent evt)
		{
			if(move)
			{
				stateCharacter=1;
				if(type.equals("X+"))
					characterX+=5;
				else if(type.equals("Y+"))
					characterY+=5;
				else if(type.equals("X-"))
					characterX-=5;
				else if(type.equals("Y-"))
					characterY-=5;
				repaint();
			}
			if(!move)
				stateCharacter=0;
		}
	}
	public void paintComponent(Graphics g)
	{

		if(stateCharacter==0)
		{
			g.setColor(new Color(45, 45, 50));
			int x=characterX;
			int y=characterY;
			int[] bodyX=new int[]{x,x+25,x+75,x+100,x+88,x+75,x+75,x+25,x+25,x+12};
			int[] bodyY = new int[]{y+25,y,y,y+25,y+25,y+15,y+40,y+40,y+15,y+25};
			g.fillPolygon(bodyX, bodyY, 10);
			bodyX = new int[]{x+38, x+50, x+62};
			bodyY = new int[]{y, y+25,y};
			g.setColor(Color.WHITE);
			g.fillPolygon(bodyX, bodyY, 3);
			int[] tieX = new int[]{x+45, x+47, x+50, x+53, x+55};
			int[] tieY = new int[]{y,y+5, y+15, y+5, y};
			g.setColor(Color.RED);
			g.fillPolygon(tieX, tieY, 5);
			g.setColor(new Color(160, 165, 175));
			int[] swordX = new int[]{x+85,x+105,x+105,x+180,x+105, x+105, x+85, x+85, x+80, x+85};
			int[] swordY = new int[]{y+25, y+25, y+20, y+30, y+40, y+35, y+35, y+38, y+30, y+22, y+25};
			g.fillPolygon(swordX, swordY, 10);
			y=y-45;
			g.setColor(Color.GREEN);
			int[] headX = new int[]{x+15, x+35, x+45, x+50, x+55, x+65, x+85, x+65, x+55, x+50, x+45, x+35};
			int[] headY = new int[]{y+15, y+10, y,y-20, y, y+10, y+15, y+20, y+30, y+50, y+30, y+20};
			g.fillPolygon(headX, headY, 12);
			g.setColor(new Color(45, 45, 50));
			int[] legsX = new int[]{x+35, x+35, x+25, x+22, x+20, x+47, x+47, x+45, x+45, x+65, x+65, x+75, x+78, x+80, x+53, x+53,x+55, x+55};
			int[] legsY = new int[]{y+85, y+100,y+100,y+102,y+105,y+105,y+100,y+100,y+85, y+85, y+100,y+100,y+102,y+105,y+105,y+100,y+100, y+85};
			g.fillPolygon(legsX, legsY,18);
			g.drawString("Agent 007 (Sword/Attack)",x, y+120);
		}
		else
		{
			g.setColor(new Color(45, 45, 50));
            int x=characterX;
            int y=characterY;
            int[] bodyX=new int[]{x+25, x+25, x+50, x+50, x+65, x+65, x+50, x+50};
            int[] bodyY = new int[]{y+40,y,y,y+10,y+20,y+30,y+25,y+40};
            g.fillPolygon(bodyX, bodyY, 8);
            g.setColor(new Color(193, 154, 107));
            y=y-45;
            g.setColor(Color.GREEN);
            int[] headX = new int[]{x+35, x+35, x+40, x+40};
            int[] headY = new int[]{y+45,y, y, y+45};
            g.fillPolygon(headX, headY, 4);
            g.setColor(new Color(45, 45, 50));
            int[] legsX = new int[]{x+30, x+30, x+25, x+22,x+20, x+39, x+35, x+32,x+35, x+35, x+45, x+45,x+40,x+37, x+35, x+54, x+50, x+47, x+50, x+50};
            int[] legsY = new int[]{y+85, y+92,y+97,  y+95,y+100,y+110,y+107,y+98,y+97, y+85, y+85, y+92,y+97,  y+95,y+100,y+110,y+107,y+98,y+97, y+85,};
            g.fillPolygon(legsX, legsY,20);
            g.drawString("Agent 007 (Sideways and can fly)",x, y+120);
		}
	}
    
}
class GameData///game data is copy pasted code from game module files 
{
	private String first, last;
	private String question;
	private String [] answerSet;
	private int correctAnswer;
	private boolean [] chosenQuestions;
	private int questionCount;
	private int correctCount, lastGameCorrectCount;
	
	public GameData ( )
	{
		first = "";
		last = "";
		correctCount = 0;
		resetAll();
	}
	
	public void resetAll ( )
	{
		lastGameCorrectCount = correctCount;
		answerSet = new String[4];
		question = "";
		for(int i = 0; i < answerSet.length; i++)
		{
			answerSet[i] = "";
		}
		correctAnswer = -1;
		chosenQuestions = new boolean[30];
		questionCount = correctCount = 0;
	}

	public void grabQuestionFromFile ( )
	{
		Scanner inFile = null;
		String fileName = "computerQuestions.txt";
		File inputFile = new File(fileName);
		try
		{
			inFile = new Scanner(inputFile);
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Cannot open, "+fileName);
			System.out.println(e);
			System.exit(1);
		}
		int questionNumber = (int)(Math.random()*19);
		while(chosenQuestions[questionNumber]==true)
		{
			questionNumber = (int)(Math.random()*19);
		}
		chosenQuestions[questionNumber]=true;
		questionCount++;
		int counter = 0;
		while(inFile.hasNext()&&counter<6*questionNumber)
		{
			String line = inFile.nextLine();
			counter++;
		}
		question = inFile.nextLine();
		counter = 0;
		while(inFile.hasNext()&&counter<4)
		{
			answerSet[counter] = inFile.nextLine();
			counter++;
		}
		correctAnswer = inFile.nextInt();
		inFile.close();
	}
	
	public void setName(String f, String l)
	{
		first = f;
		last = l;
	}
	
	public String getQuestion ( )
	{
		return "" + questionCount + ". " + question;
	}
	
	public String getAnswer(int index)
	{
		return answerSet[index];
	}
	
	public int getCorrectAnswer ( )
	{
		return correctAnswer;
	}
	
	public int getQuestionCount ( )
	{
		return questionCount;
	}
	
	public int getCorrectCount ( )
	{
		return lastGameCorrectCount;
	}
	
	public void addOneToCorrectCount ( )
	{
		correctCount++;
	}
	
	public String toString ( )
	{
		if(lastGameCorrectCount > 2)
		{
			return "Congratulations, " + first + " " + last + ", you answered " + lastGameCorrectCount +
				" out of 4 of the questions correctly.  Your name will be added to the list of high scores, shown to the right.  Good work!";
		}
		return "Good try " + first + " " + last + ", you answered " + lastGameCorrectCount +
			" out of 4 of the questions correctly.  Keep working at it, and maybe next time your name will be added to the list of high scores!";
	}
	
	public String getHighScores ( )
	{
		String result = "";
		String fileName = "highScores.txt";
		Scanner inFile = null;
		File inputFile = new File(fileName);
		try 
		{
			inFile = new Scanner(inputFile);
		} 
		catch(FileNotFoundException e) 
		{
			System.err.printf("ERROR: Cannot open %s\n", fileName);
			System.out.println(e);
			System.exit(1);
		}
		while(inFile.hasNext()) 
		{
			String line = inFile.nextLine();
			result += line + "\n";
		}
		return result;
	}
}



//this class contains the JTextArea for the Terms and Conditions of the game for the reader to read
class TermsAndConditionPanel extends JPanel
//class TermsAndConditionPanel extends JPanel
{
	private ExamKnightHolder ekh;
	//FV ExamKnightHolde ekh
	public TermsAndConditionPanel(ExamKnightHolder ekhIn)
	//constructor of TermsAndCOnditionPanel has a parameter of ExamKnightHolder ekhIn
	{
		ekh=ekhIn;//set ekh as ekhIn
		setLayout(new BorderLayout());
			//set layout as a border layout
		JLabel TCheader = new JLabel("Terms and Conditions");//set TCheader as a new JLabel
        TCheader.setFont(new Font("Lucida Bright",Font.BOLD, 50));
		//set font of TCheader as a serif plain with size 30
		TCheader.setForeground(Color.GREEN);
        //set font of welcome as a welcome of serif plain font of size 20
        JPanel TCheaderHolder = new JPanel();//D&I JPanel TCheaderHolder
        TCheader.setPreferredSize(new Dimension(560,100));
		//set preferred size (dimension) of TCheader with width 300 and height 100
        TCheaderHolder.setLayout(new FlowLayout(FlowLayout.CENTER));
		//set layout of TCheaderHolder as a centered flow layout
        TCheaderHolder.add(TCheader);
		//add TCheader toTCheaderHolder
		TCheaderHolder.setOpaque(false);
        add(TCheaderHolder,BorderLayout.NORTH);//add TCheaderHolder to the north of the panel
        JTextArea details = new JTextArea("Updated Terms and Conditions for ExamKnight"+
		"Effective Date: April 25, 2026\n"+
		"Welcome to ExamKnight, a Math and Biology educational PvP game featuring Robot vs Human battles. By accessing, downloading, or using ExamKnight,"+
		" you agree to the following Terms and Conditions.\n\n\n"+
		"1. Intellectual Property Rights"+
		"ExamKnight, including its name, concept, gameplay systems, Robot vs Human battle    format, designs, graphics, logos, text, code, and all related content, is the exclusive property of Hruday Mulky and    Dhanvin Madhu."+
		"All rights reserved to Hruday Mulky and Dhanvin Madhu."+
		"No person or organization may copy, reproduce, clone, remake, distribute, modify, reverse engineer, or commercially exploit any part of ExamKnight without prior written permission from the owners.\n"+
		"2. Gameplay Description"+
		"ExamKnight is a competitive educational game where players participate in Robot vs Human PvP battles using Math and Biology knowledge, strategy, and quick thinking.\n"+
		"3. User Conduct"+
		"Users agree not to:"+
		"Cheat, exploit bugs, or use hacks.."+
		"Use unauthorized automation or bots."+
		"Attempt to interfere with game systems."+
		"Copy or steal game branding, mechanics, or content."+
		"Misrepresent identity or impersonate others.\n"+
		"4. Educational Content Disclaimer"+
		"ExamKnight is created for learning and entertainment. While we aim for accuracy, some questions or content may occasionally require correction or updates.\n"+
		"5. Biology Section Disclaimer"+
		"You may see some pig parts in the bio section. These materials are shown strictly for educational anatomy and biology purposes.\n"+
		"6. PvP Competition Disclaimer"+
		"ExamKnight includes Robot vs Human competitive gameplay. Match results may depend on speed, skill, subject knowledge, strategy, and connection quality. Wins and rankings are not guaranteed.\n"+
		"7. Account Responsibility"+
		"If user accounts are available, players are responsible for securing their login credentials and account activity.\n"+
		"8. Limitation of Liability"+
		"The creators of ExamKnight are not liable for:"+
		"Loss of progress"+
		"Downtime or maintenance interruptions"+
		"Device compatibility issues"+
		"Internet connection problems"+
		"User misconduct"+
		"Unexpected bugs or balancing changes"+
		"Use of the game is at your own risk.\n"+
		"9. Updates and Modifications"+
		"We may update gameplay, add features, rebalance Robot or Human modes, or revise these Terms at any time.\n"+
		"10. Suspension or Ban"+
		"Users who violate these Terms may have access restricted, suspended, or permanently banned.\n"+
		"11. Ownership Rights"+
		"All rights, ownership, protections, and interests in ExamKnight remain reserved exclusively to Hruday Mulky and Dhanvin Madhu.\n"+
		"12. Contact"+
		"For permissions, licensing, or official matters, contact the owners directly."+
		"By playing ExamKnight, you acknowledge and agree to these Terms and Conditions.");
        //D&I JTextArea details
        JScrollPane paneText = new JScrollPane(details);//D&I JScrollPane paneText on detials
        details.setFont(new Font("serif",Font.PLAIN, 20));//set font of details as a serif plain font with size 20
        details.setLineWrap(true);//set linewrapping of details to true
        details.setWrapStyleWord(true);//set wrapping style as words as true
        details.setEditable(false);//set editing of details as false
        paneText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //set the verticalpolicy of panetext as always
        paneText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //set the horizontalpolicy of panetext as when needed
        paneText.setPreferredSize(new Dimension(1000,600));
		//set the preferred size (dimension) of paneTExt with width 500 and height 300
        JPanel textHolder = new JPanel();//D&I JPanel textHolder
        textHolder.setLayout(new FlowLayout(FlowLayout.CENTER));
		//set layout as a centered flow layout
        textHolder.add(paneText);//add paneText to textHolder
        textHolder.setOpaque(false);
        add(textHolder,BorderLayout.CENTER);//add textHolder to the center of the panel
        MainPageReturnButton mprb = new MainPageReturnButton(ekh,1);
		//create instance of MainPageReturnButton mprb sending in ekh
		mprb.setOpaque(false);
		mprb.setPreferredSize(new Dimension(1500,200));
        add(mprb,BorderLayout.SOUTH);
		//add mprb to the south of the layout

	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Image picture = null;
		try
		{
			picture = ImageIO.read(new File("revised_ancient_wall.png"));
		}
		catch(IOException e)//catch a ioexception e
		{
			System.err.println("\n\n can't be found.\n\n");
			//tell the user that the file cannot be found
			e.printStackTrace();//print all the errors
		}
		g.drawImage(picture,0,0,1500,1000,this);
		
	}
}

//this class contains the return button which will be used in many panels to return to the 
//startpage, the first panel of the card layout
class MainPageReturnButton extends JPanel implements ActionListener
//class MainPageReturnButton extends JPanel and implements ActionListener
{
	private ExamKnightHolder ekh;//FV ExamKnightHolder ekh
	private int typeReturn;
	public MainPageReturnButton(ExamKnightHolder ekhIn, int typeReturnIn)
	//constructor of MainPageReturnButton has a parameter of ExamKnightHolderekhIn
	{
		JLayeredPane pane = new JLayeredPane();
		typeReturn = typeReturnIn;
		String textButton="";
		if(typeReturn==1)
			textButton="Return to the main page";
		else
			textButton="Back";
		GraphicOverride overlay = new GraphicOverride(textButton);
		overlay.setOpaque(false);
		overlay.setBounds(435,00,600,175);
		ekh=ekhIn;//set ekh as ekhIn
		JButton mainReturn;
		if(typeReturn==1)
			mainReturn = new JButton("Return to the main page");
		else
			mainReturn = new JButton("Back");
		//D&I JButton mainReturn 
		mainReturn.setBounds(485,45,510,85);
		//set preferred size (dimension) with width of 400 and height of 75
		setLayout(null);
		//set layout as a centered flow layout
		mainReturn.addActionListener(this);
		//add this panel as an action listener of mainReturn
		pane.setLayout(null);
		pane.setBounds(0, 0, 1500,200);

		pane.add(mainReturn, JLayeredPane.DEFAULT_LAYER);
		pane.add(overlay, JLayeredPane.PALETTE_LAYER);
		add(pane);
	}
	public void actionPerformed(ActionEvent evt)
	//actionPerformed has a parameter of actionevent evt
	{
		if(typeReturn==1)
			ekh.getCardLayout().show(ekh,"Start");
			//uses ekh’s getCardLayout and ekh to show the StartPage
		else if(typeReturn==2)
			ekh.getCardLayout().show(ekh,"LogIn/SignUp");
	}
}

//this class will contain the JTextArea containing the rules for the user to read
class RulesPanel extends JPanel
//class rulesPanel extends JPanel
{
	private ExamKnightHolder ekh;
	//FV ExamKnightHolder ekh
	public RulesPanel(ExamKnightHolder ekhIn)
	//constructor of RulesPanel has a parameter of ExamKnightHolder ekhIn
	{
		ekh=ekhIn;//set ekh as ekhIn
		setLayout(new BorderLayout());
		//set layout as a borderLayout
		JLabel rulesHeader = new JLabel("Rules");//set rulesHeader as a new JLabel with the text Rules 
        rulesHeader.setFont(new Font("Lucida Bright",Font.BOLD, 50));
		//set font of rulesHeader as a plain serif font with size 30
		rulesHeader.setForeground(Color.GREEN);
        JPanel rulesHeaderHolder = new JPanel();
		//D&I JPanel rulesHeaderHolder
        rulesHeaderHolder.setLayout(new FlowLayout(FlowLayout.CENTER));
		//set layout of rulesHeaderHolder as a centered flowlayout
        rulesHeader.setPreferredSize(new Dimension(180,100));
		//set preferred size (dimension) of rulesHeader with width 100 and height 100
        rulesHeaderHolder.add(rulesHeader);//add rulesHeader to rulesHeaderHolder
        rulesHeaderHolder.setOpaque(false);
        add(rulesHeaderHolder,BorderLayout.NORTH);
		//add rulesHeaderHolder to the north of this panel
        JTextArea details = new JTextArea("\t\tExamKnight Rules & How to Play\n"+
		"Welcome to ExamKnight — a Robot vs Human battle game where knowledge becomes your weapon.\n"+
		"Objective:"+
		"Defeat the enemy robot by answering academic questions correctly and reducing its HP to zero before your HP reaches zero.\n"+
		"Game Modes"+
		"Players can choose between:"+
		"Biology Mode – Questions based on biology topics.\n"+
		"Algebra 2 / Trigonometry Mode – Questions based on algebra and trig concepts.\n"+
		"Core Battle Rules1. Correct Answers Deal Damage"+
		"Every correct answer attacks the enemy robot."+
		"2. Speed Increases Damage-"+
		"The faster you answer correctly, the more damage your attack deals.\n"+
		"3. Wrong Answers Have Consequences-"+
		"Incorrect answers give the robot an opportunity to damage you.\n"+
		"4. Higher Levels Increase Difficulty-"+
		"At advanced levels:"+
		"Questions become harder"+
		"The robot attacks at timed intervals"+
		"Battles become faster and more strategic"+
		"Winning Battles"+
		"Defeat the robot to earn:"+
		"Coins"+
		"Progress to harder levels"+
		"Unlock stronger upgrades"+
		"The Shop"+
		"Use coins to buy upgrades such as:"+
		"Better Swords – Increase attack power"+
		"Better Animations – Improve visual effects"+
		"Healing Attacks – Restore some HP while attacking"+
		"Risk Attacks – Deal extra damage while costing some of your own HP"+
		"Cosmetic Items – General appearance upgrades"+
		"Future unlockables and special items"+
		"Health Points (HP)"+
		"Your HP reaches zero = You lose"+
		"Robot HP reaches zero = You win"+
		"Strategy Tips"+
		"Answer quickly but accurately"+
		"Save coins for strong upgrades"+
		"Use healing attacks wisely"+
		"Risk attacks can turn battles around but cost HP"+
		"Progression"+
		"As you improve:"+
		"Enemies get stronger"+
		"Rewards get better"+
		"More shop items unlock"+
		"Greater challenge awaits"+
		"Final Goal"+
		"Become the ultimate ExamKnight Champion by mastering Biology and Math while defeating every robot challenger.");
        //D&I JTextArea details with the text
        JScrollPane paneText = new JScrollPane(details);//D&I JScrollPane paneText on detials
        details.setFont(new Font("serif",Font.PLAIN, 20));//set font of details as a serif plain font with size 20
        details.setLineWrap(true);//set linewrapping of details to true
        details.setWrapStyleWord(true);//set wrapping style as words as true
        details.setEditable(false);//set editing of details as false
        paneText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //set the verticalpolicy of panetext as always
        paneText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //set the horizontalpolicy of panetext as when needed
        paneText.setPreferredSize(new Dimension(750,600));
		//set the preferred size (dimension) of paneText with width 500 and height 300
        JPanel textHolder = new JPanel();
		//D&I JPanel textHolder
        textHolder.setLayout(new FlowLayout(FlowLayout.CENTER));
		//set layout of textHolder as a centered flowLayout
        textHolder.add(paneText);//add paneText to textHolder
        textHolder.setOpaque(false);
        add(textHolder,BorderLayout.CENTER);//add textHolder to thecenter of the panel
        MainPageReturnButton mprb = new MainPageReturnButton(ekh,1);
		//create instance of MainPageReturnButton called mprb, sending in ekh
		mprb.setOpaque(false);
		mprb.setPreferredSize(new Dimension(1500,200));
        add(mprb,BorderLayout.SOUTH);
		//add mprb to the south of the borderlayout
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Image picture = null;
		try
		{
			picture = ImageIO.read(new File("revised_ancient_wall.png"));
		}
		catch(IOException e)//catch a ioexception e
		{
			System.err.println("\n\n can't be found.\n\n");
			//tell the user that the file cannot be found
			e.printStackTrace();//print all the errors
		}
		g.drawImage(picture,0,0,1500,1000,this);
		
	}
}



