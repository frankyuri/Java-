package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.image.BufferedImage;//照片檔案
/**
 *
 * @author user
 */
public class Card {
    private String rank ,suit;//花色和數字
    private BufferedImage cardImage;//讀取檔案
    /**
     * 
     * @param rank 點數
     * @param suit 花色
     * @param cardImage 卡牌圖案
     */
    public Card(String rank, String suit, BufferedImage cardImage) {
        this.rank = rank;
        this.suit = suit;
        this.cardImage = cardImage;
    }
    /**
     * 建構子
     */
    public Card() {
    }
    /**
     * 
     * @return 點數
     */
    public String getRank() {
        return rank;
    }
    /**
     * 
     * @param rank 設置點數
     */
    public void setRank(String rank) {
        this.rank = rank;
    }
    /**
     * 
     * @return 回傳花色
     */
    public String getSuit() {
        return suit;
    }
    /**
     * 
     * @param suit 設置花色
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    /**
     * 
     * @return 圖片
     */
    public BufferedImage getCardImage() {
        return cardImage;
    }
    /**
     * 
     * @param cardImage 設置圖片
     */
    public void setCardImage(BufferedImage cardImage) {
        this.cardImage = cardImage;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return  rank + "of" + suit ;
    }
  
}
