
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import processing.core.*;

public class MyFace extends PApplet implements ActionListener{


	Timer timer;
	final int DELAY=1000;
	boolean eyeClose=false;
	boolean mouth=false;
	public void settings() {
		  size(400, 400);
		}
	public void setup(){
		  size(400,400);
		  timer=new Timer(DELAY, this);
			timer.start();
		 smooth();
		}
		public void draw(){
		  
		
			
		  beginShape();
		  stroke(0);
		  strokeJoin(ROUND);
		  fill(150,250,210);
		  
		  
		  stroke(2);
		  strokeJoin(ROUND);
		  
		  //left
		  vertex(148,200);
		  vertex(148,250);
		  
		  //down
		  curveVertex(150,250);
		  
		  curveVertex(152,265);
		  curveVertex(163,275);
		  curveVertex(180,285);
		  curveVertex(200,290);
		  
		  curveVertex(220,285);
		  curveVertex(237,275);
		  curveVertex(245,265);
		  curveVertex(249,250);
		  
		  //right
		  vertex(251,250);
		  vertex(251,200);
		  //up
		  vertex(240,198);
		  vertex(238,190);
		  vertex(230,189);
		  vertex(215,175);
		  vertex(200,178);
		  vertex(180,180);
		  vertex(170,185);
		  vertex(160,183);
		  
		  endShape(CLOSE);
		  //ear
		  bezier(150,210,130,190,130,250,150,240);
		  bezier(250,210,265,190,265,250,250,240);
		  //bezier(150,210,130,190,130,250,150,240);
		 
		  if (mouth) {
			  //mouth
			  smooth();
			  stroke(109);
			  strokeWeight(1);
			  ellipse(200,265,30,10);
			  strokeWeight(1);
			  line(185,265,215,265);
			  //arc(220,215,80,70,-0.25,0.2);
			  stroke(1);
			  //eeee
			  strokeWeight(4);
			
		}
		  
		  if (!mouth) {
			  smooth();
			  stroke(109);
			  strokeWeight(1);
			  ellipse(200,265,20,5);
			  strokeWeight(1);
			  line(185,265,215,265);
			  //arc(220,215,80,70,-0.25,0.2);
			  stroke(1);
			  //eeee
			  strokeWeight(4);
			  
			
		}
		  
		 
		
		  
		  //eye
		 if (eyeClose) {
			 strokeWeight(1);
			  fill(255);
			  ellipse(177,220,25,8);
			  ellipse(223,220,25,8);
			  fill(0);
			  ellipse(177,220,10,8);
			  ellipse(223,220,10,8);
		}
		 
		 if(!eyeClose){
			 strokeWeight(1);
			  fill(255);
			  ellipse(177,222,25,3);
			  ellipse(223,222,25,3);
			  fill(0);
			  ellipse(177,222,2,2);
			  ellipse(223,222,2,2);
		 }
		  
		  //nose
		  stroke(100);
		  noFill();
		  line(194,226,192,240);
		  //line(206,231,207,240);
		  stroke(50);
		  line(192,240,189,245);
		  line(189,245,189,250);
		  
		  line(189,250,190,251);
		  line(190,251,192,250);
		  line(192,250,194,250);
		  line(194,250,195,251);
		  
		  line(207,241,210,245);
		  line(210,245,210,250);
		  
		  line(210,250,209,251);
		  line(209,251,208,250);
		  line(208,250,206,250);
		  line(206,250,205,251);
		  
		 
		  stroke(0);
		  //hair
		  beginShape();
		  fill(0);
		  //strokeWeight(10);
		  vertex(150,210);
		  curveVertex(130,198);
		  curveVertex(130,190);
		  curveVertex(155,170);
		  curveVertex(169,165);
		  curveVertex(200,166);
		  curveVertex(220,165);
		  //curveVertex(230,140);
		  curveVertex(230,172);
		  curveVertex(245,178);
		  curveVertex(250,179);
		  curveVertex(251,180);
		  curveVertex(253,190);
		  curveVertex(252,190);
		  curveVertex(251,200);
		  
		  vertex(250,210);
		  //vertex(250,204);
		  vertex(240,198);
		  vertex(238,195);
		  vertex(230,195);
		  vertex(220,195);
		  vertex(207,195);
		  //vertex(198,194);
		  vertex(188,198);
		  vertex(162,195);
		  
		  //curveVertex(155,197);
		  
		  
		  endShape();
		  //strokeWeight(1);
		}
		
		
		public static void main(String args[]) {
		    PApplet.main(new String[] { "--present", "com.zetcode.com.MyFace" });
		  }
		@Override
		public void actionPerformed(ActionEvent arg0) {

			if (eyeClose==true) {
				eyeClose=false;
				
			}
			
			else {
				eyeClose=true;
				
			}
			
			

			if (mouth==true) {
				mouth=false;
				
			}
			
			else {
				mouth=true;
				
			}
			
		}

		
	
}
