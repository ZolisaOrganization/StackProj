/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

/**
 *
 * @author KHANYA_YOLANDA
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(3);
            as.set(0, "Aluncedo");
            as.set(1, "Lundi");
            as.set(2, "Langa");
            System.out.println(as.get(1));
            ArrayStack ss = new ArrayStack(1);
            ss.set(0, "Sakhumzi Chuthsela");
            System.out.println(ss.get(0));
            System.out.println(as.size());
            as.add(3, "uyabukwa");
            as.add(4, "Musa");
            System.out.println(as.size());
            System.out.println(as.get(4));
            as.remove(1);
            System.out.println(as.get(1));
            
            
    }
}
    