package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField LU;
	private JTextField Apellido;
	private JTextField Nombre;
	private JTextField Email;
	private JTextField Github;
	private JLabel Foto;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(656, 329));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 11, 430, 245);
		tabInformation = new JPanel();
		tabInformation.setForeground(Color.BLACK);
		tabInformation.setBackground(new Color(128, 128, 128));
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel lblNewLabel = new JLabel("LU:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_4 = new JLabel("Github URL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		LU = new JTextField();
		LU.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LU.setBackground(Color.WHITE);
		LU.setForeground(Color.BLACK);
		LU.setEnabled(false);
		LU.setEditable(false);
		LU.setColumns(10);
		LU.setText(""+studentData.getId());
		
		Apellido = new JTextField();
		Apellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Apellido.setForeground(Color.BLACK);
		Apellido.setBackground(Color.WHITE);
		Apellido.setEnabled(false);
		Apellido.setEditable(false);
		Apellido.setColumns(10);
		Apellido.setText(""+studentData.getLastName());
		
		JLabel lblNewLabel_6 = new JLabel("");
		
		Nombre = new JTextField();
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Nombre.setBackground(Color.WHITE);
		Nombre.setForeground(Color.BLACK);
		Nombre.setEnabled(false);
		Nombre.setEditable(false);
		Nombre.setColumns(10);
		Nombre.setText(""+studentData.getFirstName());
		
		Email = new JTextField();
		Email.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Email.setForeground(Color.BLACK);
		Email.setBackground(Color.WHITE);
		Email.setEnabled(false);
		Email.setEditable(false);
		Email.setColumns(10);
		Email.setText(""+studentData.getMail());
		
		Github = new JTextField();
		Github.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Github.setForeground(new Color(0, 0, 0));
		Github.setBackground(Color.WHITE);
		Github.setEnabled(false);
		Github.setEditable(false);
		Github.setColumns(10);
		Github.setText(""+studentData.getGithubURL());
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(85)
							.addComponent(LU, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(Apellido, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(85)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(85)
							.addComponent(Nombre, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(Email, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(85)
							.addComponent(Github, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(2)
							.addComponent(LU, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(5)
							.addComponent(Apellido, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addGap(9)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(21)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(2)
							.addComponent(Nombre, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(1)
							.addComponent(Email, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
						.addComponent(Github, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		Foto = new JLabel("");
		Foto.setBounds(453, 20, 179, 256);
		Foto.setHorizontalAlignment(SwingConstants.CENTER);
		Foto.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		contentPane.add(Foto);
		
		DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalTime horaActual = LocalTime.now();
		LocalDate fechaActual = LocalDate.now();

		JLabel lblNewLabel_horaFecha = new JLabel(
				"Esta ventana fue generada el " + f.format(fechaActual) + " a las " + h.format(horaActual));
		lblNewLabel_horaFecha.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblNewLabel_horaFecha.setBounds(5, 266, 430, 14);
		contentPane.add(lblNewLabel_horaFecha);
	}
}
