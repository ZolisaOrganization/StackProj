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
public class ArrayStack {

        String[] a;
        int n;
    public ArrayStack(int np){
        n = np;
        a = new String[n];
    }
    public int size() {
        return n;
    }
    public void set(int i, String x) {
        if ((i>=0)&&(i<n)){a[i] = x;}
    }
    public String get(int i) {
        String r = "Out of bound";
        if ((i>=0)&&(i<n)){r=a[i];}
            return(r);
    }
    public String remove(int i) {
        String x = a[i];
        for (int j = i; j < n-1; j++)
            a[j] = a[j+1];
                n--;
        if (a.length >= 3*n) resize();
                return x;
        }
    public void resize() {
        String[] b = new String[Math.max(n*2,1)];
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
             }
                a = b;
            }
   public void add(int i, String x) {
        if (n + 1 > a.length) resize();
            for (int j = n; j > i; j--)
                a[j] = a[j-1];
                a[i] = x;
                n++;
            }
 }
