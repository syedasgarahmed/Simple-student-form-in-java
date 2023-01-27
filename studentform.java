import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class studentform extends JFrame {
    private JLabel categoryLabel, yearLabel, semesterLabel, sub1Label, sub2Label, sub3Label, sub4Label, sub5Label, langLabel;
    private JComboBox categoryChoice, yearChoice, semesterChoice;
    private JTextField sub1Field, sub2Field, sub3Field, sub4Field, sub5Field, langField;
    private JButton submitButton, cancelButton;
	public JLabel nam,fnam,mnam,dobs,cast;
	public JTextField name,fname,mname,dob,caste;
	public JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15;
    public studentform() {
        // Set the layout of the frame
        //setLayout(new GridBagLayout());
        //GridBagConstraints c = new GridBagConstraints();
		//Font  f4  = new Font(Font.DIALOG_INPUT,  Font.BOLD|Font.ITALIC, 25);
		//setFont(f4);
		// Initialize labels
		nam = new JLabel("Name: ");
		nam.setFont(new Font("Arial", Font.BOLD, 18));
		fnam = new JLabel("Father's Name: ");
		fnam.setFont(new Font("Arial", Font.BOLD, 18));
		mnam = new JLabel("Mother Name: ");
		mnam.setFont(new Font("Arial", Font.BOLD, 18));
		dobs = new JLabel("DOB ( DD/MM/YYYY ) :");
		dobs.setFont(new Font("Arial", Font.BOLD, 18));
		cast = new JLabel("Caste: ");    
		cast.setFont(new Font("Arial", Font.BOLD, 18));
        categoryLabel = new JLabel("Category: ");
		categoryLabel.setFont(new Font("Arial", Font.BOLD, 18));
        yearLabel = new JLabel("Year: ");
		yearLabel.setFont(new Font("Arial", Font.BOLD, 18));
        semesterLabel = new JLabel("Semester: ");
		semesterLabel.setFont(new Font("Arial", Font.BOLD, 18));
        sub1Label = new JLabel("Subject 1: ");sub1Label.setFont(new Font("Arial", Font.BOLD, 18));
        sub2Label = new JLabel("Subject 2: ");sub2Label.setFont(new Font("Arial", Font.BOLD, 18));
        sub3Label = new JLabel("Subject 3: ");sub3Label.setFont(new Font("Arial", Font.BOLD, 18));
        sub4Label = new JLabel("Subject 4: ");sub4Label.setFont(new Font("Arial", Font.BOLD, 18));
        sub5Label = new JLabel("Subject 5: ");sub5Label.setFont(new Font("Arial", Font.BOLD, 18));
        langLabel = new JLabel("Languages: ");langLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Initialize choice controls
        String[] categoryValues = {"GM", "SC", "ST", "CAT-1", "2A", "2B", "3A", "3B"};
        categoryChoice = new JComboBox(categoryValues);
        String[] yearValues = {"I", "II", "III"};
        yearChoice = new JComboBox(yearValues);
        String[] semesterValues = {"1","2","3","4","5"};
        semesterChoice = new JComboBox(semesterValues);
		

		// Initialize panels
		p1=new JPanel();
		//p1.setFont(new Font("Segoe Print", Font.BOLD, 12));

		p1.setLayout(new GridLayout(1,2));
		p2=new JPanel();
		p2.setLayout(new GridLayout(1,2));
		p3=new JPanel();
		p3.setLayout(new GridLayout(1,2));
		p4=new JPanel();
		p4.setLayout(new GridLayout(1,2));
		p5=new JPanel();
		p5.setLayout(new GridLayout(1,2));
		p6=new JPanel();
		p6.setLayout(new GridLayout(1,2));
		p7=new JPanel();
		p7.setLayout(new GridLayout(1,2));
		p8=new JPanel();
		p8.setLayout(new GridLayout(1,2));
		p9=new JPanel();
		p9.setLayout(new GridLayout(1,2));
		p10=new JPanel();
		p10.setLayout(new GridLayout(1,2));
		p11=new JPanel();
		p11.setLayout(new GridLayout(1,2));
		p12=new JPanel();
		p12.setLayout(new GridLayout(1,2));
		p13=new JPanel();
		p13.setLayout(new GridLayout(1,2));
		p14=new JPanel();
		p14.setLayout(new GridLayout(1,2));
		p15=new JPanel();
		p15.setLayout(new GridLayout(1,2));
        // Initialize text fields
		Font font1 = new Font("SansSerif", Font.BOLD, 14);
		name = new JTextField(10);	name.setFont(font1);
		fname = new JTextField(10);fname.setFont(font1);
		mname = new JTextField(10);mname.setFont(font1);
		dob = new JTextField(10);dob.setFont(font1);
		caste = new JTextField(10);caste.setFont(font1);

        sub1Field = new JTextField(3); sub1Field.setFont(font1);
        sub2Field = new JTextField(10); sub2Field.setFont(font1);
        sub3Field = new JTextField(10); sub3Field.setFont(font1);
        sub4Field = new JTextField(10); sub4Field.setFont(font1);
        sub5Field = new JTextField(10); sub5Field.setFont(font1);
        langField = new JTextField(10); langField.setFont(font1);
		p10.add(sub1Label);p10.add(sub1Field);
		p11.add(sub2Label);p11.add(sub2Field);
		p12.add(sub3Label);p12.add(sub3Field);
		p13.add(sub4Label);p13.add(sub4Field);
		p14.add(sub5Label);p14.add(sub5Field);
		p15.add(langLabel);p15.add(langField);
		

        // Initialize buttons
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");

        // Add labels and choice controls to the frame
		p1.add(nam);p1.add(name);
		p2.add(fnam);p2.add(fname);
		p3.add(mnam);p3.add(mname);
		p4.add(dobs);p4.add(dob);
		p5.add(cast);p5.add(caste);
		// adding panels
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		//add(p6);
       // c.insets = new Insets(10, 10, 10, 10);
       // c.gridx = 0;
        //c.gridy = 0;
        p6.add(categoryLabel );

       // c.gridx = 1;
       // c.gridy = 0;
       p6.add(categoryChoice );

       // c.gridx = 0;
       // c.gridy = 1;
       p7.add(yearLabel );

       // c.gridx = 1;
       // c.gridy = 1;
        p7.add(yearChoice );

       // c.gridx = 0;
       // c.gridy = 2;
        p8.add(semesterLabel);

       // c.gridx = 1;
       // c.gridy = 2;
        p8.add(semesterChoice);


		add(p6);
		add(p7);
		add(p8);

		p9.add(submitButton);
		p9.add(cancelButton);
		add(p10);
		add(p11);
		add(p12);
		add(p13);
		add(p14);
		add(p15);
		add(p9);
		
// accepting only chracter
	
      sub1Field.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = sub1Field.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               sub1Field.setEditable(true);
               //sub1Field.setText("");
            } else {
               //sub1Field.setEditable(false);
               sub1Field.setText("* Enter only numeric digits(0-9)");
				sub2Field.requestFocus();
            }
         }
      });
	  sub1Field.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
        sub1Field.setText("");
    }

    public void focusLost(FocusEvent e) {
        // nothing
    }
});
//***********************************************************
  sub2Field.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = sub2Field.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               sub2Field.setEditable(true);
               //sub1Field.setText("");
            } else {
               //sub1Field.setEditable(false);
               sub2Field.setText("* Enter only numeric digits(0-9)");
				sub3Field.requestFocus();
            }
         }
      });
	  sub2Field.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
        sub2Field.setText("");
    }

    public void focusLost(FocusEvent e) {
        // nothing
    }
});
//***********************************************************
  sub3Field.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = sub1Field.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               sub3Field.setEditable(true);
               //sub1Field.setText("");
            } else {
               //sub1Field.setEditable(false);
               sub3Field.setText("* Enter only numeric digits(0-9)");
				sub4Field.requestFocus();
            }
         }
      });
	  sub3Field.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
        sub3Field.setText("");
    }

    public void focusLost(FocusEvent e) {
        // nothing
    }
});
//***********************************************************
  sub4Field.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = sub1Field.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               sub4Field.setEditable(true);
               //sub1Field.setText("");
            } else {
               //sub1Field.setEditable(false);
               sub4Field.setText("* Enter only numeric digits(0-9)");
				sub5Field.requestFocus();
            }
         }
      });
	  sub4Field.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
        sub4Field.setText("");
    }

    public void focusLost(FocusEvent e) {
        // nothing
    }
});
//**************************************************************
  sub5Field.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = sub1Field.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               sub5Field.setEditable(true);
               //sub1Field.setText("");
            } else {
               //sub1Field.setEditable(false);
               sub5Field.setText("* Enter only numeric digits(0-9)");
				submitButton.requestFocus();
            }
         }
      });
	  sub5Field.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
        sub5Field.setText("");
    }

    public void focusLost(FocusEvent e) {
        // nothing
    }
});
		//******************************************************************************************

		submitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String sub1 = sub1Field.getText();
            String sub2 = sub2Field.getText();
            String sub3 = sub3Field.getText();
            String sub4 = sub4Field.getText();
            String sub5 = sub5Field.getText();
            String lang = langField.getText();

            if (sub1.equals("") || sub2.equals("") || sub3.equals("") || sub4.equals("") || sub5.equals("") || lang.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            } else {
                int sub1Value = Integer.parseInt(sub1);
                int sub2Value = Integer.parseInt(sub2);
                int sub3Value = Integer.parseInt(sub3);
                int sub4Value = Integer.parseInt(sub4);
                int sub5Value = Integer.parseInt(sub5);
                //int langValue = Integer.parseInt(lang);

                if (sub1Value < 0 || sub1Value > 100 || sub2Value < 0 || sub2Value > 100 || sub3Value < 0 || sub3Value > 100
                        || sub4Value < 0 || sub4Value > 100 || sub5Value < 0 || sub5Value > 100 ) {
                    JOptionPane.showMessageDialog(null, "Values must be between 0 and 100!");
                } else {

                    JOptionPane.showMessageDialog(null, "Submitted!");
					System.exit(0);
                }
            }
        }
    });

    cancelButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
	
	
	  //window listner
	addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent we)
	{
	System.exit(0);
	}
	});
}
	public static void main(String args[])
	{
 studentform g= new studentform();
 g.setSize(800,800);
 g.setVisible(true);
 g.setLayout(new GridLayout(15,1));
 //Font  f4  = new Font(Font.,  Font.BOLD|Font.ITALIC, 25);
 //g.setFont(f4);
	}
}