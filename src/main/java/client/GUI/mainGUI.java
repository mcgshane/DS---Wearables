package client.GUI;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smartGlasses.sgBooleanRequest;
import smartGlasses.sgBooleanResponse;
import smartGlasses.sgIntRequest;
import smartGlasses.sgStringResponse;
import smartGlasses.smartGlassesServiceGrpc;
import smartWatch.IntRequest;
import smartWatch.StringRequest;
import smartWatch.StringResponse;
import smartWatch.BooleanRequest;
import smartWatch.BooleanResponse;
import smartWatch.smartWatchServiceGrpc;
import smartWatch.smartWatchServiceGrpc.smartWatchServiceBlockingStub;

public class mainGUI implements ActionListener {

	private JTextField tfSetTimer, reply1;
	private JTextField tfDesVal;
	private JTextField reply2;
	private JTextField entry3, reply3;

	private JPanel getSmartWatchJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JButton swBtnOn = new JButton("Turn On");
		swBtnOn.addActionListener(this);
		swBtnOn.setName("swOn");
		panel.add(swBtnOn);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JButton swBtnOff = new JButton("Turn Off");
		swBtnOff.addActionListener(this);
		swBtnOff.setName("swOff");
		panel.add(swBtnOff);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		tfSetTimer = new JTextField("", 10);
		panel.add(tfSetTimer);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton swBtnSetTimer = new JButton("Set Timer");
		swBtnSetTimer.addActionListener(this);
		swBtnSetTimer.setName("SetTimer");
		panel.add(swBtnSetTimer);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton swBtnStartTimer = new JButton("Start Timer");
		swBtnStartTimer.addActionListener(this);
		swBtnStartTimer.setName("StartTimer");
		panel.add(swBtnStartTimer);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton swBtnStopTimer = new JButton("Stop Timer");
		swBtnStopTimer.addActionListener(this);
		swBtnStopTimer.setName("StopTimer");
		panel.add(swBtnStopTimer);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton swBtnResetTimer = new JButton("Reset Timer");
		swBtnResetTimer.addActionListener(this);
		swBtnResetTimer.setName("ResetTimer");
		panel.add(swBtnResetTimer);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1.setEditable(false);
		panel.add(reply1);

		panel.setLayout(boxlayout);

