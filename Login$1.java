/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ import java.io.IOException;
/*    */ import javax.imageio.ImageIO;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Login$1
/*    */   extends JPanel
/*    */ {
/*    */   private static final long serialVersionUID = 7202207766947468085L;
/*    */   
/*    */   Login$1(Login paramLogin) {}
/*    */   
/*    */   public void paintComponent(Graphics g)
/*    */   {
/* 83 */     Image background = null;
/*    */     try {
/* 85 */       background = ImageIO.read(getClass().getResource("C:/Users/KAJAL/Downloads/simple/images/login_background%20-%20Copy.jpg"));
/*    */     }
/*    */     catch (IOException e) {
/* 88 */       e.printStackTrace();
/*    */     }
/* 90 */     g.drawImage(background, 0, 0, this);
/*    */   }
/*    */ }


/* Location:              D:\life of kunal\DCIM\kunalst1.jar!\Login$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */