package application;
	
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException, URISyntaxException {
		Image image=new Image("unnamed.png");
	    Image image1=new Image("download.jpg");
	    ImageView i1=new ImageView(image);
	    i1.setX(120);
	    i1.setY(30);
	    i1.setFitHeight(100);
	    i1.setFitWidth(100);
	    i1.setPreserveRatio(true);
	    
	    ImageView i12=new ImageView(image);
	    i12.setX(500);
	    i12.setY(30);
	    i12.setFitHeight(100);
	    i12.setFitWidth(100);
	    i12.setPreserveRatio(true);
	    ImageView i13=new ImageView(image1);
	    i13.setX(-80);
	    i13.setY(470);
	    i13.setFitHeight(50);
	    i13.setFitWidth(50);
	    i13.setPreserveRatio(true);
		Rectangle rectangle = new Rectangle();
		
		Cylinder c1=new Cylinder();
		c1.setHeight(700);
		c1.setRadius(35);
		c1.setTranslateX(340);
		c1.setTranslateY(650);
		c1.setTranslateZ(600);
		Rotate rot=new Rotate();
		rot.setAngle(90);
		
		c1.getTransforms().addAll(rot);
		
		Rectangle rect2 = new Rectangle();
		Rectangle rect3 = new Rectangle();
		Rectangle rect4 = new Rectangle();
		Rectangle rect5 = new Rectangle();
		Rectangle rect6 = new Rectangle();
		Rectangle rect7 = new Rectangle();
		//Rectangle rect8 = new Rectangle();
		Rectangle packet = new Rectangle();

		Rectangle hpacket = new Rectangle();
		Rectangle tpacket = new Rectangle();
        Rectangle lrect1 = new Rectangle();
        Rectangle lrect2 = new Rectangle();
        Rectangle lrect3 = new Rectangle();
        Rectangle lrect4 = new Rectangle();
        Rectangle lrect5 = new Rectangle();
        Rectangle lrect6 = new Rectangle();
        Rectangle lrect7 = new Rectangle(); 

        rectangle.setX(120.0f);
        rectangle.setY(155.0f);
        rectangle.setWidth(100.0f);
        rectangle.setHeight(25.0f);
        rectangle.setFill(Color.RED);

        rect2.setX(120.0f);
        rect2.setY(205.0f);
        rect2.setWidth(100.0f);
        rect2.setHeight(25.0f);
        rect2.setFill(Color.GREEN);

        rect3.setX(120.0f);
        rect3.setY(255.0f);
        rect3.setWidth(100.0f);
        rect3.setHeight(25.0f);
        rect3.setFill(Color.BLUE);

        rect4.setX(120.0f);
        rect4.setY(305.0f);
        rect4.setWidth(100.0f);;
        rect4.setHeight(25.0f);
        rect4.setFill(Color.YELLOW);

        rect5.setX(120.0f);
        rect5.setY(355.0f);
        rect5.setWidth(100.0f);
        rect5.setHeight(25.0f);
        rect5.setFill(Color.BROWN);

        rect6.setX(120.0f);
        rect6.setY(405.0f);
        rect6.setWidth(100.0f);
        rect6.setHeight(25.0f);
        rect6.setFill(Color.ORANGE);

        rect7.setX(120.0f);
        rect7.setY(455.0f);
        rect7.setWidth(100.0f);
        rect7.setHeight(25.0f);
        rect7.setFill(Color.BLACK);

        packet.setX(80.0f);
        packet.setY(67.0f);
        packet.setWidth(30.0f);
        packet.setHeight(25.0f);
        packet.setFill(Color.LIGHTBLUE);

        hpacket.setX(-60.0f);
        hpacket.setY(460.0f);
        hpacket.setWidth(10.0f);
        hpacket.setHeight(25.0f);
        hpacket.setFill(Color.LIGHTBLUE);

        tpacket.setX(120.0f);
        tpacket.setY(460.0f);
        tpacket.setWidth(10.0f);
        tpacket.setHeight(25.0f);
        tpacket.setFill(Color.BLACK);
        Text text=new Text("Application Layer");
        text.setX(290.0f);
        text.setY(170.0f);
        text.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text2=new Text("Presentation Layer");
        text2.setX(290.0f);
        text2.setY(220.0f);
        text2.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text3=new Text("Session Layer");
        text3.setX(290.0f);
        text3.setY(270.0f);
        text3.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text4=new Text("Transport Layer");
        text4.setX(290.0f);
        text4.setY(320.0f);
        text4.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text5=new Text("Network Layer");
        text5.setX(290.0f);
        text5.setY(370.0f);
        text5.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text6=new Text("Data Link Layer");
        text6.setX(290.0f);
        text6.setY(420.0f);
        text6.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text7=new Text("Physical Link Layer");
        text7.setX(290.0f);
        text7.setY(470.0f);
        text7.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text8=new Text("Physical Link/Medium");
        text8.setX(200.0f);
        text8.setY(630.0f);
        text8.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,30));

        Text text9=new Text("Sender ");
        text9.setX(130.0f);
        text9.setY(20.0f);     
        text9.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        Text text10=new Text("Receiver");
        text10.setX(510.0f);
        text10.setY(20.0f);
        text10.setFont(Font.font("Harlow Solid Italic", FontWeight.BOLD, FontPosture.REGULAR,20));

        lrect1.setX(500.0f);
        lrect1.setY(155.0f);
        lrect1.setWidth(100.0f);
        lrect1.setHeight(25.0f);
        lrect1.setFill(Color.RED);

        lrect2.setX(500.0f);
        lrect2.setY(205.0f);
        lrect2.setWidth(100.0f);
        lrect2.setHeight(25.0f);
        lrect2.setFill(Color.GREEN);

        lrect3.setX(500.0f);
        lrect3.setY(255.0f);
        lrect3.setWidth(100.0f);
        lrect3.setHeight(25.0f);
        lrect3.setFill(Color.BLUE);

        lrect4.setX(500.0f);
        lrect4.setY(305.0f);
        lrect4.setWidth(100.0f);;
        lrect4.setHeight(25.0f);
        lrect4.setFill(Color.YELLOW);

        lrect5.setX(500.0f);
        lrect5.setY(355.0f);
        lrect5.setWidth(100.0f);
        lrect5.setHeight(25.0f);
        lrect5.setFill(Color.BROWN);

        lrect6.setX(500.0f);
        lrect6.setY(405.0f);
        lrect6.setWidth(100.0f);
        lrect6.setHeight(25.0f);
        lrect6.setFill(Color.ORANGE);

        lrect7.setX(500.0f);
        lrect7.setY(455.0f);
        lrect7.setWidth(100.0f);
        lrect7.setHeight(25.0f);
        lrect7.setFill(Color.BLACK);
