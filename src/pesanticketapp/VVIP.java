/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanticketapp;

/**
 *
 * @author User
 */
public class VVIP extends Tiket {
    public VVIP(int tiket) {
        super("VVIP", tiket == 1 ? 160 : 200);
    }
}