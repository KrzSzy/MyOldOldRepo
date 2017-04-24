
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class Automat extends javax.swing.JFrame {

    public Automat() {
        initComponents();
    }
        Image img;
        Graphics g;
        int a[][] = new int [100][100];  //a[poziomo][pionowo]
        int licznik;
        int rand1, buf;
        int ktory;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Program: Automaty komórkowe");

        jLabel3.setText("Autor: Krzysztof Szymanowski, FTiMS, PG");

        jLabel4.setText("e-mail: krzy.szymanowski@gmail.com");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 630));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jTextField1.setEditable(false);
        jTextField1.setText("liczba kroków");

        jTextField2.setEditable(false);
        jTextField2.setText("random");

        jTextField3.setEditable(false);
        jTextField3.setText("Algorytm");

        jMenu1.setText("Opcje");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Gra w życie");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Automat komórkowy");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Stan początkowy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("O programie");

        jMenuItem3.setText("Autor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // start
        licznik = 0;
        ktory = 0;
        Watek1 w1 = new Watek1();
        w1.start();
        
        for(int j=0; j<100; j++){
        for(int i=0; i<100; i++){rand1(); a[i][j] = buf;}}
        jTextField3.setText("Gra w życie");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // gra w życie
        licznik = 0;
        ktory = 1;
        Watek1 w1 = new Watek1();
        w1.start();
        
        for(int j=0; j<100; j++){
        for(int i=0; i<100; i++){rand1(); a[i][j] = buf;}}
        jTextField3.setText("Automat komórkowy");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialog1.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //autor
        jDialog1.setBounds(400, 400, 370, 160); // gdzie ma sie pojawic (x, y) oraz wysokosc i szerokosc
        jDialog1.setVisible(true); // zeby byl widzialny 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // kryształ
        licznik = 0;
        ktory = 2;
        Watek1 w1 = new Watek1();
        w1.start();
        
        for(int j=0; j<100; j++){
        for(int i=0; i<100; i++){rand1(); a[i][j] = buf;}}
        jTextField3.setText("Stan początkowy");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public class Watek1 extends Thread
    {
        public void Watek1()
        {
        }
        public void run()
        {
            while(true)
            {
                try{
                    rysuj();
                    Thread.sleep(70);
                }
                catch(InterruptedException e)
                {
                }
            }
        }  
    }
 
    public void rand1()
    {
        rand1 = (int)(10*Math.random());
        if (rand1<=4) buf = 0;
        else buf = 1;
    }

    public void rysuj()
    {
        Graphics g = jPanel1.getGraphics();
        
        jTextField1.setText("liczba kroków = " + licznik);
        jTextField2.setText("rand = " + rand1);
        
        // wyswietlanie komorek w odpowiednich stanach
        for(int j=0; j<100; j++)
        {
            for(int i=0; i<100; i++)
            {
                if (a[i][j] == 0) g.setColor(Color.BLUE);
                else if(a[i][j] == 1) g.setColor(Color.LIGHT_GRAY);
                else g.setColor(Color.yellow);
                g.fillRect(1+6*i, 1+6*j, 5, 5);
            }
        }
        
        switch(ktory)
        {
            case(0): automat1(); return;
            case(1): automat2(); return;
            case(2): return;
        }
    }
    
    public void automat1()
    {
                
        for(int j=1;j<99; j++) // dzialanie automatu
        {
            
            
            for(int i=1; i<99; i++)
            {
                int stanAutomatu = a[i-1][j]+a[i+1][j]+a[i][j-1]+a[i][j+1];
                
                if (a[i][j]==0)
                {
                    if((stanAutomatu)==3) a[i][j] = 1;
                    else a[i][j] = 0;
                }
                else
                {
                    if((stanAutomatu)==3  || (stanAutomatu)==2) a[i][j] = 1;
                    else a[i][j] = 0;
                }
            }
        }
        
        for(int i=1; i<99; i++) //brzeg gorny
        {
            int stanAutomatu = a[i-1][0]+a[i+1][0]+a[i][1]+a[i][99];
            
            if (a[i][0]==0)
            {
                if(stanAutomatu==3) a[i][0] = 1;
                else a[i][0] = 0;
            }
            else
            {
                if(stanAutomatu==3  || stanAutomatu==2) a[i][0] = 1;
                else a[i][0] = 0;
            }
        }
        
        for(int i=1; i<99; i++) //brzeg dolny
        {
            int stanAutomatu = a[i-1][99]+a[i+1][99]+a[i][98]+a[i][0];
            
            if (a[i][99]==0)
            {
                if(stanAutomatu==3) a[i][99] = 1;
                else a[i][99] = 0;
            }
            else
            {
                if(stanAutomatu==3  || stanAutomatu==2) a[i][99] = 1;
                else a[i][99] = 0;
            }
        }
        
        for(int j=1; j<99; j++) // brzeg lewy
        {
            int stanAutomatu = a[0][j+1]+a[1][j]+a[0][j-1]+a[99][j];
            
            if (a[0][j]==0)
            {
                if(stanAutomatu==3) a[0][j] = 1;
                else a[0][j] = 0;
            }
            else
            {
                if(stanAutomatu==3  || stanAutomatu==2) a[0][j] = 1;
                else a[0][j] = 0;
            }
        }
        
        for(int j=1; j<99; j++) // brzeg prawy
        {
            int stanAutomatu = a[99][j+1]+a[99][j-1]+a[0][j]+a[98][j];
            
            if (a[99][j]==0)
            {
                if(stanAutomatu==3) a[99][j] = 1;
                else a[99][j] = 0;
            }
            else
            {
                if(stanAutomatu==3  || stanAutomatu==2) a[99][j] = 1;
                else a[99][j] = 0;
            }
        }
        
        licznik++;
    }
    
    public void automat2()
    {
                
        for(int j=1;j<99; j++) // dzialanie automatu
        {
            for(int i=1; i<99; i++)
            {
                int stanAutomatu = a[i-1][j]+a[i+1][j]+a[i][j-1]+a[i][j+1];
                        
                if(stanAutomatu<1) a[i][j]=2;
                else if(stanAutomatu<3) a[i][j]=1;
                else if(stanAutomatu<5) a[i][j]=0;
                else a[i][j]=2;
            }
        }
        
        for(int i=1; i<99; i++) //brzeg gorny
        {
            int stanAutomatu = a[i-1][0]+a[i+1][0]+a[i][1]+a[i][99];
            
            if(stanAutomatu<1) a[i][0]=2;
            else if(stanAutomatu<3) a[i][0]=1;
            else if(stanAutomatu<5) a[i][0]=0;
            else a[i][0]=2;
        }
        for(int i=1; i<99; i++) //brzeg dolny
        {
            int stanAutomatu = a[i-1][99]+a[i+1][99]+a[i][0]+a[i][98];
            
            if(stanAutomatu<1) a[i][99]=2;
            else if(stanAutomatu<3) a[i][99]=1;
            else if(stanAutomatu<5) a[i][99]=0;
            else a[i][99]=2;
        }    
        for(int j=1; j<99; j++) //brzeg lewy
        {
            int stanAutomatu = a[0][j+1]+a[1][j]+a[0][j-1]+a[99][j];
            
            if(stanAutomatu<1) a[0][j]=2;
            else if(stanAutomatu<3) a[0][j]=1;
            else if(stanAutomatu<5) a[0][j]=0;
            else a[0][j]=2;
        }        
        for(int j=1; j<99; j++) //brzeg prawy
        {
            int stanAutomatu = a[99][j+1]+a[0][j]+a[99][j-1]+a[98][j];
            
            if(stanAutomatu<1) a[99][j]=2;
            else if(stanAutomatu<3) a[99][j]=1;
            else if(stanAutomatu<5) a[99][j]=0;
            else a[99][j]=2;
        }
        
        licznik++;
    }
   
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
            java.util.logging.Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Automat().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
