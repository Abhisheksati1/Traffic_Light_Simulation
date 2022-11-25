import java.applet.*;
import java.awt.*;
public class AppletMiniProject extends Applet{
	/*public void init(){
	int r=(int)(255*Math.random());
	int gg=(int)(255*Math.random());
	int b=(int)(255*Math.random());
	Color c=new Color(r,gg,b);
	setBackground(c);
	}*/
	public void paint(Graphics g){
	Font f=new Font("Arial",Font.BOLD,50);
	g.setFont(f);
	g.setColor(Color.red);
	g.drawString("TRAFFIC LIGHT STIMULATION",50,80);
	//***************************************************
		
	g.setFont(f);			//First Light
	g.setColor(Color.black);
	g.drawString("1",220,450);
	g.fillRect(200,150,70,250);
	Color grey=new Color(204,204,204);
	g.setColor(grey);
	g.fillOval(202,160,65,65);
	g.fillOval(202,240,65,65);
	g.fillOval(202,320,65,65);
	try{
		Thread.sleep(500);
	}
	catch(Exception e){}
	g.setColor(Color.red);  	
	g.fillOval(202,160,65,65);
	//**********************************************
	
	try{
		Thread.sleep(800);
	}
	catch(Exception e){}
	g.setFont(f);			//Second Light
	g.setColor(Color.black);
	g.drawString("2",370,450);
	g.fillRect(350,150,70,250);
	g.setColor(grey);
	g.fillOval(352,315,65,65);
	g.fillOval(352,160,65,65);
	g.fillOval(352,235,65,65);
	try{
		Thread.sleep(700);
	}
	catch(Exception e){}
	g.setColor(Color.yellow);
	g.fillOval(352,235,65,65);
	//*************************************************
	
	try{
		Thread.sleep(800);
	}
	catch(Exception e){}
	
	g.setFont(f);			//Third Light
	g.setColor(Color.black);
	g.drawString("3",520,450);
	g.fillRect(500,150,70,250);
	g.setColor(grey);		
	g.fillOval(502,160,65,65);
	g.fillOval(502,240,65,65);
	g.fillOval(502,320,65,65);
	Color green=new Color(0,255,51);
	try{
		Thread.sleep(800);
	}
	catch(Exception e){}
	g.setColor(green);
	g.fillOval(502,320,65,65);
//***************************************************
	
	try{
		Thread.sleep(800);
	}
	catch(Exception e){}
	g.setFont(f);			//Fourth Light
	g.setColor(Color.black);
	g.drawString("4",670,450);
	g.fillRect(650,150,70,250);
	g.setColor(grey);		
	g.fillOval(652,160,65,65);
	g.fillOval(652,240,65,65);
	g.fillOval(652,320,65,65);
	try{
		Thread.sleep(900);
	}
	catch(Exception e){}
	g.setColor(Color.yellow);
	g.fillOval(652,240,65,65);
	//***************************************
	
	try{
		Thread.sleep(400);
	}
	catch(Exception e){}
	Font f1=new Font("Arial",Font.ITALIC,25);
	g.setFont(f);
	g.setColor(green);
	
	try{
		Thread.sleep(400);
	}
	catch(Exception e){}
	g.drawString("Java",750,250);
	
	try{
		Thread.sleep(400);
	}
	catch(Exception e){}
	g.drawString("Mini-",750,300);
	
	try{
		Thread.sleep(800);
	}
	catch(Exception e){}
	g.drawString("Project",750,350);
	
	
	try{
		Thread.sleep(2000);
	}
	catch(Exception e){}
	// 		
	}
}

/*
<applet code="AppletMiniProject.class" width=980 height=660>
</applet>
*/


