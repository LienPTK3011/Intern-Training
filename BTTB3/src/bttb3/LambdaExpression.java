/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttb3;

/**
 *
 * @author Asus
 */
public class LambdaExpression implements Movie {
                Movie mv = () -> {
		System.out.println("Create movie object with Lambda expression");
	};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LambdaExpression le = new LambdaExpression();
		 le.mv.detail();
    }

    @Override
    public void detail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
