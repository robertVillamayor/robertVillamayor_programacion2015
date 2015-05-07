package widgets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.DebugGraphics;
import java.awt.Dimension;

public class VistaCalendario extends JPanel {

private JTabbedPane tabbedPane;
	
	private JPanel panel_dia, panel_Tareas, panel_Eventos;
	private JDateChooser eligeDia;
	private JLabel nomDia, lblTareas,lblEventos;
	private JCheckBox tarea_1, tarea_2, tarea_3, evento_1, evento_2;
	private JPanel panel_semana, panel_1, panel_2, panel_3, panel_4, panel_5, panel_6, panel_7;
	private JLabel  label_Lun,label_Mar,label_Mier, label_Jue, label_Vie, label_Sab, label_Dom ;
	private JLabel lunes, martes, miercoles, jueves, viernes, sabado, domingo;
	private JLabel lblTareas_1, lblEventos_1;
	private JLabel lema;
	/**
	 * Create the panel.
	 */
	public VistaCalendario() {
		
		setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 800, 400);
		tabbedPane.setBorder(null);
		tabbedPane.setFont(new Font("Segoe Print", Font.BOLD, 18));
		add(tabbedPane);
		
		
		//Pestañas
		
		/*DÍA*/
		panel_dia = new JPanel();
		panel_dia.setOpaque(false);
		panel_dia.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("DÍA", null, panel_dia, null);
		panel_dia.setLayout(null);
		
		eligeDia = new JDateChooser();
		eligeDia.setBounds(394, 11, 178, 34);
		panel_dia.add(eligeDia);
		
		nomDia = new JLabel("Día que sea");
		nomDia.setForeground(Color.WHITE);
		nomDia.setFont(new Font("Segoe Print", Font.BOLD, 18));
		nomDia.setBounds(282, 11, 102, 34);
		panel_dia.add(nomDia);
		
		panel_Tareas = new JPanel();
		panel_Tareas.setOpaque(false);
		panel_Tareas.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel_Tareas.setBounds(71, 56, 288, 284);
		panel_dia.add(panel_Tareas);
		panel_Tareas.setLayout(null);
		
		lblTareas = new JLabel("TAREAS");
		lblTareas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTareas.setBounds(91, 9, 106, 45);
		lblTareas.setForeground(Color.WHITE);
		lblTareas.setFont(new Font("Segoe Print", Font.BOLD, 24));
		panel_Tareas.add(lblTareas);
		
		tarea_1 = new JCheckBox("Castellano: Ejercicios pág. 30");
		tarea_1.setFont(new Font("Segoe Print", Font.BOLD, 12));
		tarea_1.setOpaque(false);
		tarea_1.setBounds(29, 73, 230, 61);
		panel_Tareas.add(tarea_1);
		
		tarea_2 = new JCheckBox("Historia: Leer página 34 ");
		tarea_2.setFont(new Font("Segoe Print", Font.BOLD, 12));
		tarea_2.setOpaque(false);
		tarea_2.setBounds(29, 137, 230, 61);
		panel_Tareas.add(tarea_2);
		
		tarea_3 = new JCheckBox("Comprar cartulina verde");
		tarea_3.setFont(new Font("Segoe Print", Font.BOLD, 12));
		tarea_3.setOpaque(false);
		tarea_3.setBounds(29, 201, 230, 61);
		panel_Tareas.add(tarea_3);
		
		panel_Eventos = new JPanel();
		panel_Eventos.setOpaque(false);
		panel_Eventos.setBorder(new LineBorder(Color.WHITE, 3));
		panel_Eventos.setBounds(423, 56, 288, 284);
		panel_dia.add(panel_Eventos);
		panel_Eventos.setLayout(null);
		
		lblEventos = new JLabel("EVENTOS");
		lblEventos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventos.setBounds(81, 9, 125, 45);
		lblEventos.setForeground(Color.WHITE);
		lblEventos.setFont(new Font("Segoe Print", Font.BOLD, 24));
		panel_Eventos.add(lblEventos);
		
		evento_1 = new JCheckBox("Trabajo Continentes");
		evento_1.setFont(new Font("Segoe Print", Font.BOLD, 12));
		evento_1.setOpaque(false);
		evento_1.setBounds(35, 77, 217, 53);
		panel_Eventos.add(evento_1);
		
