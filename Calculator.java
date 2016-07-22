package Calculators;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	
	
	double firstnum;
	double secoundnum;
	double result;
    String  operations;
    String answer;
    private JTextField txtDisplay;
    private JTextField textField;
    
   
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
	
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//.................Row 1..................................................
		
		JButton btnBackSpace = new JButton("^");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace= null;
				if(txtDisplay.getText().length()>0){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace= strB.toString();
					txtDisplay.setText(backspace);
				}
			}

			private StringBuilder StringBuilder(String text) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(0, 48, 50, 50);
		contentPane.add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(55, 48, 50, 50);
		contentPane.add(btnClear);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations ="%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercentage.setBounds(108, 48, 64, 50);
		contentPane.add(btnPercentage);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations ="+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(175, 48, 50, 50);
		contentPane.add(btnPlus);
		
		//.................Row 2..................................................
		
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber;
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						EnterNumber  = txtDisplay.getText() + btn7.getText();
					    txtDisplay.setText(EnterNumber);
					    
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn7.setBounds(0, 104, 50, 50);
				contentPane.add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						
						String EnterNumber = txtDisplay.getText() + btn8.getText();
						txtDisplay.setText(EnterNumber);
						
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn8.setBounds(55, 104, 50, 50);
				contentPane.add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn9.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn9.setBounds(115, 104, 50, 50);
				contentPane.add(btn9);
				
				
				
				
				JButton btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations ="-";
					}
				});
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(175, 104, 50, 50);
				contentPane.add(btnSub);
				
				//.................Row 3..................................................
				
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn4.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(0, 160, 50, 50);
				contentPane.add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn5.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(55, 160, 50, 50);
				contentPane.add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn6.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(115, 160, 50, 50);
				contentPane.add(btn6);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations ="*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(175, 160, 50, 50);
				contentPane.add(btnMult);
				
//.................Row 4..................................................
				
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					

					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn1.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(0, 216, 50, 50);
				contentPane.add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn2.getText();;
						txtDisplay.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(55, 216, 50, 50);
				contentPane.add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn3.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(108, 216, 57, 50);
				contentPane.add(btn3);
				
				JButton btnDivide = new JButton("/");
				btnDivide.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations ="/";
					}
				});
				btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDivide.setBounds(175, 216, 50, 50);
				contentPane.add(btnDivide);
				
//.................Row 5..................................................
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						String EnterNumber = txtDisplay.getText() + btn0.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(0, 272, 50, 50);
				contentPane.add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String a= txtDisplay.getText().trim();
						txtDisplay.setText(a);
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations =".";
						
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(55, 272, 50, 50);
				contentPane.add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int ops =Integer.parseInt(String.valueOf(txtDisplay.getText().trim()));
						ops=ops*(-1);
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(108, 272, 64, 50);
				contentPane.add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String answer;
						secoundnum = Double.parseDouble(txtDisplay.getText());
						if(operations == "+")
						{
							result = firstnum + secoundnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "%")
						{
							result = firstnum * secoundnum/100;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "*")
						{
							result = firstnum * secoundnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "/")
						{
							result = firstnum / secoundnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "-")
						{
							result = firstnum - secoundnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						
						
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(175, 272, 50, 50);
				contentPane.add(btnEqual);
				
				txtDisplay = new JTextField();
				txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
				txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
				txtDisplay.setText(" ");
				txtDisplay.setBounds(0, 11, 225, 36);
				contentPane.add(txtDisplay);
				txtDisplay.setColumns(10);
				
				textField = new JTextField();
				textField.setBounds(126, 11, 86, 20);
				contentPane.add(textField);
				textField.setColumns(10);
				
				
				
				
	}
}
