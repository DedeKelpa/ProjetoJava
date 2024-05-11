/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.LoginFrame;
import DAO.InvestidorDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Investidor;
import view.MenuPrincipal;

/**
 *
 * @author Pichau
 */
public class ControllerLogin {
    private LoginFrame view;
    
    public ControllerLogin(LoginFrame view){
        this.view = view;
    }
    
    public void LoginInvestidor(){
        Investidor investidor = new Investidor(null,view.getTxtCPFLogin().getText(),view.getTxtSenhaLogin().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
            ResultSet res = dao.consultar(investidor);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Bem Vindo!");
                MenuPrincipal mp = new MenuPrincipal();
                mp.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(view, "Login Inexistente!");                
            }
        
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Conexao Falhou!");
        }
    }
    


    

}
