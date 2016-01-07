package com.brainysoftware.captcha;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.dispatcher.StrutsResultSupport;
import com.opensymphony.xwork2.ActionInvocation;

public class CaptchaResult extends StrutsResultSupport {
    private String hashCookieName = "hash";
    private int wordLength = 6;
    private int imageWidth = 200;
    private int imageHeight = 70;

    public String getHashCookieName() {
        return hashCookieName;
    }
    public void setHashCookieName(String hashCookieName) {
        this.hashCookieName = hashCookieName;
    }
    public int getWordLength() {
        return wordLength;
    }
    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }
    public int getImageHeight() {
        return imageHeight;
    }
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }
    public int getImageWidth() {
        return imageWidth;
    }
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }
    
    protected void doExecute(String finalLocation, 
            ActionInvocation invocation) throws Exception {
        HttpServletResponse response = (HttpServletResponse) 
            invocation.getInvocationContext().get(HTTP_RESPONSE);
        response.setContentType("image/jpg");
        String word = CaptchaUtil.getRandomWord(wordLength);
        String hash = CaptchaUtil.getHash(word);
        Cookie hashCookie = new Cookie(hashCookieName, hash);
        response.addCookie(hashCookie);
        BufferedImage image = CaptchaUtil.getCaptchaImage(word, 
                imageWidth, imageHeight, 0);
        ImageIO.write(image, "jpg", response.getOutputStream());
    }
}
