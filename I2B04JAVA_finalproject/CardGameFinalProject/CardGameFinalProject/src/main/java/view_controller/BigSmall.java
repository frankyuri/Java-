package view_controller;

import model.Deck;//取得卡堆
import model.Card;//取得卡牌
import java.awt.Dimension;//用來對齊視窗
import java.awt.Toolkit;//抽象視窗的工具包
import java.io.BufferedInputStream;//讀取音樂檔案 限制.wav檔案
import java.io.File;
import java.io.IOException;//例外擲出
import java.io.InputStream;//提供了所有同步IO的功能
import java.util.concurrent.TimeUnit;//延遲秒數用
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;//圖片
import javax.sound.sampled.AudioInputStream;//取樣音訊
import javax.sound.sampled.AudioSystem;//取樣音訊不僅包含從模擬訊號取樣來的數字音訊
import javax.sound.sampled.Clip;//撥放音樂
import javax.sound.sampled.LineUnavailableException;//例外擲出
import javax.sound.sampled.UnsupportedAudioFileException;//例外擲出
import javax.swing.ImageIcon;//用來增加按鈕圖案
import javax.swing.JOptionPane;//彈出視窗

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class BigSmall extends javax.swing.JFrame {

    Clip clip;//撥放音樂
    private Card smile = new Card();//微笑圖案
    private Card Nega = new Card();//黑人圖案
    private Card cry = new Card();//哭哭圖案
    private Card back = new Card();//撲克牌卡背
    private Deck deck;//牌堆
    private Card mine, AI;//雙方手牌
    private final String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};

    /**
     * Creates new form BigSmall
     */
    public BigSmall() throws IOException {//建構子把卡背小圖案都建構好
        smile = new Card(null, null, ImageIO.read(new File("smile.png")));//把卡背小圖案都建構好
        Nega = new Card(null, null, ImageIO.read(new File("que.png")));//把卡背小圖案都建構好
        cry = new Card(null, null, ImageIO.read(new File("cry.png")));//把卡背小圖案都建構好
        deck = new Deck();
        deck.shuffle();
        mine = deck.dealCard();
        AI = deck.dealCard();
        back = new Card(null, null, ImageIO.read(new File("blue_back.png")));//把卡背小圖案都建構好
        initComponents();
        setLabel();//設置好初始對方卡背和我的手牌
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);//把視窗設為按叉叉不會整個關掉會回到首頁
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("標楷體", 3, 24)); // NOI18N
        jButton1.setText("大");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("標楷體", 3, 24)); // NOI18N
        jButton2.setText("小");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel1.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel1.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel2.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel2.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel2.setPreferredSize(new java.awt.Dimension(75, 116));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     *
     * @param evt 按下之後開始翻牌且確定是大
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clickBgm();//播放按按鈕特效
        jLabel2.setIcon(new ImageIcon(AI.getCardImage()));//電腦翻牌
        int me = 0, oppo = 0;
        for (int i = 0; i < faces.length; i++) {
            if (mine.getRank().equals(faces[i])) {
                me = i;
            }
            if (AI.getRank().equals(faces[i])) {
                oppo = i;
            }
        }

        if (oppo > me) {
            System.out.println("lose");
            GGBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n你已經輸了哈哈!!! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(cry.getCardImage()));//跳出確認視窗

            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) {
                restart();
            }
        } else if (oppo < me) {
            System.out.println("win");
            correctBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n你贏了! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出確認視窗
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) {
                restart();
            }
        } else {
            System.out.println("tie");
            OMGBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n挖塞 平手。 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出確認視窗
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                sleep();
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) {
                restart();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     *
     * @param evt 按下之後開始翻牌且你決定是小
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clickBgm();//播放按按鈕特效
        jLabel2.setIcon(new ImageIcon(AI.getCardImage()));//電腦翻牌

        int me = 0, oppo = 0;
        for (int i = 0; i < faces.length; i++) {
            if (mine.getRank().equals(faces[i])) {
                me = i;
            }
            if (AI.getRank().equals(faces[i])) {
                oppo = i;
            }
        }

        if (oppo < me) {
            System.out.println("lose");
            GGBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n你已經輸了哈哈!!! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(cry.getCardImage()));//跳出確認視窗

            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) {
                restart();
            }
        } else if (oppo > me) {
            System.out.println("win");
            correctBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n你贏了! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出確認視窗
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) {
                restart();
            }
        } else {
            System.out.println("tie");
            OMGBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n挖塞 平手。 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出確認視窗
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                sleep();
                clip.stop();
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) {
                restart();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * 延遲一秒用來確保音效完整性
     */
    private void sleep() {//延遲
        try {
            TimeUnit.SECONDS.sleep(1);//會等待一秒
        } catch (InterruptedException ex) {
            Logger.getLogger(ThisIsGameEntrance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 一切重來
     */
    private void restart() {//重新初始化
        //Music music = new Music("music.wav");
        clickBgm();
        Deck deck1 = null;
        try {
            deck1 = new Deck();
        } catch (IOException ex) {
            Logger.getLogger(TwoOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        deck = deck1;
        deck.shuffle();
        mine = deck.dealCard();
        AI = deck.dealCard();
        setLabel();
    }

    /**
     * 播放按鈕音效
     */
    private void clickBgm() {//撥放音樂
        // TODO add your handling code here:
        try {
            Clip bgm = AudioSystem.getClip();//設置可以讀音樂的Clip型態
            InputStream is = TwoOne.class.getClassLoader().getResourceAsStream("click.wav");//先把音樂讀到 is
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));//再把他轉到撥放音樂系統裡
            bgm.open(ais);//打開
            bgm.start();//開始
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }

    /**
     * 播放勝利音效
     */
    private void correctBgm() {//同上
        try {
            Clip bgm = AudioSystem.getClip();
            InputStream is = TwoOne.class.getClassLoader().getResourceAsStream("correct.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            bgm.open(ais);
            bgm.start();
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }

    /**
     * 播放輸掉的音效
     */
    private void GGBgm() {//同上
        try {
            Clip bgm = AudioSystem.getClip();
            InputStream is = TwoOne.class.getClassLoader().getResourceAsStream("warning.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            bgm.open(ais);
            bgm.start();
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }

    /**
     * 播放平手音效
     */
    private void OMGBgm() {//同上
        try {
            Clip clip = AudioSystem.getClip();
            InputStream is = TwoOne.class.getClassLoader().getResourceAsStream("omg.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            clip.open(ais);
            clip.start();
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }

    /**
     * 設置初始化卡牌
     */
    private void setLabel() {
        jLabel1.setIcon(new ImageIcon(mine.getCardImage()));//翻開我方卡牌
        jLabel2.setIcon(new ImageIcon(back.getCardImage()));//蓋下對方卡牌

    }

    /**
     * @param args the command line arguments
     */
    public static void start(String args[]) {
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
            java.util.logging.Logger.getLogger(BigSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BigSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BigSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BigSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            BigSmall bigOrSmall = null;
            try {
                bigOrSmall = new BigSmall();
            } catch (IOException ex) {
                Logger.getLogger(BigSmall.class.getName()).log(Level.SEVERE, null, ex);
            }
            bigOrSmall.setVisible(true);
            bigOrSmall.setResizable(false);//使他無法放大視窗
            bigOrSmall.setTitle("壯祖豪比大小");//設置視窗標題
            Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) screensize.getWidth() / 2 - bigOrSmall.getWidth() / 2;//計算視窗的中央X座標
            int y = (int) screensize.getHeight() / 2 - bigOrSmall.getHeight() / 2;//計算視窗的中央Y座標
            bigOrSmall.setLocation(x, y);//設在那個座標
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}