Path path = new Path(); 
Path path1 = new Path();
Path path2 = new Path();  
Path path3 = new Path();  
Path path4 = new Path();  
Path path5 = new Path();  

Path path6 = new Path();  
Path path7 = new Path();  
Path path8 = new Path(); 

Path path9 = new Path(); 

Path path10 = new Path();  
Path path11 = new Path(); 

Path path12 = new Path(); 
//Moving to the staring point 
MoveTo moveTo1 = new MoveTo(120,67);  

MoveTo moveTo = new MoveTo(40,67);     

MoveTo moveTop = new MoveTo(60,870);   

MoveTo moveTomp = new MoveTo(-60,470);   
MoveTo moveToh = new MoveTo(0,470); 

MoveTo moveToha = new MoveTo(60,480); 
MoveTo moveTot = new MoveTo(90,470); 

MoveTo moveTotl = new MoveTo(60,570); 

MoveTo moveTota = new MoveTo(80,470);  

MoveTo movt = new MoveTo(680,465);  
MoveTo movh = new MoveTo(660,465);  

MoveTo movet = new MoveTo(40,470);  
MoveTo moveh = new MoveTo(60,470);  

MoveTo movep = new MoveTo(80,470);  

MoveTo movlast = new MoveTo(680,465); 
MoveTo movee = new MoveTo(680,465);  
LineTo line1 = new LineTo(40,67);        

