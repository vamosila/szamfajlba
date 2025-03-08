/*
* File: Solution.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: I-N
* Date: 2025-03-08
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

public class Solution {
    Store store=new Store();
    public void printAbout(){
        System.out.println("\nVámosi László Ádám, 2025-03-08, SZOFT I-N");
        System.out.println("Számok bekérése 0 végjelig\n");
    }
    public void writeNumbers(){
        store.writeFile();
    }
}
