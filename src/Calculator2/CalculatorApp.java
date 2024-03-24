package Calculator2;


public class CalculatorApp extends javax.swing.JFrame {
    double EnterNum1;
    double EnterNum2;
    double Result;
    String Op;
//    double num,ans;
//    int calculation;
//    public void Operation(){
//        switch(calculation){
//            case 1://add
//                ans = num + Double.parseDouble(Screen.getText());
//                Screen.setText(Double.toHexString(ans));
//            break;   
//            case 2://sub
//                ans = num - Double.parseDouble(Screen.getText());
//                Screen.setText(Double.toHexString(ans));
//            break;
//            case 3://mul
//                ans = num * Double.parseDouble(Screen.getText());
//                Screen.setText(Double.toHexString(ans));
//            break;
//            case 4://div
//                ans = num + Double.parseDouble(Screen.getText());
//                Screen.setText(Double.toHexString(ans));
//            
//        }
//    }
    public CalculatorApp() {
        initComponents();
        
        PowerOnBtn.setEnabled(false);
        
    }
    
    
    public void PowerON(){
        
        PowerOnBtn.setEnabled(false);
        PowerOffBtn.setEnabled(true);
        Screen.setEnabled(true);
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        Button8.setEnabled(true);
        Button9.setEnabled(true);
        ButtonZero.setEnabled(true);
        ButtonAdd.setEnabled(true);
        ButtonSub.setEnabled(true);
        ButtonMultiply.setEnabled(true);
        ButtonDivide.setEnabled(true);
        ButtonSqrt.setEnabled(true);
        ButtonExp.setEnabled(true);
        ButtonC.setEnabled(true);
        ButtonEqual.setEnabled(true);
        ButtonPoint.setEnabled(true);
        Squared.setEnabled(true);
        Cube.setEnabled(true);
        ButtonTan.setEnabled(true);
        BackSpace.setEnabled(true);
         ButtonSin.setEnabled(true);
        ButtonCos.setEnabled(true);
        ButtonLog.setEnabled(true);
        PowerXy.setEnabled(true);
    }
    public void PowerOFF(){
        
        PowerOnBtn.setEnabled(true);
        PowerOffBtn.setEnabled(false);
        Screen.setEnabled(false);
        Button1.setEnabled(false);
        Button2.setEnabled(false);
        Button3.setEnabled(false);
        Button4.setEnabled(false);
        Button5.setEnabled(false);
        Button6.setEnabled(false);
        Button7.setEnabled(false);
        Button8.setEnabled(false);
        Button9.setEnabled(false);
        ButtonZero.setEnabled(false);
        ButtonAdd.setEnabled(false);
        ButtonSub.setEnabled(false);
        ButtonMultiply.setEnabled(false);
        ButtonDivide.setEnabled(false);
        ButtonSqrt.setEnabled(false);
        ButtonExp.setEnabled(false);
        ButtonC.setEnabled(false);
        ButtonEqual.setEnabled(false);
        ButtonPoint.setEnabled(false);
        Squared.setEnabled(false);
        Cube.setEnabled(false);
        ButtonTan.setEnabled(false);
        BackSpace.setEnabled(false);
        ButtonSin.setEnabled(false);
        ButtonCos.setEnabled(false);
        ButtonLog.setEnabled(false);
        PowerXy.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Screen = new javax.swing.JTextField();
        PowerOnBtn = new javax.swing.JRadioButton();
        PowerOffBtn = new javax.swing.JRadioButton();
        BackSpace = new javax.swing.JButton();
        Squared = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButtonExp = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        ButtonSqrt = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        ButtonZero = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        ButtonPoint = new javax.swing.JButton();
        Cube = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonEqual = new javax.swing.JButton();
        ButtonSub = new javax.swing.JButton();
        ButtonMultiply = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        ButtonDivide = new javax.swing.JButton();
        ButtonCos = new javax.swing.JButton();
        ButtonSin = new javax.swing.JButton();
        ButtonTan = new javax.swing.JButton();
        ButtonLog = new javax.swing.JButton();
        PowerXy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Calculator");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(30, 30, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Screen.setBackground(new java.awt.Color(0, 0, 0));
        Screen.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        Screen.setForeground(new java.awt.Color(0, 204, 0));
        Screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(PowerOnBtn);
        PowerOnBtn.setText("Power On");
        PowerOnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerOnBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(PowerOffBtn);
        PowerOffBtn.setText("Power Off");
        PowerOffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerOffBtnActionPerformed(evt);
            }
        });

        BackSpace.setBackground(new java.awt.Color(255, 0, 0));
        BackSpace.setForeground(new java.awt.Color(0, 0, 0));
        BackSpace.setText("⌫");
        BackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpaceActionPerformed(evt);
            }
        });

        Squared.setBackground(new java.awt.Color(0, 0, 0));
        Squared.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Squared.setForeground(new java.awt.Color(255, 255, 255));
        Squared.setText("^2");
        Squared.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquaredActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ASOS                                CAL 1000R");

        ButtonExp.setBackground(new java.awt.Color(0, 0, 0));
        ButtonExp.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonExp.setForeground(new java.awt.Color(255, 255, 255));
        ButtonExp.setText("EXP");
        buttonGroup2.add(ButtonExp);
        ButtonExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExpActionPerformed(evt);
            }
        });

        ButtonC.setBackground(new java.awt.Color(0, 0, 0));
        ButtonC.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonC.setForeground(new java.awt.Color(255, 255, 255));
        ButtonC.setText("C");
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });

        ButtonSqrt.setBackground(new java.awt.Color(0, 0, 0));
        ButtonSqrt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonSqrt.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSqrt.setText("√");
        buttonGroup2.add(ButtonSqrt);
        ButtonSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSqrtActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(0, 0, 0));
        Button4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("4");
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(0, 0, 0));
        Button1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setText("1");
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        ButtonZero.setBackground(new java.awt.Color(0, 0, 0));
        ButtonZero.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonZero.setForeground(new java.awt.Color(255, 255, 255));
        ButtonZero.setText("0");
        ButtonZero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZeroActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(0, 0, 0));
        Button5.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("5");
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(0, 0, 0));
        Button2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("2");
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        ButtonPoint.setBackground(new java.awt.Color(0, 0, 0));
        ButtonPoint.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonPoint.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPoint.setText(".");
        ButtonPoint.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPointActionPerformed(evt);
            }
        });

        Cube.setBackground(new java.awt.Color(0, 0, 0));
        Cube.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Cube.setForeground(new java.awt.Color(255, 255, 255));
        Cube.setText("^3");
        Cube.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CubeActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(0, 0, 0));
        Button6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("6");
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(0, 0, 0));
        Button3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("3");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        ButtonEqual.setBackground(new java.awt.Color(0, 0, 0));
        ButtonEqual.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonEqual.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEqual.setText("=");
        ButtonEqual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualActionPerformed(evt);
            }
        });

        ButtonSub.setBackground(new java.awt.Color(0, 0, 0));
        ButtonSub.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonSub.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSub.setText("-");
        ButtonSub.setToolTipText("");
        ButtonSub.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubActionPerformed(evt);
            }
        });

        ButtonMultiply.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMultiply.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonMultiply.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMultiply.setText("*");
        ButtonMultiply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiplyActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(0, 0, 0));
        Button9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setText("9");
        Button9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        ButtonAdd.setBackground(new java.awt.Color(0, 0, 0));
        ButtonAdd.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAdd.setText("+");
        ButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(0, 0, 0));
        Button7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("7");
        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(0, 0, 0));
        Button8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("8");
        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        ButtonDivide.setBackground(new java.awt.Color(0, 0, 0));
        ButtonDivide.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonDivide.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDivide.setText("/");
        ButtonDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivideActionPerformed(evt);
            }
        });

        ButtonCos.setBackground(new java.awt.Color(0, 0, 0));
        ButtonCos.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonCos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCos.setText("COS");
        ButtonCos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCosActionPerformed(evt);
            }
        });

        ButtonSin.setBackground(new java.awt.Color(0, 0, 0));
        ButtonSin.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonSin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSin.setText("SIN");
        ButtonSin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSinActionPerformed(evt);
            }
        });

        ButtonTan.setBackground(new java.awt.Color(0, 0, 0));
        ButtonTan.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonTan.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTan.setText("TAN");
        ButtonTan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTanActionPerformed(evt);
            }
        });

        ButtonLog.setBackground(new java.awt.Color(0, 0, 0));
        ButtonLog.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ButtonLog.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLog.setText("LOG");
        ButtonLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogActionPerformed(evt);
            }
        });

        PowerXy.setBackground(new java.awt.Color(0, 0, 0));
        PowerXy.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        PowerXy.setForeground(new java.awt.Color(255, 255, 255));
        PowerXy.setText("x^y");
        PowerXy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PowerXy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerXyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(ButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ButtonSin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(ButtonCos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ButtonTan, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(PowerOnBtn)
                                .addGap(6, 6, 6)
                                .addComponent(PowerOffBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ButtonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Squared, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cube, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ButtonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonExp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PowerXy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PowerOnBtn)
                    .addComponent(PowerOffBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButtonExp, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(ButtonLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Squared, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cube, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PowerXy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonSin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ButtonCos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonTan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void BackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackSpaceActionPerformed
        int length = Screen.getText().length();
        int num = Screen.getText().length()- 1;
        String storeval;
        
        if(length > 0){
            StringBuilder bck = new StringBuilder(Screen.getText());
            bck.deleteCharAt(num);
            storeval = bck.toString();
            Screen.setText(storeval);
        }
        
    }//GEN-LAST:event_BackSpaceActionPerformed
    private void Numbers(String q){
        String num = Screen.getText() + q;
        Screen.setText(num);
    }

    private void ButtonExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExpActionPerformed
        double t = Math.exp(Double.parseDouble(Screen.getText()));
        Screen.setText("");
        Screen.setText(Screen.getText()+t);
    }//GEN-LAST:event_ButtonExpActionPerformed

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        Screen.setText(" ");
    }//GEN-LAST:event_ButtonCActionPerformed

    private void ButtonSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSqrtActionPerformed
        double t = Math.sqrt(Double.parseDouble(Screen.getText()));
        Screen.setText("");
        Screen.setText(Screen.getText()+t);                       
    }//GEN-LAST:event_ButtonSqrtActionPerformed

    private void ButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZeroActionPerformed
        Numbers("0");
    }//GEN-LAST:event_ButtonZeroActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        Numbers("1");
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        Numbers("2");
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        Numbers("3");
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Numbers("4");
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        Numbers("5");
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        Numbers("6");
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        Numbers("7");
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        Numbers("8");
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        Numbers("9");
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPointActionPerformed
        if (! Screen.getText().contains(".")){
            Screen.setText(Screen.getText() + ButtonPoint.getText());
        }
    }//GEN-LAST:event_ButtonPointActionPerformed

    private void ButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiplyActionPerformed
        EnterNum1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        Op = "*";
    }//GEN-LAST:event_ButtonMultiplyActionPerformed

    private void ButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubActionPerformed
        EnterNum1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        Op = "-";
    }//GEN-LAST:event_ButtonSubActionPerformed

    private void PowerOffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerOffBtnActionPerformed
        PowerOFF();
    }//GEN-LAST:event_PowerOffBtnActionPerformed

    private void PowerOnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerOnBtnActionPerformed
        PowerON();
    }//GEN-LAST:event_PowerOnBtnActionPerformed

    private void ButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEqualActionPerformed
        EnterNum2 = Double.parseDouble(Screen.getText());
        if (Op == "+"){
            Result = EnterNum1 + EnterNum2;
            Screen.setText(String.valueOf(Result));
        }else if (Op == "-"){
            Result = EnterNum1 - EnterNum2;
             Screen.setText(String.valueOf(Result));
        }else if (Op == "*"){
            Result = EnterNum1 * EnterNum2;
             Screen.setText(String.valueOf(Result));
        }else if (Op == "/"){
            Result = EnterNum1 / EnterNum2;
             Screen.setText(String.valueOf(Result));
        }else if (Op == "x^y"){
            
            for (int i = 0; i <EnterNum2; i++){
                Result= EnterNum1*EnterNum2;
            }
            Screen.setText(Double.toString(Result));
        }              
    }//GEN-LAST:event_ButtonEqualActionPerformed
    
    private void SquaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquaredActionPerformed
        double t =Double.parseDouble(Screen.getText());
        t = t*t;
        Screen.setText("");        
        Screen.setText(Screen.getText()+t);
    }//GEN-LAST:event_SquaredActionPerformed

    private void CubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CubeActionPerformed
        double t =Double.parseDouble(Screen.getText());
        t = t*t*t;
        Screen.setText("");        
        Screen.setText(Screen.getText()+t);
    }//GEN-LAST:event_CubeActionPerformed

    private void ButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivideActionPerformed
        EnterNum1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        Op = "/";
    }//GEN-LAST:event_ButtonDivideActionPerformed

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        EnterNum1 = Double.parseDouble(Screen.getText());
        
        Screen.setText("");
        Op = "+";
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void PowerXyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerXyActionPerformed
        EnterNum1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        Op = "x^y";
    }//GEN-LAST:event_PowerXyActionPerformed

    private void ButtonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSinActionPerformed
        double t = Math.sin(Double.parseDouble(Screen.getText()));
        Screen.setText("");
        Screen.setText(Screen.getText()+t);
    }//GEN-LAST:event_ButtonSinActionPerformed

    private void ButtonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCosActionPerformed
        double t = Math.cos(Double.parseDouble(Screen.getText()));
        Screen.setText("");
        Screen.setText(Screen.getText()+t);
    }//GEN-LAST:event_ButtonCosActionPerformed

    private void ButtonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTanActionPerformed
        double t = Math.tan(Double.parseDouble(Screen.getText()));
        Screen.setText("");
        Screen.setText(Screen.getText()+t);
    }//GEN-LAST:event_ButtonTanActionPerformed

    private void ButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogActionPerformed
        double t = Math.log(Double.parseDouble(Screen.getText()));
        Screen.setText("");
        Screen.setText(Screen.getText()+t);
    }//GEN-LAST:event_ButtonLogActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackSpace;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonCos;
    private javax.swing.JButton ButtonDivide;
    private javax.swing.JButton ButtonEqual;
    private javax.swing.JButton ButtonExp;
    private javax.swing.JButton ButtonLog;
    private javax.swing.JButton ButtonMultiply;
    private javax.swing.JButton ButtonPoint;
    private javax.swing.JButton ButtonSin;
    private javax.swing.JButton ButtonSqrt;
    private javax.swing.JButton ButtonSub;
    private javax.swing.JButton ButtonTan;
    private javax.swing.JButton ButtonZero;
    private javax.swing.JButton Cube;
    private javax.swing.JRadioButton PowerOffBtn;
    private javax.swing.JRadioButton PowerOnBtn;
    private javax.swing.JButton PowerXy;
    private javax.swing.JTextField Screen;
    private javax.swing.JButton Squared;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
}