//Creating 2nd line 
LineTo line2 = new LineTo(40,167); 

//Creating 3rd line 
LineTo line3 = new LineTo(120,167);  

LineTo line4 = new LineTo(40,167);  
packet.setWidth(50.0f);
packet.setHeight(25.0f);
LineTo line6 = new LineTo(40,220); 

LineTo line7 = new LineTo(120,220); 
LineTo line8 = new LineTo(40,220); 

LineTo line9 = new LineTo(40,270);        

LineTo line10 = new LineTo(120,270); 

LineTo line11 = new LineTo(40,270); 

LineTo line12 = new LineTo(40,320); 

LineTo line13= new LineTo(120,320); 

LineTo line14 = new LineTo(40,320); 

LineTo line15 = new LineTo(40,370); 

LineTo line16 = new LineTo(120,370); 

LineTo line17 = new LineTo(40,370); 

LineTo line18 = new LineTo(40,420); 


LineTo line19 = new LineTo(120,420); 

LineTo line20 = new LineTo(40,420); 

LineTo line21 = new LineTo(40,470); 



LineTo line22 = new LineTo(120,470); 

LineTo line23 = new LineTo(60,470); 

LineTo line23c = new LineTo(60,480); 
LineTo line23a = new LineTo(40,470);
LineTo line23b = new LineTo(80,470);  

LineTo line24a = new LineTo(70,570); 

LineTo line24b = new LineTo(60,570); 
LineTo line24 = new LineTo(40,570); 

LineTo line25 = new LineTo(680,570); 

LineTo line26 = new LineTo(680,465); 

LineTo line27 = new LineTo(600,465); 

LineTo line28 = new LineTo(680,465); 

LineTo line29 = new LineTo(680,415); 

LineTo line30 = new LineTo(600,415); 

LineTo line31 = new LineTo(680,415); 

LineTo line32 = new LineTo(680,365); 

LineTo line33 = new LineTo(600,365); 

LineTo line34 = new LineTo(680,365); 

LineTo line35 = new LineTo(680,315); 

LineTo line36 = new LineTo(600,315); 

LineTo line37 = new LineTo(680,315); 

LineTo line38 = new LineTo(680,265); 

LineTo line39 = new LineTo(600,265); 

LineTo line40 = new LineTo(680,265); 

LineTo line41 = new LineTo(680,215); 
LineTo line42 = new LineTo(600,215); 
LineTo line43 = new LineTo(680,215); 
LineTo line44 = new LineTo(680,165); 
LineTo line45 = new LineTo(600,165); 
LineTo line46 = new LineTo(680,165); 
LineTo line47 = new LineTo(680,67); 
LineTo line48 = new LineTo(600,67);


LineTo lineh = new LineTo(660,465); 
LineTo linep = new LineTo(680,465); 
LineTo linet = new LineTo(700,465);


LineTo linexit = new LineTo(900,465);

path.getElements().add(moveTo); 
path.getElements().addAll(line1,line2,line3,line4,line6,line7,line8,line9,line10,line11,line12,line13,line14,line15,line16,line17,line18,line19,line20,line21,line22,line23);
PathTransition pathTransition1 = new PathTransition(); 
pathTransition1.setDuration(Duration.millis(10000));
pathTransition1.setNode(packet); 
pathTransition1.setPath(path); 
pathTransition1.setOrientation(PathTransition.OrientationType.NONE);
pathTransition1.setCycleCount(00); 

path1.getElements().add(moveToh); 
path1.getElements().addAll(line23a);
PathTransition pathTransition2 = new PathTransition(); 
pathTransition2.setDuration(Duration.millis(1000));
pathTransition2.setNode(hpacket); 
pathTransition2.setPath(path1); 
pathTransition2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
pathTransition2.setCycleCount(00); 



