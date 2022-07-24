import java.awt.Canvas;

public class HTree {
	private Canvas c;
	
	public static void main(String[] args) {
		HTree t=new HTree();
		t.drawHTree(600,2);
	}

	
	
	
	public void Rekursion(){
		c=new Canvas(); //Ausrichtung ist bei Neuerstellung nach unten
	}
	
	/*Diese Methode zeichnet einen H-Tree der Tiefe n, vor dem Aufrufen der Methode 
	muss sichergestellt sein,
	dass die Canvas Zeichenrichtung nach unten gerichtet ist. */ 
	public void drawHTree(int size, int n) {
		//TODO.
		this.Rekursion();
		
		/*if(n<=0){
			return;
		}else return
		c.push();//1
		c.rotate(90);//(2)
		c.drawForward(size/2);//3
		c.push();
		c.rotate(90);//4
		c.drawForward(size/2);
		c.push();//5
		drawHTree(size/2, n-1);//***** *
		c.pop();/*** *
		c.pop();
		c.rotate(270);
		c.drawForward(size/2);//13
		c.push();
		drawHTree(size/2, n-1);** *
		c.pop();
		c.pop();
		c.pop();//*** *
		c.push();
		c.rotate(270);
		c.drawForward(size/2);//3
		c.push();
		c.rotate(90);//4
		c.drawForward(size/2);
		c.push();//5
		drawHTree(size/2, n-1);//***** *
		c.pop();/***
		c.pop();
		c.rotate(270);
		c.drawForward(size/2);//13
		c.push();
		drawHTree(size/2, n-1);/** *
		c.pop();
		c.pop();
		c.pop();/*** */
		
		
		if(n<=0){
			return ;
		}
		int hs=size/2;
		//erste H ziechnen
		c.push();
		c.rotate(90);
		c.moveForward(hs);
		c.roate(90);
		c.moveForward(hs);



		c.rotate(180);
		
		drawHTree(hs, n-1);


		c.drawForward(size);
		drawHTree(hs, n-1);


		c.rotate(180);
		c.moveForward(hs);
		c.rotate(90);
		c.drawForward(size);


		c.rotate(90);
		c.moveForward(hs);
		drawHTree(hs, n-1);



		c.rotate(180);
		c.drawForward(size);
		c.rotate(180);
		drawHTree(hs, n-1);



		c.pop();

	
		

		



	 

		






	}
	
	
}
