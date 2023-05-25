//GITHUB TAG

package stickynotes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.util.ArrayList;

public class display_controls implements ActionListener, WindowListener {
	JFrame console = new JFrame("note #n");
	NotesPanel panel = new NotesPanel();
	JTextField title = new JTextField("type something");
	JTextField content = new JTextField("type something");
	notes data = new notes();
	Container north = new Container();
	Container east = new Container();
	Container south = new Container();
	Container west = new Container();
	
	public display_controls(notes stuff) {
		//takes in
		data = stuff;
		title = data.title;
		content = data.content;
		console.setSize(600, 800);
		console.setLayout(new BorderLayout());
		console.add(panel, BorderLayout.CENTER);
		console.add(north, BorderLayout.NORTH);
		console.add(east, BorderLayout.EAST);
		console.add(west, BorderLayout.WEST);
		console.add(south, BorderLayout.SOUTH);
		north.setLayout(new GridLayout(2,1));
		south.setLayout(new GridLayout(1,1));
		north.add(title);
		north.add(content);
		title.addActionListener(this);
		content.addActionListener(this);
		console.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		console.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				exitProcedure();
			}
		});
		console.setVisible(true);
		//when title is updated update title content in note

		//same but for content
	}

	public void exitProcedure() {
		//transfer content to correct thingamabob
		//delete window
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class StickyNotes implements ActionListener, MouseListener, WindowListener {
	//if this your main class make it contain a arraylist of note objects for convinient storage,
	// whenever a note is instantiated, add another object to the arraylist
	//at start of runtime, when prior session notes are retrieveed, they will be stored in this arraylist

	//include an actionlistener for jpanel closed, if user presses x on main jpanel it should call the
	// storeInFiles function from data_management

	//also make sure that if a note panel is deleted the action taken is consistient, eihter it deletes the note
	// from the arraylist as well or it keeps it htere and there is osme way for the user to retrieve the note
	// if you go with option #2, make sure there is a different way for users to delete notes,
	// what exactly that is I leave to your imagination
	
	JFrame console = new JFrame("JNotes Console");
	NotesPanel panel = new NotesPanel();
	JButton addNoteB = new JButton("ADD A NOTE");
	ArrayList<JFrame> notePanels = new ArrayList<JFrame>();
	ArrayList<notes> notes = new ArrayList<notes>();
	JLabel title = new JLabel("JNotes Console");
	//list active notes' titles
	JLabel activeNotes = new JLabel("");
	Container north = new Container();
	Container south = new Container();
	Container body = new Container();
	
	public StickyNotes() {
		console.setSize(600, 800);
		console.setLayout(new BorderLayout());
		console.add(panel, BorderLayout.CENTER);
		north.setLayout(new GridLayout(1,1));
		north.add(addNoteB);
		south.setLayout(new GridLayout(1,1));
		addNoteB.addActionListener(this);
		
		console.add(north, BorderLayout.NORTH);

		console.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		console.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				exitProcedure();
			}
		});
		console.setVisible(true);
	}
	public void exitProcedure() {
		//needs to run sotre notes from data_management
		//needs to quit program and close all active notes
	}
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(addNoteB)) {//When the add note button is pressed
			System.out.println("Hello");
			//Add a new JPanel, put in
		}
		
	}

}
