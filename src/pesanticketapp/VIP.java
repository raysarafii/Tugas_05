/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanticketapp;

/**
 *
 * @author User
 */



public class VIP extends Tiket {
    public VIP(int tiket) {
        super("VIP", tiket == 1 ? 120 : 150);
    }
}