path2.getElements().add(moveTot); 
path2.getElements().addAll(line23b);
PathTransition pathTransition3 = new PathTransition(); 
pathTransition3.setDuration(Duration.millis(1000));
pathTransition3.setNode(tpacket); 
pathTransition3.setPath(path2); 
pathTransition3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
pathTransition3.setCycleCount(00); 

//--------------
path3.getElements().add(moveTota); 
path3.getElements().addAll(line24a);
PathTransition pathTransition4 = new PathTransition(); 
pathTransition4.setDuration(Duration.millis(5000));
pathTransition4.setNode(tpacket); 
pathTransition4.setPath(path3); 
pathTransition4.setOrientation(PathTransition.OrientationType.NONE);
pathTransition4.setCycleCount(00); 


path4.getElements().add(moveTotl); 
path4.getElements().addAll(line24b,line25,line26);
PathTransition pathTransition5 = new PathTransition(); 
pathTransition5.setDuration(Duration.millis(5000));
pathTransition5.setNode(i13); 
pathTransition5.setPath(path4); 
pathTransition5.setOrientation(PathTransition.OrientationType.NONE);
pathTransition5.setCycleCount(00);


path5.getElements().add(moveTomp); 
path5.getElements().addAll(line23c);
PathTransition pathTransition6 = new PathTransition(); 
pathTransition6.setDuration(Duration.millis(1000));
pathTransition6.setNode(i13); 
pathTransition6.setPath(path5); 
pathTransition6.setOrientation(PathTransition.OrientationType.NONE);
pathTransition6.setCycleCount(00);

//-----------------//
path6.getElements().add(moveh); 
path6.getElements().addAll(lineh);
PathTransition pathTransition7 = new PathTransition(); 
pathTransition7.setDuration(Duration.millis(1000));
pathTransition7.setNode(hpacket); 
pathTransition7.setPath(path6); 
pathTransition7.setOrientation(PathTransition.OrientationType.NONE);
pathTransition7.setCycleCount(00);

path7.getElements().add(movep); 
path7.getElements().addAll(linep);
PathTransition pathTransition8 = new PathTransition(); 
pathTransition8.setDuration(Duration.millis(1000));
pathTransition8.setNode(packet); 
pathTransition8.setPath(path7); 
pathTransition8.setOrientation(PathTransition.OrientationType.NONE);
pathTransition8.setCycleCount(00);

path8.getElements().add(movet); 
path8.getElements().addAll(linet);
PathTransition pathTransition9 = new PathTransition(); 
pathTransition9.setDuration(Duration.millis(1000));
pathTransition9.setNode(tpacket); 
pathTransition9.setPath(path8); 
pathTransition9.setOrientation(PathTransition.OrientationType.NONE);
pathTransition9.setCycleCount(00);
//--------------------------//

path9.getElements().add(movee); 
path9.getElements().addAll(linexit);
PathTransition pathTransition10 = new PathTransition(); 
pathTransition10.setDuration(Duration.millis(1000));
pathTransition10.setNode(i13); 
pathTransition10.setPath(path9); 
pathTransition10.setOrientation(PathTransition.OrientationType.NONE);
pathTransition10.setCycleCount(00);
//-------------

path10.getElements().add(movee); 
path10.getElements().addAll(linexit);
PathTransition pathTransition11 = new PathTransition(); 
pathTransition11.setDuration(Duration.millis(1000));
pathTransition11.setNode(hpacket); 
pathTransition11.setPath(path10); 
pathTransition11.setOrientation(PathTransition.OrientationType.NONE);
pathTransition11.setCycleCount(00);

path11.getElements().add(movee); 
path11.getElements().addAll(linexit);
PathTransition pathTransition12 = new PathTransition(); 
pathTransition12.setDuration(Duration.millis(1000));
pathTransition12.setNode(tpacket); 
pathTransition12.setPath(path11); 
pathTransition12.setOrientation(PathTransition.OrientationType.NONE);
pathTransition12.setCycleCount(00);

path12.getElements().add(movlast); 
path12.getElements().addAll(line29,line30,line31,line32,line33,line34,line35,line36,line37,line38,line39,line40,line41,line42,line43,line44,line45,line46,line47,line48);
PathTransition pathTransition13 = new PathTransition(); 
pathTransition13.setDuration(Duration.millis(5000));
pathTransition13.setNode(packet); 
pathTransition13.setPath(path12); 
pathTransition13.setOrientation(PathTransition.OrientationType.NONE);
pathTransition13.setCycleCount(00);
Button playButton = new Button(" Send "); 
playButton.setLayoutX(300); 
playButton.setLayoutY(30); 
Button pauseButton = new Button("Recieve"); 
pauseButton.setLayoutX(370); 
pauseButton.setLayoutY(30); 

Button autton = new Button("add"); 
autton.setLayoutX(370); 
autton.setLayoutY(80); 


Button rutton = new Button("remove"); 
rutton.setLayoutX(300); 
rutton.setLayoutY(80); 
playButton.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() { 
	   @Override 
	   public void handle(javafx.scene.input.MouseEvent e) { 
	      //System.out.println("Hello World"); 
	      packet.setFill(Color.DARKSLATEBLUE); 
          i13.setVisible(false);
	      pathTransition1.play();
	      FadeTransition f=new FadeTransition(Duration.millis(3000),packet);
	      f.play(); 
	      pathTransition1.setOnFinished((e1) ->
	    		  {

	    		      pathTransition2.play();

	    		      pathTransition2.pause();
	    		      pathTransition3.play();
	    			 i13.setVisible(true);
	    		  });  

	

	   }
});
rutton.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() { 
	   @Override 
	   public void handle(javafx.scene.input.MouseEvent e) { 
	      //System.out.println("Hello World"); 
	    //  packet.setFill(Color.DARKSLATEBLUE)


			   packet.setVisible(true);
	           tpacket.setVisible(true);
	           hpacket.setVisible(true);

		      pathTransition10.play(); 

			      pathTransition10.setOnFinished((e1) ->
			    		  {

			    		      pathTransition11.play();
			    		      pathTransition12.play();
			    		  });  
	   }
});
autton.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() { 
	   @Override 
	   public void handle(javafx.scene.input.MouseEvent e) { 
	      //System.out.println("Hello World"); 
	    //  packet.setFill(Color.DARKSLATEBLUE)

		      pathTransition6.play(); 
		   packet.setVisible(true);
           tpacket.setVisible(true);
           hpacket.setVisible(true);

	   }
});
i13.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() { 
	   @Override 
	   public void handle(javafx.scene.input.MouseEvent e) { 
	      //System.out.println("Hello World"); 
	    //  packet.setFill(Color.DARKSLATEBLUE); 
		   
		   packet.setVisible(false);
           tpacket.setVisible(false);
           hpacket.setVisible(false);

		      pathTransition7.play();
		      pathTransition8.play();
		      pathTransition9.play();
		      pathTransition5.play();


	   }
});
pauseButton.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() { 
	   @Override 
	   public void handle(javafx.scene.input.MouseEvent e) { 
	      //System.out.println("Hello World"); 
	    //  packet.setFill(Color.DARKSLATEBLUE); 

		      pathTransition13.play(); 
	   }
});
           PerspectiveCamera cam=new PerspectiveCamera(false);
             cam.setTranslateX(00);
          //   cam.setTranslateY(-50);
             cam.setTranslateZ(00);
			Group root = new Group(playButton,pauseButton,autton,rutton,c1,i1,i12,rectangle,rect2,rect3,rect4,rect5,rect6,rect7,packet,text,text2,text3,text4,text5,text6,text9,text10,text7,text8,lrect1,lrect2,lrect3,lrect4,lrect5,lrect6,lrect7,hpacket,tpacket,i13);
			Scene scene = new Scene(root,800,700);	
			scene.setCamera(cam);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Packet Transmission in OSI Model");
			primaryStage.setScene(scene);
		
			primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
