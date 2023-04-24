package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;//讀取一個標準格式(GIF, PNG, or JPEG)的圖片
import java.io.IOException;//例外擲出
import java.util.Arrays;//陣列
import javax.imageio.ImageIO;//讀取一個標準格式(GIF, PNG, or JPEG)的圖片

/**
 *
 * @author user
 */
public class Deck {

    private Card[] deck;//排牌
    private int count = 0;//發牌時數
    private final String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};//點數對照表
    private final String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};//花色對照表
    /**
     * 
     * @throws IOException 如果讀檔案失敗擲出例外
     */
    public Deck() throws IOException {//下面是52張卡牌單獨建構和一一讀圖檔

        deck = new Card[52];
        deck[0] = new Card(faces[0], suits[0], ImageIO.read(new File("AC.png")));
        deck[1] = new Card(faces[0], suits[1], ImageIO.read(new File("AS.png")));
        deck[2] = new Card(faces[0], suits[2], ImageIO.read(new File("AH.png")));
        deck[3] = new Card(faces[0], suits[3], ImageIO.read(new File("AD.png")));

        deck[4] = new Card(faces[1], suits[0], ImageIO.read(new File("2C.png")));
        deck[5] = new Card(faces[1], suits[1], ImageIO.read(new File("2S.png")));
        deck[6] = new Card(faces[1], suits[2], ImageIO.read(new File("2H.png")));
        deck[7] = new Card(faces[1], suits[3], ImageIO.read(new File("2D.png")));

        deck[8] = new Card(faces[2], suits[0], ImageIO.read(new File("3C.png")));
        deck[9] = new Card(faces[2], suits[1], ImageIO.read(new File("3S.png")));
        deck[10] = new Card(faces[2], suits[2], ImageIO.read(new File("3H.png")));
        deck[11] = new Card(faces[2], suits[3], ImageIO.read(new File("3D.png")));

        deck[12] = new Card(faces[3], suits[0], ImageIO.read(new File("4C.png")));
        deck[13] = new Card(faces[3], suits[1], ImageIO.read(new File("4S.png")));
        deck[14] = new Card(faces[3], suits[2], ImageIO.read(new File("4H.png")));
        deck[15] = new Card(faces[3], suits[3], ImageIO.read(new File("4D.png")));

        deck[16] = new Card(faces[4], suits[0], ImageIO.read(new File("5C.png")));
        deck[17] = new Card(faces[4], suits[1], ImageIO.read(new File("5S.png")));
        deck[18] = new Card(faces[4], suits[2], ImageIO.read(new File("5H.png")));
        deck[19] = new Card(faces[4], suits[3], ImageIO.read(new File("5D.png")));

        deck[20] = new Card(faces[5], suits[0], ImageIO.read(new File("6C.png")));
        deck[21] = new Card(faces[5], suits[1], ImageIO.read(new File("6S.png")));
        deck[22] = new Card(faces[5], suits[2], ImageIO.read(new File("6H.png")));
        deck[23] = new Card(faces[5], suits[3], ImageIO.read(new File("6D.png")));

        deck[24] = new Card(faces[6], suits[0], ImageIO.read(new File("7C.png")));
        deck[25] = new Card(faces[6], suits[1], ImageIO.read(new File("7S.png")));
        deck[26] = new Card(faces[6], suits[2], ImageIO.read(new File("7H.png")));
        deck[27] = new Card(faces[6], suits[3], ImageIO.read(new File("7D.png")));

        deck[28] = new Card(faces[7], suits[0], ImageIO.read(new File("8C.png")));
        deck[29] = new Card(faces[7], suits[1], ImageIO.read(new File("8S.png")));
        deck[30] = new Card(faces[7], suits[2], ImageIO.read(new File("8H.png")));
        deck[31] = new Card(faces[7], suits[3], ImageIO.read(new File("8D.png")));

        deck[32] = new Card(faces[8], suits[0], ImageIO.read(new File("9C.png")));
        deck[33] = new Card(faces[8], suits[1], ImageIO.read(new File("9S.png")));
        deck[34] = new Card(faces[8], suits[2], ImageIO.read(new File("9H.png")));
        deck[35] = new Card(faces[8], suits[3], ImageIO.read(new File("9D.png")));

        deck[36] = new Card(faces[9], suits[0], ImageIO.read(new File("10C.png")));
        deck[37] = new Card(faces[9], suits[1], ImageIO.read(new File("10S.png")));
        deck[38] = new Card(faces[9], suits[2], ImageIO.read(new File("10H.png")));
        deck[39] = new Card(faces[9], suits[3], ImageIO.read(new File("10D.png")));

        deck[40] = new Card(faces[10], suits[0], ImageIO.read(new File("JC.png")));
        deck[41] = new Card(faces[10], suits[1], ImageIO.read(new File("JS.png")));
        deck[42] = new Card(faces[10], suits[2], ImageIO.read(new File("JH.png")));
        deck[43] = new Card(faces[10], suits[3], ImageIO.read(new File("JD.png")));

        deck[44] = new Card(faces[11], suits[0], ImageIO.read(new File("QC.png")));
        deck[45] = new Card(faces[11], suits[1], ImageIO.read(new File("QS.png")));
        deck[46] = new Card(faces[11], suits[2], ImageIO.read(new File("QH.png")));
        deck[47] = new Card(faces[11], suits[3], ImageIO.read(new File("QD.png")));

        deck[48] = new Card(faces[12], suits[0], ImageIO.read(new File("KC.png")));
        deck[49] = new Card(faces[12], suits[1], ImageIO.read(new File("KS.png")));
        deck[50] = new Card(faces[12], suits[2], ImageIO.read(new File("KH.png")));
        deck[51] = new Card(faces[12], suits[3], ImageIO.read(new File("KD.png")));
    }
    /**
     * 
     * @return deck 
     */
    public Card[] getDeck() {
        return deck;
    }
    /**
     * 
     * @param deck set deck 
     */
    public void setDeck(Card[] deck) {
        this.deck = deck;
    }
    /**
     * 
     * @return count 
     */
    public int getCount() {
        return count;
    }
    /**
     * 
     * @param count set count
     */
    public void setCount(int count) {
        this.count = count;
    }
    /**
     * 
     * @return 發牌
     */
    public Card dealCard() {//發牌
        if (count < 52) {
            return deck[count++];
        } else {
            return null;
        }
    }
    /**
     * 洗牌
     */
    public void shuffle() {//洗牌
        for (int i = 0; i < deck.length; i++) {
            int num = (int) (Math.random() * 52);
            Card temp = deck[num];
            deck[num] = deck[i];
            deck[i] = temp;
        }
    }
    /**
     * 
     * @return 輸出每個成員 
     */
    @Override
    public String toString() {
        return "Deck{" + "deck=" + Arrays.toString(deck) + ", count=" + count + '}';
    }

}
