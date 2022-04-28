import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ConversionMenu extends JFrame implements ActionListener
{
	JMenuBar menuBar = new JMenuBar();
	
	JMenu conversionMenu = new JMenu("Conversion");
	JMenu exitMenu = new JMenu("Exit");
	
	JMenuItem toPeso = new JMenuItem("To Peso"); 	// conversion menu items
	JMenuItem toEuro = new JMenuItem("To Euro"); 	// conversion menu items
	JMenuItem toYen = new JMenuItem("To Yen"); 	// conversion menu items
	JMenuItem toPound = new JMenuItem("To Pound"); 	// conversion menu items
        JMenuItem ToDinar = new JMenuItem("To Dinar"); 	// conversion menu items
	JMenuItem toRs = new JMenuItem("To Rs"); 	// conversion menu items
	JMenuItem Totaka = new JMenuItem("To Totaka"); 	// conversion menu items
	JMenuItem toDirham = new JMenuItem("To Dirham"); 	// conversion menu items

	JMenuItem close = new JMenuItem("Close"); 	// exit menu item
	
	JPanel inputPanel = new JPanel(); 	//  input panels
	JPanel outputPanel = new JPanel(); 	//  output panels
	
	JLabel inputLabel = new JLabel("USD: "); 	//  labels
	JLabel outputLabel = new JLabel("Result: "); 	//  labels
	
	JTextField inputTextField = new JTextField(10); 	//  text fields
	JTextField outputTextField = new JTextField(10); 	//  text fields
	
	ConversionMenu()
	{	
		setTitle("Conversion Menu"); 		// title for frame.
		
		setPreferredSize(new Dimension(400, 200)); 		//  preferred size for frame.
		
		setResizable(true); 		// frame not resizable.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		//  frame to exit the program when user hits 'X' button
		
		setLayout(new BorderLayout());
		
		setJMenuBar(menuBar); 		// menu bar for frame to the menu bar
		
		menuBar.add(conversionMenu); 	// menus to menu bar
		menuBar.add(exitMenu); 		//  menus to menu bar
		
		conversionMenu.add(toPeso); 		//  menu items to menus
		conversionMenu.add(toEuro); 		//  menu items to menus
		conversionMenu.add(toYen); 		//  menu items to menus
		conversionMenu.add(toPound);            //  menu items to menus
                conversionMenu.add(ToDinar); 		//  menu items to menus
		conversionMenu.add(toRs); 		//  menu items to menus
		conversionMenu.add(Totaka); 		//  menu items to menus
		conversionMenu.add(toDirham);            //  menu items to menus
                
		exitMenu.add(close);
		
		inputPanel.add(inputLabel); 		//  labels to input panels
		inputPanel.add(inputTextField); 	//  text fields to input panels
		
		outputPanel.add(outputLabel);       //  labels to output panel
		outputPanel.add(outputTextField);  //  text fields to output panels
		
		outputTextField.setEditable(false); 		// output text field not editable
		
		add(inputPanel, BorderLayout.NORTH); 		//  input  panels to content pane
		add(outputPanel, BorderLayout.SOUTH); 		//  output panels to content pane
		
		toPeso.addActionListener(this); 		//  action listeners for menu items
		toEuro.addActionListener(this); 		//  action listeners for menu items
		toYen.addActionListener(this); 	         	//  action listeners for menu items
		toPound.addActionListener(this); 	  
                ToDinar.addActionListener(this); 		//  action listeners for menu items
		toRs.addActionListener(this); 		//  action listeners for menu items
		Totaka.addActionListener(this); 	         	//  action listeners for menu items
		toDirham.addActionListener(this); 
                
		close.addActionListener(this);
	    
	    pack();
	    
 		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 	    // Center frame on the screen.
 		setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2); 	    // Center frame on the screen.
	    
	 	setVisible(true); 	    // frame is displayed.
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		
		if (source == toPeso)
		{
			if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double peso = usd * 20.11; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", peso));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (source == toEuro)
		{
                    if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double Euro = usd * 0.84; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", Euro));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}
	
		}
		else if (source == toYen)
		{
		if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double Yen = usd * 103.86; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", Yen));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}	
		}
                
                else if (source == toPound)
		{
                    if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double Euro = usd * 0.80; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", Euro));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}
	
		}
                
                else if (source == ToDinar)
		{
                    if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double Euro = usd * 1460; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", Euro));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}
	
		}
                
                else if (source == toRs)
		{
                    if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double Euro = usd * 76.47; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", Euro));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}
	
		}
                
                else if (source == Totaka)
		{
                    if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double Euro = usd * 86.54; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", Euro));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}
	
		}

                else if (source == toDirham)
		{
                    if (isNumeric(inputTextField.getText()))
			{
				double usd = Double.parseDouble(inputTextField.getText());
				
				double Euro = usd * 3.67; 				//  conversion
				
				outputTextField.setText(String.format("%.2f", Euro));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "USD must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
			}
	
		}
		else 
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		new ConversionMenu();
	}
	
	public static boolean isNumeric(String string) 	// function for checking if a string is numeric or not
	{
		String numericExpression = "[-+]?\\d*\\.?\\d+";  // regular expression that defines numerics.
		
		return string != null && string.matches(numericExpression);
	}
}