		return panel; 
	}
	

	  private JPanel getSmartGlassesJPanel() {
	  
	  JPanel panel = new JPanel();
	  
	  BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
	  
	  JButton sgBtnTurnOn = new JButton("Turn On");
	  sgBtnTurnOn.addActionListener(this); 
	  sgBtnTurnOn.setName("GlassesOn");
	  panel.add(sgBtnTurnOn);
	  panel.add(Box.createRigidArea(new Dimension(10, 0)));
	  
	  JButton sgBtnTurnOff = new JButton("Turn Off");
	  sgBtnTurnOff.addActionListener(this); 
	  sgBtnTurnOff.setName("GlassesOff");
	  panel.add(sgBtnTurnOff);
	  panel.add(Box.createRigidArea(new Dimension(10, 0)));
	  
	  tfDesVal = new JTextField("", 10); panel.add(tfDesVal);
	  panel.add(Box.createRigidArea(new Dimension(10, 0)));
	  
	  JButton sgBtnStartJourney = new JButton("Begin");
	  sgBtnStartJourney.addActionListener(this); 
	  sgBtnStartJourney.setName("Begin");
	  panel.add(sgBtnStartJourney);
	  panel.add(Box.createRigidArea(new Dimension(10, 0)));
	  
	  reply2 = new JTextField("", 10);
	  reply2.setEditable(false);
	  panel.add(reply2);
	  
	  panel.setLayout(boxlayout);
	  
	  return panel;
	  
	}
	public static void main(String[] args) {

		mainGUI gui = new mainGUI();

		gui.build();
	}


	private void build() {

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

		panel.add(getSmartWatchJPanel());
		panel.add(getSmartGlassesJPanel());
		

		// Set size for the frame
		frame.setSize(400, 400);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String btnName = button.getName();  
		
		if (btnName.equals("swOn")) {
			System.out.println("Turn on SmartWatch");

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();
			smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
			BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();

			// check the response from the server
			BooleanResponse response = blockingStub.turnOnSwitch(request);

			// print out message depending on the response
			if (response.getBoolRespVal()) {
				System.out.println("Watch has been turned on");
				// response from the serve
				reply1.setText("Watch turned On");
			}
			
			
				
		}else if (btnName.equals("swOff")) {
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();
			smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
			BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(false).build();

			// check the response from the server
			BooleanResponse response = blockingStub.turnOnSwitch(request);

			// print out message depending on the response
			if (!response.getBoolRespVal()) {
				
				System.out.println("Watch has been turned off!");
				reply1.setText("Watch Turned Off");
			}
			
		}else if (btnName.equals("SetTimer")) {
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();
			smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
			//get text from label on scren
			Integer newTime = Integer.parseInt(tfSetTimer.getText());
			IntRequest request = IntRequest.newBuilder().setIntValue(newTime).build();
			
			// check the response from the server
			StringResponse response = blockingStub.setTimer(request);
			
			// print out message depending on the response
			
			reply1.setText(response.getStringRespVal());
		
	}
		
		else if (btnName.equals("StartTimer")) {
			System.out.println("Timer has been started");

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();
			smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
			BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();

			// check the response from the server
			BooleanResponse response = blockingStub.startTimer(request);

			// print out message depending on the response
			if (response.getBoolRespVal()) {
				System.out.println("Timer has Started");
				// response from the serve
				reply1.setText("Timer has started");
			}
			
			
				
		
		
	}else if (btnName.equals("StopTimer")) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();
		smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(false).build();

		// check the response from the server
		BooleanResponse response = blockingStub.startTimer(request);

		// print out message depending on the response
		if (!response.getBoolRespVal()) {
			
			System.out.println("The timer has been stopped");
			reply1.setText("timer Stopped");
		}
		
	}else if (btnName.equals("ResetTimer")) {
		System.out.println("Timer has been reset");

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52025).usePlaintext().build();
		smartWatchServiceGrpc.smartWatchServiceBlockingStub blockingStub = smartWatchServiceGrpc.newBlockingStub(channel);
		BooleanRequest request = BooleanRequest.newBuilder().setBoolValue(true).build();

		// check the response from the server
		BooleanResponse response = blockingStub.resetTimer(request);

		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Timer has been Reset");
			// response from the serve
			reply1.setText("Timer has reset");
		}
	
		
	}
	else if (btnName.equals("GlassesOn")) {
		System.out.println("Turn on Glasses");

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52026).usePlaintext().build();
		smartGlassesServiceGrpc.smartGlassesServiceBlockingStub blockingStub = smartGlassesServiceGrpc.newBlockingStub(channel);
		sgBooleanRequest request = sgBooleanRequest.newBuilder().setBoolVal(true).build();

		// check the response from the server
		sgBooleanResponse response = blockingStub.turnOnGlasses(request);

		// print out message depending on the response
		if (response.getBoolRespVal()) {
			System.out.println("Watch has been turned on");
			// response from the serve
			reply2.setText("Watch turned On");
		}
	}
		else if (btnName.equals("GlassesOff")) {
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52026).usePlaintext().build();
			smartGlassesServiceGrpc.smartGlassesServiceBlockingStub blockingStub = smartGlassesServiceGrpc.newBlockingStub(channel);
			sgBooleanRequest request = sgBooleanRequest.newBuilder().setBoolVal(false).build();

			// check the response from the server
			sgBooleanResponse response = blockingStub.turnOnGlasses(request);

			// print out message depending on the response
			if (!response.getBoolRespVal()) {
				
				System.out.println("Watch has been turned off!");
				reply2.setText("Watch Turned Off");
			}
		
			
		}else if (btnName.equals("Begin")) {
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 52026).usePlaintext().build();
			smartGlassesServiceGrpc.smartGlassesServiceBlockingStub blockingStub = smartGlassesServiceGrpc.newBlockingStub(channel);
			//get text from label on scren
			Integer newDes = Integer.parseInt(tfDesVal.getText());
			sgIntRequest request = sgIntRequest.newBuilder().setIntVal(1).build();
			
			// check the response from the server
			sgBooleanResponse response = blockingStub.setDestination(request);
			
			// print out message depending on the response
			if (response.getBoolRespVal()) {
				System.out.println("Destination has been set ");
			}
			sgBooleanRequest directionRequest = sgBooleanRequest.newBuilder().setBoolVal(true).build();

			Iterator<sgStringResponse> nextTurns;
			//Call to Server with directionRequest
			nextTurns = blockingStub.startJourney(directionRequest);
		     for (int i = 1; nextTurns.hasNext(); i++) {
		    	 sgStringResponse nextTurn = nextTurns.next();
		         System.out.println("Next Direction 1 - " + nextTurn.getStringRespVal() );
		        // reply2.setText("Next Direction 2 - " + nextTurn.getStringRespVal());
		         reply2.setText("");
		         try {
					Thread.sleep(4000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		         reply2.setText("Next Direction 2 - " + String.valueOf(i));
		       }
			
			// print out message depending on the response
			
			//reply2.setText("Arrived at Destination ");
		}
	
	}
}