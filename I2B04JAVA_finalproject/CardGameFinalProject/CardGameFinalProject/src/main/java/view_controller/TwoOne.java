package view_controller;


import model.Deck;//取得卡堆
import model.Card;//取得卡牌
import java.awt.Dimension;//用來對齊視窗
import java.awt.Toolkit;//抽象視窗的工具包
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;//圖片
import javax.swing.ImageIcon;//用來增加按鈕圖案
import javax.swing.JOptionPane;//彈出視窗
import java.io.*;//提供了所有同步IO的功能
import java.util.concurrent.TimeUnit;//延遲秒數用
import javax.sound.sampled.*;//音樂相關

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class TwoOne extends javax.swing.JFrame {
    /**
     * 
     */
    TwoOne gameClient = null;
    Clip clip;//撥放音樂
    ImageIcon tensor;
    File f;
    private final ImageIcon image;
    private Card smile = new Card();//微笑圖案
    private Card Nega=new Card();//黑人圖案
    private Card cry=new Card();//哭哭圖案
    private int playerScore;
    private int AIScore;
    private static int count;
    private static int AIcount;
    private Card back = new Card();//撲克牌卡背
    private Deck deck;
    private Card[] mine = new Card[5];
    private Card[] AI = new Card[5];
    //private String faceName, suit;
    private final String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    /**
     * 
     * @throws IOException 
     */
    public TwoOne() throws IOException {
        tensor = new ImageIcon("tenor.gif");//把卡背小圖案都建構好
        image = new ImageIcon("appicon.png");//把卡背小圖案都建構好
        playerScore = 0;
        AIScore = 0;
        smile = new Card(null, null,  ImageIO.read(new File("smile.png")));//把卡背小圖案都建構好
        Nega=new Card(null,null, ImageIO.read(new File("que.png")));//把卡背小圖案都建構好
        cry=new Card(null,null, ImageIO.read(new File("cry.png")));//把卡背小圖案都建構好
        AIcount = 0;
        count = 0;
        deck = new Deck();
        deck.shuffle();
        back = new Card(null, null,  ImageIO.read(new File("blue_back.png")));//把卡背小圖案都建構好
        System.out.println("\n========\nplayer card\n========");
        for (int i = 0; i < mine.length; i++) {
            mine[i] = new Card();
            mine[i] = deck.dealCard();
            System.out.println(mine[i]);
        }
        System.out.println("\n========\nAI card\n========");
        for (int i = 0; i < AI.length; i++) {
            AI[i] = new Card();
            AI[i] = deck.dealCard();
            System.out.println(AI[i]);
        }
        initComponents();
        setLabel();//設置好初始對方卡背和我的手牌
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);//把視窗設為按叉叉不會整個關掉會回到首頁
    }
    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel(tensor);
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 3, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Black Jack");

        jButton3.setFont(new java.awt.Font("Source Sans Pro", 3, 12)); // NOI18N
        jButton3.setText("RESTART");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jLabel2.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel2.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel2.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel3.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel3.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel3.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel4.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel4.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel4.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel5.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel5.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel5.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel6.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel6.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel6.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel7.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel7.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel7.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel8.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel8.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel8.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel9.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel9.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel9.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel10.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel10.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel10.setPreferredSize(new java.awt.Dimension(75, 116));

        jLabel11.setMaximumSize(new java.awt.Dimension(75, 116));
        jLabel11.setMinimumSize(new java.awt.Dimension(75, 116));
        jLabel11.setPreferredSize(new java.awt.Dimension(75, 116));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2);

        jButton1.setFont(new java.awt.Font("標楷體", 3, 100)); // NOI18N
        jButton1.setText("翻牌");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("標楷體", 3, 100)); // NOI18N
        jButton2.setText("確認");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * @param evt 按下去翻牌同時電腦會思考是否跟進
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clickBgm();//播放按按鈕特效
        boolean flag = false;
        switch (count) {//翻牌
            case 0:
                //jLabel2.setIcon((smile) mine[0].getCardImage());
                jLabel2.setIcon(new ImageIcon(mine[0].getCardImage()));//翻牌
                count++;
                break;
            case 1:
                jLabel3.setIcon(new ImageIcon(mine[1].getCardImage()));//翻牌
                count++;
                break;
            case 2:
                jLabel4.setIcon(new ImageIcon(mine[2].getCardImage()));//翻牌
                count++;
                break;
            case 3:
                jLabel5.setIcon(new ImageIcon(mine[3].getCardImage()));//翻牌
                count++;
                break;
            case 4:
                jLabel6.setIcon(new ImageIcon(mine[4].getCardImage()));//翻牌
                count++;
                break;
            default:
                flag = true;
                break;
        }
        
        try {
            AIAct();//電腦思考下一步
        } catch (InterruptedException ex) {
            Logger.getLogger(TwoOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        AITurn();//電腦行動
        if (flag) {
            try {
                Finish();//做分數確認
            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(TwoOne.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * 播放按鈕音樂
     */
    private void clickBgm() {//撥放音樂
        // TODO add your handling code here:
        try {
            Clip bgm = AudioSystem.getClip();//設置可以讀音樂的Clip型態
            InputStream is =TwoOne.class.getClassLoader().getResourceAsStream("click.wav");//先把音樂讀到 is
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));//再把他轉到撥放音樂系統裡
            bgm.open(ais);//打開
            bgm.start();//開始
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }
    /**
     * 
     * @param evt 按下去結算點數並判斷誰勝利 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clickBgm();//撥放音樂
        try {
            Finish();//做結算
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(TwoOne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * 
     * @param evt 按下去重來
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clickBgm();
        restart();
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * 一切重來
     */
    private void restart() {//全部重製
        //Music music = new Music("music.wav");
        clickBgm();
        playerScore = 0;
        AIScore = 0;
        AIcount = 0;
        count = 0;
        Deck deck1 = null;
        try {
            deck1 = new Deck();
        } catch (IOException ex) {
            Logger.getLogger(TwoOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        deck = deck1;
        deck.shuffle();
        System.out.println("\n========\nplayer card\n========");
        for (int i = 0; i < mine.length; i++) {
            mine[i] = new Card();
            mine[i] = deck.dealCard();
            System.out.println(mine[i]);
        }
        System.out.println("\n========\nAI card\n========");
        for (int i = 0; i < AI.length; i++) {
            AI[i] = new Card();
            AI[i] = deck.dealCard();
            System.out.println(AI[i]);
        }
        setLabel();
    }
    /**
     * 電腦行動
     */
    private void AIAct() throws InterruptedException {//電腦翻牌
        switch (AIcount) {
            case 0:
                jLabel7.setIcon(new ImageIcon(AI[0].getCardImage()));
                break;
            case 1:
                jLabel8.setIcon(new ImageIcon(AI[1].getCardImage()));
                break;
            case 2:
                jLabel9.setIcon(new ImageIcon(AI[2].getCardImage()));
                break;
            case 3:
                jLabel10.setIcon(new ImageIcon(AI[3].getCardImage()));
                break;
            case 4:
                jLabel11.setIcon(new ImageIcon(mine[4].getCardImage()));
                break;
            default: {
                try {
                    Finish();
                } catch (IOException ex) {
                    Logger.getLogger(TwoOne.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
        }
    }
    /**
     * 電腦思考
     */
    private void AITurn() {//電腦思考
        int score = 0;
        int piont = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < faces.length; j++) {
                if (mine[i].getRank().equals(faces[j])) {
                    piont = j + 1;
                    if (piont > 10) {
                        piont = 10;
                    }
                    break;
                }
            }
            score += piont;
        }
        playerScore = score;
        System.out.println("play's score = " + playerScore);
        int aiscore = 0;
        int aipoint = 0;
        for (int i = 0; i <= AIcount; i++) {
            for (int j = 0; j < faces.length; j++) {
                if (AI[i].getRank().equals(faces[j])) {
                    aipoint = j + 1;
                    if (aipoint > 10) {
                        aipoint = 10;
                    }
                    break;
                }
            }
            aiscore += aipoint;
        }
        AIScore = aiscore;
        System.out.println("AI's score = " + AIScore);
        if (AIScore < 17 && AIScore <= playerScore) {
            AIcount++;
        }
    }
    /**
     * 
     * @throws IOException 撥放音樂
     */
    
    private void correctBgm(){//同上
        try {
            Clip bgm = AudioSystem.getClip();
            InputStream is =TwoOne.class.getClassLoader().getResourceAsStream("correct.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            bgm.open(ais);
            bgm.start();
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }
    /**
     * 撥放音樂
     */
    private void GGBgm(){//同上
        try {
            Clip bgm = AudioSystem.getClip();
            InputStream is =TwoOne.class.getClassLoader().getResourceAsStream("warning.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            bgm.open(ais);
            bgm.start();
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }
    /**
     * 撥放音樂
     */
    private void OMGBgm(){//同上
         try {
            Clip OMG = AudioSystem.getClip();
            InputStream is =TwoOne.class.getClassLoader().getResourceAsStream("omg.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            OMG.open(ais);
            OMG.start();
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }
    /**
     * 撥放音樂
     */
    private void niggaBgm(){//同上
        try {
            Clip bgm = AudioSystem.getClip();
            InputStream is =TwoOne.class.getClassLoader().getResourceAsStream("nigga.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            bgm.open(ais);
            bgm.start();
            System.out.println("sucessful");
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.print("fall");
        }
    }
    /**
     * 做結算
     * @throws IOException
     * @throws InterruptedException 
     */
    private void Finish() throws IOException, InterruptedException {//做結算
        System.out.println("finish````player's score = " + playerScore);
        System.out.println("finish````AI's score = " + AIScore);
        //ThisIsGameEntrance.main(null);
        if(count>0){
        if ( /*Math.abs(21-AIScore) < Math.abs(21-playerScore) &&*/(AIScore < 21 && playerScore > 21) || AIScore == 21) {//電腦命中21  或者  你大於21且電腦小於21
            GGBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n你已經輸了哈哈!!! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(cry.getCardImage()));//跳出視窗結尾
            
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) 
                restart();
        } else if (playerScore < 21 && AIScore > 21 || (Math.abs(21 - playerScore) < Math.abs(21 - AIScore))) {//你小於21而且你離21比電腦近
            correctBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n你贏了! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出視窗結尾
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) 
                restart();
        } else if (playerScore == 21) {//你直接等淤21
            int bool = JOptionPane.showConfirmDialog(null, "\n你贏了! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出視窗結尾
            correctBgm();
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) 
                restart();
        } else if (playerScore == AIScore || (AIScore > 21 && playerScore > 21)) {//你們都超過21或者在21以內相等
            OMGBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n挖塞 平手。 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出視窗結尾
            if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
            TimeUnit.SECONDS.sleep(2);
                System.out.println("CLOSE 視窗");
                System.exit(0);
            }
            if (bool == JOptionPane.YES_OPTION) 
                restart();
        } else if (playerScore < 21 && AIScore < 21) {
            if (Math.abs(21 - playerScore) < Math.abs(21 - AIScore)) {
                int bool = JOptionPane.showConfirmDialog(null, "\n你贏了! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(smile.getCardImage()));//跳出視窗結尾
                correctBgm();
                if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                    System.out.println("CLOSE 視窗");
                    System.exit(0);
                }
                if (bool == JOptionPane.YES_OPTION) 
                    restart();
            } else {
                GGBgm();
                int bool = JOptionPane.showConfirmDialog(null, "\n你已經輸了哈哈!!! 你要繼續玩這糞GAME嗎?", "遊戲結果.....", JOptionPane.YES_NO_OPTION, 1, new ImageIcon(cry.getCardImage()));//跳出視窗結尾
                
                if (bool == JOptionPane.NO_OPTION || bool == JOptionPane.CLOSED_OPTION) {
                    System.out.println("CLOSE 視窗");
                    System.exit(0);
                }
                if (bool == JOptionPane.YES_OPTION) 
                    restart();
            }

            }
        }else {
            niggaBgm();
            int bool = JOptionPane.showConfirmDialog(null, "\n你啥都沒翻開你搞啥呢?", "警告.....", JOptionPane.CLOSED_OPTION, 1, new ImageIcon(Nega.getCardImage()));//跳出視窗提醒
        }
    }
    /**
     * 設置雙方卡牌
     */
    private void setLabel() {//設置雙方卡牌
        jLabel2.setIcon(new ImageIcon(back.getCardImage()));
        jLabel3.setIcon(new ImageIcon(back.getCardImage()));
        jLabel4.setIcon(new ImageIcon(back.getCardImage()));
        jLabel5.setIcon(new ImageIcon(back.getCardImage()));
        jLabel6.setIcon(new ImageIcon(back.getCardImage()));

        jLabel7.setIcon(new ImageIcon(back.getCardImage()));
        jLabel8.setIcon(new ImageIcon(back.getCardImage()));
        jLabel9.setIcon(new ImageIcon(back.getCardImage()));
        jLabel10.setIcon(new ImageIcon(back.getCardImage()));
        jLabel11.setIcon(new ImageIcon(back.getCardImage()));

    }
    /**
     * @param args the command line arguments
     * @throws javax.sound.sampled.UnsupportedAudioFileException
     * @throws javax.sound.sampled.LineUnavailableException
     * @throws java.io.IOException
     */
    public static void start(String args[]) throws UnsupportedAudioFileException, LineUnavailableException, IOException{

        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            TwoOne gameClient = null;
            try {
                gameClient = new TwoOne();
            } catch (IOException ex) {
                Logger.getLogger(TwoOne.class.getName()).log(Level.SEVERE, null, ex);
            }
            gameClient.setVisible(true);
            gameClient.setResizable(false);
            gameClient.setTitle("壯祖豪21點"); 
            Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) screensize.getWidth() / 2 - gameClient.getWidth() / 2;
                int y = (int) screensize.getHeight() / 2 - gameClient.getHeight() / 2;
                gameClient.setLocation(x, y);
            //gameClient.setIconImage(image.getImage());
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    // End of variables declaration//GEN-END:variables

}
