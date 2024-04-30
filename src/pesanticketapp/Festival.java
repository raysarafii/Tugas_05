/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanticketapp;

/**
 *
 * @author User
 */



   public class Festival extends Tiket {
    public Festival(int tahap) {
        super("Festival", tahap == 1 ? 0 : 100);
    }
}