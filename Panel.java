package interviews;

import com.mysql.jdbc.Statement;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingWorker;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Panel extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String DB_URL,username,password,message,T;
    public Workerdb w;
    public java.sql.Connection connection;
    public String[] array;
    
    DefaultListModel listModel;
    
    public static String selected=null;
    public static int choise;       //selected combo box choise // static for listener // has the choise of combo box
    
    public Panel() {
                     
        try { // Connection to Database
            DB_URL = "jdbc:mysql://db4free.net:3306/saksoo";
            username = "saksoo";
            password = "saksoo3377";
            T = "2000";
 
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, username, password);
            System.out.println("Database connection successful.");
            //Starting Swing Worker update
            w = new Workerdb(Integer.parseInt(T));
            w.execute();
       }
        catch( SQLException  | ClassNotFoundException  e){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database. Please check your internet connection");
            System.exit(EXIT_ON_CLOSE);
        } 
        
        // Initiation of some things
        getids();
        choise = Integer.parseInt(array[0]);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        initComponents();
        updateCombo();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFielddes = new javax.swing.JTextField();
        jTextFieldcity = new javax.swing.JTextField();
        jTextFielddate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listModel = new DefaultListModel();

        for(int i=0;i<array.length; i++){
            listModel.addElement(array[i]);
        }

        //new List with id's from database
        list = new javax.swing.JList(listModel);
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interviews");
        setBackground(new java.awt.Color(204, 102, 0));
        setBounds(new java.awt.Rectangle(380, 90, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Closing_frame(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                oxi_elaxistopoihsh(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                Elaxistopoihsh(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setDoubleBuffered(true);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Interviews Schedule List:");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><body leftmargin=31 topmargin=8 marginwidth=31 marginheight=5>Home</body></html>", jPanel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Description:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("City:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Date:");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel5.setText("Insert a new Interview");

        jTextFielddes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddesActionPerformed(evt);
            }
        });

        jTextFieldcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcityActionPerformed(evt);
            }
        });

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("Show all");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("*** Please fill all the fields !!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton7))
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFielddate)
                        .addComponent(jTextFielddes)
                        .addComponent(jTextFieldcity)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFielddes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFielddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addGap(73, 73, 73)
                .addComponent(jLabel13)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><body leftmargin=31 topmargin=8 marginwidth=31 marginheight=5>Insert</body></html>", jPanel2);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setText("Edit an Interview with specific id");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ID:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Description:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("City:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Date:");

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("Show All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("*** To edit a record select the id of the \nrecord and change what you want.");
        jScrollPane3.setViewportView(jTextArea2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(array));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton3)
                        .addGap(78, 78, 78)
                        .addComponent(jButton6)
                        .addGap(61, 61, 61)
                        .addComponent(jButton9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><body leftmargin=31 topmargin=8 marginwidth=31 marginheight=5>Edit</body></html>", jPanel5);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel6.setText("Delete an Interview");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setText("Show All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        // Set some properties
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);   // lets the list display its data in multiple columns
        list.setVisibleRowCount(-1);
        //Add List Selection Listener
        mylistlistener ll = new mylistlistener() {
        };
        list.addListSelectionListener(ll);
        //Show in Scroll Pane
        jScrollPane4.setViewportView(list);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton8))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><body leftmargin=31 topmargin=8 marginwidth=31 marginheight=5>Delete</body></html>", jPanel3);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(10);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(10);
        jTextArea1.setText("Copyright © 2014 by Saksoo\n\nAll rights reserved. This application or any \nportion thereof may not be reproduced or copied \nin any manner whatsoever without the express \nwritten permission of the developer except for \nthe use of personal use.");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><body leftmargin=33 topmargin=8 marginwidth=33 marginheight=5>About</body></html>", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void Closing_frame(java.awt.event.WindowEvent evt) {                               

        try {
            connection.close();
            System.out.println("Connection closed. ");
            //Closing auto refresh updating swingworker
            System.out.println("Closing auto refresh updating.. ");
            w.cancel(true);
         } catch (SQLException e1) {
            System.out.println("Connection close failed! ");
         }
    }                              

    private void Elaxistopoihsh(java.awt.event.WindowEvent evt) {                                
        w.cancel(true);
    }                               

    private void oxi_elaxistopoihsh(java.awt.event.WindowEvent evt) {                                    
        w = new Workerdb(Integer.parseInt(T));
        w.execute();
    }                                   

    private void jTextFielddesActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jTextFieldcityActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String des;                                                                 ///// //////////////////////// Insert /////////////////
        String city;
        String date;
        int id=0;   //Generated id from sql statement
               
        des = (jTextFielddes.getText());	
        city = (jTextFieldcity.getText());	
        date = (jTextFielddate.getText());	
			
        if (des.length() <=14 ) {   // logw stoixisis
            des = des + "\t";
        }
        if( des.equals("")  || city.equals("") || date.equals("") || des.equals("\t") ) 
            JOptionPane.showMessageDialog(null, "Please insert all the fields");
        else {
            try {
                PreparedStatement s = (PreparedStatement) connection.prepareStatement("INSERT INTO interviews (perigrafi,city,imerominia) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
                s.setString(1, des);
                s.setString(2, city);
                s.setString(3, date);
                int res = s.executeUpdate();          
          
                if(res == 1) {
                    JOptionPane.showMessageDialog(null, "Record inserted!");  
                    //Find id from the last record inserted
                    ResultSet generatedKeys = s.getGeneratedKeys();                           
                    if (generatedKeys.next()) {
                        id = generatedKeys.getInt(1);
                    }
                    
                    // Update List with ids in Delete tab
                    ((DefaultListModel) list.getModel()).addElement(id);
                    //Update Combo box in Edit tab
                    jComboBox1.addItem(Integer.toString(id));
                }
                else JOptionPane.showMessageDialog(null, "An error has occured!");
            } catch (SQLException e) {
                    e.printStackTrace();
            }
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int id;                                                                                 ////// Delete Record from database   /////////////
        try {
            id = Integer.parseInt(selected);
        }
        catch(NumberFormatException e){
            id=0;
            JOptionPane.showMessageDialog(null, "Please select id number!");
            return;
        }
                             
        try{
            String query = "delete from interviews where id = ?";
            PreparedStatement preparedStmt;
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, id);
            
            int result = preparedStmt.executeUpdate();
            
            if(result == 1) {    
                final int index = list.getSelectedIndex();
                //System.out.println(index);
                if (index >= 0) {
                    // Update Combo box and List
                    jComboBox1.removeItem(Integer.toString(id));
                   ((DefaultListModel) list.getModel()).removeElementAt(index); 
                   JOptionPane.showMessageDialog(null, "Interview deleted");
                }  
            }
            else JOptionPane.showMessageDialog(null, "An error has occured!");
        }
        
        catch(SQLException e){    
        } 
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  
        final int id = choise;                                                                            //////   //// Update  ///////////////
              
        String des   = (jTextField2.getText());
        String city  = (jTextField3.getText());
        String date  = (jTextField4.getText());
        
        try {
            String query = "update interviews set perigrafi = ? , imerominia = ? , city = ? where id = ?";
            PreparedStatement preparedStmt;
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, des);
            preparedStmt.setString(2, date);
            preparedStmt.setString(3, city);
            preparedStmt.setInt   (4, id);
            boolean res = preparedStmt.execute(); //only 1 row affected so we use execute() //  not executeUpdate //
            
            if(!res) {
                JOptionPane.showMessageDialog(null, "Record updated!");                            
            }
            else JOptionPane.showMessageDialog(null, "An error has occured!");     
            
        }
        catch (SQLException e) {     
        }   
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextFielddes.setText(null);
        jTextFieldcity.setText(null);
        jTextFielddate.setText(null); 
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       jTextField2.setText(null);
       jTextField3.setText(null);
       jTextField4.setText(null); 
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTabbedPane1.setSelectedIndex(0);
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTabbedPane1.setSelectedIndex(0);
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTabbedPane1.setSelectedIndex(0);
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JComboBox cb = (JComboBox)evt.getSource();
        Panel.choise = Integer.parseInt((String)cb.getSelectedItem());
        //System.out.println(choise);        
        updateCombo();      
    }                                          

    
    
    // Variables declaration - do not modify                     
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldcity;
    private javax.swing.JTextField jTextFielddate;
    private javax.swing.JTextField jTextFielddes;
    private javax.swing.JList list;
    // End of variables declaration                   