		evento_2 = new JCheckBox("Examen oral Inglés");
		evento_2.setFont(new Font("Segoe Print", Font.BOLD, 12));
		evento_2.setOpaque(false);
		evento_2.setBounds(35, 140, 217, 53);
		panel_Eventos.add(evento_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/fondoCalendario.png")));
		lblNewLabel.setBounds(0, 0, 795, 353);
		panel_dia.add(lblNewLabel);
		
		
		
		/*SEMANA*/
		
		panel_semana = new JPanel();
		panel_semana.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("SEMANA", null, panel_semana, null);
		tabbedPane.setFont(new Font("Segoe Print",panel_semana.getFont().getStyle() | Font.BOLD, 18));
		panel_semana.setLayout(null);
		
			//LUNES
		panel_1 = new JPanel();
		panel_1.setBounds(4, 9, 190, 166);
		panel_1.setBorder(null);
		panel_semana.add(panel_1);
		panel_1.setLayout(null);
		
		lunes = new JLabel("");
		lunes.setBounds(0, 0, 190, 60);
		panel_1.add(lunes);
		lunes.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/lunes.png")));
		
		lblTareas_1 = new JLabel("Tareas");
		lblTareas_1.setFont(new Font("Segoe Print", lblTareas_1.getFont().getStyle() | Font.BOLD, 18));
		lblTareas_1.setBounds(27, 58, 72, 24);
		panel_1.add(lblTareas_1);
		
		lblEventos_1 = new JLabel("Eventos");
		lblEventos_1.setFont(new Font("Segoe Print", lblEventos_1.getFont().getStyle() | Font.BOLD, 18));
		lblEventos_1.setBounds(27, 127, 72, 24);
		panel_1.add(lblEventos_1);
		
		label_Lun = new JLabel("");
		label_Lun.setBounds(0, 0, 190, 166);
		panel_1.add(label_Lun);
		label_Lun.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/cajadia1.png")));
		
		
		
			//MARTES
		panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBounds(199, 9, 190, 166);
		panel_semana.add(panel_2);
		panel_2.setLayout(null);
		
		martes = new JLabel("");
		martes.setBounds(0, 0, 190, 60);
		panel_2.add(martes);
		martes.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/martes.png")));
		
		label_Mar = new JLabel("");
		label_Mar.setBounds(0, 0, 190, 166);
		panel_2.add(label_Mar);
		label_Mar.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/cajadia1.png")));
		
		
			//MIERCOLES
		panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBounds(395, 9, 190, 166);
		panel_semana.add(panel_3);
		panel_3.setLayout(null);
		
		miercoles = new JLabel("");
		miercoles.setBounds(0, 0, 190, 60);
		panel_3.add(miercoles);
		miercoles.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/miercoles.png")));
		
		label_Mier = new JLabel("");
		label_Mier.setBounds(0, 0, 190, 166);
		panel_3.add(label_Mier);
		label_Mier.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/cajadia1.png")));
		
		
			//JUEVES
		panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBounds(592, 9, 190, 166);
		panel_semana.add(panel_4);
		panel_4.setLayout(null);
		
		jueves = new JLabel("");
		jueves.setBounds(0, 0, 190, 60);
		panel_4.add(jueves);
		jueves.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/jueves.png")));
		
		label_Jue = new JLabel("");
		label_Jue.setBounds(0, 0, 190, 200);
		panel_4.add(label_Jue);
		label_Jue.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/cajadia1.png")));
		
			//VIERNES
		panel_5 = new JPanel();
		panel_5.setBorder(null);
		panel_5.setBounds(199, 180, 190, 166);
		panel_semana.add(panel_5);
		panel_5.setLayout(null);
		
		viernes = new JLabel("");
		viernes.setBounds(0, 0, 190, 60);
		panel_5.add(viernes);
		viernes.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/viernes.png")));
		
		label_Vie = new JLabel("");
		label_Vie.setBounds(0, 0, 190, 200);
		panel_5.add(label_Vie);
		label_Vie.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/cajadia1.png")));
		
			//SABADO
		panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_6.setBounds(395, 180, 190, 166);
		panel_semana.add(panel_6);
		panel_6.setLayout(null);
		
		sabado = new JLabel("");
		sabado.setBounds(0, 0, 190, 60);
		panel_6.add(sabado);
		sabado.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/sabad.png")));
		
		label_Sab = new JLabel("");
		label_Sab.setBounds(0, 0, 190, 167);
		panel_6.add(label_Sab);
		label_Sab.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/cajadia1.png")));		
		
			//DOMINGO
		panel_7 = new JPanel();
		panel_7.setBorder(null);
		panel_7.setBounds(592, 180, 190, 166);
		panel_semana.add(panel_7);
		panel_7.setLayout(null);
		
		domingo = new JLabel("");
		domingo.setBounds(0, 0, 190, 60);
		panel_7.add(domingo);
		domingo.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/domingo.png")));
		
		label_Dom = new JLabel("");
		label_Dom.setBounds(0, 0, 190, 166);
		panel_7.add(label_Dom);
		label_Dom.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/cajadia1.png")));
		
		lema = new JLabel("");
		lema.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/lemarecto.png")));
		lema.setBounds(0, 205, 194, 121);
		panel_semana.add(lema);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/fondoCalendario.png")));
		lblNewLabel_1.setBounds(0, 0, 795, 353);
		panel_semana.add(lblNewLabel_1);
		
		
		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setSize(new Dimension(15, 0));
		dayChooser.setDecorationBackgroundVisible(false);
		dayChooser.getDayPanel().setBorder(null);
		//dayChooser.setDebugGraphicsOptions(DebugGraphics.FLASH_OPTION);
		dayChooser.getDayPanel().setFont(new Font("Segoe Print", Font.BOLD, 18));
		dayChooser.getDayPanel().setOpaque(false);
		dayChooser.setOpaque(false);
		dayChooser.getDayPanel().setBounds(0, 0, 795, 399);
		dayChooser.setWeekOfYearVisible(true);
		tabbedPane.addTab("MES", null, dayChooser, null);
		dayChooser.setLayout(null);
		

		
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(VistaCalendario.class.getResource("/images/fondoCalendario.png")));
		lblNewLabel_2.setBounds(0, 0, 795, 353);
		dayChooser.add(lblNewLabel_2);
	}
}
