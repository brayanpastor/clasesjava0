package sistema;

import java.awt.event.*;
import javax.swing.*;


public class Formulario implements ActionListener {
    private final JButton bt1;
    private final JComboBox cb1;
    private final JTextField t1;
    private final JTextField t2;
    private final JLabel jl5; 
    
    public Formulario(){
     JFrame j = new JFrame("Formulario");
     
      /* Definir de Tipo de Distribucion y Tamaño */
      j.setLayout(null);
//      Dimension d = new Dimension();
      
      /*Instancia de los Objetos */
      /*Etiquetas */
      JLabel jl1= new JLabel("Numero A");
      JLabel jl2= new JLabel("Numero B");
      JLabel jl3= new JLabel("Operador");
      JLabel jl4= new JLabel("Resultado");
      jl5= new JLabel("");
      
      /*Cuadro de Texto */
       t1= new JTextField(10);
       t2= new JTextField(10);
      cb1 = new JComboBox();
      
      /*Boton */
       bt1=new JButton("Calcular");
      
       /* Posicion */
       jl1.setBounds(10, 10, 60, 25);
       t1.setBounds(90, 10, 60,25);
       
       jl2.setBounds(10, 40, 60, 25);
       t2.setBounds(90, 40, 60,25);
       
       jl3.setBounds(10, 70, 60, 25);
       cb1.setBounds(90, 70, 100,25);
       
       jl4.setBounds(10, 100, 60, 25);
       jl5.setBounds(90, 100, 80,25);
       
       bt1.setBounds(50, 130, 90, 25);
       bt1.addActionListener(this);
       
      cb1.addItem("Suma");
      cb1.addItem("Resta");
      cb1.addItem("Multiplicación");
      cb1.addItem("Division");
      cb1.addItem("Potencia");
      
      
      /* Añadir */ 
      j.add(jl1);j.add(t1);j.add(jl2);j.add(t2);
      j.add(jl3);j.add(cb1);
      j.add(jl4); j.add(jl5);
      j.add(bt1);
      
      
      j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      j.setResizable(false);
      j.setSize(200,200);
      j.setVisible(true);
    
    }
    
   
    public void actionPerformed(ActionEvent e) {
        int r=0;
        switch (cb1.getSelectedIndex()){
            case 0:
                r=Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                break;
            case 1:
                r=Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                break;
            case 2:
                r=(int) (Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText()));
                break;
            case 3:
                r=(int) (Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText()));
                break;
          }
         jl5.setText(String.valueOf(r));
           
      }
    
    public static void main(String[] args) {
     Formulario f =new Formulario();  
     
      
  
      
   
      }
      
    
    
    }
    