boolean updateGUI(){
    try {
        String sql = "SELECT * FROM interviews";
        PreparedStatement pre;
        ResultSet set;
        pre = connection.prepareStatement(sql);
        set = pre.executeQuery();
        
        
        String result = "ID"  + "\t" + "Description/Company" + "\t" + "City" + "\t"  + "Date"  + "\n" + "\n";
        
        while (set.next()) {
            result = result + set.getString("id") + "\t" +set.getString("perigrafi") + "\t" + set.getString("city") + "\t" + set.getString("imerominia") + "\n";
        } 
        
        set.close();
        pre.close();
        area.setText(result);
        
        return true;
    } 
    catch(SQLException e){
        return false;
    } 
}


void getids(){
     try {
            String sql = "SELECT id FROM interviews";
            PreparedStatement pre;
            ResultSet set;
            pre = connection.prepareStatement(sql);
            set = pre.executeQuery();
            List<String> myList = new ArrayList<String>();
            
            while (set.next()) {		
                myList.add(set.getString("id"));
            } 

            set.close();
            pre.close();
           
            array = myList.toArray( new String[ myList.size() ] );

        }
        catch(SQLException e){     
        }
}


void updateCombo(){
    try {
            final int id = choise;
            String sql = "SELECT * FROM interviews where id=?  ";
            PreparedStatement pre;
            ResultSet set;
            pre = connection.prepareStatement(sql);
            pre.setInt(1, id);
            set = pre.executeQuery();

            String perigrafi=null;
            String city=null;
            String imerominia=null;

            while (set.next()) {
                perigrafi = set.getString("perigrafi");               
                city = set.getString("city");               
                imerominia = set.getString("imerominia");         
            } 

            set.close();
            pre.close();
            
            jTextField2.setText(perigrafi);
            jTextField3.setText(city);
            jTextField4.setText(imerominia);    
    } 
    catch(SQLException e){   
    }   
}


class Workerdb extends SwingWorker<Void, Void> {
    private final int T;
		
    public Workerdb(int t) {
        super();
        System.out.println("A new worker has been created ! with T = " + t +"ms");
        T = t;	
    }

    @Override
    public Void doInBackground() throws Exception {
        Thread.sleep(T);
        updateGUI();
        w = new Workerdb(T);
        w.execute();
        System.out.println("Update!");
        return null;	
    }

    @Override
    protected void done() {

    }
	
}

}


class mylistlistener implements ListSelectionListener 
{   
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()){
            JList source = (JList)e.getSource();
            if (source.getSelectedValue() != null) {
                Panel.selected = source.getSelectedValue().toString();
            }
        }
    } 
 }
    
