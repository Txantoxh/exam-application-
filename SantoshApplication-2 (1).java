import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener; // 1st step
import java.awt.event.ActionEvent; //  1st step.
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.File;
import java.util.Scanner;
import  java.io.FileNotFoundException;



public class SantoshApplication extends JFrame implements ActionListener{
   
  private JLabel fullNameLabel,fullNameLabel3,fullNameLabel4,fullNameLabel2, xLabel,yLabel,hobbyLabel,sLabel,gLabel,
    hLabel,fullNameLabel6, eLabel,genderLabel,mLabel,lLabel, fLabel,pLabel,oLabel,kLabel,commentLabel,iLabel;
  private JTextField fullNameTextField, balanceTextField, fullNameTextField2,fullNameTextField3,fullNameTextField4,bTextField2, 
    cTextField,fullNameTextField6,fullNameTextField7, fullNameTextField9;
  private JPanel northPanel, northPanel1, westPanel, westPanel2, centerPanel, eastPanel, centerPanel2, southPanel,eastPanel2;
  private JComboBox stateBox, ageBox;
  private JCheckBox soicalnetworkingBox,freindsBox,lBox,cBox,price, fBox,ieBox,rBox,qBox,yBox;
  private JRadioButton vButton, bButton,morningButton,eveningButton,otherButton,sButton ;
  private ButtonGroup genderGroup;
  private JTextArea commentArea,nArea;
  private JButton pay, printReceipt ;
  private ImageIcon x,f,p;
  
  
  public SantoshApplication (){
    //north
  x = new ImageIcon("k.png");
  xLabel = new JLabel(x);
  fullNameLabel = new JLabel("MatchBox  BAR");
  f = new ImageIcon("i.png");
  fLabel = new JLabel(f);
  northPanel = new JPanel(); 
  northPanel.add(xLabel);
  
  northPanel.add(fullNameLabel);
  northPanel.add(fLabel);
  northPanel.setBackground(Color.WHITE);
  add(northPanel, BorderLayout.NORTH); 
  
 //west
  fullNameLabel = new JLabel("Full Name:");
 fullNameTextField = new JTextField(20);
 
 
 fullNameLabel2 = new JLabel("Date of Birth(month/day/year):");
 fullNameTextField2 = new JTextField(15);
 
 fullNameLabel6 = new JLabel("Address (#APT/State/ZipCode)");
 fullNameTextField6 = new JTextField(15);
 
 fullNameLabel3 = new JLabel("Email Address");
 fullNameTextField3 = new JTextField(15);
 
 gLabel = new JLabel("Phone number:");
cTextField = new JTextField(15);

 
westPanel = new JPanel();
westPanel.add(fullNameLabel);
westPanel.add( fullNameTextField );
  
westPanel.add(gLabel);
westPanel.add(cTextField);
 
westPanel.add(fullNameLabel2);
westPanel.add( fullNameTextField2 );

westPanel.add(fullNameLabel6);
westPanel.add( fullNameTextField6 );
  
westPanel.add(fullNameLabel3);
westPanel.add( fullNameTextField3 );
  

  

  
 hobbyLabel = new JLabel("How did you knew about the company?");
 soicalnetworkingBox=   new JCheckBox("social-networking website");
freindsBox = new JCheckBox("Friends");
 lBox = new JCheckBox("Advertisment");
 fBox = new JCheckBox ("others");
 fullNameTextField7 = new JTextField(15);
 mLabel = new JLabel("(please mention other source.)");

genderLabel = new JLabel("Which shift do you prefer?");
morningButton = new JRadioButton("Morning");
eveningButton = new JRadioButton("Evening");
genderGroup = new ButtonGroup();
genderGroup.add(morningButton);
genderGroup.add(eveningButton);


add(westPanel , BorderLayout.WEST);
 
 
 hLabel = new JLabel("Which location do you prefer to work?");
String stateList [] = {"Select Location", "Tysons Corner", "SpringField ", "Clearndon"};
stateBox = new JComboBox(stateList);
 eLabel = new JLabel("Are you legal to Serve Alcohol.");
String ageList [] = {" Yes ", " No ", "I don't know"};
ageBox = new JComboBox(ageList);

 
  
  westPanel.setLayout(new GridLayout(25,2));
 
  westPanel2 = new JPanel();
  
  westPanel.add(gLabel);
  westPanel.add(cTextField);
  
  westPanel.add(hLabel);
  westPanel.add(stateBox);
  westPanel.add(eLabel);
  westPanel.add(ageBox);

  
  
 

  
 westPanel.add(hobbyLabel);
 westPanel.add(soicalnetworkingBox);
 westPanel.add(freindsBox);
 westPanel.add(lBox);
 westPanel.add(fBox);
 westPanel.add (fullNameTextField7);
 westPanel.add(genderLabel);

 westPanel.add(morningButton);
 westPanel.add(eveningButton);


 

 westPanel2.add(westPanel);
 add(westPanel2, BorderLayout.WEST);
 add(westPanel, BorderLayout.WEST);
 



p = new ImageIcon("e.png");
oLabel = new JLabel(p);
iLabel = new JLabel("Our Brand Statement.");
kLabel = new JLabel( "I promise....." );
ieBox = new JCheckBox (" to keep my restaraunt sparkling clean");
rBox = new JCheckBox  (" to maintain standarad of matchBox.");
yBox = new JCheckBox  (" to respect all my customers.");
qBox = new JCheckBox  (" to wear clean uniforms in my duty.");



centerPanel = new JPanel();
centerPanel.add(oLabel);
centerPanel.add(kLabel);
centerPanel.add(iLabel);
centerPanel.add(kLabel);
centerPanel.add(rBox);
centerPanel.add(ieBox);
centerPanel.add(yBox);
centerPanel.add(qBox);
add(centerPanel, BorderLayout.CENTER);


    commentLabel = new JLabel("Experience:");
    commentArea = new JTextArea(8, 22);
    
    
    eastPanel = new JPanel();
    eastPanel.setLayout(new BorderLayout());
    eastPanel.add(commentLabel, BorderLayout.NORTH);
    eastPanel.add(commentArea, BorderLayout.CENTER);
    

    
    eastPanel2 = new JPanel();
    eastPanel2.add(eastPanel);
    add(eastPanel2, BorderLayout.EAST);

  

pay = new JButton("Submit Application");
pay.addActionListener(this);// Action Listener

printReceipt = new JButton("Clear Application");
printReceipt.addActionListener(this); //Action Listener

southPanel = new JPanel();
southPanel.add(pay);
southPanel.add(printReceipt);
southPanel.setBackground(Color.BLUE);
add(southPanel,BorderLayout.SOUTH);
    
  
  
  

 setVisible(true); 
 setSize(850, 700);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

}
  public void actionPerformed(ActionEvent event) {
    if(event.getSource()== pay){
     String fullname= fullNameTextField.getText();// get the text from the field.
     String dateofbirth=  fullNameTextField2.getText();
     String adddres=  fullNameTextField6.getText();
     String email=  fullNameTextField3.getText();
     String phone=  cTextField.getText();
     String location = stateBox.getSelectedItem().toString();
     String age = ageBox.getSelectedItem().toString();
     String URL = "jdbc:mysql://localhost/matchbox?user=root&password="; // database connected
     
     try{
  Class.forName("com.mysql.jdbc.Driver");
 
  
  Connection con= DriverManager.getConnection(URL);
  String sqlStatement = "insert into santoshapplication values('"+fullname+"','"+dateofbirth+"','"+adddres+"','"+email+"','"+phone+"');";
   // entry in database 
  Statement stmt = con.createStatement();
  stmt.execute(sqlStatement);

  }
  catch(ClassNotFoundException ex){
  ex.printStackTrace();
  
  }
  catch(SQLException ex){
  ex.printStackTrace();
  }
  
      String social = " ";
      if( soicalnetworkingBox.isSelected()){      //17
     social = "social-networking website";
      }
      String friends = " ";
      if( freindsBox.isSelected()){      //17
      friends= "Friends";
      }
       String shift = " "; //18
      if(morningButton.isSelected()){
      shift = "Morning ";
      }
      
      else if(eveningButton.isSelected()){
         shift = "Evening" ;
      }
      try{    
  if(fullname.isEmpty()){
    throw new SantoshException();
        }
     
  else {
      String output = "Please Reiview your document." + //output statement
     "\n * Full Name"+"\n-"+ fullname +
     "\n * Date Of Birth" +"\n-" + dateofbirth +
     "\n* Address" + "\n-"+adddres +
     "\n * Email Address:"+"\n-" + email +
     "\n * Phone number:" +"\n-" +phone +
     "\n * Prefered Location"+ "\n-"+ location +
     "\n * Are you legal to sell Alcohol:"+"\n-" + age +
     "\n * How did you hear from us? " +"\n-" + social+ "\n-" + friends +
      "\n* Which shift do you prefer?"+ "\n-"+  shift ;
       JOptionPane.showMessageDialog(null,output); // out dialog box
    }
      }
  catch (SantoshException ve) { 
   JOptionPane.showMessageDialog(null, ve.getMessage());
  }
  
  
 }
  }
   
public static void main(String [] args) {
SantoshApplication app = new SantoshApplication (); 
 File myfile = new File("data.txt");
 try{
  Scanner reader = new Scanner(myfile);
  while (reader.hasNextLine()){ // open my while loop
  String data = reader.nextLine();
  System.out.print(data);
  }
  reader.close ();
  }
  catch(FileNotFoundException e){
    e.printStackTrace();
   }

  }
 }
   