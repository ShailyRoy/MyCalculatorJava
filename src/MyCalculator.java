
import java.awt.*;  
import java.awt.event.*;  

public class MyCalculator extends Frame  
{  
  
public boolean setClear=true;  
double number, memValue;  
char op;  
  
String digitButtonText[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",".", "0", "sqrt"};  
String operatorButtonText[] = {"+", "-", "*", "/", "%", "1/X", "=","^"};   
String specialButtonText[] = {"Backspc", "C", "CE" };  
  
MyDigitButton digitButton[]=new MyDigitButton[digitButtonText.length];  
MyOperatorButton operatorButton[]=new MyOperatorButton[operatorButtonText.length];   
MySpecialButton specialButton[]=new MySpecialButton[specialButtonText.length];  
  
Label displayLabel=new Label("0",Label.RIGHT);  
Label memLabel=new Label(" ",Label.RIGHT);  
  
final int FRAME_WIDTH=325,FRAME_HEIGHT=330;  
final int HEIGHT=30, WIDTH=30, H_SPACE=10,V_SPACE=10;  
final int TOPX=30, TOPY=50;  


MyCalculator(String frameText)//constructor  
{  
super(frameText);  
  
int tempX=TOPX, y=TOPY;  
displayLabel.setBounds(tempX+15,y,240,HEIGHT);  
displayLabel.setBackground(Color.PINK);  
displayLabel.setForeground(Color.BLACK);  
add(displayLabel);  
  
memLabel.setBounds(TOPX,  TOPY+HEIGHT+ V_SPACE,WIDTH, HEIGHT);  
add(memLabel);  
  
// set Co-ordinates for Memory Buttons  
tempX=TOPX;   
y=TOPY+2*(HEIGHT+V_SPACE);  

/*for(int i=0; i<memoryButton.length; i++)  
{  
memoryButton[i]=new MyMemoryButton(tempX,y,WIDTH,HEIGHT,memoryButtonText[i], this);  
memoryButton[i].setForeground(Color.RED);  
y+=HEIGHT+V_SPACE;  
}  
  
//set Co-ordinates for Special Buttons  */
tempX=TOPX+30; y=TOPY+1*(HEIGHT+V_SPACE); 
for(int i=0;i<specialButton.length;i++)  
{  
specialButton[i]=new MySpecialButton(tempX,y,WIDTH*2,HEIGHT,specialButtonText[i], this);  
specialButton[i].setForeground(Color.BLACK); 
specialButton[i].setBackground(Color.PINK);
tempX=tempX+2*WIDTH+H_SPACE;  
}  
  
//set Co-ordinates for Digit Buttons  
int digitX=TOPX+30;  
int digitY=TOPY+2*(HEIGHT+V_SPACE);  
tempX=digitX;  y=digitY;
int t1=digitX,t2=digitY;
for(int i=0;i<digitButton.length;i++)  
{ 
if(i!=-1) {
digitButton[i]=new MyDigitButton(tempX,y,WIDTH,HEIGHT,digitButtonText[i], this);  
digitButton[i].setForeground(Color.BLACK);
digitButton[i].setBackground(Color.PINK);
}
tempX+=WIDTH+H_SPACE;  

if((i+1)%3==0){tempX=digitX; y+=HEIGHT+V_SPACE;}  
}  
  
//set Co-ordinates for Operator Buttons  
int opsX=digitX+2*(WIDTH+H_SPACE)+H_SPACE;  
int opsY=digitY;  
tempX=opsX;  y=opsY;  
for(int i=0;i<operatorButton.length;i++)  
{  
tempX+=WIDTH+H_SPACE;  
operatorButton[i]=new MyOperatorButton(tempX,y,WIDTH,HEIGHT,operatorButtonText[i], this);  
operatorButton[i].setForeground(Color.BLACK);  
operatorButton[i].setBackground(Color.PINK);
if((i+1)%2==0){tempX=opsX; y+=HEIGHT+V_SPACE;}  
}  
  
addWindowListener(new WindowAdapter()  
{  
public void windowClosing(WindowEvent ev)  
{System.exit(0);}  
});  
  
setLayout(null);  
setSize(FRAME_WIDTH,FRAME_HEIGHT);  
setVisible(true);  
}  
//////////////////////////////////  
static String getFormattedText(double temp)  
{  
String resText=""+temp;  
/*if(resText.lastIndexOf(".0")>0)  
    resText=resText.substring(0,resText.length()-2);  
*/
return resText;  
}  
////////////////////////////////////////  
public static void main(String []args)  
{  
new MyCalculator("Calculator - JavaTpoint");  
}  
}  














