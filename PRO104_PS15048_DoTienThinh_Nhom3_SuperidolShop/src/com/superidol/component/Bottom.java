package com.superidol.component;

import com.superidol.utils.Authorize;
import com.superidol.utils.MsgBox;
import com.superidol.utils.XImage;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Bottom extends javax.swing.JPanel {
    
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    private float alpha;
    
    public Bottom() {
        try {
            initComponents();
        setOpaque(false);
        setBackground(new Color(255, 51, 153));
        
        if(Authorize.isLogin()){
            if(Authorize.isManager()){
                lblTen.setText("Quản lý");
                lblVaitro.setText("Quản lý");
            }else{
                lblTen.setText("Nhân viên");
                lblVaitro.setText("Nhân viên");
            }
        } else{
            MsgBox.alert(this, "vui long dang nhap");
        }
       
            imageAvatar1.setToolTipText(Authorize.user.getHinh());
        if (Authorize.user.getHinh() != null) {
            imageAvatar1.setIcon(XImage.readLogo(Authorize.user.getHinh()));
            /*
            ImageIcon readLogo(String tenFile) đọc file trong thư mục logos theo tên file trả về ImageIcon
            void setIcon(ImageIcon icon) set Icon cho lbl
            */
        }else{
            imageAvatar1.setIcon(XImage.readLogo("noImage.png"));
        }
        } catch (Exception e) {
        }
         
       
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new com.superidol.swing.ImageAvatar();
        lblTen = new javax.swing.JLabel();
        lblVaitro = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/super_idol.jpg"))); // NOI18N

        lblTen.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblTen.setForeground(new java.awt.Color(237, 237, 237));
        lblTen.setText("SUPER IDOL");

        lblVaitro.setForeground(new java.awt.Color(237, 237, 237));
        lblVaitro.setText("Rick Roll");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTen)
                    .addComponent(lblVaitro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTen)
                        .addGap(3, 3, 3)
                        .addComponent(lblVaitro))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2.setColor(getBackground());
        g2.fillRoundRect(5, 5, getWidth() - 10, getHeight() - 10, 20, 20);
        super.paint(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.superidol.swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblVaitro;
    // End of variables declaration//GEN-END:variables
}
