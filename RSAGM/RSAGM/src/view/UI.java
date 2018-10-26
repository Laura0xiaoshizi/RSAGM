package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.rsaGM;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTabbedPane;


public class UI {

	private JFrame frmRsa;
	private String plain;
    private	static boolean HexFlag = true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frmRsa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRsa = new JFrame();
		frmRsa.setFont(new Font("宋体", Font.PLAIN, 12));
		frmRsa.setResizable(false);
		frmRsa.setTitle("RSA共模攻击工具");
		frmRsa.setIconImage(Toolkit.getDefaultToolkit().getImage(UI.class.getResource("/img/tool_24px.png")));
		frmRsa.setBounds(100, 100, 803, 570);
		frmRsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRsa.getContentPane().setLayout(null);
		
		//JLabel lblE = new JLabel("e1 =");
		JLabel lblE = new JLabel("<html>e<sub>1</sub>=</html>");
		lblE.setFont(new Font("宋体", Font.BOLD, 23));
		lblE.setBounds(39, 73, 52, 35);
		frmRsa.getContentPane().add(lblE);
		
		JScrollPane jsp2=new JScrollPane();
		jsp2.setBounds(436, 72, 195, 45);
		jsp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		frmRsa.getContentPane().add(jsp2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_2.setBounds(436, 72, 195, 45);
		jsp2.setViewportView(textArea_2);
		
		JScrollPane jsp3=new JScrollPane();
		jsp3.setBounds(92, 133, 539, 45);
		jsp3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		frmRsa.getContentPane().add(jsp3);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_3.setBounds(92, 133, 539, 45);
		jsp3.setViewportView(textArea_3);
		
		JLabel lblE_1 = new JLabel("<html>e<sub>2</sub>=</html>");
		lblE_1.setFont(new Font("宋体", Font.BOLD, 23));
		lblE_1.setBounds(384, 73, 52, 35);
		frmRsa.getContentPane().add(lblE_1);
		
		JLabel lblN = new JLabel("<html>n=</html>");
		lblN.setFont(new Font("宋体", Font.BOLD, 23));
		lblN.setBounds(52, 134, 39, 35);
		frmRsa.getContentPane().add(lblN);
		
		JLabel lblM = new JLabel("plain :");
		lblM.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 23));
		lblM.setBounds(14, 347, 98, 27);
		frmRsa.getContentPane().add(lblM);
		
		JScrollPane jsp6=new JScrollPane();
		jsp6.setBounds(14, 387, 769, 89);
		jsp6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frmRsa.getContentPane().add(jsp6);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setLineWrap(true);
		textArea_6.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_6.setBounds(14, 387, 769, 89);
		jsp6.setViewportView(textArea_6);
		
		JScrollPane jsp1=new JScrollPane();
		jsp1.setBounds(90, 72, 195, 45);
		jsp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		frmRsa.getContentPane().add(jsp1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 20));		
		textArea_1.setBounds(90, 72, 195, 45);
		jsp1.setViewportView(textArea_1);
		
		JLabel lblC = new JLabel("<html>C<sub>1</sub>=</html>");
		lblC.setFont(new Font("宋体", Font.BOLD, 23));
		lblC.setBounds(39, 185, 52, 35);
		frmRsa.getContentPane().add(lblC);
		
		JScrollPane jsp4=new JScrollPane();
		jsp4.setBounds(92, 186, 539, 45);
		jsp4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		frmRsa.getContentPane().add(jsp4);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_4.setBounds(92, 186, 539, 45);
		jsp4.setViewportView(textArea_4);
		
		JLabel lblC_1 = new JLabel("<html>C<sub>2</sub>=</html>");
		lblC_1.setFont(new Font("宋体", Font.BOLD, 23));
		lblC_1.setBounds(39, 242, 52, 35);
		frmRsa.getContentPane().add(lblC_1);
		
		JScrollPane jsp5=new JScrollPane();
		jsp5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp5.setBounds(92, 241, 539, 45);
		frmRsa.getContentPane().add(jsp5);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_5.setBounds(92, 241, 539, 45);
		jsp5.setViewportView(textArea_5);
		
		JLabel label = new JLabel("使用16进制计算");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("宋体", Font.BOLD, 14));
		label.setBounds(80, 19, 106, 27);
		frmRsa.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("s =");
		label_1.setFont(new Font("宋体", Font.BOLD, 20));
		label_1.setBounds(14, 496, 33, 27);
		frmRsa.getContentPane().add(label_1);
		
		JScrollPane jsp7=new JScrollPane();
		jsp7.setBounds(52, 489, 160, 35);
		frmRsa.getContentPane().add(jsp7);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textArea_7.setBounds(52, 489, 160, 35);
		jsp7.setViewportView(textArea_7);
		
		JLabel lblT = new JLabel("t =");
		lblT.setFont(new Font("宋体", Font.BOLD, 20));
		lblT.setBounds(219, 496, 33, 27);
		frmRsa.getContentPane().add(lblT);
		
		JScrollPane jsp8=new JScrollPane();
		jsp8.setBounds(255, 489, 160, 35);
		frmRsa.getContentPane().add(jsp8);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textArea_8.setBounds(255, 489, 160, 35);
		jsp8.setViewportView(textArea_8);
		
		JToggleButton toggleButton = new JToggleButton("");
		toggleButton.setBounds(14, 13, 52, 33);
		frmRsa.getContentPane().add(toggleButton);
		toggleButton.setBorderPainted(false);
		toggleButton.setSelectedIcon(new ImageIcon(UI.class.getResource("/img/toggle_on.png")));
		toggleButton.setIcon(new ImageIcon(UI.class.getResource("/img/toggle_off.png")));
		toggleButton.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JToggleButton toggleButton = (JToggleButton)e.getSource();
				if(toggleButton.isSelected()==false) {
					 label.setText("使用16进制计算");		 
					 HexFlag = true;
				}else if (toggleButton.isSelected()==true) {
					label.setText("使用10进制计算");
					 HexFlag = false;		 
					 if (isoctNumber(textArea_1.getText().trim())==false||isoctNumber(textArea_2.getText().trim())==false||isoctNumber(textArea_3.getText().trim())==false||isoctNumber(textArea_4.getText().trim())==false||isoctNumber(textArea_5.getText().trim())==false) {
							JOptionPane.showMessageDialog(null, "只能输入十进制数！", "错误", JOptionPane.ERROR_MESSAGE);
						    return ;
						}
				}
			}
		});
		
		JButton btnNewButton = new JButton("获取明文");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int base = 16;
				String E1 = textArea_1.getText().trim();
				String E2 = textArea_2.getText().trim();
				String N = textArea_3.getText().trim();
				String c1 = textArea_4.getText().trim();
				String c2 = textArea_5.getText().trim();
				if(E1==null ||E1.equals("")) {
					JOptionPane.showMessageDialog(null, "RSA公钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				    return ;
				}
				if(E2==null ||E2.equals("")) {
					JOptionPane.showMessageDialog(null, "RSA公钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				    return ;
				}
				if(N==null ||N.equals("")) {
					JOptionPane.showMessageDialog(null, "模数不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				    return ;
				}
				if(c1==null ||c1.equals("")) {
					JOptionPane.showMessageDialog(null, "密文不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				    return ;
				}
				if(c2==null ||c2.equals("")) {
					JOptionPane.showMessageDialog(null, "密文不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				    return ;
				}
				if (ishexNumber(E1)==false||ishexNumber(E2)==false||ishexNumber(c1)==false||ishexNumber(c2)==false||ishexNumber(N)==false) {
				    JOptionPane.showMessageDialog(null, "只能输入十六进制或十进制数！", "错误", JOptionPane.ERROR_MESSAGE);
					return ;
				}
				
				if(HexFlag==false) {
				   base = 10;
				}		
				rsaGM rsaGM = new rsaGM(E1, E2, c1, c2, N,base);
				plain = rsaGM.RSAgm();
				if(plain.equals("-1")) {
					JOptionPane.showMessageDialog(null, "error!", "错误", JOptionPane.ERROR_MESSAGE);
				    return ;
				}else if (plain.equals("-2")) {
					JOptionPane.showMessageDialog(null, "两个公钥不互质", "错误", JOptionPane.ERROR_MESSAGE);
				    return ;
				}else {
					textArea_6.setText("");
					textArea_7.setText("");
					textArea_8.setText("");
					textArea_6.append(plain);
					BigInteger[] result = rsaGM.extendgcd(rsaGM.getE1(), rsaGM.getE2());
					textArea_7.append(result[1].toString(base));
					textArea_8.append(result[2].toString(base));
				}
				
			}
		});
		btnNewButton.setBounds(317, 315, 162, 59);
		frmRsa.getContentPane().add(btnNewButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("ASCII 字符转换");
		tglbtnNewToggleButton.setBounds(111, 351, 141, 27);
		frmRsa.getContentPane().add(tglbtnNewToggleButton);
		
		
		JLabel label_2 = new JLabel("<html>se<sub>1</sub> + te<sub>2</sub> = 1 mod(n)</html>");
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		label_2.setBounds(429, 489, 263, 35);
		frmRsa.getContentPane().add(label_2);
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JToggleButton tglbtnNewToggleButton = (JToggleButton)e.getSource();
				if(tglbtnNewToggleButton.isSelected()==false) {
					textArea_6.setText("");
					textArea_6.append(plain);
				}else if (tglbtnNewToggleButton.isSelected()==true) {
					String ascplain = "";
					if(HexFlag==true) {
						//BigInteger PLAIN = new BigInteger(plain,16);
						ascplain = hexStr2Str(plain.toUpperCase());
					}else {
						//BigInteger PLAIN = new BigInteger(plain);
						ascplain = octStr2Str(plain.toUpperCase());
					}										
					textArea_6.setText("");
					textArea_6.append(ascplain);
				}
			}
		});
	
	}
	
	private boolean ishexNumber(String str) {
		String regex=String.format("^[A-Fa-f0-9]{%d}$", str.length());
		return str.matches(regex);	
	}
	private boolean isoctNumber(String str) {
		String regex=String.format("^[0-9]{%d}$", str.length());
		return str.matches(regex);	
	}
	
	public String hexStr2Str(String hexStr) {
	    String str = "0123456789ABCDEF";
	    char[] hexs = hexStr.toCharArray();
	    byte[] bytes = new byte[hexStr.length() / 2];
	    int n;
	    for (int i = 0; i < bytes.length; i++) {
	        n = str.indexOf(hexs[2 * i]) * 16;
	        n += str.indexOf(hexs[2 * i + 1]);
	        bytes[i] = (byte) (n & 0xff);
	    }
	    return new String(bytes);
	}
	public String octStr2Str(String octStr) {
	    char[] octs = octStr.toCharArray();
	    byte[] bytes = new byte[octStr.length() / 2];
	    int n;
	    int i=0,j = 0;
	    while (i < octs.length) {
	    	if((octs[i]-'0')==1) {
	    		n = (octs[i]-'0') * 100;
	            n += (octs[i+1]-'0') * 10;
	            n += (octs[i+2]-'0');
	            bytes[j] = (byte) (n & 0xff);
	            i = i + 3;
	    	}else {
	    		n = (octs[i]-'0') * 10;
	            n += (octs[i+1]-'0');
	            bytes[j] = (byte) (n & 0xff);
	            i = i + 2;
	    	}
	    	j+=1;
	    }
	    return new String(bytes);
	}
}
