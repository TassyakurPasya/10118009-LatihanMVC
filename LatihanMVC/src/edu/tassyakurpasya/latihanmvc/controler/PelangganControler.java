/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package edu.tassyakurpasya.latihanmvc.controler;

import edu.tassyakurpasya.latihanmvc.model.PelangganModel;
import edu.tassyakurpasya.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Achapasya2109
 */
public class PelangganControler {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtNotlp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")) {
            
        } else {
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtNotlp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
            
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
            
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telephone Masih Kosong");
            
        } else {
            model.simpanForm();
        }  
            
      }
 }
    

